package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f5401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Intent intent, int i3) {
        super(0);
        this.f5400a = context;
        this.f5401b = intent;
        this.f5402c = i3;
    }

    @Override // o2.a
    public final Object invoke() {
        return this.f5400a.getPackageManager().resolveActivity(this.f5401b, this.f5402c);
    }
}
