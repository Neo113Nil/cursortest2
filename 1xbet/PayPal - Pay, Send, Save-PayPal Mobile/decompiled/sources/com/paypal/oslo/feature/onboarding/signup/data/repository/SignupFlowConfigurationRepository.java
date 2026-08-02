package com.paypal.oslo.feature.onboarding.signup.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupFlowConfigurationRepository;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/FlowConfigurationRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "loadFlow-k3UT_Go", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFlow", "getCachedFlow", "()Ljava/util/List;", "currentStep", "", "calculateProgressStatus-DJJLKbI", "(Ljava/lang/String;)I", "calculateProgressStatus", "Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupFlowConfigurationRepository$CacheEntry;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupFlowConfigurationRepository$CacheEntry;", "Camera2StreamConfigurationMap", "Companion", "CacheEntry"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupFlowConfigurationRepository implements com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository.CacheEntry Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public SignupFlowConfigurationRepository() {
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00058\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00078\u0007¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupFlowConfigurationRepository$CacheEntry;", "", "", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "p0", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", "p1", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "p2", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class CacheEntry {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final java.util.List<com.paypal.oslo.feature.onboarding.api.steps.domain.StepId> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final java.lang.String Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoSizes;

        private CacheEntry(java.util.List<com.paypal.oslo.feature.onboarding.api.steps.domain.StepId> list, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.getHighSpeedVideoFpsRangesFor = list;
            this.getHighSpeedVideoSizes = str;
            this.Camera2StreamConfigurationMap = str2;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.onboarding.api.steps.domain.StepId> list = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String m16025toStringimpl = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16025toStringimpl(this.getHighSpeedVideoSizes);
            java.lang.String m11368toStringimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(this.Camera2StreamConfigurationMap);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CacheEntry(getHighSpeedVideoFpsRangesFor=");
            sb.append(list);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(m16025toStringimpl);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(m11368toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16024hashCodeimpl(this.getHighSpeedVideoSizes)) * 31) + com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(this.Camera2StreamConfigurationMap);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository.CacheEntry)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository.CacheEntry cacheEntry = (com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository.CacheEntry) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, cacheEntry.getHighSpeedVideoFpsRangesFor) && com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16023equalsimpl0(this.getHighSpeedVideoSizes, cacheEntry.getHighSpeedVideoSizes) && com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(this.Camera2StreamConfigurationMap, cacheEntry.Camera2StreamConfigurationMap);
        }

        public /* synthetic */ CacheEntry(java.util.List list, java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, str2);
        }
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository
    /* renamed from: loadFlow-k3UT_Go, reason: not valid java name */
    public final java.lang.Object mo16274loadFlowk3UT_Go(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.onboarding.api.steps.domain.StepId>> continuation) {
        java.util.Map map;
        java.util.Map map2;
        com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository.CacheEntry cacheEntry = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (cacheEntry != null) {
            if (!com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16023equalsimpl0(cacheEntry.getHighSpeedVideoSizes, str) || !com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(cacheEntry.Camera2StreamConfigurationMap, str2)) {
                cacheEntry = null;
            }
            if (cacheEntry != null) {
                return cacheEntry.getHighSpeedVideoFpsRangesFor;
            }
        }
        map = com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepositoryKt.getHighResolutionOutputSizeshNQ4ISI;
        java.util.List list = (java.util.List) map.get(com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16020boximpl(str));
        if (list == null) {
            map2 = com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepositoryKt.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(map2.keySet(), ", ", null, null, 0, null, new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId, java.lang.CharSequence>() { // from class: com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository$buildSignupFlow$flowConfig$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.CharSequence invoke(com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId flowId) {
                    java.lang.String m16026unboximpl = flowId.m16026unboximpl();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m16026unboximpl, "");
                    return m16026unboximpl;
                }
            }, 30, null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown signup flow. flowId: ");
            sb.append(str);
            sb.append(", validFlowIds: [");
            sb.append(joinToString$default);
            sb.append("]");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.paypal.oslo.feature.onboarding.signup.data.model.StepRequirement) obj).m16229isRequiredFortgPz1l0(str2)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16029boximpl(((com.paypal.oslo.feature.onboarding.signup.data.model.StepRequirement) it.next()).m16228getStepIdeVUBM90()));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        this.Camera2StreamConfigurationMap = new com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository.CacheEntry(arrayList4, str, str2, defaultConstructorMarker);
        return arrayList4;
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository
    public final java.util.List<com.paypal.oslo.feature.onboarding.api.steps.domain.StepId> getCachedFlow() {
        com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository.CacheEntry cacheEntry = this.Camera2StreamConfigurationMap;
        if (cacheEntry != null) {
            return cacheEntry.getHighSpeedVideoFpsRangesFor;
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository
    /* renamed from: calculateProgressStatus-DJJLKbI, reason: not valid java name */
    public final int mo16273calculateProgressStatusDJJLKbI(java.lang.String currentStep) {
        java.util.List<com.paypal.oslo.feature.onboarding.api.steps.domain.StepId> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentStep, "");
        com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository.CacheEntry cacheEntry = this.Camera2StreamConfigurationMap;
        if (cacheEntry == null || (list = cacheEntry.getHighSpeedVideoFpsRangesFor) == null) {
            return 0;
        }
        int indexOf = list.indexOf(com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16029boximpl(currentStep));
        int size = list.size();
        if (indexOf >= 0) {
            return ((indexOf + 1) * 100) / size;
        }
        return 0;
    }
}
