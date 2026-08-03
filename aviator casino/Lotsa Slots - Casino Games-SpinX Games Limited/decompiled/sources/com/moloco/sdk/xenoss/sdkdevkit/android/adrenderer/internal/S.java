package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public class S implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7407a = 0;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isEnoughAreaVisibleFlow$1", f = "ViewVisibilityTracker.kt", i = {0, 0, 1, 1}, l = {71, 72}, m = "invokeSuspend", n = {"$this$flow", "rect", "$this$flow", "rect"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7408a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ android.view.View d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(android.view.View view, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.a> continuation) {
            super(2, continuation);
            this.d = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.a) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.a(this.d, continuation);
            aVar.c = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:6:0x003c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.b
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r8.f7408a
                android.graphics.Rect r1 = (android.graphics.Rect) r1
                java.lang.Object r5 = r8.c
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlin.ResultKt.throwOnFailure(r9)
                goto L3c
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r1 = r8.f7408a
                android.graphics.Rect r1 = (android.graphics.Rect) r1
                java.lang.Object r5 = r8.c
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlin.ResultKt.throwOnFailure(r9)
                goto L60
            L2f:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.c
                r5 = r9
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>(r4, r4, r4, r4)
            L3c:
                android.view.View r9 = r8.d
                boolean r9 = r9.isShown()
                if (r9 == 0) goto L4e
                android.view.View r9 = r8.d
                boolean r9 = r9.getGlobalVisibleRect(r1)
                if (r9 == 0) goto L4e
                r9 = 1
                goto L4f
            L4e:
                r9 = 0
            L4f:
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
                r8.c = r5
                r8.f7408a = r1
                r8.b = r3
                java.lang.Object r9 = r5.emit(r9, r8)
                if (r9 != r0) goto L60
                return r0
            L60:
                r8.c = r5
                r8.f7408a = r1
                r8.b = r2
                r6 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r8)
                if (r9 != r0) goto L3c
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isVisibleFlow$1", f = "ViewVisibilityTracker.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super java.lang.Boolean>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7409a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ android.view.View c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S d;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isVisibleFlow$1$1", f = "ViewVisibilityTracker.kt", i = {}, l = {47, 56}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7410a;
            public /* synthetic */ boolean b;
            public final /* synthetic */ android.view.View c;
            public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<java.lang.Boolean> d;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S e;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isVisibleFlow$1$1$1", f = "ViewVisibilityTracker.kt", i = {}, l = {50, 52}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S$b$a$a, reason: collision with other inner class name */
            public static final class C0221a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7411a;
                public /* synthetic */ java.lang.Object b;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S c;
                public final /* synthetic */ android.view.View d;
                public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<java.lang.Boolean> e;

                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isVisibleFlow$1$1$1$1", f = "ViewVisibilityTracker.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S$b$a$a$a, reason: collision with other inner class name */
                public static final class C0222a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

                    /* renamed from: a, reason: collision with root package name */
                    public int f7412a;
                    public /* synthetic */ boolean b;
                    public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<java.lang.Boolean> c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0222a(kotlinx.coroutines.channels.ProducerScope<? super java.lang.Boolean> producerScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a.C0221a.C0222a> continuation) {
                        super(2, continuation);
                        this.c = producerScope;
                    }

                    public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a.C0221a.C0222a) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a.C0221a.C0222a c0222a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a.C0221a.C0222a(this.c, continuation);
                        c0222a.b = ((java.lang.Boolean) obj).booleanValue();
                        return c0222a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return a(bool.booleanValue(), continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f7412a;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            boolean z = this.b;
                            kotlinx.coroutines.channels.ProducerScope<java.lang.Boolean> producerScope = this.c;
                            java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                            this.f7412a = 1;
                            if (producerScope.send(boxBoolean, this) == coroutine_suspended) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0221a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S s, android.view.View view, kotlinx.coroutines.channels.ProducerScope<? super java.lang.Boolean> producerScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a.C0221a> continuation) {
                    super(2, continuation);
                    this.c = s;
                    this.d = view;
                    this.e = producerScope;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a.C0221a) create(bool, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a.C0221a c0221a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a.C0221a(this.c, this.d, this.e, continuation);
                    c0221a.b = obj;
                    return c0221a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f7411a;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Boolean) this.b, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false))) {
                            kotlinx.coroutines.channels.ProducerScope<java.lang.Boolean> producerScope = this.e;
                            java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                            this.f7411a = 2;
                            if (producerScope.send(boxBoolean, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            kotlinx.coroutines.flow.Flow<java.lang.Boolean> b = this.c.b(this.d);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a.C0221a.C0222a c0222a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a.C0221a.C0222a(this.e, null);
                            this.f7411a = 1;
                            if (kotlinx.coroutines.flow.FlowKt.collectLatest(b, c0222a, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1 && i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(android.view.View view, kotlinx.coroutines.channels.ProducerScope<? super java.lang.Boolean> producerScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S s, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a> continuation) {
                super(2, continuation);
                this.c = view;
                this.d = producerScope;
                this.e = s;
            }

            public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a(this.c, this.d, this.e, continuation);
                aVar.b = ((java.lang.Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlinx.coroutines.flow.Flow b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7410a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.b) {
                        b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.b(androidx.lifecycle.ViewTreeLifecycleOwner.get(this.c));
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a.C0221a c0221a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a.C0221a(this.e, this.c, this.d, null);
                        this.f7410a = 1;
                        if (kotlinx.coroutines.flow.FlowKt.collectLatest(b, c0221a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        kotlinx.coroutines.channels.ProducerScope<java.lang.Boolean> producerScope = this.d;
                        java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                        this.f7410a = 2;
                        if (producerScope.send(boxBoolean, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(android.view.View view, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S s, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b> continuation) {
            super(2, continuation);
            this.c = view;
            this.d = s;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super java.lang.Boolean> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b(this.c, this.d, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.Flow b;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7409a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.b;
                b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.b(this.c);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b.a(this.c, producerScope, this.d, null);
                this.f7409a = 1;
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(b, aVar, this) == coroutine_suspended) {
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

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q
    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> a(android.view.View view) {
        kotlinx.coroutines.flow.Flow<java.lang.Boolean> b2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.b(kotlinx.coroutines.flow.FlowKt.channelFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.b(view, this, null)));
        return b2;
    }

    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> b(android.view.View view) {
        kotlinx.coroutines.flow.Flow<java.lang.Boolean> b2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.b(kotlinx.coroutines.flow.FlowKt.flow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.a(view, null)));
        return b2;
    }
}
