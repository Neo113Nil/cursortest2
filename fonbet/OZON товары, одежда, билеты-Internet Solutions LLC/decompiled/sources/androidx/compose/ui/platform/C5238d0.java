package androidx.compose.ui.platform;

import android.content.Context;

/* renamed from: androidx.compose.ui.platform.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5238d0 implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f40836a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacks2C5244f0 f40837b;

    public C5238d0(Context context, ComponentCallbacks2C5244f0 componentCallbacks2C5244f0) {
        this.f40836a = context;
        this.f40837b = componentCallbacks2C5244f0;
    }

    @Override // S0.M
    public final void dispose() {
        this.f40836a.getApplicationContext().unregisterComponentCallbacks(this.f40837b);
    }
}
