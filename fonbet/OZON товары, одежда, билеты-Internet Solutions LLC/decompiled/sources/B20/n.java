package B20;

import Td0.d;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class n extends AbstractC7737t implements Function1<Context, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d.a f2217b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(d.a aVar) {
        super(1);
        this.f2217b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        it.startActivity(this.f2217b.b().invoke(new m()));
        return Unit.f71690a;
    }
}
