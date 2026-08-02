package J20;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class o extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<String, Unit> f13726b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f13727c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function2<String, Context, Unit> f13728d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f13729e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    o(Function1<? super String, Unit> function1, String str, Function2<? super String, ? super Context, Unit> function2, Context context) {
        super(0);
        this.f13726b = function1;
        this.f13727c = str;
        this.f13728d = function2;
        this.f13729e = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<String, Unit> function1 = this.f13726b;
        String str = this.f13727c;
        function1.invoke(str);
        Function2<String, Context, Unit> function2 = this.f13728d;
        if (function2 != null) {
            function2.invoke(str, this.f13729e);
        }
        return Unit.f71690a;
    }
}
