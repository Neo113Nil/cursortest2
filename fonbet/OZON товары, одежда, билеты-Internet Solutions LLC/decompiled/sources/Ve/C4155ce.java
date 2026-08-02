package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.ce, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4155ce extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30798d;

    /* renamed from: e, reason: collision with root package name */
    public int f30799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f30801g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4155ce(C2406m0 c2406m0, kotlin.coroutines.d dVar, Object obj, int i11) {
        super(2, dVar);
        this.f30798d = i11;
        this.f30800f = c2406m0;
        this.f30801g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f30798d) {
            case 0:
                return new C4155ce(this.f30800f, dVar, (C4668u8) this.f30801g, 0);
            default:
                return new C4155ce(this.f30800f, dVar, (C1) this.f30801g, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f30798d) {
            case 0:
                return new C4155ce(this.f30800f, dVar, (C4668u8) this.f30801g, 0).invokeSuspend(Unit.f71690a);
            default:
                return new C4155ce(this.f30800f, dVar, (C1) this.f30801g, 1).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30798d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f30799e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C4786yd c4786yd = new C4786yd((C4668u8) this.f30801g);
                    this.f30799e = 1;
                    if (this.f30800f.collect(c4786yd, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f30799e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    S3 s32 = new S3((C1) this.f30801g, 1);
                    this.f30799e = 1;
                    if (this.f30800f.collect(s32, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }
}
