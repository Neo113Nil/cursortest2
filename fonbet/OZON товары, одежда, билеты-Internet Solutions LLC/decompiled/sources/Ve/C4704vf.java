package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.vf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4704vf extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pm f32278b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4704vf(Pm pm) {
        super(1);
        this.f32278b = pm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String code = (String) obj;
        if (code != null) {
            Intrinsics.checkNotNullExpressionValue(code, "code");
            X4.a aVar = this.f32278b.f28693b;
            if (aVar == null) {
                throw M7.f29463a;
            }
            ((C4400l0) aVar).f31486d.setOTP(code);
        }
        return Unit.f71690a;
    }
}
