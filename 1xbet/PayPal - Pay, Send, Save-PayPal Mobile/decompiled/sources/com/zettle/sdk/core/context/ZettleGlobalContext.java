package com.zettle.sdk.core.context;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Aim to not use this since it is planned for removal.")
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u001c\u0010\u000b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0018\u00010\u0007j\u0004\u0018\u0001`\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/core/context/ZettleGlobalContext;", "Lcom/zettle/sdk/core/context/ZettleGlobalContextImpl;", "<init>", "()V", "T", "Lcom/zettle/sdk/core/context/KeyTag;", "key", "Lkotlin/Function0;", "", "", "Lcom/zettle/sdk/core/context/GetParameters;", "parameters", "get", "(Lcom/zettle/sdk/core/context/KeyTag;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "has", "(Lcom/zettle/sdk/core/context/KeyTag;)Z", "Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "initialize", "()Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/core/context/ZettleGlobalContextImpl;", "getHighSpeedVideoSizes", "Builder", "Initializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZettleGlobalContext implements com.zettle.sdk.core.context.ZettleGlobalContextImpl {
    public static final com.zettle.sdk.core.context.ZettleGlobalContext INSTANCE = new com.zettle.sdk.core.context.ZettleGlobalContext();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final com.zettle.sdk.core.context.ZettleGlobalContextImpl getHighSpeedVideoSizes = new com.zettle.sdk.core.context.ZettleContextImplInternal();

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JL\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032'\u0010\t\u001a#\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007¢\u0006\u0002\b\bH&¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032'\u0010\t\u001a#\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007¢\u0006\u0002\b\bH&¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lcom/zettle/sdk/core/context/ZettleGlobalContext$Builder;", "Lcom/zettle/sdk/core/context/ZettleGlobalContextContainer;", "T", "Lcom/zettle/sdk/core/context/KeyTag;", "key", "Lkotlin/Function2;", "Lcom/zettle/sdk/core/context/ZettleContextParameters;", "Lcom/zettle/sdk/core/context/FactoryBlock;", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "factory", "(Lcom/zettle/sdk/core/context/KeyTag;Lkotlin/jvm/functions/Function2;)Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "single"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Builder extends com.zettle.sdk.core.context.ZettleGlobalContextContainer {
        <T> com.zettle.sdk.core.context.ZettleGlobalContext.Initializer factory(com.zettle.sdk.core.context.KeyTag<T> key, kotlin.jvm.functions.Function2<? super com.zettle.sdk.core.context.ZettleGlobalContextContainer, ? super com.zettle.sdk.core.context.ZettleContextParameters, ? extends T> block);

        <T> com.zettle.sdk.core.context.ZettleGlobalContext.Initializer single(com.zettle.sdk.core.context.KeyTag<T> key, kotlin.jvm.functions.Function2<? super com.zettle.sdk.core.context.ZettleGlobalContextContainer, ? super com.zettle.sdk.core.context.ZettleContextParameters, ? extends T> block);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "Lcom/zettle/sdk/core/context/ZettleGlobalContext$Builder;", "", "seal", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Initializer extends com.zettle.sdk.core.context.ZettleGlobalContext.Builder {
        void seal();
    }

    private ZettleGlobalContext() {
    }

    @Override // com.zettle.sdk.core.context.ZettleGlobalContextImpl
    public final com.zettle.sdk.core.context.ZettleGlobalContext.Initializer initialize() {
        return getHighSpeedVideoSizes.initialize();
    }

    @Override // com.zettle.sdk.core.context.ZettleGlobalContextContainer
    public final <T> T get(com.zettle.sdk.core.context.KeyTag<T> key, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Object>> parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return (T) getHighSpeedVideoSizes.get(key, parameters);
    }

    @Override // com.zettle.sdk.core.context.ZettleGlobalContextContainer
    public final boolean has(com.zettle.sdk.core.context.KeyTag<?> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getHighSpeedVideoSizes.has(key);
    }
}
