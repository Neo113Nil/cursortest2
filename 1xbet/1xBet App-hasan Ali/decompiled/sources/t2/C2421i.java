package t2;

import E2.j;
import E2.k;
import E2.o;
import G4.l;
import Q2.C0375o;
import W3.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.L;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import n.C2138i;
import p4.AbstractC2277q;
import p4.AbstractC2282w;
import p4.D;
import p4.U;
import p4.i0;
import u2.C2488c;
import u2.C2497l;
import y2.C2663a;
import y4.n;

/* renamed from: t2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2421i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19564a;

    /* renamed from: b, reason: collision with root package name */
    public final E2.c f19565b;

    /* renamed from: c, reason: collision with root package name */
    public final m f19566c;

    /* renamed from: d, reason: collision with root package name */
    public final H2.i f19567d;

    /* renamed from: e, reason: collision with root package name */
    public final v3.g f19568e;
    public final C2414b f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f19569g;

    public C2421i(Context context, E2.c cVar, m mVar, m mVar2, m mVar3, C2414b c2414b, H2.i iVar) {
        int i = 3;
        int i5 = 4;
        int i6 = 5;
        int i7 = 0;
        this.f19564a = context;
        this.f19565b = cVar;
        this.f19566c = mVar;
        this.f19567d = iVar;
        i0 b3 = AbstractC2282w.b();
        w4.e eVar = D.f18743a;
        AbstractC2282w.a(l.H(b3, u4.m.f20109a.f18897p).m(new C2420h(this)));
        H2.l lVar = new H2.l(this);
        v3.g gVar = new v3.g(this, lVar);
        this.f19568e = gVar;
        C0375o c0375o = new C0375o(c2414b);
        c0375o.g(new B2.a(2), n.class);
        c0375o.g(new B2.a(i6), String.class);
        c0375o.g(new B2.a(1), Uri.class);
        c0375o.g(new B2.a(i5), Uri.class);
        c0375o.g(new B2.a(i), Integer.class);
        c0375o.g(new B2.a(i7), byte[].class);
        A2.c cVar2 = new A2.c();
        ArrayList arrayList = (ArrayList) c0375o.f5044n;
        arrayList.add(new W3.h(cVar2, Uri.class));
        arrayList.add(new W3.h(new A2.a(iVar.f2294a), File.class));
        c0375o.h(new y2.i(mVar3, mVar2, iVar.f2296c), Uri.class);
        c0375o.h(new C2663a(i6), File.class);
        c0375o.h(new C2663a(i7), Uri.class);
        c0375o.h(new C2663a(i), Uri.class);
        c0375o.h(new C2663a(6), Uri.class);
        c0375o.h(new C2663a(i5), Drawable.class);
        c0375o.h(new C2663a(1), Bitmap.class);
        c0375o.h(new C2663a(2), ByteBuffer.class);
        v2.b bVar = new v2.b(iVar.f2297d, iVar.f2298e);
        ArrayList arrayList2 = (ArrayList) c0375o.f5046p;
        arrayList2.add(bVar);
        List L5 = G4.d.L((ArrayList) c0375o.f5042l);
        this.f = new C2414b(L5, G4.d.L((ArrayList) c0375o.f5043m), G4.d.L(arrayList), G4.d.L((ArrayList) c0375o.f5045o), G4.d.L(arrayList2));
        this.f19569g = X3.m.h0(L5, new z2.h(this, lVar, gVar));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|(4:(1:(1:(10:11|12|13|14|15|16|17|(2:19|20)(2:24|(2:26|27)(3:28|29|30))|21|22)(2:51|52))(13:53|54|55|56|57|58|59|60|61|62|63|(7:66|15|16|17|(0)(0)|21|22)|65))(4:77|78|79|80)|34|35|(3:37|38|39)(2:40|41))(6:96|97|98|99|100|(3:102|(3:104|105|106)|108)(3:109|110|111))|81|82|(1:84)|85|(1:87)|88|(9:90|57|58|59|60|61|62|63|(0))|65))|117|6|(0)(0)|81|82|(0)|85|(0)|88|(0)|65|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00b9, code lost:
    
        if (N4.b.i(r14, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0131 A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #5 {all -> 0x0147, blocks: (B:16:0x012b, B:19:0x0131, B:24:0x014a, B:26:0x014e, B:28:0x015f, B:30:0x0164), top: B:15:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014a A[Catch: all -> 0x0147, TRY_ENTER, TryCatch #5 {all -> 0x0147, blocks: (B:16:0x012b, B:19:0x0131, B:24:0x014a, B:26:0x014e, B:28:0x015f, B:30:0x0164), top: B:15:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017c A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #0 {all -> 0x0190, blocks: (B:35:0x0178, B:37:0x017c, B:40:0x0193, B:41:0x019c), top: B:34:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0193 A[Catch: all -> 0x0190, TRY_ENTER, TryCatch #0 {all -> 0x0190, blocks: (B:35:0x0178, B:37:0x017c, B:40:0x0193, B:41:0x019c), top: B:34:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d1 A[Catch: all -> 0x016e, TryCatch #10 {all -> 0x016e, blocks: (B:82:0x00c7, B:84:0x00d1, B:85:0x00d4, B:87:0x00df, B:88:0x00eb), top: B:81:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00df A[Catch: all -> 0x016e, TryCatch #10 {all -> 0x016e, blocks: (B:82:0x00c7, B:84:0x00d1, B:85:0x00d4, B:87:0x00df, B:88:0x00eb), top: B:81:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C2421i c2421i, E2.i iVar, int i, AbstractC0542c abstractC0542c) {
        C2418f c2418f;
        EnumC0510a enumC0510a;
        int i5;
        E2.i a5;
        C2415c c2415c;
        Throwable th;
        E2.a aVar;
        C2138i c2138i;
        Object i6;
        C2421i c2421i2;
        E2.i iVar2;
        C2415c c2415c2;
        Bitmap bitmap;
        j jVar;
        if (abstractC0542c instanceof C2418f) {
            c2418f = (C2418f) abstractC0542c;
            int i7 = c2418f.f19556r;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c2418f.f19556r = i7 - Integer.MIN_VALUE;
                Object obj = c2418f.f19554p;
                enumC0510a = EnumC0510a.f7289k;
                i5 = c2418f.f19556r;
                if (i5 == 0) {
                    if (i5 == 1) {
                        C2415c c2415c3 = c2418f.f19552n;
                        a5 = c2418f.f19551m;
                        aVar = c2418f.f19550l;
                        C2421i c2421i3 = c2418f.f19549k;
                        try {
                            l.N(obj);
                            c2415c = c2415c3;
                            c2421i = c2421i3;
                        } catch (Throwable th2) {
                            th = th2;
                            c2415c = c2415c3;
                            c2421i = c2421i3;
                        }
                    } else if (i5 == 2) {
                        Bitmap bitmap2 = c2418f.f19553o;
                        C2415c c2415c4 = c2418f.f19552n;
                        E2.i iVar3 = c2418f.f19551m;
                        E2.a aVar2 = c2418f.f19550l;
                        C2421i c2421i4 = c2418f.f19549k;
                        try {
                            l.N(obj);
                            bitmap = bitmap2;
                            c2415c2 = c2415c4;
                            iVar2 = iVar3;
                            aVar = aVar2;
                            c2421i2 = c2421i4;
                            try {
                                F2.h hVar = (F2.h) obj;
                                c2415c2.getClass();
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            try {
                                AbstractC2277q abstractC2277q = iVar2.f1451q;
                                C2419g c2419g = new C2419g(iVar2, c2421i2, hVar, c2415c2, bitmap, null);
                                c2418f.f19549k = c2421i2;
                                c2418f.f19550l = aVar;
                                c2418f.f19551m = iVar2;
                                c2418f.f19552n = c2415c2;
                                c2418f.f19553o = null;
                                c2418f.f19556r = 3;
                                obj = AbstractC2282w.w(abstractC2277q, c2419g, c2418f);
                                if (obj != enumC0510a) {
                                    a5 = iVar2;
                                    c2421i = c2421i2;
                                    jVar = (j) obj;
                                    if (!(jVar instanceof o)) {
                                    }
                                    return jVar;
                                }
                                return enumC0510a;
                            } catch (Throwable th4) {
                                th = th4;
                                a5 = iVar2;
                                c2421i = c2421i2;
                                c2415c = c2415c2;
                                if (!(th instanceof CancellationException)) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c2421i = c2421i4;
                            c2415c = c2415c4;
                            a5 = iVar3;
                            aVar = aVar2;
                        }
                    } else {
                        if (i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C2415c c2415c5 = c2418f.f19552n;
                        a5 = c2418f.f19551m;
                        aVar = c2418f.f19550l;
                        C2421i c2421i5 = c2418f.f19549k;
                        try {
                            l.N(obj);
                            c2415c2 = c2415c5;
                            c2421i = c2421i5;
                            try {
                                jVar = (j) obj;
                                try {
                                    if (!(jVar instanceof o)) {
                                        o oVar = (o) jVar;
                                        C2138i c2138i2 = a5.f1439c;
                                        c2421i.getClass();
                                        E2.i iVar4 = oVar.f1478b;
                                        c2415c2.getClass();
                                        iVar4.getClass();
                                    } else {
                                        if (!(jVar instanceof E2.e)) {
                                            throw new D2.e();
                                        }
                                        E2.e eVar = (E2.e) jVar;
                                        C2138i c2138i3 = a5.f1439c;
                                        c2421i.getClass();
                                        b(eVar, c2138i3, c2415c2);
                                    }
                                    return jVar;
                                } catch (Throwable th6) {
                                    th = th6;
                                    c2415c = c2415c2;
                                    if (!(th instanceof CancellationException)) {
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            c2415c = c2415c5;
                            c2421i = c2421i5;
                        }
                    }
                    try {
                        if (!(th instanceof CancellationException)) {
                            c2421i.getClass();
                            c2415c.getClass();
                            a5.getClass();
                            throw th;
                        }
                        c2421i.f19568e.getClass();
                        E2.e w5 = v3.g.w(a5, th);
                        b(w5, a5.f1439c, c2415c);
                        aVar.f1398l.k(aVar);
                        return w5;
                    } finally {
                        aVar.f1398l.k(aVar);
                    }
                }
                l.N(obj);
                U j5 = AbstractC2282w.j(c2418f.getContext());
                c2421i.f19568e.getClass();
                L l5 = iVar.f1455u;
                E2.a aVar3 = new E2.a(l5, j5);
                E2.h a6 = E2.i.a(iVar);
                a6.f1423b = c2421i.f19565b;
                a6.f1436q = null;
                a5 = a6.a();
                c2415c = C2415c.f19543a;
                try {
                    try {
                        if (a5.f1438b == k.f1461a) {
                            throw new E2.l("The request's data is null.");
                        }
                        l5.a(aVar3);
                        if (i == 0) {
                            L l6 = a5.f1455u;
                            c2418f.f19549k = c2421i;
                            c2418f.f19550l = aVar3;
                            c2418f.f19551m = a5;
                            c2418f.f19552n = c2415c;
                            c2418f.f19556r = 1;
                        }
                        aVar = aVar3;
                    } catch (Throwable th9) {
                        th = th9;
                        aVar = aVar3;
                        if (!(th instanceof CancellationException)) {
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
                if (((C2.d) c2421i.f19566c.getValue()) != null) {
                    a5.getClass();
                }
                a5.f1460z.getClass();
                E2.c cVar = H2.d.f2283a;
                c2138i = a5.f1439c;
                if (c2138i != null) {
                    ((C2497l) c2138i.f18249l).k(new C2488c(null));
                }
                c2415c.getClass();
                F2.i iVar5 = a5.f1456v;
                c2418f.f19549k = c2421i;
                c2418f.f19550l = aVar;
                c2418f.f19551m = a5;
                c2418f.f19552n = c2415c;
                c2418f.f19553o = null;
                c2418f.f19556r = 2;
                i6 = iVar5.i(c2418f);
                if (i6 != enumC0510a) {
                    c2421i2 = c2421i;
                    iVar2 = a5;
                    c2415c2 = c2415c;
                    obj = i6;
                    bitmap = null;
                    F2.h hVar2 = (F2.h) obj;
                    c2415c2.getClass();
                    AbstractC2277q abstractC2277q2 = iVar2.f1451q;
                    C2419g c2419g2 = new C2419g(iVar2, c2421i2, hVar2, c2415c2, bitmap, null);
                    c2418f.f19549k = c2421i2;
                    c2418f.f19550l = aVar;
                    c2418f.f19551m = iVar2;
                    c2418f.f19552n = c2415c2;
                    c2418f.f19553o = null;
                    c2418f.f19556r = 3;
                    obj = AbstractC2282w.w(abstractC2277q2, c2419g2, c2418f);
                    if (obj != enumC0510a) {
                    }
                }
                return enumC0510a;
            }
        }
        c2418f = new C2418f(c2421i, abstractC0542c);
        Object obj2 = c2418f.f19554p;
        enumC0510a = EnumC0510a.f7289k;
        i5 = c2418f.f19556r;
        if (i5 == 0) {
        }
        if (((C2.d) c2421i.f19566c.getValue()) != null) {
        }
        a5.f1460z.getClass();
        E2.c cVar2 = H2.d.f2283a;
        c2138i = a5.f1439c;
        if (c2138i != null) {
        }
        c2415c.getClass();
        F2.i iVar52 = a5.f1456v;
        c2418f.f19549k = c2421i;
        c2418f.f19550l = aVar;
        c2418f.f19551m = a5;
        c2418f.f19552n = c2415c;
        c2418f.f19553o = null;
        c2418f.f19556r = 2;
        i6 = iVar52.i(c2418f);
        if (i6 != enumC0510a) {
        }
        return enumC0510a;
    }

    public static void b(E2.e eVar, C2138i c2138i, C2415c c2415c) {
        E2.i iVar = eVar.f1419b;
        c2415c.getClass();
        iVar.getClass();
    }
}
