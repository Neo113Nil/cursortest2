package com.zettle.sdk.core.os;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/core/os/LocationInfoController;", "Lcom/zettle/sdk/core/os/LocationInfo;", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "stop", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface LocationInfoController extends com.zettle.sdk.core.os.LocationInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.os.LocationInfoController.Companion INSTANCE = com.zettle.sdk.core.os.LocationInfoController.Companion.Camera2StreamConfigurationMap;

    void start();

    void stop();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/core/os/LocationInfoController$Companion;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/zettle/sdk/core/os/LocationInfoController;", "<init>", "()V", "context", "invoke", "(Landroid/content/Context;)Lcom/zettle/sdk/core/os/LocationInfoController;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/core/os/LocationInfoController;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements kotlin.jvm.functions.Function1<android.content.Context, com.zettle.sdk.core.os.LocationInfoController> {
        static final /* synthetic */ com.zettle.sdk.core.os.LocationInfoController.Companion Camera2StreamConfigurationMap = new com.zettle.sdk.core.os.LocationInfoController.Companion();

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private static volatile com.zettle.sdk.core.os.LocationInfoController getHighSpeedVideoFpsRanges;

        private Companion() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final com.zettle.sdk.core.os.LocationInfoController invoke(android.content.Context context) {
            com.zettle.sdk.core.os.LocationInfoImpl locationInfoImpl;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            com.zettle.sdk.core.os.LocationInfoController locationInfoController = getHighSpeedVideoFpsRanges;
            if (locationInfoController != null) {
                return locationInfoController;
            }
            synchronized (this) {
                locationInfoImpl = getHighSpeedVideoFpsRanges;
                if (locationInfoImpl == null) {
                    android.content.Context applicationContext = context.getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    locationInfoImpl = new com.zettle.sdk.core.os.LocationInfoImpl(applicationContext, com.zettle.sdk.meta.Platform.INSTANCE, com.zettle.sdk.commons.thread.EventsLoop.INSTANCE.getBackground());
                    getHighSpeedVideoFpsRanges = locationInfoImpl;
                }
            }
            return locationInfoImpl;
        }
    }
}
