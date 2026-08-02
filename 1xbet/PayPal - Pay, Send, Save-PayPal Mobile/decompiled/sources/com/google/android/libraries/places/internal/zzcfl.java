package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcfl {
    public static final com.google.android.libraries.places.internal.zzcfh zzc(com.google.android.libraries.places.internal.zzcfv zzcfvVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfvVar, "");
        return new com.google.android.libraries.places.internal.zzcfp(zzcfvVar);
    }

    public static final com.google.android.libraries.places.internal.zzcfg zzd(com.google.android.libraries.places.internal.zzcft zzcftVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcftVar, "");
        return new com.google.android.libraries.places.internal.zzcfo(zzcftVar);
    }

    public static final com.google.android.libraries.places.internal.zzcft zza(java.net.Socket socket) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        com.google.android.libraries.places.internal.zzcfu zzcfuVar = new com.google.android.libraries.places.internal.zzcfu(socket);
        java.io.OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputStream, "");
        com.google.android.libraries.places.internal.zzcfn zzcfnVar = new com.google.android.libraries.places.internal.zzcfn(outputStream, zzcfuVar);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfnVar, "");
        return new com.google.android.libraries.places.internal.zzcfc(zzcfuVar, zzcfnVar);
    }

    public static final com.google.android.libraries.places.internal.zzcfv zzb(java.net.Socket socket) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        com.google.android.libraries.places.internal.zzcfu zzcfuVar = new com.google.android.libraries.places.internal.zzcfu(socket);
        java.io.InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputStream, "");
        com.google.android.libraries.places.internal.zzcfk zzcfkVar = new com.google.android.libraries.places.internal.zzcfk(inputStream, zzcfuVar);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfkVar, "");
        return new com.google.android.libraries.places.internal.zzcfd(zzcfuVar, zzcfkVar);
    }
}
