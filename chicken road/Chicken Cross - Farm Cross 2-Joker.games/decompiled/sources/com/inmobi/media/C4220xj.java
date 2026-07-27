package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4220xj implements C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ej f7481a;

    public C4220xj(Ej ej) {
        this.f7481a = ej;
    }

    public final void a() {
        Y9 y9 = this.f7481a.i;
        if (y9 != null) {
            String str = Ej.j1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((Z9) y9).a(str, "onAdScreenDisplayFailed");
        }
        this.f7481a.getListener().c();
    }

    public final void b() {
        Y9 y9 = this.f7481a.i;
        if (y9 != null) {
            String str = Ej.j1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((Z9) y9).a(str, "onAdScreenDisplayed");
        }
        Ej ej = this.f7481a;
        if (ej.b == 0) {
            ej.R = false;
        }
        ej.getListener().f(this.f7481a);
    }
}
