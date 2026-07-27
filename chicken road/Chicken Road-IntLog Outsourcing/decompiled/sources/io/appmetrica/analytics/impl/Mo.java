package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes.dex */
public final /* synthetic */ class Mo implements R1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T1 f7163b;

    public /* synthetic */ Mo(T1 t1, int i2) {
        this.f7162a = i2;
        this.f7163b = t1;
    }

    @Override // io.appmetrica.analytics.impl.R1
    public final boolean a(Intent intent) {
        switch (this.f7162a) {
            case 0:
                return T1.b(this.f7163b, intent);
            case 1:
                return T1.c(this.f7163b, intent);
            default:
                return T1.a(this.f7163b, intent);
        }
    }
}
