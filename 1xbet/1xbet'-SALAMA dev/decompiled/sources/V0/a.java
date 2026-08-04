package V0;

import D6.C;
import G6.g;
import G6.s;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f6635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X0.i f6636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, X0.i iVar, d dVar) {
        super(2, dVar);
        this.f6635b = gVar;
        this.f6636c = iVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new a(this.f6635b, this.f6636c, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f6634a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            s sVar = new s(this.f6636c, 2);
            this.f6634a = 1;
            if (this.f6635b.r(sVar, this) == aVar) {
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
