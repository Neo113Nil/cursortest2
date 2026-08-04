package p010b0;

import j6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: renamed from: b0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0737h extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f10044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f10048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0737h(List list, ArrayList arrayList, d dVar) {
        super(2, dVar);
        this.f10048e = list;
        this.f10049f = arrayList;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        C0737h c0737h = new C0737h(this.f10048e, this.f10049f, dVar);
        c0737h.f10047d = obj;
        return c0737h;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0737h) create(obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        a aVar = a.f14648a;
        int i7 = this.f10046c;
        if (i7 == 0) {
            p003a.a.p0(obj);
            obj = this.f10047d;
            it = this.f10048e.iterator();
            list = this.f10049f;
        } else if (i7 == 1) {
            Object obj2 = this.f10045b;
            Iterator it2 = this.f10044a;
            List list2 = (List) this.f10047d;
            p003a.a.p0(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0736g(1, null));
                this.f10047d = list2;
                this.f10044a = it2;
                this.f10045b = null;
                this.f10046c = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f10044a;
            list = (List) this.f10047d;
            p003a.a.p0(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f10047d = list;
        this.f10044a = it;
        this.f10045b = obj;
        this.f10046c = 1;
        throw null;
    }
}
