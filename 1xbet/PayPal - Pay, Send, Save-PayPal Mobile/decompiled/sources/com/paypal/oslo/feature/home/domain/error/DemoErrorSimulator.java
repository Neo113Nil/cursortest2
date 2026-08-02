package com.paypal.oslo.feature.home.domain.error;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0002\b\u0001\u0018\u0000 62\u00020\u0001:\u000276B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJL\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u0010\u001d2(\u0010!\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000 0\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001eH\u0086@¢\u0006\u0004\b\"\u0010#J)\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0$2\u0010\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0$¢\u0006\u0004\b'\u0010(J9\u0010,\u001a\b\u0012\u0004\u0012\u00020+0%2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020\fH\u0000¢\u0006\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0016058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00104"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator;", "", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "stringProvider", "<init>", "(Lcom/paypal/oslo/feature/home/domain/StringProvider;)V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "error", "", "setError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)V", "", "", "errorMap", "setSectionErrors", "(Ljava/util/Map;)V", "sectionId", "getErrorForSection", "(Ljava/lang/String;)Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "hasSectionErrors", "()Z", "", "maxRetryAttempts", "Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$RetryBehavior;", "getRetryBehavior", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$RetryBehavior;", "clearError", "()V", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Larrow/core/Ior;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "injectOrExecute", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "sections", "simulateSectionErrors", "(Ljava/util/List;)Ljava/util/List;", "exhausted", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "Lcom/paypal/oslo/feature/home/domain/model/SectionError;", "createSectionError$home_prodRelease", "(Ljava/lang/String;Lcom/paypal/oslo/core/network/graphql/error/CallError;ZLjava/lang/String;)Lcom/paypal/oslo/feature/home/domain/model/Section;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "", "Companion", "RetryBehavior"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DemoErrorSimulator {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.domain.StringProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Integer> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile com.paypal.oslo.core.network.graphql.error.CallError getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private volatile java.util.Map<java.lang.String, ? extends com.paypal.oslo.core.network.graphql.error.CallError> Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.Companion Companion = new com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public DemoErrorSimulator(com.paypal.oslo.feature.home.domain.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = stringProvider;
        this.Camera2StreamConfigurationMap = kotlin.collections.MapsKt.emptyMap();
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
    }

    public final void setError(com.paypal.oslo.core.network.graphql.error.CallError error) {
        this.getHighSpeedVideoSizes = error;
    }

    public final void setSectionErrors(java.util.Map<java.lang.String, ? extends com.paypal.oslo.core.network.graphql.error.CallError> errorMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMap, "");
        this.Camera2StreamConfigurationMap = errorMap;
    }

    public final com.paypal.oslo.core.network.graphql.error.CallError getErrorForSection(java.lang.String sectionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionId, "");
        return this.Camera2StreamConfigurationMap.get(sectionId);
    }

    public final boolean hasSectionErrors() {
        return !this.Camera2StreamConfigurationMap.isEmpty();
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior getRetryBehavior$default(com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator demoErrorSimulator, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        return demoErrorSimulator.getRetryBehavior(str, i);
    }

    public final com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior getRetryBehavior(java.lang.String sectionId, int maxRetryAttempts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionId, "");
        int intValue = this.getHighSpeedVideoFpsRanges.getOrDefault(sectionId, 0).intValue() + 1;
        this.getHighSpeedVideoFpsRanges.put(sectionId, java.lang.Integer.valueOf(intValue));
        com.paypal.oslo.core.network.graphql.error.CallError errorForSection = getErrorForSection(sectionId);
        boolean z = intValue >= maxRetryAttempts;
        if (kotlin.jvm.internal.Intrinsics.areEqual(sectionId, "welcome") && intValue >= maxRetryAttempts && errorForSection != null) {
            this.getHighSpeedVideoFpsRanges.remove(sectionId);
            return com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldSucceed.INSTANCE;
        }
        if (errorForSection != null) {
            return new com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldFail(errorForSection, z);
        }
        return com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.NoErrorConfigured.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$RetryBehavior;", "", "<init>", "()V", "ShouldSucceed", "ShouldFail", "NoErrorConfigured", "Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$RetryBehavior$NoErrorConfigured;", "Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$RetryBehavior$ShouldFail;", "Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$RetryBehavior$ShouldSucceed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static abstract class RetryBehavior {
        public static final int $stable = 0;

        private RetryBehavior() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$RetryBehavior$ShouldSucceed;", "Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$RetryBehavior;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ShouldSucceed extends com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldSucceed INSTANCE = new com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldSucceed();

            private ShouldSucceed() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$RetryBehavior$ShouldFail;", "Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$RetryBehavior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "error", "", "exhausted", "<init>", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;Z)V", "component1", "()Lcom/paypal/oslo/core/network/graphql/error/CallError;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;Z)Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$RetryBehavior$ShouldFail;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getError", "Z", "getExhausted"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShouldFail extends com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior {
            public static final int $stable = 8;
            private final com.paypal.oslo.core.network.graphql.error.CallError error;
            private final boolean exhausted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShouldFail(com.paypal.oslo.core.network.graphql.error.CallError callError, boolean z) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
                this.error = callError;
                this.exhausted = z;
            }

            public /* synthetic */ ShouldFail(com.paypal.oslo.core.network.graphql.error.CallError callError, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(callError, (i & 2) != 0 ? false : z);
            }

            public final com.paypal.oslo.core.network.graphql.error.CallError getError() {
                return this.error;
            }

            public final boolean getExhausted() {
                return this.exhausted;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.core.network.graphql.error.CallError callError = this.error;
                boolean z = this.exhausted;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ShouldFail(error=");
                sb.append(callError);
                sb.append(", exhausted=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.error.hashCode() * 31) + java.lang.Boolean.hashCode(this.exhausted);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldFail)) {
                    return false;
                }
                com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldFail shouldFail = (com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldFail) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.error, shouldFail.error) && this.exhausted == shouldFail.exhausted;
            }

            public final com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldFail copy(com.paypal.oslo.core.network.graphql.error.CallError error, boolean exhausted) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldFail(error, exhausted);
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getExhausted() {
                return this.exhausted;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.core.network.graphql.error.CallError getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldFail copy$default(com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldFail shouldFail, com.paypal.oslo.core.network.graphql.error.CallError callError, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    callError = shouldFail.error;
                }
                if ((i & 2) != 0) {
                    z = shouldFail.exhausted;
                }
                return shouldFail.copy(callError, z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$RetryBehavior$NoErrorConfigured;", "Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$RetryBehavior;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NoErrorConfigured extends com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.NoErrorConfigured INSTANCE = new com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.NoErrorConfigured();

            private NoErrorConfigured() {
                super(null);
            }
        }

        public /* synthetic */ RetryBehavior(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void clearError() {
        this.getHighSpeedVideoSizes = null;
        this.Camera2StreamConfigurationMap = kotlin.collections.MapsKt.emptyMap();
        this.getHighSpeedVideoFpsRanges.clear();
    }

    public final <T> java.lang.Object injectOrExecute(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends T>>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends T>> continuation) {
        com.paypal.oslo.core.network.graphql.error.CallError callError = this.getHighSpeedVideoSizes;
        if (callError != null) {
            return new arrow.core.Ior.Left(callError);
        }
        return function1.invoke(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> simulateSectionErrors(java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>> sections) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sections, "");
        if (this.Camera2StreamConfigurationMap.isEmpty()) {
            return sections;
        }
        java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>> list = sections;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.home.domain.model.Section section = (com.paypal.oslo.feature.home.domain.model.Section) it.next();
            com.paypal.oslo.core.network.graphql.error.CallError callError = this.Camera2StreamConfigurationMap.get(section.getId());
            if (callError != null) {
                section = createSectionError$home_prodRelease$default(this, section.getId(), callError, false, section.getType(), 4, null);
            }
            arrayList.add(section);
        }
        return arrayList;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.Section createSectionError$home_prodRelease$default(com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator demoErrorSimulator, java.lang.String str, com.paypal.oslo.core.network.graphql.error.CallError callError, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        return demoErrorSimulator.createSectionError$home_prodRelease(str, callError, z, str2);
    }

    public final com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.SectionError> createSectionError$home_prodRelease(java.lang.String sectionId, com.paypal.oslo.core.network.graphql.error.CallError error, boolean exhausted, java.lang.String sectionType) {
        java.lang.String unableToLoadSectionErrorMessage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionType, "");
        if (error instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error2 = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) error).getError();
            if (error2 instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                unableToLoadSectionErrorMessage = this.getHighResolutionOutputSizeshNQ4ISI.getNoInternetErrorMessage();
            } else if (error2 instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                unableToLoadSectionErrorMessage = this.getHighResolutionOutputSizeshNQ4ISI.getServiceUnavailableErrorMessage();
            } else {
                if (!(error2 instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                unableToLoadSectionErrorMessage = this.getHighResolutionOutputSizeshNQ4ISI.getUnableToLoadSectionErrorMessage();
            }
        } else {
            if (!(error instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            unableToLoadSectionErrorMessage = this.getHighResolutionOutputSizeshNQ4ISI.getUnableToLoadSectionErrorMessage();
        }
        return new com.paypal.oslo.feature.home.domain.model.Section<>(sectionId, "Error", (java.lang.String) null, (java.lang.String) null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.home.domain.model.SectionError(sectionId, sectionType, unableToLoadSectionErrorMessage, exhausted, error)), (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.home.domain.model.SectionInstrumentation) null, 192, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
