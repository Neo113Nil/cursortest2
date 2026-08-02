package com.paypal.oslo.core.webview.ui.client;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0016\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J7\u0010\u0019\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J5\u0010.\u001a\u00020\u00132\u001a\u0010+\u001a\u0016\u0012\u0010\u0012\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010*\u0018\u00010)\u0018\u00010(2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/client/SecureWebChromeClientDelegate;", "", "", "newProgress", "", "onProgressChanged", "(I)V", "", "title", "onReceivedTitle", "(Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "icon", "onReceivedIcon", "(Landroid/graphics/Bitmap;)V", "url", "message", "Landroid/webkit/JsResult;", "result", "", "onJsAlert", "(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z", "onJsConfirm", "defaultValue", "Landroid/webkit/JsPromptResult;", "onJsPrompt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Landroid/webkit/PermissionRequest;", "request", "onPermissionRequest", "(Landroid/webkit/PermissionRequest;)V", "origin", "Landroid/webkit/GeolocationPermissions$Callback;", com.sun.jna.Callback.METHOD_NAME, "onGeolocationPermissionsShowPrompt", "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "onShowFileChooser", "(Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface SecureWebChromeClientDelegate {
    default boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        return false;
    }

    default boolean onJsAlert(java.lang.String url, java.lang.String message, android.webkit.JsResult result) {
        return false;
    }

    default boolean onJsConfirm(java.lang.String url, java.lang.String message, android.webkit.JsResult result) {
        return false;
    }

    default boolean onJsPrompt(java.lang.String url, java.lang.String message, java.lang.String defaultValue, android.webkit.JsPromptResult result) {
        return false;
    }

    default void onProgressChanged(int newProgress) {
    }

    default void onReceivedIcon(android.graphics.Bitmap icon) {
    }

    default void onReceivedTitle(java.lang.String title) {
    }

    default boolean onShowFileChooser(android.webkit.ValueCallback<android.net.Uri[]> filePathCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onProgressChanged(com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate, int i) {
            com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate.super.onProgressChanged(i);
        }

        @java.lang.Deprecated
        public static void onReceivedTitle(com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate, java.lang.String str) {
            com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate.super.onReceivedTitle(str);
        }

        @java.lang.Deprecated
        public static void onReceivedIcon(com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate, android.graphics.Bitmap bitmap) {
            com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate.super.onReceivedIcon(bitmap);
        }

        @java.lang.Deprecated
        public static boolean onJsAlert(com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
            return com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate.super.onJsAlert(str, str2, jsResult);
        }

        @java.lang.Deprecated
        public static boolean onJsConfirm(com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
            return com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate.super.onJsConfirm(str, str2, jsResult);
        }

        @java.lang.Deprecated
        public static boolean onJsPrompt(com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
            return com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate.super.onJsPrompt(str, str2, str3, jsPromptResult);
        }

        @java.lang.Deprecated
        public static boolean onConsoleMessage(com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate, android.webkit.ConsoleMessage consoleMessage) {
            return com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate.super.onConsoleMessage(consoleMessage);
        }

        @java.lang.Deprecated
        public static void onPermissionRequest(com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate, android.webkit.PermissionRequest permissionRequest) {
            com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate.super.onPermissionRequest(permissionRequest);
        }

        @java.lang.Deprecated
        public static void onGeolocationPermissionsShowPrompt(com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate, java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
            com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate.super.onGeolocationPermissionsShowPrompt(str, callback);
        }

        @java.lang.Deprecated
        public static boolean onShowFileChooser(com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate, android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
            return com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate.super.onShowFileChooser(valueCallback, fileChooserParams);
        }
    }

    default void onPermissionRequest(android.webkit.PermissionRequest request) {
        if (request != null) {
            request.deny();
        }
    }

    default void onGeolocationPermissionsShowPrompt(java.lang.String origin, android.webkit.GeolocationPermissions.Callback callback) {
        if (callback != null) {
            callback.invoke(origin, false, false);
        }
    }
}
