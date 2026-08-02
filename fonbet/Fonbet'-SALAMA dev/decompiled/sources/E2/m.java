package E2;

import I2.J;
import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzbdk;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class m extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f1942a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        n nVar = this.f1942a;
        try {
            nVar.f1950y = (zzauo) nVar.f1945c.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            e = e7;
            int i7 = J.f3546b;
            J2.j.h("", e);
        } catch (ExecutionException e8) {
            e = e8;
            int i72 = J.f3546b;
            J2.j.h("", e);
        } catch (TimeoutException e9) {
            int i8 = J.f3546b;
            J2.j.h("", e9);
        }
        nVar.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbdk.zzd.zze());
        Q3.o oVar = nVar.f1947e;
        builder.appendQueryParameter("query", (String) oVar.f5825d);
        builder.appendQueryParameter("pubId", (String) oVar.f5822a);
        builder.appendQueryParameter("mappver", (String) oVar.f5827f);
        TreeMap treeMap = (TreeMap) oVar.f5824c;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri build = builder.build();
        zzauo zzauoVar = nVar.f1950y;
        if (zzauoVar != null) {
            try {
                build = zzauoVar.zzb(build, nVar.f1946d);
            } catch (zzaup e10) {
                int i9 = J.f3546b;
                J2.j.h("Unable to process ad data", e10);
            }
        }
        return e1.k.f(nVar.zzq(), "#", build.getEncodedQuery());
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        WebView webView = this.f1942a.f1948f;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
