package com.paypal.oslo.feature.p2p.domain.search;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1", f = "P2PContactsSearchStrategy.kt", i = {0, 1, 2, 3, 3, 3, 4, 4, 4, 4, 5}, l = {77, 89, 93, 105, 112, 118}, m = "invokeSuspend", n = {"$this$callbackFlow", "$this$callbackFlow", "$this$callbackFlow", "$this$callbackFlow", "contactsResult", "contactsList", "$this$callbackFlow", "contactsResult", "contactsList", "errorType", "$this$callbackFlow"}, nl = {78, 91, 99, 107, 118, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0"}, v = 2)
/* loaded from: classes13.dex */
final class P2PContactsSearchStrategy$search$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy getOutputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x010a, code lost:
    
        if (r1.send(new com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Success(r4), r17) == r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0168, code lost:
    
        if (r1.send(new com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Error(r5), r17) == r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (r2 != r8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0187, code lost:
    
        if (kotlinx.coroutines.SupervisorKt.supervisorScope(new com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1.AnonymousClass1(r1, r17.getOutputFormats, r17.getHighSpeedVideoSizes, r17.Camera2StreamConfigurationMap, null), r17) == r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        if (r1.send(new com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Success(kotlin.collections.CollectionsKt.emptyList()), r17) != r8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        if (r1.send(com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Loading.INSTANCE, r17) != r8) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.contacts.api.usecase.SearchContactsUseCase searchContactsUseCase;
        java.lang.Object invoke;
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.getHighSpeedVideoSizesFor) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                if (!kotlin.text.StringsKt.isBlank(this.getHighSpeedVideoSizes)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Events.CONTACT_SEARCH_STARTED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.QUERY_LENGTH, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.getHighSpeedVideoSizes.length())), kotlin.TuplesKt.to("networkType", this.Camera2StreamConfigurationMap)), null, 4, null);
                    this.getOutputMinFrameDuration = producerScope;
                    this.getHighSpeedVideoSizesFor = 2;
                    break;
                } else {
                    this.getOutputMinFrameDuration = producerScope;
                    this.getHighSpeedVideoSizesFor = 1;
                    break;
                }
                return coroutine_suspended;
            case 1:
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
                return kotlin.Unit.INSTANCE;
            case 2:
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.getHighSpeedVideoSizes.length() >= 4) {
                    this.getOutputMinFrameDuration = producerScope;
                    this.getHighSpeedVideoSizesFor = 6;
                    break;
                } else {
                    searchContactsUseCase = this.getOutputFormats.getHighSpeedVideoFpsRanges;
                    this.getOutputMinFrameDuration = producerScope;
                    this.getHighSpeedVideoSizesFor = 3;
                    invoke = searchContactsUseCase.invoke(com.paypal.oslo.feature.contacts.api.domain.ContactSearchType.CONTACTS, this.getHighSpeedVideoSizes, 5, this.Camera2StreamConfigurationMap, this);
                    break;
                }
                return coroutine_suspended;
            case 3:
                kotlin.ResultKt.throwOnFailure(obj);
                invoke = obj;
                arrow.core.Either either = (arrow.core.Either) invoke;
                java.util.List list = (java.util.List) either.getOrNull();
                if (list != null) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Events.CONTACT_SEARCH_CONTACTS_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("resultCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()))), null, 4, null);
                    this.getOutputMinFrameDuration = producerScope;
                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    this.getHighSpeedVideoSizesFor = 4;
                    break;
                } else {
                    com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError = (com.paypal.oslo.feature.contacts.api.domain.ContactSearchError) either.leftOrNull();
                    java.lang.String simpleName = contactSearchError != null ? kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(contactSearchError.getClass()).getSimpleName() : null;
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Events.CONTACT_SEARCH_CONTACTS_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName)), null, 4, null);
                    com.paypal.oslo.feature.contacts.api.domain.ContactSearchError.Failed failed = (com.paypal.oslo.feature.contacts.api.domain.ContactSearchError) either.leftOrNull();
                    if (failed == null) {
                        failed = com.paypal.oslo.feature.contacts.api.domain.ContactSearchError.Failed.INSTANCE;
                    }
                    this.getOutputMinFrameDuration = producerScope;
                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(simpleName);
                    this.getHighSpeedVideoSizesFor = 5;
                    break;
                }
            case 5:
            case 4:
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1$1", f = "P2PContactsSearchStrategy.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {126, 134, 143, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 175}, m = "invokeSuspend", n = {"$this$supervisorScope", "contactsDeferred", "directoryDeferred", "$this$supervisorScope", "contactsDeferred", "directoryDeferred", "contactsResult", "contactsList", "$this$supervisorScope", "contactsDeferred", "directoryDeferred", "contactsResult", "contactsList", "$this$supervisorScope", "contactsDeferred", "directoryDeferred", "contactsResult", "contactsList", "directoryResult", "directoryList", "combined", "$this$supervisorScope", "contactsDeferred", "directoryDeferred", "contactsResult", "contactsList", "directoryResult", "directoryList", "contactsErrorType", com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.DIRECTORY_ERROR_TYPE}, nl = {127, 136, 144, 166, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType Camera2StreamConfigurationMap;
        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult> getHighSpeedVideoSizes;
        java.lang.Object getHighSpeedVideoSizesFor;
        java.lang.Object getInputFormats;
        java.lang.Object getInputSizeshNQ4ISI;
        java.lang.Object getOutputFormats;
        java.lang.Object getOutputMinFrameDuration;
        final /* synthetic */ com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy getOutputMinFrameDurationlomOqCM;
        int getOutputSizes;
        private /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
        java.lang.Object getOutputStallDuration;

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0255, code lost:
        
            if (r9.send(new com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Error(r10), r25) == r8) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0303, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x02fd, code lost:
        
            if (r25.getHighSpeedVideoSizes.send(new com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Success(r9), r25) == r8) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0179, code lost:
        
            if (r6 == r8) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0125, code lost:
        
            if (r25.getHighSpeedVideoSizes.send(new com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.LoadingMore(r5), r25) == r8) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x00d8, code lost:
        
            if (r3 != r8) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.Deferred async$default;
            kotlinx.coroutines.Deferred async$default2;
            kotlinx.coroutines.Deferred deferred;
            java.lang.Object await;
            arrow.core.Either either;
            kotlinx.coroutines.Deferred deferred2;
            java.util.List list;
            kotlinx.coroutines.Deferred deferred3;
            java.lang.Object await2;
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getOutputSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1$1$contactsDeferred$1(this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, null), 3, null);
                async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1$1$directoryDeferred$1(this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, null), 3, null);
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default);
                this.getHighResolutionOutputSizeshNQ4ISI = async$default2;
                this.getOutputSizes = 1;
                deferred = async$default;
                await = deferred.await(this);
            } else if (i == 1) {
                async$default2 = (kotlinx.coroutines.Deferred) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlinx.coroutines.Deferred deferred4 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                deferred = deferred4;
                await = obj;
            } else if (i == 2) {
                list = (java.util.List) this.getOutputFormats;
                either = (arrow.core.Either) this.getInputSizeshNQ4ISI;
                deferred2 = (kotlinx.coroutines.Deferred) this.getHighResolutionOutputSizeshNQ4ISI;
                deferred3 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred3);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
                this.getInputSizeshNQ4ISI = either;
                this.getOutputFormats = list;
                this.getOutputSizes = 3;
                await2 = deferred2.await(this);
            } else if (i == 3) {
                list = (java.util.List) this.getOutputFormats;
                either = (arrow.core.Either) this.getInputSizeshNQ4ISI;
                deferred2 = (kotlinx.coroutines.Deferred) this.getHighResolutionOutputSizeshNQ4ISI;
                deferred3 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                await2 = obj;
                arrow.core.Either either2 = (arrow.core.Either) await2;
                java.util.List list2 = (java.util.List) either2.getOrNull();
                if (list2 == null) {
                    com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError = (com.paypal.oslo.feature.contacts.api.domain.ContactSearchError) either2.leftOrNull();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Events.CONTACT_SEARCH_DIRECTORY_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", contactSearchError != null ? kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(contactSearchError.getClass()).getSimpleName() : null)), null, 4, null);
                }
                if (list != null || list2 != null) {
                    java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) (list == null ? kotlin.collections.CollectionsKt.emptyList() : list), (java.lang.Iterable) (list2 != null ? list2 : kotlin.collections.CollectionsKt.emptyList()));
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.CONTACTS_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(list != null ? list.size() : 0));
                    pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.DIRECTORY_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(list2 != null ? list2.size() : 0));
                    pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(plus.size()));
                    com.paypal.android.logger.Logger.i$default(logger, "ContactSearch, completed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred3);
                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plus);
                    this.getOutputSizes = 4;
                } else {
                    com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError2 = (com.paypal.oslo.feature.contacts.api.domain.ContactSearchError) either.leftOrNull();
                    java.lang.String simpleName = contactSearchError2 != null ? kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(contactSearchError2.getClass()).getSimpleName() : null;
                    com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError3 = (com.paypal.oslo.feature.contacts.api.domain.ContactSearchError) either2.leftOrNull();
                    java.lang.String simpleName2 = contactSearchError3 != null ? kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(contactSearchError3.getClass()).getSimpleName() : null;
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Events.CONTACT_SEARCH_BOTH_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.DIRECTORY_ERROR_TYPE, simpleName2)), null, 4, null);
                    kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult> producerScope = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.contacts.api.domain.ContactSearchError.Failed failed = (com.paypal.oslo.feature.contacts.api.domain.ContactSearchError) either.leftOrNull();
                    if (failed == null) {
                        failed = com.paypal.oslo.feature.contacts.api.domain.ContactSearchError.Failed.INSTANCE;
                    }
                    this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred3);
                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(simpleName);
                    this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(simpleName2);
                    this.getOutputSizes = 5;
                }
            } else {
                if (i == 4) {
                } else {
                    if (i != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            either = (arrow.core.Either) await;
            java.util.List list3 = (java.util.List) either.getOrNull();
            if (list3 != null) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Events.CONTACT_SEARCH_CONTACTS_PARTIAL, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("resultCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list3.size()))), null, 4, null);
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
                this.getHighResolutionOutputSizeshNQ4ISI = async$default2;
                this.getInputSizeshNQ4ISI = either;
                this.getOutputFormats = list3;
                this.getOutputSizes = 2;
            } else {
                com.paypal.oslo.feature.contacts.api.domain.ContactSearchError contactSearchError4 = (com.paypal.oslo.feature.contacts.api.domain.ContactSearchError) either.leftOrNull();
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Events.CONTACT_SEARCH_CONTACTS_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", contactSearchError4 != null ? kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(contactSearchError4.getClass()).getSimpleName() : null)), null, 4, null);
            }
            kotlinx.coroutines.Deferred deferred5 = deferred;
            deferred2 = async$default2;
            list = list3;
            deferred3 = deferred5;
            this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred3);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
            this.getInputSizeshNQ4ISI = either;
            this.getOutputFormats = list;
            this.getOutputSizes = 3;
            await2 = deferred2.await(this);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult> producerScope, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy p2PContactsSearchStrategy, java.lang.String str, com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = producerScope;
            this.getOutputMinFrameDurationlomOqCM = p2PContactsSearchStrategy;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.Camera2StreamConfigurationMap = contactSearchNetworkType;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1 p2PContactsSearchStrategy$search$1 = new com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getOutputFormats, continuation);
        p2PContactsSearchStrategy$search$1.getOutputMinFrameDuration = obj;
        return p2PContactsSearchStrategy$search$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P2PContactsSearchStrategy$search$1(java.lang.String str, com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy p2PContactsSearchStrategy, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = contactSearchNetworkType;
        this.getOutputFormats = p2PContactsSearchStrategy;
    }
}
