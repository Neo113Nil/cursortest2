package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public interface p {

    public interface b {

        public static final class a implements com.ironsource.sdk.controller.p.b {

            /* renamed from: a, reason: collision with root package name */
            private final com.ironsource.Rc f6659a;
            private final com.ironsource.InterfaceC3050g b;

            public a(com.ironsource.Rc configurations, com.ironsource.InterfaceC3050g intentFactory) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f6659a = configurations;
                this.b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public com.ironsource.sdk.controller.p.c a(android.content.Context context, com.ironsource.Qc openUrl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                if (android.text.TextUtils.isEmpty(openUrl.d())) {
                    return new com.ironsource.sdk.controller.p.c.a("url is empty");
                }
                android.content.Intent a2 = this.b.a();
                a2.setData(android.net.Uri.parse(openUrl.d()));
                java.lang.String c = openUrl.c();
                if (c != null && c.length() != 0) {
                    a2 = a2.setPackage(openUrl.c());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof android.app.Activity)) {
                    a2 = a2.addFlags(this.f6659a.c());
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "intentFactory\n          …ations.flags) else this }");
                context.startActivity(a2);
                return com.ironsource.sdk.controller.p.c.b.f6664a;
            }
        }

        /* renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        public static final class C0164b implements com.ironsource.sdk.controller.p.b {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.String f6660a;

            public C0164b(java.lang.String method) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
                this.f6660a = method;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public com.ironsource.sdk.controller.p.c a(android.content.Context context, com.ironsource.Qc openUrl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                return new com.ironsource.sdk.controller.p.c.a("method " + this.f6660a + " is unsupported");
            }
        }

        public static final class c implements com.ironsource.sdk.controller.p.b {

            /* renamed from: a, reason: collision with root package name */
            private final com.ironsource.Rc f6661a;
            private final com.ironsource.InterfaceC3068h b;

            public c(com.ironsource.Rc configurations, com.ironsource.InterfaceC3068h intentFactory) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f6661a = configurations;
                this.b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public com.ironsource.sdk.controller.p.c a(android.content.Context context, com.ironsource.Qc openUrl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new com.ironsource.sdk.controller.OpenUrlActivity.e(this.b).a(this.f6661a.c()).a(openUrl.d()).b(true).c(true).a(context));
                return com.ironsource.sdk.controller.p.c.b.f6664a;
            }
        }

        public static final class d implements com.ironsource.sdk.controller.p.b {

            /* renamed from: a, reason: collision with root package name */
            private final com.ironsource.Rc f6662a;
            private final com.ironsource.InterfaceC3068h b;

            public d(com.ironsource.Rc configurations, com.ironsource.InterfaceC3068h intentFactory) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f6662a = configurations;
                this.b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public com.ironsource.sdk.controller.p.c a(android.content.Context context, com.ironsource.Qc openUrl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new com.ironsource.sdk.controller.OpenUrlActivity.e(this.b).a(this.f6662a.c()).a(openUrl.d()).a(this.f6662a.d()).b(true).a(context));
                return com.ironsource.sdk.controller.p.c.b.f6664a;
            }
        }

        com.ironsource.sdk.controller.p.c a(android.content.Context context, com.ironsource.Qc qc);
    }

    public static abstract class c {

        public static final class a extends com.ironsource.sdk.controller.p.c {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.String f6663a;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final java.lang.String a() {
                return this.f6663a;
            }

            public final java.lang.String b() {
                return this.f6663a;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.ironsource.sdk.controller.p.c.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6663a, ((com.ironsource.sdk.controller.p.c.a) obj).f6663a);
            }

            public int hashCode() {
                return this.f6663a.hashCode();
            }

            public java.lang.String toString() {
                return "Error(errorMessage=" + this.f6663a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(java.lang.String errorMessage) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f6663a = errorMessage;
            }

            public final com.ironsource.sdk.controller.p.c.a a(java.lang.String errorMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new com.ironsource.sdk.controller.p.c.a(errorMessage);
            }

            public /* synthetic */ a(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ com.ironsource.sdk.controller.p.c.a a(com.ironsource.sdk.controller.p.c.a aVar, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f6663a;
                }
                return aVar.a(str);
            }
        }

        public static final class b extends com.ironsource.sdk.controller.p.c {

            /* renamed from: a, reason: collision with root package name */
            public static final com.ironsource.sdk.controller.p.c.b f6664a = new com.ironsource.sdk.controller.p.c.b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    com.ironsource.sdk.controller.p.c a(android.content.Context context, com.ironsource.Qc qc);

    public static final class a implements com.ironsource.sdk.controller.p {

        /* renamed from: a, reason: collision with root package name */
        private com.ironsource.sdk.controller.p.b f6658a;

        public a(java.lang.String method, com.ironsource.Rc openUrlConfigurations, com.ironsource.InterfaceC3068h activityIntentFactory, com.ironsource.InterfaceC3050g actionIntentFactory) {
            com.ironsource.sdk.controller.p.b aVar;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionIntentFactory, "actionIntentFactory");
            int hashCode = method.hashCode();
            if (hashCode == -1455867212) {
                if (method.equals(com.ironsource.X3.i.J)) {
                    aVar = new com.ironsource.sdk.controller.p.b.a(openUrlConfigurations, actionIntentFactory);
                }
                aVar = new com.ironsource.sdk.controller.p.b.C0164b(method);
            } else if (hashCode != 109770977) {
                if (hashCode == 1224424441 && method.equals(com.ironsource.X3.i.K)) {
                    aVar = new com.ironsource.sdk.controller.p.b.d(openUrlConfigurations, activityIntentFactory);
                }
                aVar = new com.ironsource.sdk.controller.p.b.C0164b(method);
            } else {
                if (method.equals(com.ironsource.X3.i.U)) {
                    aVar = new com.ironsource.sdk.controller.p.b.c(openUrlConfigurations, activityIntentFactory);
                }
                aVar = new com.ironsource.sdk.controller.p.b.C0164b(method);
            }
            this.f6658a = aVar;
        }

        @Override // com.ironsource.sdk.controller.p
        public com.ironsource.sdk.controller.p.c a(android.content.Context context, com.ironsource.Qc openUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrl, "openUrl");
            try {
                return this.f6658a.a(context, openUrl);
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                java.lang.String message = e.getMessage();
                java.lang.String message2 = (message == null || message.length() == 0) ? "" : e.getMessage();
                kotlin.jvm.internal.Intrinsics.checkNotNull(message2);
                return new com.ironsource.sdk.controller.p.c.a(message2);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String method, com.ironsource.Rc openUrlConfigurations) {
            this(method, openUrlConfigurations, new com.ironsource.sdk.controller.k.c(), new com.ironsource.sdk.controller.k.a());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
        }
    }
}
