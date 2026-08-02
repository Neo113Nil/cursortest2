package Cd0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.inapp.push.sdk.internal.data.dto.ActionProcessResponse;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ve.EnumC10311b;

/* loaded from: classes3.dex */
public final class h {
    @NotNull
    public static final Gd0.a a(@NotNull ActionProcessResponse actionProcessResponse) {
        Long l11;
        Intrinsics.checkNotNullParameter(actionProcessResponse, "<this>");
        NotificationDTO notificationBar = actionProcessResponse.getNotificationBar();
        Integer refreshIntervalSec = actionProcessResponse.getRefreshIntervalSec();
        if (refreshIntervalSec != null) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            l11 = Long.valueOf(kotlin.time.b.h(kotlin.time.c.g(refreshIntervalSec.intValue(), EnumC10311b.SECONDS)));
        } else {
            l11 = null;
        }
        return new Gd0.a(notificationBar, l11, actionProcessResponse.getPixelUrl());
    }
}
