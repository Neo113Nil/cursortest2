package androidx.compose.ui.layout;

/* compiled from: AlignmentLine.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class AlignmentLineKt$LastBaseline$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer> {
    public static final androidx.compose.ui.layout.AlignmentLineKt$LastBaseline$1 INSTANCE = new androidx.compose.ui.layout.AlignmentLineKt$LastBaseline$1();

    AlignmentLineKt$LastBaseline$1() {
        super(2, kotlin.math.MathKt.class, com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "max(II)I", 1);
    }

    public final java.lang.Integer invoke(int i, int i2) {
        return java.lang.Integer.valueOf(java.lang.Math.max(i, i2));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num, java.lang.Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }
}
