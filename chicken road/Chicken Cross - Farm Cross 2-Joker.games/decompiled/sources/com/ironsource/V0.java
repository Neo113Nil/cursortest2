package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface V0 {

    public static final class a implements V0 {

        /* renamed from: a, reason: collision with root package name */
        private final String f7955a;

        public a(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f7955a = reason;
        }

        public final String a() {
            return this.f7955a;
        }

        public final String b() {
            return this.f7955a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f7955a, ((a) obj).f7955a);
        }

        public int hashCode() {
            return this.f7955a.hashCode();
        }

        public String toString() {
            return "Invalid(reason=" + this.f7955a + ")";
        }

        public final a a(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new a(reason);
        }

        public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f7955a;
            }
            return aVar.a(str);
        }
    }

    public static final class b implements V0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7956a = new b();

        private b() {
        }
    }
}
