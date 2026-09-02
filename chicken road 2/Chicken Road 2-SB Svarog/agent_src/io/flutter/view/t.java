package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static t f846e;

    /* renamed from: f, reason: collision with root package name */
    public static r f847f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f849b;

    /* renamed from: a, reason: collision with root package name */
    public long f848a = -1;

    /* renamed from: c, reason: collision with root package name */
    public s f850c = new s(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final c f851d = new c(this);

    public t(FlutterJNI flutterJNI) {
        this.f849b = flutterJNI;
    }

    public static t a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f846e == null) {
            f846e = new t(flutterJNI);
        }
        if (f847f == null) {
            t tVar = f846e;
            Objects.requireNonNull(tVar);
            r rVar = new r(tVar, displayManager);
            f847f = rVar;
            displayManager.registerDisplayListener(rVar, null);
        }
        if (f846e.f848a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f846e.f848a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f846e;
    }
}
