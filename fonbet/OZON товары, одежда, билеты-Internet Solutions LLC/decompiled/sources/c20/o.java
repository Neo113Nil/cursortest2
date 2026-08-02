package c20;

import android.view.View;
import c20.m;
import d20.AbstractC6065b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f56419a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m.b.d f56420b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC6065b f56421c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.composer.ui.widget.l f56422d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f56423e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f56424f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f56425g;

    public o(View view, m.b.d dVar, AbstractC6065b abstractC6065b, ru.ozon.composer.ui.widget.l lVar, long j11, long j12, long j13) {
        this.f56419a = view;
        this.f56420b = dVar;
        this.f56421c = abstractC6065b;
        this.f56422d = lVar;
        this.f56423e = j11;
        this.f56424f = j12;
        this.f56425g = j13;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
        this.f56419a.removeOnAttachStateChangeListener(this);
        long nanoTime = System.nanoTime();
        view.addOnLayoutChangeListener(new q(this.f56420b, this.f56421c, this.f56422d, this.f56423e, this.f56424f, this.f56425g, nanoTime));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View view) {
    }
}
