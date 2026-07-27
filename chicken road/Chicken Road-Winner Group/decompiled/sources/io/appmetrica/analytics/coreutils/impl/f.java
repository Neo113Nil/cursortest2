package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f5396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, ComponentName componentName, int i3) {
        super(0);
        this.f5395a = context;
        this.f5396b = componentName;
        this.f5397c = i3;
    }

    @Override // o2.a
    public final Object invoke() {
        return this.f5395a.getPackageManager().getServiceInfo(this.f5396b, this.f5397c);
    }
}
