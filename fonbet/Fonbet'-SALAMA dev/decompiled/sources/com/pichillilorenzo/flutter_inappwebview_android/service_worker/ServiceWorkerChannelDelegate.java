package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import A5.o;
import A5.r;
import A5.s;
import R0.d;
import R0.j;
import S0.B;
import S0.m;
import S0.w;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import java.util.Map;

/* loaded from: classes2.dex */
public class ServiceWorkerChannelDelegate extends ChannelDelegateImpl {
    private ServiceWorkerManager serviceWorkerManager;

    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return WebResourceResponseExt.fromMap((Map) obj);
        }
    }

    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return new ShouldInterceptRequestCallback().decodeResult(obj);
        }
    }

    public ServiceWorkerChannelDelegate(ServiceWorkerManager serviceWorkerManager, s sVar) {
        super(sVar);
        this.serviceWorkerManager = serviceWorkerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.serviceWorkerManager = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        B b7;
        ServiceWorkerManager.init();
        j jVar = ServiceWorkerManager.serviceWorkerController;
        b7 = jVar != null ? ((m) jVar).f6249c : null;
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "getAllowContentAccess":
                if (b7 != null && d.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    w.j.getClass();
                    rVar.success(Boolean.valueOf(b7.e().getAllowContentAccess()));
                    break;
                } else {
                    rVar.success(Boolean.FALSE);
                    break;
                }
                break;
            case "setServiceWorkerClient":
                if (this.serviceWorkerManager == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.serviceWorkerManager.setServiceWorkerClient((Boolean) oVar.a("isNull"));
                    rVar.success(Boolean.TRUE);
                    break;
                }
            case "getCacheMode":
                if (b7 != null && d.a("SERVICE_WORKER_CACHE_MODE")) {
                    w.f6294i.getClass();
                    rVar.success(Integer.valueOf(b7.e().getCacheMode()));
                    break;
                } else {
                    rVar.success(null);
                    break;
                }
                break;
            case "getAllowFileAccess":
                if (b7 != null && d.a("SERVICE_WORKER_FILE_ACCESS")) {
                    w.f6295k.getClass();
                    rVar.success(Boolean.valueOf(b7.e().getAllowFileAccess()));
                    break;
                } else {
                    rVar.success(Boolean.FALSE);
                    break;
                }
                break;
            case "setCacheMode":
                if (b7 != null && d.a("SERVICE_WORKER_CACHE_MODE")) {
                    int intValue = ((Integer) oVar.a("mode")).intValue();
                    w.f6294i.getClass();
                    b7.e().setCacheMode(intValue);
                }
                rVar.success(Boolean.TRUE);
                break;
            case "setBlockNetworkLoads":
                if (b7 != null && d.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    boolean booleanValue = ((Boolean) oVar.a("flag")).booleanValue();
                    w.f6296l.getClass();
                    b7.e().setBlockNetworkLoads(booleanValue);
                }
                rVar.success(Boolean.TRUE);
                break;
            case "setAllowContentAccess":
                if (b7 != null && d.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    boolean booleanValue2 = ((Boolean) oVar.a("allow")).booleanValue();
                    w.j.getClass();
                    b7.e().setAllowContentAccess(booleanValue2);
                }
                rVar.success(Boolean.TRUE);
                break;
            case "setAllowFileAccess":
                if (b7 != null && d.a("SERVICE_WORKER_FILE_ACCESS")) {
                    boolean booleanValue3 = ((Boolean) oVar.a("allow")).booleanValue();
                    w.f6295k.getClass();
                    b7.e().setAllowFileAccess(booleanValue3);
                }
                rVar.success(Boolean.TRUE);
                break;
            case "getBlockNetworkLoads":
                if (b7 != null && d.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    w.f6296l.getClass();
                    rVar.success(Boolean.valueOf(b7.e().getBlockNetworkLoads()));
                    break;
                } else {
                    rVar.success(Boolean.FALSE);
                    break;
                }
                break;
            default:
                rVar.notImplemented();
                break;
        }
    }

    public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
    }

    public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) {
        s channel = getChannel();
        if (channel == null) {
            return null;
        }
        return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
    }
}
