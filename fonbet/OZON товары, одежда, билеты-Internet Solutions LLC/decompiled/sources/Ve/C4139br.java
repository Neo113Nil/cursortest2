package Ve;

import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.br, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4139br extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ J4 f30754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4380k9 f30756g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Hp f30757h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f30758i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4139br(J4 j42, AbstractC5434v.b bVar, C4380k9 c4380k9, kotlin.coroutines.d dVar, Hp hp2, Context context) {
        super(2, dVar);
        this.f30754e = j42;
        this.f30755f = bVar;
        this.f30756g = c4380k9;
        this.f30757h = hp2;
        this.f30758i = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4139br(this.f30754e, this.f30755f, this.f30756g, dVar, this.f30757h, this.f30758i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4139br) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30753d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4743wq c4743wq = new C4743wq(this.f30756g, null, this.f30757h, this.f30758i);
            this.f30753d = 1;
            if (C5412d0.b(this.f30754e, this.f30755f, c4743wq, this) == aVar) {
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
