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
import p098n4.C0934g;
import p098n4.D;
import p098n4.E;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
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
                ((D) obj2).f15371g.n((p134s4.h) obj);
                return null;
            case 5:
                D d7 = (D) obj2;
                C0934g c0934g = (C0934g) obj;
                d7.f15371g.w(p134s4.h.a(c0934g));
                return D.a(d7, new p106o4.b(p106o4.d.f15612e, c0934g));
            case 6:
                D d8 = (D) obj2;
                p134s4.h hVar = (p134s4.h) d8.f15367c.get((E) obj);
                if (hVar == null) {
                    return Collections.emptyList();
                }
                d8.f15371g.w(hVar);
                return D.b(d8, hVar, new p106o4.b(new p106o4.d(2, hVar.f16179b, true), C0934g.f15421d));
            default:
                Context context3 = (Context) obj2;
                p148u5.c cVar = (p148u5.c) obj;
                S5.a.b("FlutterLoader initTask");
                try {
                    cVar.getClass();
                    FlutterJNI flutterJNI = (FlutterJNI) cVar.f16886e;
                    try {
                        flutterJNI.loadLibrary(context3);
                        flutterJNI.updateRefreshRate();
                        ((ExecutorService) cVar.f16887f).execute(new io.sentry.android.core.internal.modules.a(this, 5));
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
                        p148u5.b bVar = new p148u5.b(path, path2);
                        Trace.endSection();
                        return bVar;
                    } catch (UnsatisfiedLinkError e7) {
                        if (!e7.toString().contains("couldn't find \"libflutter.so\"") && !e7.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                            throw e7;
                        }
                        String property = System.getProperty("os.arch");
                        File file = new File((String) ((C0282o) cVar.f16885d).f3013e);
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
                        break;
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
