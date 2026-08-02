package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Long f3303a;
    public static final android.media.ToneGenerator b = new android.media.ToneGenerator(1, 100);

    public static void a(android.content.Context context, int i) {
        if (((android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility")).isEnabled()) {
            if (f3303a == null || java.lang.System.currentTimeMillis() - f3303a.longValue() >= 500 / i) {
                f3303a = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                b.startTone(24, 50);
            }
        }
    }
}
