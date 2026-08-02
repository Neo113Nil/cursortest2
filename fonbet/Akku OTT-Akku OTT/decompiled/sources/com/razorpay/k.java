package com.razorpay;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread l$1_I$l$;
        l$1_I$l$ = Lumberjack.l$1_I$l$(runnable);
        return l$1_I$l$;
    }
}
