package Ol0;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f20524a;

    public t(@NotNull Application application) {
        Dl0.a ruStorePushClient = Dl0.a.f6752a;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(ruStorePushClient, "ruStorePushClient");
        this.f20524a = application;
    }
}
