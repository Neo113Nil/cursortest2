package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, int i2) {
        super(0);
        this.f6205a = context;
        this.f6206b = str;
        this.f6207c = i2;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        return this.f6205a.getPackageManager().getApplicationInfo(this.f6206b, this.f6207c);
    }
}
