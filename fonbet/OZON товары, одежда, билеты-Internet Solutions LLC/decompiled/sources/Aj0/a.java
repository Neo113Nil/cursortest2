package Aj0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import wj0.C10566a;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function1<C10566a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Wi0.b f1237b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(Wi0.b bVar) {
        super(1);
        this.f1237b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C10566a c10566a) {
        C10566a item = c10566a;
        Intrinsics.checkNotNullParameter(item, "item");
        this.f1237b.h0(item.b());
        return Unit.f71690a;
    }
}
