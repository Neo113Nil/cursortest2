package a2;

import Y1.C0077a;
import android.content.SharedPreferences;
import android.util.Log;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0105a implements P1.b {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f1830a;

    /* renamed from: b, reason: collision with root package name */
    public final C0077a f1831b = new C0077a(5);

    public static void d(T1.f fVar, final C0105a c0105a) {
        P0.j j3 = fVar.j(new T1.j());
        C0106b c0106b = C0106b.f1832b;
        D0.a aVar = new D0.a(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", (T1.k) c0106b, j3);
        if (c0105a != null) {
            final int i3 = 0;
            aVar.g(new T1.b(c0105a) { // from class: a2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0105a f1835b;

                {
                    this.f1835b = c0105a;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    switch (i3) {
                        case 0:
                            C0105a c0105a2 = this.f1835b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0105a2.f1830a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = F2.b.K(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            C0105a c0105a3 = this.f1835b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0105a3.f1830a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = F2.b.K(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            C0105a c0105a4 = this.f1835b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0105a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = F2.b.K(th3);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 3:
                            C0105a c0105a5 = this.f1835b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0105a5.f1830a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = F2.b.K(th4);
                            }
                            eVar.l(arrayList6);
                            break;
                        case 4:
                            C0105a c0105a6 = this.f1835b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0105a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0105a6.f1830a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = F2.b.K(th5);
                            }
                            eVar.l(arrayList8);
                            break;
                        case 5:
                            C0105a c0105a7 = this.f1835b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0105a7.f1830a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = F2.b.K(th6);
                            }
                            eVar.l(arrayList10);
                            break;
                        case 6:
                            C0105a c0105a8 = this.f1835b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0105a8.f1830a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0105a8.f1831b.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = F2.b.K(th7);
                            }
                            eVar.l(arrayList12);
                            break;
                        case 7:
                            C0105a c0105a9 = this.f1835b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0105a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = F2.b.K(th8);
                            }
                            eVar.l(arrayList14);
                            break;
                        default:
                            C0105a c0105a10 = this.f1835b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0105a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = F2.b.K(th9);
                            }
                            eVar.l(arrayList16);
                            break;
                    }
                }
            });
        } else {
            aVar.g(null);
        }
        D0.a aVar2 = new D0.a(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", (T1.k) c0106b, j3);
        if (c0105a != null) {
            final int i4 = 1;
            aVar2.g(new T1.b(c0105a) { // from class: a2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0105a f1835b;

                {
                    this.f1835b = c0105a;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    switch (i4) {
                        case 0:
                            C0105a c0105a2 = this.f1835b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0105a2.f1830a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = F2.b.K(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            C0105a c0105a3 = this.f1835b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0105a3.f1830a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = F2.b.K(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            C0105a c0105a4 = this.f1835b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0105a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = F2.b.K(th3);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 3:
                            C0105a c0105a5 = this.f1835b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0105a5.f1830a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = F2.b.K(th4);
                            }
                            eVar.l(arrayList6);
                            break;
                        case 4:
                            C0105a c0105a6 = this.f1835b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0105a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0105a6.f1830a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = F2.b.K(th5);
                            }
                            eVar.l(arrayList8);
                            break;
                        case 5:
                            C0105a c0105a7 = this.f1835b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0105a7.f1830a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = F2.b.K(th6);
                            }
                            eVar.l(arrayList10);
                            break;
                        case 6:
                            C0105a c0105a8 = this.f1835b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0105a8.f1830a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0105a8.f1831b.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = F2.b.K(th7);
                            }
                            eVar.l(arrayList12);
                            break;
                        case 7:
                            C0105a c0105a9 = this.f1835b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0105a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = F2.b.K(th8);
                            }
                            eVar.l(arrayList14);
                            break;
                        default:
                            C0105a c0105a10 = this.f1835b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0105a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = F2.b.K(th9);
                            }
                            eVar.l(arrayList16);
                            break;
                    }
                }
            });
        } else {
            aVar2.g(null);
        }
        D0.a aVar3 = new D0.a(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", (T1.k) c0106b, j3);
        if (c0105a != null) {
            final int i5 = 2;
            aVar3.g(new T1.b(c0105a) { // from class: a2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0105a f1835b;

                {
                    this.f1835b = c0105a;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    switch (i5) {
                        case 0:
                            C0105a c0105a2 = this.f1835b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0105a2.f1830a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = F2.b.K(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            C0105a c0105a3 = this.f1835b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0105a3.f1830a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = F2.b.K(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            C0105a c0105a4 = this.f1835b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0105a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = F2.b.K(th3);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 3:
                            C0105a c0105a5 = this.f1835b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0105a5.f1830a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = F2.b.K(th4);
                            }
                            eVar.l(arrayList6);
                            break;
                        case 4:
                            C0105a c0105a6 = this.f1835b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0105a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0105a6.f1830a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = F2.b.K(th5);
                            }
                            eVar.l(arrayList8);
                            break;
                        case 5:
                            C0105a c0105a7 = this.f1835b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0105a7.f1830a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = F2.b.K(th6);
                            }
                            eVar.l(arrayList10);
                            break;
                        case 6:
                            C0105a c0105a8 = this.f1835b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0105a8.f1830a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0105a8.f1831b.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = F2.b.K(th7);
                            }
                            eVar.l(arrayList12);
                            break;
                        case 7:
                            C0105a c0105a9 = this.f1835b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0105a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = F2.b.K(th8);
                            }
                            eVar.l(arrayList14);
                            break;
                        default:
                            C0105a c0105a10 = this.f1835b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0105a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = F2.b.K(th9);
                            }
                            eVar.l(arrayList16);
                            break;
                    }
                }
            });
        } else {
            aVar3.g(null);
        }
        D0.a aVar4 = new D0.a(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", (T1.k) c0106b, j3);
        if (c0105a != null) {
            final int i6 = 3;
            aVar4.g(new T1.b(c0105a) { // from class: a2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0105a f1835b;

                {
                    this.f1835b = c0105a;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    switch (i6) {
                        case 0:
                            C0105a c0105a2 = this.f1835b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0105a2.f1830a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = F2.b.K(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            C0105a c0105a3 = this.f1835b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0105a3.f1830a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = F2.b.K(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            C0105a c0105a4 = this.f1835b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0105a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = F2.b.K(th3);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 3:
                            C0105a c0105a5 = this.f1835b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0105a5.f1830a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = F2.b.K(th4);
                            }
                            eVar.l(arrayList6);
                            break;
                        case 4:
                            C0105a c0105a6 = this.f1835b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0105a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0105a6.f1830a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = F2.b.K(th5);
                            }
                            eVar.l(arrayList8);
                            break;
                        case 5:
                            C0105a c0105a7 = this.f1835b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0105a7.f1830a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = F2.b.K(th6);
                            }
                            eVar.l(arrayList10);
                            break;
                        case 6:
                            C0105a c0105a8 = this.f1835b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0105a8.f1830a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0105a8.f1831b.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = F2.b.K(th7);
                            }
                            eVar.l(arrayList12);
                            break;
                        case 7:
                            C0105a c0105a9 = this.f1835b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0105a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = F2.b.K(th8);
                            }
                            eVar.l(arrayList14);
                            break;
                        default:
                            C0105a c0105a10 = this.f1835b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0105a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = F2.b.K(th9);
                            }
                            eVar.l(arrayList16);
                            break;
                    }
                }
            });
        } else {
            aVar4.g(null);
        }
        D0.a aVar5 = new D0.a(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", (T1.k) c0106b, j3);
        if (c0105a != null) {
            final int i7 = 4;
            aVar5.g(new T1.b(c0105a) { // from class: a2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0105a f1835b;

                {
                    this.f1835b = c0105a;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    switch (i7) {
                        case 0:
                            C0105a c0105a2 = this.f1835b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0105a2.f1830a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = F2.b.K(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            C0105a c0105a3 = this.f1835b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0105a3.f1830a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = F2.b.K(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            C0105a c0105a4 = this.f1835b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0105a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = F2.b.K(th3);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 3:
                            C0105a c0105a5 = this.f1835b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0105a5.f1830a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = F2.b.K(th4);
                            }
                            eVar.l(arrayList6);
                            break;
                        case 4:
                            C0105a c0105a6 = this.f1835b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0105a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0105a6.f1830a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = F2.b.K(th5);
                            }
                            eVar.l(arrayList8);
                            break;
                        case 5:
                            C0105a c0105a7 = this.f1835b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0105a7.f1830a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = F2.b.K(th6);
                            }
                            eVar.l(arrayList10);
                            break;
                        case 6:
                            C0105a c0105a8 = this.f1835b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0105a8.f1830a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0105a8.f1831b.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = F2.b.K(th7);
                            }
                            eVar.l(arrayList12);
                            break;
                        case 7:
                            C0105a c0105a9 = this.f1835b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0105a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = F2.b.K(th8);
                            }
                            eVar.l(arrayList14);
                            break;
                        default:
                            C0105a c0105a10 = this.f1835b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0105a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = F2.b.K(th9);
                            }
                            eVar.l(arrayList16);
                            break;
                    }
                }
            });
        } else {
            aVar5.g(null);
        }
        D0.a aVar6 = new D0.a(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", (T1.k) c0106b, j3);
        if (c0105a != null) {
            final int i8 = 5;
            aVar6.g(new T1.b(c0105a) { // from class: a2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0105a f1835b;

                {
                    this.f1835b = c0105a;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    switch (i8) {
                        case 0:
                            C0105a c0105a2 = this.f1835b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0105a2.f1830a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = F2.b.K(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            C0105a c0105a3 = this.f1835b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0105a3.f1830a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = F2.b.K(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            C0105a c0105a4 = this.f1835b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0105a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = F2.b.K(th3);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 3:
                            C0105a c0105a5 = this.f1835b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0105a5.f1830a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = F2.b.K(th4);
                            }
                            eVar.l(arrayList6);
                            break;
                        case 4:
                            C0105a c0105a6 = this.f1835b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0105a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0105a6.f1830a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = F2.b.K(th5);
                            }
                            eVar.l(arrayList8);
                            break;
                        case 5:
                            C0105a c0105a7 = this.f1835b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0105a7.f1830a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = F2.b.K(th6);
                            }
                            eVar.l(arrayList10);
                            break;
                        case 6:
                            C0105a c0105a8 = this.f1835b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0105a8.f1830a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0105a8.f1831b.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = F2.b.K(th7);
                            }
                            eVar.l(arrayList12);
                            break;
                        case 7:
                            C0105a c0105a9 = this.f1835b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0105a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = F2.b.K(th8);
                            }
                            eVar.l(arrayList14);
                            break;
                        default:
                            C0105a c0105a10 = this.f1835b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0105a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = F2.b.K(th9);
                            }
                            eVar.l(arrayList16);
                            break;
                    }
                }
            });
        } else {
            aVar6.g(null);
        }
        D0.a aVar7 = new D0.a(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", (T1.k) c0106b, j3);
        if (c0105a != null) {
            final int i9 = 6;
            aVar7.g(new T1.b(c0105a) { // from class: a2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0105a f1835b;

                {
                    this.f1835b = c0105a;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    switch (i9) {
                        case 0:
                            C0105a c0105a2 = this.f1835b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0105a2.f1830a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = F2.b.K(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            C0105a c0105a3 = this.f1835b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0105a3.f1830a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = F2.b.K(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            C0105a c0105a4 = this.f1835b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0105a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = F2.b.K(th3);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 3:
                            C0105a c0105a5 = this.f1835b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0105a5.f1830a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = F2.b.K(th4);
                            }
                            eVar.l(arrayList6);
                            break;
                        case 4:
                            C0105a c0105a6 = this.f1835b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0105a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0105a6.f1830a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = F2.b.K(th5);
                            }
                            eVar.l(arrayList8);
                            break;
                        case 5:
                            C0105a c0105a7 = this.f1835b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0105a7.f1830a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = F2.b.K(th6);
                            }
                            eVar.l(arrayList10);
                            break;
                        case 6:
                            C0105a c0105a8 = this.f1835b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0105a8.f1830a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0105a8.f1831b.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = F2.b.K(th7);
                            }
                            eVar.l(arrayList12);
                            break;
                        case 7:
                            C0105a c0105a9 = this.f1835b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0105a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = F2.b.K(th8);
                            }
                            eVar.l(arrayList14);
                            break;
                        default:
                            C0105a c0105a10 = this.f1835b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0105a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = F2.b.K(th9);
                            }
                            eVar.l(arrayList16);
                            break;
                    }
                }
            });
        } else {
            aVar7.g(null);
        }
        D0.a aVar8 = new D0.a(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", (T1.k) c0106b, j3);
        if (c0105a != null) {
            final int i10 = 7;
            aVar8.g(new T1.b(c0105a) { // from class: a2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0105a f1835b;

                {
                    this.f1835b = c0105a;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    switch (i10) {
                        case 0:
                            C0105a c0105a2 = this.f1835b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0105a2.f1830a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = F2.b.K(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            C0105a c0105a3 = this.f1835b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0105a3.f1830a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = F2.b.K(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            C0105a c0105a4 = this.f1835b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0105a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = F2.b.K(th3);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 3:
                            C0105a c0105a5 = this.f1835b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0105a5.f1830a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = F2.b.K(th4);
                            }
                            eVar.l(arrayList6);
                            break;
                        case 4:
                            C0105a c0105a6 = this.f1835b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0105a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0105a6.f1830a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = F2.b.K(th5);
                            }
                            eVar.l(arrayList8);
                            break;
                        case 5:
                            C0105a c0105a7 = this.f1835b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0105a7.f1830a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = F2.b.K(th6);
                            }
                            eVar.l(arrayList10);
                            break;
                        case 6:
                            C0105a c0105a8 = this.f1835b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0105a8.f1830a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0105a8.f1831b.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = F2.b.K(th7);
                            }
                            eVar.l(arrayList12);
                            break;
                        case 7:
                            C0105a c0105a9 = this.f1835b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0105a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = F2.b.K(th8);
                            }
                            eVar.l(arrayList14);
                            break;
                        default:
                            C0105a c0105a10 = this.f1835b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0105a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = F2.b.K(th9);
                            }
                            eVar.l(arrayList16);
                            break;
                    }
                }
            });
        } else {
            aVar8.g(null);
        }
        D0.a aVar9 = new D0.a(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", (T1.k) c0106b, j3);
        if (c0105a == null) {
            aVar9.g(null);
        } else {
            final int i11 = 8;
            aVar9.g(new T1.b(c0105a) { // from class: a2.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0105a f1835b;

                {
                    this.f1835b = c0105a;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    switch (i11) {
                        case 0:
                            C0105a c0105a2 = this.f1835b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0105a2.f1830a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = F2.b.K(th);
                            }
                            eVar.l(arrayList);
                            break;
                        case 1:
                            C0105a c0105a3 = this.f1835b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0105a3.f1830a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = F2.b.K(th2);
                            }
                            eVar.l(arrayList2);
                            break;
                        case 2:
                            C0105a c0105a4 = this.f1835b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0105a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = F2.b.K(th3);
                            }
                            eVar.l(arrayList4);
                            break;
                        case 3:
                            C0105a c0105a5 = this.f1835b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0105a5.f1830a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = F2.b.K(th4);
                            }
                            eVar.l(arrayList6);
                            break;
                        case 4:
                            C0105a c0105a6 = this.f1835b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0105a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0105a6.f1830a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = F2.b.K(th5);
                            }
                            eVar.l(arrayList8);
                            break;
                        case 5:
                            C0105a c0105a7 = this.f1835b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0105a7.f1830a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = F2.b.K(th6);
                            }
                            eVar.l(arrayList10);
                            break;
                        case 6:
                            C0105a c0105a8 = this.f1835b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0105a8.f1830a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0105a8.f1831b.f(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = F2.b.K(th7);
                            }
                            eVar.l(arrayList12);
                            break;
                        case 7:
                            C0105a c0105a9 = this.f1835b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0105a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = F2.b.K(th8);
                            }
                            eVar.l(arrayList14);
                            break;
                        default:
                            C0105a c0105a10 = this.f1835b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0105a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = F2.b.K(th9);
                            }
                            eVar.l(arrayList16);
                            break;
                    }
                }
            });
        }
    }

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor edit = this.f1830a.edit();
        Map<String, ?> all = this.f1830a.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    public final HashMap b(String str, List list) {
        Object obj;
        Set hashSet = list == null ? null : new HashSet(list);
        Map<String, ?> all = this.f1830a.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj2 = all.get(str2);
                Objects.requireNonNull(obj2);
                boolean z3 = obj2 instanceof String;
                C0077a c0077a = this.f1831b;
                if (z3) {
                    String str3 = (String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            obj2 = c0077a.e(str3.substring(40));
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str3.substring(44), 36);
                        obj2 = obj;
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str3.substring(40));
                    }
                    hashMap.put(str2, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        this.f1830a.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0077a.f(arrayList)).apply();
                        obj = arrayList;
                        obj2 = obj;
                    }
                    hashMap.put(str2, obj2);
                }
            }
        }
        return hashMap;
    }

    public final Boolean c(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f1830a.edit().putString(str, str2).commit());
    }

    @Override // P1.b
    public final void onAttachedToEngine(P1.a aVar) {
        T1.f fVar = aVar.f1153b;
        this.f1830a = aVar.f1152a.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            d(fVar, this);
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e3);
        }
    }

    @Override // P1.b
    public final void onDetachedFromEngine(P1.a aVar) {
        d(aVar.f1153b, null);
    }
}
