package androidx.content.core.handlers;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "T", "Landroidx/datastore/core/CorruptionHandler;", "Lkotlin/Function1;", "Landroidx/datastore/core/CorruptionException;", "produceNewData", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ex", "handleCorruption", "(Landroidx/datastore/core/CorruptionException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReplaceFileCorruptionHandler<T> implements androidx.content.core.CorruptionHandler<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.content.core.CorruptionException, T> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public ReplaceFileCorruptionHandler(kotlin.jvm.functions.Function1<? super androidx.content.core.CorruptionException, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRanges = function1;
    }

    @Override // androidx.content.core.CorruptionHandler
    public final java.lang.Object handleCorruption(androidx.content.core.CorruptionException corruptionException, kotlin.coroutines.Continuation<? super T> continuation) throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.invoke(corruptionException);
    }
}
