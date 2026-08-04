package p010b0;

import G6.h;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: renamed from: b0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0744o extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f10086b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0744o(O o7, d dVar) {
        super(2, dVar);
        this.f10086b = o7;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new C0744o(this.f10086b, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0744o) create((h) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        int i7 = this.f10085a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            this.f10085a = 1;
            if (O.d(this.f10086b, this) == aVar) {
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
