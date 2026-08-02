package com.plaid.internal;

/* loaded from: classes16.dex */
public final class Q {
    public static final java.lang.String a(android.app.Application application) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        java.lang.String format = java.lang.String.format("intent://redirect/#Intent;scheme=plaid;package=%s;end;", java.util.Arrays.copyOf(new java.lang.Object[]{application.getApplicationContext().getPackageName()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
