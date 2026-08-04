package w0;

import D6.C;
import kotlin.jvm.functions.Function2;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f17265b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, p065i6.d dVar2) {
        super(2, dVar2);
        this.f17265b = dVar;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        return new a(this.f17265b, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((C) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f17264a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            p166y0.b bVar = this.f17265b.f17273a;
            this.f17264a = 1;
            obj = bVar.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        return obj;
    }
}
