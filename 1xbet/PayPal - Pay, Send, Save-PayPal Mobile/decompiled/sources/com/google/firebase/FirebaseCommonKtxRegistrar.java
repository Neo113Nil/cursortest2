package com.google.firebase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lcom/google/firebase/components/Component;", "getComponents", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FirebaseCommonKtxRegistrar implements com.google.firebase.components.ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        com.google.firebase.components.Component build = com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, kotlinx.coroutines.CoroutineDispatcher.class)).add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, java.util.concurrent.Executor.class))).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            public final kotlinx.coroutines.CoroutineDispatcher create(com.google.firebase.components.ComponentContainer componentContainer) {
                java.lang.Object obj = componentContainer.get(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, java.util.concurrent.Executor.class));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.Executor) obj);
            }
        }).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        com.google.firebase.components.Component build2 = com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Lightweight.class, kotlinx.coroutines.CoroutineDispatcher.class)).add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Lightweight.class, java.util.concurrent.Executor.class))).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            @Override // com.google.firebase.components.ComponentFactory
            public final kotlinx.coroutines.CoroutineDispatcher create(com.google.firebase.components.ComponentContainer componentContainer) {
                java.lang.Object obj = componentContainer.get(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Lightweight.class, java.util.concurrent.Executor.class));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.Executor) obj);
            }
        }).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
        com.google.firebase.components.Component build3 = com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, kotlinx.coroutines.CoroutineDispatcher.class)).add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, java.util.concurrent.Executor.class))).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            @Override // com.google.firebase.components.ComponentFactory
            public final kotlinx.coroutines.CoroutineDispatcher create(com.google.firebase.components.ComponentContainer componentContainer) {
                java.lang.Object obj = componentContainer.get(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, java.util.concurrent.Executor.class));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.Executor) obj);
            }
        }).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build3, "");
        com.google.firebase.components.Component build4 = com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.UiThread.class, kotlinx.coroutines.CoroutineDispatcher.class)).add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.UiThread.class, java.util.concurrent.Executor.class))).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            @Override // com.google.firebase.components.ComponentFactory
            public final kotlinx.coroutines.CoroutineDispatcher create(com.google.firebase.components.ComponentContainer componentContainer) {
                java.lang.Object obj = componentContainer.get(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.UiThread.class, java.util.concurrent.Executor.class));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.Executor) obj);
            }
        }).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build4, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.google.firebase.components.Component[]{build, build2, build3, build4});
    }
}
