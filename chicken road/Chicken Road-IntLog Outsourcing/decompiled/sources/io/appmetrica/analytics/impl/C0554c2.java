package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0554c2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f7968a;

    /* renamed from: b, reason: collision with root package name */
    public final F2 f7969b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7970c;

    public C0554c2(List list, F2 f22, List list2) {
        this.f7968a = list;
        this.f7969b = f22;
        this.f7970c = list2;
    }

    public final String toString() {
        return "AppPermissionsState{mPermissionStateList=" + this.f7968a + ", mBackgroundRestrictionsState=" + this.f7969b + ", mAvailableProviders=" + this.f7970c + '}';
    }
}
