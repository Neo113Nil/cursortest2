package Kg;

import B0.A0;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f15958a;

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("com.vk.id.tracking.tracer", "libraryPackageName");
        this.f15958a = context;
    }

    private final SharedPreferences a() {
        SharedPreferences sharedPreferences = this.f15958a.getSharedPreferences("tracer-com.vk.id.tracking.tracer", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…e\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    public final boolean b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis < a().getLong("system.shutdown.until.ts", Long.MIN_VALUE) || currentTimeMillis < a().getLong(A0.b("system.", str, ".shutdown.until.ts"), Long.MIN_VALUE);
    }

    public final void c(Long l11, String str, Long l12) {
        boolean z11;
        SharedPreferences.Editor edit = a().edit();
        boolean z12 = true;
        if (l11.longValue() > 0) {
            edit.putLong("system.shutdown.until.ts", l11.longValue() + System.currentTimeMillis());
            z11 = true;
        } else {
            z11 = false;
        }
        if (str == null || l12 == null || l12.longValue() <= 0) {
            z12 = z11;
        } else {
            edit.putLong(A0.b("system.", str, ".shutdown.until.ts"), l12.longValue() + System.currentTimeMillis());
        }
        if (z12) {
            edit.apply();
        }
    }
}
