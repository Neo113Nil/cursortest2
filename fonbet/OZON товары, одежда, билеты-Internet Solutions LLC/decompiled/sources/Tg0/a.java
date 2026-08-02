package Tg0;

import Sc.r;
import Sc.s;
import android.app.Application;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f27167a;

    public a(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27167a = context;
    }

    public final boolean a(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            r.Companion companion = r.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(this.f27167a.getPackageManager().queryIntentActivities(intent, 65536), "queryIntentActivities(...)");
            return !r3.isEmpty();
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            Object a11 = s.a(th2);
            if (r.b(a11) != null) {
                a11 = Boolean.FALSE;
            }
            return ((Boolean) a11).booleanValue();
        }
    }
}
