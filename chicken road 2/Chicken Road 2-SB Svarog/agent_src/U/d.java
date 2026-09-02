package U;

import C.e;
import P.f;
import P.h;
import a.AbstractC0018a;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d implements M.a {

    /* renamed from: a, reason: collision with root package name */
    public Context f386a;

    public static void d(f fVar, final d dVar) {
        fVar.getClass();
        C.b c2 = fVar.c(new h());
        b bVar = b.f383d;
        e eVar = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", bVar, c2);
        if (dVar != null) {
            final int i2 = 0;
            eVar.h(new P.b(dVar) { // from class: U.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f382c;

                {
                    this.f382c = dVar;
                }

                @Override // P.b
                public final void e(Object obj, C.a aVar) {
                    switch (i2) {
                        case 0:
                            d dVar2 = this.f382c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f386a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0018a.G(th);
                            }
                            aVar.m(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f382c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f386a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0018a.G(th2);
                            }
                            aVar.m(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f382c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f386a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0018a.G(th3);
                            }
                            aVar.m(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f382c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f386a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0018a.G(th4);
                            }
                            aVar.m(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f382c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f386a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0018a.G(th5);
                            }
                            aVar.m(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f382c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f386a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0018a.G(th6);
                            }
                            aVar.m(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f382c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0018a.G(th7);
                            }
                            aVar.m(arrayList8);
                            break;
                    }
                }
            });
        } else {
            eVar.h(null);
        }
        e eVar2 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", bVar, c2);
        if (dVar != null) {
            final int i3 = 1;
            eVar2.h(new P.b(dVar) { // from class: U.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f382c;

                {
                    this.f382c = dVar;
                }

                @Override // P.b
                public final void e(Object obj, C.a aVar) {
                    switch (i3) {
                        case 0:
                            d dVar2 = this.f382c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f386a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0018a.G(th);
                            }
                            aVar.m(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f382c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f386a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0018a.G(th2);
                            }
                            aVar.m(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f382c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f386a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0018a.G(th3);
                            }
                            aVar.m(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f382c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f386a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0018a.G(th4);
                            }
                            aVar.m(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f382c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f386a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0018a.G(th5);
                            }
                            aVar.m(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f382c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f386a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0018a.G(th6);
                            }
                            aVar.m(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f382c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0018a.G(th7);
                            }
                            aVar.m(arrayList8);
                            break;
                    }
                }
            });
        } else {
            eVar2.h(null);
        }
        e eVar3 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", bVar, c2);
        if (dVar != null) {
            final int i4 = 2;
            eVar3.h(new P.b(dVar) { // from class: U.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f382c;

                {
                    this.f382c = dVar;
                }

                @Override // P.b
                public final void e(Object obj, C.a aVar) {
                    switch (i4) {
                        case 0:
                            d dVar2 = this.f382c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f386a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0018a.G(th);
                            }
                            aVar.m(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f382c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f386a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0018a.G(th2);
                            }
                            aVar.m(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f382c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f386a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0018a.G(th3);
                            }
                            aVar.m(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f382c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f386a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0018a.G(th4);
                            }
                            aVar.m(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f382c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f386a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0018a.G(th5);
                            }
                            aVar.m(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f382c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f386a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0018a.G(th6);
                            }
                            aVar.m(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f382c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0018a.G(th7);
                            }
                            aVar.m(arrayList8);
                            break;
                    }
                }
            });
        } else {
            eVar3.h(null);
        }
        e eVar4 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", bVar, c2);
        if (dVar != null) {
            final int i5 = 3;
            eVar4.h(new P.b(dVar) { // from class: U.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f382c;

                {
                    this.f382c = dVar;
                }

                @Override // P.b
                public final void e(Object obj, C.a aVar) {
                    switch (i5) {
                        case 0:
                            d dVar2 = this.f382c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f386a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0018a.G(th);
                            }
                            aVar.m(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f382c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f386a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0018a.G(th2);
                            }
                            aVar.m(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f382c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f386a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0018a.G(th3);
                            }
                            aVar.m(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f382c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f386a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0018a.G(th4);
                            }
                            aVar.m(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f382c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f386a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0018a.G(th5);
                            }
                            aVar.m(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f382c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f386a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0018a.G(th6);
                            }
                            aVar.m(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f382c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0018a.G(th7);
                            }
                            aVar.m(arrayList8);
                            break;
                    }
                }
            });
        } else {
            eVar4.h(null);
        }
        e eVar5 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", bVar, c2);
        if (dVar != null) {
            final int i6 = 4;
            eVar5.h(new P.b(dVar) { // from class: U.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f382c;

                {
                    this.f382c = dVar;
                }

                @Override // P.b
                public final void e(Object obj, C.a aVar) {
                    switch (i6) {
                        case 0:
                            d dVar2 = this.f382c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f386a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0018a.G(th);
                            }
                            aVar.m(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f382c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f386a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0018a.G(th2);
                            }
                            aVar.m(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f382c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f386a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0018a.G(th3);
                            }
                            aVar.m(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f382c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f386a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0018a.G(th4);
                            }
                            aVar.m(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f382c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f386a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0018a.G(th5);
                            }
                            aVar.m(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f382c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f386a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0018a.G(th6);
                            }
                            aVar.m(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f382c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0018a.G(th7);
                            }
                            aVar.m(arrayList8);
                            break;
                    }
                }
            });
        } else {
            eVar5.h(null);
        }
        e eVar6 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", bVar, c2);
        if (dVar != null) {
            final int i7 = 5;
            eVar6.h(new P.b(dVar) { // from class: U.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f382c;

                {
                    this.f382c = dVar;
                }

                @Override // P.b
                public final void e(Object obj, C.a aVar) {
                    switch (i7) {
                        case 0:
                            d dVar2 = this.f382c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f386a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0018a.G(th);
                            }
                            aVar.m(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f382c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f386a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0018a.G(th2);
                            }
                            aVar.m(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f382c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f386a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0018a.G(th3);
                            }
                            aVar.m(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f382c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f386a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0018a.G(th4);
                            }
                            aVar.m(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f382c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f386a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0018a.G(th5);
                            }
                            aVar.m(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f382c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f386a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0018a.G(th6);
                            }
                            aVar.m(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f382c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0018a.G(th7);
                            }
                            aVar.m(arrayList8);
                            break;
                    }
                }
            });
        } else {
            eVar6.h(null);
        }
        e eVar7 = new e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", bVar, c2);
        if (dVar == null) {
            eVar7.h(null);
        } else {
            final int i8 = 6;
            eVar7.h(new P.b(dVar) { // from class: U.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f382c;

                {
                    this.f382c = dVar;
                }

                @Override // P.b
                public final void e(Object obj, C.a aVar) {
                    switch (i8) {
                        case 0:
                            d dVar2 = this.f382c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f386a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0018a.G(th);
                            }
                            aVar.m(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f382c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f386a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0018a.G(th2);
                            }
                            aVar.m(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f382c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f386a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0018a.G(th3);
                            }
                            aVar.m(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f382c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f386a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0018a.G(th4);
                            }
                            aVar.m(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f382c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f386a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0018a.G(th5);
                            }
                            aVar.m(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f382c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f386a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0018a.G(th6);
                            }
                            aVar.m(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f382c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.c((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0018a.G(th7);
                            }
                            aVar.m(arrayList8);
                            break;
                    }
                }
            });
        }
    }

    @Override // M.a
    public final void a(C.a aVar) {
        f fVar = (f) aVar.f5d;
        Context context = (Context) aVar.f4c;
        try {
            d(fVar, this);
        } catch (Exception e2) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e2);
        }
        this.f386a = context;
    }

    @Override // M.a
    public final void b(C.a aVar) {
        d((f) aVar.f5d, null);
    }

    public final ArrayList c(c cVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f386a;
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
}
