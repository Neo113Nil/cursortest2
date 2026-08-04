package io.sentry.android.replay;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowRecorder$onRootViewsChanged$1$1 extends i implements Function1 {
    final /* synthetic */ View $root;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecorder$onRootViewsChanged$1$1(View view) {
        super(1);
        this.$root = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(WeakReference<View> weakReference) {
        h.e(weakReference, "it");
        return Boolean.valueOf(h.a(weakReference.get(), this.$root));
    }
}
