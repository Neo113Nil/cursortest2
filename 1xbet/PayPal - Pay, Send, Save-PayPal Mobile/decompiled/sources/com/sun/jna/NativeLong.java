package com.sun.jna;

/* loaded from: classes16.dex */
public class NativeLong extends com.sun.jna.IntegerType {
    public static final int SIZE = com.sun.jna.Native.LONG_SIZE;
    private static final long serialVersionUID = 1;

    public NativeLong() {
        this(0L);
    }

    public NativeLong(long j) {
        this(j, false);
    }

    public NativeLong(long j, boolean z) {
        super(SIZE, j, z);
    }
}
