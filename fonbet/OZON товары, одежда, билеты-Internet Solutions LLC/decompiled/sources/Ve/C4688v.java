package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.RedirectActivity;

/* renamed from: Ve.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4688v extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32239d;

    /* renamed from: e, reason: collision with root package name */
    public int f32240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f32241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32242g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4688v(Ae.M0 m02, kotlin.coroutines.d dVar, Object obj, int i11) {
        super(2, dVar);
        this.f32239d = i11;
        this.f32241f = m02;
        this.f32242g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f32239d) {
            case 0:
                return new C4688v((Ae.x0) this.f32241f, dVar, (H3) this.f32242g, 0);
            case 1:
                return new C4688v(this.f32241f, dVar, (RedirectActivity) this.f32242g, 1);
            default:
                return new C4688v(this.f32241f, dVar, (H2) this.f32242g, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f32239d) {
            case 0:
                return new C4688v((Ae.x0) this.f32241f, dVar, (H3) this.f32242g, 0).invokeSuspend(Unit.f71690a);
            case 1:
                return new C4688v(this.f32241f, dVar, (RedirectActivity) this.f32242g, 1).invokeSuspend(Unit.f71690a);
            default:
                return new C4688v(this.f32241f, dVar, (H2) this.f32242g, 2).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f32239d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f32240e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C4111b c4111b = new C4111b((H3) this.f32242g, 2);
                    this.f32240e = 1;
                    if (((Ae.x0) this.f32241f).collect(c4111b, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            case 1:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f32240e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    C4778y5 c4778y5 = new C4778y5((RedirectActivity) this.f32242g, 0);
                    this.f32240e = 1;
                    if (this.f32241f.collect(c4778y5, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                int i13 = this.f32240e;
                if (i13 == 0) {
                    Sc.s.b(obj);
                    C4169d c4169d = new C4169d((H2) this.f32242g, 2);
                    this.f32240e = 1;
                    if (this.f32241f.collect(c4169d, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }
}
