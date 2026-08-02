package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0006\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/meta/AppInfo$Companion;", "Landroid/content/Context;", "context", "", "deviceId", "Lcom/zettle/sdk/meta/AppInfo;", "create", "(Lcom/zettle/sdk/meta/AppInfo$Companion;Landroid/content/Context;Ljava/lang/String;)Lcom/zettle/sdk/meta/AppInfo;", "Lcom/zettle/sdk/meta/PlatformInfo;", "info", "(Lcom/zettle/sdk/meta/AppInfo$Companion;Landroid/content/Context;Ljava/lang/String;Lcom/zettle/sdk/meta/PlatformInfo;)Lcom/zettle/sdk/meta/AppInfo;", "Lkotlin/text/Regex;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/text/Regex;", "Camera2StreamConfigurationMap"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AppInfoKt {
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("[^A-Za-z0-9 .\\-_]+");

    public static final com.zettle.sdk.meta.AppInfo create(com.zettle.sdk.meta.AppInfo.Companion companion, android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.zettle.sdk.meta.AppInfoImpl(context, str, com.zettle.sdk.meta.Platform.INSTANCE.getInfo());
    }

    public static final com.zettle.sdk.meta.AppInfo create(com.zettle.sdk.meta.AppInfo.Companion companion, android.content.Context context, java.lang.String str, com.zettle.sdk.meta.PlatformInfo platformInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformInfo, "");
        return new com.zettle.sdk.meta.AppInfoImpl(context, str, platformInfo);
    }
}
