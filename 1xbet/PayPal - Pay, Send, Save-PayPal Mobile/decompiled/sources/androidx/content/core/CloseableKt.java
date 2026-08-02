package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0005\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/datastore/core/Closeable;", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "block", "use", "(Landroidx/datastore/core/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CloseableKt {
    public static final <T extends androidx.content.core.Closeable, R> R use(T t, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        try {
            R invoke = function1.invoke(t);
            try {
                t.close();
                th = null;
            } catch (java.lang.Throwable th) {
                th = th;
            }
            if (th == null) {
                return invoke;
            }
            throw th;
        } catch (java.lang.Throwable th2) {
            try {
                t.close();
            } catch (java.lang.Throwable th3) {
                kotlin.ExceptionsKt.addSuppressed(th2, th3);
            }
            throw th2;
        }
    }
}
