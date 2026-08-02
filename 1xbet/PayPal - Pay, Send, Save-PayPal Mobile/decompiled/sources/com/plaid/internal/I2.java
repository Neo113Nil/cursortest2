package com.plaid.internal;

/* loaded from: classes16.dex */
public abstract class I2 {

    public static final class a extends com.plaid.internal.I2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f5807a;

        public a(int i) {
            this.f5807a = i;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.plaid.internal.I2.a) && this.f5807a == ((com.plaid.internal.I2.a) obj).f5807a;
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.f5807a);
        }

        public final java.lang.String toString() {
            int i = this.f5807a;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Delay(delayMillis=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class b extends com.plaid.internal.I2 {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.I2.b f5808a = new com.plaid.internal.I2.b();
    }

    public static final class c extends com.plaid.internal.I2 {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.I2.c f5809a = new com.plaid.internal.I2.c();
    }

    public static final class d extends com.plaid.internal.I2 {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.I2.d f5810a = new com.plaid.internal.I2.d();
    }
}
