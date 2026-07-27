package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: io.appmetrica.analytics.impl.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0998z2 {

    /* renamed from: a, reason: collision with root package name */
    public final LocationManager f8656a;

    public C0998z2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public C0998z2(LocationManager locationManager) {
        this.f8656a = locationManager;
    }
}
