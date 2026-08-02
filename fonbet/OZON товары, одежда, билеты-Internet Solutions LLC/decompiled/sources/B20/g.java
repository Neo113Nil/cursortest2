package B20;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import w20.C10420b;

/* loaded from: classes3.dex */
final class g extends AbstractC7737t implements Function1<Context, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f2212b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(f fVar) {
        super(1);
        this.f2212b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Context context) {
        C10420b c10420b;
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        c10420b = this.f2212b.f2208i;
        c10420b.c(w20.g.DEPENDENCIES);
        return Unit.f71690a;
    }
}
