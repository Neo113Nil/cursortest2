package org.betup.ui.common.compose;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposeLayoutIdle.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0000¨\u0006\u0005"}, d2 = {"postWhenComposeLayoutIdle", "", "Landroid/view/View;", "block", "Lkotlin/Function0;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposeLayoutIdleKt {
    public static final void postWhenComposeLayoutIdle(final View view, final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        view.post(new Runnable() { // from class: org.betup.ui.common.compose.ComposeLayoutIdleKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ComposeLayoutIdleKt.postWhenComposeLayoutIdle$lambda$1(view, block);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postWhenComposeLayoutIdle$lambda$1(final View view, final Function0 function0) {
        view.post(new Runnable() { // from class: org.betup.ui.common.compose.ComposeLayoutIdleKt$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ComposeLayoutIdleKt.postWhenComposeLayoutIdle$lambda$1$lambda$0(view, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postWhenComposeLayoutIdle$lambda$1$lambda$0(View view, Function0 function0) {
        if (view.isAttachedToWindow()) {
            function0.invoke();
        }
    }
}
