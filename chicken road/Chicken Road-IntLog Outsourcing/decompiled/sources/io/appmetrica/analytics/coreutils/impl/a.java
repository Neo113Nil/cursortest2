package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f6203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ComponentName componentName, int i2) {
        super(0);
        this.f6202a = context;
        this.f6203b = componentName;
        this.f6204c = i2;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        return this.f6202a.getPackageManager().getActivityInfo(this.f6203b, this.f6204c);
    }
}
