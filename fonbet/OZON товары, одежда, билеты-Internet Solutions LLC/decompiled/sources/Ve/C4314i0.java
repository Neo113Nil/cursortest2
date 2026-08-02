package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.i0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4314i0 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4114b2 f31223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4314i0(C4114b2 c4114b2) {
        super(1);
        this.f31223b = c4114b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f31223b.invoke(it);
        return Unit.f71690a;
    }
}
