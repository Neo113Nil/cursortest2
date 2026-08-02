package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1721w {

    /* renamed from: a, reason: collision with root package name */
    public long f16073a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f16074b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f16075c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f16076d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f16077e = -1;
    public long f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f16078g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f16079h = -1;

    public static long a(long j5, long j6, long j7, long j8, long j9, long j10) {
        if (j8 + 1 >= j9 || 1 + j6 >= j7) {
            return j8;
        }
        long j11 = (long) (((j9 - j8) / (j7 - j6)) * (j5 - j6));
        return Math.max(j8, Math.min(((j8 + j11) - j10) - (j11 / 20), j9 - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
    
        if (r9.contains("REWARDED") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Context context, View view) {
        this.f16076d = this.f16075c;
        this.f16075c = SystemClock.uptimeMillis();
        long j5 = this.f16077e;
        if (j5 != -1) {
            this.f = j5;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        int i = displayMetrics.widthPixels * displayMetrics.heightPixels;
        if (view != null) {
            int min = Math.min(view.getHeight(), displayMetrics.heightPixels) * Math.min(view.getWidth(), displayMetrics.widthPixels);
            if (min + min < i) {
                if (min == 0) {
                    try {
                        if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                            view = ((ViewGroup) view).getChildAt(0);
                        }
                        Object invoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
                        Integer num = (Integer) invoke.getClass().getField("adType").get(invoke);
                        num.intValue();
                        String str = (String) invoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
                        if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                        }
                    } catch (ReflectiveOperationException | SecurityException unused2) {
                    }
                }
            }
            this.f16077e = this.f16075c;
            return;
        }
        this.f16077e = -1L;
    }
}
