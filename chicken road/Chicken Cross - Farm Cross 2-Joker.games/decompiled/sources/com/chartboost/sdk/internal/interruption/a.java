package com.chartboost.sdk.internal.interruption;

import com.ironsource.mediationsdk.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    public static final C0231a b = new C0231a(null);
    public static final a c = new a("APP_LIFECYCLE");
    public static final a d = new a("AUDIO");
    public static final a e = new a(j.f);
    public static final a f = new a("CLICKTHROUGH");

    /* renamed from: a, reason: collision with root package name */
    public final String f5130a;

    /* renamed from: com.chartboost.sdk.internal.interruption.a$a, reason: collision with other inner class name */
    public static final class C0231a {
        public /* synthetic */ C0231a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.c;
        }

        public final a b() {
            return a.d;
        }

        public final a c() {
            return a.f;
        }

        public C0231a() {
        }
    }

    public a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f5130a = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f5130a, ((a) obj).f5130a);
    }

    public int hashCode() {
        return this.f5130a.hashCode();
    }

    public String toString() {
        return "InterruptionType(name=" + this.f5130a + ")";
    }
}
