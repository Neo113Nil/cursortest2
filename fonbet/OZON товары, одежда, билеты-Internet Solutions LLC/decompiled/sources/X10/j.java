package X10;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class j extends AbstractC7737t implements Function1<View, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fk0.c f33994b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f33995c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(fk0.c cVar, int i11) {
        super(1);
        this.f33994b = cVar;
        this.f33995c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        Intrinsics.checkNotNullParameter(view2, "view");
        this.f33994b.e(this.f33995c, view2);
        return Unit.f71690a;
    }
}
