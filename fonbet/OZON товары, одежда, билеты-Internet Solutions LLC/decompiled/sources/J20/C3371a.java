package J20;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J20.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3371a extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Context, Unit> f13707b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f13708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3371a(Function1<? super Context, Unit> function1, Context context) {
        super(0);
        this.f13707b = function1;
        this.f13708c = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f13707b.invoke(this.f13708c);
        return Unit.f71690a;
    }
}
