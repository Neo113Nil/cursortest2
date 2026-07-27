package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f4699a;
        public final la b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, la inLine) {
            super(null);
            Intrinsics.checkNotNullParameter(inLine, "inLine");
            this.f4699a = str;
            this.b = inLine;
        }

        public final a a(String str, la inLine) {
            Intrinsics.checkNotNullParameter(inLine, "inLine");
            return new a(str, inLine);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f4699a, aVar.f4699a) && Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            String str = this.f4699a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "InLineAd(id=" + this.f4699a + ", inLine=" + this.b + ")";
        }

        public static /* synthetic */ a a(a aVar, String str, la laVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f4699a;
            }
            if ((i & 2) != 0) {
                laVar = aVar.b;
            }
            return aVar.a(str, laVar);
        }

        public final la a() {
            return this.b;
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f4700a;
        public final nl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, nl wrapper) {
            super(null);
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            this.f4700a = str;
            this.b = wrapper;
        }

        public final nl a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f4700a, bVar.f4700a) && Intrinsics.areEqual(this.b, bVar.b);
        }

        public int hashCode() {
            String str = this.f4700a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "WrapperAd(id=" + this.f4700a + ", wrapper=" + this.b + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public c() {
    }
}
