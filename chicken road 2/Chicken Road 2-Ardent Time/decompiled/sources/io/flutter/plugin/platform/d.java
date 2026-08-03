package io.flutter.plugin.platform;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f7744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.platform.e f7745b;

    public d(io.flutter.plugin.platform.e eVar, android.view.View view) {
        this.f7745b = eVar;
        this.f7744a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(final int i2) {
        this.f7744a.post(new java.lang.Runnable() { // from class: io.flutter.plugin.platform.c
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2 & 4;
                io.flutter.plugin.platform.e eVar = io.flutter.plugin.platform.d.this.f7745b;
                if (i3 == 0) {
                    x0.e eVar2 = eVar.f7747b;
                    eVar2.getClass();
                    ((I0.b) eVar2.f8409b).G("SystemChrome.systemUIChange", java.util.Arrays.asList(java.lang.Boolean.TRUE), null);
                    return;
                }
                x0.e eVar3 = eVar.f7747b;
                eVar3.getClass();
                ((I0.b) eVar3.f8409b).G("SystemChrome.systemUIChange", java.util.Arrays.asList(java.lang.Boolean.FALSE), null);
            }
        });
    }
}
