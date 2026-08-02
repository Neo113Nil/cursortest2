package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcfy {
    public static final java.lang.String zza(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return new java.lang.String(bArr, kotlin.text.Charsets.UTF_8);
    }

    public static final byte[] zzb(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }
}
