package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1", f = "EmailConfirmationViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, nl = {52}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class EmailConfirmationViewModel$loadUserEmails$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.userstore.UserStore userStore;
        java.util.ArrayList emptyList;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            userStore = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = userStore.getUserState();
            this.getHighSpeedVideoSizes = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1$invokeSuspend$$inlined$filterIsInstance$1

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                /* renamed from: com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.getOutputFormats -= 2147483648;
                                java.lang.Object obj2 = anonymousClass1.getOutputMinFrameDuration;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getOutputFormats;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                    if (obj instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                                        anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                        anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                        anonymousClass1.getOutputFormats = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                    java.lang.Object obj3 = anonymousClass1.Camera2StreamConfigurationMap;
                                    java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj22 = anonymousClass1.getOutputMinFrameDuration;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.getOutputFormats;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "EmailConfirmationViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                    /* renamed from: com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        java.lang.Object Camera2StreamConfigurationMap;
                        int getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object getHighSpeedVideoFpsRanges;
                        java.lang.Object getHighSpeedVideoFpsRangesFor;
                        java.lang.Object getHighSpeedVideoSizes;
                        int getOutputFormats;
                        /* synthetic */ java.lang.Object getOutputMinFrameDuration;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.getOutputMinFrameDuration = obj;
                            this.getOutputFormats |= Integer.MIN_VALUE;
                            return com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.this.emit(null, this);
                        }

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                        this.getHighSpeedVideoFpsRanges = flowCollector;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2(flowCollector), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                }
            }, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List<com.paypal.oslo.core.userstore.model.ProfileEmail> profileEmails = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) obj).getUser().getProfileEmails();
        if (profileEmails != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : profileEmails) {
                if (((com.paypal.oslo.core.userstore.model.ProfileEmail) obj2).getConfirmed()) {
                    arrayList.add(obj2);
                }
            }
            java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1$invokeSuspend$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Boolean.valueOf(((com.paypal.oslo.core.userstore.model.ProfileEmail) t2).getPrimary()), java.lang.Boolean.valueOf(((com.paypal.oslo.core.userstore.model.ProfileEmail) t).getPrimary()));
                }
            });
            if (sortedWith != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = sortedWith.iterator();
                while (it.hasNext()) {
                    java.lang.String emailAddress = ((com.paypal.oslo.core.userstore.model.ProfileEmail) it.next()).getEmailAddress();
                    if (emailAddress != null) {
                        arrayList2.add(emailAddress);
                    }
                }
                emptyList = arrayList2;
                mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                mutableStateFlow.setValue(emptyList);
                mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                if (mutableStateFlow2.getValue() == null && !emptyList.isEmpty()) {
                    mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                    mutableStateFlow3.setValue(kotlin.collections.CollectionsKt.first(emptyList));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        emptyList = kotlin.collections.CollectionsKt.emptyList();
        mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
        mutableStateFlow.setValue(emptyList);
        mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
        if (mutableStateFlow2.getValue() == null) {
            mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow3.setValue(kotlin.collections.CollectionsKt.first(emptyList));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailConfirmationViewModel$loadUserEmails$1(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel emailConfirmationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = emailConfirmationViewModel;
    }
}
