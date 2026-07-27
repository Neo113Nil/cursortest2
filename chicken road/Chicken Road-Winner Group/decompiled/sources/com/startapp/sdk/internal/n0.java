package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final String f4076c = si.a(71, 13, -10, 14, -3, -6, -5, -54, 66, -11, 13, -5, -4, 10, 0, -10, 6, -1, -64, 19, 2, 0, 2, 14, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final String f4077d = si.a(66, 3, 5, -9);

    /* renamed from: e, reason: collision with root package name */
    public static final String f4078e = si.a(61, 12, -14, 17, 1, -14);
    public static final String f = si.a(56, -1, 2, 8, -4, 11, -3, 6, -7, -10);

    /* renamed from: g, reason: collision with root package name */
    public static final String f4079g = si.a(86, -19, 3, -12, -2, 19, -11, 6, -1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4080a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f4081b = new AtomicInteger(0);

    public n0(Context context) {
        this.f4080a = context;
    }

    public final String a() {
        Context context = this.f4080a;
        StringBuilder sb = new StringBuilder();
        String str = f4076c;
        sb.append(str);
        sb.append(f4078e);
        String str2 = f4079g;
        sb.append(str2);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        String l3 = B0.c.l(sb3, f4077d, str2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        int[] a3 = si.a(context, sb2, l3, B0.c.l(sb4, f, str2));
        StringBuilder sb5 = new StringBuilder(a3.length);
        for (int i3 : a3) {
            sb5.append(i3);
        }
        return sb5.toString();
    }
}
