package t2;

import G4.l;
import W3.o;
import android.graphics.Bitmap;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.ArrayList;
import p4.InterfaceC2280u;
import z2.j;

/* renamed from: t2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2419g extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19557k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2.i f19558l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2421i f19559m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ F2.h f19560n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2415c f19561o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Bitmap f19562p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2419g(E2.i iVar, C2421i c2421i, F2.h hVar, C2415c c2415c, Bitmap bitmap, a4.c cVar) {
        super(2, cVar);
        this.f19558l = iVar;
        this.f19559m = c2421i;
        this.f19560n = hVar;
        this.f19561o = c2415c;
        this.f19562p = bitmap;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2419g(this.f19558l, this.f19559m, this.f19560n, this.f19561o, this.f19562p, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2419g) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19557k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.N(obj);
            return obj;
        }
        l.N(obj);
        ArrayList arrayList = this.f19559m.f19569g;
        boolean z3 = this.f19562p != null;
        E2.i iVar = this.f19558l;
        j jVar = new j(iVar, arrayList, 0, iVar, this.f19560n, this.f19561o, z3);
        this.f19557k = 1;
        Object b3 = jVar.b(iVar, this);
        return b3 == enumC0510a ? enumC0510a : b3;
    }
}
