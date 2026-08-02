package J20;

import S20.a;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class B extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Integer, Unit> f13691b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f13692c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a.i f13693d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f13694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    B(Function1<? super Integer, Unit> function1, int i11, a.i iVar, Context context) {
        super(0);
        this.f13691b = function1;
        this.f13692c = i11;
        this.f13693d = iVar;
        this.f13694e = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i11 = this.f13692c;
        this.f13691b.invoke(Integer.valueOf(i11));
        this.f13693d.c().invoke(Integer.valueOf(i11), this.f13694e);
        return Unit.f71690a;
    }
}
