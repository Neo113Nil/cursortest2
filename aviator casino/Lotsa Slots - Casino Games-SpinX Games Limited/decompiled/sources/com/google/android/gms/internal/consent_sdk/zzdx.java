package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzdx extends com.google.android.gms.internal.consent_sdk.zzeb {
    private final java.lang.Object zza;
    private boolean zzb;

    zzdx(java.lang.Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.zzb) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}
