package com.payair.csdk;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class w1 {
    public static void a(com.payair.hce.ErrorModel errorModel, com.payair.hce.ErrorModel errorModel2, java.util.ArrayList arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(errorModel);
        arrayList.add(com.payair.logic.implementation.HceSDKinterfaceKt.toNetworkError(errorModel2));
    }
}
