package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class y {
    public static final void a(ib ibVar, Function1 isSuccess, Function2 isError) {
        Intrinsics.checkNotNullParameter(ibVar, "<this>");
        Intrinsics.checkNotNullParameter(isSuccess, "isSuccess");
        Intrinsics.checkNotNullParameter(isError, "isError");
        if (ibVar.b() == null) {
            isSuccess.invoke(ibVar);
        } else {
            isError.invoke(ibVar, ibVar.b());
        }
    }
}
