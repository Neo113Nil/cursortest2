package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper", f = "PersonalInfoUiMapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, l = {116, 204, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, 269, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, com.visa.cbp.getCertUsage.getODAData}, m = "toUiModel", n = {"domainModel", "formFieldValidators", "bnplAcquisitionFormatter", "addressFormatter", "config", "sessionStorage", "countryCode", "defaultAddress", "documents", "eSignUrl", "stateDisclosuresUrl", "domainModel", "formFieldValidators", "bnplAcquisitionFormatter", "addressFormatter", "config", "sessionStorage", "countryCode", "defaultAddress", "documents", "eSignUrl", "stateDisclosuresUrl", "localizedDateFormat", "dateOfBirth", "socialSecurityNumber", "incomeFieldRows", "dobFieldRows", "ssnFieldRows", "dobSsnFieldRows", "phoneTypes", "phoneTypeField", "phoneDigits", "formattedPhoneNumber", "this_$iv", "$this$toUiModel_u24lambda_u242", "isPi4Eligible", "showPersonalFields", "$i$f$builder", "$i$a$-builder-PersonalInfoUiMapper$toUiModel$phoneNumberField$1", "domainModel", "formFieldValidators", "bnplAcquisitionFormatter", "addressFormatter", "config", "sessionStorage", "countryCode", "defaultAddress", "documents", "eSignUrl", "stateDisclosuresUrl", "localizedDateFormat", "dateOfBirth", "socialSecurityNumber", "incomeFieldRows", "dobFieldRows", "ssnFieldRows", "dobSsnFieldRows", "phoneTypes", "phoneTypeField", "phoneDigits", "formattedPhoneNumber", "phoneNumberField", "isPi4Eligible", "showPersonalFields", "domainModel", "formFieldValidators", "bnplAcquisitionFormatter", "addressFormatter", "config", "sessionStorage", "countryCode", "defaultAddress", "documents", "eSignUrl", "stateDisclosuresUrl", "localizedDateFormat", "dateOfBirth", "socialSecurityNumber", "incomeFieldRows", "dobFieldRows", "ssnFieldRows", "dobSsnFieldRows", "phoneTypes", "phoneTypeField", "phoneDigits", "formattedPhoneNumber", "phoneNumberField", "formattedAddress", "addresses", "billingAddressField", "isPi4Eligible", "showPersonalFields", "domainModel", "formFieldValidators", "bnplAcquisitionFormatter", "addressFormatter", "config", "sessionStorage", "countryCode", "defaultAddress", "documents", "eSignUrl", "stateDisclosuresUrl", "localizedDateFormat", "dateOfBirth", "socialSecurityNumber", "incomeFieldRows", "dobFieldRows", "ssnFieldRows", "dobSsnFieldRows", "phoneTypes", "phoneTypeField", "phoneDigits", "formattedPhoneNumber", "phoneNumberField", "formattedAddress", "addresses", "billingAddressField", "userName", "billingAddressFormattedPhone", "billingAddressUserInfoModel", "billingAddressFieldRows", "isPi4Eligible", "showPersonalFields", "money", "domainModel", "formFieldValidators", "bnplAcquisitionFormatter", "addressFormatter", "config", "sessionStorage", "countryCode", "defaultAddress", "documents", "eSignUrl", "stateDisclosuresUrl", "localizedDateFormat", "dateOfBirth", "socialSecurityNumber", "incomeFieldRows", "dobFieldRows", "ssnFieldRows", "dobSsnFieldRows", "phoneTypes", "phoneTypeField", "phoneDigits", "formattedPhoneNumber", "phoneNumberField", "formattedAddress", "addresses", "billingAddressField", "userName", "billingAddressFormattedPhone", "billingAddressUserInfoModel", "billingAddressFieldRows", "isPi4Eligible", "showPersonalFields", "money", "domainModel", "formFieldValidators", "bnplAcquisitionFormatter", "addressFormatter", "config", "sessionStorage", "countryCode", "defaultAddress", "documents", "eSignUrl", "stateDisclosuresUrl", "localizedDateFormat", "dateOfBirth", "socialSecurityNumber", "incomeFieldRows", "dobFieldRows", "ssnFieldRows", "dobSsnFieldRows", "phoneTypes", "phoneTypeField", "phoneDigits", "formattedPhoneNumber", "phoneNumberField", "formattedAddress", "addresses", "billingAddressField", "userName", "billingAddressFormattedPhone", "billingAddressUserInfoModel", "billingAddressFieldRows", "formattedMoney", "repaymentMethod", "legalConsent", "repaymentProvider", "isPi4Eligible", "showPersonalFields", "money", "isBureauRequired"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, 338}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "L$21", "L$22", "L$24", "Z$0", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "L$21", "L$22", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "L$21", "L$22", "L$23", "L$24", "L$25", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "L$21", "L$22", "L$23", "L$24", "L$25", "L$26", "L$27", "L$28", "L$29", "Z$0", "I$0", "D$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "L$21", "L$22", "L$23", "L$24", "L$25", "L$26", "L$27", "L$28", "L$29", "Z$0", "I$0", "D$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "L$21", "L$22", "L$23", "L$24", "L$25", "L$26", "L$27", "L$28", "L$29", "L$30", "L$31", "L$32", "L$33", "Z$0", "I$0", "D$0", "Z$1"}, v = 2)
/* loaded from: classes11.dex */
final class PersonalInfoUiMapper$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object AMEXKernel;
    java.lang.Object AMEXKernelCallback;
    java.lang.Object AMEXKernelJNI;
    /* synthetic */ java.lang.Object AMEXKernelProvider;
    java.lang.Object AMEXKernela;
    java.lang.Object ArtificialStackFrames;
    int Camera2StreamConfigurationMap;
    java.lang.Object CoroutineDebuggingKt;
    java.lang.Object _BOUNDARY;
    java.lang.Object _CREATION;

    /* renamed from: a, reason: collision with root package name */
    java.lang.Object f4668a;
    java.lang.Object accessartificialFrame;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object coroutineBoundary;
    java.lang.Object coroutineCreation;
    java.lang.Object d;
    java.lang.Object exchange;
    java.lang.Object free;
    boolean freeTransaction;
    java.lang.Object getARTIFICIAL_FRAME_PACKAGE_NAME;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    double getHighSpeedVideoFpsRangesFor;
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
    java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    java.lang.Object init;
    java.lang.Object isOutputSupportedFor;
    java.lang.Object isOutputSupportedForhNQ4ISI;
    java.lang.Object kernelVersion;
    java.lang.Object l;
    java.lang.Object release;
    java.lang.Object requestGoOnline;
    java.lang.Object requestPINEntry;
    java.lang.Object resetTransaction;
    int rsaCipher;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper setup;
    boolean sha1;
    java.lang.Object startTransaction;
    java.lang.Object toString;
    java.lang.Object unwrapAs;
    java.lang.Object updateUI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.AMEXKernelProvider = obj;
        this.rsaCipher |= Integer.MIN_VALUE;
        return this.setup.toUiModel(null, null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoUiMapper$toUiModel$1(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper$toUiModel$1> continuation) {
        super(continuation);
        this.setup = personalInfoUiMapper;
    }
}
