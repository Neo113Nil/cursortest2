package com.fyber.inneractive.sdk.player.cache;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f3874a = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME);

    static {
        java.nio.charset.Charset.forName("UTF-8");
    }

    public static void a(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new java.io.IOException("not a readable directory: " + file);
        }
        for (java.io.File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new java.io.IOException("failed to delete file: " + file2);
            }
        }
    }
}
