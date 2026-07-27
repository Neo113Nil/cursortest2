package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5387c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, int i3) {
        super(0);
        this.f5385a = context;
        this.f5386b = str;
        this.f5387c = i3;
    }

    @Override // o2.a
    public final Object invoke() {
        return this.f5385a.getPackageManager().getApplicationInfo(this.f5386b, this.f5387c);
    }
}
