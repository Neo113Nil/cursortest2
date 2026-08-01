package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes5.dex */
public class k8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4274a;
    private final com.applovin.impl.sdk.p b;
    private final View c;

    public k8(View view, com.applovin.impl.sdk.l lVar) {
        this.f4274a = lVar;
        this.b = lVar.Q();
        this.c = view;
    }

    public long a(l3 l3Var) {
        long j;
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("ViewabilityTracker", "Checking visibility...");
        }
        Point b = p0.b(this.c.getContext());
        if (this.c.isShown()) {
            j = 0;
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("ViewabilityTracker", "View is hidden");
            }
            j = 2;
        }
        if (this.c.getAlpha() < l3Var.m0()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("ViewabilityTracker", "View is transparent");
            }
            j |= 4;
        }
        Animation animation = this.c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("ViewabilityTracker", "View is animating");
            }
            j |= 8;
        }
        if (this.c.getParent() == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("ViewabilityTracker", "No parent view found");
            }
            j |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.c.getContext(), this.c.getWidth());
        if (pxToDp < Math.min(l3Var.s0(), b.x)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            }
            j |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.c.getContext(), this.c.getHeight());
        if (pxToDp2 < l3Var.o0()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            }
            j |= 64;
        }
        Rect rect = new Rect(0, 0, b.x, b.y);
        int[] iArr = {-1, -1};
        this.c.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect2 = new Rect(i, iArr[1], this.c.getWidth() + i, iArr[1] + this.c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j |= 128;
        }
        Activity b2 = this.f4274a.e().b();
        if (b2 != null && !j8.a(this.c, b2)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j |= 256;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        }
        return j;
    }
}
