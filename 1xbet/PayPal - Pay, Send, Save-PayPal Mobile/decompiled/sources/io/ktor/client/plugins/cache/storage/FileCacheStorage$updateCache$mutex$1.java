package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FileCacheStorage$updateCache$mutex$1 implements kotlin.jvm.functions.Function0<kotlinx.coroutines.sync.Mutex> {
    public static final io.ktor.client.plugins.cache.storage.FileCacheStorage$updateCache$mutex$1 INSTANCE = new io.ktor.client.plugins.cache.storage.FileCacheStorage$updateCache$mutex$1();

    @Override // kotlin.jvm.functions.Function0
    public final kotlinx.coroutines.sync.Mutex invoke() {
        return kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }
}
