package com.ironsource;

/* renamed from: com.ironsource.fg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4414fg {
    static /* synthetic */ void a(InterfaceC4414fg interfaceC4414fg, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        interfaceC4414fg.a(runnable, j);
    }

    void a(Runnable runnable);

    void a(Runnable runnable, long j);
}
