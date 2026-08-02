package io.ktor.client.engine;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003J*\u0010\t\u001a\u00020\b2\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineFactory;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/client/engine/HttpClientEngine;", "create", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/engine/HttpClientEngine;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface HttpClientEngineFactory<T extends io.ktor.client.engine.HttpClientEngineConfig> {
    io.ktor.client.engine.HttpClientEngine create(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.ktor.client.engine.HttpClientEngine create$default(io.ktor.client.engine.HttpClientEngineFactory httpClientEngineFactory, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i & 1) != 0) {
                function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.HttpClientEngineFactory$DefaultImpls$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return io.ktor.client.engine.HttpClientEngineFactory.DefaultImpls.$r8$lambda$4ujy0XvCbo7XEZzDQxPPnE4n1D4((io.ktor.client.engine.HttpClientEngineConfig) obj2);
                    }
                };
            }
            return httpClientEngineFactory.create(function1);
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$4ujy0XvCbo7XEZzDQxPPnE4n1D4(io.ktor.client.engine.HttpClientEngineConfig httpClientEngineConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientEngineConfig, "");
            return kotlin.Unit.INSTANCE;
        }
    }
}
