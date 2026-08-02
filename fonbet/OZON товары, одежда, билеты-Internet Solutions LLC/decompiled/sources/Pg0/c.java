package Pg0;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class c extends AbstractC7737t implements Function0<Qg0.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Application f22539b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Application application) {
        super(0);
        this.f22539b = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Qg0.a invoke() {
        String id2 = this.f22539b.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(id2, "getPackageName(...)");
        Intrinsics.checkNotNullParameter(id2, "id");
        return Qg0.a.a(id2);
    }
}
