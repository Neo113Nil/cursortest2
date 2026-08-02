package Nl0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Za.d f19647a;

    public o() {
        throw null;
    }

    public o(Pl0.p testPushRequestClientInitializer, Za.d rootLogger) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b dispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(testPushRequestClientInitializer, "testPushRequestClientInitializer");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(rootLogger, "rootLogger");
        this.f19647a = rootLogger.a(this);
    }
}
