package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel$formatAddresses$1", f = "AddressSelectionViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {69, 66}, m = "invokeSuspend", n = {"$this$flow", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "$i$f$map", "$i$f$mapTo", "$i$a$-map-AddressSelectionViewModel$formatAddresses$1$1", "$this$flow"}, nl = {95, 72}, s = {"L$0", "L$1", "L$4", "L$5", "L$7", "L$8", "I$0", "I$1", "I$2", "L$0"}, v = 2)
/* loaded from: classes13.dex */
final class AddressSelectionViewModel$formatAddresses$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends java.lang.String>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.Address.Style getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    int getValidOutputFormatsForInputhNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel isOutputSupportedFor;
    private /* synthetic */ java.lang.Object unwrapAs;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fb, code lost:
    
        if (r9.emit(r3, r16) != r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00ca -> B:12:0x00cb). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        int i;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel addressSelectionViewModel;
        com.paypal.oslo.core.i18n.domain.model.Address.Style style;
        java.util.Collection collection;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        int i2;
        java.util.Collection emptyList;
        kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.unwrapAs;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (i3 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
                flowCollector = flowCollector2;
                this.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
                this.getHighSpeedVideoSizesFor = null;
                this.getInputFormats = null;
                this.getOutputFormats = null;
                this.getInputSizeshNQ4ISI = null;
                this.getOutputStallDuration = null;
                this.getOutputMinFrameDurationlomOqCM = null;
                this.getOutputSizeshNQ4ISI = null;
                this.getOutputStallDurationlomOqCM = null;
                this.getOutputSizes = null;
                this.getOutputMinFrameDuration = null;
                this.getValidOutputFormatsForInputhNQ4ISI = 2;
            } else {
                java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> list = this.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel addressSelectionViewModel2 = this.isOutputSupportedFor;
                com.paypal.oslo.core.i18n.domain.model.Address.Style style2 = this.getHighSpeedVideoFpsRangesFor;
                java.util.Collection arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                iterable = list;
                iterable2 = iterable;
                i = 0;
                addressSelectionViewModel = addressSelectionViewModel2;
                style = style2;
                collection = arrayList;
                flowCollector = flowCollector2;
                i2 = 0;
                if (it.hasNext()) {
                }
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            i = this.getHighSpeedVideoFpsRanges;
            i2 = this.getHighSpeedVideoSizes;
            java.util.Collection collection2 = (java.util.Collection) this.getOutputMinFrameDuration;
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputSizes;
            it = (java.util.Iterator) this.getOutputMinFrameDurationlomOqCM;
            java.util.Collection collection3 = (java.util.Collection) this.getOutputStallDuration;
            iterable = (java.lang.Iterable) this.getInputSizeshNQ4ISI;
            style = (com.paypal.oslo.core.i18n.domain.model.Address.Style) this.getOutputFormats;
            addressSelectionViewModel = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel) this.getInputFormats;
            iterable2 = (java.lang.Iterable) this.getHighSpeedVideoSizesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object access$formatSingleAddress = obj;
            java.util.Collection collection4 = collection2;
            collection4.add((java.lang.String) access$formatSingleAddress);
            collection = collection3;
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                com.paypal.oslo.core.i18n.domain.model.Address address = (com.paypal.oslo.core.i18n.domain.model.Address) next;
                this.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                this.getInputFormats = addressSelectionViewModel;
                this.getOutputFormats = style;
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                this.getOutputStallDuration = collection;
                this.getOutputMinFrameDurationlomOqCM = it;
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address);
                this.getOutputSizes = flowCollector;
                this.getOutputMinFrameDuration = collection;
                this.getHighSpeedVideoSizes = i2;
                this.getHighSpeedVideoFpsRanges = i;
                this.Camera2StreamConfigurationMap = 0;
                this.getValidOutputFormatsForInputhNQ4ISI = 1;
                access$formatSingleAddress = com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel.access$formatSingleAddress(addressSelectionViewModel, address, style, this);
                if (access$formatSingleAddress != coroutine_suspended) {
                    collection3 = collection;
                    collection4 = collection;
                    collection4.add((java.lang.String) access$formatSingleAddress);
                    collection = collection3;
                    if (it.hasNext()) {
                        emptyList = (java.util.List) collection;
                        this.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
                        this.getHighSpeedVideoSizesFor = null;
                        this.getInputFormats = null;
                        this.getOutputFormats = null;
                        this.getInputSizeshNQ4ISI = null;
                        this.getOutputStallDuration = null;
                        this.getOutputMinFrameDurationlomOqCM = null;
                        this.getOutputSizeshNQ4ISI = null;
                        this.getOutputStallDurationlomOqCM = null;
                        this.getOutputSizes = null;
                        this.getOutputMinFrameDuration = null;
                        this.getValidOutputFormatsForInputhNQ4ISI = 2;
                    }
                }
                return coroutine_suspended;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends java.lang.String>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel$formatAddresses$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel$formatAddresses$1 addressSelectionViewModel$formatAddresses$1 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel$formatAddresses$1(this.getHighResolutionOutputSizeshNQ4ISI, this.isOutputSupportedFor, this.getHighSpeedVideoFpsRangesFor, continuation);
        addressSelectionViewModel$formatAddresses$1.unwrapAs = obj;
        return addressSelectionViewModel$formatAddresses$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressSelectionViewModel$formatAddresses$1(java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> list, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel addressSelectionViewModel, com.paypal.oslo.core.i18n.domain.model.Address.Style style, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel$formatAddresses$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.isOutputSupportedFor = addressSelectionViewModel;
        this.getHighSpeedVideoFpsRangesFor = style;
    }
}
