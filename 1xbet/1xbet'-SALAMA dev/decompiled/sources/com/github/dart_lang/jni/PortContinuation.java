package com.github.dart_lang.jni;

import D6.M;
import p065i6.d;
import p065i6.i;

/* JADX INFO: loaded from: classes.dex */
public class PortContinuation<T> implements d {
    private final long port;

    static {
        System.loadLibrary("dartjni");
    }

    public PortContinuation(long j) {
        this.port = j;
    }

    private native void _resumeWith(long j, Object obj);

    @Override // p065i6.d
    public i getContext() {
        return M.f1797b;
    }

    @Override // p065i6.d
    public void resumeWith(Object obj) {
        _resumeWith(this.port, obj);
    }
}
