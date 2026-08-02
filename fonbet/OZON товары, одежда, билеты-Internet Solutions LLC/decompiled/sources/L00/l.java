package L00;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface l {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final C0307a f16132a = new C0307a();

        /* renamed from: L00.l$a$a, reason: collision with other inner class name */
        public static final class C0307a implements l {
            @Override // L00.l
            public final String get(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                return null;
            }

            @Override // L00.l
            public final List<String> headers(String str) {
                Intrinsics.checkNotNullParameter("server-timing", AppMeasurementSdk.ConditionalUserProperty.NAME);
                return K.f71697a;
            }

            @Override // L00.l
            public final Map<String, List<String>> toMultimap() {
                return U.c();
            }

            public final String toString() {
                return "EmptyHeaders";
            }
        }

        @NotNull
        public static C0307a a() {
            return f16132a;
        }
    }

    String get(@NotNull String str);

    @NotNull
    List<String> headers(@NotNull String str);

    @NotNull
    Map<String, List<String>> toMultimap();
}
