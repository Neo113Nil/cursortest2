package androidx.compose.ui.tooling;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ComposeViewAdapter$findAndTrackAnimations$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI() {
        ((androidx.compose.ui.tooling.ComposeViewAdapter) this.receiver).requestLayout();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighResolutionOutputSizeshNQ4ISI();
        return kotlin.Unit.INSTANCE;
    }

    ComposeViewAdapter$findAndTrackAnimations$2(java.lang.Object obj) {
        super(0, obj, androidx.compose.ui.tooling.ComposeViewAdapter.class, "requestLayout", "requestLayout()V", 0);
    }
}
