package Z1;

import P0.j;
import T1.f;
import T1.k;
import a1.e;
import android.content.Context;
import android.util.Log;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d implements P1.b {

    /* renamed from: a, reason: collision with root package name */
    public Context f1778a;

    public static void b(f fVar, final d dVar) {
        j j3 = fVar.j(new T1.j());
        b bVar = b.f1775a;
        D0.a aVar = new D0.a(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", (k) bVar, j3);
        if (dVar != null) {
            final int i3 = 0;
            aVar.g(new T1.b(dVar) { // from class: Z1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1774b;

                {
                    this.f1774b = dVar;
                }

                @Override // T1.b
                public final void e(Object obj, e eVar) {
                    switch (i3) {
                        case 0:
                            d dVar2 = this.f1774b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1778a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = X0.a.P(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1774b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1778a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = X0.a.P(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1774b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1778a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = X0.a.P(th3);
                            }
                            eVar.l(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1774b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1778a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = X0.a.P(th4);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1774b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1778a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = X0.a.P(th5);
                            }
                            eVar.l(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1774b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1778a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = X0.a.P(th6);
                            }
                            eVar.l(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1774b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = X0.a.P(th7);
                            }
                            eVar.l(arrayList8);
                            break;
                    }
                }
            });
        } else {
            aVar.g(null);
        }
        D0.a aVar2 = new D0.a(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", (k) bVar, j3);
        if (dVar != null) {
            final int i4 = 1;
            aVar2.g(new T1.b(dVar) { // from class: Z1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1774b;

                {
                    this.f1774b = dVar;
                }

                @Override // T1.b
                public final void e(Object obj, e eVar) {
                    switch (i4) {
                        case 0:
                            d dVar2 = this.f1774b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1778a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = X0.a.P(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1774b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1778a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = X0.a.P(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1774b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1778a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = X0.a.P(th3);
                            }
                            eVar.l(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1774b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1778a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = X0.a.P(th4);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1774b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1778a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = X0.a.P(th5);
                            }
                            eVar.l(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1774b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1778a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = X0.a.P(th6);
                            }
                            eVar.l(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1774b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = X0.a.P(th7);
                            }
                            eVar.l(arrayList8);
                            break;
                    }
                }
            });
        } else {
            aVar2.g(null);
        }
        D0.a aVar3 = new D0.a(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", (k) bVar, j3);
        if (dVar != null) {
            final int i5 = 2;
            aVar3.g(new T1.b(dVar) { // from class: Z1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1774b;

                {
                    this.f1774b = dVar;
                }

                @Override // T1.b
                public final void e(Object obj, e eVar) {
                    switch (i5) {
                        case 0:
                            d dVar2 = this.f1774b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1778a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = X0.a.P(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1774b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1778a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = X0.a.P(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1774b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1778a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = X0.a.P(th3);
                            }
                            eVar.l(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1774b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1778a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = X0.a.P(th4);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1774b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1778a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = X0.a.P(th5);
                            }
                            eVar.l(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1774b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1778a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = X0.a.P(th6);
                            }
                            eVar.l(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1774b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = X0.a.P(th7);
                            }
                            eVar.l(arrayList8);
                            break;
                    }
                }
            });
        } else {
            aVar3.g(null);
        }
        D0.a aVar4 = new D0.a(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", (k) bVar, j3);
        if (dVar != null) {
            final int i6 = 3;
            aVar4.g(new T1.b(dVar) { // from class: Z1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1774b;

                {
                    this.f1774b = dVar;
                }

                @Override // T1.b
                public final void e(Object obj, e eVar) {
                    switch (i6) {
                        case 0:
                            d dVar2 = this.f1774b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1778a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = X0.a.P(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1774b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1778a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = X0.a.P(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1774b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1778a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = X0.a.P(th3);
                            }
                            eVar.l(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1774b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1778a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = X0.a.P(th4);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1774b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1778a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = X0.a.P(th5);
                            }
                            eVar.l(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1774b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1778a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = X0.a.P(th6);
                            }
                            eVar.l(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1774b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = X0.a.P(th7);
                            }
                            eVar.l(arrayList8);
                            break;
                    }
                }
            });
        } else {
            aVar4.g(null);
        }
        D0.a aVar5 = new D0.a(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", (k) bVar, j3);
        if (dVar != null) {
            final int i7 = 4;
            aVar5.g(new T1.b(dVar) { // from class: Z1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1774b;

                {
                    this.f1774b = dVar;
                }

                @Override // T1.b
                public final void e(Object obj, e eVar) {
                    switch (i7) {
                        case 0:
                            d dVar2 = this.f1774b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1778a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = X0.a.P(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1774b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1778a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = X0.a.P(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1774b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1778a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = X0.a.P(th3);
                            }
                            eVar.l(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1774b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1778a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = X0.a.P(th4);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1774b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1778a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = X0.a.P(th5);
                            }
                            eVar.l(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1774b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1778a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = X0.a.P(th6);
                            }
                            eVar.l(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1774b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = X0.a.P(th7);
                            }
                            eVar.l(arrayList8);
                            break;
                    }
                }
            });
        } else {
            aVar5.g(null);
        }
        D0.a aVar6 = new D0.a(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", (k) bVar, j3);
        if (dVar != null) {
            final int i8 = 5;
            aVar6.g(new T1.b(dVar) { // from class: Z1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1774b;

                {
                    this.f1774b = dVar;
                }

                @Override // T1.b
                public final void e(Object obj, e eVar) {
                    switch (i8) {
                        case 0:
                            d dVar2 = this.f1774b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1778a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = X0.a.P(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1774b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1778a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = X0.a.P(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1774b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1778a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = X0.a.P(th3);
                            }
                            eVar.l(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1774b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1778a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = X0.a.P(th4);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1774b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1778a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = X0.a.P(th5);
                            }
                            eVar.l(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1774b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1778a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = X0.a.P(th6);
                            }
                            eVar.l(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1774b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = X0.a.P(th7);
                            }
                            eVar.l(arrayList8);
                            break;
                    }
                }
            });
        } else {
            aVar6.g(null);
        }
        D0.a aVar7 = new D0.a(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", (k) bVar, j3);
        if (dVar == null) {
            aVar7.g(null);
        } else {
            final int i9 = 6;
            aVar7.g(new T1.b(dVar) { // from class: Z1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f1774b;

                {
                    this.f1774b = dVar;
                }

                @Override // T1.b
                public final void e(Object obj, e eVar) {
                    switch (i9) {
                        case 0:
                            d dVar2 = this.f1774b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f1778a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = X0.a.P(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f1774b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f1778a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = X0.a.P(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f1774b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f1778a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = X0.a.P(th3);
                            }
                            eVar.l(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f1774b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f1778a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = X0.a.P(th4);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f1774b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f1778a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = X0.a.P(th5);
                            }
                            eVar.l(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f1774b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f1778a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = X0.a.P(th6);
                            }
                            eVar.l(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f1774b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = X0.a.P(th7);
                            }
                            eVar.l(arrayList8);
                            break;
                    }
                }
            });
        }
    }

    public final ArrayList a(c cVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f1778a;
        switch (cVar) {
            case ROOT:
                str = null;
                break;
            case MUSIC:
                str = "music";
                break;
            case PODCASTS:
                str = "podcasts";
                break;
            case RINGTONES:
                str = "ringtones";
                break;
            case ALARMS:
                str = "alarms";
                break;
            case NOTIFICATIONS:
                str = "notifications";
                break;
            case PICTURES:
                str = "pictures";
                break;
            case MOVIES:
                str = "movies";
                break;
            case DOWNLOADS:
                str = "downloads";
                break;
            case DCIM:
                str = "dcim";
                break;
            case DOCUMENTS:
                str = "documents";
                break;
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // P1.b
    public final void onAttachedToEngine(P1.a aVar) {
        try {
            b(aVar.f1153b, this);
        } catch (Exception e3) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e3);
        }
        this.f1778a = aVar.f1152a;
    }

    @Override // P1.b
    public final void onDetachedFromEngine(P1.a aVar) {
        b(aVar.f1153b, null);
    }
}
