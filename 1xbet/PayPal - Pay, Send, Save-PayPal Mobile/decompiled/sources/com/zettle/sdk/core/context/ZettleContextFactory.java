package com.zettle.sdk.core.context;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/context/ZettleContextFactory;", "T", "", "Lcom/zettle/sdk/core/context/ZettleGlobalContextContainer;", "container", "Lcom/zettle/sdk/core/context/ZettleContextParameters;", "parameters", "onCreate", "(Lcom/zettle/sdk/core/context/ZettleGlobalContextContainer;Lcom/zettle/sdk/core/context/ZettleContextParameters;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ZettleContextFactory<T> {
    T onCreate(com.zettle.sdk.core.context.ZettleGlobalContextContainer container, com.zettle.sdk.core.context.ZettleContextParameters parameters);
}
