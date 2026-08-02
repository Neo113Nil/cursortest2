package androidx.camera.video.internal.utils;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/video/internal/utils/EncoderProfilesUtil;", "", "<init>", "()V", "Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "baseVideoProfile", "Landroid/util/Size;", "newResolution", "Landroid/util/Range;", "", "bitrateRangeToClamp", "deriveVideoProfile", "(Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;Landroid/util/Size;Landroid/util/Range;)Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "Landroidx/camera/core/impl/EncoderProfilesProxy;", "encoderProfiles", "getFirstVideoProfile", "(Landroidx/camera/core/impl/EncoderProfilesProxy;)Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EncoderProfilesUtil {
    public static final androidx.camera.video.internal.utils.EncoderProfilesUtil INSTANCE = new androidx.camera.video.internal.utils.EncoderProfilesUtil();

    private EncoderProfilesUtil() {
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy deriveVideoProfile(androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy baseVideoProfile, android.util.Size newResolution, android.util.Range<java.lang.Integer> bitrateRangeToClamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseVideoProfile, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newResolution, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitrateRangeToClamp, "");
        java.lang.Integer clamp = bitrateRangeToClamp.clamp(java.lang.Integer.valueOf(androidx.camera.video.internal.config.VideoConfigUtil.scaleBitrate(baseVideoProfile.getBitrate(), baseVideoProfile.getBitDepth(), baseVideoProfile.getBitDepth(), baseVideoProfile.getFrameRate(), baseVideoProfile.getFrameRate(), newResolution.getWidth(), baseVideoProfile.getWidth(), newResolution.getHeight(), baseVideoProfile.getHeight())));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(clamp, "");
        androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy create = androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.create(baseVideoProfile.getCodec(), baseVideoProfile.getMediaType(), clamp.intValue(), baseVideoProfile.getFrameRate(), newResolution.getWidth(), newResolution.getHeight(), baseVideoProfile.getProfile(), baseVideoProfile.getBitDepth(), baseVideoProfile.getChromaSubsampling(), baseVideoProfile.getHdrFormat());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return create;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy getFirstVideoProfile(androidx.camera.core.impl.EncoderProfilesProxy encoderProfiles) {
        java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> videoProfiles;
        if (encoderProfiles == null || (videoProfiles = encoderProfiles.getVideoProfiles()) == null) {
            return null;
        }
        return (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) videoProfiles);
    }
}
