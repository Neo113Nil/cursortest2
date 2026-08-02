package com.datadog.android.rum.resource;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroid/content/Context;", "", "fileName", "", "accessMode", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Ljava/io/InputStream;", "getAssetAsRumResource", "(Landroid/content/Context;Ljava/lang/String;ILcom/datadog/android/api/SdkCore;)Ljava/io/InputStream;", "id", "getRawResAsRumResource", "(Landroid/content/Context;ILcom/datadog/android/api/SdkCore;)Ljava/io/InputStream;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContextExtKt {
    public static /* synthetic */ java.io.InputStream getAssetAsRumResource$default(android.content.Context context, java.lang.String str, int i, com.datadog.android.api.SdkCore sdkCore, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        if ((i2 & 4) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        return getAssetAsRumResource(context, str, i, sdkCore);
    }

    public static final java.io.InputStream getAssetAsRumResource(android.content.Context context, java.lang.String str, int i, com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        java.io.InputStream open = context.getAssets().open(str, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
        return new com.datadog.android.rum.resource.RumResourceInputStream(open, "assets://".concat(java.lang.String.valueOf(str)), sdkCore);
    }

    public static /* synthetic */ java.io.InputStream getRawResAsRumResource$default(android.content.Context context, int i, com.datadog.android.api.SdkCore sdkCore, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        return getRawResAsRumResource(context, i, sdkCore);
    }

    public static final java.io.InputStream getRawResAsRumResource(android.content.Context context, int i, com.datadog.android.api.SdkCore sdkCore) {
        java.lang.String concat;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        try {
            concat = context.getResources().getResourceName(i);
        } catch (android.content.res.Resources.NotFoundException unused) {
            concat = "res/0x".concat(java.lang.String.valueOf(com.datadog.android.internal.utils.NumberExtKt.toHexString(i)));
        }
        java.io.InputStream openRawResource = context.getResources().openRawResource(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openRawResource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(concat, "");
        return new com.datadog.android.rum.resource.RumResourceInputStream(openRawResource, concat, sdkCore);
    }
}
