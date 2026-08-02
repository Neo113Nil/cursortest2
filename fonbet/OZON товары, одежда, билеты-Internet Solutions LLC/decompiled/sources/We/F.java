package We;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public enum F {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final a Companion = new a();
    private final String protocol;

    public static final class a {
        @NotNull
        public static F a(@NotNull String protocol) throws IOException {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            F f7 = F.HTTP_1_0;
            if (protocol.equals(f7.protocol)) {
                return f7;
            }
            F f11 = F.HTTP_1_1;
            if (protocol.equals(f11.protocol)) {
                return f11;
            }
            F f12 = F.H2_PRIOR_KNOWLEDGE;
            if (protocol.equals(f12.protocol)) {
                return f12;
            }
            F f13 = F.HTTP_2;
            if (protocol.equals(f13.protocol)) {
                return f13;
            }
            F f14 = F.SPDY_3;
            if (protocol.equals(f14.protocol)) {
                return f14;
            }
            F f15 = F.QUIC;
            if (protocol.equals(f15.protocol)) {
                return f15;
            }
            throw new IOException("Unexpected protocol: ".concat(protocol));
        }
    }

    F(String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        return this.protocol;
    }
}
