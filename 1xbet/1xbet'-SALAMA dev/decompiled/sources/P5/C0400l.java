package P5;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: P5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0400l extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f5663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5664c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0400l(L l7, List list, p065i6.d dVar) {
        super(2, dVar);
        this.f5663b = l7;
        this.f5664c = list;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        return new C0400l(this.f5663b, this.f5664c, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0400l) create((D6.C) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f5662a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            this.f5662a = 1;
            obj = L.b(this.f5663b, this.f5664c, this);
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
