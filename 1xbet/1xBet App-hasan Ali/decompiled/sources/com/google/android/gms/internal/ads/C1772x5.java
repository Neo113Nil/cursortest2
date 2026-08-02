package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1772x5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0965f5 f16221a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16222b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16223c;

    /* renamed from: e, reason: collision with root package name */
    public final Class[] f16225e;

    /* renamed from: d, reason: collision with root package name */
    public volatile Method f16224d = null;
    public final CountDownLatch f = new CountDownLatch(1);

    public C1772x5(C0965f5 c0965f5, String str, String str2, Class... clsArr) {
        this.f16221a = c0965f5;
        this.f16222b = str;
        this.f16223c = str2;
        this.f16225e = clsArr;
        c0965f5.f13439b.submit(new K4(3, this));
    }
}
