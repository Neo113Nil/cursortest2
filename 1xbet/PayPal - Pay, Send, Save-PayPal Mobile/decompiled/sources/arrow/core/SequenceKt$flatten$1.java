package arrow.core;

/* JADX INFO: Add missing generic type declarations: [A] */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class SequenceKt$flatten$1<A> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.sequences.Sequence<? extends A>, kotlin.sequences.Sequence<? extends A>> {
    public static final arrow.core.SequenceKt$flatten$1 Camera2StreamConfigurationMap = new arrow.core.SequenceKt$flatten$1();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        kotlin.sequences.Sequence sequence = (kotlin.sequences.Sequence) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        return sequence;
    }

    SequenceKt$flatten$1() {
        super(1, arrow.core.PredefKt.class, "identity", "identity(Ljava/lang/Object;)Ljava/lang/Object;", 1);
    }
}
