package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.WeakHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾕ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1312 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static C1312 f3782;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f3783 = StringFog.decrypt("iFQ5XSAUShy6Wz5zKAtqFqFdJGwkCmgarF0=\n", "zzhWP0F4HnM=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public C0384 f3786;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final WeakHashMap f3785 = new WeakHashMap();

    /* renamed from: ｋ, reason: contains not printable characters */
    public C0744 f3784 = new C0744(-1, -1, -1, -1);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5946(C1312 c1312, ViewGroup viewGroup, ViewOnLayoutChangeListenerC0381 viewOnLayoutChangeListenerC0381) {
        boolean z;
        c1312.getClass();
        if (viewGroup != null) {
            try {
                if (viewGroup.getChildCount() != 0) {
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        if (viewGroup.getChildAt(i) instanceof TextView) {
                        }
                    }
                    return;
                }
            } catch (Throwable th) {
                String str = f3783;
                AbstractC0544.m5511(str, str, StringFog.decrypt("kKoepZrQmGywuwejhpfbbbP4OqONh7x2uq0c6ouflXC0sQK5yJ+VaKz4OK+QhK1tsK8f\n", "1dhsyujw+wQ=\n"), th, null, false);
            }
            Activity m5342 = AbstractC4297a.m5342(viewGroup);
            C0747 m5649 = C0747.m5649();
            synchronized (m5649) {
                z = EnumC0753.f2091 == m5649.m5652(m5342);
            }
            if (z) {
                if (viewGroup.findViewById(160766228) == null) {
                    c1312.m5950(viewGroup, viewOnLayoutChangeListenerC0381);
                }
            } else if (C0747.m5649().m5651(m5342)) {
                new Handler(Looper.getMainLooper()).post(new C0326(c1312, viewGroup, new C0343(c1312), viewOnLayoutChangeListenerC0381));
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m5947() {
        if (this.f3786 != null) {
            for (ViewGroup viewGroup : this.f3785.keySet()) {
                ViewParent parent = viewGroup.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(viewGroup);
                }
            }
            this.f3785.clear();
            C1188.m5907().m5908(this.f3786);
            this.f3786 = null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m5948() {
        if (this.f3786 == null) {
            this.f3786 = new C0384(this);
            C1188.m5907().m5909(this.f3786);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized C0744 m5949() {
        return this.f3784;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5945(C1312 c1312, MotionEvent motionEvent) {
        c1312.getClass();
        try {
            AbstractC1145.m5892(new C0322(c1312, MotionEvent.obtain(motionEvent)));
        } catch (Throwable th) {
            AbstractC0480.m5464(f3783, StringFog.decrypt("vOsL+vIDm1qN7RD75wOIUIz6EbXyQotn2fYLtfJCi2Y=\n", "+Zl5lYAj/D8=\n"), th, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C1312 m5944() {
        C1312 c1312;
        synchronized (C1312.class) {
            if (f3782 == null) {
                f3782 = new C1312();
            }
            c1312 = f3782;
        }
        return c1312;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5950(ViewGroup viewGroup, ViewOnLayoutChangeListenerC0381 viewOnLayoutChangeListenerC0381) {
        C0369 c0369 = new C0369(this, viewGroup.getContext());
        c0369.setAlpha(0.0f);
        synchronized (this) {
            this.f3785.put(c0369, new Object());
        }
        c0369.setId(160766228);
        new Handler(Looper.getMainLooper()).post(new C0356(viewGroup, c0369, viewOnLayoutChangeListenerC0381));
    }
}
