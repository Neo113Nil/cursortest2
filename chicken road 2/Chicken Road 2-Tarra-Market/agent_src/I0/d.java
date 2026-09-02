package I0;

import C0.t;
import D0.f;
import D0.h;
import N.i;
import Y.e;
import android.content.Context;
import android.util.Log;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.io.File;
import java.util.ArrayList;
import z0.C0865a;
import z0.InterfaceC0866b;

/* loaded from: classes.dex */
public class d implements InterfaceC0866b {

    /* renamed from: a, reason: collision with root package name */
    public Context f189a;

    public static void b(f fVar, final d dVar) {
        i d2 = fVar.d(new h());
        b bVar = b.f186a;
        t tVar = new t(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", bVar, d2);
        if (dVar != null) {
            final int i2 = 0;
            tVar.i(new D0.b(dVar) { // from class: I0.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f185b;

                {
                    this.f185b = dVar;
                }

                @Override // D0.b
                public final void a(Object obj, e eVar) {
                    switch (i2) {
                        case 0:
                            d dVar2 = this.f185b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f189a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = V.a.F(th);
                            }
                            eVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f185b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f189a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = V.a.F(th2);
                            }
                            eVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f185b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f189a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = V.a.F(th3);
                            }
                            eVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f185b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f189a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = V.a.F(th4);
                            }
                            eVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f185b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f189a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = V.a.F(th5);
                            }
                            eVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f185b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f189a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = V.a.F(th6);
                            }
                            eVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f185b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = V.a.F(th7);
                            }
                            eVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            tVar.i(null);
        }
        t tVar2 = new t(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", bVar, d2);
        if (dVar != null) {
            final int i3 = 1;
            tVar2.i(new D0.b(dVar) { // from class: I0.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f185b;

                {
                    this.f185b = dVar;
                }

                @Override // D0.b
                public final void a(Object obj, e eVar) {
                    switch (i3) {
                        case 0:
                            d dVar2 = this.f185b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f189a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = V.a.F(th);
                            }
                            eVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f185b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f189a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = V.a.F(th2);
                            }
                            eVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f185b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f189a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = V.a.F(th3);
                            }
                            eVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f185b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f189a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = V.a.F(th4);
                            }
                            eVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f185b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f189a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = V.a.F(th5);
                            }
                            eVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f185b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f189a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = V.a.F(th6);
                            }
                            eVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f185b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = V.a.F(th7);
                            }
                            eVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            tVar2.i(null);
        }
        t tVar3 = new t(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", bVar, d2);
        if (dVar != null) {
            final int i4 = 2;
            tVar3.i(new D0.b(dVar) { // from class: I0.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f185b;

                {
                    this.f185b = dVar;
                }

                @Override // D0.b
                public final void a(Object obj, e eVar) {
                    switch (i4) {
                        case 0:
                            d dVar2 = this.f185b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f189a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = V.a.F(th);
                            }
                            eVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f185b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f189a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = V.a.F(th2);
                            }
                            eVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f185b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f189a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = V.a.F(th3);
                            }
                            eVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f185b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f189a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = V.a.F(th4);
                            }
                            eVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f185b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f189a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = V.a.F(th5);
                            }
                            eVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f185b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f189a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = V.a.F(th6);
                            }
                            eVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f185b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = V.a.F(th7);
                            }
                            eVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            tVar3.i(null);
        }
        t tVar4 = new t(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", bVar, d2);
        if (dVar != null) {
            final int i5 = 3;
            tVar4.i(new D0.b(dVar) { // from class: I0.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f185b;

                {
                    this.f185b = dVar;
                }

                @Override // D0.b
                public final void a(Object obj, e eVar) {
                    switch (i5) {
                        case 0:
                            d dVar2 = this.f185b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f189a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = V.a.F(th);
                            }
                            eVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f185b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f189a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = V.a.F(th2);
                            }
                            eVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f185b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f189a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = V.a.F(th3);
                            }
                            eVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f185b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f189a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = V.a.F(th4);
                            }
                            eVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f185b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f189a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = V.a.F(th5);
                            }
                            eVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f185b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f189a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = V.a.F(th6);
                            }
                            eVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f185b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = V.a.F(th7);
                            }
                            eVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            tVar4.i(null);
        }
        t tVar5 = new t(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", bVar, d2);
        if (dVar != null) {
            final int i6 = 4;
            tVar5.i(new D0.b(dVar) { // from class: I0.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f185b;

                {
                    this.f185b = dVar;
                }

                @Override // D0.b
                public final void a(Object obj, e eVar) {
                    switch (i6) {
                        case 0:
                            d dVar2 = this.f185b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f189a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = V.a.F(th);
                            }
                            eVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f185b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f189a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = V.a.F(th2);
                            }
                            eVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f185b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f189a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = V.a.F(th3);
                            }
                            eVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f185b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f189a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = V.a.F(th4);
                            }
                            eVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f185b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f189a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = V.a.F(th5);
                            }
                            eVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f185b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f189a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = V.a.F(th6);
                            }
                            eVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f185b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = V.a.F(th7);
                            }
                            eVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            tVar5.i(null);
        }
        t tVar6 = new t(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", bVar, d2);
        if (dVar != null) {
            final int i7 = 5;
            tVar6.i(new D0.b(dVar) { // from class: I0.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f185b;

                {
                    this.f185b = dVar;
                }

                @Override // D0.b
                public final void a(Object obj, e eVar) {
                    switch (i7) {
                        case 0:
                            d dVar2 = this.f185b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f189a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = V.a.F(th);
                            }
                            eVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f185b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f189a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = V.a.F(th2);
                            }
                            eVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f185b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f189a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = V.a.F(th3);
                            }
                            eVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f185b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f189a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = V.a.F(th4);
                            }
                            eVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f185b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f189a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = V.a.F(th5);
                            }
                            eVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f185b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f189a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = V.a.F(th6);
                            }
                            eVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f185b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = V.a.F(th7);
                            }
                            eVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            tVar6.i(null);
        }
        t tVar7 = new t(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", bVar, d2);
        if (dVar == null) {
            tVar7.i(null);
        } else {
            final int i8 = 6;
            tVar7.i(new D0.b(dVar) { // from class: I0.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f185b;

                {
                    this.f185b = dVar;
                }

                @Override // D0.b
                public final void a(Object obj, e eVar) {
                    switch (i8) {
                        case 0:
                            d dVar2 = this.f185b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f189a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = V.a.F(th);
                            }
                            eVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f185b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f189a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = V.a.F(th2);
                            }
                            eVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f185b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f189a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = V.a.F(th3);
                            }
                            eVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f185b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f189a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = V.a.F(th4);
                            }
                            eVar.e(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f185b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f189a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = V.a.F(th5);
                            }
                            eVar.e(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f185b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f189a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = V.a.F(th6);
                            }
                            eVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f185b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = V.a.F(th7);
                            }
                            eVar.e(arrayList8);
                            break;
                    }
                }
            });
        }
    }

    public final ArrayList a(c cVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f189a;
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

    @Override // z0.InterfaceC0866b
    public final void onAttachedToEngine(C0865a c0865a) {
        try {
            b(c0865a.f6801b, this);
        } catch (Exception e2) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e2);
        }
        this.f189a = c0865a.f6800a;
    }

    @Override // z0.InterfaceC0866b
    public final void onDetachedFromEngine(C0865a c0865a) {
        b(c0865a.f6801b, null);
    }
}
