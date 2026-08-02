package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Larrow/core/None;", "Larrow/core/Option;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class None extends arrow.core.Option {
    public static final arrow.core.None INSTANCE = new arrow.core.None();

    private None() {
        super(null);
    }

    @Override // arrow.core.Option
    public final java.lang.String toString() {
        return "Option.None";
    }
}
