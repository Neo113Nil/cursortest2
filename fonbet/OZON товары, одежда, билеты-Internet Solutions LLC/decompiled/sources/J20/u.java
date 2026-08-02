package J20;

import S20.a;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class u extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2<String, Context, Unit> f13735b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a.h f13736c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f13737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    u(Function2<? super String, ? super Context, Unit> function2, a.h hVar, Context context) {
        super(0);
        this.f13735b = function2;
        this.f13736c = hVar;
        this.f13737d = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f13735b.invoke(this.f13736c.g(), this.f13737d);
        return Unit.f71690a;
    }
}
