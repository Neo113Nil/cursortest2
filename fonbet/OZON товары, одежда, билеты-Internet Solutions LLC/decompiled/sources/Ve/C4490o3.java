package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.o3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4490o3 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S7 f31699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S7 f31702h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4490o3(S7 s72, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, S7 s73) {
        super(2, dVar);
        this.f31699e = s72;
        this.f31700f = bVar;
        this.f31701g = c2406m0;
        this.f31702h = s73;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4490o3(this.f31699e, this.f31700f, this.f31701g, dVar, this.f31702h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4490o3) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31698d;
        if (i11 == 0) {
            Sc.s.b(obj);
            K2 k22 = new K2(this.f31701g, (kotlin.coroutines.d) null, this.f31702h);
            this.f31698d = 1;
            if (C5412d0.b(this.f31699e, this.f31700f, k22, this) == aVar) {
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
