package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str) {
        super(0);
        this.f5398a = context;
        this.f5399b = str;
    }

    @Override // o2.a
    public final Object invoke() {
        return Boolean.valueOf(this.f5398a.getPackageManager().hasSystemFeature(this.f5399b));
    }
}
