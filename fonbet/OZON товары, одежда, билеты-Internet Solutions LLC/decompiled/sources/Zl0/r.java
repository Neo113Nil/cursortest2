package Zl0;

import Sc.InterfaceC4008j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class r extends Cb.a {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f36098e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f36099f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f36100g;

    public r(@NotNull InterfaceC4008j<? extends l> messagesIPCInteractorLazy, @NotNull InterfaceC4008j<? extends g> clientServiceInteractorLazy, @NotNull InterfaceC4008j<? extends Za.d> loggerLazy) {
        Intrinsics.checkNotNullParameter(messagesIPCInteractorLazy, "messagesIPCInteractorLazy");
        Intrinsics.checkNotNullParameter(clientServiceInteractorLazy, "clientServiceInteractorLazy");
        Intrinsics.checkNotNullParameter(loggerLazy, "loggerLazy");
        attachInterface(this, "com.vk.push.core.push.PushClient");
        this.f36098e = messagesIPCInteractorLazy;
        this.f36099f = clientServiceInteractorLazy;
        this.f36100g = loggerLazy;
    }
}
