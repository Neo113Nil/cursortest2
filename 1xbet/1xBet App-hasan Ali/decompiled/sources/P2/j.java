package P2;

import Q2.C0379q;
import Q2.InterfaceC0392x;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.AbstractC1803xs;
import com.google.android.gms.internal.ads.R4;
import com.google.android.gms.internal.ads.Ts;

/* loaded from: classes.dex */
public final class j extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4752b;

    public /* synthetic */ j(int i, Object obj) {
        this.f4751a = i;
        this.f4752b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f4751a) {
            case 0:
                n nVar = (n) this.f4752b;
                InterfaceC0392x interfaceC0392x = nVar.f4764q;
                if (interfaceC0392x != null) {
                    try {
                        interfaceC0392x.q(AbstractC1803xs.I(1, null, null));
                    } catch (RemoteException e3) {
                        U2.j.k("#007 Could not call remote method.", e3);
                    }
                }
                InterfaceC0392x interfaceC0392x2 = nVar.f4764q;
                if (interfaceC0392x2 != null) {
                    try {
                        interfaceC0392x2.x(0);
                        break;
                    } catch (RemoteException e5) {
                        U2.j.k("#007 Could not call remote method.", e5);
                        return;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f4751a) {
            case 1:
                Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + String.valueOf(webView));
                Ts ts = (Ts) this.f4752b;
                if (ts.a() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    ts.f11461b = new X.m(null);
                }
                webView.destroy();
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f4751a) {
            case 0:
                n nVar = (n) this.f4752b;
                int i = 0;
                if (str.startsWith(nVar.s())) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    InterfaceC0392x interfaceC0392x = nVar.f4764q;
                    if (interfaceC0392x != null) {
                        try {
                            interfaceC0392x.q(AbstractC1803xs.I(3, null, null));
                        } catch (RemoteException e3) {
                            U2.j.k("#007 Could not call remote method.", e3);
                        }
                    }
                    InterfaceC0392x interfaceC0392x2 = nVar.f4764q;
                    if (interfaceC0392x2 != null) {
                        try {
                            interfaceC0392x2.x(3);
                        } catch (RemoteException e5) {
                            U2.j.k("#007 Could not call remote method.", e5);
                        }
                    }
                    nVar.u3(0);
                } else if (str.startsWith("gmsg://scriptLoadFailed")) {
                    InterfaceC0392x interfaceC0392x3 = nVar.f4764q;
                    if (interfaceC0392x3 != null) {
                        try {
                            interfaceC0392x3.q(AbstractC1803xs.I(1, null, null));
                        } catch (RemoteException e6) {
                            U2.j.k("#007 Could not call remote method.", e6);
                        }
                    }
                    InterfaceC0392x interfaceC0392x4 = nVar.f4764q;
                    if (interfaceC0392x4 != null) {
                        try {
                            interfaceC0392x4.x(0);
                        } catch (RemoteException e7) {
                            U2.j.k("#007 Could not call remote method.", e7);
                        }
                    }
                    nVar.u3(0);
                } else {
                    boolean startsWith = str.startsWith("gmsg://adResized");
                    Context context = nVar.f4761n;
                    if (startsWith) {
                        InterfaceC0392x interfaceC0392x5 = nVar.f4764q;
                        if (interfaceC0392x5 != null) {
                            try {
                                interfaceC0392x5.e();
                            } catch (RemoteException e8) {
                                U2.j.k("#007 Could not call remote method.", e8);
                            }
                        }
                        String queryParameter = Uri.parse(str).getQueryParameter("height");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            try {
                                U2.e eVar = C0379q.f.f5048a;
                                i = U2.e.l(context, Integer.parseInt(queryParameter));
                            } catch (NumberFormatException unused) {
                            }
                        }
                        nVar.u3(i);
                    } else if (!str.startsWith("gmsg://")) {
                        InterfaceC0392x interfaceC0392x6 = nVar.f4764q;
                        if (interfaceC0392x6 != null) {
                            try {
                                interfaceC0392x6.p();
                                nVar.f4764q.g();
                            } catch (RemoteException e9) {
                                U2.j.k("#007 Could not call remote method.", e9);
                            }
                        }
                        if (nVar.f4765r != null) {
                            Uri parse = Uri.parse(str);
                            try {
                                parse = nVar.f4765r.a(parse, context, null, null);
                            } catch (R4 e10) {
                                U2.j.j("Unable to process ad data", e10);
                            }
                            str = parse.toString();
                        }
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(str));
                        context.startActivity(intent);
                    }
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
