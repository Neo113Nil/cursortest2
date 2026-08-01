package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f12193a = new Handler(Looper.getMainLooper());

    public static boolean a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }

    public static final void b(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static void a(final Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (a()) {
            block.invoke();
        } else {
            f12193a.post(new Runnable() { // from class: com.vungle.ads.internal.util.y$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    y.b(Function0.this);
                }
            });
        }
    }
}
