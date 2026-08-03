package com.facebook.appevents.cloudbridge;

/* compiled from: AppEventsConversionsAPITransformer.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventType;", "", "(Ljava/lang/String;I)V", "MOBILE_APP_INSTALL", com.ironsource.mediationsdk.j.f, com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.OTHER, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public enum AppEventType {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.cloudbridge.AppEventType.Companion INSTANCE = new com.facebook.appevents.cloudbridge.AppEventType.Companion(null);

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventType$Companion;", "", "()V", "invoke", "Lcom/facebook/appevents/cloudbridge/AppEventType;", "rawValue", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.facebook.appevents.cloudbridge.AppEventType invoke(java.lang.String rawValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            return kotlin.jvm.internal.Intrinsics.areEqual(rawValue, "MOBILE_APP_INSTALL") ? com.facebook.appevents.cloudbridge.AppEventType.MOBILE_APP_INSTALL : kotlin.jvm.internal.Intrinsics.areEqual(rawValue, "CUSTOM_APP_EVENTS") ? com.facebook.appevents.cloudbridge.AppEventType.CUSTOM : com.facebook.appevents.cloudbridge.AppEventType.OTHER;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.facebook.appevents.cloudbridge.AppEventType[] valuesCustom() {
        com.facebook.appevents.cloudbridge.AppEventType[] valuesCustom = values();
        return (com.facebook.appevents.cloudbridge.AppEventType[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
