package com.ironsource;

/* renamed from: com.ironsource.cg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2995cg {

    /* renamed from: com.ironsource.cg$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void a(com.ironsource.InterfaceC2995cg interfaceC2995cg, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
            }
            if ((i & 2) != 0) {
                j = 0;
            }
            interfaceC2995cg.a(runnable, j);
        }
    }

    void a(java.lang.Runnable runnable);

    void a(java.lang.Runnable runnable, long j);
}
