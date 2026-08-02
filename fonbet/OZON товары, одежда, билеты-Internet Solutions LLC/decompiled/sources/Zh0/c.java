package Zh0;

import ai0.f;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    static final class a extends AbstractC7737t implements Function1<View, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f35972b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(1);
            this.f35972b = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View decorView = view;
            Intrinsics.checkNotNullParameter(decorView, "decorView");
            b action = new b(decorView, this.f35972b);
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            Intrinsics.checkNotNullParameter(action, "action");
            if (decorView.getViewTreeObserver().isAlive()) {
                if (decorView.isAttachedToWindow()) {
                    decorView.getViewTreeObserver().addOnDrawListener(new ai0.e(decorView, action));
                } else {
                    decorView.addOnAttachStateChangeListener(new d(decorView, decorView, action));
                }
            }
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull Activity activity, @NotNull Function0<Unit> action) {
        f fVar;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        a action2 = new a(action);
        Intrinsics.checkNotNullParameter(window, "<this>");
        Intrinsics.checkNotNullParameter(action2, "action");
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            action2.invoke(peekDecorView);
            return;
        }
        e eVar = new e(action2, window);
        Window.Callback callback = window.getCallback();
        if (callback instanceof f) {
            fVar = (f) callback;
        } else {
            Intrinsics.f(callback);
            f fVar2 = new f(callback);
            window.setCallback(fVar2);
            fVar = fVar2;
        }
        fVar.a(eVar);
    }
}
