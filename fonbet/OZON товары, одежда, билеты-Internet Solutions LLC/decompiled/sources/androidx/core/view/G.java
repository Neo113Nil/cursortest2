package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class G implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f42228a;

    /* renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f42229b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f42230c;

    private G(View view, Runnable runnable) {
        this.f42228a = view;
        this.f42229b = view.getViewTreeObserver();
        this.f42230c = runnable;
    }

    @NonNull
    public static G a(@NonNull View view, @NonNull Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        G g10 = new G(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(g10);
        view.addOnAttachStateChangeListener(g10);
        return g10;
    }

    public final void b() {
        boolean isAlive = this.f42229b.isAlive();
        View view = this.f42228a;
        if (isAlive) {
            this.f42229b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        b();
        this.f42230c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NonNull View view) {
        this.f42229b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NonNull View view) {
        b();
    }
}
