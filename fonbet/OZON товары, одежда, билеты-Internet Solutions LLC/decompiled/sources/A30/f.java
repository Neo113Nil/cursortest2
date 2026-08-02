package A30;

import B30.f;
import com.vk.id.VKID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f357a;

    public /* synthetic */ f(int i11) {
        this.f357a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit _init_$lambda$1;
        switch (this.f357a) {
            case 0:
                f.a it = (f.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f71690a;
            default:
                _init_$lambda$1 = VKID._init_$lambda$1((Throwable) obj);
                return _init_$lambda$1;
        }
    }
}
