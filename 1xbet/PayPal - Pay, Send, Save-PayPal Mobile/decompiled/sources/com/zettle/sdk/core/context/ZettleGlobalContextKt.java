package com.zettle.sdk.core.context;

@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010\t\u001a\u00020\b\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012)\b\b\u0010\u0007\u001a#\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0005¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aR\u0010\t\u001a\u00020\b\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2)\b\b\u0010\u0007\u001a#\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0005¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\r\u001a?\u0010\u0013\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00032\u001e\b\n\u0010\u0012\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aG\u0010\u0013\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u001e\b\n\u0010\u0012\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\u0016\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001aE\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00192\u001e\b\n\u0010\u0012\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aM\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\u001e\b\n\u0010\u0012\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001d\u001a$\u0010\u001f\u001a\u00020\b\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u001e\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u001f\u0010 \u001aJ\u0010\u001f\u001a\u00020\b\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012)\b\b\u0010\u0007\u001a#\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0005¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\n\u001aR\u0010\u001f\u001a\u00020\b\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2)\b\b\u0010\u0007\u001a#\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0005¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "Lcom/zettle/sdk/core/context/ZettleGlobalContext$Builder;", "Lkotlin/Function2;", "Lcom/zettle/sdk/core/context/ZettleGlobalContextContainer;", "Lcom/zettle/sdk/core/context/ZettleContextParameters;", "Lcom/zettle/sdk/core/context/FactoryBlock;", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "factory", "(Lcom/zettle/sdk/core/context/ZettleGlobalContext$Builder;Lkotlin/jvm/functions/Function2;)Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "", "tag", "(Lcom/zettle/sdk/core/context/ZettleGlobalContext$Builder;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "Lkotlin/Function0;", "", "", "Lcom/zettle/sdk/core/context/GetParameters;", "parameters", "get", "(Lcom/zettle/sdk/core/context/ZettleGlobalContextContainer;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lcom/zettle/sdk/core/context/ZettleGlobalContextContainer;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "has", "(Lcom/zettle/sdk/core/context/ZettleGlobalContextContainer;)Z", "Lcom/zettle/sdk/core/context/ZettleGlobalContext;", "Lkotlin/Lazy;", "inject", "(Lcom/zettle/sdk/core/context/ZettleGlobalContext;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "(Lcom/zettle/sdk/core/context/ZettleGlobalContext;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "single", "(Lcom/zettle/sdk/core/context/ZettleGlobalContext$Builder;Ljava/lang/Object;)Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ZettleGlobalContextKt {
    public static final /* synthetic */ <T> com.zettle.sdk.core.context.ZettleGlobalContext.Initializer single(com.zettle.sdk.core.context.ZettleGlobalContext.Builder builder, final T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.needClassReification();
        kotlin.jvm.functions.Function2<com.zettle.sdk.core.context.ZettleGlobalContextContainer, com.zettle.sdk.core.context.ZettleContextParameters, T> function2 = new kotlin.jvm.functions.Function2<com.zettle.sdk.core.context.ZettleGlobalContextContainer, com.zettle.sdk.core.context.ZettleContextParameters, T>() { // from class: com.zettle.sdk.core.context.ZettleGlobalContextKt$single$1
            @Override // kotlin.jvm.functions.Function2
            public final T invoke(com.zettle.sdk.core.context.ZettleGlobalContextContainer zettleGlobalContextContainer, com.zettle.sdk.core.context.ZettleContextParameters zettleContextParameters) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleGlobalContextContainer, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleContextParameters, "");
                return t;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        };
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return builder.single(new com.zettle.sdk.core.context.KeyTag<>(java.lang.Object.class), function2);
    }

    public static final /* synthetic */ <T> com.zettle.sdk.core.context.ZettleGlobalContext.Initializer single(com.zettle.sdk.core.context.ZettleGlobalContext.Builder builder, kotlin.jvm.functions.Function2<? super com.zettle.sdk.core.context.ZettleGlobalContextContainer, ? super com.zettle.sdk.core.context.ZettleContextParameters, ? extends T> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return builder.single(new com.zettle.sdk.core.context.KeyTag<>(java.lang.Object.class), function2);
    }

    public static final /* synthetic */ <T> com.zettle.sdk.core.context.ZettleGlobalContext.Initializer single(com.zettle.sdk.core.context.ZettleGlobalContext.Builder builder, java.lang.String str, kotlin.jvm.functions.Function2<? super com.zettle.sdk.core.context.ZettleGlobalContextContainer, ? super com.zettle.sdk.core.context.ZettleContextParameters, ? extends T> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return builder.single(new com.zettle.sdk.core.context.KeyTag<>(java.lang.Object.class, str), function2);
    }

    public static final /* synthetic */ <T> com.zettle.sdk.core.context.ZettleGlobalContext.Initializer factory(com.zettle.sdk.core.context.ZettleGlobalContext.Builder builder, kotlin.jvm.functions.Function2<? super com.zettle.sdk.core.context.ZettleGlobalContextContainer, ? super com.zettle.sdk.core.context.ZettleContextParameters, ? extends T> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return builder.factory(new com.zettle.sdk.core.context.KeyTag<>(java.lang.Object.class), function2);
    }

    public static final /* synthetic */ <T> com.zettle.sdk.core.context.ZettleGlobalContext.Initializer factory(com.zettle.sdk.core.context.ZettleGlobalContext.Builder builder, java.lang.String str, kotlin.jvm.functions.Function2<? super com.zettle.sdk.core.context.ZettleGlobalContextContainer, ? super com.zettle.sdk.core.context.ZettleContextParameters, ? extends T> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return builder.factory(new com.zettle.sdk.core.context.KeyTag<>(java.lang.Object.class, str), function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object get$default(com.zettle.sdk.core.context.ZettleGlobalContextContainer zettleGlobalContextContainer, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleGlobalContextContainer, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return zettleGlobalContextContainer.get(new com.zettle.sdk.core.context.KeyTag(java.lang.Object.class), function0);
    }

    public static final /* synthetic */ <T> T get(com.zettle.sdk.core.context.ZettleGlobalContextContainer zettleGlobalContextContainer, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Object>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleGlobalContextContainer, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) zettleGlobalContextContainer.get(new com.zettle.sdk.core.context.KeyTag<>(java.lang.Object.class), function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object get$default(com.zettle.sdk.core.context.ZettleGlobalContextContainer zettleGlobalContextContainer, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleGlobalContextContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return zettleGlobalContextContainer.get(new com.zettle.sdk.core.context.KeyTag(java.lang.Object.class, str), function0);
    }

    public static final /* synthetic */ <T> T get(com.zettle.sdk.core.context.ZettleGlobalContextContainer zettleGlobalContextContainer, java.lang.String str, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Object>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleGlobalContextContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) zettleGlobalContextContainer.get(new com.zettle.sdk.core.context.KeyTag<>(java.lang.Object.class, str), function0);
    }

    public static final /* synthetic */ <T> boolean has(com.zettle.sdk.core.context.ZettleGlobalContextContainer zettleGlobalContextContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleGlobalContextContainer, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return zettleGlobalContextContainer.has(new com.zettle.sdk.core.context.KeyTag<>(java.lang.Object.class));
    }

    public static /* synthetic */ kotlin.Lazy inject$default(com.zettle.sdk.core.context.ZettleGlobalContext zettleGlobalContext, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleGlobalContext, "");
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new com.zettle.sdk.core.context.ZettleGlobalContextKt$inject$1(zettleGlobalContext, function0));
    }

    public static final /* synthetic */ <T> kotlin.Lazy<T> inject(com.zettle.sdk.core.context.ZettleGlobalContext zettleGlobalContext, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Object>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleGlobalContext, "");
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new com.zettle.sdk.core.context.ZettleGlobalContextKt$inject$1(zettleGlobalContext, function0));
    }

    public static /* synthetic */ kotlin.Lazy inject$default(com.zettle.sdk.core.context.ZettleGlobalContext zettleGlobalContext, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleGlobalContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new com.zettle.sdk.core.context.ZettleGlobalContextKt$inject$2(zettleGlobalContext, str, function0));
    }

    public static final /* synthetic */ <T> kotlin.Lazy<T> inject(com.zettle.sdk.core.context.ZettleGlobalContext zettleGlobalContext, java.lang.String str, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Object>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleGlobalContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new com.zettle.sdk.core.context.ZettleGlobalContextKt$inject$2(zettleGlobalContext, str, function0));
    }
}
