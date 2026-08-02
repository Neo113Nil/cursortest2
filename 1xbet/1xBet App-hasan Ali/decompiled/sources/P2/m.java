package P2;

import a3.AbstractC0467k;
import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.Q4;
import com.google.android.gms.internal.ads.R4;
import com.google.android.gms.internal.ads.V7;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class m extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f4757a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        n nVar = this.f4757a;
        try {
            nVar.f4765r = (Q4) nVar.f4760m.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            e = e3;
            U2.j.j("", e);
        } catch (ExecutionException e5) {
            e = e5;
            U2.j.j("", e);
        } catch (TimeoutException e6) {
            U2.j.j("", e6);
        }
        nVar.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) V7.f11869d.s());
        C0.c cVar = nVar.f4762o;
        builder.appendQueryParameter("query", (String) cVar.f814e);
        builder.appendQueryParameter("pubId", (String) cVar.f812c);
        builder.appendQueryParameter("mappver", (String) cVar.f815g);
        TreeMap treeMap = (TreeMap) cVar.f813d;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri build = builder.build();
        Q4 q42 = nVar.f4765r;
        if (q42 != null) {
            try {
                build = Q4.d(build, q42.f11167b.c(nVar.f4761n));
            } catch (R4 e7) {
                U2.j.j("Unable to process ad data", e7);
            }
        }
        return AbstractC0467k.v(nVar.s(), "#", build.getEncodedQuery());
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        WebView webView = this.f4757a.f4763p;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
