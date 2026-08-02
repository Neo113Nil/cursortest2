package bm0;

import Bb.i;
import Sc.r;
import Sc.s;
import We.A;
import We.E;
import We.G;
import We.InterfaceC4865g;
import We.J;
import We.L;
import androidx.recyclerview.widget.LinearLayoutManager;
import cm0.C5842a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import xe.C10720e0;
import xe.C10727i;
import yb.C10878a;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final E f56121a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f56122b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Za.c f56123c;

    public h(@NotNull E okHttpClient, @NotNull String projectId, @NotNull Za.c hostInfoProvider) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(hostInfoProvider, "hostInfoProvider");
        this.f56121a = okHttpClient;
        this.f56122b = projectId;
        this.f56123c = hostInfoProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002b, B:13:0x00cd, B:15:0x00d5, B:18:0x00e9, B:20:0x00ef, B:22:0x010f, B:27:0x003d, B:28:0x00b1, B:33:0x00a5), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002b, B:13:0x00cd, B:15:0x00d5, B:18:0x00e9, B:20:0x00ef, B:22:0x010f, B:27:0x003d, B:28:0x00b1, B:33:0x00a5), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C5688f c5688f;
        Wc.a aVar;
        int i11;
        h hVar;
        Object f7;
        h hVar2;
        L l11;
        String str2;
        try {
            if (cVar instanceof C5688f) {
                c5688f = (C5688f) cVar;
                int i12 = c5688f.f56119h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c5688f.f56119h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c5688f.f56117f;
                    aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c5688f.f56119h;
                    if (i11 != 0) {
                        s.b(obj);
                        String jSONObject = new JSONObject().put("auth_token", str).putOpt("client_id", null).putOpt("client_id_type", null).toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n           …)\n            .toString()");
                        J a11 = Bb.h.a(jSONObject);
                        A.a aVar2 = new A.a();
                        Za.c cVar2 = this.f56123c;
                        aVar2.s(cVar2.a());
                        aVar2.j(cVar2.b());
                        aVar2.c("v1/projects");
                        aVar2.b(this.f56122b);
                        aVar2.b("token:new");
                        A e11 = aVar2.e();
                        G.a aVar3 = new G.a();
                        aVar3.j(e11);
                        aVar3.g(a11);
                        InterfaceC4865g a12 = this.f56121a.a(aVar3.b());
                        c5688f.f56115d = this;
                        c5688f.f56119h = 1;
                        obj = Bb.c.a(a12, c5688f);
                        if (obj == aVar) {
                            return aVar;
                        }
                        hVar = this;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            l11 = c5688f.f56116e;
                            hVar2 = c5688f.f56115d;
                            s.b(obj);
                            str2 = (String) obj;
                            if (!i.a(str2)) {
                                yb.b bVar = new yb.b(i.b(str2).toString());
                                r.Companion companion = r.INSTANCE;
                                return s.a(bVar);
                            }
                            if (!l11.v()) {
                                C10878a c10878a = new C10878a(l11.w(), l11.m());
                                r.Companion companion2 = r.INSTANCE;
                                return s.a(c10878a);
                            }
                            hVar2.getClass();
                            String value = new JSONObject(str2).getString("token");
                            Intrinsics.checkNotNullExpressionValue(value, "pushToken");
                            Intrinsics.checkNotNullParameter(value, "value");
                            C5842a c5842a = new C5842a(value);
                            r.Companion companion3 = r.INSTANCE;
                            return c5842a;
                        }
                        hVar = c5688f.f56115d;
                        s.b(obj);
                    }
                    L l12 = (L) obj;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    He.b bVar2 = He.b.f10879b;
                    g gVar = new g(l12, null);
                    c5688f.f56115d = hVar;
                    c5688f.f56116e = l12;
                    c5688f.f56119h = 2;
                    f7 = C10727i.f(bVar2, gVar, c5688f);
                    if (f7 != aVar) {
                        hVar2 = hVar;
                        l11 = l12;
                        obj = f7;
                        str2 = (String) obj;
                        if (!i.a(str2)) {
                        }
                    }
                    return aVar;
                }
            }
            if (i11 != 0) {
            }
            L l122 = (L) obj;
            C10720e0 c10720e02 = C10720e0.f105451a;
            He.b bVar22 = He.b.f10879b;
            g gVar2 = new g(l122, null);
            c5688f.f56115d = hVar;
            c5688f.f56116e = l122;
            c5688f.f56119h = 2;
            f7 = C10727i.f(bVar22, gVar2, c5688f);
            if (f7 != aVar) {
            }
            return aVar;
        } catch (Exception e12) {
            r.Companion companion4 = r.INSTANCE;
            return s.a(e12);
        }
        c5688f = new C5688f(this, cVar);
        Object obj2 = c5688f.f56117f;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5688f.f56119h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        if (r8 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C5686d c5686d;
        int i11;
        L l11;
        try {
            if (cVar instanceof C5686d) {
                c5686d = (C5686d) cVar;
                int i12 = c5686d.f56113g;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c5686d.f56113g = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c5686d.f56111e;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c5686d.f56113g;
                    if (i11 != 0) {
                        s.b(obj);
                        String jSONObject = new JSONObject().put("token", str).toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n           …)\n            .toString()");
                        J a11 = Bb.h.a(jSONObject);
                        A.a aVar2 = new A.a();
                        Za.c cVar2 = this.f56123c;
                        aVar2.s(cVar2.a());
                        aVar2.j(cVar2.b());
                        aVar2.c("v1/projects");
                        aVar2.b(this.f56122b);
                        aVar2.b("token:invalidate");
                        A e11 = aVar2.e();
                        G.a aVar3 = new G.a();
                        aVar3.j(e11);
                        aVar3.g(a11);
                        InterfaceC4865g a12 = this.f56121a.a(aVar3.b());
                        c5686d.f56113g = 1;
                        obj = Bb.c.a(a12, c5686d);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            l11 = c5686d.f56110d;
                            s.b(obj);
                            String str2 = (String) obj;
                            if (i.a(str2)) {
                                yb.b bVar = new yb.b(i.b(str2).toString());
                                r.Companion companion = r.INSTANCE;
                                return s.a(bVar);
                            }
                            if (l11.v()) {
                                Unit unit = Unit.f71690a;
                                r.Companion companion2 = r.INSTANCE;
                                return unit;
                            }
                            C10878a c10878a = new C10878a(l11.w(), l11.m());
                            r.Companion companion3 = r.INSTANCE;
                            return s.a(c10878a);
                        }
                        s.b(obj);
                    }
                    l11 = (L) obj;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    He.b bVar2 = He.b.f10879b;
                    C5687e c5687e = new C5687e(l11, null);
                    c5686d.f56110d = l11;
                    c5686d.f56113g = 2;
                    obj = C10727i.f(bVar2, c5687e, c5686d);
                }
            }
            if (i11 != 0) {
            }
            l11 = (L) obj;
            C10720e0 c10720e02 = C10720e0.f105451a;
            He.b bVar22 = He.b.f10879b;
            C5687e c5687e2 = new C5687e(l11, null);
            c5686d.f56110d = l11;
            c5686d.f56113g = 2;
            obj = C10727i.f(bVar22, c5687e2, c5686d);
        } catch (Exception e12) {
            r.Companion companion4 = r.INSTANCE;
            return s.a(e12);
        }
        c5686d = new C5686d(this, cVar);
        Object obj2 = c5686d.f56111e;
        Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5686d.f56113g;
    }
}
