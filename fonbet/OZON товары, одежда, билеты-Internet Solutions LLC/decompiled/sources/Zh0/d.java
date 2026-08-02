package Zh0;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f35973a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f35974b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0 f35975c;

    public d(View view, View view2, Function0 function0) {
        this.f35973a = view;
        this.f35974b = view2;
        this.f35975c = function0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f35973a.removeOnAttachStateChangeListener(this);
        View view2 = this.f35974b;
        view2.getViewTreeObserver().addOnDrawListener(new ai0.e(view2, this.f35975c));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
