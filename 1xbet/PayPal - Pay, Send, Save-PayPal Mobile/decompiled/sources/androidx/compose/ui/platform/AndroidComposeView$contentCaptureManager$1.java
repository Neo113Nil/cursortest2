package androidx.compose.ui.platform;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper invoke() {
        androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.ui.platform.AndroidComposeView_androidKt.getHighSpeedVideoSizes((android.view.View) this.receiver);
        return highSpeedVideoSizes;
    }

    AndroidComposeView$contentCaptureManager$1(java.lang.Object obj) {
        super(0, obj, androidx.compose.ui.platform.AndroidComposeView_androidKt.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1);
    }
}
