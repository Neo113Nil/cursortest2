package io.ktor.client.plugins.cache.storage;

/* compiled from: FileCacheStorage.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljava/io/File;", "directory", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "FileStorage", "(Ljava/io/File;Lkotlinx/coroutines/CoroutineDispatcher;)Lio/ktor/client/plugins/cache/storage/CacheStorage;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FileCacheStorageKt {
    public static /* synthetic */ io.ktor.client.plugins.cache.storage.CacheStorage FileStorage$default(java.io.File file, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            coroutineDispatcher = kotlinx.coroutines.Dispatchers.getIO();
        }
        return FileStorage(file, coroutineDispatcher);
    }

    public static final io.ktor.client.plugins.cache.storage.CacheStorage FileStorage(java.io.File directory, kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directory, "directory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new io.ktor.client.plugins.cache.storage.CachingCacheStorage(new io.ktor.client.plugins.cache.storage.FileCacheStorage(directory, dispatcher));
    }
}
