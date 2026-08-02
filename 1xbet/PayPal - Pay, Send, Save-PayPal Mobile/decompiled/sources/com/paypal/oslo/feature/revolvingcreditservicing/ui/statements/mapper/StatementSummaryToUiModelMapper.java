package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/mapper/StatementSummaryToUiModelMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatter", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatter", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementSummary;", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel;", "map", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementItem;", "Ljava/util/Locale;", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/uimodel/StatementHubItemUiModel$Content;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementItem;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementSummaryToUiModelMapper {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public StatementSummaryToUiModelMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        this.Camera2StreamConfigurationMap = dateFormatterFacade;
        this.getHighResolutionOutputSizeshNQ4ISI = currencyFormatterFacade;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x026e -> B:10:0x028c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object map(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary statementSummary, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$map$1 statementSummaryToUiModelMapper$map$1;
        int i;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.util.Iterator it;
        int i2;
        int i3;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$map$1 statementSummaryToUiModelMapper$map$12;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary statementSummary2;
        java.time.ZonedDateTime atZone;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary statementSummary3;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$map$1) {
            statementSummaryToUiModelMapper$map$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$map$1) continuation;
            if ((statementSummaryToUiModelMapper$map$1._BOUNDARY & Integer.MIN_VALUE) != 0) {
                statementSummaryToUiModelMapper$map$1._BOUNDARY -= 2147483648;
                java.lang.Object obj4 = statementSummaryToUiModelMapper$map$1._CREATION;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = statementSummaryToUiModelMapper$map$1._BOUNDARY;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj4);
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem> items = statementSummary.getItems();
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.lang.Object obj5 : items) {
                        java.time.Instant closingDate = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem) obj5).getClosingDate();
                        java.lang.Integer boxInt = (closingDate == null || (atZone = closingDate.atZone(java.time.ZoneId.systemDefault())) == null) ? null : kotlin.coroutines.jvm.internal.Boxing.boxInt(atZone.getYear());
                        java.lang.Object obj6 = linkedHashMap.get(boxInt);
                        if (obj6 == null) {
                            obj6 = (java.util.List) new java.util.ArrayList();
                            linkedHashMap.put(boxInt, obj6);
                        }
                        ((java.util.List) obj6).add(obj5);
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    obj = linkedHashMap;
                    obj2 = obj;
                    obj3 = obj2;
                    it = linkedHashMap.entrySet().iterator();
                    i2 = 0;
                    i3 = 0;
                    arrayList = arrayList2;
                    statementSummaryToUiModelMapper$map$12 = statementSummaryToUiModelMapper$map$1;
                    statementSummary2 = statementSummary;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = creditProductIdentifier;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = statementSummaryToUiModelMapper$map$1.getInputSizeshNQ4ISI;
                    int i5 = statementSummaryToUiModelMapper$map$1.getInputFormats;
                    int i6 = statementSummaryToUiModelMapper$map$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i7 = statementSummaryToUiModelMapper$map$1.getHighSpeedVideoSizes;
                    int i8 = statementSummaryToUiModelMapper$map$1.getHighSpeedVideoFpsRangesFor;
                    int i9 = statementSummaryToUiModelMapper$map$1.Camera2StreamConfigurationMap;
                    int i10 = statementSummaryToUiModelMapper$map$1.getHighSpeedVideoFpsRanges;
                    java.util.Collection collection = (java.util.Collection) statementSummaryToUiModelMapper$map$1.ArtificialStackFrames;
                    java.lang.Object obj7 = statementSummaryToUiModelMapper$map$1.unwrapAs;
                    java.util.Iterator it2 = (java.util.Iterator) statementSummaryToUiModelMapper$map$1.toString;
                    ?? r15 = (java.util.Collection) statementSummaryToUiModelMapper$map$1.isOutputSupportedForhNQ4ISI;
                    java.lang.Object obj8 = (java.lang.Iterable) statementSummaryToUiModelMapper$map$1.getOutputStallDurationlomOqCM;
                    java.util.List list = (java.util.List) statementSummaryToUiModelMapper$map$1.getOutputSizes;
                    java.lang.Object obj9 = (java.lang.Iterable) statementSummaryToUiModelMapper$map$1.getOutputSizeshNQ4ISI;
                    java.lang.String str2 = (java.lang.String) statementSummaryToUiModelMapper$map$1.getOutputMinFrameDurationlomOqCM;
                    java.util.List list2 = (java.util.List) statementSummaryToUiModelMapper$map$1.getOutputStallDuration;
                    java.util.List list3 = (java.util.List) statementSummaryToUiModelMapper$map$1.getHighSpeedVideoSizesFor;
                    java.util.List list4 = (java.util.List) statementSummaryToUiModelMapper$map$1.f5417a;
                    java.lang.Integer num = (java.lang.Integer) statementSummaryToUiModelMapper$map$1.b;
                    java.util.Map.Entry entry = (java.util.Map.Entry) statementSummaryToUiModelMapper$map$1.getARTIFICIAL_FRAME_PACKAGE_NAME;
                    java.util.Iterator it3 = (java.util.Iterator) statementSummaryToUiModelMapper$map$1.coroutineBoundary;
                    ?? r4 = (java.util.Collection) statementSummaryToUiModelMapper$map$1.CoroutineDebuggingKt;
                    java.lang.Object obj10 = (java.util.Map) statementSummaryToUiModelMapper$map$1.accessartificialFrame;
                    java.lang.Object obj11 = (java.util.Map) statementSummaryToUiModelMapper$map$1.coroutineCreation;
                    java.lang.Object obj12 = (java.util.Map) statementSummaryToUiModelMapper$map$1.isOutputSupportedFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) statementSummaryToUiModelMapper$map$1.getOutputFormats;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary statementSummary4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary) statementSummaryToUiModelMapper$map$1.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj4);
                    int i11 = i8;
                    int i12 = i9;
                    java.lang.Object obj13 = obj11;
                    java.lang.Object obj14 = obj8;
                    int i13 = i7;
                    int i14 = i10;
                    java.util.Map.Entry entry2 = entry;
                    java.lang.Object obj15 = obj10;
                    java.lang.Object obj16 = obj9;
                    int i15 = i6;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$map$1 statementSummaryToUiModelMapper$map$13 = statementSummaryToUiModelMapper$map$1;
                    java.lang.Object obj17 = coroutine_suspended;
                    java.util.List list5 = list;
                    java.util.ArrayList arrayList3 = r15;
                    java.util.List createListBuilder = list2;
                    java.util.ArrayList arrayList4 = r4;
                    int i16 = i5;
                    java.lang.String valueOf = str2;
                    collection.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content) obj4);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary statementSummary5 = statementSummary4;
                    java.util.Iterator it4 = it2;
                    java.util.List list6 = list3;
                    java.util.List list7 = list4;
                    java.lang.Integer num2 = num;
                    java.lang.Object obj18 = obj16;
                    java.util.Iterator it5 = it3;
                    int i17 = i16;
                    int i18 = i15;
                    int i19 = i13;
                    java.lang.Object obj19 = obj12;
                    int i20 = i11;
                    int i21 = i12;
                    java.lang.Object obj20 = obj17;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier4 = creditProductIdentifier3;
                    if (it4.hasNext()) {
                        java.lang.Object next = it4.next();
                        int i22 = i14;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem statementItem = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem) next;
                        java.util.Locale locale = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier4);
                        statementSummaryToUiModelMapper$map$13.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(statementSummary5);
                        statementSummaryToUiModelMapper$map$13.getOutputFormats = creditProductIdentifier4;
                        statementSummaryToUiModelMapper$map$13.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj19);
                        statementSummaryToUiModelMapper$map$13.coroutineCreation = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj13);
                        statementSummaryToUiModelMapper$map$13.accessartificialFrame = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj15);
                        statementSummaryToUiModelMapper$map$13.CoroutineDebuggingKt = arrayList4;
                        statementSummaryToUiModelMapper$map$13.coroutineBoundary = it5;
                        statementSummaryToUiModelMapper$map$13.getARTIFICIAL_FRAME_PACKAGE_NAME = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(entry2);
                        statementSummaryToUiModelMapper$map$13.b = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(num2);
                        statementSummaryToUiModelMapper$map$13.f5417a = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list7);
                        statementSummaryToUiModelMapper$map$13.getHighSpeedVideoSizesFor = list6;
                        statementSummaryToUiModelMapper$map$13.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createListBuilder);
                        statementSummaryToUiModelMapper$map$13.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(valueOf);
                        statementSummaryToUiModelMapper$map$13.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj18);
                        statementSummaryToUiModelMapper$map$13.getOutputSizes = list5;
                        statementSummaryToUiModelMapper$map$13.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj14);
                        statementSummaryToUiModelMapper$map$13.isOutputSupportedForhNQ4ISI = arrayList3;
                        java.util.Iterator it6 = it4;
                        statementSummaryToUiModelMapper$map$13.toString = it6;
                        java.util.Iterator it7 = it5;
                        statementSummaryToUiModelMapper$map$13.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        statementSummaryToUiModelMapper$map$13.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(statementItem);
                        statementSummaryToUiModelMapper$map$13.ArtificialStackFrames = arrayList3;
                        statementSummaryToUiModelMapper$map$13.getHighSpeedVideoFpsRanges = i22;
                        statementSummaryToUiModelMapper$map$13.Camera2StreamConfigurationMap = i21;
                        statementSummaryToUiModelMapper$map$13.getHighSpeedVideoFpsRangesFor = i20;
                        statementSummaryToUiModelMapper$map$13.getHighSpeedVideoSizes = i19;
                        statementSummaryToUiModelMapper$map$13.getHighResolutionOutputSizeshNQ4ISI = i18;
                        statementSummaryToUiModelMapper$map$13.getInputFormats = i17;
                        statementSummaryToUiModelMapper$map$13.getInputSizeshNQ4ISI = 0;
                        statementSummaryToUiModelMapper$map$13._BOUNDARY = 1;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary statementSummary6 = statementSummary5;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier5 = creditProductIdentifier4;
                        obj4 = Camera2StreamConfigurationMap(statementItem, locale, statementSummaryToUiModelMapper$map$13);
                        obj17 = obj20;
                        if (obj4 == obj17) {
                            return obj17;
                        }
                        num = num2;
                        i11 = i20;
                        i12 = i21;
                        collection = arrayList3;
                        i15 = i18;
                        i13 = i19;
                        it3 = it7;
                        obj12 = obj19;
                        i16 = i17;
                        list4 = list7;
                        obj16 = obj18;
                        list3 = list6;
                        it2 = it6;
                        i14 = i22;
                        statementSummary4 = statementSummary6;
                        creditProductIdentifier3 = creditProductIdentifier5;
                        collection.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content) obj4);
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary statementSummary52 = statementSummary4;
                        java.util.Iterator it42 = it2;
                        java.util.List list62 = list3;
                        java.util.List list72 = list4;
                        java.lang.Integer num22 = num;
                        java.lang.Object obj182 = obj16;
                        java.util.Iterator it52 = it3;
                        int i172 = i16;
                        int i182 = i15;
                        int i192 = i13;
                        java.lang.Object obj192 = obj12;
                        int i202 = i11;
                        int i212 = i12;
                        java.lang.Object obj202 = obj17;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier42 = creditProductIdentifier3;
                        if (it42.hasNext()) {
                            creditProductIdentifier = creditProductIdentifier42;
                            int i23 = i14;
                            list5.addAll(arrayList3);
                            kotlin.collections.CollectionsKt.addAll(arrayList4, kotlin.collections.CollectionsKt.build(list62));
                            statementSummary2 = statementSummary52;
                            coroutine_suspended = obj202;
                            arrayList = arrayList4;
                            statementSummaryToUiModelMapper$map$12 = statementSummaryToUiModelMapper$map$13;
                            obj = obj15;
                            obj2 = obj13;
                            obj3 = obj192;
                            i2 = i212;
                            it = it52;
                            i3 = i23;
                            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier22 = creditProductIdentifier;
                            if (!it.hasNext()) {
                                entry2 = (java.util.Map.Entry) it.next();
                                num22 = (java.lang.Integer) entry2.getKey();
                                list72 = (java.util.List) entry2.getValue();
                                createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                                valueOf = num22 != null ? java.lang.String.valueOf(num22.intValue()) : null;
                                if (valueOf == null) {
                                    statementSummary3 = statementSummary2;
                                    str = "";
                                } else {
                                    statementSummary3 = statementSummary2;
                                    str = valueOf;
                                }
                                if (valueOf != null) {
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$map$1 statementSummaryToUiModelMapper$map$14 = statementSummaryToUiModelMapper$map$12;
                                    createListBuilder.add(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Header(str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.orEmpty(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(valueOf))));
                                    java.util.List list8 = list72;
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list8, 10));
                                    java.util.Iterator it8 = list8.iterator();
                                    obj202 = coroutine_suspended;
                                    obj192 = obj3;
                                    it52 = it;
                                    i212 = i2;
                                    statementSummaryToUiModelMapper$map$13 = statementSummaryToUiModelMapper$map$14;
                                    i172 = 0;
                                    i182 = 0;
                                    i192 = 0;
                                    i202 = 0;
                                    obj14 = list8;
                                    obj182 = obj14;
                                    arrayList3 = arrayList5;
                                    obj15 = obj;
                                    i14 = i3;
                                    statementSummary52 = statementSummary3;
                                    creditProductIdentifier42 = creditProductIdentifier22;
                                    it42 = it8;
                                    obj13 = obj2;
                                    list5 = createListBuilder;
                                    arrayList4 = arrayList;
                                    list62 = list5;
                                } else {
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$map$1 statementSummaryToUiModelMapper$map$15 = statementSummaryToUiModelMapper$map$12;
                                    createListBuilder.add(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Header(str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.orEmpty((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null)));
                                    java.util.List list9 = list72;
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list9, 10));
                                    java.util.Iterator it9 = list9.iterator();
                                    obj202 = coroutine_suspended;
                                    obj192 = obj3;
                                    it52 = it;
                                    i212 = i2;
                                    statementSummaryToUiModelMapper$map$13 = statementSummaryToUiModelMapper$map$15;
                                    i172 = 0;
                                    i182 = 0;
                                    i192 = 0;
                                    i202 = 0;
                                    obj14 = list9;
                                    obj182 = obj14;
                                    arrayList3 = arrayList6;
                                    obj15 = obj;
                                    i14 = i3;
                                    statementSummary52 = statementSummary3;
                                    creditProductIdentifier42 = creditProductIdentifier22;
                                    it42 = it9;
                                    obj13 = obj2;
                                    list5 = createListBuilder;
                                    arrayList4 = arrayList;
                                    list62 = list5;
                                }
                                if (it42.hasNext()) {
                                }
                            } else {
                                return arrayList;
                            }
                        }
                    }
                }
            }
        }
        statementSummaryToUiModelMapper$map$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$map$1(this, continuation);
        java.lang.Object obj42 = statementSummaryToUiModelMapper$map$1._CREATION;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = statementSummaryToUiModelMapper$map$1._BOUNDARY;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem statementItem, java.util.Locale locale, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$toContentUiModel$1 statementSummaryToUiModelMapper$toContentUiModel$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem statementItem2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty empty;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$toContentUiModel$1) {
            statementSummaryToUiModelMapper$toContentUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$toContentUiModel$1) continuation;
            if ((statementSummaryToUiModelMapper$toContentUiModel$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                statementSummaryToUiModelMapper$toContentUiModel$1.getOutputFormats -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$toContentUiModel$1 statementSummaryToUiModelMapper$toContentUiModel$12 = statementSummaryToUiModelMapper$toContentUiModel$1;
                java.lang.Object obj = statementSummaryToUiModelMapper$toContentUiModel$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = statementSummaryToUiModelMapper$toContentUiModel$12.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String id = statementItem.getId();
                    java.lang.String format = this.Camera2StreamConfigurationMap.format(statementItem.getClosingDate(), com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthLong.INSTANCE, locale);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString orEmpty = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.orEmpty(format != null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(format) : null);
                    java.time.Instant startDate = statementItem.getStartDate();
                    java.time.Instant closingDate = statementItem.getClosingDate();
                    if (startDate == null || closingDate == null) {
                        stringResWithParameter = null;
                    } else {
                        java.lang.String format2 = this.Camera2StreamConfigurationMap.format(startDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale);
                        if (format2 == null) {
                            format2 = "";
                        }
                        java.lang.String format3 = this.Camera2StreamConfigurationMap.format(closingDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale);
                        stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_hub_date_range, new java.lang.Object[]{com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(format2), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(format3 != null ? format3 : "")}, null, false, 12, null);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString orEmpty2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.orEmpty(stringResWithParameter);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount = statementItem.getAmount();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol symbol = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
                    statementSummaryToUiModelMapper$toContentUiModel$12.Camera2StreamConfigurationMap = statementItem;
                    statementSummaryToUiModelMapper$toContentUiModel$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                    statementSummaryToUiModelMapper$toContentUiModel$12.getHighSpeedVideoFpsRanges = id;
                    statementSummaryToUiModelMapper$toContentUiModel$12.getHighResolutionOutputSizeshNQ4ISI = orEmpty;
                    statementSummaryToUiModelMapper$toContentUiModel$12.getHighSpeedVideoFpsRangesFor = orEmpty2;
                    statementSummaryToUiModelMapper$toContentUiModel$12.getOutputFormats = 1;
                    java.lang.Object format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, amount, symbol, 0, statementSummaryToUiModelMapper$toContentUiModel$12, 4, null);
                    if (format$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = id;
                    uiString = orEmpty;
                    uiString2 = orEmpty2;
                    statementItem2 = statementItem;
                    obj = format$default;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) statementSummaryToUiModelMapper$toContentUiModel$12.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) statementSummaryToUiModelMapper$toContentUiModel$12.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String str2 = (java.lang.String) statementSummaryToUiModelMapper$toContentUiModel$12.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem statementItem3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem) statementSummaryToUiModelMapper$toContentUiModel$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    uiString2 = uiString3;
                    uiString = uiString4;
                    str = str2;
                    statementItem2 = statementItem3;
                }
                java.lang.String str3 = (java.lang.String) obj;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString orEmpty3 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.orEmpty(str3 != null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str3) : null);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly uiString5 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_balance);
                if (!statementItem2.getHasChangeInTerms()) {
                    empty = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_hub_terms_changed);
                } else {
                    empty = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                }
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content(str, uiString, uiString2, orEmpty3, uiString5, empty, statementItem2);
            }
        }
        statementSummaryToUiModelMapper$toContentUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$toContentUiModel$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$toContentUiModel$1 statementSummaryToUiModelMapper$toContentUiModel$122 = statementSummaryToUiModelMapper$toContentUiModel$1;
        java.lang.Object obj2 = statementSummaryToUiModelMapper$toContentUiModel$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = statementSummaryToUiModelMapper$toContentUiModel$122.getOutputFormats;
        if (i != 0) {
        }
        java.lang.String str32 = (java.lang.String) obj2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString orEmpty32 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.orEmpty(str32 != null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str32) : null);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly uiString52 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_balance);
        if (!statementItem2.getHasChangeInTerms()) {
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.uimodel.StatementHubItemUiModel.Content(str, uiString, uiString2, orEmpty32, uiString52, empty, statementItem2);
    }
}
