package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface X6 {

    public static final class a implements X6 {

        /* renamed from: a, reason: collision with root package name */
        private final U6 f8006a;

        public a(U6 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.f8006a = failure;
        }

        public final U6 a() {
            return this.f8006a;
        }

        public final U6 b() {
            return this.f8006a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f8006a, ((a) obj).f8006a);
        }

        public int hashCode() {
            return this.f8006a.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.f8006a + ")";
        }

        public final a a(U6 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return new a(failure);
        }

        public static /* synthetic */ a a(a aVar, U6 u6, int i, Object obj) {
            if ((i & 1) != 0) {
                u6 = aVar.f8006a;
            }
            return aVar.a(u6);
        }

        @Override // com.ironsource.X6
        public void a(Y6 handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            handler.a(this.f8006a);
        }
    }

    default void a(Y6 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }
}
