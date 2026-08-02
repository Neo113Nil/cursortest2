package B20;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import s20.d;

/* loaded from: classes3.dex */
final class p extends AbstractC7737t implements Function1<Context, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d.a f2218b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(d.a aVar) {
        super(1);
        this.f2218b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        it.startActivity(this.f2218b.getIntent().invoke(new o()));
        return Unit.f71690a;
    }
}
