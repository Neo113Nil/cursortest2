package T90;

import android.content.SharedPreferences;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.settings.models.Pin;
import ru.ozon.fintech.settings.models.Pins;
import ru.ozon.fintech.settings.models.Sign;
import ru.ozon.fintech.settings.network.SettingsNetworkPins;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Pin f26929f = new Pin("2025-05-10T15:51:03Z", "aRVG5WZPFjC/9fvqNUopN3SW7T+NeTmbI82GOuQdpGs=");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SettingsNetworkPins f26930a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f26931b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Ib.a<SharedPreferences> f26932c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final JsonAdapter<Pins> f26933d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Pins f26934e;

    public f(@NotNull SettingsNetworkPins settingsNetworkPins, @NotNull InterfaceC6618a analyticInteractor, @NotNull Ib.a<SharedPreferences> sharedPreferences, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(settingsNetworkPins, "settingsNetworkPins");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f26930a = settingsNetworkPins;
        this.f26931b = analyticInteractor;
        this.f26932c = sharedPreferences;
        JsonAdapter<Pins> c11 = moshi.c(Pins.class);
        Intrinsics.checkNotNullExpressionValue(c11, "adapter(...)");
        this.f26933d = c11;
        Intrinsics.checkNotNullExpressionValue(moshi.c(Sign.class), "adapter(...)");
    }

    public final Pins a() {
        if (this.f26934e == null) {
            String string = this.f26932c.get().getString("FINTECH_SOFT_PINS_SP_KEY", null);
            this.f26934e = string != null ? this.f26933d.fromJson(string) : new Pins(C7714v.a0(f26929f), S90.e.HARD);
        }
        return this.f26934e;
    }
}
