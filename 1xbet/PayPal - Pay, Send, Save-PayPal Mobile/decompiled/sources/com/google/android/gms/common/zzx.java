package com.google.android.gms.common;

/* loaded from: classes8.dex */
final class zzx extends com.google.android.gms.common.zzy {
    private final java.util.concurrent.Callable zze;

    /* synthetic */ zzx(java.util.concurrent.Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.zze = callable;
    }

    @Override // com.google.android.gms.common.zzy
    final java.lang.String zza() {
        try {
            return (java.lang.String) this.zze.call();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
