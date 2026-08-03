package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7192a = 0;

    public static final class a extends com.moloco.sdk.internal.services.A {
        public static final int c = 0;
        public final java.lang.String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String carrier) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(carrier, "carrier");
            this.b = carrier;
        }

        public final java.lang.String a() {
            return this.b;
        }
    }

    public static final class b extends com.moloco.sdk.internal.services.A {
        public static final com.moloco.sdk.internal.services.A.b b = new com.moloco.sdk.internal.services.A.b();
        public static final int c = 0;

        public b() {
            super(null);
        }
    }

    public static final class c extends com.moloco.sdk.internal.services.A {
        public static final com.moloco.sdk.internal.services.A.c b = new com.moloco.sdk.internal.services.A.c();
        public static final int c = 0;

        public c() {
            super(null);
        }
    }

    public /* synthetic */ A(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public A() {
    }
}
