package com.zettle.sdk.core.context;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u001c\u0010\u000b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0018\u00010\u0007j\u0004\u0018\u0001`\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/zettle/sdk/core/context/ZettleContextImplPublic;", "Lcom/zettle/sdk/core/context/ZettleGlobalContextImpl;", "<init>", "()V", "T", "Lcom/zettle/sdk/core/context/KeyTag;", "key", "Lkotlin/Function0;", "", "", "Lcom/zettle/sdk/core/context/GetParameters;", "parameters", "get", "(Lcom/zettle/sdk/core/context/KeyTag;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "has", "(Lcom/zettle/sdk/core/context/KeyTag;)Z", "Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "initialize", "()Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "", "", "Lcom/zettle/sdk/core/context/ZettleContextFactory;", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRangesFor", "InitializerImpl"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ZettleContextImplPublic implements com.zettle.sdk.core.context.ZettleGlobalContextImpl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.util.Map<java.lang.String, ? extends com.zettle.sdk.core.context.ZettleContextFactory<?>> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private volatile boolean getHighSpeedVideoFpsRangesFor;

    @Override // com.zettle.sdk.core.context.ZettleGlobalContextImpl
    public final com.zettle.sdk.core.context.ZettleGlobalContext.Initializer initialize() {
        return new com.zettle.sdk.core.context.ZettleContextImplPublic.InitializerImpl();
    }

    @kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JL\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052'\u0010\f\u001a#\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\n¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u001c\u0010\f\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJL\u0010\u001b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052'\u0010\f\u001a#\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\n¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u000eR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/zettle/sdk/core/context/ZettleContextImplPublic$InitializerImpl;", "Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "<init>", "(Lcom/zettle/sdk/core/context/ZettleContextImplPublic;)V", "T", "Lcom/zettle/sdk/core/context/KeyTag;", "p0", "Lkotlin/Function2;", "Lcom/zettle/sdk/core/context/ZettleGlobalContextContainer;", "Lcom/zettle/sdk/core/context/ZettleContextParameters;", "Lcom/zettle/sdk/core/context/FactoryBlock;", "Lkotlin/ExtensionFunctionType;", "p1", "factory", "(Lcom/zettle/sdk/core/context/KeyTag;Lkotlin/jvm/functions/Function2;)Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "Lkotlin/Function0;", "", "", "Lcom/zettle/sdk/core/context/GetParameters;", "get", "(Lcom/zettle/sdk/core/context/KeyTag;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "has", "(Lcom/zettle/sdk/core/context/KeyTag;)Z", "", "seal", "()V", "single", "", "", "Lcom/zettle/sdk/core/context/ZettleContextFactory;", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class InitializerImpl implements com.zettle.sdk.core.context.ZettleGlobalContext.Initializer {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.util.Map<java.lang.String, com.zettle.sdk.core.context.ZettleContextFactory<?>> getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();

        public InitializerImpl() {
        }

        @Override // com.zettle.sdk.core.context.ZettleGlobalContextContainer
        public final <T> T get(com.zettle.sdk.core.context.KeyTag<T> p0, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Object>> p1) {
            com.zettle.sdk.core.context.ZettleContextFactory orThrow;
            java.util.List<? extends java.lang.Object> emptyList;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            synchronized (com.zettle.sdk.core.context.ZettleContextImplPublic.this) {
                orThrow = com.zettle.sdk.core.context.ZettleContextImplExtKt.getOrThrow(this.getHighSpeedVideoFpsRangesFor, p0.getValue());
            }
            if (p1 == null || (emptyList = p1.invoke()) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            return (T) orThrow.onCreate(this, com.zettle.sdk.core.context.ZettleContextParameters.INSTANCE.of(emptyList));
        }

        @Override // com.zettle.sdk.core.context.ZettleGlobalContextContainer
        public final boolean has(com.zettle.sdk.core.context.KeyTag<?> p0) {
            boolean containsKey;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            synchronized (com.zettle.sdk.core.context.ZettleContextImplPublic.this) {
                containsKey = this.getHighSpeedVideoFpsRangesFor.containsKey(p0.getValue());
            }
            return containsKey;
        }

        @Override // com.zettle.sdk.core.context.ZettleGlobalContext.Builder
        public final <T> com.zettle.sdk.core.context.ZettleGlobalContext.Initializer factory(com.zettle.sdk.core.context.KeyTag<T> p0, kotlin.jvm.functions.Function2<? super com.zettle.sdk.core.context.ZettleGlobalContextContainer, ? super com.zettle.sdk.core.context.ZettleContextParameters, ? extends T> p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            if (!com.zettle.sdk.core.context.ZettleContextImplPublic.this.getHighSpeedVideoFpsRangesFor) {
                synchronized (com.zettle.sdk.core.context.ZettleContextImplPublic.this) {
                    com.zettle.sdk.core.context.ZettleContextImplExtKt.putOrThrowIfExist(this.getHighSpeedVideoFpsRangesFor, p0.getValue(), new com.zettle.sdk.core.context.Factory(p1));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                return this;
            }
            throw new java.lang.IllegalStateException("ZettleGlobalContext is sealed");
        }

        @Override // com.zettle.sdk.core.context.ZettleGlobalContext.Initializer
        public final void seal() {
            if (!com.zettle.sdk.core.context.ZettleContextImplPublic.this.getHighSpeedVideoFpsRangesFor) {
                com.zettle.sdk.core.context.ZettleContextImplPublic zettleContextImplPublic = com.zettle.sdk.core.context.ZettleContextImplPublic.this;
                synchronized (zettleContextImplPublic) {
                    zettleContextImplPublic.getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.toMap(this.getHighSpeedVideoFpsRangesFor);
                    zettleContextImplPublic.getHighSpeedVideoFpsRangesFor = true;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                return;
            }
            throw new java.lang.IllegalStateException("ZettleGlobalContext is sealed");
        }

        @Override // com.zettle.sdk.core.context.ZettleGlobalContext.Builder
        public final <T> com.zettle.sdk.core.context.ZettleGlobalContext.Initializer single(com.zettle.sdk.core.context.KeyTag<T> p0, kotlin.jvm.functions.Function2<? super com.zettle.sdk.core.context.ZettleGlobalContextContainer, ? super com.zettle.sdk.core.context.ZettleContextParameters, ? extends T> p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            if (!com.zettle.sdk.core.context.ZettleContextImplPublic.this.getHighSpeedVideoFpsRangesFor) {
                synchronized (com.zettle.sdk.core.context.ZettleContextImplPublic.this) {
                    com.zettle.sdk.core.context.ZettleContextImplExtKt.putOrThrowIfExist(this.getHighSpeedVideoFpsRangesFor, p0.getValue(), new com.zettle.sdk.core.context.Single(p1));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                return this;
            }
            throw new java.lang.IllegalStateException("ZettleGlobalContext is sealed");
        }
    }

    @Override // com.zettle.sdk.core.context.ZettleGlobalContextContainer
    public final <T> T get(com.zettle.sdk.core.context.KeyTag<T> key, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Object>> parameters) {
        com.zettle.sdk.core.context.ZettleContextFactory orThrow;
        java.util.List<? extends java.lang.Object> emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (this.getHighSpeedVideoFpsRangesFor) {
            synchronized (this) {
                java.util.Map<java.lang.String, ? extends com.zettle.sdk.core.context.ZettleContextFactory<?>> map = this.getHighSpeedVideoFpsRanges;
                if (map == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    map = null;
                }
                orThrow = com.zettle.sdk.core.context.ZettleContextImplExtKt.getOrThrow(map, key.getValue());
            }
            if (parameters == null || (emptyList = parameters.invoke()) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            return (T) orThrow.onCreate(this, com.zettle.sdk.core.context.ZettleContextParameters.INSTANCE.of(emptyList));
        }
        throw new java.lang.IllegalStateException("ZettleGlobalContext is yet not sealed");
    }

    @Override // com.zettle.sdk.core.context.ZettleGlobalContextContainer
    public final boolean has(com.zettle.sdk.core.context.KeyTag<?> key) {
        boolean containsKey;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (this.getHighSpeedVideoFpsRangesFor) {
            synchronized (this) {
                java.util.Map<java.lang.String, ? extends com.zettle.sdk.core.context.ZettleContextFactory<?>> map = this.getHighSpeedVideoFpsRanges;
                if (map == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    map = null;
                }
                containsKey = map.containsKey(key.getValue());
            }
            return containsKey;
        }
        throw new java.lang.IllegalStateException("ZettleGlobalContext is yet not sealed");
    }
}
