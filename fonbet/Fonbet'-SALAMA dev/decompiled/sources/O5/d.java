package O5;

import A5.f;
import B4.V;
import Y4.D;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import w1.F0;
import w1.V0;
import w5.C1782b;
import w5.InterfaceC1783c;

/* loaded from: classes2.dex */
public class d implements InterfaceC1783c {

    /* renamed from: a, reason: collision with root package name */
    public Context f5014a;

    public static void b(f fVar, final d dVar) {
        V e7 = fVar.e();
        b bVar = b.f5011d;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", bVar, e7, 1);
        if (dVar != null) {
            final int i7 = 0;
            f02.M(new A5.b(dVar) { // from class: O5.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i7) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v02.f(arrayList);
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
                            v02.f(arrayList2);
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
                            v02.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v02.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v02.f(arrayList5);
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
                            v02.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v02.f(arrayList8);
                            break;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", bVar, fVar.e(), 1);
        if (dVar != null) {
            final int i8 = 1;
            f03.M(new A5.b(dVar) { // from class: O5.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i8) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v02.f(arrayList);
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
                            v02.f(arrayList2);
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
                            v02.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v02.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v02.f(arrayList5);
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
                            v02.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v02.f(arrayList8);
                            break;
                    }
                }
            });
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", bVar, fVar.e(), 1);
        if (dVar != null) {
            final int i9 = 2;
            f04.M(new A5.b(dVar) { // from class: O5.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i9) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v02.f(arrayList);
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
                            v02.f(arrayList2);
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
                            v02.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v02.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v02.f(arrayList5);
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
                            v02.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v02.f(arrayList8);
                            break;
                    }
                }
            });
        } else {
            f04.M(null);
        }
        F0 f05 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", bVar, fVar.e(), 1);
        if (dVar != null) {
            final int i10 = 3;
            f05.M(new A5.b(dVar) { // from class: O5.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i10) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v02.f(arrayList);
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
                            v02.f(arrayList2);
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
                            v02.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v02.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v02.f(arrayList5);
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
                            v02.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v02.f(arrayList8);
                            break;
                    }
                }
            });
        } else {
            f05.M(null);
        }
        F0 f06 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", bVar, fVar.e(), 1);
        if (dVar != null) {
            final int i11 = 4;
            f06.M(new A5.b(dVar) { // from class: O5.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i11) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v02.f(arrayList);
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
                            v02.f(arrayList2);
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
                            v02.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v02.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v02.f(arrayList5);
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
                            v02.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v02.f(arrayList8);
                            break;
                    }
                }
            });
        } else {
            f06.M(null);
        }
        F0 f07 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", bVar, fVar.e(), 1);
        if (dVar != null) {
            final int i12 = 5;
            f07.M(new A5.b(dVar) { // from class: O5.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i12) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v02.f(arrayList);
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
                            v02.f(arrayList2);
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
                            v02.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v02.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v02.f(arrayList5);
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
                            v02.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v02.f(arrayList8);
                            break;
                    }
                }
            });
        } else {
            f07.M(null);
        }
        F0 f08 = new F0(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", bVar, fVar.e(), 1);
        if (dVar == null) {
            f08.M(null);
        } else {
            final int i13 = 6;
            f08.M(new A5.b(dVar) { // from class: O5.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5010b;

                {
                    this.f5010b = dVar;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i13) {
                        case 0:
                            d dVar2 = this.f5010b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5014a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = D.h0(th);
                            }
                            v02.f(arrayList);
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
                            v02.f(arrayList2);
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
                            v02.f(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f5010b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5014a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = D.h0(th4);
                            }
                            v02.f(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f5010b;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar6.f5014a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = D.h0(th5);
                            }
                            v02.f(arrayList5);
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
                            v02.f(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f5010b;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = D.h0(th7);
                            }
                            v02.f(arrayList8);
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

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        try {
            b(c1782b.f18077c, this);
        } catch (Exception e7) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e7);
        }
        this.f5014a = c1782b.f18075a;
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        b(c1782b.f18077c, null);
    }
}
