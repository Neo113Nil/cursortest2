package Ld;

import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface E {

    public static final class a implements E {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f16739a = new a();

        @Override // Ld.E
        @NotNull
        public final K a(@NotNull String packageFqName) {
            Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
            return K.f71697a;
        }
    }

    @NotNull
    K a(@NotNull String str);
}
