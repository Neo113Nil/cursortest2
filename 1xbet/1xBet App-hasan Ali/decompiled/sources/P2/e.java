package P2;

import Q2.r;
import T2.G;
import T2.H;
import T2.L;
import a3.C0457a;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.F7;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4723c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f4721a = i;
        this.f4723c = obj;
        this.f4722b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SharedPreferences sharedPreferences;
        boolean z3 = false;
        Object obj = this.f4722b;
        Object obj2 = this.f4723c;
        switch (this.f4721a) {
            case 0:
                return ((g) obj2).j((Context) obj);
            case 1:
                Context context = (Context) obj;
                Context context2 = (Context) obj2;
                if (context != null) {
                    G.m("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
                } else {
                    G.m("Attempting to read user agent from local cache.");
                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                    z3 = true;
                }
                String string = sharedPreferences.getString("user_agent", "");
                if (TextUtils.isEmpty(string)) {
                    G.m("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context2);
                    if (z3) {
                        sharedPreferences.edit().putString("user_agent", string).apply();
                        G.m("Persisting user agent.");
                    }
                }
                return string;
            case 2:
                H h3 = L.f5672l;
                WebSettings webSettings = (WebSettings) obj2;
                webSettings.setDatabasePath(((Context) obj).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) r.f5053d.f5056c.a(F7.f8722M0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            default:
                return ((C0457a) obj2).getClickSignals((String) obj);
        }
    }

    public /* synthetic */ e(Context context, Context context2) {
        this.f4721a = 1;
        this.f4722b = context;
        this.f4723c = context2;
    }
}
