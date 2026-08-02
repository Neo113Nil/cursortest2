package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B[\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010 J'\u0010&\u001a\u0004\u0018\u00010\u00182\u0006\u0010#\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180$H\u0002¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u001a¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u001a2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u001a¢\u0006\u0004\b.\u0010)J\r\u0010/\u001a\u00020\u001a¢\u0006\u0004\b/\u0010)J\u0015\u00101\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u001d¢\u0006\u0004\b1\u0010 J\u0015\u00103\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001d¢\u0006\u0004\b3\u0010 J\r\u00104\u001a\u00020\u001a¢\u0006\u0004\b4\u0010)J\r\u00105\u001a\u00020\u001a¢\u0006\u0004\b5\u0010)R\u0014\u00108\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020*0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010TR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020*0V8\u0007¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180$0S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010TR&\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180$0V8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010X\u001a\u0004\b\\\u0010ZR\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010TR\"\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180V8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010X\u001a\u0004\b^\u0010ZR\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010TR\"\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0V8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010X\u001a\u0004\b`\u0010ZR\u001c\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010TR\"\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0V8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010X\u001a\u0004\bc\u0010ZR\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\ba\u0010TR\"\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0V8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010X\u001a\u0004\be\u0010ZR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020*0S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u0010TR \u0010f\u001a\b\u0012\u0004\u0012\u00020*0V8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010X\u001a\u0004\bg\u0010ZR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020*0S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010TR \u0010h\u001a\b\u0012\u0004\u0012\u00020*0V8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010X\u001a\u0004\bh\u0010ZR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020j0i8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010kR \u0010n\u001a\b\u0012\u0004\u0012\u00020j0m8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0016\u0010?\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\u001d0S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010TR \u0010u\u001a\b\u0012\u0004\u0012\u00020\u001d0V8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010X\u001a\u0004\bv\u0010ZR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u001d0S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u0010TR \u0010x\u001a\b\u0012\u0004\u0012\u00020\u001d0V8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bx\u0010X\u001a\u0004\by\u0010ZR\u0018\u0010{\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bz\u0010sR\u0018\u0010|\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010sR\u0018\u0010}\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010sR\u0016\u0010A\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bt\u0010sR\u0016\u0010P\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b}\u0010sR\u0018\u0010~\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bw\u0010sR\u0018\u0010r\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b{\u0010sR\u0018\u0010J\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b|\u0010sR\u0016\u0010\u007f\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b~\u0010s"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;", "observeUserStoreUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetCountriesListUseCase;", "getCountriesListUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/PhoneNumberParseUseCase;", "phoneNumberParseUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAsTypedUseCase;", "formatAsTypedUseCase", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/AddPhoneUseCase;", "addPhoneUseCase", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ReplacePhoneUseCase;", "replacePhoneUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetRegionCodeForCallingCodeUseCase;", "getRegionCodeForCallingCodeUseCase", "Lcom/paypal/oslo/feature/userprofile/ui/utils/PhoneErrorHandler;", "phoneErrorHandler", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/GetCountriesListUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/PhoneNumberParseUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAsTypedUseCase;Lcom/paypal/oslo/feature/userprofile/domain/usecase/AddPhoneUseCase;Lcom/paypal/oslo/feature/userprofile/domain/usecase/ReplacePhoneUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/GetRegionCodeForCallingCodeUseCase;Lcom/paypal/oslo/feature/userprofile/ui/utils/PhoneErrorHandler;)V", "Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "", "updateSelectedCountry", "(Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;)V", "", "phoneId", "loadPhoneForEdit", "(Ljava/lang/String;)V", "digits", "updatePhoneNumber", "p0", "", "p1", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;", "validateAndSavePhoneNumber", "()V", "", "isBanner", "clearMessage", "(Z)V", "clearPhoneNumberError", "onConfirmPhoneSave", "category", "setInitialCategory", "phoneType", "updateSelectedPhoneType", "onCancelPhoneSave", "resetConfirmationSheet", "getOutputStallDurationlomOqCM", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighSpeedVideoSizes", "isOutputSupportedForhNQ4ISI", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;", "getHighSpeedVideoFpsRangesFor", "toString", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetCountriesListUseCase;", "a", "Lcom/paypal/oslo/core/i18n/domain/usecase/PhoneNumberParseUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "isOutputSupportedFor", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAsTypedUseCase;", "getHighSpeedVideoSizesFor", "getOutputMinFrameDurationlomOqCM", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/AddPhoneUseCase;", "getInputFormats", "_BOUNDARY", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/ReplacePhoneUseCase;", "getOutputFormats", "getValidOutputFormatsForInputhNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetRegionCodeForCallingCodeUseCase;", "getOutputMinFrameDuration", util.h.xy.cb.b.f1091, "Lcom/paypal/oslo/feature/userprofile/ui/utils/PhoneErrorHandler;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getOutputSizes", "Lkotlinx/coroutines/flow/StateFlow;", "showCountryDropdown", "Lkotlinx/coroutines/flow/StateFlow;", "getShowCountryDropdown", "()Lkotlinx/coroutines/flow/StateFlow;", "allCountries", "getAllCountries", "selectedCountry", "getSelectedCountry", "phoneNumberError", "getPhoneNumberError", "getOutputStallDuration", "bannerMessage", "getBannerMessage", "toastMessage", "getToastMessage", "showConfirmationSheet", "getShowConfirmationSheet", "isSaving", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "unwrapAs", "Lkotlinx/coroutines/flow/SharedFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "_CREATION", "Ljava/lang/String;", "coroutineBoundary", "formattedPhoneNumber", "getFormattedPhoneNumber", "CoroutineDebuggingKt", "initialCategory", "getInitialCategory", "AMEXKernel", "coroutineCreation", "ArtificialStackFrames", "accessartificialFrame", "getARTIFICIAL_FRAME_PACKAGE_NAME", "d"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddEditPhoneViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: AMEXKernel, reason: from kotlin metadata */
    private java.lang.String coroutineCreation;

    /* renamed from: ArtificialStackFrames, reason: from kotlin metadata */
    private java.lang.String _BOUNDARY;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getOutputStallDuration;

    /* renamed from: CoroutineDebuggingKt, reason: from kotlin metadata */
    private java.lang.String getARTIFICIAL_FRAME_PACKAGE_NAME;

    /* renamed from: _BOUNDARY, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.ReplacePhoneUseCase getOutputFormats;

    /* renamed from: _CREATION, reason: from kotlin metadata */
    private java.lang.String toString;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: accessartificialFrame, reason: from kotlin metadata */
    private java.lang.String b;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail>> allCountries;

    /* renamed from: b, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.ui.utils.PhoneErrorHandler getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> bannerMessage;

    /* renamed from: coroutineBoundary, reason: from kotlin metadata */
    private java.lang.String a;

    /* renamed from: coroutineCreation, reason: from kotlin metadata */
    private java.lang.String _CREATION;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent> events;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> formattedPhoneNumber;

    /* renamed from: getARTIFICIAL_FRAME_PACKAGE_NAME, reason: from kotlin metadata */
    private java.lang.String d;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> coroutineBoundary;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> CoroutineDebuggingKt;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail>> getOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent> unwrapAs;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getOutputStallDurationlomOqCM;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isOutputSupportedFor;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase getInputFormats;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private java.lang.String accessartificialFrame;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoSizes;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> isOutputSupportedForhNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase getOutputMinFrameDuration;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> initialCategory;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase getHighSpeedVideoSizesFor;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSaving;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> phoneNumberError;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> selectedCountry;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> showConfirmationSheet;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> showCountryDropdown;

    /* renamed from: toString, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> toastMessage;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private java.lang.String ArtificialStackFrames;

    @javax.inject.Inject
    public AddEditPhoneViewModel(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration, com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase getCountriesListUseCase, com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase formatAsTypedUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase addPhoneUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.ReplacePhoneUseCase replacePhoneUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase getRegionCodeForCallingCodeUseCase, com.paypal.oslo.feature.userprofile.ui.utils.PhoneErrorHandler phoneErrorHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observeUserStoreUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCountriesListUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberParseUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatAsTypedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addPhoneUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacePhoneUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRegionCodeForCallingCodeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneErrorHandler, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizes = dynamicConfiguration;
        this.getHighSpeedVideoFpsRangesFor = observeUserStoreUseCase;
        this.Camera2StreamConfigurationMap = getCountriesListUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = phoneNumberParseUseCase;
        this.getHighSpeedVideoSizesFor = formatAsTypedUseCase;
        this.getInputFormats = addPhoneUseCase;
        this.getOutputFormats = replacePhoneUseCase;
        this.getOutputMinFrameDuration = getRegionCodeForCallingCodeUseCase;
        this.getInputSizeshNQ4ISI = phoneErrorHandler;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getOutputSizes = MutableStateFlow;
        this.showCountryDropdown = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail>> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        this.getOutputSizeshNQ4ISI = MutableStateFlow2;
        this.allCountries = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getOutputMinFrameDurationlomOqCM = MutableStateFlow3;
        this.selectedCountry = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getOutputStallDurationlomOqCM = MutableStateFlow4;
        this.phoneNumberError = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow4);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow5 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getOutputStallDuration = MutableStateFlow5;
        this.bannerMessage = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow5);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow6 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.isOutputSupportedForhNQ4ISI = MutableStateFlow6;
        this.toastMessage = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow6);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow7 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getValidOutputFormatsForInputhNQ4ISI = MutableStateFlow7;
        this.showConfirmationSheet = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow7);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow8 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.isOutputSupportedFor = MutableStateFlow8;
        this.isSaving = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow8);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.unwrapAs = MutableSharedFlow$default;
        this.events = MutableSharedFlow$default;
        this.toString = "";
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow9 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow("");
        this.coroutineBoundary = MutableStateFlow9;
        this.formattedPhoneNumber = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow9);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow10 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow("Mobile");
        this.CoroutineDebuggingKt = MutableStateFlow10;
        this.initialCategory = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow10);
        this.a = "";
        this.b = "";
        this.d = "Mobile";
        com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel = this;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(addEditPhoneViewModel), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$observeUserStoreAndLoadConfig$1(this, null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(addEditPhoneViewModel), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$loadAllCountries$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShowCountryDropdown() {
        return this.showCountryDropdown;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail>> getAllCountries() {
        return this.allCountries;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> getSelectedCountry() {
        return this.selectedCountry;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getPhoneNumberError() {
        return this.phoneNumberError;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getBannerMessage() {
        return this.bannerMessage;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getToastMessage() {
        return this.toastMessage;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShowConfirmationSheet() {
        return this.showConfirmationSheet;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSaving() {
        return this.isSaving;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent> getEvents() {
        return this.events;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getFormattedPhoneNumber() {
        return this.formattedPhoneNumber;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getInitialCategory() {
        return this.initialCategory;
    }

    public final void updateSelectedCountry(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail country) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        this.getOutputMinFrameDurationlomOqCM.setValue(country);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "AddEditPhoneViewModel: Country selected", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", country.getCountryCode()), kotlin.TuplesKt.to("countryName", country.getCountryName()), kotlin.TuplesKt.to("callingCode", java.lang.Integer.valueOf(country.getCountryCallingCode()))), null, 4, null);
        java.lang.String str = this.toString;
        if (kotlin.text.StringsKt.isBlank(str)) {
            return;
        }
        updatePhoneNumber(str);
    }

    public final void loadPhoneForEdit(java.lang.String phoneId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneId, "");
        this.ArtificialStackFrames = phoneId;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$loadPhoneForEdit$1(this, phoneId, null), 3, null);
    }

    public final void updatePhoneNumber(java.lang.String digits) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digits, "");
        this.toString = digits;
        clearPhoneNumberError();
        if (kotlin.text.StringsKt.isBlank(digits)) {
            this.coroutineBoundary.setValue("");
            return;
        }
        com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail value = this.getOutputMinFrameDurationlomOqCM.getValue();
        if (value == null || (str = value.getCountryCode()) == null) {
            str = this.coroutineCreation;
        }
        if (str == null) {
            this.coroutineBoundary.setValue(digits);
            return;
        }
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest phoneNumberRequest = new com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(str), null);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> mutableStateFlow = this.coroutineBoundary;
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, java.lang.String> invoke = this.getHighSpeedVideoSizesFor.invoke(digits, phoneNumberRequest);
        if (invoke instanceof arrow.core.Either.Right) {
            digits = (java.lang.String) ((arrow.core.Either.Right) invoke).getValue();
        } else {
            if (!(invoke instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        mutableStateFlow.setValue(digits);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail Camera2StreamConfigurationMap(java.lang.String p0, java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> p1) {
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(p0);
        java.lang.Object obj = null;
        if (intOrNull == null) {
            return null;
        }
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.paypal.oslo.core.i18n.domain.model.CountryCode> invoke = this.getOutputMinFrameDuration.invoke(intOrNull.intValue());
        if (invoke instanceof arrow.core.Either.Right) {
            java.lang.String m11369unboximpl = ((com.paypal.oslo.core.i18n.domain.model.CountryCode) ((arrow.core.Either.Right) invoke).getValue()).m11369unboximpl();
            java.util.Iterator<T> it = p1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) next).getCountryCode(), m11369unboximpl)) {
                    obj = next;
                    break;
                }
            }
            return (com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) obj;
        }
        if (!(invoke instanceof arrow.core.Either.Left)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return null;
    }

    public final void validateAndSavePhoneNumber() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$validateAndSavePhoneNumber$1(this, null), 3, null);
    }

    public static /* synthetic */ void clearMessage$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        addEditPhoneViewModel.clearMessage(z);
    }

    public final void clearMessage(boolean isBanner) {
        if (isBanner) {
            this.getOutputStallDuration.setValue(null);
        } else {
            this.isOutputSupportedForhNQ4ISI.setValue(null);
        }
    }

    public final void clearPhoneNumberError() {
        this.getOutputStallDurationlomOqCM.setValue(null);
    }

    public final void onConfirmPhoneSave() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "User confirmed phone number save", null, null, 6, null);
        this.getValidOutputFormatsForInputhNQ4ISI.setValue(java.lang.Boolean.FALSE);
        java.lang.String str = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        java.lang.String str2 = this._CREATION;
        if (str == null || str2 == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Cannot save phone: parsed phone data is missing", null, null, null, 14, null);
            this.getOutputStallDuration.setValue(this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong));
        } else {
            updatePhoneNumber(str2);
            this.CoroutineDebuggingKt.setValue(this.d);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$onConfirmPhoneSave$1(this, str, str2, null), 3, null);
        }
    }

    public final void setInitialCategory(java.lang.String category) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
        this.CoroutineDebuggingKt.setValue(category);
        this.d = category;
    }

    public final void updateSelectedPhoneType(java.lang.String phoneType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneType, "");
        this.d = phoneType;
    }

    public final void onCancelPhoneSave() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "User cancelled phone number save", null, null, 6, null);
        this.getValidOutputFormatsForInputhNQ4ISI.setValue(java.lang.Boolean.FALSE);
    }

    public final void resetConfirmationSheet() {
        this.getValidOutputFormatsForInputhNQ4ISI.setValue(java.lang.Boolean.FALSE);
    }

    public static final /* synthetic */ void access$clearErrors(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel) {
        addEditPhoneViewModel.getOutputStallDurationlomOqCM.setValue(null);
        addEditPhoneViewModel.getOutputStallDuration.setValue(null);
        addEditPhoneViewModel.isOutputSupportedForhNQ4ISI.setValue(null);
    }

    public static final /* synthetic */ void access$determineShowCountryDropdown(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, java.lang.String str) {
        java.lang.Object obj;
        java.lang.String str2;
        java.lang.Object[] objArr = (java.lang.Object[]) addEditPhoneViewModel.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileDynamicConfig.INSTANCE.getScaListConfig());
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj2 : objArr) {
            arrayList.add(obj2.toString());
        }
        boolean contains = arrayList.contains(str);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "AddEditPhoneViewModel: Determining country dropdown visibility", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("userCountryCode", str), kotlin.TuplesKt.to("showCountryDropdown", java.lang.Boolean.valueOf(contains))), null, 4, null);
        addEditPhoneViewModel.getOutputSizes.setValue(java.lang.Boolean.valueOf(contains));
        addEditPhoneViewModel.coroutineCreation = str;
        if (addEditPhoneViewModel.getOutputSizeshNQ4ISI.getValue().isEmpty()) {
            return;
        }
        java.util.Iterator<T> it = addEditPhoneViewModel.getOutputSizeshNQ4ISI.getValue().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) obj).getCountryCode(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail = (com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) obj;
        addEditPhoneViewModel.getOutputMinFrameDurationlomOqCM.setValue(countryPhoneDetail);
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.userprofile.LoggerKt.log;
        if (countryPhoneDetail == null || (str2 = countryPhoneDetail.getCountryCode()) == null) {
            str2 = "not found";
        }
        com.paypal.android.logger.Logger.d$default(logger, "AddEditPhoneViewModel: Set default country (countries already loaded)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", str2)), null, 4, null);
    }

    public static final /* synthetic */ java.lang.String access$getAnalyticsAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel) {
        if (addEditPhoneViewModel.ArtificialStackFrames != null) {
            return "edit";
        }
        return com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD;
    }

    public static final /* synthetic */ java.lang.String access$getAnalyticsScreen(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel) {
        if (addEditPhoneViewModel.ArtificialStackFrames != null) {
            return com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.SCREEN_EDIT_PHONE;
        }
        return "add_phone";
    }

    public static final /* synthetic */ void access$handlePhoneValidationError(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, com.paypal.oslo.core.i18n.domain.model.PhoneNumberError phoneNumberError, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.userprofile.LoggerKt.log;
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", str), kotlin.TuplesKt.to("error", phoneNumberError.toString()));
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneNumber", str2));
        com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking phone = com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhone();
        java.lang.String str5 = addEditPhoneViewModel.ArtificialStackFrames;
        if (str5 != null) {
            str3 = com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.SCREEN_EDIT_PHONE;
        } else {
            str3 = "add_phone";
        }
        java.lang.String str6 = str3;
        if (str5 != null) {
            str4 = "edit";
        } else {
            str4 = com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD;
        }
        com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackBusinessRuleError$default(phone, str6, str4, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.ErrorCodes.VALIDATION_FAILED, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Sources.WORLD_READY_SDK, "Phone number validation failed", null, 32, null);
        addEditPhoneViewModel.getOutputStallDurationlomOqCM.setValue(addEditPhoneViewModel.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_phone_validation_error));
    }

    public static final /* synthetic */ void access$handlePhoneValidationSuccess(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, com.paypal.oslo.core.i18n.domain.model.PhoneNumber phoneNumber, java.lang.String str) {
        com.paypal.oslo.feature.userprofile.LoggerKt.log.i("Phone number validation successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", java.lang.String.valueOf(phoneNumber.getCountryCode()))), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneNumber", str), kotlin.TuplesKt.to(com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, phoneNumber.getNationalNumber())));
        addEditPhoneViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME = java.lang.String.valueOf(phoneNumber.getCountryCode());
        addEditPhoneViewModel._CREATION = phoneNumber.getNationalNumber();
        java.lang.String extension = phoneNumber.getExtension();
        if (extension == null || kotlin.text.StringsKt.isBlank(extension)) {
            extension = null;
        }
        addEditPhoneViewModel._BOUNDARY = extension;
        addEditPhoneViewModel.getValidOutputFormatsForInputhNQ4ISI.setValue(java.lang.Boolean.TRUE);
    }

    public static final /* synthetic */ void access$handleValidationError(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ValidationError validationError) {
        java.util.List<com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail> extractDetails = com.paypal.oslo.feature.userprofile.domain.utils.GraphQLErrorExtensionsKt.extractDetails(validationError.getGraphQLError());
        java.util.List<com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail> list = extractDetails;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail) it.next()).getIssue(), "WALLET_SETTING_RISK_DECLINED")) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(addEditPhoneViewModel), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$handleValidationError$2(addEditPhoneViewModel, null), 3, null);
                    return;
                }
            }
        }
        if (extractDetails.size() != 1) {
            if (extractDetails.isEmpty()) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "GraphQL validation error missing details", null, null, null, 14, null);
            }
            addEditPhoneViewModel.getOutputStallDuration.setValue(addEditPhoneViewModel.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong));
            return;
        }
        addEditPhoneViewModel.getOutputStallDuration.setValue(addEditPhoneViewModel.getInputSizeshNQ4ISI.getErrorMessageForDetail((com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail) kotlin.collections.CollectionsKt.first((java.util.List) extractDetails)));
    }

    public static final /* synthetic */ void access$populateFormFromPhone(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone) {
        java.lang.String countryCode = profilePhone.getPhoneNumber().getCountryCode();
        if (addEditPhoneViewModel.getOutputSizes.getValue().booleanValue() && countryCode != null) {
            addEditPhoneViewModel.accessartificialFrame = countryCode;
            if (!addEditPhoneViewModel.getOutputSizeshNQ4ISI.getValue().isEmpty()) {
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> mutableStateFlow = addEditPhoneViewModel.getOutputMinFrameDurationlomOqCM;
                com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail Camera2StreamConfigurationMap = addEditPhoneViewModel.Camera2StreamConfigurationMap(countryCode, addEditPhoneViewModel.getOutputSizeshNQ4ISI.getValue());
                if (Camera2StreamConfigurationMap == null) {
                    Camera2StreamConfigurationMap = addEditPhoneViewModel.getOutputMinFrameDurationlomOqCM.getValue();
                }
                mutableStateFlow.setValue(Camera2StreamConfigurationMap);
            }
        }
        java.lang.String nationalNumber = profilePhone.getPhoneNumber().getNationalNumber();
        if (nationalNumber == null) {
            nationalNumber = "";
        }
        java.lang.String str = nationalNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        java.lang.String obj = sb.toString();
        addEditPhoneViewModel.a = obj;
        addEditPhoneViewModel.updatePhoneNumber(obj);
        java.lang.String mapPhoneTypeToCategory = com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.mapPhoneTypeToCategory(profilePhone.getType());
        addEditPhoneViewModel.b = mapPhoneTypeToCategory;
        addEditPhoneViewModel.CoroutineDebuggingKt.setValue(mapPhoneTypeToCategory);
        addEditPhoneViewModel.d = mapPhoneTypeToCategory;
    }

    public static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail access$resolveCurrentCountry(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel) {
        com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail value = addEditPhoneViewModel.getOutputMinFrameDurationlomOqCM.getValue();
        if (value != null) {
            return value;
        }
        java.lang.String str = addEditPhoneViewModel.coroutineCreation;
        java.lang.Object obj = null;
        if (str == null) {
            return null;
        }
        java.util.Iterator<T> it = addEditPhoneViewModel.getOutputSizeshNQ4ISI.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) next).getCountryCode(), str)) {
                obj = next;
                break;
            }
        }
        return (com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) obj;
    }

    public static final /* synthetic */ void access$trackPhoneSaveError(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, com.paypal.oslo.feature.userprofile.domain.model.PhoneError phoneError) {
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking phone = com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhone();
        java.lang.String str3 = addEditPhoneViewModel.ArtificialStackFrames;
        if (str3 != null) {
            str = com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.SCREEN_EDIT_PHONE;
        } else {
            str = "add_phone";
        }
        if (str3 != null) {
            str2 = "edit";
        } else {
            str2 = com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD;
        }
        phone.trackPhoneError(phoneError, str, str2, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.ErrorCodes.SAVE_FAILED);
    }
}
