package com.google.firebase.database;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.internal.firebase_database.zzcc;
import com.google.android.gms.internal.firebase_database.zzch;
import com.google.android.gms.internal.firebase_database.zzck;
import com.google.android.gms.internal.firebase_database.zzdn;
import com.google.android.gms.internal.firebase_database.zzdo;
import com.google.android.gms.internal.firebase_database.zzko;
import com.google.android.gms.internal.firebase_database.zzkq;
import com.google.android.gms.internal.firebase_database.zzks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.Logger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FirebaseDatabase {
    private static final Map<String, Map<zzdn, FirebaseDatabase>> zzae = new HashMap();
    private final FirebaseApp zzaf;
    private final zzdn zzag;
    private final zzcc zzah;
    private zzck zzai;

    private FirebaseDatabase(FirebaseApp firebaseApp, zzdn zzdnVar, zzcc zzccVar) {
        this.zzaf = firebaseApp;
        this.zzag = zzdnVar;
        this.zzah = zzccVar;
    }

    @NonNull
    public static FirebaseDatabase getInstance() {
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        if (firebaseApp != null) {
            return getInstance(firebaseApp, firebaseApp.getOptions().getDatabaseUrl());
        }
        throw new DatabaseException("You must call FirebaseApp.initialize() first.");
    }

    @NonNull
    public static FirebaseDatabase getInstance(@NonNull FirebaseApp firebaseApp) {
        return getInstance(firebaseApp, firebaseApp.getOptions().getDatabaseUrl());
    }

    @NonNull
    public static synchronized FirebaseDatabase getInstance(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        FirebaseDatabase firebaseDatabase;
        synchronized (FirebaseDatabase.class) {
            if (TextUtils.isEmpty(str)) {
                throw new DatabaseException("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
            }
            Map<zzdn, FirebaseDatabase> map = zzae.get(firebaseApp.getName());
            if (map == null) {
                map = new HashMap<>();
                zzae.put(firebaseApp.getName(), map);
            }
            zzko zzx = zzkq.zzx(str);
            if (!zzx.zzap.isEmpty()) {
                String zzchVar = zzx.zzap.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 113 + String.valueOf(zzchVar).length());
                sb.append("Specified Database URL '");
                sb.append(str);
                sb.append("' is invalid. It should point to the root of a Firebase Database but it includes a path: ");
                sb.append(zzchVar);
                throw new DatabaseException(sb.toString());
            }
            firebaseDatabase = map.get(zzx.zzag);
            if (firebaseDatabase == null) {
                zzcc zzccVar = new zzcc();
                if (!firebaseApp.isDefaultApp()) {
                    zzccVar.zzr(firebaseApp.getName());
                }
                zzccVar.zza(firebaseApp);
                FirebaseDatabase firebaseDatabase2 = new FirebaseDatabase(firebaseApp, zzx.zzag, zzccVar);
                map.put(zzx.zzag, firebaseDatabase2);
                firebaseDatabase = firebaseDatabase2;
            }
        }
        return firebaseDatabase;
    }

    @NonNull
    public static FirebaseDatabase getInstance(@NonNull String str) {
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        if (firebaseApp != null) {
            return getInstance(firebaseApp, str);
        }
        throw new DatabaseException("You must call FirebaseApp.initialize() first.");
    }

    @NonNull
    public static String getSdkVersion() {
        return "3.0.0";
    }

    private final void zzb(String str) {
        if (this.zzai == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 77);
        sb.append("Calls to ");
        sb.append(str);
        sb.append("() must be made before any other usage of FirebaseDatabase instance.");
        throw new DatabaseException(sb.toString());
    }

    private final synchronized void zzc() {
        if (this.zzai == null) {
            this.zzai = zzdo.zza(this.zzah, this.zzag, this);
        }
    }

    @NonNull
    public FirebaseApp getApp() {
        return this.zzaf;
    }

    @NonNull
    public DatabaseReference getReference() {
        zzc();
        return new DatabaseReference(this.zzai, zzch.zzbt());
    }

    @NonNull
    public DatabaseReference getReference(@NonNull String str) {
        zzc();
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
        }
        zzks.zzac(str);
        return new DatabaseReference(this.zzai, new zzch(str));
    }

    @NonNull
    public DatabaseReference getReferenceFromUrl(@NonNull String str) {
        zzc();
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'url' in FirebaseDatabase.getReferenceFromUrl()");
        }
        zzko zzx = zzkq.zzx(str);
        if (zzx.zzag.zzct.equals(this.zzai.zzcb().zzct)) {
            return new DatabaseReference(this.zzai, zzx.zzap);
        }
        String databaseReference = getReference().toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 93 + String.valueOf(databaseReference).length());
        sb.append("Invalid URL (");
        sb.append(str);
        sb.append(") passed to getReference().  URL was expected to match configured Database URL: ");
        sb.append(databaseReference);
        throw new DatabaseException(sb.toString());
    }

    public void goOffline() {
        zzc();
        zzdo.zzk(this.zzai);
    }

    public void goOnline() {
        zzc();
        zzdo.zzl(this.zzai);
    }

    public void purgeOutstandingWrites() {
        zzc();
        this.zzai.zzc(new zzg(this));
    }

    public synchronized void setLogLevel(@NonNull Logger.Level level) {
        zzb("setLogLevel");
        this.zzah.setLogLevel(level);
    }

    public synchronized void setPersistenceCacheSizeBytes(long j) {
        zzb("setPersistenceCacheSizeBytes");
        this.zzah.setPersistenceCacheSizeBytes(j);
    }

    public synchronized void setPersistenceEnabled(boolean z) {
        zzb("setPersistenceEnabled");
        this.zzah.setPersistenceEnabled(z);
    }
}
