package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import f4.v;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f6229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6230c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i2, int i3) {
        super(0);
        this.f6228a = context;
        this.f6229b = componentName;
        this.f6230c = i2;
        this.f6231d = i3;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        this.f6228a.getPackageManager().setComponentEnabledSetting(this.f6229b, this.f6230c, this.f6231d);
        return v.f5689a;
    }
}
