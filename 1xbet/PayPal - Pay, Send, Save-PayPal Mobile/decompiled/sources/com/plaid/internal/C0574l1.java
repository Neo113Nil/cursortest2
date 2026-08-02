package com.plaid.internal;

/* renamed from: com.plaid.internal.l1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0574l1 extends com.plaid.internal.u8 {
    public static final /* synthetic */ int k = 0;
    public final kotlinx.coroutines.flow.MutableSharedFlow<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> f;

    @javax.inject.Inject
    public final com.plaid.internal.InterfaceC0686x6 g;

    @javax.inject.Inject
    public final com.plaid.internal.T3 h;

    @javax.inject.Inject
    public final com.plaid.internal.i8 i;
    public com.plaid.internal.C0604o4 j;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel$1", f = "HeadlessOAuthViewModel.kt", i = {}, l = {50, 62}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.l1$a */
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6468a;
        public final /* synthetic */ com.plaid.internal.r8 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.plaid.internal.r8 r8Var, kotlin.coroutines.Continuation<? super com.plaid.internal.C0574l1.a> continuation) {
            super(2, continuation);
            this.c = r8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.C0574l1.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.C0574l1.this.new a(this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
        
            if (r11 != r0) goto L12;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6468a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.C0574l1 c0574l1 = com.plaid.internal.C0574l1.this;
                com.plaid.internal.r8 r8Var = this.c;
                this.f6468a = 1;
                obj = c0574l1.a(r8Var, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) obj;
            if (!pane$PaneRendering.hasHeadlessOAuth()) {
                java.lang.String concat = "Pane rendering must be headless oauth. was ".concat(java.lang.String.valueOf(pane$PaneRendering.getRenderingCase()));
                pane$PaneRendering.getId();
                pane$PaneRendering.getPaneNodeId();
                throw new com.plaid.internal.D2(concat);
            }
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering headlessOAuth = pane$PaneRendering.getHeadlessOAuth();
            com.plaid.internal.C0574l1 c0574l12 = com.plaid.internal.C0574l1.this;
            headlessOAuth.getEvents();
            com.plaid.internal.C0574l1.b(c0574l12);
            com.plaid.internal.C0574l1 c0574l13 = com.plaid.internal.C0574l1.this;
            com.plaid.internal.i8 c = c0574l13.c();
            com.plaid.internal.C0683x3 a2 = com.plaid.internal.C0574l1.this.a();
            com.plaid.internal.C0574l1 c0574l14 = com.plaid.internal.C0574l1.this;
            kotlin.jvm.internal.Intrinsics.checkNotNull(headlessOAuth);
            com.plaid.internal.C0613p4 a3 = com.plaid.internal.C0574l1.a(c0574l14, headlessOAuth);
            java.lang.String oauthStateId = headlessOAuth.getOauthStateId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(oauthStateId, "");
            c0574l13.a(new com.plaid.internal.C0604o4(c, a2, a3, oauthStateId, this.c));
            kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = com.plaid.internal.C0574l1.this.f;
            this.f6468a = 2;
        }
    }

    /* renamed from: com.plaid.internal.l1$b */
    public static abstract class b {

        /* renamed from: com.plaid.internal.l1$b$a */
        public static final class a extends com.plaid.internal.C0574l1.b {

            /* renamed from: a, reason: collision with root package name */
            public final java.lang.String f6469a;

            public a(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.f6469a = str;
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.plaid.internal.C0574l1.b.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6469a, ((com.plaid.internal.C0574l1.b.a) obj).f6469a);
            }

            public final int hashCode() {
                return this.f6469a.hashCode();
            }

            public final java.lang.String toString() {
                java.lang.String str = this.f6469a;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PollOAuthResult(oautStateId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.plaid.internal.l1$b$b, reason: collision with other inner class name */
        public static final class C0196b extends com.plaid.internal.C0574l1.b {

            /* renamed from: a, reason: collision with root package name */
            public final java.lang.String f6470a;

            public C0196b(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.f6470a = str;
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.plaid.internal.C0574l1.b.C0196b) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6470a, ((com.plaid.internal.C0574l1.b.C0196b) obj).f6470a);
            }

            public final int hashCode() {
                return this.f6470a.hashCode();
            }

            public final java.lang.String toString() {
                java.lang.String str = this.f6470a;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowLogin(loginUrl=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.plaid.internal.l1$b$c */
        public static final class c extends com.plaid.internal.C0574l1.b {

            /* renamed from: a, reason: collision with root package name */
            public final java.lang.String f6471a;

            public c(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.f6471a = str;
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.plaid.internal.C0574l1.b.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6471a, ((com.plaid.internal.C0574l1.b.c) obj).f6471a);
            }

            public final int hashCode() {
                return this.f6471a.hashCode();
            }

            public final java.lang.String toString() {
                java.lang.String str = this.f6471a;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitRedirectUri(redirectUri=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0574l1(com.plaid.internal.r8 r8Var, com.plaid.internal.J4 j4) {
        super(r8Var, j4);
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j4, "");
        this.f = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        com.plaid.internal.C0582m0 a2 = j4.a();
        com.plaid.internal.C0600o0 c0600o0 = a2.f6489a;
        com.plaid.internal.C0591n0 c0591n0 = a2.b;
        this.c = c0591n0.n.get();
        this.d = c0591n0.m.get();
        this.e = c0600o0.d.get();
        this.g = c0591n0.B.get();
        this.h = c0600o0.j.get();
        com.plaid.internal.E5 e5 = c0600o0.f6513a.l.get();
        com.plaid.internal.C0587m5 c0587m5 = c0600o0.f6513a.m.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0587m5, "");
        com.plaid.internal.EnumC0560j5 b2 = c0587m5.b();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b2, "");
        int i = com.plaid.internal.C0569k5.f6463a[b2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "https://development.plaid.com/";
            } else if (i == 3) {
                str = "https://sandbox.plaid.com/";
            }
            java.lang.Object create = e5.a(str, new com.plaid.internal.G5(null, 3)).create(com.plaid.internal.i8.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            this.i = (com.plaid.internal.i8) dagger.internal.Preconditions.checkNotNullFromProvides((com.plaid.internal.i8) create);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.C0574l1.a(r8Var, null), 3, null);
        }
        str = "https://production.plaid.com/";
        java.lang.Object create2 = e5.a(str, new com.plaid.internal.G5(null, 3)).create(com.plaid.internal.i8.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create2, "");
        this.i = (com.plaid.internal.i8) dagger.internal.Preconditions.checkNotNullFromProvides((com.plaid.internal.i8) create2);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.C0574l1.a(r8Var, null), 3, null);
    }

    public static final /* synthetic */ void b(com.plaid.internal.C0574l1 c0574l1) {
    }

    public final com.plaid.internal.i8 c() {
        com.plaid.internal.i8 i8Var = this.i;
        if (i8Var != null) {
            return i8Var;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        if (r9 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.plaid.internal.C0574l1 c0574l1, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0601o1 c0601o1;
        int i;
        java.lang.String str;
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering2;
        java.lang.String str2;
        if (continuationImpl instanceof com.plaid.internal.C0601o1) {
            c0601o1 = (com.plaid.internal.C0601o1) continuationImpl;
            int i2 = c0601o1.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0601o1.e = i2 - 2147483648;
                java.lang.Object obj = c0601o1.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0601o1.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.T3 t3 = c0574l1.h;
                    if (t3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        t3 = null;
                    }
                    java.lang.String str3 = c0574l1.f6593a.b;
                    c0601o1.f6515a = c0574l1;
                    c0601o1.b = pane$PaneRendering;
                    c0601o1.e = 1;
                    obj = t3.a(str3, "login_url", c0601o1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pane$PaneRendering2 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) c0601o1.f6515a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str2 = (java.lang.String) obj;
                        if (str2 == null && str2.length() != 0) {
                            return new com.plaid.internal.C0574l1.b.c(str2);
                        }
                        java.lang.String oauthStateId = pane$PaneRendering2.getHeadlessOAuth().getOauthStateId();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(oauthStateId, "");
                        return new com.plaid.internal.C0574l1.b.a(oauthStateId);
                    }
                    pane$PaneRendering = c0601o1.b;
                    c0574l1 = (com.plaid.internal.C0574l1) c0601o1.f6515a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null || str.length() == 0) {
                    java.lang.String loginUri = pane$PaneRendering.getHeadlessOAuth().getLoginUri();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loginUri, "");
                    return new com.plaid.internal.C0574l1.b.C0196b(loginUri);
                }
                com.plaid.internal.InterfaceC0686x6 interfaceC0686x6 = c0574l1.g;
                if (interfaceC0686x6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    interfaceC0686x6 = null;
                }
                c0601o1.f6515a = pane$PaneRendering;
                c0601o1.b = null;
                c0601o1.e = 2;
                obj = interfaceC0686x6.a(c0601o1);
                if (obj != coroutine_suspended) {
                    pane$PaneRendering2 = pane$PaneRendering;
                    str2 = (java.lang.String) obj;
                    if (str2 == null) {
                    }
                    java.lang.String oauthStateId2 = pane$PaneRendering2.getHeadlessOAuth().getOauthStateId();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(oauthStateId2, "");
                    return new com.plaid.internal.C0574l1.b.a(oauthStateId2);
                }
                return coroutine_suspended;
            }
        }
        c0601o1 = new com.plaid.internal.C0601o1(c0574l1, continuationImpl);
        java.lang.Object obj2 = c0601o1.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0601o1.e;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
        java.lang.String loginUri2 = pane$PaneRendering.getHeadlessOAuth().getLoginUri();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loginUri2, "");
        return new com.plaid.internal.C0574l1.b.C0196b(loginUri2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(com.plaid.internal.C0574l1 c0574l1, java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0619q1 c0619q1;
        int i;
        if (continuationImpl instanceof com.plaid.internal.C0619q1) {
            c0619q1 = (com.plaid.internal.C0619q1) continuationImpl;
            int i2 = c0619q1.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0619q1.e = i2 - 2147483648;
                java.lang.Object obj = c0619q1.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0619q1.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("Poll for oAuth result", true);
                    com.plaid.internal.C0604o4 c0604o4 = c0574l1.j;
                    if (c0604o4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        c0604o4 = null;
                    }
                    c0619q1.f6542a = c0574l1;
                    c0619q1.b = str;
                    c0619q1.e = 1;
                    if (c0604o4.a(c0619q1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = c0619q1.b;
                    c0574l1 = c0619q1.f6542a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.b a2 = com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder().a(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.newBuilder().a(str));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "");
                a(c0574l1, a2);
                return kotlin.Unit.INSTANCE;
            }
        }
        c0619q1 = new com.plaid.internal.C0619q1(c0574l1, continuationImpl);
        java.lang.Object obj2 = c0619q1.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0619q1.e;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.b a22 = com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder().a(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.newBuilder().a(str));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a22, "");
        a(c0574l1, a22);
        return kotlin.Unit.INSTANCE;
    }

    public static final com.plaid.internal.C0613p4 a(com.plaid.internal.C0574l1 c0574l1, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering rendering) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions polling = rendering.getPolling();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(polling, "");
        return com.plaid.internal.C0613p4.a.a(polling);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.plaid.internal.C0574l1 c0574l1, java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0610p1 c0610p1;
        int i;
        com.plaid.internal.InterfaceC0655u2 interfaceC0655u2;
        if (continuationImpl instanceof com.plaid.internal.C0610p1) {
            c0610p1 = (com.plaid.internal.C0610p1) continuationImpl;
            int i2 = c0610p1.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0610p1.e = i2 - 2147483648;
                java.lang.Object obj = c0610p1.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0610p1.e;
                com.plaid.internal.InterfaceC0655u2 interfaceC0655u22 = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("Opening login URL", true);
                    com.plaid.internal.T3 t3 = c0574l1.h;
                    if (t3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        t3 = null;
                    }
                    java.lang.String str2 = c0574l1.f6593a.b;
                    c0610p1.f6527a = c0574l1;
                    c0610p1.b = str;
                    c0610p1.e = 1;
                    if (t3.a(str2, "login_url", str, c0610p1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = c0610p1.b;
                    c0574l1 = c0610p1.f6527a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                interfaceC0655u2 = c0574l1.c;
                if (interfaceC0655u2 != null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    interfaceC0655u22 = interfaceC0655u2;
                }
                interfaceC0655u22.a(str);
                return kotlin.Unit.INSTANCE;
            }
        }
        c0610p1 = new com.plaid.internal.C0610p1(c0574l1, continuationImpl);
        java.lang.Object obj2 = c0610p1.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0610p1.e;
        com.plaid.internal.InterfaceC0655u2 interfaceC0655u222 = null;
        if (i != 0) {
        }
        interfaceC0655u2 = c0574l1.c;
        if (interfaceC0655u2 != null) {
        }
        interfaceC0655u222.a(str);
        return kotlin.Unit.INSTANCE;
    }

    public static void a(com.plaid.internal.C0574l1 c0574l1, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.b bVar) {
        java.lang.String str = c0574l1.f6593a.c;
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a a2 = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.newBuilder().a(bVar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(c0574l1), null, null, new com.plaid.internal.t8(null, c0574l1, a2, str, null), 3, null);
    }

    public final void a(com.plaid.internal.C0604o4 c0604o4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0604o4, "");
        this.j = c0604o4;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0583m1 c0583m1;
        int i;
        if (continuationImpl instanceof com.plaid.internal.C0583m1) {
            c0583m1 = (com.plaid.internal.C0583m1) continuationImpl;
            int i2 = c0583m1.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0583m1.c = i2 - 2147483648;
                java.lang.Object obj = c0583m1.f6490a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0583m1.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableSharedFlow<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> mutableSharedFlow = this.f;
                    com.plaid.internal.C0592n1 c0592n1 = new com.plaid.internal.C0592n1(this);
                    c0583m1.c = 1;
                    if (mutableSharedFlow.collect(c0592n1, c0583m1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        c0583m1 = new com.plaid.internal.C0583m1(this, continuationImpl);
        java.lang.Object obj2 = c0583m1.f6490a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0583m1.c;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }
}
