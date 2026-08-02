package androidx.compose.ui.scrollcapture;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class ScrollCapture$onScrollCaptureSearch$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1<androidx.compose.ui.scrollcapture.ScrollCaptureCandidate, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.scrollcapture.ScrollCaptureCandidate scrollCaptureCandidate) {
        ((androidx.compose.runtime.collection.MutableVector) this.receiver).add(scrollCaptureCandidate);
        return kotlin.Unit.INSTANCE;
    }

    ScrollCapture$onScrollCaptureSearch$1(java.lang.Object obj) {
        super(1, obj, androidx.compose.runtime.collection.MutableVector.class, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "add(Ljava/lang/Object;)Z", 8);
    }
}
