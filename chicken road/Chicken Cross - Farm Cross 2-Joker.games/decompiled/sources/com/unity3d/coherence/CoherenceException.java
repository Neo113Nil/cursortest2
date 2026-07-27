package com.unity3d.coherence;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public final class CoherenceException extends Exception {
    public static final int ERR_INTERNAL = 6;
    public static final int ERR_INVALID_ARG = 5;
    public static final int ERR_INVALID_BUNDLE = 1;
    public static final int ERR_INVALID_HANDLE = 3;
    public static final int ERR_LOAD = 2;
    public static final int ERR_TRAP = 4;
    public static final int OK = 0;
    private final int status;

    @Retention(RetentionPolicy.SOURCE)
    public @interface VmStatus {
    }

    public CoherenceException(int i, String str) {
        super(str);
        this.status = i;
    }

    public int getStatus() {
        return this.status;
    }
}
