package J20;

import S20.a;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class n extends AbstractC7737t implements Function2<String, Context, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.e f13725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(a.e eVar) {
        super(2);
        this.f13725b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Context context) {
        String value = str;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(context2, "context");
        Function2<String, Context, Unit> a11 = this.f13725b.a();
        if (a11 != null) {
            a11.invoke(value, context2);
        }
        return Unit.f71690a;
    }
}
