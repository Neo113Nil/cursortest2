package androidx.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class E extends AbstractC7737t implements Function1<C5035b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f36918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(J j11) {
        super(1);
        this.f36918b = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C5035b c5035b) {
        C5035b backEvent = c5035b;
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        J.d(this.f36918b, backEvent);
        return Unit.f71690a;
    }
}
