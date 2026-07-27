package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class S4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f7885a;

    public static final class a extends S4 {
        private final long b;

        public a(long j) {
            super("scheduler_expired", null);
            this.b = j;
        }

        public final a a(long j) {
            return new a(j);
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public int hashCode() {
            return Long.hashCode(this.b);
        }

        public String toString() {
            return "SchedulerExpired(durationMs=" + this.b + ")";
        }

        public static /* synthetic */ a a(a aVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = aVar.b;
            }
            return aVar.a(j);
        }
    }

    public static final class b extends S4 {
        public static final b b = new b();

        private b() {
            super("show_flow", null);
        }
    }

    public static final class c extends S4 {
        public static final c b = new c();

        private c() {
            super("show_recovery", null);
        }
    }

    public /* synthetic */ S4(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f7885a;
    }

    private S4(String str) {
        this.f7885a = str;
    }
}
