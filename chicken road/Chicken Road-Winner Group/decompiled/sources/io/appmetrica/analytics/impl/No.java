package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes.dex */
public final /* synthetic */ class No implements R1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T1 f6343b;

    public /* synthetic */ No(T1 t1, int i3) {
        this.f6342a = i3;
        this.f6343b = t1;
    }

    @Override // io.appmetrica.analytics.impl.R1
    public final boolean a(Intent intent) {
        switch (this.f6342a) {
            case 0:
                return T1.b(this.f6343b, intent);
            case 1:
                return T1.c(this.f6343b, intent);
            default:
                return T1.a(this.f6343b, intent);
        }
    }
}
