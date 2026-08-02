package com.google.android.gms.internal.firebase_database;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzq implements zzcj {
    private final FirebaseApp zzbd;
    private final Context zzbj;
    private final Set<String> zzbk = new HashSet();

    public zzq(FirebaseApp firebaseApp) {
        this.zzbd = firebaseApp;
        FirebaseApp firebaseApp2 = this.zzbd;
        if (firebaseApp2 != null) {
            this.zzbj = firebaseApp2.getApplicationContext();
            return;
        }
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
    }

    @Override // com.google.android.gms.internal.firebase_database.zzcj
    public final zzaj zza(zzbz zzbzVar, zzaf zzafVar, zzah zzahVar, zzak zzakVar) {
        com.google.firebase.database.connection.idl.zzf zza = com.google.firebase.database.connection.idl.zzf.zza(this.zzbj, new com.google.firebase.database.connection.idl.zzc(zzahVar, zzbzVar.zzbn(), (List<String>) null, zzbzVar.zzt(), FirebaseDatabase.getSdkVersion(), zzbzVar.zzv(), zzi()), zzafVar, zzakVar);
        this.zzbd.addBackgroundStateChangeListener(new zzt(this, zza));
        return zza;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzcj
    public final zzbq zza(ScheduledExecutorService scheduledExecutorService) {
        return new zzk(this.zzbd, scheduledExecutorService);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzcj
    public final zzcg zza(zzbz zzbzVar) {
        return new zzp();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzcj
    public final zzfv zza(zzbz zzbzVar, String str) {
        String zzbq = zzbzVar.zzbq();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(zzbq).length());
        sb.append(str);
        sb.append("_");
        sb.append(zzbq);
        String sb2 = sb.toString();
        if (!this.zzbk.contains(sb2)) {
            this.zzbk.add(sb2);
            return new zzfs(zzbzVar, new zzu(this.zzbj, zzbzVar, sb2), new zzft(zzbzVar.zzbo()));
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(zzbq).length() + 47);
        sb3.append("SessionPersistenceKey '");
        sb3.append(zzbq);
        sb3.append("' has already been used.");
        throw new DatabaseException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.firebase_database.zzcj
    public final zzia zza(zzbz zzbzVar, zzib zzibVar, List<String> list) {
        return new zzhw(zzibVar, null);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzcj
    public final zzdt zzb(zzbz zzbzVar) {
        return new zzr(this, zzbzVar.zzp("RunLoop"));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzcj
    public final String zzc(zzbz zzbzVar) {
        int i = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder(19);
        sb.append(i);
        sb.append("/Android");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzcj
    public final File zzi() {
        return this.zzbj.getApplicationContext().getDir("sslcache", 0);
    }
}
