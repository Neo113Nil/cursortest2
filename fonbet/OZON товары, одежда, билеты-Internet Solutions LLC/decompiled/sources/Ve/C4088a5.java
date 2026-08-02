package Ve;

import Ae.C2414q0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.a5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4088a5 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4407l7 f30633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2414q0 f30635g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4378k7 f30636h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4088a5(C4407l7 c4407l7, AbstractC5434v.b bVar, C2414q0 c2414q0, kotlin.coroutines.d dVar, C4378k7 c4378k7) {
        super(2, dVar);
        this.f30633e = c4407l7;
        this.f30634f = bVar;
        this.f30635g = c2414q0;
        this.f30636h = c4378k7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4088a5(this.f30633e, this.f30634f, this.f30635g, dVar, this.f30636h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4088a5) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30632d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4664u4 c4664u4 = new C4664u4(this.f30635g, null, this.f30636h, 0);
            this.f30632d = 1;
            if (C5412d0.b(this.f30633e, this.f30634f, c4664u4, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
