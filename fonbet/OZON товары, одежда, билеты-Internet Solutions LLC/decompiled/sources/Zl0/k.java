package Zl0;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f36066a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Za.d f36067b;

    public k(@NotNull Context context, @NotNull Za.d logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f36066a = context;
        this.f36067b = logger.c("ClientServiceStarter");
    }

    public final void a() {
        Za.d dVar = this.f36067b;
        dVar.info("Trying to start the client app service");
        int i11 = Ul0.a.f27834h;
        Intent intent = new Intent("ru.rustore.sdk.pushclient.MESSAGING_EVENT");
        Context context = this.f36066a;
        intent.setPackage(context.getPackageName());
        try {
            context.startService(intent);
        } catch (IllegalStateException e11) {
            dVar.b("Unable to start service, possible background limitations: " + e11.getMessage(), null);
        } catch (Exception e12) {
            dVar.b("Unable to start service", e12);
        }
    }
}
