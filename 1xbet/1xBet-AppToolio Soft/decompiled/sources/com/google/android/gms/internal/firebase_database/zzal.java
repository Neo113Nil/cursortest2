package com.google.android.gms.internal.firebase_database;

import android.support.v4.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzal implements zzaa, zzaj {
    private static long zzcb;
    private final ScheduledExecutorService zzbc;
    private final zzhz zzbs;
    private final zzah zzcc;
    private final zzad zzcn;
    private final zzak zzcw;
    private String zzcx;
    private long zzda;
    private zzz zzdb;
    private String zzdj;
    private boolean zzdk;
    private final zzaf zzdl;
    private final zzbm zzdm;
    private String zzdn;
    private long zzdr;
    private boolean zzds;
    private HashSet<String> zzcy = new HashSet<>();
    private boolean zzcz = true;
    private zzav zzdc = zzav.Disconnected;
    private long zzdd = 0;
    private long zzde = 0;
    private long zzdo = 0;
    private int zzdp = 0;
    private ScheduledFuture<?> zzdq = null;
    private Map<zzaw, zzay> zzdi = new HashMap();
    private Map<Long, zzau> zzdf = new HashMap();
    private Map<Long, zzaz> zzdh = new HashMap();
    private List<zzax> zzdg = new ArrayList();

    public zzal(zzaf zzafVar, zzah zzahVar, zzak zzakVar) {
        this.zzcw = zzakVar;
        this.zzdl = zzafVar;
        this.zzbc = zzafVar.zzs();
        this.zzcn = zzafVar.zzr();
        this.zzcc = zzahVar;
        this.zzdm = new zzbo(this.zzbc, zzafVar.zzq(), "ConnectionRetryHelper").zzh(1000L).zza(1.3d).zzi(30000L).zzb(0.7d).zzaz();
        long j = zzcb;
        zzcb = 1 + j;
        zzia zzq = zzafVar.zzq();
        StringBuilder sb = new StringBuilder(23);
        sb.append("pc_");
        sb.append(j);
        this.zzbs = new zzhz(zzq, "PersistentConnection", sb.toString());
        this.zzdn = null;
        zzag();
    }

    private final boolean isIdle() {
        return this.zzdi.isEmpty() && this.zzdf.isEmpty() && !this.zzds && this.zzdh.isEmpty();
    }

    static /* synthetic */ int zza(zzal zzalVar, int i) {
        zzalVar.zzdp = 0;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzay zza(zzaw zzawVar) {
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar = this.zzbs;
            String valueOf = String.valueOf(zzawVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("removing query ");
            sb.append(valueOf);
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
        if (this.zzdi.containsKey(zzawVar)) {
            zzay zzayVar = this.zzdi.get(zzawVar);
            this.zzdi.remove(zzawVar);
            zzag();
            return zzayVar;
        }
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar2 = this.zzbs;
            String valueOf2 = String.valueOf(zzawVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 64);
            sb2.append("Trying to remove listener for QuerySpec ");
            sb2.append(valueOf2);
            sb2.append(" but no listener exists.");
            zzhzVar2.zza(sb2.toString(), null, new Object[0]);
        }
        return null;
    }

    static /* synthetic */ String zza(zzal zzalVar, String str) {
        zzalVar.zzdj = null;
        return null;
    }

    static /* synthetic */ ScheduledFuture zza(zzal zzalVar, ScheduledFuture scheduledFuture) {
        zzalVar.zzdq = null;
        return null;
    }

    private final void zza(zzay zzayVar) {
        List list;
        zzaw zzawVar;
        Object obj;
        Map<String, Object> hashMap = new HashMap<>();
        list = zzayVar.zzaj().zzei;
        hashMap.put("p", zzag.zzb((List<String>) list));
        Object zzak = zzayVar.zzak();
        if (zzak != null) {
            zzawVar = zzayVar.zzen;
            obj = zzawVar.zzej;
            hashMap.put("q", obj);
            hashMap.put("t", zzak);
        }
        zzai zzal = zzayVar.zzal();
        hashMap.put("h", zzal.zzx());
        if (zzal.zzy()) {
            zzy zzz = zzal.zzz();
            ArrayList arrayList = new ArrayList();
            Iterator<List<String>> it = zzz.zzo().iterator();
            while (it.hasNext()) {
                arrayList.add(zzag.zzb(it.next()));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("hs", zzz.zzp());
            hashMap2.put("ps", arrayList);
            hashMap.put("ch", hashMap2);
        }
        zza("q", hashMap, new zzar(this, zzayVar));
    }

    private final void zza(String str, List<String> list, Object obj, zzbb zzbbVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", zzag.zzb(list));
        hashMap.put("d", obj);
        zza(str, hashMap, new zzao(this, zzbbVar));
    }

    private final void zza(String str, List<String> list, Object obj, String str2, zzbb zzbbVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", zzag.zzb(list));
        hashMap.put("d", obj);
        if (str2 != null) {
            hashMap.put("h", str2);
        }
        long j = this.zzdd;
        this.zzdd = 1 + j;
        this.zzdh.put(Long.valueOf(j), new zzaz(str, hashMap, zzbbVar, null));
        if (zzac()) {
            zze(j);
        }
        this.zzdr = System.currentTimeMillis();
        zzag();
    }

    private final void zza(String str, Map<String, Object> map, zzau zzauVar) {
        zza(str, false, map, zzauVar);
    }

    private final void zza(String str, boolean z, Map<String, Object> map, zzau zzauVar) {
        long j = this.zzde;
        this.zzde = 1 + j;
        HashMap hashMap = new HashMap();
        hashMap.put("r", Long.valueOf(j));
        hashMap.put("a", str);
        hashMap.put("b", map);
        this.zzdb.zza(hashMap, z);
        this.zzdf.put(Long.valueOf(j), zzauVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(List<String> list, zzaw zzawVar) {
        Map map;
        List list2;
        if (list.contains("no_index")) {
            map = zzawVar.zzej;
            String valueOf = String.valueOf(map.get("i"));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
            sb.append("\".indexOn\": \"");
            sb.append(valueOf);
            sb.append('\"');
            String sb2 = sb.toString();
            zzhz zzhzVar = this.zzbs;
            list2 = zzawVar.zzei;
            String zzb = zzag.zzb((List<String>) list2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 175 + String.valueOf(zzb).length());
            sb3.append("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '");
            sb3.append(sb2);
            sb3.append("' at ");
            sb3.append(zzb);
            sb3.append(" to your security and Firebase Database rules for better performance");
            zzhzVar.zzb(sb3.toString(), null);
        }
    }

    static /* synthetic */ boolean zza(zzal zzalVar, boolean z) {
        zzalVar.zzdk = true;
        return true;
    }

    private final boolean zzab() {
        return this.zzdc == zzav.Authenticating || this.zzdc == zzav.Connected;
    }

    private final boolean zzac() {
        return this.zzdc == zzav.Connected;
    }

    private final boolean zzad() {
        return this.zzcy.size() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzae() {
        if (zzad()) {
            zzag.zza(this.zzdc == zzav.Disconnected, "Not in disconnected state: %s", this.zzdc);
            boolean z = this.zzdk;
            this.zzbs.zza("Scheduling connection attempt", null, new Object[0]);
            this.zzdk = false;
            this.zzdm.zzb(new zzam(this, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf() {
        int i = 0;
        zzag.zza(this.zzdc == zzav.Connected, "Should be connected if we're restoring state, but we are: %s", this.zzdc);
        if (this.zzbs.zzfa()) {
            this.zzbs.zza("Restoring outstanding listens", null, new Object[0]);
        }
        for (zzay zzayVar : this.zzdi.values()) {
            if (this.zzbs.zzfa()) {
                zzhz zzhzVar = this.zzbs;
                String valueOf = String.valueOf(zzayVar.zzaj());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                sb.append("Restoring listen ");
                sb.append(valueOf);
                zzhzVar.zza(sb.toString(), null, new Object[0]);
            }
            zza(zzayVar);
        }
        if (this.zzbs.zzfa()) {
            this.zzbs.zza("Restoring writes.", null, new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.zzdh.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            zze(((Long) obj).longValue());
        }
        for (zzax zzaxVar : this.zzdg) {
            zza(zzaxVar.getAction(), zzaxVar.getPath(), zzaxVar.getData(), zzaxVar.zzai());
        }
        this.zzdg.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzag() {
        if (isIdle()) {
            ScheduledFuture<?> scheduledFuture = this.zzdq;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zzdq = this.zzbc.schedule(new zzat(this), 60000L, TimeUnit.MILLISECONDS);
            return;
        }
        if (isInterrupted("connection_idle")) {
            zzag.zza(!isIdle(), "", new Object[0]);
            resume("connection_idle");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzah() {
        return isIdle() && System.currentTimeMillis() > this.zzdr + 60000;
    }

    static /* synthetic */ long zzc(zzal zzalVar) {
        long j = zzalVar.zzdo;
        zzalVar.zzdo = 1 + j;
        return j;
    }

    private final void zzc(boolean z) {
        String str;
        zzag.zza(zzab(), "Must be connected to send auth, but was: %s", this.zzdc);
        zzag.zza(this.zzdj != null, "Auth token must be set to authenticate!", new Object[0]);
        zzap zzapVar = new zzap(this, z);
        HashMap hashMap = new HashMap();
        zzkd zzu = zzkd.zzu(this.zzdj);
        if (zzu != null) {
            hashMap.put("cred", zzu.getToken());
            if (zzu.zzgu() != null) {
                hashMap.put("authvar", zzu.zzgu());
            }
            str = "gauth";
        } else {
            hashMap.put("cred", this.zzdj);
            str = "auth";
        }
        zza(str, true, (Map<String, Object>) hashMap, (zzau) zzapVar);
    }

    private final void zze(long j) {
        zzaz zzazVar = this.zzdh.get(Long.valueOf(j));
        zzbb zzai = zzazVar.zzai();
        String action = zzazVar.getAction();
        zzazVar.zzan();
        zza(action, zzazVar.zzam(), new zzaq(this, action, j, zzazVar, zzai));
    }

    static /* synthetic */ int zzj(zzal zzalVar) {
        int i = zzalVar.zzdp;
        zzalVar.zzdp = i + 1;
        return i;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void initialize() {
        zzae();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void interrupt(String str) {
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar = this.zzbs;
            String valueOf = String.valueOf(str);
            zzhzVar.zza(valueOf.length() != 0 ? "Connection interrupted for: ".concat(valueOf) : new String("Connection interrupted for: "), null, new Object[0]);
        }
        this.zzcy.add(str);
        zzz zzzVar = this.zzdb;
        if (zzzVar != null) {
            zzzVar.close();
            this.zzdb = null;
        } else {
            this.zzdm.cancel();
            this.zzdc = zzav.Disconnected;
        }
        this.zzdm.zzax();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final boolean isInterrupted(String str) {
        return this.zzcy.contains(str);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void purgeOutstandingWrites() {
        zzbb zzbbVar;
        zzbb zzbbVar2;
        zzbb zzbbVar3;
        zzbb zzbbVar4;
        for (zzaz zzazVar : this.zzdh.values()) {
            zzbbVar3 = zzazVar.zzel;
            if (zzbbVar3 != null) {
                zzbbVar4 = zzazVar.zzel;
                zzbbVar4.zzb("write_canceled", null);
            }
        }
        for (zzax zzaxVar : this.zzdg) {
            zzbbVar = zzaxVar.zzel;
            if (zzbbVar != null) {
                zzbbVar2 = zzaxVar.zzel;
                zzbbVar2.zzb("write_canceled", null);
            }
        }
        this.zzdh.clear();
        this.zzdg.clear();
        if (!zzab()) {
            this.zzds = false;
        }
        zzag();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void refreshAuthToken() {
        this.zzbs.zza("Auth token refresh requested", null, new Object[0]);
        interrupt("token_refresh");
        resume("token_refresh");
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void resume(String str) {
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar = this.zzbs;
            String valueOf = String.valueOf(str);
            zzhzVar.zza(valueOf.length() != 0 ? "Connection no longer interrupted for: ".concat(valueOf) : new String("Connection no longer interrupted for: "), null, new Object[0]);
        }
        this.zzcy.remove(str);
        if (zzad() && this.zzdc == zzav.Disconnected) {
            zzae();
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void shutdown() {
        interrupt("shutdown");
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaa
    public final void zza(long j, String str) {
        if (this.zzbs.zzfa()) {
            this.zzbs.zza("onReady", null, new Object[0]);
        }
        this.zzda = System.currentTimeMillis();
        if (this.zzbs.zzfa()) {
            this.zzbs.zza("handling timestamp", null, new Object[0]);
        }
        long currentTimeMillis = j - System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("serverTimeOffset", Long.valueOf(currentTimeMillis));
        this.zzcw.zzc(hashMap);
        if (this.zzcz) {
            HashMap hashMap2 = new HashMap();
            if (this.zzdl.zzt()) {
                hashMap2.put("persistence.android.enabled", 1);
            }
            String valueOf = String.valueOf(this.zzdl.zzu().replace('.', '-'));
            hashMap2.put(valueOf.length() != 0 ? "sdk.android.".concat(valueOf) : new String("sdk.android."), 1);
            if (this.zzbs.zzfa()) {
                this.zzbs.zza("Sending first connection stats", null, new Object[0]);
            }
            if (!hashMap2.isEmpty()) {
                Map<String, Object> hashMap3 = new HashMap<>();
                hashMap3.put("c", hashMap2);
                zza("s", hashMap3, new zzas(this));
            } else if (this.zzbs.zzfa()) {
                this.zzbs.zza("Not sending stats because stats are empty", null, new Object[0]);
            }
        }
        if (this.zzbs.zzfa()) {
            this.zzbs.zza("calling restore state", null, new Object[0]);
        }
        zzag.zza(this.zzdc == zzav.Connecting, "Wanted to restore auth, but was in wrong state: %s", this.zzdc);
        if (this.zzdj == null) {
            if (this.zzbs.zzfa()) {
                this.zzbs.zza("Not restoring auth because token is null.", null, new Object[0]);
            }
            this.zzdc = zzav.Connected;
            zzaf();
        } else {
            if (this.zzbs.zzfa()) {
                this.zzbs.zza("Restoring auth.", null, new Object[0]);
            }
            this.zzdc = zzav.Authenticating;
            zzc(true);
        }
        this.zzcz = false;
        this.zzdn = str;
        this.zzcw.zzaa();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zza(List<String> list, zzbb zzbbVar) {
        if (zzac()) {
            zza("oc", list, (Object) null, zzbbVar);
        } else {
            this.zzdg.add(new zzax("oc", list, null, zzbbVar, null));
        }
        zzag();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zza(List<String> list, Object obj, zzbb zzbbVar) {
        zza("p", list, obj, (String) null, zzbbVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zza(List<String> list, Object obj, String str, zzbb zzbbVar) {
        zza("p", list, obj, str, zzbbVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zza(List<String> list, Map<String, Object> map) {
        zzaw zzawVar;
        List list2;
        Map map2;
        zzaw zzawVar2 = new zzaw(list, map);
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar = this.zzbs;
            String valueOf = String.valueOf(zzawVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("unlistening on ");
            sb.append(valueOf);
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
        zzay zza = zza(zzawVar2);
        if (zza != null && zzab()) {
            HashMap hashMap = new HashMap();
            zzawVar = zza.zzen;
            list2 = zzawVar.zzei;
            hashMap.put("p", zzag.zzb((List<String>) list2));
            Long zzak = zza.zzak();
            if (zzak != null) {
                map2 = zza.zzaj().zzej;
                hashMap.put("q", map2);
                hashMap.put("t", zzak);
            }
            zza("n", hashMap, (zzau) null);
        }
        zzag();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zza(List<String> list, Map<String, Object> map, zzai zzaiVar, Long l, zzbb zzbbVar) {
        zzaw zzawVar = new zzaw(list, map);
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar = this.zzbs;
            String valueOf = String.valueOf(zzawVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Listening on ");
            sb.append(valueOf);
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
        zzag.zza(!this.zzdi.containsKey(zzawVar), "listen() called twice for same QuerySpec.", new Object[0]);
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar2 = this.zzbs;
            String valueOf2 = String.valueOf(zzawVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
            sb2.append("Adding listen query: ");
            sb2.append(valueOf2);
            zzhzVar2.zza(sb2.toString(), null, new Object[0]);
        }
        zzay zzayVar = new zzay(zzbbVar, zzawVar, l, zzaiVar, null);
        this.zzdi.put(zzawVar, zzayVar);
        if (zzab()) {
            zza(zzayVar);
        }
        zzag();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zza(List<String> list, Map<String, Object> map, zzbb zzbbVar) {
        zza("m", list, map, (String) null, zzbbVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaa
    public final void zzb(zzab zzabVar) {
        boolean z = false;
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar = this.zzbs;
            String valueOf = String.valueOf(zzabVar.name());
            zzhzVar.zza(valueOf.length() != 0 ? "Got on disconnect due to ".concat(valueOf) : new String("Got on disconnect due to "), null, new Object[0]);
        }
        this.zzdc = zzav.Disconnected;
        this.zzdb = null;
        this.zzds = false;
        this.zzdf.clear();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Long, zzaz>> it = this.zzdh.entrySet().iterator();
        while (it.hasNext()) {
            zzaz value = it.next().getValue();
            if (value.zzam().containsKey("h") && value.zzao()) {
                arrayList.add(value);
                it.remove();
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((zzaz) obj).zzai().zzb("disconnected", null);
        }
        if (zzad()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.zzda;
            long j2 = currentTimeMillis - j;
            if (j > 0 && j2 > 30000) {
                z = true;
            }
            if (zzabVar == zzab.SERVER_RESET || z) {
                this.zzdm.zzax();
            }
            zzae();
        }
        this.zzda = 0L;
        this.zzcw.onDisconnect();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zzb(List<String> list, Object obj, zzbb zzbbVar) {
        this.zzds = true;
        if (zzac()) {
            zza("o", list, obj, zzbbVar);
        } else {
            this.zzdg.add(new zzax("o", list, obj, zzbbVar, null));
        }
        zzag();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zzb(List<String> list, Map<String, Object> map, zzbb zzbbVar) {
        this.zzds = true;
        if (zzac()) {
            zza("om", list, map, zzbbVar);
        } else {
            this.zzdg.add(new zzax("om", list, map, zzbbVar, null));
        }
        zzag();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaa
    public final void zzb(Map<String, Object> map) {
        zzbb zzbbVar;
        List list;
        if (map.containsKey("r")) {
            zzau remove = this.zzdf.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (remove != null) {
                remove.zzd((Map) map.get("b"));
                return;
            }
            return;
        }
        if (map.containsKey("error")) {
            return;
        }
        int i = 0;
        if (!map.containsKey("a")) {
            if (this.zzbs.zzfa()) {
                zzhz zzhzVar = this.zzbs;
                String valueOf = String.valueOf(map);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Ignoring unknown message: ");
                sb.append(valueOf);
                zzhzVar.zza(sb.toString(), null, new Object[0]);
                return;
            }
            return;
        }
        String str = (String) map.get("a");
        Map map2 = (Map) map.get("b");
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar2 = this.zzbs;
            String valueOf2 = String.valueOf(map2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(valueOf2).length());
            sb2.append("handleServerMessage: ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(valueOf2);
            zzhzVar2.zza(sb2.toString(), null, new Object[0]);
        }
        if (str.equals("d") || str.equals("m")) {
            boolean equals = str.equals("m");
            String str2 = (String) map2.get("p");
            Object obj = map2.get("d");
            Long zzb = zzag.zzb(map2.get("t"));
            if (!equals || !(obj instanceof Map) || ((Map) obj).size() != 0) {
                this.zzcw.zza(zzag.zzg(str2), obj, equals, zzb);
                return;
            } else {
                if (this.zzbs.zzfa()) {
                    zzhz zzhzVar3 = this.zzbs;
                    String valueOf3 = String.valueOf(str2);
                    zzhzVar3.zza(valueOf3.length() != 0 ? "ignoring empty merge for path ".concat(valueOf3) : new String("ignoring empty merge for path "), null, new Object[0]);
                    return;
                }
                return;
            }
        }
        if (str.equals("rm")) {
            String str3 = (String) map2.get("p");
            List<String> zzg = zzag.zzg(str3);
            Object obj2 = map2.get("d");
            Long zzb2 = zzag.zzb(map2.get("t"));
            ArrayList arrayList = new ArrayList();
            for (Map map3 : (List) obj2) {
                String str4 = (String) map3.get("s");
                String str5 = (String) map3.get("e");
                arrayList.add(new zzba(str4 != null ? zzag.zzg(str4) : null, str5 != null ? zzag.zzg(str5) : null, map3.get("m")));
            }
            if (!arrayList.isEmpty()) {
                this.zzcw.zza(zzg, arrayList, zzb2);
                return;
            } else {
                if (this.zzbs.zzfa()) {
                    zzhz zzhzVar4 = this.zzbs;
                    String valueOf4 = String.valueOf(str3);
                    zzhzVar4.zza(valueOf4.length() != 0 ? "Ignoring empty range merge for path ".concat(valueOf4) : new String("Ignoring empty range merge for path "), null, new Object[0]);
                    return;
                }
                return;
            }
        }
        if (!str.equals("c")) {
            if (!str.equals("ac")) {
                if (str.equals("sd")) {
                    this.zzbs.info((String) map2.get(NotificationCompat.CATEGORY_MESSAGE));
                    return;
                } else {
                    if (this.zzbs.zzfa()) {
                        zzhz zzhzVar5 = this.zzbs;
                        String valueOf5 = String.valueOf(str);
                        zzhzVar5.zza(valueOf5.length() != 0 ? "Unrecognized action from server: ".concat(valueOf5) : new String("Unrecognized action from server: "), null, new Object[0]);
                        return;
                    }
                    return;
                }
            }
            String str6 = (String) map2.get("s");
            String str7 = (String) map2.get("d");
            zzhz zzhzVar6 = this.zzbs;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str6).length() + 23 + String.valueOf(str7).length());
            sb3.append("Auth token revoked: ");
            sb3.append(str6);
            sb3.append(" (");
            sb3.append(str7);
            sb3.append(")");
            zzhzVar6.zza(sb3.toString(), null, new Object[0]);
            this.zzdj = null;
            this.zzdk = true;
            this.zzcw.zzb(false);
            this.zzdb.close();
            return;
        }
        List<String> zzg2 = zzag.zzg((String) map2.get("p"));
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar7 = this.zzbs;
            String valueOf6 = String.valueOf(zzg2);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf6).length() + 29);
            sb4.append("removing all listens at path ");
            sb4.append(valueOf6);
            zzhzVar7.zza(sb4.toString(), null, new Object[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<zzaw, zzay> entry : this.zzdi.entrySet()) {
            zzaw key = entry.getKey();
            zzay value = entry.getValue();
            list = key.zzei;
            if (list.equals(zzg2)) {
                arrayList2.add(value);
            }
        }
        ArrayList arrayList3 = arrayList2;
        int size = arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj3 = arrayList3.get(i2);
            i2++;
            this.zzdi.remove(((zzay) obj3).zzaj());
        }
        zzag();
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj4 = arrayList3.get(i);
            i++;
            zzbbVar = ((zzay) obj4).zzem;
            zzbbVar.zzb("permission_denied", null);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaa
    public final void zzd(String str) {
        this.zzcx = str;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaa
    public final void zze(String str) {
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar = this.zzbs;
            String valueOf = String.valueOf(str);
            zzhzVar.zza(valueOf.length() != 0 ? "Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ".concat(valueOf) : new String("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: "), null, new Object[0]);
        }
        interrupt("server_kill");
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zzh(String str) {
        this.zzbs.zza("Auth token refreshed.", null, new Object[0]);
        this.zzdj = str;
        if (zzab()) {
            if (str != null) {
                zzc(false);
                return;
            }
            zzag.zza(zzab(), "Must be connected to send unauth.", new Object[0]);
            zzag.zza(this.zzdj == null, "Auth token must not be set.", new Object[0]);
            zza("unauth", Collections.emptyMap(), (zzau) null);
        }
    }

    public final void zzi(String str) {
        zzag.zza(this.zzdc == zzav.GettingToken, "Trying to open network connection while in the wrong state: %s", this.zzdc);
        if (str == null) {
            this.zzcw.zzb(false);
        }
        this.zzdj = str;
        this.zzdc = zzav.Connecting;
        this.zzdb = new zzz(this.zzdl, this.zzcc, this.zzcx, this, this.zzdn);
        this.zzdb.open();
    }
}
