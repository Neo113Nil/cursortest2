package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonCodec;", "registrar", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "getRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "readValueOfType", "", "type", "", "buffer", "Ljava/nio/ByteBuffer;", "writeValue", "", "stream", "Ljava/io/ByteArrayOutputStream;", "value", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AndroidWebkitLibraryPigeonProxyApiBaseCodec extends AndroidWebkitLibraryPigeonCodec {
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar registrar;

    public AndroidWebkitLibraryPigeonProxyApiBaseCodec(AndroidWebkitLibraryPigeonProxyApiRegistrar registrar) {
        Intrinsics.checkNotNullParameter(registrar, "registrar");
        this.registrar = registrar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$0(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebResourceRequest", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$1(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebResourceResponse", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$10(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebViewClient", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$11(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("DownloadListener", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$12(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebChromeClient", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$13(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("FlutterAssetManager", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$14(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebStorage", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$15(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("FileChooserParams", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$16(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("PermissionRequest", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$17(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("CustomViewCallback", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$18(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("View", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$19(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("GeolocationPermissionsCallback", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$2(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebResourceError", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$20(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("HttpAuthHandler", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$21(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("AndroidMessage", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$22(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("ClientCertRequest", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$23(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("PrivateKey", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$24(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("X509Certificate", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$25(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("SslErrorHandler", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$26(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("SslError", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$27(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("SslCertificateDName", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$28(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("SslCertificate", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$29(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("Certificate", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$3(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebResourceErrorCompat", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$30(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebSettingsCompat", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$31(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebViewFeature", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$4(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebViewPoint", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$5(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("ConsoleMessage", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$6(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("CookieManager", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$7(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebView", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$8(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebSettings", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeValue$lambda$9(Object obj, Result result) {
        if (Result.m1722isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("JavaScriptChannel", obj, Result.m1719exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    private static final void writeValue$logNewInstanceFailure(String str, Object obj, Throwable th) {
        Objects.toString(obj);
        Objects.toString(th);
    }

    public final AndroidWebkitLibraryPigeonProxyApiRegistrar getRegistrar() {
        return this.registrar;
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonCodec, io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte type, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (type != Byte.MIN_VALUE) {
            return super.readValueOfType(type, buffer);
        }
        Object readValue = readValue(buffer);
        Intrinsics.checkNotNull(readValue, "null cannot be cast to non-null type kotlin.Long");
        return this.registrar.getInstanceManager().getInstance(((Long) readValue).longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonCodec, io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, final Object value) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if ((value instanceof Boolean) || (value instanceof byte[]) || (value instanceof Double) || (value instanceof double[]) || (value instanceof float[]) || (value instanceof Integer) || (value instanceof int[]) || (value instanceof List) || (value instanceof Long) || (value instanceof long[]) || (value instanceof Map) || (value instanceof String) || (value instanceof FileChooserMode) || (value instanceof ConsoleMessageLevel) || (value instanceof OverScrollMode) || (value instanceof SslErrorType) || (value instanceof MixedContentMode) || value == null) {
            super.writeValue(stream, value);
            return;
        }
        if (value instanceof WebResourceRequest) {
            this.registrar.getPigeonApiWebResourceRequest().pigeon_newInstance((WebResourceRequest) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$0;
                    writeValue$lambda$0 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(value, (Result) obj);
                    return writeValue$lambda$0;
                }
            });
        } else if (value instanceof WebResourceResponse) {
            this.registrar.getPigeonApiWebResourceResponse().pigeon_newInstance((WebResourceResponse) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$1;
                    writeValue$lambda$1 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(value, (Result) obj);
                    return writeValue$lambda$1;
                }
            });
        } else if (value instanceof WebResourceError) {
            this.registrar.getPigeonApiWebResourceError().pigeon_newInstance((WebResourceError) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$2;
                    writeValue$lambda$2 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(value, (Result) obj);
                    return writeValue$lambda$2;
                }
            });
        } else if (value instanceof WebResourceErrorCompat) {
            this.registrar.getPigeonApiWebResourceErrorCompat().pigeon_newInstance((WebResourceErrorCompat) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$3;
                    writeValue$lambda$3 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(value, (Result) obj);
                    return writeValue$lambda$3;
                }
            });
        } else if (value instanceof WebViewPoint) {
            this.registrar.getPigeonApiWebViewPoint().pigeon_newInstance((WebViewPoint) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$4;
                    writeValue$lambda$4 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(value, (Result) obj);
                    return writeValue$lambda$4;
                }
            });
        } else if (value instanceof ConsoleMessage) {
            this.registrar.getPigeonApiConsoleMessage().pigeon_newInstance((ConsoleMessage) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$5;
                    writeValue$lambda$5 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(value, (Result) obj);
                    return writeValue$lambda$5;
                }
            });
        } else if (value instanceof CookieManager) {
            this.registrar.getPigeonApiCookieManager().pigeon_newInstance((CookieManager) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$6;
                    writeValue$lambda$6 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(value, (Result) obj);
                    return writeValue$lambda$6;
                }
            });
        } else if (value instanceof WebView) {
            this.registrar.getPigeonApiWebView().pigeon_newInstance((WebView) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$7;
                    writeValue$lambda$7 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(value, (Result) obj);
                    return writeValue$lambda$7;
                }
            });
        } else if (value instanceof WebSettings) {
            this.registrar.getPigeonApiWebSettings().pigeon_newInstance((WebSettings) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.A
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$8;
                    writeValue$lambda$8 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(value, (Result) obj);
                    return writeValue$lambda$8;
                }
            });
        } else if (value instanceof JavaScriptChannel) {
            this.registrar.getPigeonApiJavaScriptChannel().pigeon_newInstance((JavaScriptChannel) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.B
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$9;
                    writeValue$lambda$9 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(value, (Result) obj);
                    return writeValue$lambda$9;
                }
            });
        } else if (value instanceof WebViewClient) {
            this.registrar.getPigeonApiWebViewClient().pigeon_newInstance((WebViewClient) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$10;
                    writeValue$lambda$10 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(value, (Result) obj);
                    return writeValue$lambda$10;
                }
            });
        } else if (value instanceof DownloadListener) {
            this.registrar.getPigeonApiDownloadListener().pigeon_newInstance((DownloadListener) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$11;
                    writeValue$lambda$11 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(value, (Result) obj);
                    return writeValue$lambda$11;
                }
            });
        } else if (value instanceof WebChromeClientProxyApi.WebChromeClientImpl) {
            this.registrar.getPigeonApiWebChromeClient().pigeon_newInstance((WebChromeClientProxyApi.WebChromeClientImpl) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.C
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$12;
                    writeValue$lambda$12 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(value, (Result) obj);
                    return writeValue$lambda$12;
                }
            });
        } else if (value instanceof FlutterAssetManager) {
            this.registrar.getPigeonApiFlutterAssetManager().pigeon_newInstance((FlutterAssetManager) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.D
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$13;
                    writeValue$lambda$13 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(value, (Result) obj);
                    return writeValue$lambda$13;
                }
            });
        } else if (value instanceof WebStorage) {
            this.registrar.getPigeonApiWebStorage().pigeon_newInstance((WebStorage) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.E
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$14;
                    writeValue$lambda$14 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(value, (Result) obj);
                    return writeValue$lambda$14;
                }
            });
        } else if (value instanceof WebChromeClient.FileChooserParams) {
            this.registrar.getPigeonApiFileChooserParams().pigeon_newInstance((WebChromeClient.FileChooserParams) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.F
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$15;
                    writeValue$lambda$15 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(value, (Result) obj);
                    return writeValue$lambda$15;
                }
            });
        } else if (value instanceof PermissionRequest) {
            this.registrar.getPigeonApiPermissionRequest().pigeon_newInstance((PermissionRequest) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.G
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$16;
                    writeValue$lambda$16 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(value, (Result) obj);
                    return writeValue$lambda$16;
                }
            });
        } else if (value instanceof WebChromeClient.CustomViewCallback) {
            this.registrar.getPigeonApiCustomViewCallback().pigeon_newInstance((WebChromeClient.CustomViewCallback) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.H
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$17;
                    writeValue$lambda$17 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$17(value, (Result) obj);
                    return writeValue$lambda$17;
                }
            });
        } else if (value instanceof View) {
            this.registrar.getPigeonApiView().pigeon_newInstance((View) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.I
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$18;
                    writeValue$lambda$18 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$18(value, (Result) obj);
                    return writeValue$lambda$18;
                }
            });
        } else if (value instanceof GeolocationPermissions.Callback) {
            this.registrar.getPigeonApiGeolocationPermissionsCallback().pigeon_newInstance((GeolocationPermissions.Callback) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$19;
                    writeValue$lambda$19 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(value, (Result) obj);
                    return writeValue$lambda$19;
                }
            });
        } else if (value instanceof HttpAuthHandler) {
            this.registrar.getPigeonApiHttpAuthHandler().pigeon_newInstance((HttpAuthHandler) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$20;
                    writeValue$lambda$20 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(value, (Result) obj);
                    return writeValue$lambda$20;
                }
            });
        } else if (value instanceof Message) {
            this.registrar.getPigeonApiAndroidMessage().pigeon_newInstance((Message) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$21;
                    writeValue$lambda$21 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(value, (Result) obj);
                    return writeValue$lambda$21;
                }
            });
        } else if (value instanceof ClientCertRequest) {
            this.registrar.getPigeonApiClientCertRequest().pigeon_newInstance((ClientCertRequest) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$22;
                    writeValue$lambda$22 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(value, (Result) obj);
                    return writeValue$lambda$22;
                }
            });
        } else if (value instanceof PrivateKey) {
            this.registrar.getPigeonApiPrivateKey().pigeon_newInstance((PrivateKey) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$23;
                    writeValue$lambda$23 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(value, (Result) obj);
                    return writeValue$lambda$23;
                }
            });
        } else if (value instanceof X509Certificate) {
            this.registrar.getPigeonApiX509Certificate().pigeon_newInstance((X509Certificate) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$24;
                    writeValue$lambda$24 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(value, (Result) obj);
                    return writeValue$lambda$24;
                }
            });
        } else if (value instanceof SslErrorHandler) {
            this.registrar.getPigeonApiSslErrorHandler().pigeon_newInstance((SslErrorHandler) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$25;
                    writeValue$lambda$25 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(value, (Result) obj);
                    return writeValue$lambda$25;
                }
            });
        } else if (value instanceof SslError) {
            this.registrar.getPigeonApiSslError().pigeon_newInstance((SslError) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$26;
                    writeValue$lambda$26 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(value, (Result) obj);
                    return writeValue$lambda$26;
                }
            });
        } else if (value instanceof SslCertificate.DName) {
            this.registrar.getPigeonApiSslCertificateDName().pigeon_newInstance((SslCertificate.DName) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$27;
                    writeValue$lambda$27 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(value, (Result) obj);
                    return writeValue$lambda$27;
                }
            });
        } else if (value instanceof SslCertificate) {
            this.registrar.getPigeonApiSslCertificate().pigeon_newInstance((SslCertificate) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$28;
                    writeValue$lambda$28 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(value, (Result) obj);
                    return writeValue$lambda$28;
                }
            });
        } else if (value instanceof Certificate) {
            this.registrar.getPigeonApiCertificate().pigeon_newInstance((Certificate) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$29;
                    writeValue$lambda$29 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(value, (Result) obj);
                    return writeValue$lambda$29;
                }
            });
        } else if (value instanceof WebSettingsCompat) {
            this.registrar.getPigeonApiWebSettingsCompat().pigeon_newInstance((WebSettingsCompat) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit writeValue$lambda$30;
                    writeValue$lambda$30 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(value, (Result) obj);
                    return writeValue$lambda$30;
                }
            });
        } else if (value instanceof WebViewFeature) {
            this.registrar.getPigeonApiWebViewFeature().pigeon_newInstance((WebViewFeature) value, new C1020t(value, 0));
        }
        if (this.registrar.getInstanceManager().containsInstance(value)) {
            stream.write(128);
            writeValue(stream, this.registrar.getInstanceManager().getIdentifierForStrongReference(value));
            return;
        }
        throw new IllegalArgumentException("Unsupported value: '" + value + "' of type '" + value.getClass().getName() + "'");
    }
}
