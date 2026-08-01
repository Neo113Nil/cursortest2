package io.ktor.client.plugins.cache.storage;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {252}, m = "deleteCache", n = {"urlHex", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
final class FileCacheStorage$deleteCache$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$deleteCache$1(FileCacheStorage fileCacheStorage, Continuation<? super FileCacheStorage$deleteCache$1> continuation) {
        super(continuation);
        this.this$0 = fileCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object deleteCache;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        deleteCache = this.this$0.deleteCache(null, this);
        return deleteCache;
    }
}
