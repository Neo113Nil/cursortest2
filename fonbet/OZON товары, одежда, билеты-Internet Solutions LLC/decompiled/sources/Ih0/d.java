package Ih0;

import ah0.C5024a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.service.RemoteMessage;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Zg0.g f12528a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f12529b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final g f12530c;

    public d(@NotNull Zg0.g configuration, @NotNull m sendPushStatusInteractor, @NotNull g savePushStatusInteractor) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(sendPushStatusInteractor, "sendPushStatusInteractor");
        Intrinsics.checkNotNullParameter(savePushStatusInteractor, "savePushStatusInteractor");
        this.f12528a = configuration;
        this.f12529b = sendPushStatusInteractor;
        this.f12530c = savePushStatusInteractor;
    }

    private final void a(b pushStatusData, boolean z11) {
        boolean m11 = this.f12528a.m();
        m mVar = this.f12529b;
        if (m11) {
            n senderPlace = n.NOTIFICATION_EXTENSION;
            Intrinsics.checkNotNullParameter(pushStatusData, "pushStatusData");
            Intrinsics.checkNotNullParameter(senderPlace, "senderPlace");
            Wh0.c.a(new j(pushStatusData, mVar, senderPlace));
            return;
        }
        if (z11) {
            Intrinsics.checkNotNullParameter(pushStatusData, "pushStatusData");
            Wh0.c.a(new k(pushStatusData, mVar));
        } else {
            g gVar = this.f12530c;
            Intrinsics.checkNotNullParameter(pushStatusData, "pushStatusData");
            Wh0.c.a(new f(pushStatusData, gVar));
        }
    }

    private static b e(RemoteMessage remoteMessage, a aVar, Long l11, String str, Boolean bool) {
        String str2 = remoteMessage.b().get("message_id");
        if (str2 == null) {
            return null;
        }
        return new b(str2, aVar, System.currentTimeMillis(), l11, str, bool, remoteMessage.b().get("priority"), remoteMessage.b().get("original_priority"), remoteMessage.b().get("first_message_id"));
    }

    public final void b(@NotNull RemoteMessage message, Boolean bool) {
        Intrinsics.checkNotNullParameter(message, "message");
        b e11 = e(message, a.OPEN, null, null, bool);
        if (e11 == null) {
            return;
        }
        a(e11, C5024a.a(message));
    }

    public final void c(@NotNull String str) {
        a(new b(str, a.OPEN, System.currentTimeMillis(), null, null, null, null, null, null), false);
    }

    public final void d(@NotNull RemoteMessage message, long j11, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(message, "message");
        b e11 = e(message, a.DELIVERY, Long.valueOf(j11), str, bool);
        if (e11 == null) {
            return;
        }
        a(e11, C5024a.a(message));
    }
}
