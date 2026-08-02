package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* loaded from: classes.dex */
public final class zzhb extends zzhf implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzhb(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(zzha.zza("maxSize (%s) must >= 0", Integer.valueOf(i7)));
        }
        this.zzb = new ArrayDeque(i7);
        this.zza = i7;
    }

    public static zzhb zza(int i7) {
        return new zzhb(i7);
    }

    @Override // com.google.android.recaptcha.internal.zzhd, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzhd, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.zza) {
            return zzhi.zza(this, collection.iterator());
        }
        clear();
        int i7 = size - this.zza;
        zzgx.zzb(i7 >= 0, "number to skip cannot be negative");
        return zzhi.zza(this, new zzhh(collection, i7).iterator());
    }

    @Override // com.google.android.recaptcha.internal.zzhf, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzhd, com.google.android.recaptcha.internal.zzhe
    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzhf, com.google.android.recaptcha.internal.zzhd
    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzhf
    public final Queue zzd() {
        return this.zzb;
    }
}
