package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcfi {
    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.places.internal.zzcfj zza(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.google.android.libraries.places.internal.zzcfj zzcfjVar = new com.google.android.libraries.places.internal.zzcfj(com.google.android.libraries.places.internal.zzcfy.zzb(str));
        zzcfjVar.zzd(str);
        return zzcfjVar;
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.places.internal.zzcfj zzb(byte... bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return new com.google.android.libraries.places.internal.zzcfj(copyOf);
    }
}
