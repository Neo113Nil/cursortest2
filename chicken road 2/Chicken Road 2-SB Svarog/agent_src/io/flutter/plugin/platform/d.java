package io.flutter.plugin.platform;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f667b;

    public d(e eVar, View view) {
        this.f667b = eVar;
        this.f666a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i2) {
        this.f666a.post(new Runnable() { // from class: io.flutter.plugin.platform.c
            @Override // java.lang.Runnable
            public final void run() {
                C.a aVar = d.this.f667b.f669b;
                if ((i2 & 4) == 0) {
                    ((E.b) aVar.f4c).e("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                } else {
                    ((E.b) aVar.f4c).e("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                }
            }
        });
    }
}
