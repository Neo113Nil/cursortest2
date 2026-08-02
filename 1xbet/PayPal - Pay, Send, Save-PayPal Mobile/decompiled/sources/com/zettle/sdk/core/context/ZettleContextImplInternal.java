package com.zettle.sdk.core.context;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JL\u0010\u000e\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062'\u0010\r\u001a#\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\u000b¢\u0006\u0002\b\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u001c\u0010\u0014\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00172\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u0004JL\u0010\u001e\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062'\u0010\r\u001a#\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\u000b¢\u0006\u0002\b\fH\u0016¢\u0006\u0004\b\u001e\u0010\u000fR$\u0010$\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\b\u0012\u0006\u0012\u0002\b\u00030!0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/zettle/sdk/core/context/ZettleContextImplInternal;", "Lcom/zettle/sdk/core/context/ZettleGlobalContextImpl;", "Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "<init>", "()V", "T", "Lcom/zettle/sdk/core/context/KeyTag;", "key", "Lkotlin/Function2;", "Lcom/zettle/sdk/core/context/ZettleGlobalContextContainer;", "Lcom/zettle/sdk/core/context/ZettleContextParameters;", "Lcom/zettle/sdk/core/context/FactoryBlock;", "Lkotlin/ExtensionFunctionType;", "block", "factory", "(Lcom/zettle/sdk/core/context/KeyTag;Lkotlin/jvm/functions/Function2;)Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "Lkotlin/Function0;", "", "", "Lcom/zettle/sdk/core/context/GetParameters;", "parameters", "get", "(Lcom/zettle/sdk/core/context/KeyTag;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "has", "(Lcom/zettle/sdk/core/context/KeyTag;)Z", "initialize", "()Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "", "seal", "single", "", "", "Lcom/zettle/sdk/core/context/ZettleContextFactory;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZettleContextImplInternal implements com.zettle.sdk.core.context.ZettleGlobalContextImpl, com.zettle.sdk.core.context.ZettleGlobalContext.Initializer {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.zettle.sdk.core.context.ZettleContextFactory<?>> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();

    @Override // com.zettle.sdk.core.context.ZettleGlobalContext.Initializer
    public final void seal() {
    }

    @Override // com.zettle.sdk.core.context.ZettleGlobalContextContainer
    public final <T> T get(com.zettle.sdk.core.context.KeyTag<T> key, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Object>> parameters) {
        com.zettle.sdk.core.context.ZettleContextFactory orThrow;
        java.util.List<? extends java.lang.Object> emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        synchronized (this) {
            orThrow = com.zettle.sdk.core.context.ZettleContextImplExtKt.getOrThrow(this.Camera2StreamConfigurationMap, key.getValue());
        }
        if (parameters == null || (emptyList = parameters.invoke()) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        return (T) orThrow.onCreate(this, com.zettle.sdk.core.context.ZettleContextParameters.INSTANCE.of(emptyList));
    }

    @Override // com.zettle.sdk.core.context.ZettleGlobalContextContainer
    public final boolean has(com.zettle.sdk.core.context.KeyTag<?> key) {
        boolean containsKey;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        synchronized (this) {
            containsKey = this.Camera2StreamConfigurationMap.containsKey(key.getValue());
        }
        return containsKey;
    }

    @Override // com.zettle.sdk.core.context.ZettleGlobalContextImpl
    public final com.zettle.sdk.core.context.ZettleGlobalContext.Initializer initialize() {
        return this;
    }

    @Override // com.zettle.sdk.core.context.ZettleGlobalContext.Builder
    public final <T> com.zettle.sdk.core.context.ZettleGlobalContext.Initializer single(com.zettle.sdk.core.context.KeyTag<T> key, kotlin.jvm.functions.Function2<? super com.zettle.sdk.core.context.ZettleGlobalContextContainer, ? super com.zettle.sdk.core.context.ZettleContextParameters, ? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        synchronized (this) {
            com.zettle.sdk.core.context.ZettleContextImplExtKt.putOrThrowIfExist(this.Camera2StreamConfigurationMap, key.getValue(), new com.zettle.sdk.core.context.Single(block));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return this;
    }

    @Override // com.zettle.sdk.core.context.ZettleGlobalContext.Builder
    public final <T> com.zettle.sdk.core.context.ZettleGlobalContext.Initializer factory(com.zettle.sdk.core.context.KeyTag<T> key, kotlin.jvm.functions.Function2<? super com.zettle.sdk.core.context.ZettleGlobalContextContainer, ? super com.zettle.sdk.core.context.ZettleContextParameters, ? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        synchronized (this) {
            com.zettle.sdk.core.context.ZettleContextImplExtKt.putOrThrowIfExist(this.Camera2StreamConfigurationMap, key.getValue(), new com.zettle.sdk.core.context.Factory(block));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return this;
    }
}
