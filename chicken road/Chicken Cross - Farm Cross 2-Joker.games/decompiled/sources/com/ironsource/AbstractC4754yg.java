package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.yg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4754yg {

    /* renamed from: com.ironsource.yg$a */
    public static final class a extends AbstractC4754yg {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC4736xg f8784a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC4736xg error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f8784a = error;
        }

        public final AbstractC4736xg a() {
            return this.f8784a;
        }

        public final AbstractC4736xg b() {
            return this.f8784a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f8784a, ((a) obj).f8784a);
        }

        public int hashCode() {
            return this.f8784a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f8784a + ")";
        }

        public final a a(AbstractC4736xg error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a(error);
        }

        public static /* synthetic */ a a(a aVar, AbstractC4736xg abstractC4736xg, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC4736xg = aVar.f8784a;
            }
            return aVar.a(abstractC4736xg);
        }
    }

    /* renamed from: com.ironsource.yg$b */
    public static final class b extends AbstractC4754yg {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8785a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC4754yg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4754yg() {
    }
}
