package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f6226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Intent intent, int i2) {
        super(0);
        this.f6225a = context;
        this.f6226b = intent;
        this.f6227c = i2;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        return this.f6225a.getPackageManager().resolveService(this.f6226b, this.f6227c);
    }
}
