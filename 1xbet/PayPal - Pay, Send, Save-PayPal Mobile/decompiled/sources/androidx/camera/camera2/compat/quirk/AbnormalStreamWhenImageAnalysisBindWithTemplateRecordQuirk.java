package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;", "Landroidx/camera/camera2/compat/quirk/CaptureIntentPreviewQuirk;", "<init>", "()V", "", "workaroundByCaptureIntentPreview", "()Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk$Companion;", "", "<init>", "()V", "", "isEnabled", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ boolean access$isSamsungM55(androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.Companion companion) {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice() && kotlin.text.StringsKt.equals(android.os.Build.DEVICE, "m55xq", true);
        }

        public final boolean isEnabled() {
            return androidx.camera.camera2.compat.quirk.Device.INSTANCE.isSamsungDevice() && kotlin.text.StringsKt.equals(android.os.Build.DEVICE, "m55xq", true);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean workaroundByCaptureIntentPreview() {
        return androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.Companion.access$isSamsungM55(INSTANCE);
    }
}
