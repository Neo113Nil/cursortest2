package g6;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k6.AbstractC1361h;
import kotlin.jvm.functions.Function2;

/* renamed from: g6.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1173v extends AbstractC1361h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Object f13314b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f13315c;

    /* renamed from: d, reason: collision with root package name */
    public int f13316d;

    /* renamed from: e, reason: collision with root package name */
    public int f13317e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f13318f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Iterator f13319x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1173v(Iterator it, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f13319x = it;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        C1173v c1173v = new C1173v(this.f13319x, interfaceC1287d);
        c1173v.f13318f = obj;
        return c1173v;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1173v) create((B6.c) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        B6.c cVar;
        Iterator it;
        ArrayList arrayList;
        int i7;
        C1172u c1172u;
        B6.c cVar2;
        Object[] array;
        j6.a aVar = j6.a.f14642a;
        int i8 = this.f13317e;
        if (i8 == 0) {
            AbstractC0603a.p0(obj);
            cVar = (B6.c) this.f13318f;
            it = this.f13319x;
            arrayList = new ArrayList(20);
            i7 = 0;
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        Iterator it2 = this.f13315c;
                        C1172u c1172u2 = (C1172u) this.f13314b;
                        B6.c cVar3 = (B6.c) this.f13318f;
                        AbstractC0603a.p0(obj);
                        c1172u2.m();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int l7 = c1172u2.l();
                            int i9 = c1172u2.f13311b;
                            if (l7 == i9) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            int i10 = c1172u2.f13312c;
                            int i11 = c1172u2.f13313d;
                            Object[] objArr = c1172u2.f13310a;
                            objArr[(i10 + i11) % i9] = next;
                            c1172u2.f13313d = i11 + 1;
                            if (c1172u2.l() == i9) {
                                if (c1172u2.f13313d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(c1172u2);
                                    this.f13318f = cVar3;
                                    this.f13314b = c1172u2;
                                    this.f13315c = it2;
                                    this.f13317e = 3;
                                    cVar3.c(arrayList2, this);
                                    j6.a aVar2 = j6.a.f14642a;
                                    return aVar;
                                }
                                int i12 = i9 + (i9 >> 1) + 1;
                                if (i12 > 20) {
                                    i12 = 20;
                                }
                                if (c1172u2.f13312c == 0) {
                                    array = Arrays.copyOf(objArr, i12);
                                    t6.h.d(array, "copyOf(...)");
                                } else {
                                    array = c1172u2.toArray(new Object[i12]);
                                }
                                c1172u2 = new C1172u(array, c1172u2.f13313d);
                            }
                        }
                        c1172u = c1172u2;
                        cVar2 = cVar3;
                    } else if (i8 == 4) {
                        c1172u = (C1172u) this.f13314b;
                        cVar2 = (B6.c) this.f13318f;
                        AbstractC0603a.p0(obj);
                        c1172u.m();
                    } else if (i8 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (c1172u.f13313d > 20) {
                        ArrayList arrayList3 = new ArrayList(c1172u);
                        this.f13318f = cVar2;
                        this.f13314b = c1172u;
                        this.f13315c = null;
                        this.f13317e = 4;
                        cVar2.c(arrayList3, this);
                        j6.a aVar3 = j6.a.f14642a;
                        return aVar;
                    }
                    if (!c1172u.isEmpty()) {
                        this.f13318f = null;
                        this.f13314b = null;
                        this.f13315c = null;
                        this.f13317e = 5;
                        cVar2.c(c1172u, this);
                        j6.a aVar4 = j6.a.f14642a;
                        return aVar;
                    }
                    return C1116i.f13008a;
                }
                AbstractC0603a.p0(obj);
                return C1116i.f13008a;
            }
            i7 = this.f13316d;
            it = this.f13315c;
            cVar = (B6.c) this.f13318f;
            AbstractC0603a.p0(obj);
            arrayList = new ArrayList(20);
        }
        B6.c cVar4 = cVar;
        Iterator it3 = it;
        int i13 = i7;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i7 > 0) {
                i7--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f13318f = cVar4;
                    this.f13314b = arrayList;
                    this.f13315c = it3;
                    this.f13316d = i13;
                    this.f13317e = 1;
                    cVar4.c(arrayList, this);
                    j6.a aVar5 = j6.a.f14642a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f13318f = null;
            this.f13314b = null;
            this.f13315c = null;
            this.f13317e = 2;
            cVar4.c(arrayList, this);
            j6.a aVar6 = j6.a.f14642a;
            return aVar;
        }
        return C1116i.f13008a;
    }
}
