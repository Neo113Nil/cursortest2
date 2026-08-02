package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.l1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4401l1 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4699va f31491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31492f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31493g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S0 f31494h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4401l1(C4699va c4699va, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, S0 s02) {
        super(2, dVar);
        this.f31491e = c4699va;
        this.f31492f = bVar;
        this.f31493g = c2406m0;
        this.f31494h = s02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4401l1(this.f31491e, this.f31492f, this.f31493g, dVar, this.f31494h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4401l1) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31490d;
        if (i11 == 0) {
            Sc.s.b(obj);
            G0 g02 = new G0(this.f31493g, null, this.f31494h, 0);
            this.f31490d = 1;
            if (C5412d0.b(this.f31491e, this.f31492f, g02, this) == aVar) {
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
