package A90;

import S0.InterfaceC3978p0;
import U50.j;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f577b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f576a = i11;
        this.f577b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f576a) {
            case 0:
                break;
            case 1:
                sa0.d it = (sa0.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((j) this.f577b).invoke(new NativeResult.Error("Ошибка установки соединения с SDK Mir Pay. Статус: " + it, NativeResult.Error.a.SDK_ERROR));
                break;
            default:
                View it2 = (View) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                ((InterfaceC3978p0) this.f577b).setValue(it2);
                break;
        }
        return Unit.f71690a;
    }
}
