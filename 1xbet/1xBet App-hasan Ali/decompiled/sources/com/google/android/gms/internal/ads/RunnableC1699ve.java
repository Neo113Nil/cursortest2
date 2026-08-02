package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import f2.C1949g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import n2.C2185a;
import p2.C2256n;
import q2.C2298a;
import q2.C2307j;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.ve, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1699ve implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16010k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f16011l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f16012m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f16013n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f16014o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f16015p;

    public /* synthetic */ RunnableC1699ve(C1071hd c1071hd, Throwable th, C1041gs c1041gs, String str, A0.J0 j02) {
        this.f16010k = 1;
        this.f16012m = c1071hd;
        this.f16013n = th;
        this.f16014o = c1041gs;
        this.f16011l = str;
        this.f16015p = j02;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c5;
        String str;
        switch (this.f16010k) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheCanceled");
                hashMap.put("src", (String) this.f16011l);
                String str2 = (String) this.f16012m;
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("cachedSrc", str2);
                }
                String str3 = (String) this.f16013n;
                switch (str3.hashCode()) {
                    case -1947652542:
                        if (str3.equals("interrupted")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1396664534:
                        if (str3.equals("badUrl")) {
                            c5 = '\b';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1347010958:
                        if (str3.equals("inProgress")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -918817863:
                        if (str3.equals("downloadTimeout")) {
                            c5 = '\t';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -659376217:
                        if (str3.equals("contentLengthMissing")) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -642208130:
                        if (str3.equals("playerFailed")) {
                            c5 = 5;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -354048396:
                        if (str3.equals("sizeExceeded")) {
                            c5 = 11;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -32082395:
                        if (str3.equals("externalAbort")) {
                            c5 = '\n';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 3387234:
                        if (str3.equals("noop")) {
                            c5 = 4;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 96784904:
                        if (str3.equals("error")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 580119100:
                        if (str3.equals("expireFailed")) {
                            c5 = 6;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 725497484:
                        if (str3.equals("noCacheDir")) {
                            c5 = 7;
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                switch (c5) {
                    case 6:
                    case 7:
                        str = "io";
                        break;
                    case '\b':
                    case '\t':
                        str = "network";
                        break;
                    case '\n':
                    case 11:
                        str = "policy";
                        break;
                    default:
                        str = "internal";
                        break;
                }
                hashMap.put("type", str);
                hashMap.put("reason", str3);
                String str4 = (String) this.f16014o;
                if (!TextUtils.isEmpty(str4)) {
                    hashMap.put("message", str4);
                }
                AbstractC1744we.j((AbstractC1744we) this.f16015p, hashMap);
                return;
            case 1:
                boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.S9)).booleanValue();
                C1071hd c1071hd = (C1071hd) this.f16012m;
                Throwable th = (Throwable) this.f16013n;
                if (booleanValue) {
                    C1074hg c1074hg = (C1074hg) c1071hd.f13764o;
                    c1074hg.i = C0802bc.e(c1074hg.f13770a);
                    ((C1074hg) c1071hd.f13764o).i.b("AttributionReporting.registerSourceAndPingClickUrl", th);
                } else {
                    C1074hg c1074hg2 = (C1074hg) c1071hd.f13764o;
                    c1074hg2.f13776h = C0802bc.a(c1074hg2.f13770a);
                    ((C1074hg) c1071hd.f13764o).f13776h.b("AttributionReportingSampled.registerSourceAndPingClickUrl", th);
                }
                ((C1041gs) this.f16014o).b((String) this.f16011l, (A0.J0) this.f16015p, null);
                return;
            case 2:
                String str5 = (String) this.f16011l;
                Jl jl = (Jl) this.f16013n;
                C0950er c0950er = (C0950er) this.f16014o;
                ArrayList arrayList = (ArrayList) this.f16015p;
                Kl kl = (Kl) this.f16012m;
                kl.getClass();
                try {
                    try {
                        if (Objects.equals(str5, "com.google.ads.mediation.admob.AdMobAdapter")) {
                            jl.c();
                            return;
                        }
                        Context context = (Context) kl.f10233g.get();
                        if (context == null) {
                            context = kl.f;
                        }
                        try {
                            c0950er.f13363a.g3(new BinderC2361b(context), jl, arrayList);
                            return;
                        } catch (Throwable th2) {
                            throw new Yq(th2);
                        }
                    } catch (RemoteException e3) {
                        U2.j.g("", e3);
                        return;
                    }
                } catch (RemoteException e5) {
                    throw new D2.e(e5);
                } catch (Yq unused) {
                    jl.u3("Failed to initialize adapter. " + str5 + " does not implement the initialize() method.");
                    return;
                }
            default:
                try {
                    if (!(((C2307j) this.f16011l).f18881k instanceof C2298a)) {
                        String uuid = ((UUID) this.f16012m).toString();
                        int e6 = ((C2256n) this.f16015p).f18726c.e(uuid);
                        if (e6 == 0 || AbstractC0467k.f(e6)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((C2256n) this.f16015p).f18725b.g(uuid, (C1949g) this.f16013n);
                        ((Context) this.f16014o).startService(C2185a.b((Context) this.f16014o, uuid, (C1949g) this.f16013n));
                    }
                    ((C2307j) this.f16011l).j(null);
                    return;
                } catch (Throwable th3) {
                    ((C2307j) this.f16011l).k(th3);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC1699ve(Kl kl, String str, Jl jl, C0950er c0950er, ArrayList arrayList) {
        this.f16010k = 2;
        this.f16012m = kl;
        this.f16011l = str;
        this.f16013n = jl;
        this.f16014o = c0950er;
        this.f16015p = arrayList;
    }

    public /* synthetic */ RunnableC1699ve(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f16010k = i;
        this.f16011l = obj2;
        this.f16012m = obj3;
        this.f16013n = obj4;
        this.f16014o = obj5;
        this.f16015p = obj;
    }
}
