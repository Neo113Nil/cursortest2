package B20;

import De.C2862e;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* loaded from: classes3.dex */
final class k extends AbstractC7737t implements Function1<Context, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f2216b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(f fVar) {
        super(1);
        this.f2216b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Context context) {
        C2862e c2862e;
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        f fVar = this.f2216b;
        c2862e = fVar.f2211l;
        C10727i.c(c2862e, null, null, new j(fVar, null), 3);
        return Unit.f71690a;
    }
}
