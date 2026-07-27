package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f5406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Intent intent, int i3) {
        super(0);
        this.f5405a = context;
        this.f5406b = intent;
        this.f5407c = i3;
    }

    @Override // o2.a
    public final Object invoke() {
        return this.f5405a.getPackageManager().resolveService(this.f5406b, this.f5407c);
    }
}
