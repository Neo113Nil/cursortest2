package R20;

import S20.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class l extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f24521b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a.h f24522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(u uVar, a.h hVar) {
        super(1);
        this.f24521b = uVar;
        this.f24522c = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f24521b.h0(this.f24522c.getId(), it);
        return Unit.f71690a;
    }
}
