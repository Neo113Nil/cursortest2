package com.google.net.cronet.okhttptransport;

/* loaded from: classes4.dex */
public abstract class RequestResponseConverterBasedBuilder<SubBuilderT extends com.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder<?, ? extends ObjectBeingBuiltT>, ObjectBeingBuiltT> {
    private final com.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder castedThis;
    private final org.chromium.net.CronetEngine cronetEngine;
    private int uploadDataProviderExecutorSize = 4;
    private com.google.net.cronet.okhttptransport.RedirectStrategy redirectStrategy = null;

    abstract java.lang.Object build(com.google.net.cronet.okhttptransport.RequestResponseConverter requestResponseConverter);

    RequestResponseConverterBasedBuilder(org.chromium.net.CronetEngine cronetEngine, java.lang.Class cls) {
        this.cronetEngine = (org.chromium.net.CronetEngine) com.google.common.base.Preconditions.checkNotNull(cronetEngine);
        com.google.common.base.Preconditions.checkArgument(getClass().equals(cls));
        this.castedThis = this;
    }

    public final SubBuilderT setUploadDataProviderExecutorSize(int i) {
        com.google.common.base.Preconditions.checkArgument(i > 0, "The number of threads must be positive!");
        this.uploadDataProviderExecutorSize = i;
        return (SubBuilderT) this.castedThis;
    }

    public final SubBuilderT setRedirectStrategy(com.google.net.cronet.okhttptransport.RedirectStrategy redirectStrategy) {
        com.google.common.base.Preconditions.checkNotNull(redirectStrategy);
        this.redirectStrategy = redirectStrategy;
        return (SubBuilderT) this.castedThis;
    }

    public final ObjectBeingBuiltT build() {
        if (this.redirectStrategy == null) {
            this.redirectStrategy = com.google.net.cronet.okhttptransport.RedirectStrategy.defaultStrategy();
        }
        return (ObjectBeingBuiltT) build(new com.google.net.cronet.okhttptransport.RequestResponseConverter(this.cronetEngine, java.util.concurrent.Executors.newFixedThreadPool(this.uploadDataProviderExecutorSize), com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.create(java.util.concurrent.Executors.newCachedThreadPool()), new com.google.net.cronet.okhttptransport.ResponseConverter(), this.redirectStrategy));
    }
}
