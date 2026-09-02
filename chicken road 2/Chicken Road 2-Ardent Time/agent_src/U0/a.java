package U0;

/* loaded from: classes.dex */
public final class a implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f1728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0.c f1729b;

    public a(U0.c cVar, android.content.Context context) {
        this.f1729b = cVar;
        this.f1728a = context;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        U0.c cVar = this.f1729b;
        android.content.Context context = this.f1728a;
        g1.AbstractC0130a.b("FlutterLoader initTask");
        try {
            cVar.getClass();
            io.flutter.embedding.engine.FlutterJNI flutterJNI = cVar.f1737f;
            int i2 = 0;
            try {
                flutterJNI.loadLibrary(context);
                flutterJNI.updateRefreshRate();
                cVar.f1738g.execute(new F0.a(3, this));
                java.io.File filesDir = context.getFilesDir();
                if (filesDir == null) {
                    filesDir = new java.io.File(context.getDataDir().getPath(), "files");
                }
                java.lang.String path = filesDir.getPath();
                java.io.File codeCacheDir = context.getCodeCacheDir();
                if (codeCacheDir == null) {
                    codeCacheDir = context.getCacheDir();
                }
                if (codeCacheDir == null) {
                    codeCacheDir = new java.io.File(context.getDataDir().getPath(), "cache");
                }
                java.lang.String path2 = codeCacheDir.getPath();
                java.io.File dir = context.getDir(io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER, 0);
                if (dir == null) {
                    dir = new java.io.File(context.getDataDir().getPath(), "app_flutter");
                }
                dir.getPath();
                U0.b bVar = new U0.b(path, path2);
                android.os.Trace.endSection();
                return bVar;
            } catch (java.lang.UnsatisfiedLinkError e2) {
                if (!e2.toString().contains("couldn't find \"libflutter.so\"") && !e2.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                    throw e2;
                }
                java.lang.String property = java.lang.System.getProperty("os.arch");
                java.io.File file = new java.io.File((java.lang.String) cVar.f1736e.f1041e);
                java.lang.String[] list = file.list();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String[] strArr = android.os.Build.SUPPORTED_ABIS;
                int length = strArr.length;
                int i3 = 0;
                while (i3 < length) {
                    java.lang.String str = strArr[i3];
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("!");
                    java.lang.String str2 = java.io.File.separator;
                    sb.append(str2);
                    sb.append("lib");
                    sb.append(str2);
                    sb.append(str);
                    java.lang.String sb2 = sb.toString();
                    java.lang.String[] strArr2 = context.getApplicationInfo().splitSourceDirs;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    if (strArr2 != null) {
                        int length2 = strArr2.length;
                        for (int i4 = i2; i4 < length2; i4++) {
                            arrayList2.add(strArr2[i4] + sb2);
                        }
                        arrayList.addAll(arrayList2);
                    }
                    java.lang.String str3 = context.getApplicationInfo().sourceDir;
                    if (str3 != null && !str3.isEmpty()) {
                        arrayList.add(str3 + sb2);
                    }
                    i3++;
                    i2 = 0;
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                sb3.append(property);
                sb3.append(", and the native libraries directory (with path ");
                sb3.append(file.getAbsolutePath());
                sb3.append(") ");
                sb3.append(file.exists() ? "contains the following files: " + java.util.Arrays.toString(list) : "does not exist");
                sb3.append(arrayList.isEmpty() ? "" : ", and the split and source libraries directory (with path(s) " + arrayList + ")");
                sb3.append(".");
                throw new java.lang.UnsupportedOperationException(sb3.toString(), e2);
            }
        } finally {
        }
    }
}
