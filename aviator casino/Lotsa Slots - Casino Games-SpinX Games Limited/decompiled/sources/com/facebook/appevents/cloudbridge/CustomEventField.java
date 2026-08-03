package com.facebook.appevents.cloudbridge;

/* compiled from: AppEventsConversionsAPITransformer.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/cloudbridge/CustomEventField;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "EVENT_TIME", "EVENT_NAME", "VALUE_TO_SUM", "CONTENT_IDS", "CONTENTS", "CONTENT_TYPE", "DESCRIPTION", "LEVEL", "MAX_RATING_VALUE", "NUM_ITEMS", "PAYMENT_INFO_AVAILABLE", "REGISTRATION_METHOD", "SEARCH_STRING", "SUCCESS", "ORDER_ID", "AD_TYPE", "CURRENCY", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public enum CustomEventField {
    EVENT_TIME(com.facebook.appevents.internal.Constants.LOG_TIME_APP_EVENT_KEY),
    EVENT_NAME(com.facebook.appevents.internal.Constants.EVENT_NAME_EVENT_KEY),
    VALUE_TO_SUM(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM),
    CONTENT_IDS(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_CONTENT_ID),
    CONTENTS(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_CONTENT),
    CONTENT_TYPE(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_CONTENT_TYPE),
    DESCRIPTION(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_DESCRIPTION),
    LEVEL(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_LEVEL),
    MAX_RATING_VALUE(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_MAX_RATING_VALUE),
    NUM_ITEMS(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_NUM_ITEMS),
    PAYMENT_INFO_AVAILABLE(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_PAYMENT_INFO_AVAILABLE),
    REGISTRATION_METHOD(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_REGISTRATION_METHOD),
    SEARCH_STRING(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_SEARCH_STRING),
    SUCCESS(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_SUCCESS),
    ORDER_ID(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_ORDER_ID),
    AD_TYPE(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_AD_TYPE),
    CURRENCY(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_CURRENCY);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.cloudbridge.CustomEventField.Companion INSTANCE = new com.facebook.appevents.cloudbridge.CustomEventField.Companion(null);
    private final java.lang.String rawValue;

    CustomEventField(java.lang.String str) {
        this.rawValue = str;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/cloudbridge/CustomEventField$Companion;", "", "()V", "invoke", "Lcom/facebook/appevents/cloudbridge/CustomEventField;", "rawValue", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.facebook.appevents.cloudbridge.CustomEventField invoke(java.lang.String rawValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            for (com.facebook.appevents.cloudbridge.CustomEventField customEventField : com.facebook.appevents.cloudbridge.CustomEventField.valuesCustom()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(customEventField.getRawValue(), rawValue)) {
                    return customEventField;
                }
            }
            return null;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.facebook.appevents.cloudbridge.CustomEventField[] valuesCustom() {
        com.facebook.appevents.cloudbridge.CustomEventField[] valuesCustom = values();
        return (com.facebook.appevents.cloudbridge.CustomEventField[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
