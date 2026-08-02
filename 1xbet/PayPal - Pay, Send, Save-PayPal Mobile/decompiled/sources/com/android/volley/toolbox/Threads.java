package com.android.volley.toolbox;

/* loaded from: classes7.dex */
final class Threads {
    private Threads() {
    }

    static void getHighSpeedVideoFpsRangesFor() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("Must be invoked from the main thread.");
        }
    }
}
