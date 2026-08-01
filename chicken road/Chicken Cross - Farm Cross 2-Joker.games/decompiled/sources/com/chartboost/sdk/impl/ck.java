package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class ck {

    /* renamed from: a, reason: collision with root package name */
    public static final ck f4716a = new ck();

    public final bk a(Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        ql qlVar = ql.f4988a;
        String d = qlVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.y);
        List e = qlVar.e(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.z);
        if (d == null && e.isEmpty()) {
            return null;
        }
        return new bk(d, e);
    }
}
