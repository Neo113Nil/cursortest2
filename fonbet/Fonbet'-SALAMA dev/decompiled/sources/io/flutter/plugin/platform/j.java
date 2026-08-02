package io.flutter.plugin.platform;

import R5.M;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import v5.C1667a;

/* loaded from: classes2.dex */
public final class j implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14148a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f14149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f14150c;

    public j(View.OnFocusChangeListener onFocusChangeListener, C1667a c1667a) {
        this.f14149b = onFocusChangeListener;
        this.f14150c = c1667a;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f14148a) {
            case 0:
                M m7 = new M(8);
                k kVar = (k) this.f14150c;
                this.f14149b.onFocusChange(kVar, Y4.D.c0(kVar, m7));
                break;
            default:
                C1667a c1667a = (C1667a) this.f14150c;
                this.f14149b.onFocusChange(c1667a, Y4.D.c0(c1667a, new M(8)));
                break;
        }
    }

    public j(k kVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f14150c = kVar;
        this.f14149b = onFocusChangeListener;
    }
}
