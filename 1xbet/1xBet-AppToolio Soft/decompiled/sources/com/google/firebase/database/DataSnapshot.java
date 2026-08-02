package com.google.firebase.database;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.firebase_database.zzch;
import com.google.android.gms.internal.firebase_database.zzit;
import com.google.android.gms.internal.firebase_database.zzks;
import com.google.android.gms.internal.firebase_database.zzkt;

/* loaded from: classes.dex */
public class DataSnapshot {
    private final zzit zzl;
    private final DatabaseReference zzm;

    DataSnapshot(DatabaseReference databaseReference, zzit zzitVar) {
        this.zzl = zzitVar;
        this.zzm = databaseReference;
    }

    @NonNull
    public DataSnapshot child(@NonNull String str) {
        return new DataSnapshot(this.zzm.child(str), zzit.zzj(this.zzl.zzd().zzam(new zzch(str))));
    }

    public boolean exists() {
        return !this.zzl.zzd().isEmpty();
    }

    @NonNull
    public Iterable<DataSnapshot> getChildren() {
        return new zza(this, this.zzl.iterator());
    }

    public long getChildrenCount() {
        return this.zzl.zzd().getChildCount();
    }

    @Nullable
    public String getKey() {
        return this.zzm.getKey();
    }

    @Nullable
    public Object getPriority() {
        Object value = this.zzl.zzd().zzfl().getValue();
        return value instanceof Long ? Double.valueOf(((Long) value).longValue()) : value;
    }

    @NonNull
    public DatabaseReference getRef() {
        return this.zzm;
    }

    @Nullable
    public Object getValue() {
        return this.zzl.zzd().getValue();
    }

    @Nullable
    public <T> T getValue(@NonNull GenericTypeIndicator<T> genericTypeIndicator) {
        return (T) zzkt.zza(this.zzl.zzd().getValue(), genericTypeIndicator);
    }

    @Nullable
    public <T> T getValue(@NonNull Class<T> cls) {
        return (T) zzkt.zza(this.zzl.zzd().getValue(), (Class) cls);
    }

    @Nullable
    public Object getValue(boolean z) {
        return this.zzl.zzd().getValue(z);
    }

    public boolean hasChild(@NonNull String str) {
        if (this.zzm.getParent() == null) {
            zzks.zzac(str);
        } else {
            zzks.zzab(str);
        }
        return !this.zzl.zzd().zzam(new zzch(str)).isEmpty();
    }

    public boolean hasChildren() {
        return this.zzl.zzd().getChildCount() > 0;
    }

    public String toString() {
        String key = this.zzm.getKey();
        String valueOf = String.valueOf(this.zzl.zzd().getValue(true));
        StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 33 + String.valueOf(valueOf).length());
        sb.append("DataSnapshot { key = ");
        sb.append(key);
        sb.append(", value = ");
        sb.append(valueOf);
        sb.append(" }");
        return sb.toString();
    }
}
