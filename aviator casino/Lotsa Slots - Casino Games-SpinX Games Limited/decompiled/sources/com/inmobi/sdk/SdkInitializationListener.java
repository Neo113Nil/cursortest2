package com.inmobi.sdk;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/inmobi/sdk/SdkInitializationListener;", "", "Ljava/lang/Error;", "Lkotlin/Error;", "error", "", "onInitializationComplete", "(Ljava/lang/Error;)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "com/inmobi/media/Zi", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface SdkInitializationListener {
    public static final com.inmobi.media.Zi Companion = com.inmobi.media.Zi.f5087a;
    public static final java.lang.String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";
    public static final java.lang.String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";
    public static final java.lang.String MISSING_CONTEXT = "Context cannot be null. Please provide a valid context object.";
    public static final java.lang.String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";
    public static final java.lang.String MISSING_WEBVIEW_DEPENDENCY = "SDK could not be initialized; Required WebView dependency could not be found.";
    public static final java.lang.String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";

    void onInitializationComplete(java.lang.Error error);
}
