package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/OrientationUtil;", "", "<init>", "()V", "Landroid/content/Context;", "activityContext", "", "getRotationFromNaturalOrientation", "(Landroid/content/Context;)I", "getDeviceCurrentBasicOrientation", "getNaturalOrientation", "getDegreeRotationFromNaturalOrientation", "currentDeviceOrientation", "documentOrientation", "frameOrientation", "", "isDocumentAlignedWithImage", "(III)Z", "p0", "Landroid/view/Display;", "getHighSpeedVideoFpsRanges", "(Landroid/content/Context;)Landroid/view/Display;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class OrientationUtil {
    public static final com.miteksystems.misnap.core.OrientationUtil INSTANCE = new com.miteksystems.misnap.core.OrientationUtil();

    @kotlin.jvm.JvmStatic
    public static final boolean isDocumentAlignedWithImage(int currentDeviceOrientation, int documentOrientation, int frameOrientation) {
        return (currentDeviceOrientation != 2 ? frameOrientation == 90 || frameOrientation == 270 : frameOrientation == 0 || frameOrientation == 180) ? currentDeviceOrientation == documentOrientation : currentDeviceOrientation != documentOrientation;
    }

    @kotlin.jvm.JvmStatic
    public static final int getRotationFromNaturalOrientation(android.content.Context activityContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
        android.view.Display highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(activityContext);
        if (highSpeedVideoFpsRanges != null) {
            return highSpeedVideoFpsRanges.getRotation();
        }
        return 0;
    }

    @kotlin.jvm.JvmStatic
    public static final int getNaturalOrientation(android.content.Context activityContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
        android.view.Display highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(activityContext);
        if (highSpeedVideoFpsRanges == null) {
            return 2;
        }
        android.graphics.Point point = new android.graphics.Point();
        highSpeedVideoFpsRanges.getRealSize(point);
        int i = point.x;
        int i2 = point.y;
        int degreeRotationFromNaturalOrientation = getDegreeRotationFromNaturalOrientation(activityContext);
        if ((degreeRotationFromNaturalOrientation == 0 || degreeRotationFromNaturalOrientation == 180) && i < i2) {
            return 1;
        }
        return ((degreeRotationFromNaturalOrientation == 90 || degreeRotationFromNaturalOrientation == 270) && i >= i2) ? 1 : 2;
    }

    @kotlin.jvm.JvmStatic
    public static final int getDeviceCurrentBasicOrientation(android.content.Context activityContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
        return activityContext.getResources().getConfiguration().orientation;
    }

    @kotlin.jvm.JvmStatic
    public static final int getDegreeRotationFromNaturalOrientation(android.content.Context activityContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
        int rotationFromNaturalOrientation = getRotationFromNaturalOrientation(activityContext);
        if (rotationFromNaturalOrientation != 1) {
            return rotationFromNaturalOrientation != 2 ? rotationFromNaturalOrientation != 3 ? 0 : 270 : com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
        }
        return 90;
    }

    private static android.view.Display getHighSpeedVideoFpsRanges(android.content.Context p0) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return p0.getDisplay();
        }
        java.lang.Object systemService = p0.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        return ((android.view.WindowManager) systemService).getDefaultDisplay();
    }

    private OrientationUtil() {
    }
}
