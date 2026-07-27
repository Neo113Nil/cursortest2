package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class df {

    public static final class a extends df {

        /* renamed from: a, reason: collision with root package name */
        public final double f4733a;

        public a(double d) {
            super(null);
            this.f4733a = d;
        }

        public final double a() {
            return this.f4733a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Double.compare(this.f4733a, ((a) obj).f4733a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f4733a);
        }

        public String toString() {
            return "Fraction(fraction=" + this.f4733a + ")";
        }
    }

    public static final class b extends df {

        /* renamed from: a, reason: collision with root package name */
        public final long f4734a;

        public b(long j) {
            super(null);
            this.f4734a = j;
        }

        public final long a() {
            return this.f4734a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f4734a == ((b) obj).f4734a;
        }

        public int hashCode() {
            return Long.hashCode(this.f4734a);
        }

        public String toString() {
            return "TimeMs(ms=" + this.f4734a + ")";
        }
    }

    public /* synthetic */ df(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public df() {
    }
}
