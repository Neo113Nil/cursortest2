package com.zettle.sdk.core.context;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JC\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001e\b\u0002\u0010\b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/core/context/ZettleGlobalContextContainer;", "", "T", "Lcom/zettle/sdk/core/context/KeyTag;", "key", "Lkotlin/Function0;", "", "Lcom/zettle/sdk/core/context/GetParameters;", "parameters", "get", "(Lcom/zettle/sdk/core/context/KeyTag;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "has", "(Lcom/zettle/sdk/core/context/KeyTag;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ZettleGlobalContextContainer {
    <T> T get(com.zettle.sdk.core.context.KeyTag<T> key, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Object>> parameters);

    boolean has(com.zettle.sdk.core.context.KeyTag<?> key);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object get$default(com.zettle.sdk.core.context.ZettleGlobalContextContainer zettleGlobalContextContainer, com.zettle.sdk.core.context.KeyTag keyTag, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i & 2) != 0) {
                function0 = null;
            }
            return zettleGlobalContextContainer.get(keyTag, function0);
        }
    }
}
