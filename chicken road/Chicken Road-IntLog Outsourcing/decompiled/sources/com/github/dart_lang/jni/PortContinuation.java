package com.github.dart_lang.jni;

import D4.E;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public class PortContinuation<T> implements InterfaceC1218d {
    private final long port;

    static {
        System.loadLibrary("dartjni");
    }

    public PortContinuation(long j2) {
        this.port = j2;
    }

    private native void _resumeWith(long j2, Object obj);

    @Override // k4.InterfaceC1218d
    public InterfaceC1223i getContext() {
        return E.f461c;
    }

    @Override // k4.InterfaceC1218d
    public void resumeWith(Object obj) {
        _resumeWith(this.port, obj);
    }
}
