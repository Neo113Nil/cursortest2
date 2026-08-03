package io.ktor.client.engine;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: HttpClientEngine.kt */
@kotlin.Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J(\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"io/ktor/client/engine/HttpClientEngineKt$config$1", "Lio/ktor/client/engine/HttpClientEngineFactory;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/client/engine/HttpClientEngine;", "create", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/engine/HttpClientEngine;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpClientEngineKt$config$1<T> implements io.ktor.client.engine.HttpClientEngineFactory<T> {
    final /* synthetic */ kotlin.jvm.functions.Function1<T, kotlin.Unit> $nested;
    final /* synthetic */ io.ktor.client.engine.HttpClientEngineFactory<T> $parent;

    /* JADX WARN: Multi-variable type inference failed */
    HttpClientEngineKt$config$1(io.ktor.client.engine.HttpClientEngineFactory<? extends T> httpClientEngineFactory, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        this.$parent = httpClientEngineFactory;
        this.$nested = function1;
    }

    @Override // io.ktor.client.engine.HttpClientEngineFactory
    public io.ktor.client.engine.HttpClientEngine create(final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.client.engine.HttpClientEngineFactory<T> httpClientEngineFactory = this.$parent;
        final kotlin.jvm.functions.Function1<T, kotlin.Unit> function1 = this.$nested;
        return httpClientEngineFactory.create(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.HttpClientEngineKt$config$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit create$lambda$0;
                create$lambda$0 = io.ktor.client.engine.HttpClientEngineKt$config$1.create$lambda$0(kotlin.jvm.functions.Function1.this, block, (io.ktor.client.engine.HttpClientEngineConfig) obj);
                return create$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit create$lambda$0(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, io.ktor.client.engine.HttpClientEngineConfig create) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(create, "$this$create");
        function1.invoke(create);
        function12.invoke(create);
        return kotlin.Unit.INSTANCE;
    }
}
