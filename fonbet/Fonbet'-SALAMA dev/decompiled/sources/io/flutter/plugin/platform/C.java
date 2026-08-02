package io.flutter.plugin.platform;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.view.View;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: i, reason: collision with root package name */
    public static final z f14126i = new z();

    /* renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f14127a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f14128b;

    /* renamed from: c, reason: collision with root package name */
    public final C1294a f14129c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14130d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14131e;

    /* renamed from: f, reason: collision with root package name */
    public final i f14132f;

    /* renamed from: g, reason: collision with root package name */
    public final n f14133g;

    /* renamed from: h, reason: collision with root package name */
    public VirtualDisplay f14134h;

    public C(Activity activity, C1294a c1294a, VirtualDisplay virtualDisplay, f fVar, i iVar, n nVar, int i7) {
        this.f14128b = activity;
        this.f14129c = c1294a;
        this.f14132f = iVar;
        this.f14133g = nVar;
        this.f14131e = i7;
        this.f14134h = virtualDisplay;
        this.f14130d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.f14134h.getDisplay(), fVar, c1294a, i7, nVar);
        this.f14127a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f14127a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
