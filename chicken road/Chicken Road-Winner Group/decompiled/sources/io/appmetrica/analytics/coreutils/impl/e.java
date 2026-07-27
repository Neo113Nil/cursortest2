package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5394c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, int i3) {
        super(0);
        this.f5392a = context;
        this.f5393b = str;
        this.f5394c = i3;
    }

    @Override // o2.a
    public final Object invoke() {
        return this.f5392a.getPackageManager().getPackageInfo(this.f5393b, this.f5394c);
    }
}
