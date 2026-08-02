package com.plaid.internal;

/* renamed from: com.plaid.internal.z4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0702z4 extends androidx.view.ViewModel {

    /* renamed from: a, reason: collision with root package name */
    @javax.inject.Inject
    public final com.plaid.internal.InterfaceC0655u2 f6645a;

    @javax.inject.Inject
    public final com.plaid.internal.C6 b;

    @javax.inject.Inject
    public final com.plaid.internal.InterfaceC0677w6 c;

    @javax.inject.Inject
    public final com.plaid.internal.B6 d;

    @javax.inject.Inject
    public final com.plaid.internal.InterfaceC0704z6 e;

    @javax.inject.Inject
    public final com.plaid.internal.z8 f;

    @javax.inject.Inject
    public final com.plaid.internal.i8 g;

    @javax.inject.Inject
    public final com.plaid.internal.I7 h;

    @javax.inject.Inject
    public final com.plaid.internal.F i;
    public kotlinx.coroutines.Job j;
    public final com.plaid.internal.C0693y4 k;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessClosed$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.z4$a */
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6646a;

        public a(kotlin.coroutines.Continuation<? super com.plaid.internal.C0702z4.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.C0702z4.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.C0702z4.this.new a(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6646a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.I7 b = com.plaid.internal.C0702z4.this.b();
                this.f6646a = 1;
                if (b.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessClosed$3$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.z4$b */
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6647a;

        public b(kotlin.coroutines.Continuation<? super com.plaid.internal.C0702z4.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.C0702z4.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.C0702z4.this.new b(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6647a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.C0702z4 c0702z4 = com.plaid.internal.C0702z4.this;
                this.f6647a = 1;
                if (com.plaid.internal.C0702z4.a(c0702z4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.plaid.internal.F f = com.plaid.internal.C0702z4.this.i;
            if (f == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                f = null;
            }
            f.c = true;
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessOpened$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {141, 142}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.z4$c */
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6648a;

        public c(kotlin.coroutines.Continuation<? super com.plaid.internal.C0702z4.c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.C0702z4.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.C0702z4.this.new c(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            if (com.plaid.internal.C0702z4.a(r5, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            if (r5.c(r4) != r0) goto L12;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6648a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.I7 b = com.plaid.internal.C0702z4.this.b();
                this.f6648a = 1;
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
            com.plaid.internal.C0702z4 c0702z4 = com.plaid.internal.C0702z4.this;
            this.f6648a = 2;
        }
    }

    public C0702z4(com.plaid.internal.H1 h1) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h1, "");
        com.plaid.internal.C0591n0 c0591n0 = (com.plaid.internal.C0591n0) h1;
        this.f6645a = c0591n0.n.get();
        this.b = c0591n0.f6502o.get();
        this.c = c0591n0.t.get();
        this.d = c0591n0.q.get();
        this.e = c0591n0.z.get();
        this.f = c0591n0.A.get();
        com.plaid.internal.C0600o0 c0600o0 = c0591n0.b;
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
            this.g = (com.plaid.internal.i8) dagger.internal.Preconditions.checkNotNullFromProvides((com.plaid.internal.i8) create);
            this.h = c0591n0.s.get();
            this.i = c0591n0.u.get();
            this.k = new com.plaid.internal.C0693y4(this);
        }
        str = "https://production.plaid.com/";
        java.lang.Object create2 = e5.a(str, new com.plaid.internal.G5(null, 3)).create(com.plaid.internal.i8.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create2, "");
        this.g = (com.plaid.internal.i8) dagger.internal.Preconditions.checkNotNullFromProvides((com.plaid.internal.i8) create2);
        this.h = c0591n0.s.get();
        this.i = c0591n0.u.get();
        this.k = new com.plaid.internal.C0693y4(this);
    }

    public final void c() {
        kotlinx.coroutines.Job job = this.j;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.C0702z4.c(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.plaid.internal.C0702z4 c0702z4, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.A4 a4;
        int i;
        com.plaid.internal.A a2;
        kotlinx.coroutines.Job launch$default;
        if (continuationImpl instanceof com.plaid.internal.A4) {
            a4 = (com.plaid.internal.A4) continuationImpl;
            int i2 = a4.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a4.d = i2 - 2147483648;
                java.lang.Object obj = a4.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = a4.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.InterfaceC0677w6 interfaceC0677w6 = c0702z4.c;
                    if (interfaceC0677w6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        interfaceC0677w6 = null;
                    }
                    a4.f5749a = c0702z4;
                    a4.d = 1;
                    obj = interfaceC0677w6.b(a4);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0702z4 = a4.f5749a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                a2 = (com.plaid.internal.A) obj;
                if (a2 != null) {
                    com.plaid.internal.C0452a6.a.e(com.plaid.internal.C0452a6.f5996a, "No Out Of Process Polling Info Available");
                    com.plaid.internal.InterfaceC0655u2 interfaceC0655u2 = c0702z4.f6645a;
                    if (interfaceC0655u2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        interfaceC0655u2 = null;
                    }
                    interfaceC0655u2.a(new com.plaid.link.result.LinkExit(null, null, 3, null));
                    return kotlin.Unit.INSTANCE;
                }
                com.plaid.internal.F f = c0702z4.i;
                if (f == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    f = null;
                }
                kotlinx.coroutines.CoroutineScope viewModelScope = androidx.view.ViewModelKt.getViewModelScope(c0702z4);
                com.plaid.internal.C0693y4 c0693y4 = c0702z4.k;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelScope, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0693y4, "");
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(viewModelScope, null, null, new com.plaid.internal.D(f, a2, c0693y4, null), 3, null);
                c0702z4.j = launch$default;
                return kotlin.Unit.INSTANCE;
            }
        }
        a4 = new com.plaid.internal.A4(c0702z4, continuationImpl);
        java.lang.Object obj2 = a4.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = a4.d;
        if (i != 0) {
        }
        a2 = (com.plaid.internal.A) obj2;
        if (a2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(com.plaid.internal.C0702z4 c0702z4, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.B4 b4;
        int i;
        com.plaid.internal.InterfaceC0704z6 interfaceC0704z6;
        if (continuationImpl instanceof com.plaid.internal.B4) {
            b4 = (com.plaid.internal.B4) continuationImpl;
            int i2 = b4.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b4.d = i2 - 2147483648;
                java.lang.Object obj = b4.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = b4.d;
                com.plaid.internal.InterfaceC0704z6 interfaceC0704z62 = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.InterfaceC0704z6 interfaceC0704z63 = c0702z4.e;
                    if (interfaceC0704z63 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        interfaceC0704z63 = null;
                    }
                    b4.f5757a = c0702z4;
                    b4.d = 1;
                    obj = interfaceC0704z63.a(b4);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.plaid.link.result.LinkResult linkResult = (com.plaid.link.result.LinkResult) b4.f5757a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return linkResult;
                    }
                    c0702z4 = (com.plaid.internal.C0702z4) b4.f5757a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult sDKResult = (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) obj;
                com.plaid.link.result.LinkResult a2 = sDKResult == null ? com.plaid.internal.T6.a(sDKResult) : null;
                interfaceC0704z6 = c0702z4.e;
                if (interfaceC0704z6 != null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    interfaceC0704z62 = interfaceC0704z6;
                }
                b4.f5757a = a2;
                b4.d = 2;
                return interfaceC0704z62.b(b4) != coroutine_suspended ? coroutine_suspended : a2;
            }
        }
        b4 = new com.plaid.internal.B4(c0702z4, continuationImpl);
        java.lang.Object obj2 = b4.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = b4.d;
        com.plaid.internal.InterfaceC0704z6 interfaceC0704z622 = null;
        if (i != 0) {
        }
        com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult sDKResult2 = (com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult) obj2;
        if (sDKResult2 == null) {
        }
        interfaceC0704z6 = c0702z4.e;
        if (interfaceC0704z6 != null) {
        }
        b4.f5757a = a2;
        b4.d = 2;
        if (interfaceC0704z622.b(b4) != coroutine_suspended2) {
        }
    }

    public final com.plaid.internal.I7 b() {
        com.plaid.internal.I7 i7 = this.h;
        if (i7 != null) {
            return i7;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public static final void a(com.plaid.internal.C0702z4 c0702z4, com.plaid.link.result.LinkResult linkResult) {
        com.plaid.internal.InterfaceC0655u2 interfaceC0655u2 = null;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(c0702z4), null, null, new com.plaid.internal.C0675w4(c0702z4, null), 3, null);
        com.plaid.internal.InterfaceC0655u2 interfaceC0655u22 = c0702z4.f6645a;
        if (interfaceC0655u22 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            interfaceC0655u2 = interfaceC0655u22;
        }
        interfaceC0655u2.a(linkResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0684x4 c0684x4;
        int i;
        java.lang.String str;
        if (continuationImpl instanceof com.plaid.internal.C0684x4) {
            c0684x4 = (com.plaid.internal.C0684x4) continuationImpl;
            int i2 = c0684x4.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0684x4.c = i2 - 2147483648;
                java.lang.Object obj = c0684x4.f6623a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0684x4.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.C6 c6 = this.b;
                    if (c6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        c6 = null;
                    }
                    c0684x4.c = 1;
                    obj = c6.a(c0684x4);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null || str.length() == 0) {
                    return null;
                }
                return str;
            }
        }
        c0684x4 = new com.plaid.internal.C0684x4(this, continuationImpl);
        java.lang.Object obj2 = c0684x4.f6623a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0684x4.c;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
        return null;
    }

    public final void a(boolean z) {
        com.plaid.internal.F f = null;
        if (z) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.C0702z4.a(null), 3, null);
        }
        if (this.j == null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.C0702z4.b(null), 3, null);
            return;
        }
        com.plaid.internal.F f2 = this.i;
        if (f2 != null) {
            f = f2;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        f.c = true;
    }

    public final void a() {
        com.plaid.internal.InterfaceC0655u2 interfaceC0655u2 = null;
        com.plaid.link.result.LinkExit linkExit = new com.plaid.link.result.LinkExit(null, null, 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.plaid.internal.C0675w4(this, null), 3, null);
        com.plaid.internal.InterfaceC0655u2 interfaceC0655u22 = this.f6645a;
        if (interfaceC0655u22 != null) {
            interfaceC0655u2 = interfaceC0655u22;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        interfaceC0655u2.a(linkExit);
    }
}
