package com.inmobi.media;

/* renamed from: com.inmobi.media.bc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2299bc {
    public static final boolean a(java.lang.String tag, java.lang.String data, java.lang.String filePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "filePath");
        try {
            a(filePath);
            java.io.File file = new java.io.File(filePath);
            file.createNewFile();
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            byte[] bytes = data.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            return true;
        } catch (java.io.IOException | java.lang.RuntimeException unused) {
            return false;
        }
    }

    public static final java.lang.String b(java.lang.String filePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "filePath");
        java.io.File file = new java.io.File(filePath);
        if (file.exists() && file.isFile()) {
            try {
                return kotlin.io.FilesKt.readText$default(file, null, 1, null);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static final void a(java.lang.String filePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "filePath");
        java.io.File file = new java.io.File(filePath);
        if (file.exists() && file.delete()) {
            file.getName();
        }
    }
}
