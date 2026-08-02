package io.ktor.utils.io.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u0006\u001a\u00028\u0001\"\u0010\b\u0000\u0010\u0002*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001\"\u0004\b\u0001\u0010\u0003*\u00028\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Ljava/io/Closeable;", "Lio/ktor/utils/io/core/getHighResolutionOutputSizeshNQ4ISI;", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "block", "use", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloseableKt {
    @kotlin.Deprecated(message = "Use stdlib implementation instead. Remove import of this function")
    public static final <T extends java.io.Closeable, R> R use(T t, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        T t2 = t;
        try {
            R invoke = function1.invoke(t2);
            kotlin.jdk7.AutoCloseableKt.closeFinally(t2, null);
            return invoke;
        } finally {
        }
    }
}
