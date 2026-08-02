package ah0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.service.RemoteMessage;

/* renamed from: ah0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5024a {
    public static final boolean a(@NotNull RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "<this>");
        return Intrinsics.d(remoteMessage.b().get("category"), "service");
    }
}
