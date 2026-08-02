package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Ve.kq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4397kq extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w0 f31475b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4397kq(C4531pf c4531pf) {
        super(1);
        this.f31475b = c4531pf;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Ve.qr, androidx.lifecycle.w0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f31475b.a().invoke(Long.valueOf(((Number) obj).longValue()));
        return Unit.f71690a;
    }
}
