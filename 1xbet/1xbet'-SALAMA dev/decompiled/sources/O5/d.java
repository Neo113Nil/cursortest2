package O5;

import A5.f;
import B4.V;
import Y4.D;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import p155w1.F0;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public class d implements p159w5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f5014a;

    public static void b(f fVar, final d dVar) {
        V vE = fVar.e();
        b bVar = b.f5011d;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", bVar, vE, 1);
        if (dVar != null) {
            final int i7 = 0;
            f7.M(new A5.b(dVar) { // from class: O5.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    switch (i7) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v6.f(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f5010b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5014a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = D.h0(th2);
                            }
                            v6.f(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f5010b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5014a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = D.h0(th3);
                            }
                            v6.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v6.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v6.f(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f5010b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5014a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = D.h0(th6);
                            }
                            v6.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v6.f(arrayList8);
                            break;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", bVar, fVar.e(), 1);
        if (dVar != null) {
            final int i8 = 1;
            f8.M(new A5.b(dVar) { // from class: O5.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    switch (i8) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v6.f(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f5010b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5014a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = D.h0(th2);
                            }
                            v6.f(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f5010b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5014a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = D.h0(th3);
                            }
                            v6.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v6.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v6.f(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f5010b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5014a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = D.h0(th6);
                            }
                            v6.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v6.f(arrayList8);
                            break;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", bVar, fVar.e(), 1);
        if (dVar != null) {
            final int i9 = 2;
            f9.M(new A5.b(dVar) { // from class: O5.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    switch (i9) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v6.f(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f5010b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5014a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = D.h0(th2);
                            }
                            v6.f(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f5010b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5014a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = D.h0(th3);
                            }
                            v6.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v6.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v6.f(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f5010b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5014a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = D.h0(th6);
                            }
                            v6.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v6.f(arrayList8);
                            break;
                    }
                }
            });
        } else {
            f9.M(null);
        }
        F0 f10 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", bVar, fVar.e(), 1);
        if (dVar != null) {
            final int i10 = 3;
            f10.M(new A5.b(dVar) { // from class: O5.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    switch (i10) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v6.f(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f5010b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5014a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = D.h0(th2);
                            }
                            v6.f(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f5010b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5014a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = D.h0(th3);
                            }
                            v6.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v6.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v6.f(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f5010b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5014a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = D.h0(th6);
                            }
                            v6.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v6.f(arrayList8);
                            break;
                    }
                }
            });
        } else {
            f10.M(null);
        }
        F0 f11 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", bVar, fVar.e(), 1);
        if (dVar != null) {
            final int i11 = 4;
            f11.M(new A5.b(dVar) { // from class: O5.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    switch (i11) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v6.f(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f5010b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5014a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = D.h0(th2);
                            }
                            v6.f(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f5010b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5014a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = D.h0(th3);
                            }
                            v6.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v6.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v6.f(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f5010b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5014a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = D.h0(th6);
                            }
                            v6.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v6.f(arrayList8);
                            break;
                    }
                }
            });
        } else {
            f11.M(null);
        }
        F0 f12 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", bVar, fVar.e(), 1);
        if (dVar != null) {
            final int i12 = 5;
            f12.M(new A5.b(dVar) { // from class: O5.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    switch (i12) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v6.f(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f5010b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5014a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = D.h0(th2);
                            }
                            v6.f(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f5010b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5014a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = D.h0(th3);
                            }
                            v6.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v6.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v6.f(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f5010b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5014a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = D.h0(th6);
                            }
                            v6.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v6.f(arrayList8);
                            break;
                    }
                }
            });
        } else {
            f12.M(null);
        }
        F0 f13 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", bVar, fVar.e(), 1);
        if (dVar == null) {
            f13.M(null);
        } else {
            final int i13 = 6;
            f13.M(new A5.b(dVar) { // from class: O5.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    switch (i13) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v6.f(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f5010b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5014a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = D.h0(th2);
                            }
                            v6.f(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f5010b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5014a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = D.h0(th3);
                            }
                            v6.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v6.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v6.f(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f5010b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5014a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = D.h0(th6);
                            }
                            v6.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v6.f(arrayList8);
                            break;
                    }
                }
            });
        }
    }

    public final ArrayList a(c cVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f5014a;
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

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        try {
            b(bVar.f18083c, this);
        } catch (Exception e7) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e7);
        }
        this.f5014a = bVar.f18081a;
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        b(bVar.f18083c, null);
    }
}
