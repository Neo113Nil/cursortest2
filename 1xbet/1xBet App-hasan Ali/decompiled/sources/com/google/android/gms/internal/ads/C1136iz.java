package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.iz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1136iz implements InterfaceC1271lz {

    /* renamed from: a, reason: collision with root package name */
    public final String f14023a;

    /* renamed from: b, reason: collision with root package name */
    public final C1419pB f14024b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1823yB f14025c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14026d;

    /* renamed from: e, reason: collision with root package name */
    public final UA f14027e;
    public final Integer f;

    public C1136iz(String str, C1419pB c1419pB, AbstractC1823yB abstractC1823yB, int i, UA ua, Integer num) {
        this.f14023a = str;
        this.f14024b = c1419pB;
        this.f14025c = abstractC1823yB;
        this.f14026d = i;
        this.f14027e = ua;
        this.f = num;
    }

    public static C1136iz a(String str, AbstractC1823yB abstractC1823yB, int i, UA ua, Integer num) {
        if (ua == UA.f11745o) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C1136iz(str, AbstractC1451pz.a(str), abstractC1823yB, i, ua, num);
    }
}
