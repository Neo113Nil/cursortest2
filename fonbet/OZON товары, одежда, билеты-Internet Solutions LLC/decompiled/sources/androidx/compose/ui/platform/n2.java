package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n2 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f40948a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ S0.L0 f40949b;

    n2(View view, S0.L0 l02) {
        this.f40948a = view;
        this.f40949b = l02;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View view) {
        this.f40948a.removeOnAttachStateChangeListener(this);
        this.f40949b.T();
    }
}
