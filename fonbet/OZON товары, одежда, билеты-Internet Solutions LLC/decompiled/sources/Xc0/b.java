package Xc0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f34285a = new a();
    }

    /* renamed from: Xc0.b$b, reason: collision with other inner class name */
    public static final class C0615b implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0615b f34286a = new C0615b();
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f34287a;

        /* renamed from: b, reason: collision with root package name */
        private final int f34288b;

        public c(@NotNull String messageFormat, int i11) {
            Intrinsics.checkNotNullParameter(messageFormat, "messageFormat");
            this.f34287a = messageFormat;
            this.f34288b = i11;
        }

        @NotNull
        public final String a() {
            return this.f34287a;
        }

        public final int b() {
            return this.f34288b;
        }
    }
}
