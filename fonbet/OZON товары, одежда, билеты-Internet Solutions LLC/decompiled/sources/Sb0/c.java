package Sb0;

import Db0.f;
import Kb0.K;
import Od0.a;
import Sc.InterfaceC4008j;
import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<f> f26085a;

    public c(@NotNull InterfaceC4008j<f> activityLifecycleCallback) {
        Intrinsics.checkNotNullParameter(activityLifecycleCallback, "activityLifecycleCallback");
        this.f26085a = activityLifecycleCallback;
    }

    @NotNull
    public final a.C0408a a() {
        Activity d11 = this.f26085a.getValue().d();
        if (d11 != null) {
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            k11.K().getValue().a(d11);
        }
        return new a.C0408a();
    }
}
