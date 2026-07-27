package com.startapp.sdk.internal;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zb {

    /* renamed from: d, reason: collision with root package name */
    public static final zb f4793d = new zb();

    /* renamed from: a, reason: collision with root package name */
    public final String f4794a;

    /* renamed from: b, reason: collision with root package name */
    public final xb f4795b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4796c;

    public zb(Locale primary, LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.j.e(primary, "primary");
        this.f4794a = primary.toString();
        this.f4795b = new xb(linkedHashSet);
        this.f4796c = yb.a(primary, linkedHashSet, ',');
    }

    public zb() {
        this.f4794a = null;
        this.f4795b = null;
        this.f4796c = null;
    }
}
