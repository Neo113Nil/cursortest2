package bh0;

import ch0.C5835a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.liveactivity.model.LiveActivitySelector;

/* renamed from: bh0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC5666b {

    /* renamed from: bh0.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(@NotNull LiveActivitySelector selector) {
            Intrinsics.checkNotNullParameter(selector, "selector");
        }
    }

    void onDismiss(@NotNull LiveActivitySelector liveActivitySelector);

    void onNewMessage(@NotNull LiveActivitySelector liveActivitySelector, @NotNull C5835a c5835a);
}
