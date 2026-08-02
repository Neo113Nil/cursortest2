package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/UpdatePrimaryPhoneViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;)V", "", "phoneId", "Lkotlinx/coroutines/flow/Flow;", "getPhoneCategory", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "getFilteredPhones", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdatePrimaryPhoneViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public UpdatePrimaryPhoneViewModel(com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighResolutionOutputSizeshNQ4ISI = userStore;
    }

    public final kotlinx.coroutines.flow.Flow<java.lang.String> getPhoneCategory(final java.lang.String phoneId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneId, "");
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = this.getHighResolutionOutputSizeshNQ4ISI.getUserState();
        return new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getPhoneCategory$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getPhoneCategory$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getPhoneCategory$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    T t;
                    com.paypal.oslo.core.userstore.model.User user;
                    if (continuation instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getPhoneCategory$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getPhoneCategory$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputFormats -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                                com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState : null;
                                java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> profilePhones = (profileLoaded == null || (user = profileLoaded.getUser()) == null) ? null : user.getProfilePhones();
                                if (profilePhones == null) {
                                    profilePhones = kotlin.collections.CollectionsKt.emptyList();
                                }
                                java.util.Iterator<T> it = profilePhones.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = (T) null;
                                        break;
                                    }
                                    t = it.next();
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.userstore.model.ProfilePhone) t).getId(), this.getHighSpeedVideoFpsRanges)) {
                                        break;
                                    }
                                }
                                com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = t;
                                java.lang.String mapPhoneTypeToCategory = profilePhone != null ? com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.mapPhoneTypeToCategory(profilePhone.getType()) : null;
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                anonymousClass1.getOutputFormats = 1;
                                if (flowCollector.emit(mapPhoneTypeToCategory, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj3 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getPhoneCategory$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getPhoneCategory$$inlined$map$1$2", f = "UpdatePrimaryPhoneViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getPhoneCategory$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
                    int getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputSizeshNQ4ISI = obj;
                        this.getOutputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getPhoneCategory$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, java.lang.String str) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                    this.getHighSpeedVideoFpsRanges = str;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getPhoneCategory$$inlined$map$1.AnonymousClass2(flowCollector, phoneId), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone>> getFilteredPhones(final java.lang.String phoneId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneId, "");
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = this.getHighResolutionOutputSizeshNQ4ISI.getUserState();
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<java.util.List<? extends com.paypal.oslo.core.userstore.model.ProfilePhone>>() { // from class: com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getFilteredPhones$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getFilteredPhones$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getFilteredPhones$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.util.List list;
                    com.paypal.oslo.core.userstore.model.User user;
                    if (continuation instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getFilteredPhones$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getFilteredPhones$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputFormats -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                                com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = null;
                                com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState : null;
                                java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> profilePhones = (profileLoaded == null || (user = profileLoaded.getUser()) == null) ? null : user.getProfilePhones();
                                if (profilePhones == null) {
                                    profilePhones = kotlin.collections.CollectionsKt.emptyList();
                                }
                                java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> list2 = profilePhones;
                                java.util.Iterator<T> it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    T next = it.next();
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.userstore.model.ProfilePhone) next).getId(), this.Camera2StreamConfigurationMap)) {
                                        profilePhone = next;
                                        break;
                                    }
                                }
                                com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone2 = profilePhone;
                                if (profilePhone2 == null) {
                                    list = kotlin.collections.CollectionsKt.emptyList();
                                } else {
                                    java.util.List arrayList = new java.util.ArrayList();
                                    for (T t : list2) {
                                        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone3 = (com.paypal.oslo.core.userstore.model.ProfilePhone) t;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(profilePhone3.getId(), this.Camera2StreamConfigurationMap) && profilePhone3.getType() == profilePhone2.getType()) {
                                            if (com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel.WhenMappings.$EnumSwitchMapping$0[profilePhone2.getType().ordinal()] != 1 || profilePhone3.getConfirmed()) {
                                                arrayList.add(t);
                                            }
                                        }
                                    }
                                    list = arrayList;
                                }
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                anonymousClass1.getInputFormats = 1;
                                if (flowCollector.emit(list, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getFilteredPhones$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getFilteredPhones$$inlined$map$1$2", f = "UpdatePrimaryPhoneViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getFilteredPhones$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                    int getInputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizesFor = obj;
                        this.getInputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getFilteredPhones$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, java.lang.String str) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    this.Camera2StreamConfigurationMap = str;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.oslo.core.userstore.model.ProfilePhone>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel$getFilteredPhones$$inlined$map$1.AnonymousClass2(flowCollector, phoneId), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.userstore.model.PhoneType.values().length];
            try {
                iArr[com.paypal.oslo.core.userstore.model.PhoneType.MOBILE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
