package P5;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class L implements p159w5.c, InterfaceC0395g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f5627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.support.v4.media.session.t f5628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M4.e f5629c = new M4.e();

    public static final Object a(L l7, String str, String str2, p077k6.i iVar) {
        l7.getClass();
        p030e0.e eVar = new p030e0.e(str);
        Context context = l7.f5627a;
        if (context != null) {
            Object objA = M.a(context).a(new p030e0.i(new C0399k(eVar, str2, null), null), iVar);
            return objA == j6.a.f14648a ? objA : p044f6.i.f13014a;
        }
        t6.h.h("context");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ca -> B:36:0x00cd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(P5.L r11, java.util.List r12, p077k6.c r13) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.L.b(P5.L, java.util.List, k6.c):java.lang.Object");
    }

    @Override // P5.InterfaceC0395g
    public final void A(String str, double d7, C0396h c0396h) throws Throwable {
        D6.E.t(new G(str, this, d7, null));
    }

    @Override // P5.InterfaceC0395g
    public final void B(String str, String str2, C0396h c0396h) throws Throwable {
        D6.E.t(new H(this, str, str2, null));
    }

    @Override // P5.InterfaceC0395g
    public final Long D(String str, C0396h c0396h) throws Throwable {
        t6.p pVar = new t6.p();
        D6.E.t(new u(str, this, pVar, null));
        return (Long) pVar.f16478a;
    }

    @Override // P5.InterfaceC0395g
    public final ArrayList H(String str, C0396h c0396h) throws Throwable {
        List list;
        String strK = K(str, c0396h);
        ArrayList arrayList = null;
        if (strK != null && !C6.o.B0(strK, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && C6.o.B0(strK, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) M.c(strK, this.f5629c)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // P5.InterfaceC0395g
    public final String K(String str, C0396h c0396h) throws Throwable {
        t6.p pVar = new t6.p();
        D6.E.t(new y(str, this, pVar, null));
        return (String) pVar.f16478a;
    }

    @Override // P5.InterfaceC0395g
    public final P L(String str, C0396h c0396h) throws Throwable {
        String strK = K(str, c0396h);
        if (strK == null) {
            return null;
        }
        if (C6.o.B0(strK, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new P(strK, N.JSON_ENCODED);
        }
        return C6.o.B0(strK, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new P(null, N.PLATFORM_ENCODED) : new P(null, N.UNEXPECTED_STRING);
    }

    @Override // P5.InterfaceC0395g
    public final Map M(List list, C0396h c0396h) {
        return (Map) D6.E.t(new C0400l(this, list, null));
    }

    @Override // P5.InterfaceC0395g
    public final void O(String str, List list, C0396h c0396h) throws Throwable {
        D6.E.t(new E(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f5629c.q(list)), null));
    }

    @Override // P5.InterfaceC0395g
    public final void f(String str, long j, C0396h c0396h) throws Throwable {
        D6.E.t(new J(str, this, j, null));
    }

    @Override // P5.InterfaceC0395g
    public final void h(List list, C0396h c0396h) throws Throwable {
        D6.E.t(new C0398j(this, list, null));
    }

    @Override // P5.InterfaceC0395g
    public final void j(String str, String str2, C0396h c0396h) throws Throwable {
        D6.E.t(new K(this, str, str2, null));
    }

    @Override // P5.InterfaceC0395g
    public final Boolean m(String str, C0396h c0396h) throws Throwable {
        t6.p pVar = new t6.p();
        D6.E.t(new C0404p(str, this, pVar, null));
        return (Boolean) pVar.f16478a;
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        t6.h.e(bVar, "binding");
        A5.f fVar = bVar.f18083c;
        t6.h.d(fVar, "getBinaryMessenger(...)");
        Context context = bVar.f18081a;
        t6.h.d(context, "getApplicationContext(...)");
        this.f5627a = context;
        try {
            InterfaceC0395g.f5651i.getClass();
            C0394f.b(fVar, this, "data_store");
            this.f5628b = new android.support.v4.media.session.t(fVar, context, this.f5629c);
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e7);
        }
        new C0389a().onAttachedToEngine(bVar);
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        t6.h.e(bVar, "binding");
        A5.f fVar = bVar.f18083c;
        t6.h.d(fVar, "getBinaryMessenger(...)");
        InterfaceC0395g.f5651i.getClass();
        C0394f.b(fVar, null, "data_store");
        android.support.v4.media.session.t tVar = this.f5628b;
        if (tVar != null) {
            C0394f.b((A5.f) tVar.f8076b, null, "shared_preferences");
        }
        this.f5628b = null;
    }

    @Override // P5.InterfaceC0395g
    public final void t(String str, boolean z4, C0396h c0396h) throws Throwable {
        D6.E.t(new D(str, this, z4, null));
    }

    @Override // P5.InterfaceC0395g
    public final Double v(String str, C0396h c0396h) throws Throwable {
        t6.p pVar = new t6.p();
        D6.E.t(new r(str, this, pVar, null));
        return (Double) pVar.f16478a;
    }

    @Override // P5.InterfaceC0395g
    public final List y(List list, C0396h c0396h) {
        return p050g6.h.a1(((Map) D6.E.t(new v(this, list, null))).keySet());
    }
}
