package androidx.compose.foundation;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class FocusableNode$applySemantics$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean invoke() {
        return java.lang.Boolean.valueOf(((androidx.compose.foundation.FocusableNode) this.receiver).requestFocus());
    }

    FocusableNode$applySemantics$1(java.lang.Object obj) {
        super(0, obj, androidx.compose.foundation.FocusableNode.class, "requestFocus", "requestFocus()Z", 0);
    }
}
