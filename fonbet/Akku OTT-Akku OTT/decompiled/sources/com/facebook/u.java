package com.facebook;

import android.content.Context;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = w.j;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context = null;
        }
        return context.getCacheDir();
    }
}
