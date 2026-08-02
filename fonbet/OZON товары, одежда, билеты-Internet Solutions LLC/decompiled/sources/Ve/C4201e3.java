package Ve;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.SPayMaterialButton;

/* renamed from: Ve.e3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4201e3 extends Tm {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H3 f30911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4201e3(H3 h32, Context context) {
        super(context);
        this.f30911d = h32;
        Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView != null) {
            webView.postDelayed(new B90.p0(this.f30911d, 1), 500L);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence description;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError == null || (description = webResourceError.getDescription()) == null || !kotlin.text.h.t(description, "ERR_INTERNET_DISCONNECTED", false)) {
            return;
        }
        ((R4) this.f30911d.u()).e0(Uo.f30144a);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            String uri = url.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "url.toString()");
            boolean e02 = kotlin.text.h.e0(uri, "https://accounts.google.com", true);
            H3 h32 = this.f30911d;
            if (e02 && Wk.f30290b == 5) {
                h32.getClass();
                Intrinsics.checkNotNullParameter("https://docs.google.com/gview?embedded=true&url=https://zenlink.ru/dogovor_oferta.pdf?ysclid=mhtevhels3487567533", "pdfUrl");
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://docs.google.com/gview?embedded=true&url=https://zenlink.ru/dogovor_oferta.pdf?ysclid=mhtevhels3487567533"));
                intent.setFlags(1073741825);
                h32.startActivity(Intent.createChooser(intent, "Open PDF"));
                return true;
            }
            String uri2 = url.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "url.toString()");
            if (!kotlin.text.h.A(uri2, ".pdf", true)) {
                String uri3 = url.toString();
                Intrinsics.checkNotNullExpressionValue(uri3, "url.toString()");
                if (!kotlin.text.h.t(uri3, ".pdf?", true)) {
                    String uri4 = url.toString();
                    Intrinsics.checkNotNullExpressionValue(uri4, "url.toString()");
                    if (!kotlin.text.h.t(uri4, "spaysdk://payment?error=invalid_request", true)) {
                        String uri5 = url.toString();
                        Intrinsics.checkNotNullExpressionValue(uri5, "url.toString()");
                        if (kotlin.text.h.t(uri5, "spaysdk://payment", true)) {
                            ((R4) h32.u()).e0(new C4826zp(url));
                            return true;
                        }
                        String uri6 = url.toString();
                        Intrinsics.checkNotNullExpressionValue(uri6, "url.toString()");
                        String str = h32.f29114d;
                        if (str == null) {
                            str = "";
                        }
                        if (!kotlin.text.h.t(uri6, str, true)) {
                            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                        }
                        X4.a aVar = h32.f28693b;
                        if (aVar == null) {
                            throw M7.f29463a;
                        }
                        SPayMaterialButton sPayMaterialButton = ((C4635t4) aVar).f32087d;
                        Intrinsics.checkNotNullExpressionValue(sPayMaterialButton, "binding.spaySlpnavwvMbCloseOffer");
                        sPayMaterialButton.setVisibility(8);
                        return true;
                    }
                    ((R4) h32.u()).e0(C4713vo.f32315a);
                }
            }
            String pdfUrl = "https://docs.google.com/gview?embedded=true&url=" + url;
            h32.getClass();
            Intrinsics.checkNotNullParameter(pdfUrl, "pdfUrl");
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(pdfUrl));
            intent2.setFlags(1073741825);
            h32.startActivity(Intent.createChooser(intent2, "Open PDF"));
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
