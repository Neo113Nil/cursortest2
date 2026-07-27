package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f4949a = new p();

    public final Object a(Element element, pj context) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        ql qlVar = ql.f4988a;
        String a2 = qlVar.a(element, "id");
        Element b = qlVar.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e);
        Element b2 = qlVar.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f);
        if (b != null) {
            Object a3 = ma.f4874a.a(b, context);
            if (!Result.m8086isSuccessimpl(a3)) {
                return Result.m8079constructorimpl(a3);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(new c.a(a2, (la) a3));
        }
        if (b2 == null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(new ab("Ad element must contain InLine or Wrapper", 101)));
        }
        Object a4 = ol.f4948a.a(b2, context);
        if (!Result.m8086isSuccessimpl(a4)) {
            return Result.m8079constructorimpl(a4);
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m8079constructorimpl(new c.b(a2, (nl) a4));
    }
}
