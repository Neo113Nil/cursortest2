package com.zettle.sdk.feature.taptopay.core.attestation;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0096\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012=\b\u0002\u0010\u001e\u001a7\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018¢\u0006\u0002\b\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001c0\u0017j\b\u0012\u0004\u0012\u00020\u0019`\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010%\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010-R\u0014\u0010.\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010*\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u0014\u0010(\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00101\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u00103\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010:R\u0014\u00108\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0017X\u0096\u0004¢\u0006\u0006\n\u0004\b(\u0010A"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "p0", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationLoginUseCase;", "p1", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationLogoutUseCase;", "p2", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/ConfirmResetProvisionUseCase;", "p3", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationUseCase;", "p4", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/FullAttestationUseCase;", "p5", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalytics;", "p6", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationHerdAnalytics;", "p7", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsCheckUseCase;", "p8", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationResetCacheUseCase;", "p9", "Lkotlin/Function1;", "Lkotlin/Function2;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "", "Lkotlin/ParameterName;", "Lcom/zettle/sdk/commons/state/MutableState;", "Lcom/zettle/sdk/feature/taptopay/core/StateFactory;", "p10", "<init>", "(Lcom/zettle/sdk/commons/thread/EventsLoop;Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationLoginUseCase;Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationLogoutUseCase;Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/ConfirmResetProvisionUseCase;Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationUseCase;Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/FullAttestationUseCase;Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalytics;Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationHerdAnalytics;Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsCheckUseCase;Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationResetCacheUseCase;Lkotlin/jvm/functions/Function1;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action;", "action", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Attest$DoAttestation;", "getHighSpeedVideoFpsRangesFor", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$Attest$DoAttestation;)Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$LogIn;", "getHighSpeedVideoFpsRanges", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$Action$LogIn;)Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation$State;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalytics;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationHerdAnalytics;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationLoginUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationLogoutUseCase;", "getInputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsCheckUseCase;", "getInputFormats", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationResetCacheUseCase;", "getOutputFormats", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationUseCase;", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/ConfirmResetProvisionUseCase;", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "getOutputMinFrameDurationlomOqCM", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/FullAttestationUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationImpl$listener$1;", "getOutputStallDurationlomOqCM", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationImpl$listener$1;", "getOutputStallDuration", "Lcom/zettle/sdk/commons/state/MutableState;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class AttestationImpl implements com.zettle.sdk.feature.taptopay.core.attestation.Attestation, com.zettle.sdk.core.log.Loggable {
    private final com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationLoginUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationLogoutUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State> getOutputMinFrameDurationlomOqCM;
    private final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationHerdAnalytics getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalytics getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.attestation.usecase.ConfirmResetProvisionUseCase getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationResetCacheUseCase getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsCheckUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationUseCase getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.thread.EventsLoop getInputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.attestation.usecase.FullAttestationUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl$listener$1 getOutputStallDuration;

    /* JADX WARN: Type inference failed for: r2v4, types: [com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl$listener$1] */
    public AttestationImpl(com.zettle.sdk.commons.thread.EventsLoop eventsLoop, com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationLoginUseCase attestationLoginUseCase, com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationLogoutUseCase attestationLogoutUseCase, com.zettle.sdk.feature.taptopay.core.attestation.usecase.ConfirmResetProvisionUseCase confirmResetProvisionUseCase, com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationUseCase attestationUseCase, com.zettle.sdk.feature.taptopay.core.attestation.usecase.FullAttestationUseCase fullAttestationUseCase, com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalytics attestationAnalytics, com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationHerdAnalytics attestationHerdAnalytics, com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsCheckUseCase attestationRequirementsCheckUseCase, com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationResetCacheUseCase attestationResetCacheUseCase, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function2<? super com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State, ? super com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State, kotlin.Unit>, ? extends com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationLoginUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationLogoutUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmResetProvisionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullAttestationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationAnalytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationHerdAnalytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationRequirementsCheckUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationResetCacheUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getInputFormats = eventsLoop;
        this.Camera2StreamConfigurationMap = attestationLoginUseCase;
        this.getHighSpeedVideoSizes = attestationLogoutUseCase;
        this.getInputSizeshNQ4ISI = confirmResetProvisionUseCase;
        this.getOutputMinFrameDuration = attestationUseCase;
        this.getHighSpeedVideoSizesFor = fullAttestationUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = attestationAnalytics;
        this.getHighSpeedVideoFpsRangesFor = attestationHerdAnalytics;
        this.getHighSpeedVideoFpsRanges = attestationRequirementsCheckUseCase;
        this.getOutputFormats = attestationResetCacheUseCase;
        this.getOutputMinFrameDurationlomOqCM = function1.invoke(new com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl$state$1(this));
        this.getOutputStallDuration = new com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener() { // from class: com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl$listener$1
            @Override // com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener
            public final void onAttestationFinished(com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult attestationResult, java.util.List<com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction> recommendedActions) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationResult, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedActions, "");
                if (attestationResult instanceof com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult.AttestationOK) {
                    com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl.this.action(com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.SucceedAttestation.INSTANCE);
                } else if (attestationResult instanceof com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason) {
                    com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl.this.action(new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.FailAttestation((com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason) attestationResult, recommendedActions));
                }
            }
        };
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    public /* synthetic */ AttestationImpl(com.zettle.sdk.commons.thread.EventsLoop eventsLoop, com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationLoginUseCase attestationLoginUseCase, com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationLogoutUseCase attestationLogoutUseCase, com.zettle.sdk.feature.taptopay.core.attestation.usecase.ConfirmResetProvisionUseCase confirmResetProvisionUseCase, com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationUseCase attestationUseCase, com.zettle.sdk.feature.taptopay.core.attestation.usecase.FullAttestationUseCase fullAttestationUseCase, com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalytics attestationAnalytics, com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationHerdAnalytics attestationHerdAnalytics, com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsCheckUseCase attestationRequirementsCheckUseCase, com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationResetCacheUseCase attestationResetCacheUseCase, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(eventsLoop, attestationLoginUseCase, attestationLogoutUseCase, confirmResetProvisionUseCase, attestationUseCase, fullAttestationUseCase, attestationAnalytics, attestationHerdAnalytics, attestationRequirementsCheckUseCase, attestationResetCacheUseCase, (i & 1024) != 0 ? new kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function2<? super com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State, ? super com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State, ? extends kotlin.Unit>, com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State>>() { // from class: com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl.1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State> invoke(kotlin.jvm.functions.Function2<? super com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State, ? super com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State, kotlin.Unit> function2) {
                return com.zettle.sdk.commons.state.MutableState.INSTANCE.create(com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Ready.INSTANCE, function2);
            }
        } : function1);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.attestation.Attestation
    public final void action(final com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getInputFormats.post(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl$action$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoFpsRangesFor();
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor() {
                com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State> mutableState = com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl.this.getOutputMinFrameDurationlomOqCM;
                final com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl attestationImpl = com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl.this;
                final com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action action = p0;
                mutableState.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State, com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State>() { // from class: com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl$action$1.1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State invoke(com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State state) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
                        com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State highSpeedVideoFpsRanges = com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl.getHighSpeedVideoFpsRanges(com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl.this, state, action);
                        com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl attestationImpl2 = com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl.this;
                        com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action action2 = action;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Action: ");
                        sb.append(action2);
                        sb.append(" State: ");
                        sb.append(state);
                        sb.append(" -> ");
                        sb.append(highSpeedVideoFpsRanges);
                        sb.append(" ");
                        com.zettle.sdk.core.log.LogKt.debug(attestationImpl2, sb.toString());
                        return highSpeedVideoFpsRanges;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State getHighSpeedVideoFpsRangesFor(com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.DoAttestation p0) {
        com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult invoke = this.getHighSpeedVideoFpsRanges.invoke();
        if (invoke instanceof com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.AttestationRequirementsOk) {
            return new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress(p0.getContext(), p0.getTransactionInfo());
        }
        if (invoke instanceof com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.DeveloperOptionsDetected) {
            com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction = new com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction("android.settings.APPLICATION_DEVELOPMENT_SETTINGS", false, "Developer options detected", 0, "", "");
            return new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed(new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DeveloperOptionsDetected(recommendedAction), kotlin.collections.CollectionsKt.listOf(recommendedAction));
        }
        if (invoke instanceof com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.RequiredPermissionsMissing) {
            return new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed(new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.RequiredPermissionsMissing(new com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction("android.settings.APPLICATION_DETAILS_SETTINGS", false, "Missing required permission", 0, "", "")), null, 2, null);
        }
        if (invoke instanceof com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.NotInitialised) {
            return new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed(com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NotInit.INSTANCE, null, 2, null);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private final com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State getHighSpeedVideoFpsRanges(com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogIn p0) {
        com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult invoke = this.Camera2StreamConfigurationMap.invoke(p0.getContext(), p0.getOrganizationId());
        this.getHighResolutionOutputSizeshNQ4ISI.getAttestationAnalyticsLoginUseCase().invoke2(invoke, p0.getOrganizationId());
        if (invoke instanceof com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult.AttestationOK) {
            return com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Ready.INSTANCE;
        }
        if (!(invoke instanceof com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason errorReason = (com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason) invoke;
        return errorReason instanceof com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DifferentUserIdentifier ? new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.ResetProvision(p0.getContext(), p0.getOrganizationId()) : new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed(errorReason, kotlin.collections.CollectionsKt.emptyList());
    }

    public static final /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl attestationImpl, com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State state, com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State state2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(state);
        sb.append(" -> ");
        sb.append(state2);
        com.zettle.sdk.core.log.LogKt.debug(attestationImpl, sb.toString());
        attestationImpl.getHighSpeedVideoFpsRangesFor.track(state, state2);
        boolean z = state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed;
        if (z && (state2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.InAttestationIdle)) {
            attestationImpl.getOutputFormats.invoke();
        }
        if (((state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.LoggedOut) || (state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.NotReady) || (state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Ready) || (state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Succeeded) || z) && (state2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.ResetProvision)) {
            com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.ResetProvision resetProvision = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.ResetProvision) state2;
            attestationImpl.getInputSizeshNQ4ISI.invoke(resetProvision.getContext(), resetProvision.getOrganizationId());
            attestationImpl.getHighResolutionOutputSizeshNQ4ISI.getAttestationAnalyticsResetProvisionUseCase().invoke2(resetProvision.getOrganizationId());
            attestationImpl.action(new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.DoAttestation(resetProvision.getContext(), null, 2, null));
        }
        boolean z2 = state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.InAttestationIdle;
        if (z2 && (state2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.LoggedOut)) {
            attestationImpl.getHighResolutionOutputSizeshNQ4ISI.getAttestationAnalyticsLogoutUseCase().invoke2(((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.LoggedOut) state2).getContext());
            attestationImpl.getHighSpeedVideoSizes.invoke();
        }
        if (z2 && (state2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress)) {
            if (state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.ResetProvision) {
                com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress inProgress = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress) state2;
                attestationImpl.getHighResolutionOutputSizeshNQ4ISI.getAttestationAnalyticsFullStartedUseCase().invoke(inProgress.getContext(), true, true);
                attestationImpl.getHighSpeedVideoSizesFor.invoke(inProgress.getContext(), true, true, (com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener) attestationImpl.getOutputStallDuration);
            } else {
                com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress inProgress2 = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress) state2;
                attestationImpl.getOutputMinFrameDuration.invoke(inProgress2.getContext(), (com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener) attestationImpl.getOutputStallDuration);
                attestationImpl.getHighResolutionOutputSizeshNQ4ISI.getAttestationAnalyticsStartedUseCase().invoke2(inProgress2.getContext(), inProgress2.getInfo());
            }
        }
        boolean z3 = state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress;
        if (z3 && (state2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Succeeded)) {
            com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress inProgress3 = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress) state;
            attestationImpl.getHighResolutionOutputSizeshNQ4ISI.getAttestationAnalyticsEndedUseCase().invoke2(inProgress3.getContext(), inProgress3.getInfo(), (com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult) com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult.AttestationOK.INSTANCE);
        }
        if (z3 && (state2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed)) {
            com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed failed = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed) state2;
            if (failed.getReason() instanceof com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.Abort) {
                return;
            }
            com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress inProgress4 = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress) state;
            attestationImpl.getHighResolutionOutputSizeshNQ4ISI.getAttestationAnalyticsEndedUseCase().invoke2(inProgress4.getContext(), inProgress4.getInfo(), (com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult) failed.getReason());
        }
    }

    public static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State getHighSpeedVideoFpsRanges(com.zettle.sdk.feature.taptopay.core.attestation.AttestationImpl attestationImpl, com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State state, com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action action) {
        if (!(state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.NotReady)) {
            if (state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.LoggedIn) {
                return state;
            }
            if (!(state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Ready)) {
                if (!(state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress)) {
                    if (!(state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Succeeded)) {
                        if (!(state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed)) {
                            if (!(state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.LoggedOut)) {
                                if (!(state instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.ResetProvision)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.ResetProvision resetProvision = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.ResetProvision) state;
                                if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.DoAttestation) {
                                    return attestationImpl.getHighSpeedVideoFpsRangesFor((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.DoAttestation) action);
                                }
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Currently at ");
                                sb.append(resetProvision);
                                sb.append(" and the action = ");
                                sb.append(action);
                                sb.append(" is not handled");
                                com.zettle.sdk.core.log.LogKt.warn$default(attestationImpl, sb.toString(), null, 2, null);
                                return resetProvision;
                            }
                            com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.LoggedOut loggedOut = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.LoggedOut) state;
                            if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogIn) {
                                return attestationImpl.getHighSpeedVideoFpsRanges((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogIn) action);
                            }
                            if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.DoAttestation) {
                                return attestationImpl.getHighSpeedVideoFpsRangesFor((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.DoAttestation) action);
                            }
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Currently at ");
                            sb2.append(loggedOut);
                            sb2.append(" and the action = ");
                            sb2.append(action);
                            sb2.append(" is not handled");
                            com.zettle.sdk.core.log.LogKt.warn$default(attestationImpl, sb2.toString(), null, 2, null);
                            return loggedOut;
                        }
                        com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed failed = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed) state;
                        if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Stop) {
                            return com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Ready.INSTANCE;
                        }
                        if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogOut) {
                            return new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.LoggedOut(((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogOut) action).getContext());
                        }
                        if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogIn) {
                            return attestationImpl.getHighSpeedVideoFpsRanges((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogIn) action);
                        }
                        if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.DoAttestation) {
                            return attestationImpl.getHighSpeedVideoFpsRangesFor((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.DoAttestation) action);
                        }
                        if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.SucceedAttestation) {
                            return com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Succeeded.INSTANCE;
                        }
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Currently at ");
                        sb3.append(failed);
                        sb3.append(" and the action = ");
                        sb3.append(action);
                        sb3.append(" is not handled");
                        com.zettle.sdk.core.log.LogKt.warn$default(attestationImpl, sb3.toString(), null, 2, null);
                        return failed;
                    }
                    com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Succeeded succeeded = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Succeeded) state;
                    if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Stop) {
                        return com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Ready.INSTANCE;
                    }
                    if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogOut) {
                        return new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.LoggedOut(((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogOut) action).getContext());
                    }
                    if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogIn) {
                        return attestationImpl.getHighSpeedVideoFpsRanges((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogIn) action);
                    }
                    if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.DoAttestation) {
                        return attestationImpl.getHighSpeedVideoFpsRangesFor((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.DoAttestation) action);
                    }
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Currently at ");
                    sb4.append(succeeded);
                    sb4.append(" and the action = ");
                    sb4.append(action);
                    sb4.append(" is not handled");
                    com.zettle.sdk.core.log.LogKt.warn$default(attestationImpl, sb4.toString(), null, 2, null);
                    return succeeded;
                }
                com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress inProgress = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.InProgress) state;
                if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest) {
                    com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest attest = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest) action;
                    if (attest instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.SucceedAttestation) {
                        return com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Succeeded.INSTANCE;
                    }
                    if (attest instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.FailAttestation) {
                        com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.FailAttestation failAttestation = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.FailAttestation) action;
                        return new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed(failAttestation.getReason(), failAttestation.getRecommendedActions());
                    }
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Currently at ");
                    sb5.append(inProgress);
                    sb5.append(" and the action = ");
                    sb5.append(action);
                    sb5.append(" is not handled");
                    com.zettle.sdk.core.log.LogKt.warn$default(attestationImpl, sb5.toString(), null, 2, null);
                    return inProgress;
                }
                if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Stop) {
                    return new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Failed(com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.Abort.INSTANCE, null, 2, null);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Currently at ");
                sb6.append(inProgress);
                sb6.append(" and the action = ");
                sb6.append(action);
                sb6.append(" is not handled");
                com.zettle.sdk.core.log.LogKt.warn$default(attestationImpl, sb6.toString(), null, 2, null);
                return inProgress;
            }
            com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Ready ready = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.Ready) state;
            if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogOut) {
                return new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.LoggedOut(((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogOut) action).getContext());
            }
            if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogIn) {
                return attestationImpl.getHighSpeedVideoFpsRanges((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogIn) action);
            }
            if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.DoAttestation) {
                return attestationImpl.getHighSpeedVideoFpsRangesFor((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.Attest.DoAttestation) action);
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Currently at ");
            sb7.append(ready);
            sb7.append(" and the action = ");
            sb7.append(action);
            sb7.append(" is not handled");
            com.zettle.sdk.core.log.LogKt.warn$default(attestationImpl, sb7.toString(), null, 2, null);
            return ready;
        }
        com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.NotReady notReady = (com.zettle.sdk.feature.taptopay.core.attestation.Attestation.State.NotReady) state;
        if (action instanceof com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogIn) {
            return attestationImpl.getHighSpeedVideoFpsRanges((com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogIn) action);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Currently at ");
        sb8.append(notReady);
        sb8.append(" and the action = ");
        sb8.append(action);
        sb8.append(" is not handled");
        com.zettle.sdk.core.log.LogKt.warn$default(attestationImpl, sb8.toString(), null, 2, null);
        return notReady;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.attestation.Attestation
    public final /* bridge */ /* synthetic */ com.zettle.sdk.commons.state.State getState() {
        return this.getOutputMinFrameDurationlomOqCM;
    }
}
