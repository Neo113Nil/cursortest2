package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class q implements com.iovation.mobile.android.a.h {
    public static java.lang.String d(android.content.Context context) {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getAbsolutePath());
        long blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        java.io.File externalFilesDir = context.getExternalFilesDir(null);
        android.os.StatFs statFs2 = new android.os.StatFs(externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null);
        long blockCountLong2 = statFs2.getBlockCountLong() * statFs2.getBlockSizeLong();
        java.io.File externalFilesDir2 = context.getExternalFilesDir(null);
        java.lang.String absolutePath = externalFilesDir2 != null ? externalFilesDir2.getAbsolutePath() : null;
        if (blockCountLong != blockCountLong2) {
            if (absolutePath == null || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) absolutePath, (java.lang.CharSequence) "/mnt/sdcard", false, 2, (java.lang.Object) null)) {
                blockCountLong += blockCountLong2;
            }
        } else if (blockCountLong != blockCountLong2) {
            blockCountLong = 0;
        }
        return java.lang.String.valueOf(blockCountLong / com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES);
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        try {
            linkedHashMap.put("FSSZ", d(context));
            return linkedHashMap;
        } catch (java.lang.IllegalArgumentException unused) {
            linkedHashMap.put("FSERR", "1");
            return linkedHashMap;
        }
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "e96108";
    }
}
