package B20;

import android.content.Context;
import androidx.appcompat.app.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import t20.DialogInterfaceOnShowListenerC9728a;

/* loaded from: classes3.dex */
final /* synthetic */ class i extends C7735q implements Function1<Context, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Context context) {
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "p0");
        ((t20.b) this.receiver).getClass();
        Intrinsics.checkNotNullParameter(context2, "context");
        androidx.appcompat.app.f create = new f.a(context2).setTitle("Приложение зависло").f("Чтобы событие ANR точно отправилось тапайте по экрану, а при показе окна с ANR нажмите на \"Close app\"").create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        create.setOnShowListener(new DialogInterfaceOnShowListenerC9728a());
        create.show();
        return Unit.f71690a;
    }
}
