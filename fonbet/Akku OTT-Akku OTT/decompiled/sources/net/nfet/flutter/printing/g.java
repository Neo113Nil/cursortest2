package net.nfet.flutter.printing;

import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.window.embedding.SplitRule;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class g extends WebViewClient {
    public final /* synthetic */ PrintAttributes.MediaSize a;
    public final /* synthetic */ PrintAttributes.Margins b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ h d;

    public class a {
        public a() {
        }

        public final void a(String str) {
            h hVar = g.this.d;
            b bVar = hVar.b;
            bVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
            hashMap.put("job", Integer.valueOf(hVar.g));
            bVar.b.invokeMethod("onHtmlError", hashMap);
        }
    }

    public g(h hVar, PrintAttributes.MediaSize mediaSize, PrintAttributes.Margins margins, WebView webView) {
        this.d = hVar;
        this.a = mediaSize;
        this.b = margins;
        this.c = webView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        PrintAttributes build = new PrintAttributes.Builder().setMediaSize(this.a).setResolution(new PrintAttributes.Resolution("pdf", "pdf", SplitRule.SPLIT_MIN_DIMENSION_DP_DEFAULT, SplitRule.SPLIT_MIN_DIMENSION_DP_DEFAULT)).setMinMargins(this.b).build();
        PrintDocumentAdapter createPrintDocumentAdapter = this.c.createPrintDocumentAdapter("printing");
        createPrintDocumentAdapter.onLayout(null, build, null, new android.print.a(this.d.a, new a(), createPrintDocumentAdapter), null);
    }
}
