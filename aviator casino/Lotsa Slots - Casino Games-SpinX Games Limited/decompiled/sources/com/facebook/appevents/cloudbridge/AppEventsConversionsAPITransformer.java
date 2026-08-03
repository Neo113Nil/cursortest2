package com.facebook.appevents.cloudbridge;

/* compiled from: AppEventsConversionsAPITransformer.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u00042345B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0089\u0001\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00132\u0018\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00060\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\b\u0018JJ\u0010\u0019\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006\u0018\u00010\u000f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0018\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00060\u000fH\u0002J:\u0010\u001b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006\u0018\u00010\u000f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0002JU\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0000¢\u0006\u0002\b\u001dJ5\u0010\u001e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006\u0018\u00010\u000f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0000¢\u0006\u0002\b J\u0088\u0001\u0010!\u001a\u00020\u00112\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00132.\u0010\u0016\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00060\"j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006`#2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0013H\u0002JE\u0010$\u001a\u00020%2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0001H\u0000¢\u0006\u0002\b(J,\u0010)\u001a\u00020%2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0001H\u0002J,\u0010*\u001a\u00020%2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0001H\u0002J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H\u0002JA\u0010-\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006\u0018\u00010\"j\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006\u0018\u0001`#2\u0006\u0010.\u001a\u00020\u0004H\u0001¢\u0006\u0002\b/J\u001f\u00100\u001a\u0004\u0018\u00010\u00012\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0001H\u0001¢\u0006\u0002\b1R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer;", "", "()V", "TAG", "", "customEventTransformations", "", "Lcom/facebook/appevents/cloudbridge/CustomEventField;", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$SectionCustomEventFieldMapping;", "standardEventTransformations", "Lcom/facebook/appevents/cloudbridge/ConversionsAPIEventName;", "topLevelTransformations", "Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$SectionFieldMapping;", "combineAllTransformedData", "", "eventType", "Lcom/facebook/appevents/cloudbridge/AppEventType;", "userData", "", "appData", "restOfData", "customEvents", "eventTime", "combineAllTransformedData$facebook_core_release", "combineAllTransformedDataForCustom", "commonFields", "combineAllTransformedDataForMobileAppInstall", "combineCommonFields", "combineCommonFields$facebook_core_release", "conversionsAPICompatibleEvent", "parameters", "conversionsAPICompatibleEvent$facebook_core_release", "splitAppEventParameters", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "transformAndUpdateAppAndUserData", "", "field", "value", "transformAndUpdateAppAndUserData$facebook_core_release", "transformAndUpdateAppData", "transformAndUpdateUserData", "transformEventName", "input", "transformEvents", "appEvents", "transformEvents$facebook_core_release", "transformValue", "transformValue$facebook_core_release", "DataProcessingParameterName", "SectionCustomEventFieldMapping", "SectionFieldMapping", "ValueTransformationType", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventsConversionsAPITransformer {
    public static final java.lang.String TAG = "AppEventsConversionsAPITransformer";
    public static final com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer INSTANCE = new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer();
    private static final java.util.Map<com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField, com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping> topLevelTransformations = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.ANON_ID, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.USER_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.ANON_ID)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.APP_USER_ID, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.USER_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.FB_LOGIN_ID)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.ADVERTISER_ID, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.USER_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.MAD_ID)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.PAGE_ID, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.USER_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.PAGE_ID)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.PAGE_SCOPED_USER_ID, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.USER_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.PAGE_SCOPED_USER_ID)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.ADV_TE, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.ADV_TE)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.APP_TE, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.APP_TE)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.CONSIDER_VIEWS, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.CONSIDER_VIEWS)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.DEVICE_TOKEN, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.DEVICE_TOKEN)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.EXT_INFO, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.EXT_INFO)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.INCLUDE_DWELL_DATA, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.INCLUDE_DWELL_DATA)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.INCLUDE_VIDEO_DATA, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.INCLUDE_VIDEO_DATA)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.INSTALL_REFERRER, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.INSTALL_REFERRER)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.INSTALLER_PACKAGE, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.INSTALLER_PACKAGE)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.RECEIPT_DATA, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.RECEIPT_DATA)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.URL_SCHEMES, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField.URL_SCHEMES)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.USER_DATA, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.USER_DATA, null)));
    public static final java.util.Map<com.facebook.appevents.cloudbridge.CustomEventField, com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping> customEventTransformations = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.EVENT_TIME, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(null, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.EVENT_TIME)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.EVENT_NAME, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(null, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.EVENT_NAME)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.VALUE_TO_SUM, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.VALUE_TO_SUM)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.CONTENT_IDS, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.CONTENT_IDS)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.CONTENTS, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.CONTENTS)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.CONTENT_TYPE, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.CONTENT_TYPE)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.CURRENCY, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.CURRENCY)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.DESCRIPTION, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.DESCRIPTION)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.LEVEL, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.LEVEL)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.MAX_RATING_VALUE, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.MAX_RATING_VALUE)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.NUM_ITEMS, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.NUM_ITEMS)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.PAYMENT_INFO_AVAILABLE, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.PAYMENT_INFO_AVAILABLE)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.REGISTRATION_METHOD, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.REGISTRATION_METHOD)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.SEARCH_STRING, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.SEARCH_STRING)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.SUCCESS, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.SUCCESS)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.ORDER_ID, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.ORDER_ID)), kotlin.TuplesKt.to(com.facebook.appevents.cloudbridge.CustomEventField.AD_TYPE, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.AD_TYPE)));
    public static final java.util.Map<java.lang.String, com.facebook.appevents.cloudbridge.ConversionsAPIEventName> standardEventTransformations = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_UNLOCKED_ACHIEVEMENT, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.UNLOCKED_ACHIEVEMENT), kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_ACTIVATED_APP, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.ACTIVATED_APP), kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_ADDED_PAYMENT_INFO, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.ADDED_PAYMENT_INFO), kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_ADDED_TO_CART, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.ADDED_TO_CART), kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_ADDED_TO_WISHLIST, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.ADDED_TO_WISHLIST), kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.COMPLETED_REGISTRATION), kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_VIEWED_CONTENT, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.VIEWED_CONTENT), kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.INITIATED_CHECKOUT), kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_ACHIEVED_LEVEL, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.ACHIEVED_LEVEL), kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_PURCHASED, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.PURCHASED), kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_RATED, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.RATED), kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_SEARCHED, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.SEARCHED), kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_SPENT_CREDITS, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.SPENT_CREDITS), kotlin.TuplesKt.to(com.facebook.appevents.AppEventsConstants.EVENT_NAME_COMPLETED_TUTORIAL, com.facebook.appevents.cloudbridge.ConversionsAPIEventName.COMPLETED_TUTORIAL));

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.valuesCustom().length];
            iArr[com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.ARRAY.ordinal()] = 1;
            iArr[com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.BOOL.ordinal()] = 2;
            iArr[com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.INT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.facebook.appevents.cloudbridge.ConversionsAPISection.valuesCustom().length];
            iArr2[com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA.ordinal()] = 1;
            iArr2[com.facebook.appevents.cloudbridge.ConversionsAPISection.USER_DATA.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.facebook.appevents.cloudbridge.AppEventType.valuesCustom().length];
            iArr3[com.facebook.appevents.cloudbridge.AppEventType.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[com.facebook.appevents.cloudbridge.AppEventType.CUSTOM.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private AppEventsConversionsAPITransformer() {
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$SectionFieldMapping;", "", "section", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "field", "Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;)V", "getField", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;", "setField", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPIUserAndAppDataField;)V", "getSection", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "setSection", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class SectionFieldMapping {
        private com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField field;
        private com.facebook.appevents.cloudbridge.ConversionsAPISection section;

        public static /* synthetic */ com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping copy$default(com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping sectionFieldMapping, com.facebook.appevents.cloudbridge.ConversionsAPISection conversionsAPISection, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                conversionsAPISection = sectionFieldMapping.section;
            }
            if ((i & 2) != 0) {
                conversionsAPIUserAndAppDataField = sectionFieldMapping.field;
            }
            return sectionFieldMapping.copy(conversionsAPISection, conversionsAPIUserAndAppDataField);
        }

        /* renamed from: component1, reason: from getter */
        public final com.facebook.appevents.cloudbridge.ConversionsAPISection getSection() {
            return this.section;
        }

        /* renamed from: component2, reason: from getter */
        public final com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField getField() {
            return this.field;
        }

        public final com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping copy(com.facebook.appevents.cloudbridge.ConversionsAPISection section, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField field) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "section");
            return new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping(section, field);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping)) {
                return false;
            }
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping sectionFieldMapping = (com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping) other;
            return this.section == sectionFieldMapping.section && this.field == sectionFieldMapping.field;
        }

        public int hashCode() {
            int hashCode = this.section.hashCode() * 31;
            com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = this.field;
            return hashCode + (conversionsAPIUserAndAppDataField == null ? 0 : conversionsAPIUserAndAppDataField.hashCode());
        }

        public java.lang.String toString() {
            return "SectionFieldMapping(section=" + this.section + ", field=" + this.field + ')';
        }

        public SectionFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection section, com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "section");
            this.section = section;
            this.field = conversionsAPIUserAndAppDataField;
        }

        public final com.facebook.appevents.cloudbridge.ConversionsAPISection getSection() {
            return this.section;
        }

        public final void setSection(com.facebook.appevents.cloudbridge.ConversionsAPISection conversionsAPISection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionsAPISection, "<set-?>");
            this.section = conversionsAPISection;
        }

        public final com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField getField() {
            return this.field;
        }

        public final void setField(com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            this.field = conversionsAPIUserAndAppDataField;
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$SectionCustomEventFieldMapping;", "", "section", "Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "field", "Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;)V", "getField", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;", "setField", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPICustomEventField;)V", "getSection", "()Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "setSection", "(Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class SectionCustomEventFieldMapping {
        private com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField field;
        private com.facebook.appevents.cloudbridge.ConversionsAPISection section;

        public static /* synthetic */ com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping copy$default(com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping sectionCustomEventFieldMapping, com.facebook.appevents.cloudbridge.ConversionsAPISection conversionsAPISection, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField conversionsAPICustomEventField, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                conversionsAPISection = sectionCustomEventFieldMapping.section;
            }
            if ((i & 2) != 0) {
                conversionsAPICustomEventField = sectionCustomEventFieldMapping.field;
            }
            return sectionCustomEventFieldMapping.copy(conversionsAPISection, conversionsAPICustomEventField);
        }

        /* renamed from: component1, reason: from getter */
        public final com.facebook.appevents.cloudbridge.ConversionsAPISection getSection() {
            return this.section;
        }

        /* renamed from: component2, reason: from getter */
        public final com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField getField() {
            return this.field;
        }

        public final com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping copy(com.facebook.appevents.cloudbridge.ConversionsAPISection section, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField field) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "field");
            return new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping(section, field);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping)) {
                return false;
            }
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping sectionCustomEventFieldMapping = (com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping) other;
            return this.section == sectionCustomEventFieldMapping.section && this.field == sectionCustomEventFieldMapping.field;
        }

        public int hashCode() {
            com.facebook.appevents.cloudbridge.ConversionsAPISection conversionsAPISection = this.section;
            return ((conversionsAPISection == null ? 0 : conversionsAPISection.hashCode()) * 31) + this.field.hashCode();
        }

        public java.lang.String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.section + ", field=" + this.field + ')';
        }

        public SectionCustomEventFieldMapping(com.facebook.appevents.cloudbridge.ConversionsAPISection conversionsAPISection, com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField field) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "field");
            this.section = conversionsAPISection;
            this.field = field;
        }

        public final com.facebook.appevents.cloudbridge.ConversionsAPISection getSection() {
            return this.section;
        }

        public final void setSection(com.facebook.appevents.cloudbridge.ConversionsAPISection conversionsAPISection) {
            this.section = conversionsAPISection;
        }

        public final com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField getField() {
            return this.field;
        }

        public final void setField(com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField conversionsAPICustomEventField) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionsAPICustomEventField, "<set-?>");
            this.field = conversionsAPICustomEventField;
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "OPTIONS", com.google.ads.mediation.inmobi.InMobiNetworkKeys.COUNTRY, com.google.ads.mediation.inmobi.InMobiNetworkKeys.STATE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum DataProcessingParameterName {
        OPTIONS(com.facebook.FacebookSdk.DATA_PROCESSION_OPTIONS),
        COUNTRY(com.facebook.FacebookSdk.DATA_PROCESSION_OPTIONS_COUNTRY),
        STATE(com.facebook.FacebookSdk.DATA_PROCESSION_OPTIONS_STATE);


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.DataProcessingParameterName.Companion INSTANCE = new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.DataProcessingParameterName.Companion(null);
        private final java.lang.String rawValue;

        DataProcessingParameterName(java.lang.String str) {
            this.rawValue = str;
        }

        public final java.lang.String getRawValue() {
            return this.rawValue;
        }

        /* compiled from: AppEventsConversionsAPITransformer.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName$Companion;", "", "()V", "invoke", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "rawValue", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.DataProcessingParameterName invoke(java.lang.String rawValue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                for (com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.DataProcessingParameterName dataProcessingParameterName : com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.DataProcessingParameterName.valuesCustom()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(dataProcessingParameterName.getRawValue(), rawValue)) {
                        return dataProcessingParameterName;
                    }
                }
                return null;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.DataProcessingParameterName[] valuesCustom() {
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.DataProcessingParameterName[] valuesCustom = values();
            return (com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.DataProcessingParameterName[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "", "(Ljava/lang/String;I)V", "ARRAY", "BOOL", "INT", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum ValueTransformationType {
        ARRAY,
        BOOL,
        INT;


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.Companion INSTANCE = new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.Companion(null);

        /* compiled from: AppEventsConversionsAPITransformer.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType$Companion;", "", "()V", "invoke", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "rawValue", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType invoke(java.lang.String rawValue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                if (!kotlin.jvm.internal.Intrinsics.areEqual(rawValue, com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.EXT_INFO.getRawValue()) && !kotlin.jvm.internal.Intrinsics.areEqual(rawValue, com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.URL_SCHEMES.getRawValue()) && !kotlin.jvm.internal.Intrinsics.areEqual(rawValue, com.facebook.appevents.cloudbridge.CustomEventField.CONTENT_IDS.getRawValue()) && !kotlin.jvm.internal.Intrinsics.areEqual(rawValue, com.facebook.appevents.cloudbridge.CustomEventField.CONTENTS.getRawValue()) && !kotlin.jvm.internal.Intrinsics.areEqual(rawValue, com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.DataProcessingParameterName.OPTIONS.getRawValue())) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(rawValue, com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.ADV_TE.getRawValue()) && !kotlin.jvm.internal.Intrinsics.areEqual(rawValue, com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.APP_TE.getRawValue())) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(rawValue, com.facebook.appevents.cloudbridge.CustomEventField.EVENT_TIME.getRawValue())) {
                            return com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.INT;
                        }
                        return null;
                    }
                    return com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.BOOL;
                }
                return com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.ARRAY;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType[] valuesCustom() {
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType[] valuesCustom = values();
            return (com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    @kotlin.jvm.JvmStatic
    public static final java.lang.Object transformValue$facebook_core_release(java.lang.String field, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "field");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType invoke = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.INSTANCE.invoke(field);
        java.lang.String str = value instanceof java.lang.String ? (java.lang.String) value : null;
        if (invoke == null || str == null) {
            return value;
        }
        int i = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.WhenMappings.$EnumSwitchMapping$0[invoke.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return kotlin.text.StringsKt.toIntOrNull(value.toString());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(str.toString());
            if (intOrNull != null) {
                return java.lang.Boolean.valueOf(intOrNull.intValue() != 0);
            }
            return null;
        }
        try {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            java.util.List<java.lang.String> convertJSONArrayToList = com.facebook.internal.Utility.convertJSONArrayToList(new org.json.JSONArray(str));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = convertJSONArrayToList.iterator();
            while (it.hasNext()) {
                ?? r1 = (java.lang.String) it.next();
                try {
                    try {
                        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                        r1 = com.facebook.internal.Utility.convertJSONObjectToHashMap(new org.json.JSONObject((java.lang.String) r1));
                    } catch (org.json.JSONException unused) {
                    }
                } catch (org.json.JSONException unused2) {
                    com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                    r1 = com.facebook.internal.Utility.convertJSONArrayToList(new org.json.JSONArray((java.lang.String) r1));
                }
                arrayList.add(r1);
            }
            return arrayList;
        } catch (org.json.JSONException e) {
            com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, TAG, "\n transformEvents JSONException: \n%s\n%s", value, e);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> transformEvents$facebook_core_release(java.lang.String appEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEvents, "appEvents");
        java.util.ArrayList<java.util.Map> arrayList = new java.util.ArrayList();
        try {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            for (java.lang.String str : com.facebook.internal.Utility.convertJSONArrayToList(new org.json.JSONArray(appEvents))) {
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                arrayList.add(com.facebook.internal.Utility.convertJSONObjectToHashMap(new org.json.JSONObject(str)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> arrayList2 = new java.util.ArrayList<>();
            for (java.util.Map map : arrayList) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                for (java.lang.String str2 : map.keySet()) {
                    com.facebook.appevents.cloudbridge.CustomEventField invoke = com.facebook.appevents.cloudbridge.CustomEventField.INSTANCE.invoke(str2);
                    com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionCustomEventFieldMapping sectionCustomEventFieldMapping = customEventTransformations.get(invoke);
                    if (invoke != null && sectionCustomEventFieldMapping != null) {
                        com.facebook.appevents.cloudbridge.ConversionsAPISection section = sectionCustomEventFieldMapping.getSection();
                        if (section != null) {
                            if (section == com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA) {
                                java.lang.String rawValue = sectionCustomEventFieldMapping.getField().getRawValue();
                                java.lang.Object obj = map.get(str2);
                                if (obj == null) {
                                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                }
                                java.lang.Object transformValue$facebook_core_release = transformValue$facebook_core_release(str2, obj);
                                if (transformValue$facebook_core_release != null) {
                                    linkedHashMap.put(rawValue, transformValue$facebook_core_release);
                                } else {
                                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                }
                            } else {
                                continue;
                            }
                        } else {
                            try {
                                java.lang.String rawValue2 = sectionCustomEventFieldMapping.getField().getRawValue();
                                if (invoke == com.facebook.appevents.cloudbridge.CustomEventField.EVENT_NAME && ((java.lang.String) map.get(str2)) != null) {
                                    com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer appEventsConversionsAPITransformer = INSTANCE;
                                    java.lang.Object obj2 = map.get(str2);
                                    if (obj2 == null) {
                                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    linkedHashMap2.put(rawValue2, appEventsConversionsAPITransformer.transformEventName((java.lang.String) obj2));
                                } else if (invoke == com.facebook.appevents.cloudbridge.CustomEventField.EVENT_TIME && ((java.lang.Integer) map.get(str2)) != null) {
                                    java.lang.Object obj3 = map.get(str2);
                                    if (obj3 == null) {
                                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    java.lang.Object transformValue$facebook_core_release2 = transformValue$facebook_core_release(str2, obj3);
                                    if (transformValue$facebook_core_release2 != null) {
                                        linkedHashMap2.put(rawValue2, transformValue$facebook_core_release2);
                                    } else {
                                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                }
                            } catch (java.lang.ClassCastException e) {
                                com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, TAG, "\n transformEvents ClassCastException: \n %s ", kotlin.ExceptionsKt.stackTraceToString(e));
                            }
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA.getRawValue(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (org.json.JSONException e2) {
            com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, TAG, "\n transformEvents JSONException: \n%s\n%s", appEvents, e2);
            return null;
        }
    }

    private final void transformAndUpdateAppData(java.util.Map<java.lang.String, java.lang.Object> appData, com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField field, java.lang.Object value) {
        com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(field);
        com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField field2 = sectionFieldMapping == null ? null : sectionFieldMapping.getField();
        if (field2 == null) {
            return;
        }
        appData.put(field2.getRawValue(), value);
    }

    private final void transformAndUpdateUserData(java.util.Map<java.lang.String, java.lang.Object> userData, com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField field, java.lang.Object value) {
        if (field == com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.USER_DATA) {
            try {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                userData.putAll(com.facebook.internal.Utility.convertJSONObjectToHashMap(new org.json.JSONObject((java.lang.String) value)));
                return;
            } catch (org.json.JSONException e) {
                com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, TAG, "\n transformEvents JSONException: \n%s\n%s", value, e);
                return;
            }
        }
        com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(field);
        com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField field2 = sectionFieldMapping == null ? null : sectionFieldMapping.getField();
        if (field2 == null) {
            return;
        }
        userData.put(field2.getRawValue(), value);
    }

    public final void transformAndUpdateAppAndUserData$facebook_core_release(java.util.Map<java.lang.String, java.lang.Object> userData, java.util.Map<java.lang.String, java.lang.Object> appData, com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField field, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userData, "userData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appData, "appData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "field");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.SectionFieldMapping sectionFieldMapping = topLevelTransformations.get(field);
        if (sectionFieldMapping == null) {
            return;
        }
        int i = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.WhenMappings.$EnumSwitchMapping$1[sectionFieldMapping.getSection().ordinal()];
        if (i == 1) {
            transformAndUpdateAppData(appData, field, value);
        } else {
            if (i != 2) {
                return;
            }
            transformAndUpdateUserData(userData, field, value);
        }
    }

    private final java.lang.String transformEventName(java.lang.String input) {
        java.util.Map<java.lang.String, com.facebook.appevents.cloudbridge.ConversionsAPIEventName> map = standardEventTransformations;
        if (!map.containsKey(input)) {
            return input;
        }
        com.facebook.appevents.cloudbridge.ConversionsAPIEventName conversionsAPIEventName = map.get(input);
        return conversionsAPIEventName == null ? "" : conversionsAPIEventName.getRawValue();
    }

    public final java.util.Map<java.lang.String, java.lang.Object> combineCommonFields$facebook_core_release(java.util.Map<java.lang.String, ? extends java.lang.Object> userData, java.util.Map<java.lang.String, ? extends java.lang.Object> appData, java.util.Map<java.lang.String, ? extends java.lang.Object> restOfData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userData, "userData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appData, "appData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(com.facebook.appevents.cloudbridge.OtherEventConstants.ACTION_SOURCE.getRawValue(), com.facebook.appevents.cloudbridge.OtherEventConstants.APP.getRawValue());
        linkedHashMap.put(com.facebook.appevents.cloudbridge.ConversionsAPISection.USER_DATA.getRawValue(), userData);
        linkedHashMap.put(com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA.getRawValue(), appData);
        linkedHashMap.putAll(restOfData);
        return linkedHashMap;
    }

    private final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> combineAllTransformedDataForMobileAppInstall(java.util.Map<java.lang.String, ? extends java.lang.Object> commonFields, java.lang.Object eventTime) {
        if (eventTime == null) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(commonFields);
        linkedHashMap.put(com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.EVENT_NAME.getRawValue(), com.facebook.appevents.cloudbridge.OtherEventConstants.MOBILE_APP_INSTALL.getRawValue());
        linkedHashMap.put(com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.EVENT_TIME.getRawValue(), eventTime);
        return kotlin.collections.CollectionsKt.listOf(linkedHashMap);
    }

    private final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> combineAllTransformedDataForCustom(java.util.Map<java.lang.String, ? extends java.lang.Object> commonFields, java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> customEvents) {
        if (customEvents.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = customEvents.iterator();
        while (it.hasNext()) {
            java.util.Map map = (java.util.Map) it.next();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.putAll(commonFields);
            linkedHashMap.putAll(map);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> combineAllTransformedData$facebook_core_release(com.facebook.appevents.cloudbridge.AppEventType eventType, java.util.Map<java.lang.String, java.lang.Object> userData, java.util.Map<java.lang.String, java.lang.Object> appData, java.util.Map<java.lang.String, java.lang.Object> restOfData, java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> customEvents, java.lang.Object eventTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userData, "userData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appData, "appData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customEvents, "customEvents");
        java.util.Map<java.lang.String, java.lang.Object> combineCommonFields$facebook_core_release = combineCommonFields$facebook_core_release(userData, appData, restOfData);
        int i = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.WhenMappings.$EnumSwitchMapping$2[eventType.ordinal()];
        if (i == 1) {
            return combineAllTransformedDataForMobileAppInstall(combineCommonFields$facebook_core_release, eventTime);
        }
        if (i != 2) {
            return null;
        }
        return combineAllTransformedDataForCustom(combineCommonFields$facebook_core_release, customEvents);
    }

    private final com.facebook.appevents.cloudbridge.AppEventType splitAppEventParameters(java.util.Map<java.lang.String, ? extends java.lang.Object> parameters, java.util.Map<java.lang.String, java.lang.Object> userData, java.util.Map<java.lang.String, java.lang.Object> appData, java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> customEvents, java.util.Map<java.lang.String, java.lang.Object> restOfData) {
        java.lang.Object obj = parameters.get(com.facebook.appevents.cloudbridge.OtherEventConstants.EVENT.getRawValue());
        com.facebook.appevents.cloudbridge.AppEventType.Companion companion = com.facebook.appevents.cloudbridge.AppEventType.INSTANCE;
        if (obj != null) {
            com.facebook.appevents.cloudbridge.AppEventType invoke = companion.invoke((java.lang.String) obj);
            if (invoke == com.facebook.appevents.cloudbridge.AppEventType.OTHER) {
                return invoke;
            }
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : parameters.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField invoke2 = com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.INSTANCE.invoke(key);
                if (invoke2 != null) {
                    INSTANCE.transformAndUpdateAppAndUserData$facebook_core_release(userData, appData, invoke2, value);
                } else {
                    boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(key, com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_EVENTS.getRawValue());
                    boolean z = value instanceof java.lang.String;
                    if (invoke == com.facebook.appevents.cloudbridge.AppEventType.CUSTOM && areEqual && z) {
                        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> transformEvents$facebook_core_release = transformEvents$facebook_core_release((java.lang.String) value);
                        if (transformEvents$facebook_core_release != null) {
                            customEvents.addAll(transformEvents$facebook_core_release);
                        }
                    } else if (com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.DataProcessingParameterName.INSTANCE.invoke(key) != null) {
                        restOfData.put(key, value);
                    }
                }
            }
            return invoke;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> conversionsAPICompatibleEvent$facebook_core_release(java.util.Map<java.lang.String, ? extends java.lang.Object> parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> arrayList = new java.util.ArrayList<>();
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        com.facebook.appevents.cloudbridge.AppEventType splitAppEventParameters = splitAppEventParameters(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (splitAppEventParameters == com.facebook.appevents.cloudbridge.AppEventType.OTHER) {
            return null;
        }
        return combineAllTransformedData$facebook_core_release(splitAppEventParameters, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(com.facebook.appevents.cloudbridge.OtherEventConstants.INSTALL_EVENT_TIME.getRawValue()));
    }
}
