package p010b0;

import Y4.D;
import j6.a;
import java.util.List;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: renamed from: b0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0734e extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f10028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0734e(List list, d dVar) {
        super(2, dVar);
        this.f10028c = list;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        C0734e c0734e = new C0734e(this.f10028c, dVar);
        c0734e.f10027b = obj;
        return c0734e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0734e) create((C0741l) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        int i7 = this.f10026a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            C0741l c0741l = (C0741l) this.f10027b;
            this.f10026a = 1;
            if (D.a(this.f10028c, c0741l, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        return p044f6.i.f13014a;
    }
}
