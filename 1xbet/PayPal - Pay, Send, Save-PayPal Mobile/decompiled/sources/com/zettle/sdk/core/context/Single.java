package com.zettle.sdk.core.context;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0015B0\u0012'\u0010\b\u001a#\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0006¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR5\u0010\u0011\u001a#\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0006¢\u0006\u0002\b\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/core/context/Single;", "T", "Lcom/zettle/sdk/core/context/ZettleContextFactory;", "Lkotlin/Function2;", "Lcom/zettle/sdk/core/context/ZettleGlobalContextContainer;", "Lcom/zettle/sdk/core/context/ZettleContextParameters;", "Lcom/zettle/sdk/core/context/FactoryBlock;", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "container", "parameters", "onCreate", "(Lcom/zettle/sdk/core/context/ZettleGlobalContextContainer;Lcom/zettle/sdk/core/context/ZettleContextParameters;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRanges", "", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Single<T> implements com.zettle.sdk.core.context.ZettleContextFactory<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<com.zettle.sdk.core.context.ZettleGlobalContextContainer, com.zettle.sdk.core.context.ZettleContextParameters, T> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public Single(kotlin.jvm.functions.Function2<? super com.zettle.sdk.core.context.ZettleGlobalContextContainer, ? super com.zettle.sdk.core.context.ZettleContextParameters, ? extends T> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = com.zettle.sdk.core.context.Single.Companion.UninitializedValue.INSTANCE;
    }

    @Override // com.zettle.sdk.core.context.ZettleContextFactory
    public final T onCreate(com.zettle.sdk.core.context.ZettleGlobalContextContainer container, com.zettle.sdk.core.context.ZettleContextParameters parameters) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI != com.zettle.sdk.core.context.Single.Companion.UninitializedValue.INSTANCE) {
            return (T) this.getHighResolutionOutputSizeshNQ4ISI;
        }
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == com.zettle.sdk.core.context.Single.Companion.UninitializedValue.INSTANCE) {
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.invoke(container, parameters);
            }
            t = (T) this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return t;
    }
}
