package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "", "isDebugBuild", "(Landroid/content/Context;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UprEnvironmentConfigKt {
    public static final boolean isDebugBuild(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
