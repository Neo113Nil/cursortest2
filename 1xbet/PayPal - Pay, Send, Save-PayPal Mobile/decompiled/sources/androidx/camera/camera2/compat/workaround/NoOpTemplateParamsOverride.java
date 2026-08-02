package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/compat/workaround/NoOpTemplateParamsOverride;", "Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "<init>", "()V", "Landroidx/camera/camera2/pipe/RequestTemplate;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.TEMPLATE, "", "Landroid/hardware/camera2/CaptureRequest$Key;", "", "getOverrideParams-xlOpshk", "(Landroidx/camera/camera2/pipe/RequestTemplate;)Ljava/util/Map;", "getOverrideParams"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoOpTemplateParamsOverride implements androidx.camera.camera2.compat.workaround.TemplateParamsOverride {
    public static final androidx.camera.camera2.compat.workaround.NoOpTemplateParamsOverride INSTANCE = new androidx.camera.camera2.compat.workaround.NoOpTemplateParamsOverride();

    private NoOpTemplateParamsOverride() {
    }

    @Override // androidx.camera.camera2.compat.workaround.TemplateParamsOverride
    /* renamed from: getOverrideParams-xlOpshk, reason: not valid java name */
    public final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> mo79getOverrideParamsxlOpshk(androidx.camera.camera2.pipe.RequestTemplate template) {
        return kotlin.collections.MapsKt.emptyMap();
    }
}
