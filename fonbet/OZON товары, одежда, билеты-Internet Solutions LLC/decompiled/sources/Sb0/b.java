package Sb0;

import Db0.f;
import De.C2862e;
import Kb0.K;
import Od0.a;
import Sc.InterfaceC4008j;
import Wb0.a;
import android.net.Uri;
import dc0.C6178x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<f> f26081a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f26082b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Wb0.c f26083c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C6178x f26084d;

    public b(@NotNull InterfaceC4008j activityLifecycleCallback, @NotNull C2862e scope, @NotNull Wb0.c ozonIdEventsLogger, @NotNull C6178x currentUserRepository) {
        Intrinsics.checkNotNullParameter(activityLifecycleCallback, "activityLifecycleCallback");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(ozonIdEventsLogger, "ozonIdEventsLogger");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f26081a = activityLifecycleCallback;
        this.f26082b = scope;
        this.f26083c = ozonIdEventsLogger;
        this.f26084d = currentUserRepository;
    }

    @NotNull
    public final Od0.a c(@NotNull Uri link) {
        Intrinsics.checkNotNullParameter(link, "link");
        String queryParameter = link.getQueryParameter("phone");
        if (queryParameter == null) {
            this.f26083c.b(Gb0.b.b(Gb0.d.FORCE_LOGIN), new a.InterfaceC0593a.b(), "phone is null");
            return new a.b("phone is null", null);
        }
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        k11.A().getValue().n(queryParameter);
        return new a.C0408a();
    }

    @NotNull
    public final a.C0408a d() {
        C10727i.c(this.f26082b, null, null, new a(this, null), 3);
        return new a.C0408a();
    }
}
