package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class ExoPlayerLibraryInfo {
    public static final boolean ASSERTIONS_ENABLED = true;
    public static final java.lang.String TAG = "ExoPlayerLib";
    public static final boolean TRACE_ENABLED = true;
    public static final java.lang.String VERSION = "2.18.2";
    public static final int VERSION_INT = 2018002;
    public static final java.lang.String VERSION_SLASHY = "ExoPlayerLib/2.18.2";
    private static final java.util.HashSet<java.lang.String> registeredModules = new java.util.HashSet<>();
    private static java.lang.String registeredModulesString = "goog.exo.core";

    private ExoPlayerLibraryInfo() {
    }

    public static synchronized java.lang.String registeredModules() {
        java.lang.String str;
        synchronized (com.google.android.exoplayer2.ExoPlayerLibraryInfo.class) {
            str = registeredModulesString;
        }
        return str;
    }

    public static synchronized void registerModule(java.lang.String str) {
        synchronized (com.google.android.exoplayer2.ExoPlayerLibraryInfo.class) {
            if (registeredModules.add(str)) {
                registeredModulesString += ", " + str;
            }
        }
    }
}
