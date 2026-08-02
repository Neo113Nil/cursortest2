package Wa0;

import Od0.e;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.host.config.debug.menu.HostConfigDebugMenuActivity;

/* loaded from: classes3.dex */
public final class a {
    @NotNull
    public static final e.a a(@NotNull Application application, @NotNull e.b deeplink) {
        String host;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Uri b11 = deeplink instanceof e.b.C0410b ? ((e.b.C0410b) deeplink).b() : deeplink instanceof e.b.a ? ((e.b.a) deeplink).b().getData() : null;
        if (!((b11 == null || (host = b11.getHost()) == null) ? false : host.equalsIgnoreCase("hostConfigSDK"))) {
            return new e.a.c();
        }
        int i11 = HostConfigDebugMenuActivity.f97127i;
        Intrinsics.checkNotNullParameter(application, "application");
        Intent intent = new Intent(application, (Class<?>) HostConfigDebugMenuActivity.class);
        intent.setData(b11);
        intent.setFlags(268435456);
        application.startActivity(intent);
        return new e.a.C0409a();
    }
}
