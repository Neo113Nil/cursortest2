package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aJ\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/sync/Mutex;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "Lkotlin/Function1;", "", "block", "withTryLock", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MutexUtilsKt {
    public static /* synthetic */ java.lang.Object withTryLock$default(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutex, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        boolean tryLock = mutex.tryLock(obj);
        try {
            return function1.invoke(java.lang.Boolean.valueOf(tryLock));
        } finally {
            if (tryLock) {
                mutex.unlock(obj);
            }
        }
    }

    public static final <R> R withTryLock(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutex, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        boolean tryLock = mutex.tryLock(obj);
        try {
            return function1.invoke(java.lang.Boolean.valueOf(tryLock));
        } finally {
            if (tryLock) {
                mutex.unlock(obj);
            }
        }
    }
}
