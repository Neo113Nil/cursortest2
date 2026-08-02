package com.miteksystems.misnap.camera;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0005H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0011*\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u0011*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Camera;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$Profile;", "requireProfile", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Camera;)Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$Profile;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord$Companion;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "(Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord$Companion;)Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord;", "", "getVideoBitrate", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord;)I", "Landroid/util/Size;", "getVideoResolution", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord;)Landroid/util/Size;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord$VideoQuality;", "getVideoQuality", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord;)Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord$VideoQuality;", "", "shouldRecordAudio", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord;)Z", "shouldRecordSession", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$TorchMode;", "getTorchMode", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Camera;)Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$TorchMode;", "shouldEnableHighResolutionFrames", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Camera;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord$VideoQuality;"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CameraSettings {
    private static final com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.VideoQuality getHighResolutionOutputSizeshNQ4ISI = com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.VideoQuality.FHD;

    public static final boolean shouldRecordSession(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord videoRecord) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoRecord, "");
        java.lang.Boolean recordSession = videoRecord.getRecordSession();
        if (recordSession != null) {
            return recordSession.booleanValue();
        }
        java.lang.Boolean recordSession2 = m10899default(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.INSTANCE).getRecordSession();
        kotlin.jvm.internal.Intrinsics.checkNotNull(recordSession2);
        return recordSession2.booleanValue();
    }

    public static final boolean shouldRecordAudio(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord videoRecord) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoRecord, "");
        java.lang.Boolean recordAudio = videoRecord.getRecordAudio();
        if (recordAudio != null) {
            return recordAudio.booleanValue();
        }
        java.lang.Boolean recordAudio2 = m10899default(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.INSTANCE).getRecordAudio();
        kotlin.jvm.internal.Intrinsics.checkNotNull(recordAudio2);
        return recordAudio2.booleanValue();
    }

    public static final boolean shouldEnableHighResolutionFrames(com.miteksystems.misnap.core.MiSnapSettings.Camera camera) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera, "");
        java.lang.Boolean enableHighResolutionFrames = camera.getEnableHighResolutionFrames();
        if (enableHighResolutionFrames != null) {
            return enableHighResolutionFrames.booleanValue();
        }
        return false;
    }

    public static final com.miteksystems.misnap.core.MiSnapSettings.Camera.Profile requireProfile(com.miteksystems.misnap.core.MiSnapSettings.Camera camera) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera, "");
        com.miteksystems.misnap.core.MiSnapSettings.Camera.Profile profile = camera.getProfile();
        if (profile != null) {
            return profile;
        }
        throw new java.lang.IllegalArgumentException("Required parameter 'profile' is missing from MiSnapSettings");
    }

    @kotlin.Deprecated(message = "Use getVideoQuality instead")
    public static final android.util.Size getVideoResolution(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord videoRecord) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoRecord, "");
        android.util.Size videoResolution = videoRecord.getVideoResolution();
        if (videoResolution == null || (videoResolution.getWidth() <= 0 && videoResolution.getHeight() <= 0)) {
            android.util.Size videoResolution2 = m10899default(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.INSTANCE).getVideoResolution();
            kotlin.jvm.internal.Intrinsics.checkNotNull(videoResolution2);
            return videoResolution2;
        }
        if (videoResolution.getWidth() <= 0 && videoResolution.getHeight() > 0) {
            android.util.Size videoResolution3 = m10899default(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.INSTANCE).getVideoResolution();
            kotlin.jvm.internal.Intrinsics.checkNotNull(videoResolution3);
            return new android.util.Size(videoResolution3.getWidth(), videoResolution.getHeight());
        }
        if (videoResolution.getWidth() <= 0 || videoResolution.getHeight() > 0) {
            return videoResolution;
        }
        android.util.Size videoResolution4 = m10899default(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.INSTANCE).getVideoResolution();
        kotlin.jvm.internal.Intrinsics.checkNotNull(videoResolution4);
        return new android.util.Size(videoResolution.getWidth(), videoResolution4.getHeight());
    }

    public static final com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.VideoQuality getVideoQuality(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord videoRecord) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoRecord, "");
        com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.VideoQuality videoQuality = videoRecord.getVideoQuality();
        if (videoQuality != null) {
            return videoQuality;
        }
        com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.VideoQuality videoQuality2 = m10899default(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.INSTANCE).getVideoQuality();
        kotlin.jvm.internal.Intrinsics.checkNotNull(videoQuality2);
        return videoQuality2;
    }

    public static final int getVideoBitrate(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord videoRecord) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoRecord, "");
        java.lang.Integer videoBitrate = videoRecord.getVideoBitrate();
        if (videoBitrate != null && videoBitrate.intValue() > 0) {
            return videoBitrate.intValue();
        }
        java.lang.Integer videoBitrate2 = m10899default(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.INSTANCE).getVideoBitrate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(videoBitrate2);
        return videoBitrate2.intValue();
    }

    public static final com.miteksystems.misnap.core.MiSnapSettings.Camera.TorchMode getTorchMode(com.miteksystems.misnap.core.MiSnapSettings.Camera camera) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera, "");
        com.miteksystems.misnap.core.MiSnapSettings.Camera.TorchMode torchMode = camera.getTorchMode();
        return torchMode == null ? com.miteksystems.misnap.core.MiSnapSettings.Camera.TorchMode.OFF : torchMode;
    }

    /* renamed from: default, reason: not valid java name */
    public static final com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord m10899default(com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord videoRecord = new com.miteksystems.misnap.core.MiSnapSettings.Camera.VideoRecord();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        videoRecord.setRecordSession(bool);
        videoRecord.setRecordAudio(bool);
        videoRecord.setVideoBitrate(1000000);
        videoRecord.setVideoResolution(new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 1280));
        videoRecord.setVideoQuality(getHighResolutionOutputSizeshNQ4ISI);
        return videoRecord;
    }
}
