package N1;

import G0.m;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Trace;
import b2.AbstractC0164a;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.C0173b;
import com.google.android.gms.internal.play_billing.InterfaceC0179d;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import m0.BinderC1110A;
import m0.C1116d;
import m0.O;

/* loaded from: classes.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f995c;

    public /* synthetic */ b(C1116d c1116d, Object obj, int i3) {
        this.f993a = i3;
        this.f994b = c1116d;
        this.f995c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        InterfaceC0179d interfaceC0179d;
        InterfaceC0179d interfaceC0179d2;
        InterfaceC0179d interfaceC0179d3;
        int i3 = 0;
        switch (this.f993a) {
            case 0:
                d dVar = (d) this.f995c;
                Context context = (Context) this.f994b;
                AbstractC0164a.b("FlutterLoader initTask");
                try {
                    dVar.getClass();
                    FlutterJNI flutterJNI = dVar.f;
                    try {
                        flutterJNI.loadLibrary(context);
                        flutterJNI.updateRefreshRate();
                        dVar.f1003g.execute(new m(2, this));
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
                        c cVar = new c(path, path2);
                        Trace.endSection();
                        return cVar;
                    } catch (UnsatisfiedLinkError e3) {
                        if (!e3.toString().contains("couldn't find \"libflutter.so\"") && !e3.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                            throw e3;
                        }
                        String property = System.getProperty("os.arch");
                        File file = new File(dVar.f1002e.f991d);
                        String[] list = file.list();
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = Build.SUPPORTED_ABIS;
                        int length = strArr.length;
                        int i4 = 0;
                        while (i4 < length) {
                            String str = strArr[i4];
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
                                for (int i5 = i3; i5 < length2; i5++) {
                                    arrayList2.add(strArr2[i5] + sb2);
                                }
                                arrayList.addAll(arrayList2);
                            }
                            String str3 = context.getApplicationInfo().sourceDir;
                            if (str3 != null && !str3.isEmpty()) {
                                arrayList.add(str3 + sb2);
                            }
                            i4++;
                            i3 = 0;
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
                C1116d c1116d = (C1116d) this.f994b;
                F1.b bVar = (F1.b) this.f995c;
                c1116d.getClass();
                try {
                    synchronized (c1116d.f10017a) {
                        interfaceC0179d = c1116d.f10023h;
                    }
                    if (interfaceC0179d == null) {
                        c1116d.A(bVar, O.f9977k, 119, null);
                    } else {
                        String packageName = c1116d.f.getPackageName();
                        String str4 = c1116d.f10019c;
                        long longValue = c1116d.f10016E.longValue();
                        int i6 = AbstractC0213o0.f2786a;
                        Bundle bundle = new Bundle();
                        AbstractC0213o0.b(bundle, str4, longValue);
                        ((C0173b) interfaceC0179d).p(packageName, bundle, new BinderC1110A(bVar, c1116d.f10022g, c1116d.f10027l, (char) 0));
                    }
                } catch (DeadObjectException e4) {
                    c1116d.A(bVar, O.f9977k, 69, e4);
                } catch (Exception e5) {
                    c1116d.A(bVar, O.f9975i, 69, e5);
                }
                return null;
            case 2:
                C1116d c1116d2 = (C1116d) this.f994b;
                F1.b bVar2 = (F1.b) this.f995c;
                c1116d2.getClass();
                try {
                    synchronized (c1116d2.f10017a) {
                        interfaceC0179d2 = c1116d2.f10023h;
                    }
                    if (interfaceC0179d2 == null) {
                        c1116d2.F(bVar2, O.f9977k, 119, null);
                    } else {
                        String packageName2 = c1116d2.f.getPackageName();
                        String str5 = c1116d2.f10019c;
                        long longValue2 = c1116d2.f10016E.longValue();
                        Bundle bundle2 = new Bundle();
                        AbstractC0213o0.b(bundle2, str5, longValue2);
                        ((C0173b) interfaceC0179d2).o(packageName2, bundle2, new BinderC1110A(bVar2, c1116d2.f10022g, c1116d2.f10027l, (byte) 0));
                    }
                } catch (DeadObjectException e6) {
                    c1116d2.F(bVar2, O.f9977k, 62, e6);
                } catch (Exception e7) {
                    c1116d2.F(bVar2, O.f9975i, 62, e7);
                }
                return null;
            default:
                C1116d c1116d3 = (C1116d) this.f994b;
                F1.b bVar3 = (F1.b) this.f995c;
                c1116d3.getClass();
                try {
                    synchronized (c1116d3.f10017a) {
                        interfaceC0179d3 = c1116d3.f10023h;
                    }
                    if (interfaceC0179d3 == null) {
                        c1116d3.C(bVar3, O.f9977k, 119, null);
                    } else {
                        String packageName3 = c1116d3.f.getPackageName();
                        String str6 = c1116d3.f10019c;
                        long longValue3 = c1116d3.f10016E.longValue();
                        int i7 = AbstractC0213o0.f2786a;
                        Bundle bundle3 = new Bundle();
                        AbstractC0213o0.b(bundle3, str6, longValue3);
                        ((C0173b) interfaceC0179d3).m(packageName3, bundle3, new BinderC1110A(bVar3, c1116d3.f10022g, c1116d3.f10027l));
                    }
                } catch (DeadObjectException e8) {
                    c1116d3.C(bVar3, O.f9977k, 70, e8);
                } catch (Exception e9) {
                    c1116d3.C(bVar3, O.f9975i, 70, e9);
                }
                return null;
        }
    }

    public b(d dVar, Context context) {
        this.f993a = 0;
        this.f995c = dVar;
        this.f994b = context;
    }
}
