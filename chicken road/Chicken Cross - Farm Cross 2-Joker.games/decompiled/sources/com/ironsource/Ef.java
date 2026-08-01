package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ef {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Runnable b(T t, final Function1<? super T, Unit> function1) {
        final WeakReference weakReference = new WeakReference(t);
        return new Runnable() { // from class: com.ironsource.Ef$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ef.a(weakReference, function1);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(WeakReference weakRef, Function1 block) {
        Intrinsics.checkNotNullParameter(weakRef, "$weakRef");
        Intrinsics.checkNotNullParameter(block, "$block");
        Object obj = weakRef.get();
        if (obj != null) {
            block.invoke(obj);
        }
    }
}
