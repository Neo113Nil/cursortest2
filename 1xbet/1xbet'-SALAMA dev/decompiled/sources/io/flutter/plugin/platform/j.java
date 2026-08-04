package io.flutter.plugin.platform;

import R5.M;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14154a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f14155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f14156c;

    public j(View.OnFocusChangeListener onFocusChangeListener, p153v5.a aVar) {
        this.f14155b = onFocusChangeListener;
        this.f14156c = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f14154a) {
            case 0:
                M m7 = new M(8);
                k kVar = (k) this.f14156c;
                this.f14155b.onFocusChange(kVar, Y4.D.c0(kVar, m7));
                break;
            default:
                p153v5.a aVar = (p153v5.a) this.f14156c;
                this.f14155b.onFocusChange(aVar, Y4.D.c0(aVar, new M(8)));
                break;
        }
    }

    public j(k kVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f14156c = kVar;
        this.f14155b = onFocusChangeListener;
    }
}
