package io.flutter.plugin.platform;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class C {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z f14132i = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f14133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f14134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0913a f14135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f14138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f14139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public VirtualDisplay f14140h;

    public C(Activity activity, C0913a c0913a, VirtualDisplay virtualDisplay, f fVar, i iVar, n nVar, int i7) {
        this.f14134b = activity;
        this.f14135c = c0913a;
        this.f14138f = iVar;
        this.f14139g = nVar;
        this.f14137e = i7;
        this.f14140h = virtualDisplay;
        this.f14136d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.f14140h.getDisplay(), fVar, c0913a, i7, nVar);
        this.f14133a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f14133a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
