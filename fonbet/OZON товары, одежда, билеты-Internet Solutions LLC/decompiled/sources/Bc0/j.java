package Bc0;

import Kb0.K;
import N4.a;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f3540a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<String> f3541b;

    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3542b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            try {
                return N4.c.a(N4.c.f18682a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public j(@NotNull K di) {
        Intrinsics.checkNotNullParameter(di, "di");
        this.f3540a = di;
        this.f3541b = Sc.k.b(a.f3542b);
    }

    @NotNull
    public final SharedPreferences a() {
        String value = this.f3541b.getValue();
        K k11 = this.f3540a;
        N4.a aVar = null;
        if (value != null) {
            try {
                aVar = N4.a.b("OZON_PREFS_ENCRYPTED", value, k11.m(), a.c.AES256_SIV, a.d.AES256_GCM);
            } catch (Exception unused) {
            }
        }
        if (aVar != null) {
            return aVar;
        }
        SharedPreferences sharedPreferences = k11.m().getSharedPreferences("OZON_PREFS", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
