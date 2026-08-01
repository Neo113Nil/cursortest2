package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.view.ViewTreeObserver;

/* loaded from: classes4.dex */
public final class k0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5954a;
    public final /* synthetic */ n0 b;

    public k0(n0 n0Var, Context context) {
        this.b = n0Var;
        this.f5954a = context;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.b.b(this.f5954a);
        return true;
    }
}
