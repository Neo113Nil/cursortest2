package Zh0;

import android.view.View;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class e extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<View, Unit> f35976b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Window f35977c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    e(Function1<? super View, Unit> function1, Window window) {
        super(0);
        this.f35976b = function1;
        this.f35977c = window;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        View decorView = this.f35977c.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.f35976b.invoke(decorView);
        return Unit.f71690a;
    }
}
