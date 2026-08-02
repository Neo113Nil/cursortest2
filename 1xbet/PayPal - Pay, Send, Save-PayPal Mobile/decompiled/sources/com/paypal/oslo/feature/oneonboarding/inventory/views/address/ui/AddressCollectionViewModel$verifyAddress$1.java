package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$verifyAddress$1", f = "AddressCollectionViewModel.kt", i = {0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, 305, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m = "invokeSuspend", n = {"multilineConfig", "multilineConfig", "this_$iv", "result", "verified", "$i$f$fold", "$i$a$-fold-AddressCollectionViewModel$verifyAddress$1$2", "multilineConfig", "this_$iv", "result", "verified", "$i$f$fold", "$i$a$-fold-AddressCollectionViewModel$verifyAddress$1$2", "multilineConfig", "this_$iv", "result", "errorMessage", "$i$f$fold", "$i$a$-fold-AddressCollectionViewModel$verifyAddress$1$2", "multilineConfig", "this_$iv", "error", "errorMessage", "$i$f$fold", "$i$a$-fold-AddressCollectionViewModel$verifyAddress$1$1"}, nl = {388, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE, 306, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, s = {"L$0", "L$0", "L$1", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class AddressCollectionViewModel$verifyAddress$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel coroutineCreation;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.Address getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    int getInputFormats;
    int getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    java.lang.Object isOutputSupportedFor;
    int isOutputSupportedForhNQ4ISI;
    java.lang.Object toString;
    java.lang.Object unwrapAs;

    /* JADX WARN: Code restructure failed: missing block: B:111:0x019c, code lost:
    
        if (r5 == r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState copy;
        com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.VerifyAddressUseCase verifyAddressUseCase;
        java.lang.Object invoke;
        arrow.core.Either either;
        com.paypal.oslo.core.i18n.domain.model.Address address;
        boolean z;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        boolean z2;
        java.lang.Object access$formatAddressWithoutCountry;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        java.lang.String str;
        com.paypal.oslo.core.i18n.domain.model.Address address2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState addressFormUiState;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        int i6;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow7;
        java.lang.Object access$formatAddressWithoutCountry2;
        java.lang.Object obj2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationResult addressVerificationResult;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow8;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel addressCollectionViewModel;
        com.paypal.oslo.core.i18n.domain.model.Address address3;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState addressFormUiState2;
        com.paypal.oslo.core.i18n.domain.model.Address address4;
        com.paypal.oslo.core.i18n.domain.model.Address address5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration2;
        com.paypal.oslo.core.i18n.domain.model.Address address6;
        int i13;
        int i14;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow9;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow10;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState copy2;
        java.lang.String concat;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow11;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow12;
        java.lang.Object access$formatAddressWithoutCountry3;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState addressFormUiState3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        java.lang.Object access$formatAddressWithoutCountry4;
        java.lang.Object obj3;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState addressFormUiState4;
        com.paypal.oslo.core.i18n.domain.model.Address address7;
        int i21;
        int i22;
        int i23;
        java.lang.String str2;
        int i24;
        int i25;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow13;
        com.paypal.oslo.core.i18n.domain.model.Address address8;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState copy3;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState copy4;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState copy5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i26 = this.isOutputSupportedForhNQ4ISI;
        if (i26 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.coroutineCreation.getHighSpeedVideoFpsRanges;
            mutableStateFlow2 = this.coroutineCreation.getHighSpeedVideoFpsRanges;
            copy = r19.copy((r28 & 1) != 0 ? r19.searchQuery : null, (r28 & 2) != 0 ? r19.isSearching : false, (r28 & 4) != 0 ? r19.suggestions : null, (r28 & 8) != 0 ? r19.searchError : null, (r28 & 16) != 0 ? r19.selectedAddress : null, (r28 & 32) != 0 ? r19.fieldValues : null, (r28 & 64) != 0 ? r19.fieldErrors : null, (r28 & 128) != 0 ? r19.hasValidationError : false, (r28 & 256) != 0 ? r19.hasPOBoxError : false, (r28 & 512) != 0 ? r19.hasPMBError : false, (r28 & 1024) != 0 ? r19.hasUSTerritoryError : false, (r28 & 2048) != 0 ? r19.isManualEntry : false, (r28 & 4096) != 0 ? ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState) mutableStateFlow2.getValue()).verificationState : com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Verifying.INSTANCE);
            mutableStateFlow.setValue(copy);
            addressConfiguration = new com.paypal.oslo.core.i18n.domain.model.AddressConfiguration(null, null, null, null, com.paypal.oslo.core.i18n.domain.model.Address.Style.MULTILINE, null, null, 111, null);
            verifyAddressUseCase = this.coroutineCreation.getHighSpeedVideoSizes;
            this.getOutputMinFrameDuration = addressConfiguration;
            this.isOutputSupportedForhNQ4ISI = 1;
            invoke = verifyAddressUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this);
        } else {
            if (i26 != 1) {
                if (i26 == 2) {
                    int i27 = this.getInputFormats;
                    int i28 = this.getInputSizeshNQ4ISI;
                    int i29 = this.getOutputFormats;
                    int i30 = this.getHighSpeedVideoSizesFor;
                    int i31 = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i32 = this.Camera2StreamConfigurationMap;
                    int i33 = this.getHighSpeedVideoFpsRanges;
                    int i34 = this.getHighSpeedVideoSizes;
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow14 = (kotlinx.coroutines.flow.MutableStateFlow) this.unwrapAs;
                    com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState addressFormUiState5 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState) this.getValidOutputFormatsForInputhNQ4ISI;
                    com.paypal.oslo.core.i18n.domain.model.Address address9 = (com.paypal.oslo.core.i18n.domain.model.Address) this.toString;
                    com.paypal.oslo.core.i18n.domain.model.Address address10 = (com.paypal.oslo.core.i18n.domain.model.Address) this.isOutputSupportedFor;
                    com.paypal.oslo.core.i18n.domain.model.Address address11 = (com.paypal.oslo.core.i18n.domain.model.Address) this.getOutputStallDurationlomOqCM;
                    com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationResult addressVerificationResult2 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationResult) this.getOutputSizeshNQ4ISI;
                    addressCollectionViewModel = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel) this.getOutputStallDuration;
                    address5 = (com.paypal.oslo.core.i18n.domain.model.Address) this.getOutputSizes;
                    arrow.core.Either either2 = (arrow.core.Either) this.getOutputMinFrameDurationlomOqCM;
                    com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration3 = (com.paypal.oslo.core.i18n.domain.model.AddressConfiguration) this.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i12 = i28;
                    addressConfiguration2 = addressConfiguration3;
                    i13 = i34;
                    i10 = i32;
                    i9 = i31;
                    i8 = i30;
                    access$formatAddressWithoutCountry2 = obj;
                    obj2 = coroutine_suspended;
                    addressFormUiState2 = addressFormUiState5;
                    address3 = address11;
                    i14 = i29;
                    address4 = address10;
                    either = either2;
                    i11 = i27;
                    addressVerificationResult = addressVerificationResult2;
                    i7 = i33;
                    address6 = address9;
                    mutableStateFlow8 = mutableStateFlow14;
                    java.lang.String str3 = (java.lang.String) access$formatAddressWithoutCountry2;
                    int i35 = i14;
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressConfiguration2);
                    this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressVerificationResult);
                    this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address3);
                    this.getOutputSizeshNQ4ISI = address4;
                    this.getOutputStallDurationlomOqCM = address6;
                    this.isOutputSupportedFor = addressFormUiState2;
                    this.toString = mutableStateFlow8;
                    this.getValidOutputFormatsForInputhNQ4ISI = str3;
                    this.unwrapAs = null;
                    this.getHighSpeedVideoSizes = i13;
                    this.getHighSpeedVideoFpsRanges = i7;
                    this.Camera2StreamConfigurationMap = i10;
                    this.getHighResolutionOutputSizeshNQ4ISI = i9;
                    this.getHighSpeedVideoSizesFor = i8;
                    this.getOutputFormats = i35;
                    int i36 = i12;
                    this.getInputSizeshNQ4ISI = i36;
                    int i37 = i11;
                    this.getInputFormats = i37;
                    this.isOutputSupportedForhNQ4ISI = 3;
                    access$formatAddressWithoutCountry4 = com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel.access$formatAddressWithoutCountry(addressCollectionViewModel, address5, addressConfiguration2, this);
                    obj3 = obj2;
                    if (access$formatAddressWithoutCountry4 != obj3) {
                        return obj3;
                    }
                    addressFormUiState4 = addressFormUiState2;
                    address7 = address4;
                    i21 = i37;
                    i22 = i35;
                    i23 = i36;
                    str2 = str3;
                    i24 = i9;
                    i25 = i10;
                    mutableStateFlow13 = mutableStateFlow8;
                    address8 = address6;
                    copy3 = addressFormUiState4.copy((r28 & 1) != 0 ? addressFormUiState4.searchQuery : null, (r28 & 2) != 0 ? addressFormUiState4.isSearching : i21 == 0, (r28 & 4) != 0 ? addressFormUiState4.suggestions : null, (r28 & 8) != 0 ? addressFormUiState4.searchError : null, (r28 & 16) != 0 ? addressFormUiState4.selectedAddress : null, (r28 & 32) != 0 ? addressFormUiState4.fieldValues : null, (r28 & 64) != 0 ? addressFormUiState4.fieldErrors : null, (r28 & 128) != 0 ? addressFormUiState4.hasValidationError : i23 == 0, (r28 & 256) != 0 ? addressFormUiState4.hasPOBoxError : i22 == 0, (r28 & 512) != 0 ? addressFormUiState4.hasPMBError : i8 == 0, (r28 & 1024) != 0 ? addressFormUiState4.hasUSTerritoryError : i24 == 0, (r28 & 2048) != 0 ? addressFormUiState4.isManualEntry : i25 == 0, (r28 & 4096) != 0 ? addressFormUiState4.verificationState : new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Verified(address8, address7, str2, (java.lang.String) access$formatAddressWithoutCountry4));
                    mutableStateFlow13.setValue(copy3);
                    return kotlin.Unit.INSTANCE;
                }
                if (i26 == 3) {
                    i21 = this.getInputFormats;
                    i23 = this.getInputSizeshNQ4ISI;
                    int i38 = this.getOutputFormats;
                    int i39 = this.getHighSpeedVideoSizesFor;
                    i24 = this.getHighResolutionOutputSizeshNQ4ISI;
                    i25 = this.Camera2StreamConfigurationMap;
                    java.lang.String str4 = (java.lang.String) this.getValidOutputFormatsForInputhNQ4ISI;
                    mutableStateFlow13 = (kotlinx.coroutines.flow.MutableStateFlow) this.toString;
                    com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState addressFormUiState6 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState) this.isOutputSupportedFor;
                    address8 = (com.paypal.oslo.core.i18n.domain.model.Address) this.getOutputStallDurationlomOqCM;
                    address7 = (com.paypal.oslo.core.i18n.domain.model.Address) this.getOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = str4;
                    addressFormUiState4 = addressFormUiState6;
                    i8 = i39;
                    i22 = i38;
                    access$formatAddressWithoutCountry4 = obj;
                    copy3 = addressFormUiState4.copy((r28 & 1) != 0 ? addressFormUiState4.searchQuery : null, (r28 & 2) != 0 ? addressFormUiState4.isSearching : i21 == 0, (r28 & 4) != 0 ? addressFormUiState4.suggestions : null, (r28 & 8) != 0 ? addressFormUiState4.searchError : null, (r28 & 16) != 0 ? addressFormUiState4.selectedAddress : null, (r28 & 32) != 0 ? addressFormUiState4.fieldValues : null, (r28 & 64) != 0 ? addressFormUiState4.fieldErrors : null, (r28 & 128) != 0 ? addressFormUiState4.hasValidationError : i23 == 0, (r28 & 256) != 0 ? addressFormUiState4.hasPOBoxError : i22 == 0, (r28 & 512) != 0 ? addressFormUiState4.hasPMBError : i8 == 0, (r28 & 1024) != 0 ? addressFormUiState4.hasUSTerritoryError : i24 == 0, (r28 & 2048) != 0 ? addressFormUiState4.isManualEntry : i25 == 0, (r28 & 4096) != 0 ? addressFormUiState4.verificationState : new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Verified(address8, address7, str2, (java.lang.String) access$formatAddressWithoutCountry4));
                    mutableStateFlow13.setValue(copy3);
                    return kotlin.Unit.INSTANCE;
                }
                if (i26 == 4) {
                    i15 = this.getInputFormats;
                    int i40 = this.getInputSizeshNQ4ISI;
                    int i41 = this.getOutputFormats;
                    int i42 = this.getHighSpeedVideoSizesFor;
                    int i43 = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i44 = this.Camera2StreamConfigurationMap;
                    mutableStateFlow11 = (kotlinx.coroutines.flow.MutableStateFlow) this.isOutputSupportedFor;
                    com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState addressFormUiState7 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState) this.getOutputStallDurationlomOqCM;
                    address = (com.paypal.oslo.core.i18n.domain.model.Address) this.getOutputSizeshNQ4ISI;
                    concat = (java.lang.String) this.getOutputStallDuration;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i20 = i44;
                    addressFormUiState3 = addressFormUiState7;
                    i19 = i43;
                    i18 = i42;
                    i17 = i41;
                    i16 = i40;
                    access$formatAddressWithoutCountry3 = obj;
                    copy4 = addressFormUiState3.copy((r28 & 1) != 0 ? addressFormUiState3.searchQuery : null, (r28 & 2) != 0 ? addressFormUiState3.isSearching : i15 == 0, (r28 & 4) != 0 ? addressFormUiState3.suggestions : null, (r28 & 8) != 0 ? addressFormUiState3.searchError : null, (r28 & 16) != 0 ? addressFormUiState3.selectedAddress : null, (r28 & 32) != 0 ? addressFormUiState3.fieldValues : null, (r28 & 64) != 0 ? addressFormUiState3.fieldErrors : null, (r28 & 128) != 0 ? addressFormUiState3.hasValidationError : i16 == 0, (r28 & 256) != 0 ? addressFormUiState3.hasPOBoxError : i17 == 0, (r28 & 512) != 0 ? addressFormUiState3.hasPMBError : i18 == 0, (r28 & 1024) != 0 ? addressFormUiState3.hasUSTerritoryError : i19 == 0, (r28 & 2048) != 0 ? addressFormUiState3.isManualEntry : i20 == 0, (r28 & 4096) != 0 ? addressFormUiState3.verificationState : new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed(address, (java.lang.String) access$formatAddressWithoutCountry3, concat));
                    mutableStateFlow11.setValue(copy4);
                    return kotlin.Unit.INSTANCE;
                }
                if (i26 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i45 = this.getInputFormats;
                int i46 = this.getInputSizeshNQ4ISI;
                int i47 = this.getOutputFormats;
                int i48 = this.getHighSpeedVideoSizesFor;
                int i49 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i50 = this.Camera2StreamConfigurationMap;
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow15 = (kotlinx.coroutines.flow.MutableStateFlow) this.isOutputSupportedFor;
                com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState addressFormUiState8 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState) this.getOutputStallDurationlomOqCM;
                com.paypal.oslo.core.i18n.domain.model.Address address12 = (com.paypal.oslo.core.i18n.domain.model.Address) this.getOutputSizeshNQ4ISI;
                java.lang.String str5 = (java.lang.String) this.getOutputStallDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                i5 = i50;
                str = str5;
                i3 = i48;
                address2 = address12;
                i6 = i46;
                addressFormUiState = addressFormUiState8;
                access$formatAddressWithoutCountry = obj;
                mutableStateFlow5 = mutableStateFlow15;
                z = true;
                i4 = i49;
                i2 = i47;
                i = i45;
                z2 = false;
                copy5 = addressFormUiState.copy((r28 & 1) != 0 ? addressFormUiState.searchQuery : null, (r28 & 2) != 0 ? addressFormUiState.isSearching : i == 0 ? z : z2, (r28 & 4) != 0 ? addressFormUiState.suggestions : null, (r28 & 8) != 0 ? addressFormUiState.searchError : null, (r28 & 16) != 0 ? addressFormUiState.selectedAddress : null, (r28 & 32) != 0 ? addressFormUiState.fieldValues : null, (r28 & 64) != 0 ? addressFormUiState.fieldErrors : null, (r28 & 128) != 0 ? addressFormUiState.hasValidationError : i6 == 0 ? z : z2, (r28 & 256) != 0 ? addressFormUiState.hasPOBoxError : i2 == 0 ? z : z2, (r28 & 512) != 0 ? addressFormUiState.hasPMBError : i3 == 0 ? z : z2, (r28 & 1024) != 0 ? addressFormUiState.hasUSTerritoryError : i4 == 0 ? z : z2, (r28 & 2048) != 0 ? addressFormUiState.isManualEntry : i5 != 0 ? z2 : z, (r28 & 4096) != 0 ? addressFormUiState.verificationState : new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed(address2, (java.lang.String) access$formatAddressWithoutCountry, str));
                mutableStateFlow5.setValue(copy5);
                return kotlin.Unit.INSTANCE;
            }
            addressConfiguration = (com.paypal.oslo.core.i18n.domain.model.AddressConfiguration) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel addressCollectionViewModel2 = this.coroutineCreation;
        address = this.getHighSpeedVideoFpsRangesFor;
        if (!(either instanceof arrow.core.Either.Right)) {
            if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError apiCallError = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallError) ((arrow.core.Either.Left) either).getValue();
                java.lang.String errorMessage = com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ApiCallErrorKt.toErrorMessage(apiCallError);
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.oneonboarding.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(apiCallError.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = "Unknown";
                }
                pairArr[0] = kotlin.TuplesKt.to("errorType", simpleName);
                z = true;
                pairArr[1] = kotlin.TuplesKt.to("errorMessage", errorMessage);
                com.paypal.android.logger.Logger.w$default(logger, "Address verification failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                mutableStateFlow3 = addressCollectionViewModel2.getHighSpeedVideoFpsRanges;
                mutableStateFlow4 = addressCollectionViewModel2.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState addressFormUiState9 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState) mutableStateFlow4.getValue();
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressConfiguration);
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apiCallError);
                this.getOutputStallDuration = errorMessage;
                this.getOutputSizeshNQ4ISI = address;
                this.getOutputStallDurationlomOqCM = addressFormUiState9;
                this.isOutputSupportedFor = mutableStateFlow3;
                z2 = false;
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRanges = 0;
                this.Camera2StreamConfigurationMap = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoSizesFor = 0;
                this.getOutputFormats = 0;
                this.getInputSizeshNQ4ISI = 0;
                this.getInputFormats = 0;
                this.isOutputSupportedForhNQ4ISI = 5;
                access$formatAddressWithoutCountry = com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel.access$formatAddressWithoutCountry(addressCollectionViewModel2, address, addressConfiguration, this);
                if (access$formatAddressWithoutCountry == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                str = errorMessage;
                address2 = address;
                addressFormUiState = addressFormUiState9;
                mutableStateFlow5 = mutableStateFlow3;
                i6 = 0;
                if (i == 0) {
                }
                if (i6 == 0) {
                }
                if (i2 == 0) {
                }
                if (i3 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                copy5 = addressFormUiState.copy((r28 & 1) != 0 ? addressFormUiState.searchQuery : null, (r28 & 2) != 0 ? addressFormUiState.isSearching : i == 0 ? z : z2, (r28 & 4) != 0 ? addressFormUiState.suggestions : null, (r28 & 8) != 0 ? addressFormUiState.searchError : null, (r28 & 16) != 0 ? addressFormUiState.selectedAddress : null, (r28 & 32) != 0 ? addressFormUiState.fieldValues : null, (r28 & 64) != 0 ? addressFormUiState.fieldErrors : null, (r28 & 128) != 0 ? addressFormUiState.hasValidationError : i6 == 0 ? z : z2, (r28 & 256) != 0 ? addressFormUiState.hasPOBoxError : i2 == 0 ? z : z2, (r28 & 512) != 0 ? addressFormUiState.hasPMBError : i3 == 0 ? z : z2, (r28 & 1024) != 0 ? addressFormUiState.hasUSTerritoryError : i4 == 0 ? z : z2, (r28 & 2048) != 0 ? addressFormUiState.isManualEntry : i5 != 0 ? z2 : z, (r28 & 4096) != 0 ? addressFormUiState.verificationState : new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed(address2, (java.lang.String) access$formatAddressWithoutCountry, str));
                mutableStateFlow5.setValue(copy5);
                return kotlin.Unit.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationResult addressVerificationResult3 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationResult) ((arrow.core.Either.Right) either).getValue();
        int i51 = com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$verifyAddress$1.WhenMappings.$EnumSwitchMapping$0[addressVerificationResult3.getStatus().ordinal()];
        if (i51 == 1 || i51 == 2) {
            com.paypal.oslo.core.i18n.domain.model.Address verifiedAddress = addressVerificationResult3.getVerifiedAddress();
            com.paypal.oslo.core.i18n.domain.model.Address address13 = verifiedAddress == null ? address : verifiedAddress;
            if (kotlin.jvm.internal.Intrinsics.areEqual(address13, address)) {
                mutableStateFlow9 = addressCollectionViewModel2.getHighSpeedVideoFpsRanges;
                mutableStateFlow10 = addressCollectionViewModel2.getHighSpeedVideoFpsRanges;
                copy2 = r9.copy((r28 & 1) != 0 ? r9.searchQuery : null, (r28 & 2) != 0 ? r9.isSearching : false, (r28 & 4) != 0 ? r9.suggestions : null, (r28 & 8) != 0 ? r9.searchError : null, (r28 & 16) != 0 ? r9.selectedAddress : null, (r28 & 32) != 0 ? r9.fieldValues : null, (r28 & 64) != 0 ? r9.fieldErrors : null, (r28 & 128) != 0 ? r9.hasValidationError : false, (r28 & 256) != 0 ? r9.hasPOBoxError : false, (r28 & 512) != 0 ? r9.hasPMBError : false, (r28 & 1024) != 0 ? r9.hasUSTerritoryError : false, (r28 & 2048) != 0 ? r9.isManualEntry : false, (r28 & 4096) != 0 ? ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState) mutableStateFlow10.getValue()).verificationState : new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.AutoConfirmed(address13));
                mutableStateFlow9.setValue(copy2);
                return kotlin.Unit.INSTANCE;
            }
            mutableStateFlow6 = addressCollectionViewModel2.getHighSpeedVideoFpsRanges;
            mutableStateFlow7 = addressCollectionViewModel2.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState addressFormUiState10 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState) mutableStateFlow7.getValue();
            this.getOutputMinFrameDuration = addressConfiguration;
            this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputSizes = address;
            this.getOutputStallDuration = addressCollectionViewModel2;
            this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressVerificationResult3);
            this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address13);
            this.isOutputSupportedFor = address;
            this.toString = address13;
            this.getValidOutputFormatsForInputhNQ4ISI = addressFormUiState10;
            this.unwrapAs = mutableStateFlow6;
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoSizesFor = 0;
            this.getOutputFormats = 0;
            this.getInputSizeshNQ4ISI = 0;
            this.getInputFormats = 0;
            this.isOutputSupportedForhNQ4ISI = 2;
            access$formatAddressWithoutCountry2 = com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel.access$formatAddressWithoutCountry(addressCollectionViewModel2, address13, addressConfiguration, this);
            if (access$formatAddressWithoutCountry2 != coroutine_suspended) {
                obj2 = coroutine_suspended;
                addressVerificationResult = addressVerificationResult3;
                mutableStateFlow8 = mutableStateFlow6;
                addressCollectionViewModel = addressCollectionViewModel2;
                address3 = address13;
                addressFormUiState2 = addressFormUiState10;
                address4 = address;
                address5 = address4;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                addressConfiguration2 = addressConfiguration;
                address6 = address3;
                i13 = 0;
                i14 = 0;
                java.lang.String str32 = (java.lang.String) access$formatAddressWithoutCountry2;
                int i352 = i14;
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressConfiguration2);
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressVerificationResult);
                this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address3);
                this.getOutputSizeshNQ4ISI = address4;
                this.getOutputStallDurationlomOqCM = address6;
                this.isOutputSupportedFor = addressFormUiState2;
                this.toString = mutableStateFlow8;
                this.getValidOutputFormatsForInputhNQ4ISI = str32;
                this.unwrapAs = null;
                this.getHighSpeedVideoSizes = i13;
                this.getHighSpeedVideoFpsRanges = i7;
                this.Camera2StreamConfigurationMap = i10;
                this.getHighResolutionOutputSizeshNQ4ISI = i9;
                this.getHighSpeedVideoSizesFor = i8;
                this.getOutputFormats = i352;
                int i362 = i12;
                this.getInputSizeshNQ4ISI = i362;
                int i372 = i11;
                this.getInputFormats = i372;
                this.isOutputSupportedForhNQ4ISI = 3;
                access$formatAddressWithoutCountry4 = com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel.access$formatAddressWithoutCountry(addressCollectionViewModel, address5, addressConfiguration2, this);
                obj3 = obj2;
                if (access$formatAddressWithoutCountry4 != obj3) {
                }
            }
        } else {
            concat = "Address could not be verified: ".concat(java.lang.String.valueOf(addressVerificationResult3.getStatus().getStatus()));
            mutableStateFlow11 = addressCollectionViewModel2.getHighSpeedVideoFpsRanges;
            mutableStateFlow12 = addressCollectionViewModel2.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState addressFormUiState11 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState) mutableStateFlow12.getValue();
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressConfiguration);
            this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressVerificationResult3);
            this.getOutputStallDuration = concat;
            this.getOutputSizeshNQ4ISI = address;
            this.getOutputStallDurationlomOqCM = addressFormUiState11;
            this.isOutputSupportedFor = mutableStateFlow11;
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoSizesFor = 0;
            this.getOutputFormats = 0;
            this.getInputSizeshNQ4ISI = 0;
            this.getInputFormats = 0;
            this.isOutputSupportedForhNQ4ISI = 4;
            access$formatAddressWithoutCountry3 = com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel.access$formatAddressWithoutCountry(addressCollectionViewModel2, address, addressConfiguration, this);
            if (access$formatAddressWithoutCountry3 != coroutine_suspended) {
                addressFormUiState3 = addressFormUiState11;
                i15 = 0;
                i16 = 0;
                i17 = 0;
                i18 = 0;
                i19 = 0;
                i20 = 0;
                copy4 = addressFormUiState3.copy((r28 & 1) != 0 ? addressFormUiState3.searchQuery : null, (r28 & 2) != 0 ? addressFormUiState3.isSearching : i15 == 0, (r28 & 4) != 0 ? addressFormUiState3.suggestions : null, (r28 & 8) != 0 ? addressFormUiState3.searchError : null, (r28 & 16) != 0 ? addressFormUiState3.selectedAddress : null, (r28 & 32) != 0 ? addressFormUiState3.fieldValues : null, (r28 & 64) != 0 ? addressFormUiState3.fieldErrors : null, (r28 & 128) != 0 ? addressFormUiState3.hasValidationError : i16 == 0, (r28 & 256) != 0 ? addressFormUiState3.hasPOBoxError : i17 == 0, (r28 & 512) != 0 ? addressFormUiState3.hasPMBError : i18 == 0, (r28 & 1024) != 0 ? addressFormUiState3.hasUSTerritoryError : i19 == 0, (r28 & 2048) != 0 ? addressFormUiState3.isManualEntry : i20 == 0, (r28 & 4096) != 0 ? addressFormUiState3.verificationState : new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.VerificationState.Failed(address, (java.lang.String) access$formatAddressWithoutCountry3, concat));
                mutableStateFlow11.setValue(copy4);
                return kotlin.Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$verifyAddress$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus.VERIFIED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus.CORRECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$verifyAddress$1(this.coroutineCreation, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCollectionViewModel$verifyAddress$1(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel addressCollectionViewModel, com.paypal.oslo.core.i18n.domain.model.Address address, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$verifyAddress$1> continuation) {
        super(2, continuation);
        this.coroutineCreation = addressCollectionViewModel;
        this.getHighSpeedVideoFpsRangesFor = address;
    }
}
