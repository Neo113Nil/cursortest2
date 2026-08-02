package com.paypal.oslo.feature.cashin.ui.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0011\u0010\u001b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u001e\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/model/RetryErrorConfig;", "", "", "Lcom/paypal/oslo/feature/cashin/ui/model/RetryStageContent;", "stages", "<init>", "(Ljava/util/List;)V", "", "attemptNumber", "getStageForAttempt", "(I)Lcom/paypal/oslo/feature/cashin/ui/model/RetryStageContent;", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/cashin/ui/model/RetryErrorConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getStages", "getMaxRetries", "maxRetries", "getAllowsInfiniteRetries", "()Z", "allowsInfiniteRetries", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RetryErrorConfig {
    public static final int NO_DESCRIPTION_KEY = 0;
    private final java.util.List<com.paypal.oslo.feature.cashin.ui.model.RetryStageContent> stages;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig.Companion INSTANCE = new com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig.Companion(null);
    public static final int $stable = 8;
    private static final com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig Default = new com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cashin.ui.model.RetryStageContent[]{new com.paypal.oslo.feature.cashin.ui.model.RetryStageContent(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_interneterror_heading, com.paypal.oslo.feature.cashin.R.string.feature_cash_in_interneterror_messagetryagain, com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_buttontryagain, true), new com.paypal.oslo.feature.cashin.ui.model.RetryStageContent(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_heading, com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_messagetryagain, com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_buttontryagain, true), new com.paypal.oslo.feature.cashin.ui.model.RetryStageContent(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_heading, com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_messagetrymaxout, com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_buttonok, false)}));
    private static final com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig NoRetry = new com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.cashin.ui.model.RetryStageContent(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_heading, com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_messagetrymaxout, com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_buttonok, false)));
    private static final com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig Infinite = new com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.cashin.ui.model.RetryStageContent(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_heading, com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_messagetryagain, com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_buttontryagain, true)));
    private static final com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig FeatureDisabled = new com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.cashin.ui.model.RetryStageContent(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_featureunavailableerror_heading, 0, com.paypal.oslo.feature.cashin.R.string.feature_cash_in_featureunavailableerror_buttonok, false)));

    public RetryErrorConfig(java.util.List<com.paypal.oslo.feature.cashin.ui.model.RetryStageContent> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.stages = list;
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("At least one stage is required".toString());
        }
    }

    public final java.util.List<com.paypal.oslo.feature.cashin.ui.model.RetryStageContent> getStages() {
        return this.stages;
    }

    public final int getMaxRetries() {
        java.util.List<com.paypal.oslo.feature.cashin.ui.model.RetryStageContent> list = this.stages;
        int i = 0;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return 0;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((com.paypal.oslo.feature.cashin.ui.model.RetryStageContent) it.next()).getAllowsRetry() && (i = i + 1) < 0) {
                kotlin.collections.CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    public final boolean getAllowsInfiniteRetries() {
        java.util.List<com.paypal.oslo.feature.cashin.ui.model.RetryStageContent> list = this.stages;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((com.paypal.oslo.feature.cashin.ui.model.RetryStageContent) it.next()).getAllowsRetry()) {
                return false;
            }
        }
        return true;
    }

    public final com.paypal.oslo.feature.cashin.ui.model.RetryStageContent getStageForAttempt(int attemptNumber) {
        java.util.List<com.paypal.oslo.feature.cashin.ui.model.RetryStageContent> list = this.stages;
        return (attemptNumber < 0 || attemptNumber >= list.size()) ? (com.paypal.oslo.feature.cashin.ui.model.RetryStageContent) kotlin.collections.CollectionsKt.last((java.util.List) this.stages) : list.get(attemptNumber);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/model/RetryErrorConfig$Companion;", "", "<init>", "()V", "", "NO_DESCRIPTION_KEY", com.visa.cbp.getEncExpo.warmup, "Lcom/paypal/oslo/feature/cashin/ui/model/RetryErrorConfig;", "Default", "Lcom/paypal/oslo/feature/cashin/ui/model/RetryErrorConfig;", "getDefault", "()Lcom/paypal/oslo/feature/cashin/ui/model/RetryErrorConfig;", "NoRetry", "getNoRetry", "Infinite", "getInfinite", "FeatureDisabled", "getFeatureDisabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig getDefault() {
            return com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig.Default;
        }

        public final com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig getNoRetry() {
            return com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig.NoRetry;
        }

        public final com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig getInfinite() {
            return com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig.Infinite;
        }

        public final com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig getFeatureDisabled() {
            return com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig.FeatureDisabled;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.cashin.ui.model.RetryStageContent> list = this.stages;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryErrorConfig(stages=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.stages.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.stages, ((com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig) other).stages);
    }

    public final com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig copy(java.util.List<com.paypal.oslo.feature.cashin.ui.model.RetryStageContent> stages) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stages, "");
        return new com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig(stages);
    }

    public final java.util.List<com.paypal.oslo.feature.cashin.ui.model.RetryStageContent> component1() {
        return this.stages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig copy$default(com.paypal.oslo.feature.cashin.ui.model.RetryErrorConfig retryErrorConfig, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = retryErrorConfig.stages;
        }
        return retryErrorConfig.copy(list);
    }
}
