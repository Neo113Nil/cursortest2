package P5;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class K extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f5624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l7, String str, String str2, p065i6.d dVar) {
        super(2, dVar);
        this.f5624b = l7;
        this.f5625c = str;
        this.f5626d = str2;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        return new K(this.f5624b, this.f5625c, this.f5626d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((D6.C) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f5623a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            this.f5623a = 1;
            if (L.a(this.f5624b, this.f5625c, this.f5626d, this) == aVar) {
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
