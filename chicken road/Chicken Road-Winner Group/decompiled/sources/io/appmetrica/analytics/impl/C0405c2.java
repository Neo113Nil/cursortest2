package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405c2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f7081a;

    /* renamed from: b, reason: collision with root package name */
    public final F2 f7082b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7083c;

    public C0405c2(List list, F2 f22, List list2) {
        this.f7081a = list;
        this.f7082b = f22;
        this.f7083c = list2;
    }

    public final String toString() {
        return "AppPermissionsState{mPermissionStateList=" + this.f7081a + ", mBackgroundRestrictionsState=" + this.f7082b + ", mAvailableProviders=" + this.f7083c + '}';
    }
}
