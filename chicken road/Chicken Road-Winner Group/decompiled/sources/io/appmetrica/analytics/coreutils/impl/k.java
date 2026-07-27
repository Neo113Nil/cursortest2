package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import d2.C0279i;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f5409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5410c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i3, int i4) {
        super(0);
        this.f5408a = context;
        this.f5409b = componentName;
        this.f5410c = i3;
        this.f5411d = i4;
    }

    @Override // o2.a
    public final Object invoke() {
        this.f5408a.getPackageManager().setComponentEnabledSetting(this.f5409b, this.f5410c, this.f5411d);
        return C0279i.f4852a;
    }
}
