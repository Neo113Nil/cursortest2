package P5;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f5602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(L l7, String str, String str2, p065i6.d dVar) {
        super(2, dVar);
        this.f5602b = l7;
        this.f5603c = str;
        this.f5604d = str2;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        return new E(this.f5602b, this.f5603c, this.f5604d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((D6.C) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f5601a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            this.f5601a = 1;
            if (L.a(this.f5602b, this.f5603c, this.f5604d, this) == aVar) {
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
