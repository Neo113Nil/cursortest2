package Xb0;

import Ib0.e;
import Sc.InterfaceC4008j;
import Xb0.b;
import android.app.Activity;
import android.app.Application;
import dc0.C6149M;
import dc0.C6178x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.logout.presentation.LogoutActivity;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<e> f34271a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6178x f34272b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C6149M f34273c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Application f34274d;

    public a(@NotNull InterfaceC4008j<e> authEvents, @NotNull C6178x currentUserRepository, @NotNull C6149M ozonIdNotifier, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(authEvents, "authEvents");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        Intrinsics.checkNotNullParameter(ozonIdNotifier, "ozonIdNotifier");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f34271a = authEvents;
        this.f34272b = currentUserRepository;
        this.f34273c = ozonIdNotifier;
        this.f34274d = application;
    }

    public final void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f34272b.b().i()) {
            c(b.a.f34275a, true);
        } else {
            int i11 = LogoutActivity.f97174l;
            LogoutActivity.a.a(activity);
        }
    }

    public final void b() {
        String string = this.f34274d.getString(R.string.ozonid_error_technical_error_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f34273c.f(string);
    }

    public final void c(@NotNull b result, boolean z11) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f34271a.getValue().i(c.a(result, z11));
    }
}
