package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ck, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4161ck extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Dk f30818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4161ck(Dk dk2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30818d = dk2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4161ck(this.f30818d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4161ck(this.f30818d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        Dk dk2 = this.f30818d;
        Bo bo = (Bo) dk2.f28873a;
        Yn.f30512a.getClass();
        k5.m3 a11 = bo.f28726b.a(new Sp(C4768xn.f32501b));
        Intrinsics.checkNotNullExpressionValue(a11, "bizoneFingerprintFactory…eate(fingerprintSettings)");
        a11.b();
        String report = a11.a();
        a11.c();
        Intrinsics.checkNotNullExpressionValue(report, "report");
        Intrinsics.checkNotNullParameter(report, "<this>");
        String data = kotlin.text.h.X(report, "\n", "", false);
        C4654tn c4654tn = (C4654tn) dk2.f28874b;
        c4654tn.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        c4654tn.f32131H = data;
        return data;
    }
}
