package z2;

import A0.J0;
import E2.m;
import G4.l;
import W3.o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.LinkedHashMap;
import p4.InterfaceC2280u;
import t2.C2415c;
import t2.C2421i;

/* loaded from: classes.dex */
public final class g extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f21954k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f21955l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E2.i f21956m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f21957n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f21958o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2415c f21959p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2.b f21960q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f21961r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, E2.i iVar, Object obj, m mVar, C2415c c2415c, C2.b bVar, j jVar, a4.c cVar) {
        super(2, cVar);
        this.f21955l = hVar;
        this.f21956m = iVar;
        this.f21957n = obj;
        this.f21958o = mVar;
        this.f21959p = c2415c;
        this.f21960q = bVar;
        this.f21961r = jVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new g(this.f21955l, this.f21956m, this.f21957n, this.f21958o, this.f21959p, this.f21960q, this.f21961r, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b3;
        C2.d dVar;
        Bitmap bitmap;
        boolean z3;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f21954k;
        if (i == 0) {
            l.N(obj);
            h hVar = this.f21955l;
            E2.i iVar = this.f21956m;
            Object obj2 = this.f21957n;
            m mVar = this.f21958o;
            C2415c c2415c = this.f21959p;
            this.f21954k = 1;
            b3 = h.b(hVar, iVar, obj2, mVar, c2415c, this);
            if (b3 == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.N(obj);
            b3 = obj;
        }
        C2771a c2771a = (C2771a) b3;
        H2.l lVar = this.f21955l.f21963b;
        synchronized (lVar) {
            try {
                C2421i c2421i = (C2421i) lVar.f2303k.get();
                if (c2421i == null) {
                    lVar.b();
                } else if (lVar.f2304l == null) {
                    Context context = c2421i.f19564a;
                    lVar.f2304l = context;
                    context.registerComponentCallbacks(lVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        J0 j02 = this.f21955l.f21965d;
        C2.b bVar = this.f21960q;
        if (this.f21956m.f1448n.f1404l && (dVar = (C2.d) ((C2421i) j02.f304k).f19566c.getValue()) != null && bVar != null) {
            Drawable drawable = c2771a.f21905a;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c2771a.f21906b));
                String str = c2771a.f21908d;
                if (str != null) {
                    linkedHashMap.put("coil#disk_cache_key", str);
                }
                dVar.f822a.h(new C2.b(bVar.f818k, G4.d.M(bVar.f819l)), bitmap, G4.d.M(linkedHashMap));
                z3 = true;
                Drawable drawable2 = c2771a.f21905a;
                E2.i iVar2 = this.f21956m;
                v2.e eVar = c2771a.f21907c;
                C2.b bVar2 = !z3 ? this.f21960q : null;
                String str2 = c2771a.f21908d;
                boolean z5 = c2771a.f21906b;
                j jVar = this.f21961r;
                Bitmap.Config config = H2.e.f2284a;
                return new E2.o(drawable2, iVar2, eVar, bVar2, str2, z5, jVar == null && jVar.f21976g);
            }
        }
        z3 = false;
        Drawable drawable22 = c2771a.f21905a;
        E2.i iVar22 = this.f21956m;
        v2.e eVar2 = c2771a.f21907c;
        if (!z3) {
        }
        String str22 = c2771a.f21908d;
        boolean z52 = c2771a.f21906b;
        j jVar2 = this.f21961r;
        Bitmap.Config config2 = H2.e.f2284a;
        return new E2.o(drawable22, iVar22, eVar2, bVar2, str22, z52, jVar2 == null && jVar2.f21976g);
    }
}
