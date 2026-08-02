package V2;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f27957a = new LinkedHashSet();

    @NotNull
    public static final U2.b a(@NotNull Context context, @NotNull Set keysToMigrate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("vkpns_client_sdk", "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate != f27957a) {
            return new U2.b(context, keysToMigrate, new k(keysToMigrate, null), new j(3, null));
        }
        return new U2.b(context, U2.d.a(), new k(keysToMigrate, null), new j(3, null));
    }

    @NotNull
    public static final U2.b<W2.f> b(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate) {
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate != f27957a) {
            return new U2.b<>(produceSharedPreferences, keysToMigrate, new k(keysToMigrate, null), new j(3, null));
        }
        return new U2.b<>(produceSharedPreferences, U2.d.a(), new k(keysToMigrate, null), new j(3, null));
    }

    @NotNull
    public static final LinkedHashSet c() {
        return f27957a;
    }
}
