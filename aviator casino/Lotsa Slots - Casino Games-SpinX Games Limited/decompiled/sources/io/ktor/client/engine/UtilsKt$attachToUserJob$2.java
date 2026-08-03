package io.ktor.client.engine;

/* compiled from: Utils.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class UtilsKt$attachToUserJob$2 implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    final /* synthetic */ kotlinx.coroutines.DisposableHandle $cleanupHandler;

    public UtilsKt$attachToUserJob$2(kotlinx.coroutines.DisposableHandle disposableHandle) {
        this.$cleanupHandler = disposableHandle;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
        invoke2(th);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.Throwable th) {
        this.$cleanupHandler.dispose();
    }
}
