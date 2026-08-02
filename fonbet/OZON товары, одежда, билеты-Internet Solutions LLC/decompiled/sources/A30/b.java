package A30;

import C.C2702w;
import Sc.n;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f348a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q90.c f349b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f350c;

    public b(@NotNull SharedPreferences sharedPreferences, @NotNull Q90.c featureToggles) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        this.f348a = sharedPreferences;
        this.f349b = featureToggles;
        this.f350c = Sc.k.a(n.PUBLICATION, new a(this, 0));
    }

    public static S90.a a(b bVar) {
        return bVar.f349b.q(S90.c.MOB_FAST_BIO_AUTH);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final boolean b() {
        return ((S90.a) this.f350c.getValue()).b().isEnabled();
    }

    public final void c(boolean z11) {
        SharedPreferences sharedPreferences = this.f348a;
        if (z11) {
            if (b()) {
                C2702w.e(sharedPreferences, "FAST_ENTRY_KEY", true);
            }
        } else {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove("FAST_ENTRY_TOKEN_ID_KEY");
            edit.remove("FAST_ENTRY_KEY");
            edit.apply();
        }
    }

    public final String d() {
        return this.f348a.getString("FAST_ENTRY_TOKEN_ID_KEY", null);
    }

    public final boolean e() {
        return b() && this.f348a.getBoolean("FAST_ENTRY_KEY", false);
    }

    public final void f(@NotNull String tokenId) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        SharedPreferences.Editor edit = this.f348a.edit();
        edit.putString("FAST_ENTRY_TOKEN_ID_KEY", tokenId);
        edit.apply();
    }
}
