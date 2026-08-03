package com.unity3d.ads.adplayer;

/* compiled from: DisplayMessage.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u000b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage;", "", "opportunityId", "", "(Ljava/lang/String;)V", "getOpportunityId", "()Ljava/lang/String;", "DisplayDestroyed", "DisplayError", "DisplayFinishRequest", "DisplayReady", "FocusChanged", "OpenUrl", "OpenUrlResult", "SetOrientation", "VisibilityChanged", "WebViewInstanceRequest", "WebViewInstanceResponse", "Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayDestroyed;", "Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayError;", "Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayFinishRequest;", "Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayReady;", "Lcom/unity3d/ads/adplayer/DisplayMessage$FocusChanged;", "Lcom/unity3d/ads/adplayer/DisplayMessage$OpenUrl;", "Lcom/unity3d/ads/adplayer/DisplayMessage$OpenUrlResult;", "Lcom/unity3d/ads/adplayer/DisplayMessage$SetOrientation;", "Lcom/unity3d/ads/adplayer/DisplayMessage$VisibilityChanged;", "Lcom/unity3d/ads/adplayer/DisplayMessage$WebViewInstanceRequest;", "Lcom/unity3d/ads/adplayer/DisplayMessage$WebViewInstanceResponse;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DisplayMessage {
    private final java.lang.String opportunityId;

    public /* synthetic */ DisplayMessage(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private DisplayMessage(java.lang.String str) {
        this.opportunityId = str;
    }

    public final java.lang.String getOpportunityId() {
        return this.opportunityId;
    }

    /* compiled from: DisplayMessage.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayReady;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "showOptions", "", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getShowOptions", "()Ljava/util/Map;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisplayReady extends com.unity3d.ads.adplayer.DisplayMessage {
        private final java.util.Map<java.lang.String, java.lang.Object> showOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayReady(java.lang.String opportunityId, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            super(opportunityId, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.showOptions = map;
        }

        public /* synthetic */ DisplayReady(java.lang.String str, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : map);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getShowOptions() {
            return this.showOptions;
        }
    }

    /* compiled from: DisplayMessage.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$WebViewInstanceRequest;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "(Ljava/lang/String;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WebViewInstanceRequest extends com.unity3d.ads.adplayer.DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceRequest(java.lang.String opportunityId) {
            super(opportunityId, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    /* compiled from: DisplayMessage.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$VisibilityChanged;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", com.ironsource.C3023e8.k, "", "(Ljava/lang/String;Z)V", "()Z", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class VisibilityChanged extends com.unity3d.ads.adplayer.DisplayMessage {
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisibilityChanged(java.lang.String opportunityId, boolean z) {
            super(opportunityId, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.isVisible = z;
        }

        /* renamed from: isVisible, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }
    }

    /* compiled from: DisplayMessage.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$FocusChanged;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "isFocused", "", "(Ljava/lang/String;Z)V", "()Z", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FocusChanged extends com.unity3d.ads.adplayer.DisplayMessage {
        private final boolean isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FocusChanged(java.lang.String opportunityId, boolean z) {
            super(opportunityId, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.isFocused = z;
        }

        /* renamed from: isFocused, reason: from getter */
        public final boolean getIsFocused() {
            return this.isFocused;
        }
    }

    /* compiled from: DisplayMessage.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayDestroyed;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "(Ljava/lang/String;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisplayDestroyed extends com.unity3d.ads.adplayer.DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayDestroyed(java.lang.String opportunityId) {
            super(opportunityId, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    /* compiled from: DisplayMessage.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayError;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "reason", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisplayError extends com.unity3d.ads.adplayer.DisplayMessage {
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayError(java.lang.String opportunityId, java.lang.String reason) {
            super(opportunityId, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }
    }

    /* compiled from: DisplayMessage.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$OpenUrlResult;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "success", "", "(Ljava/lang/String;Z)V", "getSuccess", "()Z", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OpenUrlResult extends com.unity3d.ads.adplayer.DisplayMessage {
        private final boolean success;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrlResult(java.lang.String opportunityId, boolean z) {
            super(opportunityId, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.success = z;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }

    /* compiled from: DisplayMessage.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$WebViewInstanceResponse;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "webView", "Landroid/webkit/WebView;", "(Ljava/lang/String;Landroid/webkit/WebView;)V", "getWebView", "()Landroid/webkit/WebView;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WebViewInstanceResponse extends com.unity3d.ads.adplayer.DisplayMessage {
        private final android.webkit.WebView webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceResponse(java.lang.String opportunityId, android.webkit.WebView webView) {
            super(opportunityId, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
            this.webView = webView;
        }

        public final android.webkit.WebView getWebView() {
            return this.webView;
        }
    }

    /* compiled from: DisplayMessage.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayFinishRequest;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "(Ljava/lang/String;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisplayFinishRequest extends com.unity3d.ads.adplayer.DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayFinishRequest(java.lang.String opportunityId) {
            super(opportunityId, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    /* compiled from: DisplayMessage.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$SetOrientation;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "orientation", "", "(Ljava/lang/String;I)V", "getOrientation", "()I", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SetOrientation extends com.unity3d.ads.adplayer.DisplayMessage {
        private final int orientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetOrientation(java.lang.String opportunityId, int i) {
            super(opportunityId, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.orientation = i;
        }

        public final int getOrientation() {
            return this.orientation;
        }
    }

    /* compiled from: DisplayMessage.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$OpenUrl;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "intent", "Landroid/content/Intent;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "", "(Ljava/lang/String;Landroid/content/Intent;Z)V", "getIntent", "()Landroid/content/Intent;", "getUseActivityForResult", "()Z", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OpenUrl extends com.unity3d.ads.adplayer.DisplayMessage {
        private final android.content.Intent intent;
        private final boolean useActivityForResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(java.lang.String opportunityId, android.content.Intent intent, boolean z) {
            super(opportunityId, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            this.intent = intent;
            this.useActivityForResult = z;
        }

        public final android.content.Intent getIntent() {
            return this.intent;
        }

        public final boolean getUseActivityForResult() {
            return this.useActivityForResult;
        }
    }
}
