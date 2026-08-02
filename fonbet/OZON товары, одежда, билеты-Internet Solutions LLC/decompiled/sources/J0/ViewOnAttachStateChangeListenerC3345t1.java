package J0;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.t1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class ViewOnAttachStateChangeListenerC3345t1 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f13407a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f13408b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13409c;

    public ViewOnAttachStateChangeListenerC3345t1(@NotNull View view, @NotNull Function0<Unit> function0) {
        this.f13407a = view;
        this.f13408b = function0;
        view.addOnAttachStateChangeListener(this);
        if (this.f13409c || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f13409c = true;
    }

    public final void a() {
        boolean z11 = this.f13409c;
        View view = this.f13407a;
        if (z11) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f13409c = false;
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f13408b.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
        if (this.f13409c) {
            return;
        }
        View view2 = this.f13407a;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f13409c = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View view) {
        if (this.f13409c) {
            this.f13407a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f13409c = false;
        }
    }
}
