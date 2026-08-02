package androidx.camera.extensions.internal.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/extensions/internal/compat/workaround/PostviewFormatValidator;", "", "<init>", "()V", "Landroidx/camera/core/impl/CameraConfig$PostviewFormatSelector;", "getPostviewFormatSelector", "()Landroidx/camera/core/impl/CameraConfig$PostviewFormatSelector;", "Landroidx/camera/core/impl/Quirk;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/impl/Quirk;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PostviewFormatValidator {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.impl.Quirk getHighSpeedVideoFpsRanges = androidx.camera.extensions.internal.compat.quirk.DeviceQuirks.get(androidx.camera.extensions.internal.compat.quirk.EnsurePostviewFormatEquivalenceQuirk.class);

    public final androidx.camera.core.impl.CameraConfig.PostviewFormatSelector getPostviewFormatSelector() {
        if (this.getHighSpeedVideoFpsRanges != null) {
            return new androidx.camera.core.impl.CameraConfig.PostviewFormatSelector() { // from class: androidx.camera.extensions.internal.compat.workaround.PostviewFormatValidator$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.impl.CameraConfig.PostviewFormatSelector
                public final int select(int i, java.util.List list) {
                    return androidx.camera.extensions.internal.compat.workaround.PostviewFormatValidator.m1017$r8$lambda$8ATIlZ8GFy4wH_n0ptsa4xmGp4(i, list);
                }
            };
        }
        androidx.camera.core.impl.CameraConfig.PostviewFormatSelector postviewFormatSelector = androidx.camera.core.impl.CameraConfig.DEFAULT_POSTVIEW_FORMAT_SELECTOR;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(postviewFormatSelector, "");
        return postviewFormatSelector;
    }

    /* renamed from: $r8$lambda$8ATIlZ8GFy4wH_n0ptsa4x-mGp4, reason: not valid java name */
    public static /* synthetic */ int m1017$r8$lambda$8ATIlZ8GFy4wH_n0ptsa4xmGp4(int i, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.contains(java.lang.Integer.valueOf(i))) {
            return i;
        }
        return 0;
    }
}
