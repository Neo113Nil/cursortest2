package io.flutter.plugin.platform;

import A1.RunnableC0015e;
import android.view.View;

/* loaded from: classes2.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f14146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O1.k f14147b;

    public e(O1.k kVar, View view) {
        this.f14147b = kVar;
        this.f14146a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i7) {
        this.f14146a.post(new RunnableC0015e(this, i7, 2));
    }
}
