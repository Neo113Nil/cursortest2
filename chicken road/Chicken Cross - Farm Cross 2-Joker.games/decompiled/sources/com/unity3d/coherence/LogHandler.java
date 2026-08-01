package com.unity3d.coherence;

/* loaded from: classes7.dex */
interface LogHandler {
    public static final int LEVEL_DEBUG = 0;
    public static final int LEVEL_ERROR = 3;
    public static final int LEVEL_INFO = 1;
    public static final int LEVEL_WARN = 2;

    void onLog(int i, String str);
}
