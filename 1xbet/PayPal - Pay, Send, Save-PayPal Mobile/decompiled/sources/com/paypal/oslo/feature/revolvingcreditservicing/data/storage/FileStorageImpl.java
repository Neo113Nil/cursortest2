package com.paypal.oslo.feature.revolvingcreditservicing.data.storage;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J@\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/storage/FileStorageImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/storage/FileStorage;", "Landroid/content/Context;", "context", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "directory", "fileName", "Lkotlin/Function1;", "Ljava/io/OutputStream;", "", "content", "Larrow/core/Either;", "Ljava/io/IOException;", "saveFile", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FileStorageImpl implements com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorage {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public FileStorageImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRanges = coroutineDispatcher;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorage
    public final java.lang.Object saveFile(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super java.io.OutputStream, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.io.IOException, java.lang.String>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorageImpl$saveFile$2(this, str, str2, function1, null), continuation);
    }
}
