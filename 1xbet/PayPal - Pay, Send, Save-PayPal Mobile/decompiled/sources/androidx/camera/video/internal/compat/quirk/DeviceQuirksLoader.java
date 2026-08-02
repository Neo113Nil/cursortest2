package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    static java.util.List<androidx.camera.core.impl.Quirk> getHighSpeedVideoFpsRanges(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.class, androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.Camera2StreamConfigurationMap())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.class, androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.getHighSpeedVideoFpsRanges())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.class, androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.getHighSpeedVideoSizes())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk.class, androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk.Camera2StreamConfigurationMap())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk.class, androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk.getHighSpeedVideoFpsRanges())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite.class, androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite.getHighSpeedVideoSizes())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class, androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.getHighSpeedVideoSizes())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.getHighSpeedVideoFpsRangesFor())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk.class, androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk.getHighSpeedVideoFpsRanges())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.class, androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.getHighSpeedVideoFpsRanges())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk.class, androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk.getHighSpeedVideoSizes())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class, androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.getHighSpeedVideoSizes())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk.class, androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk.getHighSpeedVideoFpsRanges())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.getHighSpeedVideoFpsRangesFor())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk.class, androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk.getHighSpeedVideoFpsRanges())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk.class, androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk.Camera2StreamConfigurationMap())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk.class, androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk.Camera2StreamConfigurationMap())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.PreviewBlackScreenQuirk.class, androidx.camera.video.internal.compat.quirk.PreviewBlackScreenQuirk.load())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.PreviewBlackScreenQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk.class, androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk.load())) {
            arrayList.add(androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk.INSTANCE);
        }
        androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk.getHighSpeedVideoFpsRanges();
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk.class, true)) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk.class, androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk.getHighSpeedVideoSizes())) {
            arrayList.add(new androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.class, androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.load())) {
            arrayList.add(androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.INSTANCE);
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk.class, androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk.load())) {
            arrayList.add(androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk.INSTANCE);
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.video.internal.compat.quirk.VideoInterlacingQuirk.class, androidx.camera.video.internal.compat.quirk.VideoInterlacingQuirk.load())) {
            arrayList.add(androidx.camera.video.internal.compat.quirk.VideoInterlacingQuirk.INSTANCE);
        }
        return arrayList;
    }
}
