package bg0;

import androidx.recyclerview.widget.m;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import of.C8723b;
import of.C8724c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8724c f56010a;

    public g(@NotNull C8724c mockServer) {
        Intrinsics.checkNotNullParameter(mockServer, "mockServer");
        this.f56010a = mockServer;
    }

    private final void a(int i11) {
        C8723b c8723b = new C8723b();
        c8723b.q(i11);
        c8723b.n("Body contains data with response code: " + i11);
        this.f56010a.t1(c8723b);
    }

    public final void b() {
        C8723b c8723b = new C8723b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c8723b.o();
        c8723b.n("Body contains data after delay");
        this.f56010a.t1(c8723b);
    }

    public final void c() {
        C8723b c8723b = new C8723b();
        c8723b.q(CounterView.COUNTER_MAX_DEFAULT);
        this.f56010a.t1(c8723b);
    }

    public final void d(int i11) {
        if (300 > i11 || i11 >= 400) {
            a(i11);
            return;
        }
        C8723b c8723b = new C8723b();
        c8723b.q(i11);
        c8723b.p("/new-location-" + i11, "Location");
        c8723b.n("Body contains data with response code: " + i11);
        this.f56010a.t1(c8723b);
        a(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
    }
}
