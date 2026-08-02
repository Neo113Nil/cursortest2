package Fl0;

import com.vk.push.common.messaging.RemoteMessage;
import db.InterfaceC6134a;
import fb.InterfaceC6490a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a implements InterfaceC6490a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC6134a f9510a;

    public a(@NotNull InterfaceC6134a topicComponent) {
        Intrinsics.checkNotNullParameter(topicComponent, "topicComponent");
        this.f9510a = topicComponent;
    }

    @Override // fb.InterfaceC6490a
    public final boolean a(@NotNull RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        boolean d11 = Intrinsics.d(remoteMessage.e(), "ru.vk.store_ads");
        if (d11) {
            this.f9510a.b();
        }
        return d11;
    }
}
