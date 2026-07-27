package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class d {
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Long f10756a;

    public d(Long l) {
        this.f10756a = l;
    }

    public final Long a() {
        return this.f10756a;
    }

    public final Long b() {
        return this.f10756a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.f10756a, ((d) obj).f10756a);
    }

    public int hashCode() {
        Long l = this.f10756a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        return "AppDirInfo(appDirSize=" + this.f10756a + ')';
    }

    public final d a(Long l) {
        return new d(l);
    }

    public static /* synthetic */ d a(d dVar, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = dVar.f10756a;
        }
        return dVar.a(l);
    }
}
