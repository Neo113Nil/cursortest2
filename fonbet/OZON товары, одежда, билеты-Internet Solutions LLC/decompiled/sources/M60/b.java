package M60;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.settings.models.Pin;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17481a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17481a) {
            case 0:
                return ((Pin) obj).getHash();
            default:
                Intrinsics.checkNotNullParameter((View) obj, "<unused var>");
                return Unit.f71690a;
        }
    }
}
