package Qh0;

import gh0.AbstractC6735a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class g extends AbstractC7737t implements Function1<Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f23451b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC6735a f23452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, AbstractC6735a abstractC6735a) {
        super(1);
        this.f23451b = hVar;
        this.f23452c = abstractC6735a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ArrayList arrayList;
        if (Intrinsics.d(bool, Boolean.TRUE)) {
            arrayList = this.f23451b.f23457d;
            arrayList.add(this.f23452c.b());
        }
        return Unit.f71690a;
    }
}
