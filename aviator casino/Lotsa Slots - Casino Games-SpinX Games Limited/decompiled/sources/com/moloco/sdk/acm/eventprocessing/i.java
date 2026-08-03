package com.moloco.sdk.acm.eventprocessing;

/* loaded from: classes5.dex */
public final class i implements com.moloco.sdk.acm.eventprocessing.h {
    public static final com.moloco.sdk.acm.eventprocessing.i.a e = new com.moloco.sdk.acm.eventprocessing.i.a(null);
    public static final java.lang.String f = "EventProcessor";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.db.d f6895a;
    public final com.moloco.sdk.acm.services.i b;
    public final com.moloco.sdk.acm.eventprocessing.l c;
    public final com.moloco.sdk.acm.services.b d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.eventprocessing.EventProcessorImpl$processCountEvent$2", f = "EventProcessor.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6896a;
        public final /* synthetic */ com.moloco.sdk.acm.CountEvent c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.acm.CountEvent countEvent, kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.eventprocessing.i.b> continuation) {
            super(2, continuation);
            this.c = countEvent;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.acm.eventprocessing.i.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.acm.eventprocessing.i.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6896a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.acm.eventprocessing.i iVar = com.moloco.sdk.acm.eventprocessing.i.this;
                java.lang.String name = this.c.getName();
                com.moloco.sdk.acm.db.c cVar = com.moloco.sdk.acm.db.c.b;
                long countValue = this.c.getCountValue();
                java.util.List<com.moloco.sdk.acm.EventTag> eventTags = this.c.getEventTags();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(eventTags, 10));
                java.util.Iterator<T> it = eventTags.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.moloco.sdk.acm.d.a((com.moloco.sdk.acm.EventTag) it.next()));
                }
                this.f6896a = 1;
                if (iVar.a(name, cVar, countValue, arrayList, this) == coroutine_suspended) {
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.eventprocessing.EventProcessorImpl$processEvent$2", f = "EventProcessor.kt", i = {}, l = {79, 80}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6897a;
        public final /* synthetic */ java.lang.String b;
        public final /* synthetic */ com.moloco.sdk.acm.eventprocessing.i c;
        public final /* synthetic */ com.moloco.sdk.acm.db.c d;
        public final /* synthetic */ long e;
        public final /* synthetic */ java.util.List<java.lang.String> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(java.lang.String str, com.moloco.sdk.acm.eventprocessing.i iVar, com.moloco.sdk.acm.db.c cVar, long j, java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.eventprocessing.i.c> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = iVar;
            this.d = cVar;
            this.e = j;
            this.f = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.acm.eventprocessing.i.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.acm.eventprocessing.i.c(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6897a;
            try {
            } catch (android.database.sqlite.SQLiteException e) {
                com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.f6920a, com.moloco.sdk.acm.eventprocessing.i.f, "Database error: " + e.getMessage(), false, 4, null);
            } catch (java.lang.Exception e2) {
                com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.f6920a, com.moloco.sdk.acm.eventprocessing.i.f, "Unexpected error while processing event: " + e2.getMessage(), false, 4, null);
            }
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.c.f6895a.a(new com.moloco.sdk.acm.db.b(0L, this.b, this.c.b.invoke(), this.d, kotlin.coroutines.jvm.internal.Boxing.boxLong(this.e), this.f, 1, null));
                com.moloco.sdk.acm.eventprocessing.l lVar = this.c.c;
                this.f6897a = 1;
                if (lVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
            com.moloco.sdk.acm.services.b bVar = this.c.d;
            this.f6897a = 2;
            if (bVar.a(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.eventprocessing.EventProcessorImpl$processTimerEvent$2", f = "EventProcessor.kt", i = {}, l = {58, 60}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6898a;
        public final /* synthetic */ com.moloco.sdk.acm.TimerEvent b;
        public final /* synthetic */ com.moloco.sdk.acm.eventprocessing.i c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.TimerEvent timerEvent, com.moloco.sdk.acm.eventprocessing.i iVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.eventprocessing.i.d> continuation) {
            super(2, continuation);
            this.b = timerEvent;
            this.c = iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.acm.eventprocessing.i.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.acm.eventprocessing.i.d(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6898a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.b.getTimeInMillis() > 0) {
                    com.moloco.sdk.acm.eventprocessing.i iVar = this.c;
                    java.lang.String name = this.b.getName();
                    com.moloco.sdk.acm.db.c cVar = com.moloco.sdk.acm.db.c.f6877a;
                    long timeInMillis = this.b.getTimeInMillis();
                    java.util.List<com.moloco.sdk.acm.EventTag> eventTags = this.b.getEventTags();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(eventTags, 10));
                    java.util.Iterator<T> it = eventTags.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.moloco.sdk.acm.d.a((com.moloco.sdk.acm.EventTag) it.next()));
                    }
                    this.f6898a = 1;
                    if (iVar.a(name, cVar, timeInMillis, arrayList, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    com.moloco.sdk.acm.eventprocessing.i iVar2 = this.c;
                    java.lang.String str = "negative_time_" + this.b.getName();
                    com.moloco.sdk.acm.db.c cVar2 = com.moloco.sdk.acm.db.c.f6877a;
                    long timeInMillis2 = this.b.getTimeInMillis();
                    java.util.List<com.moloco.sdk.acm.EventTag> eventTags2 = this.b.getEventTags();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(eventTags2, 10));
                    java.util.Iterator<T> it2 = eventTags2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(com.moloco.sdk.acm.d.a((com.moloco.sdk.acm.EventTag) it2.next()));
                    }
                    this.f6898a = 2;
                    if (iVar2.a(str, cVar2, timeInMillis2, arrayList2, this) == coroutine_suspended) {
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

    public i(com.moloco.sdk.acm.db.d metricsDAO, com.moloco.sdk.acm.services.i timeProviderService, com.moloco.sdk.acm.eventprocessing.l requestScheduler, com.moloco.sdk.acm.services.b applicationLifecycle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsDAO, "metricsDAO");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestScheduler, "requestScheduler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationLifecycle, "applicationLifecycle");
        this.f6895a = metricsDAO;
        this.b = timeProviderService;
        this.c = requestScheduler;
        this.d = applicationLifecycle;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.h
    public java.lang.Object a(com.moloco.sdk.acm.CountEvent countEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.moloco.sdk.acm.eventprocessing.i.b(countEvent, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.h
    public java.lang.Object a(com.moloco.sdk.acm.TimerEvent timerEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.moloco.sdk.acm.eventprocessing.i.d(timerEvent, this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object a(java.lang.String str, com.moloco.sdk.acm.db.c cVar, long j, java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.moloco.sdk.acm.eventprocessing.i.c(str, this, cVar, j, list, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
