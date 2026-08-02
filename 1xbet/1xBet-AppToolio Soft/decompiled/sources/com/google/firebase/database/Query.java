package com.google.firebase.database;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.firebase_database.zzbt;
import com.google.android.gms.internal.firebase_database.zzce;
import com.google.android.gms.internal.firebase_database.zzch;
import com.google.android.gms.internal.firebase_database.zzck;
import com.google.android.gms.internal.firebase_database.zzfc;
import com.google.android.gms.internal.firebase_database.zzfh;
import com.google.android.gms.internal.firebase_database.zzhe;
import com.google.android.gms.internal.firebase_database.zzhh;
import com.google.android.gms.internal.firebase_database.zzic;
import com.google.android.gms.internal.firebase_database.zzid;
import com.google.android.gms.internal.firebase_database.zziq;
import com.google.android.gms.internal.firebase_database.zzir;
import com.google.android.gms.internal.firebase_database.zziu;
import com.google.android.gms.internal.firebase_database.zzja;
import com.google.android.gms.internal.firebase_database.zzje;
import com.google.android.gms.internal.firebase_database.zzjf;
import com.google.android.gms.internal.firebase_database.zzjg;
import com.google.android.gms.internal.firebase_database.zzji;
import com.google.android.gms.internal.firebase_database.zzjk;
import com.google.android.gms.internal.firebase_database.zzkq;
import com.google.android.gms.internal.firebase_database.zzks;

/* loaded from: classes.dex */
public class Query {
    protected final zzck zzai;
    protected final zzch zzap;
    private final zzhe zzat;
    private final boolean zzau;

    Query(zzck zzckVar, zzch zzchVar) {
        this.zzai = zzckVar;
        this.zzap = zzchVar;
        this.zzat = zzhe.zzph;
        this.zzau = false;
    }

    private Query(zzck zzckVar, zzch zzchVar, zzhe zzheVar, boolean z) throws DatabaseException {
        this.zzai = zzckVar;
        this.zzap = zzchVar;
        this.zzat = zzheVar;
        this.zzau = z;
        zzkq.zza((zzheVar.zzdy() && zzheVar.zzeb() && zzheVar.zzee() && !zzheVar.zzef()) ? false : true, "Validation of queries failed.");
    }

    private final Query zza(zzja zzjaVar, String str) {
        zzks.zzad(str);
        if (!zzjaVar.zzfk() && !zzjaVar.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for startAt()");
        }
        if (this.zzat.zzdy()) {
            throw new IllegalArgumentException("Can't call startAt() or equalTo() multiple times");
        }
        zzhe zza = this.zzat.zza(zzjaVar, str != null ? zzid.zzt(str) : null);
        zzb(zza);
        zza(zza);
        return new Query(this.zzai, this.zzap, zza, this.zzau);
    }

    private final void zza(zzce zzceVar) {
        zzfh.zzcu().zzj(zzceVar);
        this.zzai.zzc(new zzq(this, zzceVar));
    }

    private static void zza(zzhe zzheVar) {
        if (!zzheVar.zzeg().equals(zziu.zzgb())) {
            if (zzheVar.zzeg().equals(zzjf.zzgf())) {
                if ((zzheVar.zzdy() && !zzjg.zzl(zzheVar.zzdz())) || (zzheVar.zzeb() && !zzjg.zzl(zzheVar.zzec()))) {
                    throw new IllegalArgumentException("When using orderByPriority(), values provided to startAt(), endAt(), or equalTo() must be valid priorities.");
                }
                return;
            }
            return;
        }
        if (zzheVar.zzdy()) {
            zzja zzdz = zzheVar.zzdz();
            if (zzheVar.zzea() != zzid.zzfc() || !(zzdz instanceof zzji)) {
                throw new IllegalArgumentException("You must use startAt(String value), endAt(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
            }
        }
        if (zzheVar.zzeb()) {
            zzja zzec = zzheVar.zzec();
            if (zzheVar.zzed() != zzid.zzfd() || !(zzec instanceof zzji)) {
                throw new IllegalArgumentException("You must use startAt(String value), endAt(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
            }
        }
    }

    private final Query zzb(zzja zzjaVar, String str) {
        zzks.zzad(str);
        if (!zzjaVar.zzfk() && !zzjaVar.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for endAt()");
        }
        zzid zzt = str != null ? zzid.zzt(str) : null;
        if (this.zzat.zzeb()) {
            throw new IllegalArgumentException("Can't call endAt() or equalTo() multiple times");
        }
        zzhe zzb = this.zzat.zzb(zzjaVar, zzt);
        zzb(zzb);
        zza(zzb);
        return new Query(this.zzai, this.zzap, zzb, this.zzau);
    }

    private final void zzb(zzce zzceVar) {
        zzfh.zzcu().zzi(zzceVar);
        this.zzai.zzc(new zzr(this, zzceVar));
    }

    private static void zzb(zzhe zzheVar) {
        if (zzheVar.zzdy() && zzheVar.zzeb() && zzheVar.zzee() && !zzheVar.zzef()) {
            throw new IllegalArgumentException("Can't combine startAt(), endAt() and limit(). Use limitToFirst() or limitToLast() instead");
        }
    }

    private final void zze() {
        if (this.zzat.zzdy()) {
            throw new IllegalArgumentException("Can't call equalTo() and startAt() combined");
        }
        if (this.zzat.zzeb()) {
            throw new IllegalArgumentException("Can't call equalTo() and endAt() combined");
        }
    }

    private final void zzf() {
        if (this.zzau) {
            throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
        }
    }

    @NonNull
    public ChildEventListener addChildEventListener(@NonNull ChildEventListener childEventListener) {
        zzb(new zzbt(this.zzai, childEventListener, zzh()));
        return childEventListener;
    }

    public void addListenerForSingleValueEvent(@NonNull ValueEventListener valueEventListener) {
        zzb(new zzfc(this.zzai, new zzp(this, valueEventListener), zzh()));
    }

    @NonNull
    public ValueEventListener addValueEventListener(@NonNull ValueEventListener valueEventListener) {
        zzb(new zzfc(this.zzai, valueEventListener, zzh()));
        return valueEventListener;
    }

    @NonNull
    public Query endAt(double d) {
        return endAt(d, (String) null);
    }

    @NonNull
    public Query endAt(double d, @Nullable String str) {
        return zzb(new zziq(Double.valueOf(d), zzir.zzfv()), str);
    }

    @NonNull
    public Query endAt(@Nullable String str) {
        return endAt(str, (String) null);
    }

    @NonNull
    public Query endAt(@Nullable String str, @Nullable String str2) {
        return zzb(str != null ? new zzji(str, zzir.zzfv()) : zzir.zzfv(), str2);
    }

    @NonNull
    public Query endAt(boolean z) {
        return endAt(z, (String) null);
    }

    @NonNull
    public Query endAt(boolean z, @Nullable String str) {
        return zzb(new zzic(Boolean.valueOf(z), zzir.zzfv()), str);
    }

    @NonNull
    public Query equalTo(double d) {
        zze();
        return startAt(d).endAt(d);
    }

    @NonNull
    public Query equalTo(double d, @Nullable String str) {
        zze();
        return startAt(d, str).endAt(d, str);
    }

    @NonNull
    public Query equalTo(@Nullable String str) {
        zze();
        return startAt(str).endAt(str);
    }

    @NonNull
    public Query equalTo(@Nullable String str, @Nullable String str2) {
        zze();
        return startAt(str, str2).endAt(str, str2);
    }

    @NonNull
    public Query equalTo(boolean z) {
        zze();
        return startAt(z).endAt(z);
    }

    @NonNull
    public Query equalTo(boolean z, @Nullable String str) {
        zze();
        return startAt(z, str).endAt(z, str);
    }

    @NonNull
    public DatabaseReference getRef() {
        return new DatabaseReference(this.zzai, this.zzap);
    }

    public void keepSynced(boolean z) {
        if (!this.zzap.isEmpty() && this.zzap.zzbw().equals(zzid.zzff())) {
            throw new DatabaseException("Can't call keepSynced() on .info paths.");
        }
        this.zzai.zzc(new zzs(this, z));
    }

    @NonNull
    public Query limitToFirst(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        }
        if (this.zzat.zzee()) {
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
        return new Query(this.zzai, this.zzap, this.zzat.zzc(i), this.zzau);
    }

    @NonNull
    public Query limitToLast(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        }
        if (this.zzat.zzee()) {
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
        return new Query(this.zzai, this.zzap, this.zzat.zzd(i), this.zzau);
    }

    @NonNull
    public Query orderByChild(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("Key can't be null");
        }
        if (str.equals("$key") || str.equals(".key")) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
            sb.append("Can't use '");
            sb.append(str);
            sb.append("' as path, please use orderByKey() instead!");
            throw new IllegalArgumentException(sb.toString());
        }
        if (str.equals("$priority") || str.equals(".priority")) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
            sb2.append("Can't use '");
            sb2.append(str);
            sb2.append("' as path, please use orderByPriority() instead!");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (str.equals("$value") || str.equals(".value")) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 56);
            sb3.append("Can't use '");
            sb3.append(str);
            sb3.append("' as path, please use orderByValue() instead!");
            throw new IllegalArgumentException(sb3.toString());
        }
        zzks.zzab(str);
        zzf();
        zzch zzchVar = new zzch(str);
        if (zzchVar.size() == 0) {
            throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
        }
        return new Query(this.zzai, this.zzap, this.zzat.zza(new zzje(zzchVar)), true);
    }

    @NonNull
    public Query orderByKey() {
        zzf();
        zzhe zza = this.zzat.zza(zziu.zzgb());
        zza(zza);
        return new Query(this.zzai, this.zzap, zza, true);
    }

    @NonNull
    public Query orderByPriority() {
        zzf();
        zzhe zza = this.zzat.zza(zzjf.zzgf());
        zza(zza);
        return new Query(this.zzai, this.zzap, zza, true);
    }

    @NonNull
    public Query orderByValue() {
        zzf();
        return new Query(this.zzai, this.zzap, this.zzat.zza(zzjk.zzgg()), true);
    }

    public void removeEventListener(@NonNull ChildEventListener childEventListener) {
        if (childEventListener == null) {
            throw new NullPointerException("listener must not be null");
        }
        zza(new zzbt(this.zzai, childEventListener, zzh()));
    }

    public void removeEventListener(@NonNull ValueEventListener valueEventListener) {
        if (valueEventListener == null) {
            throw new NullPointerException("listener must not be null");
        }
        zza(new zzfc(this.zzai, valueEventListener, zzh()));
    }

    @NonNull
    public Query startAt(double d) {
        return startAt(d, (String) null);
    }

    @NonNull
    public Query startAt(double d, @Nullable String str) {
        return zza(new zziq(Double.valueOf(d), zzir.zzfv()), str);
    }

    @NonNull
    public Query startAt(@Nullable String str) {
        return startAt(str, (String) null);
    }

    @NonNull
    public Query startAt(@Nullable String str, @Nullable String str2) {
        return zza(str != null ? new zzji(str, zzir.zzfv()) : zzir.zzfv(), str2);
    }

    @NonNull
    public Query startAt(boolean z) {
        return startAt(z, (String) null);
    }

    @NonNull
    public Query startAt(boolean z, @Nullable String str) {
        return zza(new zzic(Boolean.valueOf(z), zzir.zzfv()), str);
    }

    public final zzch zzg() {
        return this.zzap;
    }

    public final zzhh zzh() {
        return new zzhh(this.zzap, this.zzat);
    }
}
