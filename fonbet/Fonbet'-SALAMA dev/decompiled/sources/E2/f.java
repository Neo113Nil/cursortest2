package E2;

import F2.C0254t;
import G4.C0282o;
import I2.J;
import I2.K;
import I2.P;
import P2.C0375a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.zzbby;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.Session;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import n4.C1473g;
import n4.D;
import n4.E;
import o4.C1510b;
import u5.C1648b;
import u5.C1649c;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1918c;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.f1916a = i7;
        this.f1918c = obj;
        this.f1917b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SharedPreferences sharedPreferences;
        String str;
        boolean z4 = false;
        Object obj = this.f1918c;
        Object obj2 = this.f1917b;
        switch (this.f1916a) {
            case 0:
                return ((h) obj).a((Context) obj2);
            case 1:
                Context context = (Context) obj2;
                Context context2 = (Context) obj;
                if (context != null) {
                    J.k("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
                } else {
                    J.k("Attempting to read user agent from local cache.");
                    z4 = true;
                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                }
                String string = sharedPreferences.getString(Session.JsonKeys.USER_AGENT, "");
                if (TextUtils.isEmpty(string)) {
                    J.k("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context2);
                    if (z4) {
                        sharedPreferences.edit().putString(Session.JsonKeys.USER_AGENT, string).apply();
                        J.k("Persisting user agent.");
                    }
                }
                return string;
            case 2:
                K k7 = P.f3579l;
                WebSettings webSettings = (WebSettings) obj;
                webSettings.setDatabasePath(((Context) obj2).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzaY)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            case 3:
                return ((C0375a) obj).getClickSignals((String) obj2);
            case 4:
                ((D) obj2).f15365g.n((s4.h) obj);
                return null;
            case 5:
                D d7 = (D) obj2;
                C1473g c1473g = (C1473g) obj;
                d7.f15365g.w(s4.h.a(c1473g));
                return D.a(d7, new C1510b(o4.d.f15606e, c1473g));
            case 6:
                D d8 = (D) obj2;
                s4.h hVar = (s4.h) d8.f15361c.get((E) obj);
                if (hVar == null) {
                    return Collections.emptyList();
                }
                d8.f15365g.w(hVar);
                return D.b(d8, hVar, new C1510b(new o4.d(2, hVar.f16173b, true), C1473g.f15415d));
            default:
                Context context3 = (Context) obj2;
                C1649c c1649c = (C1649c) obj;
                S5.a.b("FlutterLoader initTask");
                try {
                    c1649c.getClass();
                    FlutterJNI flutterJNI = (FlutterJNI) c1649c.f16880e;
                    try {
                        flutterJNI.loadLibrary(context3);
                        flutterJNI.updateRefreshRate();
                        ((ExecutorService) c1649c.f16881f).execute(new io.sentry.android.core.internal.modules.a(this, 5));
                        File filesDir = context3.getFilesDir();
                        if (filesDir == null) {
                            filesDir = new File(context3.getDataDir().getPath(), "files");
                        }
                        String path = filesDir.getPath();
                        File codeCacheDir = context3.getCodeCacheDir();
                        if (codeCacheDir == null) {
                            codeCacheDir = context3.getCacheDir();
                        }
                        if (codeCacheDir == null) {
                            codeCacheDir = new File(context3.getDataDir().getPath(), "cache");
                        }
                        String path2 = codeCacheDir.getPath();
                        File dir = context3.getDir("flutter", 0);
                        if (dir == null) {
                            dir = new File(context3.getDataDir().getPath(), "app_flutter");
                        }
                        dir.getPath();
                        C1648b c1648b = new C1648b(path, path2);
                        Trace.endSection();
                        return c1648b;
                    } catch (UnsatisfiedLinkError e7) {
                        if (!e7.toString().contains("couldn't find \"libflutter.so\"") && !e7.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                            throw e7;
                        }
                        String property = System.getProperty("os.arch");
                        File file = new File((String) ((C0282o) c1649c.f16879d).f3013e);
                        String[] list = file.list();
                        StringBuilder sb = new StringBuilder("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                        sb.append(property);
                        sb.append(", and the native libraries directory (with path ");
                        sb.append(file.getAbsolutePath());
                        sb.append(") ");
                        if (file.exists()) {
                            str = "contains the following files: " + Arrays.toString(list);
                        } else {
                            str = "does not exist.";
                        }
                        sb.append(str);
                        throw new UnsupportedOperationException(sb.toString(), e7);
                    }
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ f(int i7, Object obj, Object obj2, boolean z4) {
        this.f1916a = i7;
        this.f1917b = obj;
        this.f1918c = obj2;
    }
}
