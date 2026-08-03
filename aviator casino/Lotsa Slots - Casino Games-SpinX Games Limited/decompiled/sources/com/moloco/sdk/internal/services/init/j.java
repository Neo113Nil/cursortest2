package com.moloco.sdk.internal.services.init;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7295a = 0;

    public static final class a extends com.moloco.sdk.internal.services.init.j {
        public static final int c = 0;
        public final com.moloco.sdk.internal.services.init.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.internal.services.init.b type) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
            this.b = type;
        }

        public final com.moloco.sdk.internal.services.init.b a() {
            return this.b;
        }
    }

    public static final class b extends com.moloco.sdk.internal.services.init.j {
        public static final int c = 0;
        public final int b;

        public b(int i) {
            super(null);
            this.b = i;
        }

        public final int a() {
            return this.b;
        }
    }

    public /* synthetic */ j(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public j() {
    }
}
