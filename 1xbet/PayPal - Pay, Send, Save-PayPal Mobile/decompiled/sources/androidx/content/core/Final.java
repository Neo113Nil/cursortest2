package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/datastore/core/Final;", "T", "Landroidx/datastore/core/State;", "", "finalException", "<init>", "(Ljava/lang/Throwable;)V", "Ljava/lang/Throwable;", "getFinalException", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Final<T> extends androidx.content.core.State<T> {
    private final java.lang.Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Final(java.lang.Throwable th) {
        super(Integer.MAX_VALUE, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        this.finalException = th;
    }

    public final java.lang.Throwable getFinalException() {
        return this.finalException;
    }
}
