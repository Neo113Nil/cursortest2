package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Transaction;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzck implements zzak {
    private final zzdn zzag;
    private zzaj zzfs;
    private zzdx zzhv;
    private zzdy zzhw;
    private zzgp<List<zzdl>> zzhx;
    private final zzhc zzhz;
    private final zzbz zzia;
    private final zzhz zzib;
    private final zzhz zzic;
    private final zzhz zzid;
    private zzee zzig;
    private zzee zzih;
    private FirebaseDatabase zzii;
    private final zzkm zzhu = new zzkm(new zzkg(), 0);
    private boolean zzhy = false;
    private long zzie = 0;
    private long zzif = 1;
    private boolean zzij = false;
    private long zzik = 0;

    zzck(zzdn zzdnVar, zzbz zzbzVar, FirebaseDatabase firebaseDatabase) {
        this.zzag = zzdnVar;
        this.zzia = zzbzVar;
        this.zzii = firebaseDatabase;
        this.zzib = this.zzia.zzp("RepoOperation");
        this.zzic = this.zzia.zzp("Transaction");
        this.zzid = this.zzia.zzp("DataOperation");
        this.zzhz = new zzhc(this.zzia);
        zzc(new zzcl(this));
    }

    private final zzja zza(zzch zzchVar, List<Long> list) {
        zzja zzc = this.zzih.zzc(zzchVar, list);
        return zzc == null ? zzir.zzfv() : zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(long j, zzch zzchVar, DatabaseError databaseError) {
        if (databaseError == null || databaseError.getCode() != -25) {
            List<? extends zzgy> zza = this.zzih.zza(j, !(databaseError == null), true, (zzkf) this.zzhu);
            if (zza.size() > 0) {
                zzn(zzchVar);
            }
            zzc(zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzgp<List<zzdl>> zzgpVar) {
        zzch zzchVar;
        zzja zzjaVar;
        long j;
        int i;
        if (zzgpVar.getValue() == null) {
            if (zzgpVar.hasChildren()) {
                zzgpVar.zza(new zzcr(this));
                return;
            }
            return;
        }
        List<zzdl> zzc = zzc(zzgpVar);
        Boolean bool = true;
        Iterator<zzdl> it = zzc.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i = it.next().zzjl;
            if (i != zzdm.zzju) {
                bool = false;
                break;
            }
        }
        if (bool.booleanValue()) {
            zzch zzg = zzgpVar.zzg();
            ArrayList arrayList = new ArrayList();
            Iterator<zzdl> it2 = zzc.iterator();
            while (it2.hasNext()) {
                j = it2.next().zzjp;
                arrayList.add(Long.valueOf(j));
            }
            zzja zza = zza(zzg, arrayList);
            String zzfj = zza.zzfj();
            for (zzdl zzdlVar : zzc) {
                zzdlVar.zzjl = zzdm.zzjv;
                zzdl.zzd(zzdlVar);
                zzchVar = zzdlVar.zzap;
                zzch zza2 = zzch.zza(zzg, zzchVar);
                zzjaVar = zzdlVar.zzjr;
                zza = zza.zzl(zza2, zzjaVar);
            }
            this.zzfs.zza(zzg.zzbv(), zza.getValue(true), zzfj, new zzcs(this, zzg, zzc, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzgp<List<zzdl>> zzgpVar, int i) {
        DatabaseError zza;
        int i2;
        int i3;
        int i4;
        ValueEventListener valueEventListener;
        zzch zzchVar;
        long j;
        List<zzdl> value = zzgpVar.getValue();
        ArrayList arrayList = new ArrayList();
        if (value != null) {
            ArrayList arrayList2 = new ArrayList();
            if (i == -9) {
                zza = DatabaseError.zza("overriddenBySet");
            } else {
                boolean z = i == -25;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Unknown transaction abort reason: ");
                sb.append(i);
                zzkq.zza(z, sb.toString());
                zza = DatabaseError.zza(-25);
            }
            int i5 = -1;
            for (int i6 = 0; i6 < value.size(); i6++) {
                zzdl zzdlVar = value.get(i6);
                i3 = zzdlVar.zzjl;
                if (i3 != zzdm.zzjx) {
                    i4 = zzdlVar.zzjl;
                    if (i4 == zzdm.zzjv) {
                        zzdlVar.zzjl = zzdm.zzjx;
                        zzdlVar.zzjo = zza;
                        i5 = i6;
                    } else {
                        valueEventListener = zzdlVar.zzjk;
                        zzchVar = zzdlVar.zzap;
                        zze(new zzfc(this, valueEventListener, zzhh.zzal(zzchVar)));
                        if (i == -9) {
                            zzee zzeeVar = this.zzih;
                            j = zzdlVar.zzjp;
                            arrayList.addAll(zzeeVar.zza(j, true, false, (zzkf) this.zzhu));
                        } else {
                            boolean z2 = i == -25;
                            StringBuilder sb2 = new StringBuilder(45);
                            sb2.append("Unknown transaction abort reason: ");
                            sb2.append(i);
                            zzkq.zza(z2, sb2.toString());
                        }
                        arrayList2.add(new zzdb(this, zzdlVar, zza));
                    }
                }
            }
            if (i5 == -1) {
                zzgpVar.setValue(null);
                i2 = 0;
            } else {
                i2 = 0;
                zzgpVar.setValue(value.subList(0, i5 + 1));
            }
            zzc(arrayList);
            ArrayList arrayList3 = arrayList2;
            int size = arrayList3.size();
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                zza((Runnable) obj);
            }
        }
    }

    private final void zza(zzid zzidVar, Object obj) {
        if (zzidVar.equals(zzby.zzhc)) {
            this.zzhu.zzn(((Long) obj).longValue());
        }
        zzch zzchVar = new zzch(zzby.zzhb, zzidVar);
        try {
            zzja zza = zzjd.zza(obj, zzir.zzfv());
            this.zzhv.zzg(zzchVar, zza);
            zzc(this.zzig.zzi(zzchVar, zza));
        } catch (DatabaseException e) {
            this.zzib.zza("Failed to parse info update", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, zzch zzchVar, DatabaseError databaseError) {
        if (databaseError == null || databaseError.getCode() == -1 || databaseError.getCode() == -25) {
            return;
        }
        zzhz zzhzVar = this.zzib;
        String zzchVar2 = zzchVar.toString();
        String databaseError2 = databaseError.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(zzchVar2).length() + String.valueOf(databaseError2).length());
        sb.append(str);
        sb.append(" at ");
        sb.append(zzchVar2);
        sb.append(" failed: ");
        sb.append(databaseError2);
        zzhzVar.zzb(sb.toString(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(List<zzdl> list, zzgp<List<zzdl>> zzgpVar) {
        List<zzdl> value = zzgpVar.getValue();
        if (value != null) {
            list.addAll(value);
        }
        zzgpVar.zza(new zzcy(this, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzch zzb(zzch zzchVar, int i) {
        zzch zzg = zzo(zzchVar).zzg();
        if (this.zzic.zzfa()) {
            zzhz zzhzVar = this.zzib;
            String valueOf = String.valueOf(zzchVar);
            String valueOf2 = String.valueOf(zzg);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + String.valueOf(valueOf2).length());
            sb.append("Aborting transactions for path: ");
            sb.append(valueOf);
            sb.append(". Affected: ");
            sb.append(valueOf2);
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
        zzgp<List<zzdl>> zzaj = this.zzhx.zzaj(zzchVar);
        zzaj.zza(new zzcz(this, i), false);
        zza(zzaj, i);
        zzaj.zza(new zzda(this, i), false, false);
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzgp<List<zzdl>> zzgpVar) {
        int i;
        List<zzdl> value = zzgpVar.getValue();
        if (value != null) {
            int i2 = 0;
            while (i2 < value.size()) {
                i = value.get(i2).zzjl;
                if (i == zzdm.zzjw) {
                    value.remove(i2);
                } else {
                    i2++;
                }
            }
            if (value.size() <= 0) {
                value = null;
            }
            zzgpVar.setValue(value);
        }
        zzgpVar.zza(new zzcu(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DatabaseError zzc(String str, String str2) {
        if (str != null) {
            return DatabaseError.zza(str, str2);
        }
        return null;
    }

    private final List<zzdl> zzc(zzgp<List<zzdl>> zzgpVar) {
        ArrayList arrayList = new ArrayList();
        zza(arrayList, zzgpVar);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(List<? extends zzgy> list) {
        if (list.isEmpty()) {
            return;
        }
        this.zzhz.zze(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzca() {
        this.zzfs = this.zzia.zza(new zzah(this.zzag.zzct, this.zzag.zzcu, this.zzag.zzcv), this);
        this.zzia.zzhg.zza(new zzcx(this));
        this.zzfs.initialize();
        zzfv zzq = this.zzia.zzq(this.zzag.zzct);
        this.zzhv = new zzdx();
        this.zzhw = new zzdy();
        this.zzhx = new zzgp<>();
        this.zzig = new zzee(this.zzia, new zzfu(), new zzdc(this));
        this.zzih = new zzee(this.zzia, zzq, new zzde(this));
        List<zzfa> zzj = zzq.zzj();
        Map<String, Object> zza = zzdu.zza(this.zzhu);
        long j = Long.MIN_VALUE;
        for (zzfa zzfaVar : zzj) {
            zzdg zzdgVar = new zzdg(this, zzfaVar);
            if (j >= zzfaVar.zzcn()) {
                throw new IllegalStateException("Write ids were not in order.");
            }
            j = zzfaVar.zzcn();
            this.zzif = zzfaVar.zzcn() + 1;
            if (zzfaVar.zzcq()) {
                if (this.zzib.zzfa()) {
                    zzhz zzhzVar = this.zzib;
                    long zzcn = zzfaVar.zzcn();
                    StringBuilder sb = new StringBuilder(48);
                    sb.append("Restoring overwrite with id ");
                    sb.append(zzcn);
                    zzhzVar.zza(sb.toString(), null, new Object[0]);
                }
                this.zzfs.zza(zzfaVar.zzg().zzbv(), zzfaVar.zzco().getValue(true), zzdgVar);
                this.zzih.zza(zzfaVar.zzg(), zzfaVar.zzco(), zzdu.zza(zzfaVar.zzco(), zza), zzfaVar.zzcn(), true, false);
            } else {
                if (this.zzib.zzfa()) {
                    zzhz zzhzVar2 = this.zzib;
                    long zzcn2 = zzfaVar.zzcn();
                    StringBuilder sb2 = new StringBuilder(44);
                    sb2.append("Restoring merge with id ");
                    sb2.append(zzcn2);
                    zzhzVar2.zza(sb2.toString(), null, new Object[0]);
                }
                this.zzfs.zza(zzfaVar.zzg().zzbv(), zzfaVar.zzcp().zzd(true), (zzbb) zzdgVar);
                this.zzih.zza(zzfaVar.zzg(), zzfaVar.zzcp(), zzdu.zza(zzfaVar.zzcp(), zza), zzfaVar.zzcn(), false);
            }
        }
        zza(zzby.zzhd, (Object) false);
        zza(zzby.zzhe, (Object) false);
    }

    private final long zzce() {
        long j = this.zzif;
        this.zzif = 1 + j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzcf() {
        zzgp<List<zzdl>> zzgpVar = this.zzhx;
        zzb(zzgpVar);
        zza(zzgpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (r10.getCode() != (-25)) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzch zzn(zzch zzchVar) {
        int i;
        zzch zzchVar2;
        int i2;
        int i3;
        int i4;
        zzch zzchVar3;
        DatabaseError fromException;
        Transaction.Result abort;
        long j;
        long j2;
        zzch zzchVar4;
        long j3;
        boolean z;
        Transaction.Handler handler;
        long j4;
        zzch zzchVar5;
        zzja zzjaVar;
        long j5;
        zzgp<List<zzdl>> zzo = zzo(zzchVar);
        zzch zzg = zzo.zzg();
        List<zzdl> zzc = zzc(zzo);
        if (!zzc.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            List<Long> arrayList2 = new ArrayList<>();
            Iterator<zzdl> it = zzc.iterator();
            while (it.hasNext()) {
                j5 = it.next().zzjp;
                arrayList2.add(Long.valueOf(j5));
            }
            Iterator<zzdl> it2 = zzc.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzdl next = it2.next();
                zzchVar2 = next.zzap;
                zzch.zza(zzg, zzchVar2);
                ArrayList arrayList3 = new ArrayList();
                i2 = next.zzjl;
                DatabaseError databaseError = null;
                boolean z2 = true;
                if (i2 == zzdm.zzjy) {
                    databaseError = next.zzjo;
                } else {
                    i3 = next.zzjl;
                    if (i3 == zzdm.zzju) {
                        i4 = next.retryCount;
                        if (i4 >= 25) {
                            databaseError = DatabaseError.zza("maxretries");
                            zzee zzeeVar = this.zzih;
                            j4 = next.zzjp;
                            arrayList3.addAll(zzeeVar.zza(j4, true, false, (zzkf) this.zzhu));
                        } else {
                            zzchVar3 = next.zzap;
                            zzja zza = zza(zzchVar3, arrayList2);
                            next.zzjq = zza;
                            MutableData zza2 = com.google.firebase.database.zzh.zza(zza);
                            try {
                                handler = next.zzjj;
                                abort = handler.doTransaction(zza2);
                                fromException = null;
                            } catch (Throwable th) {
                                this.zzib.zza("Caught Throwable.", th);
                                fromException = DatabaseError.fromException(th);
                                abort = Transaction.abort();
                            }
                            if (abort.isSuccess()) {
                                j2 = next.zzjp;
                                Long valueOf = Long.valueOf(j2);
                                Map<String, Object> zza3 = zzdu.zza(this.zzhu);
                                zzja zzd = abort.zzd();
                                zzja zza4 = zzdu.zza(zzd, zza3);
                                next.zzjr = zzd;
                                next.zzjs = zza4;
                                next.zzjp = zzce();
                                arrayList2.remove(valueOf);
                                zzee zzeeVar2 = this.zzih;
                                zzchVar4 = next.zzap;
                                j3 = next.zzjp;
                                z = next.zzjn;
                                arrayList3.addAll(zzeeVar2.zza(zzchVar4, zzd, zza4, j3, z, false));
                                arrayList3.addAll(this.zzih.zza(valueOf.longValue(), true, false, (zzkf) this.zzhu));
                            } else {
                                zzee zzeeVar3 = this.zzih;
                                j = next.zzjp;
                                arrayList3.addAll(zzeeVar3.zza(j, true, false, (zzkf) this.zzhu));
                                databaseError = fromException;
                            }
                        }
                    }
                    z2 = false;
                }
                zzc(arrayList3);
                if (z2) {
                    next.zzjl = zzdm.zzjw;
                    zzchVar5 = next.zzap;
                    DatabaseReference zza5 = com.google.firebase.database.zzh.zza(this, zzchVar5);
                    zzjaVar = next.zzjq;
                    DataSnapshot zza6 = com.google.firebase.database.zzh.zza(zza5, zzit.zzj(zzjaVar));
                    zzc(new zzcv(this, next));
                    arrayList.add(new zzcw(this, next, databaseError, zza6));
                }
            }
            zzb(this.zzhx);
            for (i = 0; i < arrayList.size(); i++) {
                zza((Runnable) arrayList.get(i));
            }
            zzcf();
        }
        return zzg;
    }

    private final zzgp<List<zzdl>> zzo(zzch zzchVar) {
        zzgp<List<zzdl>> zzgpVar = this.zzhx;
        while (!zzchVar.isEmpty() && zzgpVar.getValue() == null) {
            zzgpVar = zzgpVar.zzaj(new zzch(zzchVar.zzbw()));
            zzchVar = zzchVar.zzbx();
        }
        return zzgpVar;
    }

    public final FirebaseDatabase getDatabase() {
        return this.zzii;
    }

    final void interrupt() {
        this.zzfs.interrupt("repo_interrupt");
    }

    @Override // com.google.android.gms.internal.firebase_database.zzak
    public final void onDisconnect() {
        zza(zzby.zzhe, (Object) false);
        Map<String, Object> zza = zzdu.zza(this.zzhu);
        zzdy zzdyVar = this.zzhw;
        zzdy zzdyVar2 = new zzdy();
        zzdyVar.zza(new zzch(""), new zzdv(zzdyVar2, zza));
        ArrayList arrayList = new ArrayList();
        zzdyVar2.zza(zzch.zzbt(), new zzco(this, arrayList));
        this.zzhw = new zzdy();
        zzc(arrayList);
    }

    public final void purgeOutstandingWrites() {
        if (this.zzib.zzfa()) {
            this.zzib.zza("Purging writes", null, new Object[0]);
        }
        zzc(this.zzih.zzck());
        zzb(zzch.zzbt(), -25);
        this.zzfs.purgeOutstandingWrites();
    }

    final void resume() {
        this.zzfs.resume("repo_interrupt");
    }

    public final String toString() {
        return this.zzag.toString();
    }

    public final void zza(zzch zzchVar, zzbv zzbvVar, DatabaseReference.CompletionListener completionListener, Map<String, Object> map) {
        if (this.zzib.zzfa()) {
            zzhz zzhzVar = this.zzib;
            String valueOf = String.valueOf(zzchVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb.append("update: ");
            sb.append(valueOf);
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
        if (this.zzid.zzfa()) {
            zzhz zzhzVar2 = this.zzid;
            String valueOf2 = String.valueOf(zzchVar);
            String valueOf3 = String.valueOf(map);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 9 + String.valueOf(valueOf3).length());
            sb2.append("update: ");
            sb2.append(valueOf2);
            sb2.append(" ");
            sb2.append(valueOf3);
            zzhzVar2.zza(sb2.toString(), null, new Object[0]);
        }
        if (zzbvVar.isEmpty()) {
            if (this.zzib.zzfa()) {
                this.zzib.zza("update called with no changes. No-op", null, new Object[0]);
            }
            zza(completionListener, (DatabaseError) null, zzchVar);
            return;
        }
        zzbv zza = zzdu.zza(zzbvVar, zzdu.zza(this.zzhu));
        long zzce = zzce();
        zzc(this.zzih.zza(zzchVar, zzbvVar, zza, zzce, true));
        this.zzfs.zza(zzchVar.zzbv(), map, (zzbb) new zzdj(this, zzchVar, zzce, completionListener));
        Iterator<Map.Entry<zzch, zzja>> it = zzbvVar.iterator();
        while (it.hasNext()) {
            zzn(zzb(zzchVar.zzh(it.next().getKey()), -9));
        }
    }

    public final void zza(zzch zzchVar, zzja zzjaVar, DatabaseReference.CompletionListener completionListener) {
        if (this.zzib.zzfa()) {
            zzhz zzhzVar = this.zzib;
            String valueOf = String.valueOf(zzchVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 5);
            sb.append("set: ");
            sb.append(valueOf);
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
        if (this.zzid.zzfa()) {
            zzhz zzhzVar2 = this.zzid;
            String valueOf2 = String.valueOf(zzchVar);
            String valueOf3 = String.valueOf(zzjaVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 6 + String.valueOf(valueOf3).length());
            sb2.append("set: ");
            sb2.append(valueOf2);
            sb2.append(" ");
            sb2.append(valueOf3);
            zzhzVar2.zza(sb2.toString(), null, new Object[0]);
        }
        zzja zza = zzdu.zza(zzjaVar, zzdu.zza(this.zzhu));
        long zzce = zzce();
        zzc(this.zzih.zza(zzchVar, zzjaVar, zza, zzce, true, true));
        this.zzfs.zza(zzchVar.zzbv(), zzjaVar.getValue(true), new zzdi(this, zzchVar, zzce, completionListener));
        zzn(zzb(zzchVar, -9));
    }

    public final void zza(zzch zzchVar, DatabaseReference.CompletionListener completionListener) {
        this.zzfs.zza(zzchVar.zzbv(), new zzcn(this, zzchVar, completionListener));
    }

    public final void zza(zzch zzchVar, Transaction.Handler handler, boolean z) {
        DatabaseError fromException;
        Transaction.Result abort;
        long j;
        zzja zzjaVar;
        if (this.zzib.zzfa()) {
            zzhz zzhzVar = this.zzib;
            String valueOf = String.valueOf(zzchVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("transaction: ");
            sb.append(valueOf);
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
        if (this.zzid.zzfa()) {
            zzhz zzhzVar2 = this.zzib;
            String valueOf2 = String.valueOf(zzchVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 13);
            sb2.append("transaction: ");
            sb2.append(valueOf2);
            zzhzVar2.zza(sb2.toString(), null, new Object[0]);
        }
        if (this.zzia.zzcp && !this.zzij) {
            this.zzij = true;
            this.zzic.info("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.");
        }
        DatabaseReference zza = com.google.firebase.database.zzh.zza(this, zzchVar);
        zzcp zzcpVar = new zzcp(this);
        zzf(new zzfc(this, zzcpVar, zza.zzh()));
        int i = zzdm.zzjt;
        long j2 = this.zzik;
        this.zzik = 1 + j2;
        zzdl zzdlVar = new zzdl(zzchVar, handler, zzcpVar, i, z, j2, null);
        zzja zza2 = zza(zzchVar, new ArrayList());
        zzdlVar.zzjq = zza2;
        try {
            abort = handler.doTransaction(com.google.firebase.database.zzh.zza(zza2));
        } catch (Throwable th) {
            this.zzib.zza("Caught Throwable.", th);
            fromException = DatabaseError.fromException(th);
            abort = Transaction.abort();
        }
        if (abort == null) {
            throw new NullPointerException("Transaction returned null as result");
        }
        fromException = null;
        if (!abort.isSuccess()) {
            zzdlVar.zzjr = null;
            zzdlVar.zzjs = null;
            zzjaVar = zzdlVar.zzjq;
            zza(new zzcq(this, handler, fromException, com.google.firebase.database.zzh.zza(zza, zzit.zzj(zzjaVar))));
            return;
        }
        zzdlVar.zzjl = zzdm.zzju;
        zzgp<List<zzdl>> zzaj = this.zzhx.zzaj(zzchVar);
        List<zzdl> value = zzaj.getValue();
        if (value == null) {
            value = new ArrayList<>();
        }
        value.add(zzdlVar);
        zzaj.setValue(value);
        Map<String, Object> zza3 = zzdu.zza(this.zzhu);
        zzja zzd = abort.zzd();
        zzja zza4 = zzdu.zza(zzd, zza3);
        zzdlVar.zzjr = zzd;
        zzdlVar.zzjs = zza4;
        zzdlVar.zzjp = zzce();
        zzee zzeeVar = this.zzih;
        j = zzdlVar.zzjp;
        zzc(zzeeVar.zza(zzchVar, zzd, zza4, j, z, false));
        zzcf();
    }

    public final void zza(zzch zzchVar, Map<zzch, zzja> map, DatabaseReference.CompletionListener completionListener, Map<String, Object> map2) {
        this.zzfs.zzb(zzchVar.zzbv(), map2, (zzbb) new zzcm(this, zzchVar, map, completionListener));
    }

    public final void zza(zzhh zzhhVar, boolean z) {
        this.zzih.zza(zzhhVar, z);
    }

    final void zza(DatabaseReference.CompletionListener completionListener, DatabaseError databaseError, zzch zzchVar) {
        if (completionListener != null) {
            zzid zzbz = zzchVar.zzbz();
            if (zzbz != null && zzbz.zzfh()) {
                zzchVar = zzchVar.zzby();
            }
            zza(new zzdh(this, completionListener, databaseError, com.google.firebase.database.zzh.zza(this, zzchVar)));
        }
    }

    public final void zza(Runnable runnable) {
        this.zzia.zzbl();
        this.zzia.zzhf.zza(runnable);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzak
    public final void zza(List<String> list, Object obj, boolean z, Long l) {
        List<? extends zzgy> zzi;
        zzch zzchVar = new zzch(list);
        if (this.zzib.zzfa()) {
            zzhz zzhzVar = this.zzib;
            String valueOf = String.valueOf(zzchVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
            sb.append("onDataUpdate: ");
            sb.append(valueOf);
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
        if (this.zzid.zzfa()) {
            zzhz zzhzVar2 = this.zzib;
            String valueOf2 = String.valueOf(zzchVar);
            String valueOf3 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 15 + String.valueOf(valueOf3).length());
            sb2.append("onDataUpdate: ");
            sb2.append(valueOf2);
            sb2.append(" ");
            sb2.append(valueOf3);
            zzhzVar2.zza(sb2.toString(), null, new Object[0]);
        }
        this.zzie++;
        try {
            if (l != null) {
                zzex zzexVar = new zzex(l.longValue());
                if (z) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        hashMap.put(new zzch((String) entry.getKey()), zzjd.zza(entry.getValue(), zzir.zzfv()));
                    }
                    zzi = this.zzih.zza(zzchVar, hashMap, zzexVar);
                } else {
                    zzi = this.zzih.zza(zzchVar, zzjd.zza(obj, zzir.zzfv()), zzexVar);
                }
            } else if (z) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                    hashMap2.put(new zzch((String) entry2.getKey()), zzjd.zza(entry2.getValue(), zzir.zzfv()));
                }
                zzi = this.zzih.zza(zzchVar, hashMap2);
            } else {
                zzi = this.zzih.zzi(zzchVar, zzjd.zza(obj, zzir.zzfv()));
            }
            if (zzi.size() > 0) {
                zzn(zzchVar);
            }
            zzc(zzi);
        } catch (DatabaseException e) {
            this.zzib.zza("FIREBASE INTERNAL ERROR", e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzak
    public final void zza(List<String> list, List<zzba> list2, Long l) {
        zzch zzchVar = new zzch(list);
        if (this.zzib.zzfa()) {
            zzhz zzhzVar = this.zzib;
            String valueOf = String.valueOf(zzchVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("onRangeMergeUpdate: ");
            sb.append(valueOf);
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
        if (this.zzid.zzfa()) {
            zzhz zzhzVar2 = this.zzib;
            String valueOf2 = String.valueOf(zzchVar);
            String valueOf3 = String.valueOf(list2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21 + String.valueOf(valueOf3).length());
            sb2.append("onRangeMergeUpdate: ");
            sb2.append(valueOf2);
            sb2.append(" ");
            sb2.append(valueOf3);
            zzhzVar2.zza(sb2.toString(), null, new Object[0]);
        }
        this.zzie++;
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator<zzba> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new zzjh(it.next()));
        }
        List<? extends zzgy> zza = l != null ? this.zzih.zza(zzchVar, arrayList, new zzex(l.longValue())) : this.zzih.zzb(zzchVar, arrayList);
        if (zza.size() > 0) {
            zzn(zzchVar);
        }
        zzc(zza);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzak
    public final void zzaa() {
        zza(zzby.zzhe, (Object) true);
    }

    public final void zzb(zzch zzchVar, zzja zzjaVar, DatabaseReference.CompletionListener completionListener) {
        this.zzfs.zzb(zzchVar.zzbv(), zzjaVar.getValue(true), new zzdk(this, zzchVar, zzjaVar, completionListener));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzak
    public final void zzb(boolean z) {
        zza(zzby.zzhd, Boolean.valueOf(z));
    }

    public final void zzc(Runnable runnable) {
        this.zzia.zzbl();
        this.zzia.zzhh.zzc(runnable);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzak
    public final void zzc(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            zza(zzid.zzt(entry.getKey()), entry.getValue());
        }
    }

    public final zzdn zzcb() {
        return this.zzag;
    }

    public final long zzcc() {
        return this.zzhu.millis();
    }

    final boolean zzcd() {
        return (this.zzig.isEmpty() && this.zzih.isEmpty()) ? false : true;
    }

    public final void zze(zzce zzceVar) {
        zzc((zzby.zzhb.equals(zzceVar.zzbe().zzg().zzbw()) ? this.zzig : this.zzih).zzh(zzceVar));
    }

    public final void zzf(zzce zzceVar) {
        zzid zzbw = zzceVar.zzbe().zzg().zzbw();
        zzc(((zzbw == null || !zzbw.equals(zzby.zzhb)) ? this.zzih : this.zzig).zzg(zzceVar));
    }
}
