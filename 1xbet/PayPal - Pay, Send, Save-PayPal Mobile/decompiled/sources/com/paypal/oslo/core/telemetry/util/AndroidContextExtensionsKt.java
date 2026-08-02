package com.paypal.oslo.core.telemetry.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\u0004*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006"}, d2 = {"Landroid/content/Context;", "", "getBuildType", "(Landroid/content/Context;)Ljava/lang/String;", "", "isRunningFromTestProcess", "(Landroid/content/Context;)Z", "isDebugBuildType"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AndroidContextExtensionsKt {
    public static final java.lang.String getBuildType(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(context.getApplicationContext(), com.paypal.oslo.core.di.entrypoints.ApplicationBuildTypeEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return ((com.paypal.oslo.core.di.entrypoints.ApplicationBuildTypeEntryPoint) obj).getApplicationBuildType();
    }

    public static final boolean isDebugBuildType(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return kotlin.text.StringsKt.equals(getBuildType(context), com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, true);
    }

    public static final boolean isRunningFromTestProcess(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return false;
    }
}
