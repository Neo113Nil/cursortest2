package L30;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"MissingPermission"})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f16491a;

    public d(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        this.f16491a = app;
    }

    private final Vibrator a() {
        Object systemService = this.f16491a.getSystemService("vibrator");
        if (systemService instanceof Vibrator) {
            return (Vibrator) systemService;
        }
        return null;
    }

    public final void b() {
        Vibrator a11 = a();
        if (a11 != null) {
            a11.vibrate(VibrationEffect.createWaveform(new long[]{100, 20, 100, 20, 100, 20, 100, 20, 100, 10}, new int[]{100, 10, 80, 10, 60, 10, 40, 5, 20, 1}, -1));
        }
    }

    public final void c() {
        Vibrator a11 = a();
        if (a11 != null) {
            a11.vibrate(VibrationEffect.createOneShot(5L, -1));
        }
    }

    public final void d() {
        Vibrator a11 = a();
        if (a11 != null) {
            a11.vibrate(VibrationEffect.createWaveform(new long[]{200, 20, 200}, new int[]{50, 10, 100}, -1));
        }
    }

    public final void e() {
        Vibrator a11 = a();
        if (a11 != null) {
            a11.vibrate(VibrationEffect.createWaveform(new long[]{100, 20, 100, 20, 100, 20}, new int[]{100, 10, 50, 5, 20, 0}, -1));
        }
    }

    public final void f(long j11) {
        Vibrator a11 = a();
        if (a11 != null) {
            a11.vibrate(VibrationEffect.createOneShot(j11, -1));
        }
    }
}
