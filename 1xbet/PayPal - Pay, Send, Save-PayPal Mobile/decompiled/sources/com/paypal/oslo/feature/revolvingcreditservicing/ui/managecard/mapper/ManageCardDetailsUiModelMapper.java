package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/mapper/ManageCardDetailsUiModelMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "formatAddressUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;", "phoneNumberFormatterFacade", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "manageCardDetails", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/UserInfoSectionUiModel;", "toUserInfoSectionUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/Address;", "p0", "", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/Address;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "shouldShowSeeDetailButton", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardArtSectionUiModel;", "toCardArtSectionUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;ZLcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardArtSectionUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CreditDetailsSectionUiModel;", "toCreditDetailsSection", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ManageCardDetailsUiModelMapper {
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public ManageCardDetailsUiModelMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade phoneNumberFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatAddressUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberFormatterFacade, "");
        this.getHighSpeedVideoFpsRangesFor = currencyFormatterFacade;
        this.getHighResolutionOutputSizeshNQ4ISI = formatAddressUseCase;
        this.getHighSpeedVideoFpsRanges = phoneNumberFormatterFacade;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toUserInfoSectionUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.UserInfoSectionUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1 manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber2;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.Address> addresses;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber> phoneNumbers;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter;
        java.lang.String str4;
        java.lang.String nationalNumber;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1) {
            manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1) continuation;
            if ((manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getInputFormats -= 2147483648;
                java.lang.Object obj = manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileOverview = manageCardDetails.getCustomerProfileOverview();
                    java.lang.String email = customerProfileOverview != null ? customerProfileOverview.getEmail() : null;
                    if (email == null) {
                        email = "";
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileOverview2 = manageCardDetails.getCustomerProfileOverview();
                    phoneNumber = (customerProfileOverview2 == null || (phoneNumbers = customerProfileOverview2.getPhoneNumbers()) == null) ? null : (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) phoneNumbers);
                    java.lang.String format$default = phoneNumber != null ? com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade.format$default(this.getHighSpeedVideoFpsRanges, phoneNumber, true, null, 4, null) : null;
                    java.lang.String str5 = format$default != null ? format$default : "";
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileOverview3 = manageCardDetails.getCustomerProfileOverview();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.Address address = (customerProfileOverview3 == null || (addresses = customerProfileOverview3.getAddresses()) == null) ? null : (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.Address) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) addresses);
                    if (address != null) {
                        manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(manageCardDetails);
                        manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getHighResolutionOutputSizeshNQ4ISI = email;
                        manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getHighSpeedVideoSizes = phoneNumber;
                        manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getHighSpeedVideoFpsRangesFor = str5;
                        manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address);
                        manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address);
                        manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getHighSpeedVideoFpsRanges = 0;
                        manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getInputFormats = 1;
                        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(address, manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1);
                        if (Camera2StreamConfigurationMap == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        phoneNumber2 = phoneNumber;
                        java.lang.String str6 = email;
                        obj = Camera2StreamConfigurationMap;
                        str = str5;
                        str2 = str6;
                    } else {
                        str = str5;
                        str2 = email;
                        str3 = null;
                        if (phoneNumber != null && str.length() > 0) {
                            nationalNumber = phoneNumber.getNationalNumber();
                            if (nationalNumber.length() >= 3) {
                                stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_phone_number_accessibility_label, new java.lang.Object[]{java.lang.String.valueOf(kotlin.text.StringsKt.first(nationalNumber)), kotlin.text.StringsKt.takeLast(nationalNumber, 2)}, null, false, 12, null);
                                str4 = str2;
                                if (str4.length() == 0) {
                                    str4 = null;
                                }
                                java.lang.String str7 = str;
                                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.UserInfoSectionUiModel(str3, str4, str7.length() != 0 ? str7 : null, stringResWithParameter);
                            }
                        }
                        stringResWithParameter = null;
                        str4 = str2;
                        if (str4.length() == 0) {
                        }
                        java.lang.String str72 = str;
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.UserInfoSectionUiModel(str3, str4, str72.length() != 0 ? str72 : null, stringResWithParameter);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getHighSpeedVideoFpsRanges;
                    str = (java.lang.String) manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getHighSpeedVideoFpsRangesFor;
                    phoneNumber2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber) manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getHighSpeedVideoSizes;
                    str2 = (java.lang.String) manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str3 = (java.lang.String) obj;
                phoneNumber = phoneNumber2;
                if (phoneNumber != null) {
                    nationalNumber = phoneNumber.getNationalNumber();
                    if (nationalNumber.length() >= 3) {
                    }
                }
                stringResWithParameter = null;
                str4 = str2;
                if (str4.length() == 0) {
                }
                java.lang.String str722 = str;
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.UserInfoSectionUiModel(str3, str4, str722.length() != 0 ? str722 : null, stringResWithParameter);
            }
        }
        manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1(this, continuation);
        java.lang.Object obj2 = manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1.getInputFormats;
        if (i != 0) {
        }
        str3 = (java.lang.String) obj2;
        phoneNumber = phoneNumber2;
        if (phoneNumber != null) {
        }
        stringResWithParameter = null;
        str4 = str2;
        if (str4.length() == 0) {
        }
        java.lang.String str7222 = str;
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.UserInfoSectionUiModel(str3, str4, str7222.length() != 0 ? str7222 : null, stringResWithParameter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.Address address, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$formatAddress$1 manageCardDetailsUiModelMapper$formatAddress$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.Address address2;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$formatAddress$1) {
            manageCardDetailsUiModelMapper$formatAddress$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$formatAddress$1) continuation;
            if ((manageCardDetailsUiModelMapper$formatAddress$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                manageCardDetailsUiModelMapper$formatAddress$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = manageCardDetailsUiModelMapper$formatAddress$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageCardDetailsUiModelMapper$formatAddress$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String addressLine1 = address.getAddressLine1();
                    java.lang.String m11273constructorimpl = addressLine1 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(addressLine1) : null;
                    java.lang.String addressLine2 = address.getAddressLine2();
                    java.lang.String m11282constructorimpl = addressLine2 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(addressLine2) : null;
                    java.lang.String addressLine3 = address.getAddressLine3();
                    java.lang.String m11291constructorimpl = addressLine3 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11291constructorimpl(addressLine3) : null;
                    java.lang.String adminArea1 = address.getAdminArea1();
                    java.lang.String m11300constructorimpl = adminArea1 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(adminArea1) : null;
                    java.lang.String adminArea2 = address.getAdminArea2();
                    java.lang.String m11309constructorimpl = adminArea2 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(adminArea2) : null;
                    java.lang.String adminArea3 = address.getAdminArea3();
                    java.lang.String m11318constructorimpl = adminArea3 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea3.m11318constructorimpl(adminArea3) : null;
                    java.lang.String postalCode = address.getPostalCode();
                    java.lang.String m11460constructorimpl = postalCode != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(postalCode) : null;
                    java.lang.String countryCode = address.getCountryCode();
                    com.paypal.oslo.core.i18n.domain.model.Address address3 = new com.paypal.oslo.core.i18n.domain.model.Address(m11273constructorimpl, m11282constructorimpl, m11291constructorimpl, null, m11318constructorimpl, m11309constructorimpl, m11300constructorimpl, m11460constructorimpl, countryCode != null ? com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(countryCode) : null, null, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, null);
                    com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration = new com.paypal.oslo.core.i18n.domain.model.AddressConfiguration(null, null, null, null, com.paypal.oslo.core.i18n.domain.model.Address.Style.MULTILINE, null, null, 111, null);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    manageCardDetailsUiModelMapper$formatAddress$1.getHighResolutionOutputSizeshNQ4ISI = address;
                    manageCardDetailsUiModelMapper$formatAddress$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address3);
                    manageCardDetailsUiModelMapper$formatAddress$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressConfiguration);
                    manageCardDetailsUiModelMapper$formatAddress$1.getHighSpeedVideoSizes = 1;
                    obj = formatAddressUseCase.invoke(address3, addressConfiguration, manageCardDetailsUiModelMapper$formatAddress$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    address2 = address;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    address2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.Address) manageCardDetailsUiModelMapper$formatAddress$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    return kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{address2.getAddressLine1(), address2.getAddressLine2(), address2.getAddressLine3(), address2.getAdminArea3(), address2.getAdminArea1(), address2.getPostalCode(), address2.getCountryCode()}), ", ", null, null, 0, null, null, 62, null);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        manageCardDetailsUiModelMapper$formatAddress$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$formatAddress$1(this, continuation);
        java.lang.Object obj2 = manageCardDetailsUiModelMapper$formatAddress$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageCardDetailsUiModelMapper$formatAddress$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardArtSectionUiModel toCardArtSectionUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails, boolean shouldShowSeeDetailButton, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon cardArtImage = manageCardDetails.getCardArtImage();
        if (cardArtImage == null || (str = cardArtImage.getContentDeliveryNetwork()) == null) {
            str = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardArtUrls.CBMC;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument = manageCardDetails.getCreditInstrument();
        java.lang.String lastDigits = creditInstrument != null ? creditInstrument.getLastDigits() : null;
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardArtSectionUiModel(str, lastDigits != null ? lastDigits : "", shouldShowSeeDetailButton, creditProductIdentifier);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toCreditDetailsSection(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$toCreditDetailsSection$1 manageCardDetailsUiModelMapper$toCreditDetailsSection$1;
        int i;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs aprs;
        java.lang.String cashAdvanceAPR;
        java.lang.String percentage;
        java.lang.String purchaseAPR;
        java.lang.String percentage2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$toCreditDetailsSection$1) {
            manageCardDetailsUiModelMapper$toCreditDetailsSection$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$toCreditDetailsSection$1) continuation;
            if ((manageCardDetailsUiModelMapper$toCreditDetailsSection$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                manageCardDetailsUiModelMapper$toCreditDetailsSection$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$toCreditDetailsSection$1 manageCardDetailsUiModelMapper$toCreditDetailsSection$12 = manageCardDetailsUiModelMapper$toCreditDetailsSection$1;
                java.lang.Object obj = manageCardDetailsUiModelMapper$toCreditDetailsSection$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageCardDetailsUiModelMapper$toCreditDetailsSection$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount temporaryCreditLimit = manageCardDetails.getTemporaryCreditLimit();
                    if (temporaryCreditLimit == null) {
                        temporaryCreditLimit = manageCardDetails.getCreditLimit();
                    }
                    manageCardDetailsUiModelMapper$toCreditDetailsSection$12.getHighResolutionOutputSizeshNQ4ISI = manageCardDetails;
                    manageCardDetailsUiModelMapper$toCreditDetailsSection$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, temporaryCreditLimit, null, 0, manageCardDetailsUiModelMapper$toCreditDetailsSection$12, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    manageCardDetails = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) manageCardDetailsUiModelMapper$toCreditDetailsSection$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    str = "";
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str);
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs aprs2 = manageCardDetails.getAprs();
                plainString = null;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString3 = (aprs2 != null || (purchaseAPR = aprs2.getPurchaseAPR()) == null || (percentage2 = com.paypal.oslo.feature.revolvingcreditservicing.utils.NumberUtilsKt.toPercentage(purchaseAPR)) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(percentage2);
                aprs = manageCardDetails.getAprs();
                if (aprs != null && (cashAdvanceAPR = aprs.getCashAdvanceAPR()) != null && (percentage = com.paypal.oslo.feature.revolvingcreditservicing.utils.NumberUtilsKt.toPercentage(cashAdvanceAPR)) != null) {
                    plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(percentage);
                }
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel(plainString2, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null, plainString3, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null, plainString, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null, 42, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
        }
        manageCardDetailsUiModelMapper$toCreditDetailsSection$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$toCreditDetailsSection$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$toCreditDetailsSection$1 manageCardDetailsUiModelMapper$toCreditDetailsSection$122 = manageCardDetailsUiModelMapper$toCreditDetailsSection$1;
        java.lang.Object obj2 = manageCardDetailsUiModelMapper$toCreditDetailsSection$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageCardDetailsUiModelMapper$toCreditDetailsSection$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString22 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs aprs22 = manageCardDetails.getAprs();
        plainString = null;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString32 = (aprs22 != null || (purchaseAPR = aprs22.getPurchaseAPR()) == null || (percentage2 = com.paypal.oslo.feature.revolvingcreditservicing.utils.NumberUtilsKt.toPercentage(purchaseAPR)) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(percentage2);
        aprs = manageCardDetails.getAprs();
        if (aprs != null) {
            plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(percentage);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CreditDetailsSectionUiModel(plainString22, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null, plainString32, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null, plainString, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) null, 42, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
