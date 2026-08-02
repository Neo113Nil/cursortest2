package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class zzfui extends zzfyn {
    private Object zza;
    private int zzb = 2;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzfth.zzl(this.zzb != 4);
        int i7 = this.zzb;
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        if (i8 == 0) {
            return true;
        }
        if (i8 != 2) {
            this.zzb = 4;
            this.zza = zza();
            if (this.zzb != 3) {
                this.zzb = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zzb = 2;
        Object obj = this.zza;
        this.zza = null;
        return obj;
    }

    public abstract Object zza();

    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
