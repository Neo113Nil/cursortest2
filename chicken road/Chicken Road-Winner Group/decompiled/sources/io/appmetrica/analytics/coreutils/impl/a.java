package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f5383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ComponentName componentName, int i3) {
        super(0);
        this.f5382a = context;
        this.f5383b = componentName;
        this.f5384c = i3;
    }

    @Override // o2.a
    public final Object invoke() {
        return this.f5382a.getPackageManager().getActivityInfo(this.f5383b, this.f5384c);
    }
}
