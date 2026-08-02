package P5;

import B4.V;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import w1.F0;
import w1.V0;
import w5.C1782b;
import w5.InterfaceC1783c;

/* renamed from: P5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0389a implements InterfaceC1783c {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f5640a;

    /* renamed from: b, reason: collision with root package name */
    public final V f5641b = new V(8);

    public static void d(A5.f fVar, final C0389a c0389a) {
        V e7 = fVar.e();
        C0390b c0390b = C0390b.f5642e;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", c0390b, e7, 1);
        if (c0389a != null) {
            final int i7 = 0;
            f02.M(new A5.b(c0389a) { // from class: P5.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0389a f5645b;

                {
                    this.f5645b = c0389a;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i7) {
                        case 0:
                            C0389a c0389a2 = this.f5645b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0389a2.f5640a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Y4.D.i0(th);
                            }
                            v02.f(arrayList);
                            break;
                        case 1:
                            C0389a c0389a3 = this.f5645b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0389a3.f5640a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Y4.D.i0(th2);
                            }
                            v02.f(arrayList2);
                            break;
                        case 2:
                            C0389a c0389a4 = this.f5645b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0389a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Y4.D.i0(th3);
                            }
                            v02.f(arrayList4);
                            break;
                        case 3:
                            C0389a c0389a5 = this.f5645b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0389a5.f5640a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Y4.D.i0(th4);
                            }
                            v02.f(arrayList6);
                            break;
                        case 4:
                            C0389a c0389a6 = this.f5645b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0389a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0389a6.f5640a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Y4.D.i0(th5);
                            }
                            v02.f(arrayList8);
                            break;
                        case 5:
                            C0389a c0389a7 = this.f5645b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0389a7.f5640a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Y4.D.i0(th6);
                            }
                            v02.f(arrayList10);
                            break;
                        case 6:
                            C0389a c0389a8 = this.f5645b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0389a8.f5640a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0389a8.f5641b.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Y4.D.i0(th7);
                            }
                            v02.f(arrayList12);
                            break;
                        case 7:
                            C0389a c0389a9 = this.f5645b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0389a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Y4.D.i0(th8);
                            }
                            v02.f(arrayList14);
                            break;
                        default:
                            C0389a c0389a10 = this.f5645b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0389a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Y4.D.i0(th9);
                            }
                            v02.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", c0390b, e7, 1);
        if (c0389a != null) {
            final int i8 = 1;
            f03.M(new A5.b(c0389a) { // from class: P5.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0389a f5645b;

                {
                    this.f5645b = c0389a;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i8) {
                        case 0:
                            C0389a c0389a2 = this.f5645b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0389a2.f5640a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Y4.D.i0(th);
                            }
                            v02.f(arrayList);
                            break;
                        case 1:
                            C0389a c0389a3 = this.f5645b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0389a3.f5640a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Y4.D.i0(th2);
                            }
                            v02.f(arrayList2);
                            break;
                        case 2:
                            C0389a c0389a4 = this.f5645b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0389a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Y4.D.i0(th3);
                            }
                            v02.f(arrayList4);
                            break;
                        case 3:
                            C0389a c0389a5 = this.f5645b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0389a5.f5640a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Y4.D.i0(th4);
                            }
                            v02.f(arrayList6);
                            break;
                        case 4:
                            C0389a c0389a6 = this.f5645b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0389a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0389a6.f5640a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Y4.D.i0(th5);
                            }
                            v02.f(arrayList8);
                            break;
                        case 5:
                            C0389a c0389a7 = this.f5645b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0389a7.f5640a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Y4.D.i0(th6);
                            }
                            v02.f(arrayList10);
                            break;
                        case 6:
                            C0389a c0389a8 = this.f5645b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0389a8.f5640a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0389a8.f5641b.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Y4.D.i0(th7);
                            }
                            v02.f(arrayList12);
                            break;
                        case 7:
                            C0389a c0389a9 = this.f5645b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0389a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Y4.D.i0(th8);
                            }
                            v02.f(arrayList14);
                            break;
                        default:
                            C0389a c0389a10 = this.f5645b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0389a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Y4.D.i0(th9);
                            }
                            v02.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", c0390b, e7, 1);
        if (c0389a != null) {
            final int i9 = 2;
            f04.M(new A5.b(c0389a) { // from class: P5.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0389a f5645b;

                {
                    this.f5645b = c0389a;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i9) {
                        case 0:
                            C0389a c0389a2 = this.f5645b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0389a2.f5640a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Y4.D.i0(th);
                            }
                            v02.f(arrayList);
                            break;
                        case 1:
                            C0389a c0389a3 = this.f5645b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0389a3.f5640a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Y4.D.i0(th2);
                            }
                            v02.f(arrayList2);
                            break;
                        case 2:
                            C0389a c0389a4 = this.f5645b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0389a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Y4.D.i0(th3);
                            }
                            v02.f(arrayList4);
                            break;
                        case 3:
                            C0389a c0389a5 = this.f5645b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0389a5.f5640a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Y4.D.i0(th4);
                            }
                            v02.f(arrayList6);
                            break;
                        case 4:
                            C0389a c0389a6 = this.f5645b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0389a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0389a6.f5640a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Y4.D.i0(th5);
                            }
                            v02.f(arrayList8);
                            break;
                        case 5:
                            C0389a c0389a7 = this.f5645b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0389a7.f5640a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Y4.D.i0(th6);
                            }
                            v02.f(arrayList10);
                            break;
                        case 6:
                            C0389a c0389a8 = this.f5645b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0389a8.f5640a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0389a8.f5641b.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Y4.D.i0(th7);
                            }
                            v02.f(arrayList12);
                            break;
                        case 7:
                            C0389a c0389a9 = this.f5645b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0389a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Y4.D.i0(th8);
                            }
                            v02.f(arrayList14);
                            break;
                        default:
                            C0389a c0389a10 = this.f5645b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0389a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Y4.D.i0(th9);
                            }
                            v02.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            f04.M(null);
        }
        F0 f05 = new F0(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", c0390b, e7, 1);
        if (c0389a != null) {
            final int i10 = 3;
            f05.M(new A5.b(c0389a) { // from class: P5.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0389a f5645b;

                {
                    this.f5645b = c0389a;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i10) {
                        case 0:
                            C0389a c0389a2 = this.f5645b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0389a2.f5640a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Y4.D.i0(th);
                            }
                            v02.f(arrayList);
                            break;
                        case 1:
                            C0389a c0389a3 = this.f5645b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0389a3.f5640a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Y4.D.i0(th2);
                            }
                            v02.f(arrayList2);
                            break;
                        case 2:
                            C0389a c0389a4 = this.f5645b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0389a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Y4.D.i0(th3);
                            }
                            v02.f(arrayList4);
                            break;
                        case 3:
                            C0389a c0389a5 = this.f5645b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0389a5.f5640a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Y4.D.i0(th4);
                            }
                            v02.f(arrayList6);
                            break;
                        case 4:
                            C0389a c0389a6 = this.f5645b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0389a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0389a6.f5640a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Y4.D.i0(th5);
                            }
                            v02.f(arrayList8);
                            break;
                        case 5:
                            C0389a c0389a7 = this.f5645b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0389a7.f5640a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Y4.D.i0(th6);
                            }
                            v02.f(arrayList10);
                            break;
                        case 6:
                            C0389a c0389a8 = this.f5645b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0389a8.f5640a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0389a8.f5641b.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Y4.D.i0(th7);
                            }
                            v02.f(arrayList12);
                            break;
                        case 7:
                            C0389a c0389a9 = this.f5645b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0389a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Y4.D.i0(th8);
                            }
                            v02.f(arrayList14);
                            break;
                        default:
                            C0389a c0389a10 = this.f5645b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0389a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Y4.D.i0(th9);
                            }
                            v02.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            f05.M(null);
        }
        F0 f06 = new F0(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", c0390b, e7, 1);
        if (c0389a != null) {
            final int i11 = 4;
            f06.M(new A5.b(c0389a) { // from class: P5.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0389a f5645b;

                {
                    this.f5645b = c0389a;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i11) {
                        case 0:
                            C0389a c0389a2 = this.f5645b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0389a2.f5640a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Y4.D.i0(th);
                            }
                            v02.f(arrayList);
                            break;
                        case 1:
                            C0389a c0389a3 = this.f5645b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0389a3.f5640a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Y4.D.i0(th2);
                            }
                            v02.f(arrayList2);
                            break;
                        case 2:
                            C0389a c0389a4 = this.f5645b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0389a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Y4.D.i0(th3);
                            }
                            v02.f(arrayList4);
                            break;
                        case 3:
                            C0389a c0389a5 = this.f5645b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0389a5.f5640a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Y4.D.i0(th4);
                            }
                            v02.f(arrayList6);
                            break;
                        case 4:
                            C0389a c0389a6 = this.f5645b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0389a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0389a6.f5640a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Y4.D.i0(th5);
                            }
                            v02.f(arrayList8);
                            break;
                        case 5:
                            C0389a c0389a7 = this.f5645b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0389a7.f5640a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Y4.D.i0(th6);
                            }
                            v02.f(arrayList10);
                            break;
                        case 6:
                            C0389a c0389a8 = this.f5645b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0389a8.f5640a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0389a8.f5641b.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Y4.D.i0(th7);
                            }
                            v02.f(arrayList12);
                            break;
                        case 7:
                            C0389a c0389a9 = this.f5645b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0389a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Y4.D.i0(th8);
                            }
                            v02.f(arrayList14);
                            break;
                        default:
                            C0389a c0389a10 = this.f5645b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0389a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Y4.D.i0(th9);
                            }
                            v02.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            f06.M(null);
        }
        F0 f07 = new F0(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", c0390b, e7, 1);
        if (c0389a != null) {
            final int i12 = 5;
            f07.M(new A5.b(c0389a) { // from class: P5.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0389a f5645b;

                {
                    this.f5645b = c0389a;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i12) {
                        case 0:
                            C0389a c0389a2 = this.f5645b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0389a2.f5640a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Y4.D.i0(th);
                            }
                            v02.f(arrayList);
                            break;
                        case 1:
                            C0389a c0389a3 = this.f5645b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0389a3.f5640a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Y4.D.i0(th2);
                            }
                            v02.f(arrayList2);
                            break;
                        case 2:
                            C0389a c0389a4 = this.f5645b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0389a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Y4.D.i0(th3);
                            }
                            v02.f(arrayList4);
                            break;
                        case 3:
                            C0389a c0389a5 = this.f5645b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0389a5.f5640a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Y4.D.i0(th4);
                            }
                            v02.f(arrayList6);
                            break;
                        case 4:
                            C0389a c0389a6 = this.f5645b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0389a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0389a6.f5640a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Y4.D.i0(th5);
                            }
                            v02.f(arrayList8);
                            break;
                        case 5:
                            C0389a c0389a7 = this.f5645b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0389a7.f5640a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Y4.D.i0(th6);
                            }
                            v02.f(arrayList10);
                            break;
                        case 6:
                            C0389a c0389a8 = this.f5645b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0389a8.f5640a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0389a8.f5641b.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Y4.D.i0(th7);
                            }
                            v02.f(arrayList12);
                            break;
                        case 7:
                            C0389a c0389a9 = this.f5645b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0389a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Y4.D.i0(th8);
                            }
                            v02.f(arrayList14);
                            break;
                        default:
                            C0389a c0389a10 = this.f5645b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0389a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Y4.D.i0(th9);
                            }
                            v02.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            f07.M(null);
        }
        F0 f08 = new F0(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", c0390b, e7, 1);
        if (c0389a != null) {
            final int i13 = 6;
            f08.M(new A5.b(c0389a) { // from class: P5.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0389a f5645b;

                {
                    this.f5645b = c0389a;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i13) {
                        case 0:
                            C0389a c0389a2 = this.f5645b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0389a2.f5640a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Y4.D.i0(th);
                            }
                            v02.f(arrayList);
                            break;
                        case 1:
                            C0389a c0389a3 = this.f5645b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0389a3.f5640a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Y4.D.i0(th2);
                            }
                            v02.f(arrayList2);
                            break;
                        case 2:
                            C0389a c0389a4 = this.f5645b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0389a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Y4.D.i0(th3);
                            }
                            v02.f(arrayList4);
                            break;
                        case 3:
                            C0389a c0389a5 = this.f5645b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0389a5.f5640a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Y4.D.i0(th4);
                            }
                            v02.f(arrayList6);
                            break;
                        case 4:
                            C0389a c0389a6 = this.f5645b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0389a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0389a6.f5640a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Y4.D.i0(th5);
                            }
                            v02.f(arrayList8);
                            break;
                        case 5:
                            C0389a c0389a7 = this.f5645b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0389a7.f5640a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Y4.D.i0(th6);
                            }
                            v02.f(arrayList10);
                            break;
                        case 6:
                            C0389a c0389a8 = this.f5645b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0389a8.f5640a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0389a8.f5641b.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Y4.D.i0(th7);
                            }
                            v02.f(arrayList12);
                            break;
                        case 7:
                            C0389a c0389a9 = this.f5645b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0389a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Y4.D.i0(th8);
                            }
                            v02.f(arrayList14);
                            break;
                        default:
                            C0389a c0389a10 = this.f5645b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0389a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Y4.D.i0(th9);
                            }
                            v02.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            f08.M(null);
        }
        F0 f09 = new F0(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", c0390b, e7, 1);
        if (c0389a != null) {
            final int i14 = 7;
            f09.M(new A5.b(c0389a) { // from class: P5.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0389a f5645b;

                {
                    this.f5645b = c0389a;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i14) {
                        case 0:
                            C0389a c0389a2 = this.f5645b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0389a2.f5640a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Y4.D.i0(th);
                            }
                            v02.f(arrayList);
                            break;
                        case 1:
                            C0389a c0389a3 = this.f5645b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0389a3.f5640a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Y4.D.i0(th2);
                            }
                            v02.f(arrayList2);
                            break;
                        case 2:
                            C0389a c0389a4 = this.f5645b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0389a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Y4.D.i0(th3);
                            }
                            v02.f(arrayList4);
                            break;
                        case 3:
                            C0389a c0389a5 = this.f5645b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0389a5.f5640a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Y4.D.i0(th4);
                            }
                            v02.f(arrayList6);
                            break;
                        case 4:
                            C0389a c0389a6 = this.f5645b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0389a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0389a6.f5640a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Y4.D.i0(th5);
                            }
                            v02.f(arrayList8);
                            break;
                        case 5:
                            C0389a c0389a7 = this.f5645b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0389a7.f5640a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Y4.D.i0(th6);
                            }
                            v02.f(arrayList10);
                            break;
                        case 6:
                            C0389a c0389a8 = this.f5645b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0389a8.f5640a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0389a8.f5641b.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Y4.D.i0(th7);
                            }
                            v02.f(arrayList12);
                            break;
                        case 7:
                            C0389a c0389a9 = this.f5645b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0389a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Y4.D.i0(th8);
                            }
                            v02.f(arrayList14);
                            break;
                        default:
                            C0389a c0389a10 = this.f5645b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0389a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Y4.D.i0(th9);
                            }
                            v02.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            f09.M(null);
        }
        F0 f010 = new F0(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", c0390b, e7, 1);
        if (c0389a == null) {
            f010.M(null);
        } else {
            final int i15 = 8;
            f010.M(new A5.b(c0389a) { // from class: P5.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0389a f5645b;

                {
                    this.f5645b = c0389a;
                }

                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    switch (i15) {
                        case 0:
                            C0389a c0389a2 = this.f5645b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0389a2.f5640a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Y4.D.i0(th);
                            }
                            v02.f(arrayList);
                            break;
                        case 1:
                            C0389a c0389a3 = this.f5645b;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0389a3.f5640a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Y4.D.i0(th2);
                            }
                            v02.f(arrayList2);
                            break;
                        case 2:
                            C0389a c0389a4 = this.f5645b;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0389a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Y4.D.i0(th3);
                            }
                            v02.f(arrayList4);
                            break;
                        case 3:
                            C0389a c0389a5 = this.f5645b;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0389a5.f5640a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Y4.D.i0(th4);
                            }
                            v02.f(arrayList6);
                            break;
                        case 4:
                            C0389a c0389a6 = this.f5645b;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d7 = (Double) arrayList9.get(1);
                            try {
                                c0389a6.getClass();
                                String d8 = Double.toString(d7.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0389a6.f5640a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Y4.D.i0(th5);
                            }
                            v02.f(arrayList8);
                            break;
                        case 5:
                            C0389a c0389a7 = this.f5645b;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0389a7.f5640a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Y4.D.i0(th6);
                            }
                            v02.f(arrayList10);
                            break;
                        case 6:
                            C0389a c0389a8 = this.f5645b;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0389a8.f5640a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0389a8.f5641b.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Y4.D.i0(th7);
                            }
                            v02.f(arrayList12);
                            break;
                        case 7:
                            C0389a c0389a9 = this.f5645b;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0389a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Y4.D.i0(th8);
                            }
                            v02.f(arrayList14);
                            break;
                        default:
                            C0389a c0389a10 = this.f5645b;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0389a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Y4.D.i0(th9);
                            }
                            v02.f(arrayList16);
                            break;
                    }
                }
            });
        }
    }

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor edit = this.f5640a.edit();
        Map<String, ?> all = this.f5640a.getAll();
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
        Map<String, ?> all = this.f5640a.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj2 = all.get(str2);
                Objects.requireNonNull(obj2);
                boolean z4 = obj2 instanceof String;
                V v6 = this.f5641b;
                if (z4) {
                    String str3 = (String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            String substring = str3.substring(40);
                            v6.getClass();
                            try {
                                obj2 = (List) new O(new ByteArrayInputStream(Base64.decode(substring, 0))).readObject();
                            } catch (IOException | ClassNotFoundException e7) {
                                throw new RuntimeException(e7);
                            }
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
                        this.f5640a.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + v6.s(arrayList)).apply();
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
        return Boolean.valueOf(this.f5640a.edit().putString(str, str2).commit());
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        A5.f fVar = c1782b.f18077c;
        this.f5640a = c1782b.f18075a.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            d(fVar, this);
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e7);
        }
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        d(c1782b.f18077c, null);
    }
}
