package o;

import A0.j;
import Y1.C0077a;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;

/* renamed from: o.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147e {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f10135a;

    /* renamed from: b, reason: collision with root package name */
    public final C0077a f10136b;

    /* renamed from: c, reason: collision with root package name */
    public ActivityOptions f10137c;

    /* renamed from: d, reason: collision with root package name */
    public SparseArray f10138d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f10139e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10140g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10141h;

    public C1147e(j jVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f10135a = intent;
        this.f10136b = new C0077a(14);
        this.f = 0;
        this.f10140g = true;
        if (jVar != null) {
            intent.setPackage(((ComponentName) jVar.f68d).getPackageName());
            BinderC1143a binderC1143a = (BinderC1143a) jVar.f67c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC1143a);
            intent.putExtras(bundle);
        }
    }

    public final void a(int i3, j jVar) {
        if (i3 < 0 || i3 > 2 || i3 == 0) {
            throw new IllegalArgumentException(B0.c.h(i3, "Invalid colorScheme: "));
        }
        if (this.f10138d == null) {
            this.f10138d = new SparseArray();
        }
        this.f10138d.put(i3, jVar.Q());
    }

    public final void b(int i3, int i4) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
        }
        if (i4 < 0 || i4 > 2) {
            throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
        }
        Intent intent = this.f10135a;
        intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i3);
        intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i4);
    }
}
