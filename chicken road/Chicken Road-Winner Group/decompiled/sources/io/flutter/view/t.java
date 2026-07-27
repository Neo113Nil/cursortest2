package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static t f9465e;
    public static r f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f9467b;

    /* renamed from: a, reason: collision with root package name */
    public long f9466a = -1;

    /* renamed from: c, reason: collision with root package name */
    public s f9468c = new s(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final c f9469d = new c(this);

    public t(FlutterJNI flutterJNI) {
        this.f9467b = flutterJNI;
    }

    public static t a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f9465e == null) {
            f9465e = new t(flutterJNI);
        }
        if (f == null) {
            t tVar = f9465e;
            Objects.requireNonNull(tVar);
            r rVar = new r(tVar, displayManager);
            f = rVar;
            displayManager.registerDisplayListener(rVar, null);
        }
        if (f9465e.f9466a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f9465e.f9466a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f9465e;
    }
}
