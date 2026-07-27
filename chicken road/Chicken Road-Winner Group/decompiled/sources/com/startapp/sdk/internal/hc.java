package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hc implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3831a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3832b;

    public hc(Context context, String str) {
        this.f3831a = context;
        this.f3832b = str;
    }

    @Override // com.startapp.sdk.internal.i2
    public final void a(Bitmap bitmap, int i3) {
        if (bitmap != null) {
            Context context = this.f3831a;
            String str = this.f3832b;
            ConcurrentHashMap concurrentHashMap = f2.f3671a;
            ((Executor) com.startapp.sdk.components.a.a(context).f3337C.a()).execute(new e2(str, bitmap, context));
        }
    }
}
