package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3889a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3890b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3891c;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f3892d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3893e;

    public j2(Context context, String str, i2 i2Var, int i3) {
        this.f3889a = context;
        this.f3891c = str;
        this.f3892d = i2Var;
        this.f3893e = i3;
    }

    public final void a() {
        ((Executor) com.startapp.sdk.components.a.a(this.f3889a).f3336B.a()).execute(new h2(this));
    }
}
