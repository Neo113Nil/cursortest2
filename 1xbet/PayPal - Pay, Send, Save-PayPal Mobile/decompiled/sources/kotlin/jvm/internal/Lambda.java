package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lkotlin/jvm/internal/Lambda;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/jvm/internal/FunctionBase;", "Ljava/io/Serializable;", "", "arity", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getArity", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class Lambda<R> implements kotlin.jvm.internal.FunctionBase<R>, java.io.Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    public java.lang.String toString() {
        java.lang.String renderLambdaToString = kotlin.jvm.internal.Reflection.renderLambdaToString((kotlin.jvm.internal.Lambda) this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(renderLambdaToString, "");
        return renderLambdaToString;
    }
}
