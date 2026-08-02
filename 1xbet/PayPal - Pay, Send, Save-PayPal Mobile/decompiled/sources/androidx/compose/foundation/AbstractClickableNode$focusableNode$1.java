package androidx.compose.foundation;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class AbstractClickableNode$focusableNode$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(boolean z) {
        ((androidx.compose.foundation.AbstractClickableNode) this.receiver).getHighSpeedVideoSizes(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        getHighSpeedVideoFpsRangesFor(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    AbstractClickableNode$focusableNode$1(java.lang.Object obj) {
        super(1, obj, androidx.compose.foundation.AbstractClickableNode.class, "getHighSpeedVideoSizes", "getHighSpeedVideoSizes(Z)V", 0);
    }
}
