package androidx.compose.ui.platform;

import android.content.Context;

/* renamed from: androidx.compose.ui.platform.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5229a0 implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f40806a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacks2C5235c0 f40807b;

    public C5229a0(Context context, ComponentCallbacks2C5235c0 componentCallbacks2C5235c0) {
        this.f40806a = context;
        this.f40807b = componentCallbacks2C5235c0;
    }

    @Override // S0.M
    public final void dispose() {
        this.f40806a.getApplicationContext().unregisterComponentCallbacks(this.f40807b);
    }
}
