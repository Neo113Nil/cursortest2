package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzbw {
    public static java.lang.String zza(java.io.File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new java.lang.IllegalArgumentException("Non-apk found in splits directory.");
        }
        java.lang.String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        return (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) ? "" : replaceFirst.startsWith("base-") ? replaceFirst.replace("base-", "config.") : replaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }
}
