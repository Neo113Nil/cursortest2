package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayInitializationMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/mapper/FundingInstrumentUiModelMapper;", "fundingInstrumentUiModelMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/mapper/FundingInstrumentUiModelMapper;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/mapper/FundingInstrumentUiModelMapper;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChooseWayToPayInitializationMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ChooseWayToPayInitializationMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper fundingInstrumentUiModelMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModelMapper, "");
        this.getHighSpeedVideoFpsRangesFor = fundingInstrumentUiModelMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0123 -> B:10:0x0133). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleOnBankAdded(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware chooseWayToPayInitializationMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBankAdded onBankAdded, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState chooseWayToPayState, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware$handleOnBankAdded$1 chooseWayToPayInitializationMiddleware$handleOnBankAdded$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo readyInfo;
        java.util.List list;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.Iterator it;
        int i2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBankAdded onBankAdded2;
        kotlin.jvm.functions.Function1 function12;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware$handleOnBankAdded$1 chooseWayToPayInitializationMiddleware$handleOnBankAdded$12;
        java.util.Collection collection;
        int i3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState chooseWayToPayState2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware chooseWayToPayInitializationMiddleware2 = chooseWayToPayInitializationMiddleware;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware$handleOnBankAdded$1) {
            chooseWayToPayInitializationMiddleware$handleOnBankAdded$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware$handleOnBankAdded$1) continuation;
            if ((chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.isOutputSupportedFor & Integer.MIN_VALUE) != 0) {
                chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.isOutputSupportedFor -= 2147483648;
                java.lang.Object obj3 = chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getValidOutputFormatsForInputhNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.isOutputSupportedFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo readyInfo2 = chooseWayToPayState.getReadyInfo();
                    if (readyInfo2 == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) onBankAdded.getFundingInstruments(), (java.lang.Iterable) readyInfo2.getFundingInstruments());
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) onBankAdded.getFundingInstruments());
                    java.util.List list2 = plus;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    readyInfo = readyInfo2;
                    list = plus;
                    fundingInstrument = fundingInstrument2;
                    obj = list2;
                    obj2 = obj;
                    it = list2.iterator();
                    i2 = 0;
                    onBankAdded2 = onBankAdded;
                    function12 = function1;
                    chooseWayToPayInitializationMiddleware$handleOnBankAdded$12 = chooseWayToPayInitializationMiddleware$handleOnBankAdded$1;
                    collection = arrayList;
                    i3 = 0;
                    chooseWayToPayState2 = chooseWayToPayState;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getHighSpeedVideoFpsRanges;
                    int i5 = chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getHighResolutionOutputSizeshNQ4ISI;
                    i3 = chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getHighSpeedVideoSizes;
                    collection = (java.util.Collection) chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getOutputFormats;
                    java.lang.Object obj4 = chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getHighSpeedVideoSizesFor;
                    java.util.Iterator it2 = (java.util.Iterator) chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.unwrapAs;
                    java.util.Collection collection2 = (java.util.Collection) chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getOutputStallDuration;
                    java.lang.Object obj5 = (java.lang.Iterable) chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getOutputStallDurationlomOqCM;
                    java.lang.Object obj6 = (java.lang.Iterable) chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getOutputMinFrameDurationlomOqCM;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getOutputSizeshNQ4ISI;
                    java.util.List list3 = (java.util.List) chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getOutputSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo readyInfo3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo) chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getInputFormats;
                    kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState chooseWayToPayState3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState) chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBankAdded onBankAdded3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBankAdded) chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware$handleOnBankAdded$1 chooseWayToPayInitializationMiddleware$handleOnBankAdded$13 = chooseWayToPayInitializationMiddleware$handleOnBankAdded$1;
                    chooseWayToPayState2 = chooseWayToPayState3;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo readyInfo4 = readyInfo3;
                    java.lang.Object obj7 = coroutine_suspended;
                    java.util.List list4 = list3;
                    int i6 = i5;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument4 = fundingInstrument3;
                    java.lang.Object obj8 = obj6;
                    java.lang.Object obj9 = obj5;
                    java.util.Iterator it3 = it2;
                    java.util.Collection collection3 = collection2;
                    collection.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj3);
                    onBankAdded2 = onBankAdded3;
                    function12 = function13;
                    collection = collection3;
                    it = it3;
                    obj = obj9;
                    obj2 = obj8;
                    fundingInstrument = fundingInstrument4;
                    list = list4;
                    readyInfo = readyInfo4;
                    chooseWayToPayInitializationMiddleware$handleOnBankAdded$12 = chooseWayToPayInitializationMiddleware$handleOnBankAdded$13;
                    chooseWayToPayInitializationMiddleware2 = chooseWayToPayInitializationMiddleware;
                    java.lang.Object obj10 = obj7;
                    i2 = i6;
                    coroutine_suspended = obj10;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        java.lang.Object obj11 = coroutine_suspended;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) next;
                        int i7 = i2;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper fundingInstrumentUiModelMapper = chooseWayToPayInitializationMiddleware2.getHighSpeedVideoFpsRangesFor;
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(onBankAdded2);
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(chooseWayToPayState2);
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getInputSizeshNQ4ISI = function12;
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getInputFormats = readyInfo;
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getOutputSizes = list;
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getOutputSizeshNQ4ISI = fundingInstrument;
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getOutputStallDuration = collection;
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.unwrapAs = it;
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrument5);
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getOutputFormats = collection;
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getHighSpeedVideoSizes = i3;
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getHighResolutionOutputSizeshNQ4ISI = i7;
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.getHighSpeedVideoFpsRanges = 0;
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12.isOutputSupportedFor = 1;
                        java.lang.Object uiModel$revolvingcredit_servicing_prodRelease = fundingInstrumentUiModelMapper.toUiModel$revolvingcredit_servicing_prodRelease(fundingInstrument5, fundingInstrument, chooseWayToPayInitializationMiddleware$handleOnBankAdded$12);
                        obj7 = obj11;
                        if (uiModel$revolvingcredit_servicing_prodRelease == obj7) {
                            return obj7;
                        }
                        readyInfo4 = readyInfo;
                        list4 = list;
                        fundingInstrument4 = fundingInstrument;
                        obj8 = obj2;
                        obj9 = obj;
                        it3 = it;
                        collection3 = collection;
                        i6 = i7;
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$13 = chooseWayToPayInitializationMiddleware$handleOnBankAdded$12;
                        function13 = function12;
                        onBankAdded3 = onBankAdded2;
                        obj3 = uiModel$revolvingcredit_servicing_prodRelease;
                        collection.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj3);
                        onBankAdded2 = onBankAdded3;
                        function12 = function13;
                        collection = collection3;
                        it = it3;
                        obj = obj9;
                        obj2 = obj8;
                        fundingInstrument = fundingInstrument4;
                        list = list4;
                        readyInfo = readyInfo4;
                        chooseWayToPayInitializationMiddleware$handleOnBankAdded$12 = chooseWayToPayInitializationMiddleware$handleOnBankAdded$13;
                        chooseWayToPayInitializationMiddleware2 = chooseWayToPayInitializationMiddleware;
                        java.lang.Object obj102 = obj7;
                        i2 = i6;
                        coroutine_suspended = obj102;
                        if (it.hasNext()) {
                            function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnInitialReadyInfo(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo(list, (java.util.List) collection, readyInfo.isFundingInstrumentChanging(), readyInfo.getCreditAccountId())));
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        chooseWayToPayInitializationMiddleware$handleOnBankAdded$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware$handleOnBankAdded$1(chooseWayToPayInitializationMiddleware2, continuation);
        java.lang.Object obj32 = chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chooseWayToPayInitializationMiddleware$handleOnBankAdded$1.isOutputSupportedFor;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00fe -> B:10:0x0102). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleOnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware chooseWayToPayInitializationMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnViewCreated onViewCreated, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware$handleOnViewCreated$1 chooseWayToPayInitializationMiddleware$handleOnViewCreated$1;
        int i;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        int i2;
        int i3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnViewCreated onViewCreated2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware$handleOnViewCreated$1 chooseWayToPayInitializationMiddleware$handleOnViewCreated$12;
        kotlin.jvm.functions.Function1 function12;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware$handleOnViewCreated$1) {
            chooseWayToPayInitializationMiddleware$handleOnViewCreated$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware$handleOnViewCreated$1) continuation;
            if ((chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getOutputStallDuration -= 2147483648;
                java.lang.Object obj = chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (onViewCreated.getFundingInstruments().isEmpty()) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Choose way to pay opened with no funding instruments", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isFundingInstrumentChanging", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(onViewCreated.isFundingInstrumentChanging()))), null, 4, null);
                    }
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments = onViewCreated.getFundingInstruments();
                    iterable = fundingInstruments;
                    iterable2 = iterable;
                    arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fundingInstruments, 10));
                    it = fundingInstruments.iterator();
                    i2 = 0;
                    i3 = 0;
                    onViewCreated2 = onViewCreated;
                    chooseWayToPayInitializationMiddleware$handleOnViewCreated$12 = chooseWayToPayInitializationMiddleware$handleOnViewCreated$1;
                    function12 = function1;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getHighSpeedVideoFpsRanges;
                    int i5 = chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.Camera2StreamConfigurationMap;
                    int i6 = chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getHighSpeedVideoFpsRangesFor;
                    java.util.Collection collection = (java.util.Collection) chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object obj2 = chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getInputFormats;
                    java.util.Iterator it2 = (java.util.Iterator) chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getHighSpeedVideoSizesFor;
                    ?? r10 = (java.util.Collection) chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getOutputMinFrameDuration;
                    iterable = (java.lang.Iterable) chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getOutputFormats;
                    iterable2 = (java.lang.Iterable) chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getInputSizeshNQ4ISI;
                    kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnViewCreated onViewCreated3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnViewCreated) chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    chooseWayToPayInitializationMiddleware$handleOnViewCreated$12 = chooseWayToPayInitializationMiddleware$handleOnViewCreated$1;
                    function12 = function13;
                    boolean z = true;
                    int i7 = i6;
                    i2 = i5;
                    it = it2;
                    arrayList = r10;
                    collection.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj);
                    i3 = i7;
                    onViewCreated2 = onViewCreated3;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) next;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper fundingInstrumentUiModelMapper = chooseWayToPayInitializationMiddleware.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument selectedFundingInstrument = onViewCreated2.getSelectedFundingInstrument();
                        chooseWayToPayInitializationMiddleware$handleOnViewCreated$12.getHighSpeedVideoSizes = onViewCreated2;
                        chooseWayToPayInitializationMiddleware$handleOnViewCreated$12.getHighResolutionOutputSizeshNQ4ISI = function12;
                        chooseWayToPayInitializationMiddleware$handleOnViewCreated$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                        chooseWayToPayInitializationMiddleware$handleOnViewCreated$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                        chooseWayToPayInitializationMiddleware$handleOnViewCreated$12.getOutputMinFrameDuration = arrayList;
                        chooseWayToPayInitializationMiddleware$handleOnViewCreated$12.getHighSpeedVideoSizesFor = it;
                        chooseWayToPayInitializationMiddleware$handleOnViewCreated$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        chooseWayToPayInitializationMiddleware$handleOnViewCreated$12.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingInstrument);
                        chooseWayToPayInitializationMiddleware$handleOnViewCreated$12.getOutputMinFrameDurationlomOqCM = arrayList;
                        chooseWayToPayInitializationMiddleware$handleOnViewCreated$12.getHighSpeedVideoFpsRangesFor = i3;
                        chooseWayToPayInitializationMiddleware$handleOnViewCreated$12.Camera2StreamConfigurationMap = i2;
                        chooseWayToPayInitializationMiddleware$handleOnViewCreated$12.getHighSpeedVideoFpsRanges = 0;
                        z = true;
                        chooseWayToPayInitializationMiddleware$handleOnViewCreated$12.getOutputStallDuration = 1;
                        java.lang.Object uiModel$revolvingcredit_servicing_prodRelease = fundingInstrumentUiModelMapper.toUiModel$revolvingcredit_servicing_prodRelease(fundingInstrument, selectedFundingInstrument, chooseWayToPayInitializationMiddleware$handleOnViewCreated$12);
                        if (uiModel$revolvingcredit_servicing_prodRelease == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        onViewCreated3 = onViewCreated2;
                        obj = uiModel$revolvingcredit_servicing_prodRelease;
                        i7 = i3;
                        collection = arrayList;
                        collection.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj);
                        i3 = i7;
                        onViewCreated2 = onViewCreated3;
                        if (it.hasNext()) {
                            function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnInitialReadyInfo(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo(onViewCreated2.getFundingInstruments(), arrayList, onViewCreated2.isFundingInstrumentChanging(), onViewCreated2.getCreditAccountId())));
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        chooseWayToPayInitializationMiddleware$handleOnViewCreated$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware$handleOnViewCreated$1(chooseWayToPayInitializationMiddleware, continuation);
        java.lang.Object obj3 = chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chooseWayToPayInitializationMiddleware$handleOnViewCreated$1.getOutputStallDuration;
        if (i != 0) {
        }
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent event = input.getEvent();
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnViewCreated) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware$invoke$1(this, event, input, null), 3, null);
        } else if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBankAdded) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware$invoke$2(this, event, input, null), 3, null);
        } else {
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
