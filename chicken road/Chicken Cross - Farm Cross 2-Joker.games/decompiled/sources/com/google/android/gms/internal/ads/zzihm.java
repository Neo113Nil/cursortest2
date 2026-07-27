package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzihm implements Iterator {
    private final ArrayDeque zza;
    private zzief zzb;

    /* synthetic */ zzihm(zziei zzieiVar, byte[] bArr) {
        if (!(zzieiVar instanceof zzihn)) {
            this.zza = null;
            this.zzb = (zzief) zzieiVar;
            return;
        }
        zzihn zzihnVar = (zzihn) zzieiVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzihnVar.zzp());
        this.zza = arrayDeque;
        arrayDeque.push(zzihnVar);
        this.zzb = zzb(zzihnVar.zzo());
    }

    private final zzief zzb(zziei zzieiVar) {
        while (zzieiVar instanceof zzihn) {
            zzihn zzihnVar = (zzihn) zzieiVar;
            this.zza.push(zzihnVar);
            zzieiVar = zzihnVar.zzo();
        }
        return (zzief) zzieiVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzief next() {
        zzief zziefVar;
        zzief zziefVar2 = this.zzb;
        if (zziefVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zziefVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zziefVar = zzb(((zzihn) arrayDeque.pop()).zzF());
        } while (zziefVar.zzs());
        this.zzb = zziefVar;
        return zziefVar2;
    }
}
