package io.flutter.plugin.platform;

import android.view.View;
import java.util.Arrays;

/* renamed from: io.flutter.plugin.platform.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC1049e implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f9254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9255b;

    public ViewOnSystemUiVisibilityChangeListenerC1049e(f fVar, View view) {
        this.f9255b = fVar;
        this.f9254a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i3) {
        this.f9254a.post(new Runnable() { // from class: io.flutter.plugin.platform.d
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3 & 4;
                f fVar = ViewOnSystemUiVisibilityChangeListenerC1049e.this.f9255b;
                if (i4 == 0) {
                    a1.e eVar = fVar.f9257b;
                    eVar.getClass();
                    ((T1.o) eVar.f1788b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    return;
                }
                a1.e eVar2 = fVar.f9257b;
                eVar2.getClass();
                ((T1.o) eVar2.f1788b).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
            }
        });
    }
}
