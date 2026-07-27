package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public final yf f3453a;

    /* renamed from: b, reason: collision with root package name */
    public final yf f3454b;

    public ab(yf yfVar, yf yfVar2) {
        this.f3453a = yfVar;
        this.f3454b = yfVar2;
    }

    public final void a(de... deVarArr) {
        for (de deVar : deVarArr) {
            if (deVar.f3592d) {
                this.f3454b.a(deVar, deVar.f3593e.longValue());
            } else {
                this.f3453a.a(deVar, deVar.f3593e.longValue());
            }
        }
    }
}
