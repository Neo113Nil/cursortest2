package kotlin.coroutines.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004B!\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/jvm/internal/FunctionBase;", "", "Lkotlin/coroutines/jvm/internal/SuspendFunction;", "", "arity", "Lkotlin/coroutines/Continuation;", "completion", "<init>", "(ILkotlin/coroutines/Continuation;)V", "(I)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getArity", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class RestrictedSuspendLambda extends kotlin.coroutines.jvm.internal.RestrictedContinuationImpl implements kotlin.jvm.internal.FunctionBase<java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    private final int arity;

    public RestrictedSuspendLambda(int i, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        super(continuation);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    public RestrictedSuspendLambda(int i) {
        this(i, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public java.lang.String toString() {
        if (getCompletion() == null) {
            java.lang.String renderLambdaToString = kotlin.jvm.internal.Reflection.renderLambdaToString(this);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(renderLambdaToString, "");
            return renderLambdaToString;
        }
        return super.toString();
    }
}
