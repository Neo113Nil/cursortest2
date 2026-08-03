package com.inmobi.unification.sdk;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/inmobi/unification/sdk/InitializationStatus;", "", "<init>", "()V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "com/inmobi/media/ka", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.RUNTIME)
/* loaded from: classes5.dex */
public @interface InitializationStatus {
    public static final com.inmobi.media.C2533ka Companion = com.inmobi.media.C2533ka.f5292a;
    public static final java.lang.String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";
    public static final java.lang.String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";
    public static final java.lang.String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";
    public static final java.lang.String SUCCESS = "Success";
    public static final java.lang.String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";
}
