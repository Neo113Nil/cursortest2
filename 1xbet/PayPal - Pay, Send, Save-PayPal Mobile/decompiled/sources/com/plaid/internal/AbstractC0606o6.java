package com.plaid.internal;

/* renamed from: com.plaid.internal.o6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC0606o6 {

    /* renamed from: com.plaid.internal.o6$a */
    public static final class a extends com.plaid.internal.AbstractC0606o6 {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.AbstractC0606o6.a f6519a = new com.plaid.internal.AbstractC0606o6.a();

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.plaid.internal.AbstractC0606o6.a);
        }

        public final int hashCode() {
            return 637371670;
        }

        public final java.lang.String toString() {
            return "NotReady";
        }
    }

    /* renamed from: com.plaid.internal.o6$b */
    public static final class b extends com.plaid.internal.AbstractC0606o6 {
        public b(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /* renamed from: com.plaid.internal.o6$c */
    public static final class c extends com.plaid.internal.AbstractC0606o6 {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f6520a;

        public c(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.f6520a = str;
        }

        public final java.lang.String a() {
            return this.f6520a;
        }
    }

    /* renamed from: com.plaid.internal.o6$d */
    public static final class d extends com.plaid.internal.AbstractC0606o6 {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.AbstractC0606o6.d f6521a = new com.plaid.internal.AbstractC0606o6.d();

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.plaid.internal.AbstractC0606o6.d);
        }

        public final int hashCode() {
            return 1655299293;
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY;
        }
    }
}
