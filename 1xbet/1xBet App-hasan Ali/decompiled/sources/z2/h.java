package z2;

import A0.J0;
import H2.l;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.w;
import p4.AbstractC2277q;
import p4.AbstractC2282w;
import t2.C2414b;
import t2.C2415c;
import t2.C2421i;
import y2.m;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final C2421i f21962a;

    /* renamed from: b, reason: collision with root package name */
    public final l f21963b;

    /* renamed from: c, reason: collision with root package name */
    public final v3.g f21964c;

    /* renamed from: d, reason: collision with root package name */
    public final J0 f21965d;

    public h(C2421i c2421i, l lVar, v3.g gVar) {
        this.f21962a = c2421i;
        this.f21963b = lVar;
        this.f21964c = gVar;
        J0 j02 = new J0();
        j02.f304k = c2421i;
        this.f21965d = j02;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c1 -> B:10:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h hVar, m mVar, C2414b c2414b, E2.i iVar, Object obj, E2.m mVar2, C2415c c2415c, AbstractC0542c abstractC0542c) {
        C2772b c2772b;
        h hVar2;
        int i;
        E2.i iVar2;
        Object obj2;
        E2.m mVar3;
        C2415c c2415c2;
        int i5;
        C2772b c2772b2;
        m mVar4;
        C2414b c2414b2;
        List list;
        W3.h hVar3;
        hVar.getClass();
        if (abstractC0542c instanceof C2772b) {
            c2772b = (C2772b) abstractC0542c;
            int i6 = c2772b.f21919u;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c2772b.f21919u = i6 - Integer.MIN_VALUE;
                hVar2 = hVar;
                Object obj3 = c2772b.f21917s;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2772b.f21919u;
                if (i != 0) {
                    G4.l.N(obj3);
                    iVar2 = iVar;
                    obj2 = obj;
                    mVar3 = mVar2;
                    c2415c2 = c2415c;
                    i5 = 0;
                    c2772b2 = c2772b;
                    mVar4 = mVar;
                    c2414b2 = c2414b;
                    C2421i c2421i = hVar2.f21962a;
                    list = c2414b2.f19542e;
                    if (i5 >= list.size()) {
                    }
                    if (hVar3 != null) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = c2772b.f21916r;
                    C2415c c2415c3 = c2772b.f21915q;
                    E2.m mVar5 = c2772b.f21914p;
                    Object obj4 = c2772b.f21913o;
                    E2.i iVar3 = c2772b.f21912n;
                    C2414b c2414b3 = c2772b.f21911m;
                    m mVar6 = c2772b.f21910l;
                    h hVar4 = c2772b.f21909k;
                    G4.l.N(obj3);
                    C2772b c2772b3 = c2772b;
                    c2414b2 = c2414b3;
                    i5 = i7;
                    hVar2 = hVar4;
                    c2415c2 = c2415c3;
                    iVar2 = iVar3;
                    mVar3 = mVar5;
                    obj2 = obj4;
                    v2.f fVar = (v2.f) obj3;
                    c2415c2.getClass();
                    if (fVar == null) {
                        v2.e eVar = mVar6.f21219c;
                        v2.m mVar7 = mVar6.f21217a;
                        v2.l lVar = mVar7 instanceof v2.l ? (v2.l) mVar7 : null;
                        return new C2771a(fVar.f20407a, fVar.f20408b, eVar, lVar != null ? lVar.f20420m : null);
                    }
                    mVar4 = mVar6;
                    c2772b2 = c2772b3;
                    C2421i c2421i2 = hVar2.f21962a;
                    list = c2414b2.f19542e;
                    if (i5 >= list.size()) {
                        v2.b bVar = (v2.b) list.get(i5);
                        bVar.getClass();
                        hVar3 = new W3.h(new v2.d(mVar4.f21217a, mVar3, bVar.f20392b, bVar.f20391a), Integer.valueOf(i5));
                    } else {
                        hVar3 = null;
                    }
                    if (hVar3 != null) {
                        throw new IllegalStateException(("Unable to create a decoder that supports: " + obj2).toString());
                    }
                    v2.d dVar = (v2.d) hVar3.f6036k;
                    int intValue = ((Number) hVar3.f6037l).intValue() + 1;
                    c2415c2.getClass();
                    c2772b2.f21909k = hVar2;
                    c2772b2.f21910l = mVar4;
                    c2772b2.f21911m = c2414b2;
                    c2772b2.f21912n = iVar2;
                    c2772b2.f21913o = obj2;
                    c2772b2.f21914p = mVar3;
                    c2772b2.f21915q = c2415c2;
                    c2772b2.f21916r = intValue;
                    c2772b2.f21919u = 1;
                    Object a5 = dVar.a(c2772b2);
                    if (a5 == enumC0510a) {
                        return enumC0510a;
                    }
                    C2772b c2772b4 = c2772b2;
                    mVar6 = mVar4;
                    obj3 = a5;
                    i5 = intValue;
                    c2772b3 = c2772b4;
                    v2.f fVar2 = (v2.f) obj3;
                    c2415c2.getClass();
                    if (fVar2 == null) {
                    }
                }
            }
        }
        hVar2 = hVar;
        c2772b = new C2772b(hVar2, abstractC0542c);
        Object obj32 = c2772b.f21917s;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2772b.f21919u;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0167, code lost:
    
        if (r1 == r7) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004e, B:27:0x0112, B:39:0x0068, B:41:0x00d9, B:43:0x00e4, B:48:0x00f7, B:61:0x011d, B:63:0x0124, B:64:0x0181, B:65:0x0186), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004e, B:27:0x0112, B:39:0x0068, B:41:0x00d9, B:43:0x00e4, B:48:0x00f7, B:61:0x011d, B:63:0x0124, B:64:0x0181, B:65:0x0186), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0075  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(h hVar, E2.i iVar, Object obj, E2.m mVar, C2415c c2415c, AbstractC0542c abstractC0542c) {
        C2773c c2773c;
        w wVar;
        m mVar2;
        h hVar2;
        Object obj2;
        C2415c c2415c2;
        w wVar2;
        w wVar3;
        w wVar4;
        w wVar5;
        E2.i iVar2;
        y2.e eVar;
        E2.i iVar3;
        w wVar6;
        w wVar7;
        h hVar3;
        m mVar3;
        Bitmap bitmap;
        hVar.getClass();
        try {
            if (abstractC0542c instanceof C2773c) {
                c2773c = (C2773c) abstractC0542c;
                int i = c2773c.f21930u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c2773c.f21930u = i - Integer.MIN_VALUE;
                    C2773c c2773c2 = c2773c;
                    Object obj3 = c2773c2.f21928s;
                    EnumC0510a enumC0510a = EnumC0510a.f7289k;
                    wVar = c2773c2.f21930u;
                    if (wVar != 0) {
                        G4.l.N(obj3);
                        w wVar8 = new w();
                        wVar8.f17624k = mVar;
                        w wVar9 = new w();
                        wVar9.f17624k = hVar.f21962a.f;
                        w wVar10 = new w();
                        try {
                            wVar8.f17624k = hVar.f21964c.G((E2.m) wVar8.f17624k);
                            iVar.getClass();
                            C2414b c2414b = (C2414b) wVar9.f17624k;
                            E2.m mVar4 = (E2.m) wVar8.f17624k;
                            c2773c2.f21920k = hVar;
                            c2773c2.f21921l = iVar;
                            c2773c2.f21922m = obj;
                            c2773c2.f21923n = c2415c;
                            c2773c2.f21924o = wVar8;
                            c2773c2.f21925p = wVar9;
                            c2773c2.f21926q = wVar10;
                            c2773c2.f21927r = wVar10;
                            c2773c2.f21930u = 1;
                            obj3 = hVar.c(c2414b, iVar, obj, mVar4, c2415c, c2773c2);
                            if (obj3 != enumC0510a) {
                                hVar2 = hVar;
                                obj2 = obj;
                                c2415c2 = c2415c;
                                wVar2 = wVar8;
                                wVar3 = wVar9;
                                wVar4 = wVar10;
                                wVar5 = wVar4;
                                iVar2 = iVar;
                            }
                            return enumC0510a;
                        } catch (Throwable th) {
                            th = th;
                            wVar = wVar10;
                            Object obj4 = wVar.f17624k;
                            if (obj4 instanceof m) {
                            }
                            if (mVar2 != null) {
                            }
                            throw th;
                        }
                    }
                    if (wVar == 1) {
                        wVar4 = c2773c2.f21927r;
                        wVar5 = c2773c2.f21926q;
                        w wVar11 = c2773c2.f21925p;
                        w wVar12 = c2773c2.f21924o;
                        C2415c c2415c3 = (C2415c) c2773c2.f21923n;
                        Object obj5 = c2773c2.f21922m;
                        iVar2 = c2773c2.f21921l;
                        h hVar4 = c2773c2.f21920k;
                        G4.l.N(obj3);
                        wVar3 = wVar11;
                        wVar2 = wVar12;
                        c2415c2 = c2415c3;
                        obj2 = obj5;
                        hVar2 = hVar4;
                    } else {
                        if (wVar != 2) {
                            if (wVar != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            G4.l.N(obj3);
                            C2771a c2771a = (C2771a) obj3;
                            Drawable drawable = c2771a.f21905a;
                            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                                bitmap.prepareToDraw();
                            }
                            return c2771a;
                        }
                        wVar5 = c2773c2.f21924o;
                        wVar7 = (w) c2773c2.f21923n;
                        iVar3 = c2773c2.f21921l;
                        hVar3 = c2773c2.f21920k;
                        G4.l.N(obj3);
                        obj3 = (C2771a) obj3;
                        wVar6 = wVar7;
                        hVar2 = hVar3;
                        E2.i iVar4 = iVar3;
                        Object obj6 = wVar5.f17624k;
                        mVar3 = obj6 instanceof m ? (m) obj6 : null;
                        if (mVar3 != null) {
                            H2.e.a(mVar3.f21217a);
                        }
                        c2773c2.f21920k = null;
                        c2773c2.f21921l = null;
                        c2773c2.f21922m = null;
                        c2773c2.f21923n = null;
                        c2773c2.f21924o = null;
                        c2773c2.f21925p = null;
                        c2773c2.f21926q = null;
                        c2773c2.f21927r = null;
                        c2773c2.f21930u = 3;
                        hVar2.getClass();
                        iVar4.f.getClass();
                    }
                    wVar4.f17624k = obj3;
                    Object obj7 = wVar5.f17624k;
                    eVar = (y2.e) obj7;
                    if (eVar instanceof m) {
                        iVar3 = iVar2;
                        wVar6 = wVar2;
                        if (!(eVar instanceof y2.d)) {
                            throw new D2.e();
                        }
                        obj3 = new C2771a(((y2.d) obj7).f21195a, ((y2.d) obj7).f21196b, ((y2.d) obj7).f21197c, null);
                        E2.i iVar42 = iVar3;
                        Object obj62 = wVar5.f17624k;
                        if (obj62 instanceof m) {
                        }
                        if (mVar3 != null) {
                        }
                        c2773c2.f21920k = null;
                        c2773c2.f21921l = null;
                        c2773c2.f21922m = null;
                        c2773c2.f21923n = null;
                        c2773c2.f21924o = null;
                        c2773c2.f21925p = null;
                        c2773c2.f21926q = null;
                        c2773c2.f21927r = null;
                        c2773c2.f21930u = 3;
                        hVar2.getClass();
                        iVar42.f.getClass();
                    } else {
                        AbstractC2277q abstractC2277q = iVar2.f1453s;
                        w wVar13 = wVar5;
                        E2.i iVar5 = iVar2;
                        try {
                            C2774d c2774d = new C2774d(hVar2, wVar13, wVar3, iVar5, obj2, wVar2, c2415c2, null);
                            iVar3 = iVar5;
                            w wVar14 = wVar2;
                            C2415c c2415c4 = c2415c2;
                            c2773c2.f21920k = hVar2;
                            c2773c2.f21921l = iVar3;
                            c2773c2.f21922m = c2415c4;
                            c2773c2.f21923n = wVar14;
                            c2773c2.f21924o = wVar5;
                            c2773c2.f21925p = null;
                            c2773c2.f21926q = null;
                            c2773c2.f21927r = null;
                            c2773c2.f21930u = 2;
                            obj3 = AbstractC2282w.w(abstractC2277q, c2774d, c2773c2);
                            if (obj3 == enumC0510a) {
                                return enumC0510a;
                            }
                            wVar7 = wVar14;
                            hVar3 = hVar2;
                            obj3 = (C2771a) obj3;
                            wVar6 = wVar7;
                            hVar2 = hVar3;
                            E2.i iVar422 = iVar3;
                            Object obj622 = wVar5.f17624k;
                            if (obj622 instanceof m) {
                            }
                            if (mVar3 != null) {
                            }
                            c2773c2.f21920k = null;
                            c2773c2.f21921l = null;
                            c2773c2.f21922m = null;
                            c2773c2.f21923n = null;
                            c2773c2.f21924o = null;
                            c2773c2.f21925p = null;
                            c2773c2.f21926q = null;
                            c2773c2.f21927r = null;
                            c2773c2.f21930u = 3;
                            hVar2.getClass();
                            iVar422.f.getClass();
                        } catch (Throwable th2) {
                            th = th2;
                            wVar = wVar13;
                            Object obj42 = wVar.f17624k;
                            mVar2 = obj42 instanceof m ? (m) obj42 : null;
                            if (mVar2 != null) {
                                H2.e.a(mVar2.f21217a);
                            }
                            throw th;
                        }
                    }
                }
            }
            if (wVar != 0) {
            }
            wVar4.f17624k = obj3;
            Object obj72 = wVar5.f17624k;
            eVar = (y2.e) obj72;
            if (eVar instanceof m) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        c2773c = new C2773c(hVar, abstractC0542c);
        C2773c c2773c22 = c2773c;
        Object obj32 = c2773c22.f21928s;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        wVar = c2773c22.f21930u;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c8 -> B:10:0x00ca). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(C2414b c2414b, E2.i iVar, Object obj, E2.m mVar, C2415c c2415c, AbstractC0542c abstractC0542c) {
        C2775e c2775e;
        h hVar;
        int i;
        Object obj2;
        E2.m mVar2;
        C2415c c2415c2;
        int i5;
        C2775e c2775e2;
        h hVar2;
        C2414b c2414b2;
        E2.i iVar2;
        int size;
        W3.h hVar3;
        if (abstractC0542c instanceof C2775e) {
            c2775e = (C2775e) abstractC0542c;
            int i6 = c2775e.f21948t;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c2775e.f21948t = i6 - Integer.MIN_VALUE;
                hVar = this;
                Object obj3 = c2775e.f21946r;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2775e.f21948t;
                if (i != 0) {
                    G4.l.N(obj3);
                    obj2 = obj;
                    mVar2 = mVar;
                    c2415c2 = c2415c;
                    i5 = 0;
                    c2775e2 = c2775e;
                    hVar2 = hVar;
                    c2414b2 = c2414b;
                    iVar2 = iVar;
                    C2421i c2421i = hVar2.f21962a;
                    List list = c2414b2.f19541d;
                    size = list.size();
                    while (true) {
                        if (i5 < size) {
                        }
                        i5++;
                    }
                    if (hVar3 != null) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = c2775e.f21945q;
                    C2415c c2415c3 = c2775e.f21944p;
                    E2.m mVar3 = c2775e.f21943o;
                    Object obj4 = c2775e.f21942n;
                    E2.i iVar3 = c2775e.f21941m;
                    C2414b c2414b3 = c2775e.f21940l;
                    hVar2 = c2775e.f21939k;
                    G4.l.N(obj3);
                    c2775e2 = c2775e;
                    iVar2 = iVar3;
                    i5 = i7;
                    obj2 = obj4;
                    c2415c2 = c2415c3;
                    mVar2 = mVar3;
                    y2.e eVar = (y2.e) obj3;
                    try {
                        c2415c2.getClass();
                        if (eVar == null) {
                            return eVar;
                        }
                        c2414b2 = c2414b3;
                        C2421i c2421i2 = hVar2.f21962a;
                        List list2 = c2414b2.f19541d;
                        size = list2.size();
                        while (true) {
                            if (i5 < size) {
                                hVar3 = null;
                                break;
                            }
                            W3.h hVar4 = (W3.h) list2.get(i5);
                            y2.f fVar = (y2.f) hVar4.f6036k;
                            if (((Class) hVar4.f6037l).isAssignableFrom(obj2.getClass())) {
                                kotlin.jvm.internal.l.d("null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>", fVar);
                                y2.g a5 = fVar.a(obj2, mVar2);
                                if (a5 != null) {
                                    hVar3 = new W3.h(a5, Integer.valueOf(i5));
                                    break;
                                }
                            }
                            i5++;
                        }
                        if (hVar3 != null) {
                            throw new IllegalStateException(("Unable to create a fetcher that supports: " + obj2).toString());
                        }
                        y2.g gVar = (y2.g) hVar3.f6036k;
                        i5 = ((Number) hVar3.f6037l).intValue() + 1;
                        c2415c2.getClass();
                        c2775e2.f21939k = hVar2;
                        c2775e2.f21940l = c2414b2;
                        c2775e2.f21941m = iVar2;
                        c2775e2.f21942n = obj2;
                        c2775e2.f21943o = mVar2;
                        c2775e2.f21944p = c2415c2;
                        c2775e2.f21945q = i5;
                        c2775e2.f21948t = 1;
                        Object a6 = gVar.a(c2775e2);
                        if (a6 == enumC0510a) {
                            return enumC0510a;
                        }
                        c2414b3 = c2414b2;
                        obj3 = a6;
                        y2.e eVar2 = (y2.e) obj3;
                        c2415c2.getClass();
                        if (eVar2 == null) {
                        }
                    } catch (Throwable th) {
                        m mVar4 = eVar2 instanceof m ? (m) eVar2 : null;
                        if (mVar4 != null) {
                            H2.e.a(mVar4.f21217a);
                        }
                        throw th;
                    }
                }
            }
        }
        hVar = this;
        c2775e = new C2775e(hVar, abstractC0542c);
        Object obj32 = c2775e.f21946r;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2775e.f21948t;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(j jVar, AbstractC0542c abstractC0542c) {
        f fVar;
        int i;
        h hVar;
        h hVar2 = this;
        j jVar2 = jVar;
        int i5 = 1;
        J0 j02 = hVar2.f21965d;
        if (abstractC0542c instanceof f) {
            fVar = (f) abstractC0542c;
            int i6 = fVar.f21953o;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                fVar.f21953o = i6 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.f21951m;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = fVar2.f21953o;
                if (i != 0) {
                    G4.l.N(obj);
                    try {
                        E2.i iVar = jVar2.f21974d;
                        Object obj2 = iVar.f1438b;
                        F2.h hVar3 = jVar2.f21975e;
                        Bitmap.Config config = H2.e.f2284a;
                        C2415c c2415c = jVar2.f;
                        E2.m B5 = hVar2.f21964c.B(iVar, hVar3);
                        F2.g gVar = B5.f1466e;
                        List list = hVar2.f21962a.f.f19539b;
                        int size = list.size();
                        int i7 = 0;
                        while (i7 < size) {
                            try {
                                W3.h hVar4 = (W3.h) list.get(i7);
                                int i8 = i5;
                                B2.a aVar = (B2.a) hVar4.f6036k;
                                if (((Class) hVar4.f6037l).isAssignableFrom(obj2.getClass())) {
                                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>", aVar);
                                    Object a5 = aVar.a(obj2, B5);
                                    if (a5 != null) {
                                        obj2 = a5;
                                    }
                                }
                                i7++;
                                i5 = i8;
                            } catch (Throwable th) {
                                th = th;
                                hVar2 = this;
                                hVar = hVar2;
                                if (!(th instanceof CancellationException)) {
                                }
                            }
                        }
                        int i9 = i5;
                        try {
                            C2.b s2 = j02.s(iVar, obj2, B5, c2415c);
                            C2.c q5 = s2 != null ? j02.q(iVar, s2, hVar3, gVar) : null;
                            if (q5 != null) {
                                return J0.t(jVar2, iVar, s2, q5);
                            }
                            try {
                                AbstractC2277q abstractC2277q = iVar.f1452r;
                                hVar2 = this;
                                g gVar2 = new g(hVar2, iVar, obj2, B5, c2415c, s2, jVar2, null);
                                fVar2.f21949k = hVar2;
                                fVar2.f21950l = jVar2;
                                fVar2.f21953o = i9;
                                Object w5 = AbstractC2282w.w(abstractC2277q, gVar2, fVar2);
                                return w5 == enumC0510a ? enumC0510a : w5;
                            } catch (Throwable th2) {
                                th = th2;
                                hVar2 = this;
                                hVar = hVar2;
                                if (!(th instanceof CancellationException)) {
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j jVar3 = fVar2.f21950l;
                    hVar = fVar2.f21949k;
                    try {
                        G4.l.N(obj);
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        jVar2 = jVar3;
                    }
                }
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                v3.g gVar3 = hVar.f21964c;
                return v3.g.w(jVar2.f21974d, th);
            }
        }
        fVar = new f(hVar2, abstractC0542c);
        f fVar22 = fVar;
        Object obj3 = fVar22.f21951m;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = fVar22.f21953o;
        if (i != 0) {
        }
        if (!(th instanceof CancellationException)) {
        }
    }
}
