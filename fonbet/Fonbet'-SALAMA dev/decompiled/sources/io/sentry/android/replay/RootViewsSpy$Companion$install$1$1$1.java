package io.sentry.android.replay;

import android.view.View;
import io.sentry.ISentryLifecycleToken;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class RootViewsSpy$Companion$install$1$1$1 extends i implements Function1 {
    final /* synthetic */ RootViewsSpy $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootViewsSpy$Companion$install$1$1$1(RootViewsSpy rootViewsSpy) {
        super(1);
        this.$this_apply = rootViewsSpy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ArrayList<View> invoke(ArrayList<View> arrayList) {
        AutoClosableReentrantLock autoClosableReentrantLock;
        ArrayList<View> arrayList2;
        h.e(arrayList, "mViews");
        autoClosableReentrantLock = this.$this_apply.viewListLock;
        ISentryLifecycleToken acquire = autoClosableReentrantLock.acquire();
        try {
            arrayList2 = this.$this_apply.delegatingViewList;
            arrayList2.addAll(arrayList);
            q6.a.a(acquire, null);
            return arrayList2;
        } finally {
        }
    }
}
