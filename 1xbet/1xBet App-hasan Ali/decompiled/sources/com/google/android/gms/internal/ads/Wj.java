package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public final class Wj {

    /* renamed from: a, reason: collision with root package name */
    public final Wk f12064a;

    /* renamed from: b, reason: collision with root package name */
    public final Kk f12065b;

    /* renamed from: c, reason: collision with root package name */
    public final C1746wg f12066c;

    /* renamed from: d, reason: collision with root package name */
    public final C1524rj f12067d;

    public Wj(Wk wk, Kk kk, C1746wg c1746wg, C1524rj c1524rj) {
        this.f12064a = wk;
        this.f12065b = kk;
        this.f12066c = c1746wg;
        this.f12067d = c1524rj;
    }

    public final View a() {
        InterfaceC0677Re a5 = this.f12064a.a(Q2.a1.b(), null, null);
        a5.K().setVisibility(8);
        final int i = 0;
        a5.s0("/sendMessageToSdk", new InterfaceC1821y9(this) { // from class: com.google.android.gms.internal.ads.Vj

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Wj f11912l;

            {
                this.f11912l = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
            public final void b(Object obj, Map map) {
                switch (i) {
                    case 0:
                        this.f11912l.f12065b.b(map);
                        break;
                    case 1:
                        this.f11912l.f12067d.z();
                        break;
                    case 2:
                        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                        interfaceC0677Re.I().f13619q = new C1390oj(19, this.f11912l, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC0677Re.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC0677Re.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 3:
                        Wj wj = this.f11912l;
                        wj.getClass();
                        U2.j.h("Showing native ads overlay.");
                        ((InterfaceC0677Re) obj).K().setVisibility(0);
                        wj.f12066c.f16132p = true;
                        break;
                    default:
                        Wj wj2 = this.f11912l;
                        wj2.getClass();
                        U2.j.h("Hiding native ads overlay.");
                        ((InterfaceC0677Re) obj).K().setVisibility(8);
                        wj2.f12066c.f16132p = false;
                        break;
                }
            }
        });
        final int i5 = 1;
        a5.s0("/adMuted", new InterfaceC1821y9(this) { // from class: com.google.android.gms.internal.ads.Vj

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Wj f11912l;

            {
                this.f11912l = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
            public final void b(Object obj, Map map) {
                switch (i5) {
                    case 0:
                        this.f11912l.f12065b.b(map);
                        break;
                    case 1:
                        this.f11912l.f12067d.z();
                        break;
                    case 2:
                        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                        interfaceC0677Re.I().f13619q = new C1390oj(19, this.f11912l, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC0677Re.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC0677Re.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 3:
                        Wj wj = this.f11912l;
                        wj.getClass();
                        U2.j.h("Showing native ads overlay.");
                        ((InterfaceC0677Re) obj).K().setVisibility(0);
                        wj.f12066c.f16132p = true;
                        break;
                    default:
                        Wj wj2 = this.f11912l;
                        wj2.getClass();
                        U2.j.h("Hiding native ads overlay.");
                        ((InterfaceC0677Re) obj).K().setVisibility(8);
                        wj2.f12066c.f16132p = false;
                        break;
                }
            }
        });
        WeakReference weakReference = new WeakReference(a5);
        final int i6 = 2;
        InterfaceC1821y9 interfaceC1821y9 = new InterfaceC1821y9(this) { // from class: com.google.android.gms.internal.ads.Vj

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Wj f11912l;

            {
                this.f11912l = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
            public final void b(Object obj, Map map) {
                switch (i6) {
                    case 0:
                        this.f11912l.f12065b.b(map);
                        break;
                    case 1:
                        this.f11912l.f12067d.z();
                        break;
                    case 2:
                        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                        interfaceC0677Re.I().f13619q = new C1390oj(19, this.f11912l, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC0677Re.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC0677Re.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 3:
                        Wj wj = this.f11912l;
                        wj.getClass();
                        U2.j.h("Showing native ads overlay.");
                        ((InterfaceC0677Re) obj).K().setVisibility(0);
                        wj.f12066c.f16132p = true;
                        break;
                    default:
                        Wj wj2 = this.f11912l;
                        wj2.getClass();
                        U2.j.h("Hiding native ads overlay.");
                        ((InterfaceC0677Re) obj).K().setVisibility(8);
                        wj2.f12066c.f16132p = false;
                        break;
                }
            }
        };
        Kk kk = this.f12065b;
        kk.c("/loadHtml", new Jk(kk, weakReference, "/loadHtml", interfaceC1821y9));
        final int i7 = 3;
        kk.c("/showOverlay", new Jk(kk, new WeakReference(a5), "/showOverlay", new InterfaceC1821y9(this) { // from class: com.google.android.gms.internal.ads.Vj

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Wj f11912l;

            {
                this.f11912l = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
            public final void b(Object obj, Map map) {
                switch (i7) {
                    case 0:
                        this.f11912l.f12065b.b(map);
                        break;
                    case 1:
                        this.f11912l.f12067d.z();
                        break;
                    case 2:
                        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                        interfaceC0677Re.I().f13619q = new C1390oj(19, this.f11912l, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC0677Re.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC0677Re.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 3:
                        Wj wj = this.f11912l;
                        wj.getClass();
                        U2.j.h("Showing native ads overlay.");
                        ((InterfaceC0677Re) obj).K().setVisibility(0);
                        wj.f12066c.f16132p = true;
                        break;
                    default:
                        Wj wj2 = this.f11912l;
                        wj2.getClass();
                        U2.j.h("Hiding native ads overlay.");
                        ((InterfaceC0677Re) obj).K().setVisibility(8);
                        wj2.f12066c.f16132p = false;
                        break;
                }
            }
        }));
        final int i8 = 4;
        kk.c("/hideOverlay", new Jk(kk, new WeakReference(a5), "/hideOverlay", new InterfaceC1821y9(this) { // from class: com.google.android.gms.internal.ads.Vj

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Wj f11912l;

            {
                this.f11912l = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
            public final void b(Object obj, Map map) {
                switch (i8) {
                    case 0:
                        this.f11912l.f12065b.b(map);
                        break;
                    case 1:
                        this.f11912l.f12067d.z();
                        break;
                    case 2:
                        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                        interfaceC0677Re.I().f13619q = new C1390oj(19, this.f11912l, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC0677Re.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC0677Re.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 3:
                        Wj wj = this.f11912l;
                        wj.getClass();
                        U2.j.h("Showing native ads overlay.");
                        ((InterfaceC0677Re) obj).K().setVisibility(0);
                        wj.f12066c.f16132p = true;
                        break;
                    default:
                        Wj wj2 = this.f11912l;
                        wj2.getClass();
                        U2.j.h("Hiding native ads overlay.");
                        ((InterfaceC0677Re) obj).K().setVisibility(8);
                        wj2.f12066c.f16132p = false;
                        break;
                }
            }
        }));
        return a5.K();
    }
}
