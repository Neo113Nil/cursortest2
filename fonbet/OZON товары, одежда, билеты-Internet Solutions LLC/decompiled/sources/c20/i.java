package c20;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface i {

    public static final class a {
        @NotNull
        public static i a(@NotNull Sg.a analyticsScreenStorage, boolean z11) {
            Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
            return z11 ? new C5734b(analyticsScreenStorage) : C5733a.f56386a;
        }
    }

    boolean a();

    void b();

    void c(long j11, @NotNull Function0<Unit> function0);

    void clear();
}
