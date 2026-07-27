package io.flutter.plugin.platform;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.view.View;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: i, reason: collision with root package name */
    public static final z f9239i = new z();

    /* renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f9240a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f9241b;

    /* renamed from: c, reason: collision with root package name */
    public final C1045a f9242c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9243d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9244e;
    public final i f;

    /* renamed from: g, reason: collision with root package name */
    public final m f9245g;

    /* renamed from: h, reason: collision with root package name */
    public VirtualDisplay f9246h;

    public D(Activity activity, C1045a c1045a, VirtualDisplay virtualDisplay, g gVar, i iVar, m mVar, int i3) {
        this.f9241b = activity;
        this.f9242c = c1045a;
        this.f = iVar;
        this.f9245g = mVar;
        this.f9244e = i3;
        this.f9246h = virtualDisplay;
        this.f9243d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.f9246h.getDisplay(), gVar, c1045a, i3, mVar);
        this.f9240a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f9240a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
