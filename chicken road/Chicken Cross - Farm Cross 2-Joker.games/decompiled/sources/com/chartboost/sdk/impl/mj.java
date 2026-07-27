package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mj implements si {

    /* renamed from: a, reason: collision with root package name */
    public final ob f4882a;

    public mj(ob macroContext) {
        Intrinsics.checkNotNullParameter(macroContext, "macroContext");
        this.f4882a = macroContext;
    }

    @Override // com.chartboost.sdk.impl.si
    public String a(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return rb.a(uri, this.f4882a);
    }
}
