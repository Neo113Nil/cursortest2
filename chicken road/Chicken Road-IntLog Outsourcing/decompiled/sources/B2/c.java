package B2;

import D3.g;
import G0.C;
import G0.C0054d;
import G0.O;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Trace;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.C0317b;
import com.google.android.gms.internal.play_billing.InterfaceC0323d;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f248c;

    public /* synthetic */ c(C0054d c0054d, Object obj, int i2) {
        this.f246a = i2;
        this.f247b = c0054d;
        this.f248c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        InterfaceC0323d interfaceC0323d;
        InterfaceC0323d interfaceC0323d2;
        InterfaceC0323d interfaceC0323d3;
        int i2 = 0;
        switch (this.f246a) {
            case 0:
                e eVar = (e) this.f248c;
                Context context = (Context) this.f247b;
                O2.a.b("FlutterLoader initTask");
                try {
                    eVar.getClass();
                    FlutterJNI flutterJNI = eVar.f256f;
                    try {
                        flutterJNI.loadLibrary(context);
                        flutterJNI.updateRefreshRate();
                        eVar.f257g.execute(new b(0, this));
                        File filesDir = context.getFilesDir();
                        if (filesDir == null) {
                            filesDir = new File(context.getDataDir().getPath(), "files");
                        }
                        String path = filesDir.getPath();
                        File codeCacheDir = context.getCodeCacheDir();
                        if (codeCacheDir == null) {
                            codeCacheDir = context.getCacheDir();
                        }
                        if (codeCacheDir == null) {
                            codeCacheDir = new File(context.getDataDir().getPath(), "cache");
                        }
                        String path2 = codeCacheDir.getPath();
                        File dir = context.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                        if (dir == null) {
                            dir = new File(context.getDataDir().getPath(), "app_flutter");
                        }
                        dir.getPath();
                        d dVar = new d(path, path2);
                        Trace.endSection();
                        return dVar;
                    } catch (UnsatisfiedLinkError e3) {
                        if (!e3.toString().contains("couldn't find \"libflutter.so\"") && !e3.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                            throw e3;
                        }
                        String property = System.getProperty("os.arch");
                        File file = new File((String) eVar.f255e.f243e);
                        String[] list = file.list();
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = Build.SUPPORTED_ABIS;
                        int length = strArr.length;
                        int i3 = 0;
                        while (i3 < length) {
                            String str = strArr[i3];
                            StringBuilder sb = new StringBuilder();
                            sb.append("!");
                            String str2 = File.separator;
                            sb.append(str2);
                            sb.append("lib");
                            sb.append(str2);
                            sb.append(str);
                            String sb2 = sb.toString();
                            String[] strArr2 = context.getApplicationInfo().splitSourceDirs;
                            ArrayList arrayList2 = new ArrayList();
                            if (strArr2 != null) {
                                int length2 = strArr2.length;
                                for (int i6 = i2; i6 < length2; i6++) {
                                    arrayList2.add(strArr2[i6] + sb2);
                                }
                                arrayList.addAll(arrayList2);
                            }
                            String str3 = context.getApplicationInfo().sourceDir;
                            if (str3 != null && !str3.isEmpty()) {
                                arrayList.add(str3 + sb2);
                            }
                            i3++;
                            i2 = 0;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                        sb3.append(property);
                        sb3.append(", and the native libraries directory (with path ");
                        sb3.append(file.getAbsolutePath());
                        sb3.append(") ");
                        sb3.append(file.exists() ? "contains the following files: " + Arrays.toString(list) : "does not exist");
                        sb3.append(arrayList.isEmpty() ? "" : ", and the split and source libraries directory (with path(s) " + arrayList + ")");
                        sb3.append(".");
                        throw new UnsupportedOperationException(sb3.toString(), e3);
                    }
                } finally {
                }
            case 1:
                C0054d c0054d = (C0054d) this.f247b;
                g gVar = (g) this.f248c;
                c0054d.getClass();
                try {
                    synchronized (c0054d.f824a) {
                        interfaceC0323d = c0054d.f831h;
                    }
                    if (interfaceC0323d == null) {
                        c0054d.A(gVar, O.f781k, 119, null);
                    } else {
                        String packageName = c0054d.f829f.getPackageName();
                        String str4 = c0054d.f826c;
                        long longValue = c0054d.f823E.longValue();
                        int i7 = AbstractC0357o0.f5220a;
                        Bundle bundle = new Bundle();
                        AbstractC0357o0.b(bundle, str4, longValue);
                        ((C0317b) interfaceC0323d).s(packageName, bundle, new C(gVar, c0054d.f830g, c0054d.f835l, (char) 0));
                    }
                } catch (DeadObjectException e6) {
                    c0054d.A(gVar, O.f781k, 69, e6);
                } catch (Exception e7) {
                    c0054d.A(gVar, O.f779i, 69, e7);
                }
                return null;
            case 2:
                C0054d c0054d2 = (C0054d) this.f247b;
                g gVar2 = (g) this.f248c;
                c0054d2.getClass();
                try {
                    synchronized (c0054d2.f824a) {
                        interfaceC0323d2 = c0054d2.f831h;
                    }
                    if (interfaceC0323d2 == null) {
                        c0054d2.F(gVar2, O.f781k, 119, null);
                    } else {
                        String packageName2 = c0054d2.f829f.getPackageName();
                        String str5 = c0054d2.f826c;
                        long longValue2 = c0054d2.f823E.longValue();
                        Bundle bundle2 = new Bundle();
                        AbstractC0357o0.b(bundle2, str5, longValue2);
                        ((C0317b) interfaceC0323d2).r(packageName2, bundle2, new C(gVar2, c0054d2.f830g, c0054d2.f835l, (byte) 0));
                    }
                } catch (DeadObjectException e8) {
                    c0054d2.F(gVar2, O.f781k, 62, e8);
                } catch (Exception e9) {
                    c0054d2.F(gVar2, O.f779i, 62, e9);
                }
                return null;
            default:
                C0054d c0054d3 = (C0054d) this.f247b;
                g gVar3 = (g) this.f248c;
                c0054d3.getClass();
                try {
                    synchronized (c0054d3.f824a) {
                        interfaceC0323d3 = c0054d3.f831h;
                    }
                    if (interfaceC0323d3 == null) {
                        c0054d3.C(gVar3, O.f781k, 119, null);
                    } else {
                        String packageName3 = c0054d3.f829f.getPackageName();
                        String str6 = c0054d3.f826c;
                        long longValue3 = c0054d3.f823E.longValue();
                        int i8 = AbstractC0357o0.f5220a;
                        Bundle bundle3 = new Bundle();
                        AbstractC0357o0.b(bundle3, str6, longValue3);
                        ((C0317b) interfaceC0323d3).p(packageName3, bundle3, new C(gVar3, c0054d3.f830g, c0054d3.f835l));
                    }
                } catch (DeadObjectException e10) {
                    c0054d3.C(gVar3, O.f781k, 70, e10);
                } catch (Exception e11) {
                    c0054d3.C(gVar3, O.f779i, 70, e11);
                }
                return null;
        }
    }

    public c(e eVar, Context context) {
        this.f246a = 0;
        this.f248c = eVar;
        this.f247b = context;
    }
}
