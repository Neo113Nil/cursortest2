package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
final class zzw {
    private final java.lang.String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* synthetic */ zzw(java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, byte[] bArr) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z4;
    }

    final boolean zza() {
        return this.zzc;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    final com.google.android.gms.common.zzp zzb(android.content.Context context) {
        return new com.google.android.gms.common.zzp(this.zza, this.zzb, false, com.google.android.gms.dynamic.ObjectWrapper.wrap(context), false, true, false);
    }
}
