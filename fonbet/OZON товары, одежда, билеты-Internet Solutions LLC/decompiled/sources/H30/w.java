package H30;

import Sc.InterfaceC4008j;
import android.os.Handler;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f10568a = Sc.k.b(new v(0));

    public final boolean a() {
        InterfaceC4008j interfaceC4008j = this.f10568a;
        if (((Handler) interfaceC4008j.getValue()).hasMessages(0)) {
            return true;
        }
        ((Handler) interfaceC4008j.getValue()).sendEmptyMessageDelayed(0, 400L);
        return false;
    }
}
