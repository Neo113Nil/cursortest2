package com.github.dart_lang.jni;

import D6.M;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;

/* loaded from: classes.dex */
public class PortContinuation<T> implements InterfaceC1287d {
    private final long port;

    static {
        System.loadLibrary("dartjni");
    }

    public PortContinuation(long j) {
        this.port = j;
    }

    private native void _resumeWith(long j, Object obj);

    @Override // i6.InterfaceC1287d
    public InterfaceC1292i getContext() {
        return M.f1797b;
    }

    @Override // i6.InterfaceC1287d
    public void resumeWith(Object obj) {
        _resumeWith(this.port, obj);
    }
}
