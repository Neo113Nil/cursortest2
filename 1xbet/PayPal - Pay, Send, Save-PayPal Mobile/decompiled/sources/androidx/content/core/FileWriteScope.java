package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/datastore/core/FileWriteScope;", "T", "Landroidx/datastore/core/FileReadScope;", "Landroidx/datastore/core/WriteScope;", "Ljava/io/File;", "file", "Landroidx/datastore/core/Serializer;", "serializer", "<init>", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "writeData", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileWriteScope<T> extends androidx.content.core.FileReadScope<T> implements androidx.content.core.WriteScope<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope(java.io.File file, androidx.content.core.Serializer<T> serializer) {
        super(file, serializer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
    }

    @Override // androidx.content.core.WriteScope
    public final java.lang.Object writeData(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        checkNotClosed();
        highResolutionOutputSizeshNQ4ISI = androidx.content.core.FileStorageKt.getHighResolutionOutputSizeshNQ4ISI(getFile(), new androidx.content.core.FileWriteScope$writeData$2(this, t, null), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }
}
