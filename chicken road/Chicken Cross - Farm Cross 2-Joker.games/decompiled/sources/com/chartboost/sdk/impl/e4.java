package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class e4 {

    public static final class a extends e4 {

        /* renamed from: a, reason: collision with root package name */
        public final List f4743a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List clickTrackingUrls, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
            this.f4743a = clickTrackingUrls;
            this.b = str;
        }

        @Override // com.chartboost.sdk.impl.e4
        public String a() {
            return this.b;
        }

        @Override // com.chartboost.sdk.impl.e4
        public List b() {
            return this.f4743a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f4743a, aVar.f4743a) && Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.f4743a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CtaClick(clickTrackingUrls=" + this.f4743a + ", clickThroughUrl=" + this.b + ")";
        }
    }

    public static final class b extends e4 {

        /* renamed from: a, reason: collision with root package name */
        public final List f4744a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List clickTrackingUrls, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
            this.f4744a = clickTrackingUrls;
            this.b = str;
        }

        @Override // com.chartboost.sdk.impl.e4
        public String a() {
            return this.b;
        }

        @Override // com.chartboost.sdk.impl.e4
        public List b() {
            return this.f4744a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f4744a, bVar.f4744a) && Intrinsics.areEqual(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.f4744a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "GeneralClick(clickTrackingUrls=" + this.f4744a + ", clickThroughUrl=" + this.b + ")";
        }
    }

    public static final class c extends e4 {

        /* renamed from: a, reason: collision with root package name */
        public final List f4745a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List clickTrackingUrls, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
            this.f4745a = clickTrackingUrls;
            this.b = str;
        }

        @Override // com.chartboost.sdk.impl.e4
        public String a() {
            return this.b;
        }

        @Override // com.chartboost.sdk.impl.e4
        public List b() {
            return this.f4745a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f4745a, cVar.f4745a) && Intrinsics.areEqual(this.b, cVar.b);
        }

        public int hashCode() {
            int hashCode = this.f4745a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "VastCompanionClick(clickTrackingUrls=" + this.f4745a + ", clickThroughUrl=" + this.b + ")";
        }
    }

    public static final class d extends e4 {

        /* renamed from: a, reason: collision with root package name */
        public final List f4746a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List clickTrackingUrls, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
            this.f4746a = clickTrackingUrls;
            this.b = str;
        }

        @Override // com.chartboost.sdk.impl.e4
        public String a() {
            return this.b;
        }

        @Override // com.chartboost.sdk.impl.e4
        public List b() {
            return this.f4746a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f4746a, dVar.f4746a) && Intrinsics.areEqual(this.b, dVar.b);
        }

        public int hashCode() {
            int hashCode = this.f4746a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "VastVideoClick(clickTrackingUrls=" + this.f4746a + ", clickThroughUrl=" + this.b + ")";
        }
    }

    public /* synthetic */ e4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public abstract List b();

    public final q4 c() {
        if (this instanceof a) {
            return q4.c;
        }
        if (this instanceof c) {
            return q4.e;
        }
        if ((this instanceof d) || (this instanceof b)) {
            return q4.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public e4() {
    }
}
