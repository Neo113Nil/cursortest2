package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class Hi {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f6035a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6036b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6037c;

    public Hi(Context context, String str, String str2) {
        this.f6035a = context;
        this.f6036b = str;
        this.f6037c = str2;
    }

    public final Object a() {
        int identifier = this.f6035a.getResources().getIdentifier(this.f6036b, this.f6037c, this.f6035a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract Object a(int i3);
}
