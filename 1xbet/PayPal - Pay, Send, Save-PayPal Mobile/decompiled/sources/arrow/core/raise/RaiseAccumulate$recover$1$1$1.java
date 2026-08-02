package arrow.core.raise;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes.dex */
public final /* synthetic */ class RaiseAccumulate$recover$1$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return invoke((arrow.core.raise.RaiseAccumulate$recover$1$1$1) obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Void invoke(Error error) {
        ((arrow.core.raise.Raise) this.receiver).raise(error);
        throw new kotlin.KotlinNothingValueException();
    }

    public RaiseAccumulate$recover$1$1$1(java.lang.Object obj) {
        super(1, obj, arrow.core.raise.Raise.class, "raise", "raise(Ljava/lang/Object;)Ljava/lang/Void;", 0);
    }
}
