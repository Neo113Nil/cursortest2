package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;

/* renamed from: com.google.android.gms.internal.ads.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1049h implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f13691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1137j f13692b;

    public C1049h(C1137j c1137j, DisplayManager displayManager) {
        this.f13692b = c1137j;
        this.f13691a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            C1137j.a(this.f13692b, this.f13691a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
