package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1383oc implements InterfaceC1311mu {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14807b;

    public /* synthetic */ C1383oc(int i, Object obj) {
        this.f14806a = i;
        this.f14807b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
    public final Object apply(Object obj) {
        boolean z3;
        String str;
        int i;
        int i5;
        String str2;
        float f;
        int i6;
        DisplayMetrics displayMetrics;
        int i7 = 0;
        int i8 = -1;
        boolean z5 = true;
        String str3 = null;
        Object obj2 = this.f14807b;
        switch (this.f14806a) {
            case 0:
                int i9 = 1;
                JSONObject jSONObject = (JSONObject) obj;
                C0375o c0375o = (C0375o) obj2;
                c0375o.getClass();
                A7 a7 = F7.f8796a;
                Q2.r rVar = Q2.r.f5053d;
                C1543s1 c1543s1 = rVar.f5055b;
                SharedPreferences o5 = C1543s1.o((Context) c0375o.f5043m);
                if (o5 != null) {
                    SharedPreferences.Editor edit = o5.edit();
                    ArrayList arrayList = (ArrayList) rVar.f5054a.f13186l;
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        A7 a72 = (A7) obj3;
                        int i10 = i9;
                        if (a72.f7534a == i10) {
                            Object a5 = a72.a(jSONObject);
                            switch (a72.f7538e) {
                                case 0:
                                    edit.putBoolean(a72.f7535b, ((Boolean) a5).booleanValue());
                                    break;
                                case 1:
                                    edit.putInt(a72.f7535b, ((Integer) a5).intValue());
                                    break;
                                case 2:
                                    edit.putLong(a72.f7535b, ((Long) a5).longValue());
                                    break;
                                case 3:
                                    edit.putFloat(a72.f7535b, ((Float) a5).floatValue());
                                    break;
                                default:
                                    edit.putString(a72.f7535b, (String) a5);
                                    break;
                            }
                        }
                        i9 = i10;
                    }
                    if (jSONObject != null) {
                        edit.putString("flag_configuration", jSONObject.toString());
                    } else {
                        U2.j.f("Flag Json is null.");
                    }
                    C1543s1 c1543s12 = Q2.r.f5053d.f5055b;
                    edit.commit();
                    SharedPreferences sharedPreferences = (SharedPreferences) c0375o.f5044n;
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                        P2.o.f4767B.f4776j.getClass();
                        edit2.putLong("js_last_update", System.currentTimeMillis()).apply();
                    }
                }
                return null;
            case 1:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                Kk kk = (Kk) obj2;
                interfaceC0677Re.s0("/result", kk.f10223h);
                C1028gf I5 = interfaceC0677Re.I();
                P2.a aVar = new P2.a(kk.f10219c, null);
                Ek ek = kk.f10217a;
                I5.w(null, ek, ek, ek, ek, false, null, aVar, null, null, kk.i, kk.f10224j, kk.f10220d, null, null, null, null, null, null);
                return interfaceC0677Re;
            case 2:
                return ((C0586Ef) obj2).q0();
            case 3:
                Oo oo = (Oo) obj2;
                Wq wq = (Wq) oo.f10997b;
                Q2.a1 a1Var = wq.f12099e;
                Q2.a1[] a1VarArr = a1Var.f4980q;
                if (a1VarArr == null) {
                    String str4 = a1Var.f4974k;
                    z3 = a1Var.f4982s;
                    str = str4;
                } else {
                    z3 = false;
                    boolean z6 = false;
                    boolean z7 = false;
                    str = null;
                    for (Q2.a1 a1Var2 : a1VarArr) {
                        boolean z8 = a1Var2.f4982s;
                        if (!z8 && !z6) {
                            str = a1Var2.f4974k;
                            z6 = true;
                        }
                        if (z8) {
                            if (z7) {
                                z7 = true;
                            } else {
                                z3 = true;
                                z7 = true;
                            }
                        }
                        if (!z6 || !z7) {
                        }
                    }
                }
                Resources resources = ((Context) oo.f10998c).getResources();
                if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                    i = 0;
                    i5 = 0;
                    str2 = null;
                    f = 0.0f;
                } else {
                    float f5 = displayMetrics.density;
                    int i11 = displayMetrics.widthPixels;
                    int i12 = displayMetrics.heightPixels;
                    str2 = ((C0568Cd) oo.f11000e).d().u();
                    i5 = i12;
                    i = i11;
                    f = f5;
                }
                StringBuilder sb = new StringBuilder();
                Q2.a1[] a1VarArr2 = a1Var.f4980q;
                if (a1VarArr2 != null) {
                    int i13 = 0;
                    boolean z9 = false;
                    while (true) {
                        boolean z10 = z5;
                        if (i13 < a1VarArr2.length) {
                            Q2.a1 a1Var3 = a1VarArr2[i13];
                            if (a1Var3.f4982s) {
                                z9 = z10;
                            } else {
                                if (sb.length() != 0) {
                                    sb.append("|");
                                }
                                int i14 = a1Var3.f4978o;
                                if (i14 == -1) {
                                    i14 = f != 0.0f ? (int) (a1Var3.f4979p / f) : -1;
                                }
                                sb.append(i14);
                                sb.append("x");
                                int i15 = -2;
                                int i16 = a1Var3.f4975l;
                                if (i16 != -2) {
                                    i15 = i16;
                                } else if (f != 0.0f) {
                                    i15 = (int) (a1Var3.f4976m / f);
                                }
                                sb.append(i15);
                            }
                            i13++;
                            z5 = z10;
                        } else if (z9) {
                            if (sb.length() != 0) {
                                i6 = 0;
                                sb.insert(0, "|");
                            } else {
                                i6 = 0;
                            }
                            sb.insert(i6, "320x50");
                        }
                    }
                }
                return new Wo(a1Var, str, z3, sb.toString(), f, i, i5, str2, wq.f12109q);
            case 4:
                ((C0948ep) obj2).f13350a.i("AppSetIdInfoSignal", (Exception) obj);
                return new C0993fp(i8, i7, str3);
            case 5:
                ((C0568Cd) ((Vo) obj2).f11940b).i("AppSetIdInfoGmscoreSignal", (Exception) obj);
                return new C0993fp(i8, 3, str3);
            case 6:
                ((C0568Cd) ((Up) obj2).f11826e).i("TrustlessTokenSignal", (Exception) obj);
                return new To(str3, 5);
            default:
                C1398or c1398or = (C1398or) obj2;
                c1398or.f14866c = (AbstractC0762ah) obj;
                return c1398or;
        }
    }
}
