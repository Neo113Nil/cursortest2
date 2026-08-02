package Q90;

import android.content.SharedPreferences;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final HashMap<O30.b, SharedPreferences> f23100a = new HashMap<>();

    public static final String a(@NotNull O30.b fintechLibType) {
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        SharedPreferences sharedPreferences = f23100a.get(fintechLibType);
        String string = sharedPreferences != null ? sharedPreferences.getString("FINTECH_FEATURES_SP_KEY", null) : null;
        L80.a.a("TABSFLOW_FT", "FeatureTogglesCache getFeatureFlags " + (string != null ? Integer.valueOf(string.length()) : null));
        return string;
    }

    public static final void b(@NotNull SharedPreferences sharedPreferences, @NotNull O30.b fintechLibType) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        HashMap<O30.b, SharedPreferences> hashMap = f23100a;
        if (hashMap.get(fintechLibType) == null) {
            hashMap.put(fintechLibType, sharedPreferences);
            L80.a.a("TABSFLOW_FT", "FeatureTogglesCache initCache for " + fintechLibType);
        }
    }

    public static final boolean c(@NotNull O30.b fintechLibType) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor remove;
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        SharedPreferences sharedPreferences = f23100a.get(fintechLibType);
        boolean commit = (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (remove = edit.remove("FINTECH_FEATURES_SP_KEY")) == null) ? false : remove.commit();
        L80.a.a("TABSFLOW_FT", "FeatureTogglesCache removeFeatureFlags");
        return commit;
    }

    public static final boolean d(@NotNull O30.b fintechLibType, @NotNull String listFlagsString) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(listFlagsString, "listFlagsString");
        SharedPreferences sharedPreferences = f23100a.get(fintechLibType);
        boolean commit = (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putString = edit.putString("FINTECH_FEATURES_SP_KEY", listFlagsString)) == null) ? false : putString.commit();
        L80.a.a("TABSFLOW_FT", "FeatureTogglesCache saveFeatureFlags");
        return commit;
    }

    public static final boolean e(@NotNull O30.b fintechLibType) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putLong;
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        SharedPreferences sharedPreferences = f23100a.get(fintechLibType);
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putLong = edit.putLong("FINTECH_FEATURES_TIME_SP_KEY", System.currentTimeMillis())) == null) {
            return false;
        }
        return putLong.commit();
    }
}
