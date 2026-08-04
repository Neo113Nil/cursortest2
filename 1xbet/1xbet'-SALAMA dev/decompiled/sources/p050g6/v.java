package p050g6;

import B6.c;
import j6.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import p044f6.i;
import p065i6.d;
import p077k6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends h implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f13321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f13324f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Iterator f13325x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Iterator it, d dVar) {
        super(dVar);
        this.f13325x = it;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        v vVar = new v(this.f13325x, dVar);
        vVar.f13324f = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((c) obj, (d) obj2)).invokeSuspend(i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        Iterator it;
        ArrayList arrayList;
        int i7;
        u uVar;
        c cVar2;
        Object[] array;
        a aVar = a.f14648a;
        int i8 = this.f13323e;
        if (i8 != 0) {
            if (i8 == 1) {
                i7 = this.f13322d;
                it = this.f13321c;
                cVar = (c) this.f13324f;
                p003a.a.p0(obj);
                arrayList = new ArrayList(20);
            } else if (i8 == 2) {
                p003a.a.p0(obj);
            } else {
                if (i8 == 3) {
                    Iterator it2 = this.f13321c;
                    u uVar2 = (u) this.f13320b;
                    c cVar3 = (c) this.f13324f;
                    p003a.a.p0(obj);
                    uVar2.m();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int iL = uVar2.l();
                        int i9 = uVar2.f13317b;
                        if (iL == i9) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i10 = uVar2.f13318c;
                        int i11 = uVar2.f13319d;
                        Object[] objArr = uVar2.f13316a;
                        objArr[(i10 + i11) % i9] = next;
                        uVar2.f13319d = i11 + 1;
                        if (uVar2.l() == i9) {
                            if (uVar2.f13319d >= 20) {
                                ArrayList arrayList2 = new ArrayList(uVar2);
                                this.f13324f = cVar3;
                                this.f13320b = uVar2;
                                this.f13321c = it2;
                                this.f13323e = 3;
                                cVar3.c(arrayList2, this);
                                a aVar2 = a.f14648a;
                                return aVar;
                            }
                            int i12 = i9 + (i9 >> 1) + 1;
                            if (i12 > 20) {
                                i12 = 20;
                            }
                            if (uVar2.f13318c == 0) {
                                array = Arrays.copyOf(objArr, i12);
                                t6.h.d(array, "copyOf(...)");
                            } else {
                                array = uVar2.toArray(new Object[i12]);
                            }
                            uVar2 = new u(array, uVar2.f13319d);
                        }
                    }
                    uVar = uVar2;
                    cVar2 = cVar3;
                } else if (i8 != 4) {
                    if (i8 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(obj);
                } else {
                    uVar = (u) this.f13320b;
                    cVar2 = (c) this.f13324f;
                    p003a.a.p0(obj);
                    uVar.m();
                }
                if (uVar.f13319d > 20) {
                    ArrayList arrayList3 = new ArrayList(uVar);
                    this.f13324f = cVar2;
                    this.f13320b = uVar;
                    this.f13321c = null;
                    this.f13323e = 4;
                    cVar2.c(arrayList3, this);
                    a aVar3 = a.f14648a;
                    return aVar;
                }
                if (!uVar.isEmpty()) {
                    this.f13324f = null;
                    this.f13320b = null;
                    this.f13321c = null;
                    this.f13323e = 5;
                    cVar2.c(uVar, this);
                    a aVar4 = a.f14648a;
                    return aVar;
                }
            }
            return i.f13014a;
        }
        p003a.a.p0(obj);
        cVar = (c) this.f13324f;
        it = this.f13325x;
        arrayList = new ArrayList(20);
        i7 = 0;
        c cVar4 = cVar;
        Iterator it3 = it;
        int i13 = i7;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i7 > 0) {
                i7--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f13324f = cVar4;
                    this.f13320b = arrayList;
                    this.f13321c = it3;
                    this.f13322d = i13;
                    this.f13323e = 1;
                    cVar4.c(arrayList, this);
                    a aVar5 = a.f14648a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f13324f = null;
            this.f13320b = null;
            this.f13321c = null;
            this.f13323e = 2;
            cVar4.c(arrayList, this);
            a aVar6 = a.f14648a;
            return aVar;
        }
        return i.f13014a;
    }
}
