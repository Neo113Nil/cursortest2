package com.unity3d.ironsourceads.internal.services;

/* loaded from: classes5.dex */
public interface a {

    /* renamed from: com.unity3d.ironsourceads.internal.services.a$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ com.unity3d.ironsourceads.internal.services.a.AbstractC0329a a(com.unity3d.ironsourceads.internal.services.a aVar, android.content.Context context, com.ironsource.EnumC3131k9 enumC3131k9, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
            }
            if ((i & 2) != 0) {
                enumC3131k9 = com.ironsource.EnumC3131k9.APP_ACTIVITY;
            }
            return aVar.a(context, enumC3131k9);
        }
    }

    /* renamed from: com.unity3d.ironsourceads.internal.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0329a {

        /* renamed from: com.unity3d.ironsourceads.internal.services.a$a$a, reason: collision with other inner class name */
        public static final class C0330a extends com.unity3d.ironsourceads.internal.services.a.AbstractC0329a {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.String f8019a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0330a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final java.lang.String a() {
                return this.f8019a;
            }

            public final java.lang.String b() {
                return this.f8019a;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f8019a, ((com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a) obj).f8019a);
            }

            public int hashCode() {
                return this.f8019a.hashCode();
            }

            public java.lang.String toString() {
                return "Error(errorMessage=" + this.f8019a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0330a(java.lang.String errorMessage) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f8019a = errorMessage;
            }

            public final com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a a(java.lang.String errorMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a(errorMessage);
            }

            public /* synthetic */ C0330a(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a a(com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a c0330a, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = c0330a.f8019a;
                }
                return c0330a.a(str);
            }
        }

        /* renamed from: com.unity3d.ironsourceads.internal.services.a$a$b */
        public static final class b extends com.unity3d.ironsourceads.internal.services.a.AbstractC0329a {

            /* renamed from: a, reason: collision with root package name */
            public static final com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.b f8020a = new com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC0329a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0329a() {
        }
    }

    com.unity3d.ironsourceads.internal.services.a.AbstractC0329a a(android.content.Context context, com.ironsource.C3096i9 c3096i9);

    com.unity3d.ironsourceads.internal.services.a.AbstractC0329a a(android.content.Context context, com.ironsource.EnumC3131k9 enumC3131k9);
}
