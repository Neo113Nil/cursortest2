package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0830c4 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f12967a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f12968b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (AbstractC0830c4.class) {
            if (f12967a.add(str)) {
                f12968b = f12968b + ", " + str;
            }
        }
    }
}
