package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.l5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1233l5 {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f14317e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public long f14318a;

    /* renamed from: b, reason: collision with root package name */
    public long f14319b;

    /* renamed from: c, reason: collision with root package name */
    public long f14320c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14321d;

    public static C1233l5 a(Context context, Executor executor) {
        String[] strArr = f14317e;
        C1233l5 c1233l5 = new C1233l5();
        c1233l5.f14318a = 0L;
        c1233l5.f14319b = 0L;
        c1233l5.f14320c = -1L;
        c1233l5.f14321d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new C1188k5(c1233l5));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return c1233l5;
    }
}
