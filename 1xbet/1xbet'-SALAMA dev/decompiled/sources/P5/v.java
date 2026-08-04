package P5;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f5699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(L l7, List list, p065i6.d dVar) {
        super(2, dVar);
        this.f5699b = l7;
        this.f5700c = list;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        return new v(this.f5699b, this.f5700c, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((D6.C) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f5698a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            this.f5698a = 1;
            obj = L.b(this.f5699b, this.f5700c, this);
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
