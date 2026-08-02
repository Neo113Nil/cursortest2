package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\tJ)\u0010\b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "", "Landroidx/camera/camera2/pipe/RequestTemplate;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.TEMPLATE, "", "Landroid/hardware/camera2/CaptureRequest$Key;", "getOverrideParams-xlOpshk", "(Landroidx/camera/camera2/pipe/RequestTemplate;)Ljava/util/Map;", "getOverrideParams", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TemplateParamsOverride {
    /* renamed from: getOverrideParams-xlOpshk */
    java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> mo79getOverrideParamsxlOpshk(androidx.camera.camera2.pipe.RequestTemplate template);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride$Bindings;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.compat.workaround.TemplateParamsOverride.Bindings.Companion INSTANCE = new androidx.camera.camera2.compat.workaround.TemplateParamsOverride.Bindings.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride$Bindings$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "cameraQuirks", "Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "provideTemplateParamsOverride", "(Landroidx/camera/camera2/compat/quirk/CameraQuirks;)Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @dagger.Provides
            public final androidx.camera.camera2.compat.workaround.TemplateParamsOverride provideTemplateParamsOverride(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraQuirks, "");
                androidx.camera.core.impl.Quirks quirks = cameraQuirks.getQuirks();
                if (androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk.INSTANCE.workaroundByCaptureIntentPreview(quirks) || quirks.contains(androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class)) {
                    return new androidx.camera.camera2.compat.workaround.TemplateParamsQuirkOverride(quirks);
                }
                return androidx.camera.camera2.compat.workaround.NoOpTemplateParamsOverride.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
