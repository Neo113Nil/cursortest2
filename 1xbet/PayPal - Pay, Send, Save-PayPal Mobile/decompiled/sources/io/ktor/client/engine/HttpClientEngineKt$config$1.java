package io.ktor.client.engine;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J(\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineKt$config$1;", "Lio/ktor/client/engine/HttpClientEngineFactory;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/client/engine/HttpClientEngine;", "create", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/engine/HttpClientEngine;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpClientEngineKt$config$1<T> implements io.ktor.client.engine.HttpClientEngineFactory<T> {
    final /* synthetic */ io.ktor.client.engine.HttpClientEngineFactory<T> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    HttpClientEngineKt$config$1(io.ktor.client.engine.HttpClientEngineFactory<? extends T> httpClientEngineFactory, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = httpClientEngineFactory;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @Override // io.ktor.client.engine.HttpClientEngineFactory
    public final io.ktor.client.engine.HttpClientEngine create(final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        io.ktor.client.engine.HttpClientEngineFactory<T> httpClientEngineFactory = this.getHighResolutionOutputSizeshNQ4ISI;
        final kotlin.jvm.functions.Function1<T, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
        return httpClientEngineFactory.create(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.HttpClientEngineKt$config$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.engine.HttpClientEngineKt$config$1.$r8$lambda$xaYNNftro0VrcDZDg5ULYof9n94(kotlin.jvm.functions.Function1.this, block, (io.ktor.client.engine.HttpClientEngineConfig) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xaYNNftro0VrcDZDg5ULYof9n94(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, io.ktor.client.engine.HttpClientEngineConfig httpClientEngineConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientEngineConfig, "");
        function1.invoke(httpClientEngineConfig);
        function12.invoke(httpClientEngineConfig);
        return kotlin.Unit.INSTANCE;
    }
}
