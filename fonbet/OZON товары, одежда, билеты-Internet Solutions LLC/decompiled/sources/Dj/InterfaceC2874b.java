package Dj;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Dj.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC2874b {

    /* renamed from: Dj.b$a */
    /* loaded from: classes10.dex */
    public static final class a {
        public static void b(@NotNull InterfaceC2874b interfaceC2874b, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            interfaceC2874b.b(EnumC2873a.INFO, message, null, null);
        }

        public static void d(@NotNull InterfaceC2874b interfaceC2874b, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            interfaceC2874b.b(EnumC2873a.WARNING, message, null, null);
        }
    }

    void a(@NotNull String str);

    void b(@NotNull EnumC2873a enumC2873a, @NotNull String str, LinkedHashMap linkedHashMap, Boolean bool);
}
