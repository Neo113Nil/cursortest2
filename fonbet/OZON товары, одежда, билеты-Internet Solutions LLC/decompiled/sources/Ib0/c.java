package Ib0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class c {

    public static abstract class a {

        /* renamed from: Ib0.c$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0238a extends a {
        }

        public static abstract class b extends a {
        }

        /* renamed from: Ib0.c$a$c, reason: collision with other inner class name */
        public static abstract class AbstractC0239c extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f12132a;

            public AbstractC0239c(@NotNull String otpResponseToken) {
                Intrinsics.checkNotNullParameter(otpResponseToken, "otpResponseToken");
                this.f12132a = otpResponseToken;
            }

            @NotNull
            public final String a() {
                return this.f12132a;
            }
        }
    }

    public abstract void onOtpFlowResult(@NotNull a aVar);
}
