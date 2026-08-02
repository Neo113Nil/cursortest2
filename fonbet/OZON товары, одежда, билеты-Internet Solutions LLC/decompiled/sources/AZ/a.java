package AZ;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: AZ.a$a, reason: collision with other inner class name */
    public static final class C0019a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f678a;

        public C0019a(@NotNull String message) {
            Intrinsics.checkNotNullParameter("OzonCompass", "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            this.f678a = message;
        }

        @NotNull
        public final String a() {
            return this.f678a;
        }
    }

    void a(@NotNull C0019a c0019a);
}
