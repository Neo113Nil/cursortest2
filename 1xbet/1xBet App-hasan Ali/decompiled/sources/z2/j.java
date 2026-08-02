package z2;

import E2.k;
import G4.l;
import android.content.Context;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import java.util.ArrayList;
import t2.C2415c;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final E2.i f21971a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21973c;

    /* renamed from: d, reason: collision with root package name */
    public final E2.i f21974d;

    /* renamed from: e, reason: collision with root package name */
    public final F2.h f21975e;
    public final C2415c f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21976g;

    public j(E2.i iVar, ArrayList arrayList, int i, E2.i iVar2, F2.h hVar, C2415c c2415c, boolean z3) {
        this.f21971a = iVar;
        this.f21972b = arrayList;
        this.f21973c = i;
        this.f21974d = iVar2;
        this.f21975e = hVar;
        this.f = c2415c;
        this.f21976g = z3;
    }

    public final void a(E2.i iVar, h hVar) {
        Context context = iVar.f1437a;
        E2.i iVar2 = this.f21971a;
        if (context != iVar2.f1437a) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's context.").toString());
        }
        if (iVar.f1438b == k.f1461a) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot set the request's data to null.").toString());
        }
        if (iVar.f1439c != iVar2.f1439c) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's target.").toString());
        }
        if (iVar.f1455u != iVar2.f1455u) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (iVar.f1456v == iVar2.f1456v) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(E2.i iVar, AbstractC0542c abstractC0542c) {
        i iVar2;
        int i;
        j jVar;
        h hVar;
        if (abstractC0542c instanceof i) {
            iVar2 = (i) abstractC0542c;
            int i5 = iVar2.f21970o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iVar2.f21970o = i5 - Integer.MIN_VALUE;
                Object obj = iVar2.f21968m;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = iVar2.f21970o;
                if (i != 0) {
                    l.N(obj);
                    ArrayList arrayList = this.f21972b;
                    int i6 = this.f21973c;
                    if (i6 > 0) {
                        a(iVar, (h) arrayList.get(i6 - 1));
                    }
                    h hVar2 = (h) arrayList.get(i6);
                    j jVar2 = new j(this.f21971a, arrayList, i6 + 1, iVar, this.f21975e, this.f, this.f21976g);
                    iVar2.f21966k = this;
                    iVar2.f21967l = hVar2;
                    iVar2.f21970o = 1;
                    obj = hVar2.d(jVar2, iVar2);
                    if (obj == enumC0510a) {
                        return enumC0510a;
                    }
                    jVar = this;
                    hVar = hVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = iVar2.f21967l;
                    jVar = iVar2.f21966k;
                    l.N(obj);
                }
                E2.j jVar3 = (E2.j) obj;
                jVar.a(jVar3.b(), hVar);
                return jVar3;
            }
        }
        iVar2 = new i(this, abstractC0542c);
        Object obj2 = iVar2.f21968m;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = iVar2.f21970o;
        if (i != 0) {
        }
        E2.j jVar32 = (E2.j) obj2;
        jVar.a(jVar32.b(), hVar);
        return jVar32;
    }
}
