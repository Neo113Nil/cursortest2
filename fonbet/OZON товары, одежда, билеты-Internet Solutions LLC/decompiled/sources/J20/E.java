package J20;

import S20.a;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class E extends AbstractC7737t implements Function1<Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f13698b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a.j f13699c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f13700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(a.j jVar, Context context, Function1 function1) {
        super(1);
        this.f13698b = function1;
        this.f13699c = jVar;
        this.f13700d = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean z11 = !bool.booleanValue();
        this.f13698b.invoke(Boolean.valueOf(z11));
        this.f13699c.c().invoke(Boolean.valueOf(z11), this.f13700d);
        return Unit.f71690a;
    }
}
