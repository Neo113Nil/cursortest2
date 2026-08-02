package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: com.google.android.gms.internal.ads.dH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888dH implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1112iH f13112a;

    public C0888dH(C1112iH c1112iH) {
        this.f13112a = c1112iH;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z3) {
        this.f13112a.f();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z3) {
        this.f13112a.f();
    }
}
