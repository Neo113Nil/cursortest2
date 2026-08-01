package io.ktor.client.plugins.cache.storage;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2}, l = {254, 257, 258}, m = "remove", n = {"varyKeys", "urlHex", "this_$iv", "$this$withLock_u24default$iv$iv", "varyKeys", "urlHex", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes7.dex */
final class FileCacheStorage$remove$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$remove$1(FileCacheStorage fileCacheStorage, Continuation<? super FileCacheStorage$remove$1> continuation) {
        super(continuation);
        this.this$0 = fileCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.remove(null, null, this);
    }
}
