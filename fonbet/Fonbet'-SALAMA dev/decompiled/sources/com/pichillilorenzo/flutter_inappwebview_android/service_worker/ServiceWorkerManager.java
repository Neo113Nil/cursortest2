package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import A5.s;
import R0.d;
import R0.h;
import R0.i;
import R0.j;
import S0.g;
import S0.m;
import S0.w;
import android.util.Log;
import android.webkit.ServiceWorkerController;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import java.io.ByteArrayInputStream;
import java.util.Map;

/* loaded from: classes2.dex */
public class ServiceWorkerManager implements Disposable {
    protected static final String LOG_TAG = "ServiceWorkerManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_serviceworkercontroller";
    public static j serviceWorkerController;
    public ServiceWorkerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    public static final class DummyServiceWorkerClientCompat extends h {
        static final h INSTANCE = new DummyServiceWorkerClientCompat();

        private DummyServiceWorkerClientCompat() {
        }

        @Override // R0.h
        public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
            return null;
        }
    }

    public ServiceWorkerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new ServiceWorkerChannelDelegate(this, new s(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }

    private h dummyServiceWorkerClientCompat() {
        return DummyServiceWorkerClientCompat.INSTANCE;
    }

    public static void init() {
        if (serviceWorkerController == null && d.a("SERVICE_WORKER_BASIC_USAGE")) {
            serviceWorkerController = i.f5857a;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = this.channelDelegate;
        if (serviceWorkerChannelDelegate != null) {
            serviceWorkerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }

    public void setServiceWorkerClient(Boolean bool) {
        j jVar = serviceWorkerController;
        if (jVar != null) {
            h dummyServiceWorkerClientCompat = bool.booleanValue() ? dummyServiceWorkerClientCompat() : new h() { // from class: com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerManager.1
                @Override // R0.h
                public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                    WebResourceResponseExt shouldInterceptRequest;
                    WebResourceRequestExt fromWebResourceRequest = WebResourceRequestExt.fromWebResourceRequest(webResourceRequest);
                    ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = ServiceWorkerManager.this.channelDelegate;
                    if (serviceWorkerChannelDelegate != null) {
                        try {
                            shouldInterceptRequest = serviceWorkerChannelDelegate.shouldInterceptRequest(fromWebResourceRequest);
                        } catch (InterruptedException e7) {
                            Log.e(ServiceWorkerManager.LOG_TAG, "", e7);
                            return null;
                        }
                    } else {
                        shouldInterceptRequest = null;
                    }
                    if (shouldInterceptRequest == null) {
                        return null;
                    }
                    String contentType = shouldInterceptRequest.getContentType();
                    String contentEncoding = shouldInterceptRequest.getContentEncoding();
                    byte[] data = shouldInterceptRequest.getData();
                    Map<String, String> headers = shouldInterceptRequest.getHeaders();
                    Integer statusCode = shouldInterceptRequest.getStatusCode();
                    String reasonPhrase = shouldInterceptRequest.getReasonPhrase();
                    ByteArrayInputStream byteArrayInputStream = data != null ? new ByteArrayInputStream(data) : null;
                    return (statusCode == null || reasonPhrase == null) ? new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream) : new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream);
                }
            };
            m mVar = (m) jVar;
            w.f6293h.getClass();
            if (dummyServiceWorkerClientCompat == null) {
                if (mVar.f6247a == null) {
                    mVar.f6247a = ServiceWorkerController.getInstance();
                }
                mVar.f6247a.setServiceWorkerClient(null);
            } else {
                if (mVar.f6247a == null) {
                    mVar.f6247a = ServiceWorkerController.getInstance();
                }
                mVar.f6247a.setServiceWorkerClient(new g(dummyServiceWorkerClientCompat));
            }
        }
    }
}
