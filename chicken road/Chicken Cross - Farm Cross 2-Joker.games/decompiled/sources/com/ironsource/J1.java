package com.ironsource;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f7709a;

    /* JADX WARN: Multi-variable type inference failed */
    public J1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Map<String, String> a() {
        return this.f7709a;
    }

    public final Map<String, String> b() {
        return this.f7709a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J1) && Intrinsics.areEqual(this.f7709a, ((J1) obj).f7709a);
    }

    public int hashCode() {
        return this.f7709a.hashCode();
    }

    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f7709a + ")";
    }

    public J1(Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        this.f7709a = mediationTypes;
    }

    public final J1 a(Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        return new J1(mediationTypes);
    }

    public /* synthetic */ J1(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ J1 a(J1 j1, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = j1.f7709a;
        }
        return j1.a(map);
    }
}
