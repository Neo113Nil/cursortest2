package io.flutter.plugin.platform;

import A1.RunnableC0015e;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f14152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O1.k f14153b;

    public e(O1.k kVar, View view) {
        this.f14153b = kVar;
        this.f14152a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i7) {
        this.f14152a.post(new RunnableC0015e(this, i7, 2));
    }
}
