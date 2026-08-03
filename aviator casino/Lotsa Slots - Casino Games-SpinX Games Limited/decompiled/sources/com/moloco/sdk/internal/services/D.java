package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public final class D implements com.moloco.sdk.internal.services.w {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f7194a;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$getBoolean$2", f = "DataStoreService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7195a;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.D.a> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((com.moloco.sdk.internal.services.D.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.D.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7195a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!com.moloco.sdk.internal.services.D.this.f7194a.contains(this.c)) {
                return null;
            }
            try {
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.moloco.sdk.internal.services.D.this.f7194a.getBoolean(this.c, false));
            } catch (java.lang.ClassCastException unused) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, null, false, 12, null);
                return null;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$getDouble$2", f = "DataStoreService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Double>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7196a;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.D.b> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Double> continuation) {
            return ((com.moloco.sdk.internal.services.D.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.D.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7196a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!com.moloco.sdk.internal.services.D.this.f7194a.contains(this.c)) {
                return null;
            }
            try {
                java.lang.String string = com.moloco.sdk.internal.services.D.this.f7194a.getString(this.c, "0");
                if (string != null) {
                    return kotlin.coroutines.jvm.internal.Boxing.boxDouble(java.lang.Double.parseDouble(string));
                }
                return null;
            } catch (java.lang.ClassCastException e) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, e, false, 8, null);
                return null;
            } catch (java.lang.NumberFormatException e2) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, e2, false, 8, null);
                return null;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$getFloat$2", f = "DataStoreService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7197a;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.D.c> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
            return ((com.moloco.sdk.internal.services.D.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.D.this.new c(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7197a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!com.moloco.sdk.internal.services.D.this.f7194a.contains(this.c)) {
                return null;
            }
            try {
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(com.moloco.sdk.internal.services.D.this.f7194a.getFloat(this.c, 0.0f));
            } catch (java.lang.ClassCastException unused) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, null, false, 12, null);
                return null;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$getInt$2", f = "DataStoreService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Integer>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7198a;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.D.d> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
            return ((com.moloco.sdk.internal.services.D.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.D.this.new d(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7198a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!com.moloco.sdk.internal.services.D.this.f7194a.contains(this.c)) {
                return null;
            }
            try {
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(com.moloco.sdk.internal.services.D.this.f7194a.getInt(this.c, 0));
            } catch (java.lang.ClassCastException unused) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, null, false, 12, null);
                return null;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$getLong$2", f = "DataStoreService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7199a;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.D.e> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
            return ((com.moloco.sdk.internal.services.D.e) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.D.this.new e(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7199a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!com.moloco.sdk.internal.services.D.this.f7194a.contains(this.c)) {
                return null;
            }
            try {
                java.lang.String string = com.moloco.sdk.internal.services.D.this.f7194a.getString(this.c, "0");
                if (string != null) {
                    return kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.Long.parseLong(string));
                }
                return null;
            } catch (java.lang.ClassCastException e) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, e, false, 8, null);
                return null;
            } catch (java.lang.NumberFormatException e2) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, e2, false, 8, null);
                return null;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$getString$2", f = "DataStoreService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7200a;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.D.f> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
            return ((com.moloco.sdk.internal.services.D.f) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.D.this.new f(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7200a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!com.moloco.sdk.internal.services.D.this.f7194a.contains(this.c)) {
                return null;
            }
            try {
                return com.moloco.sdk.internal.services.D.this.f7194a.getString(this.c, "");
            } catch (java.lang.ClassCastException unused) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, null, false, 12, null);
                return null;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$removeKey$2", f = "DataStoreService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7201a;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.D.g> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.services.D.g) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.D.this.new g(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7201a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.internal.services.D.this.f7194a.edit().remove(this.c).apply();
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$set$2", f = "DataStoreService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7202a;
        public final /* synthetic */ T b;
        public final /* synthetic */ com.moloco.sdk.internal.services.D c;
        public final /* synthetic */ java.lang.String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(T t, com.moloco.sdk.internal.services.D d, java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.D.h> continuation) {
            super(2, continuation);
            this.b = t;
            this.c = d;
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.services.D.h) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.services.D.h(this.b, this.c, this.d, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7202a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            T t = this.b;
            if (t instanceof java.lang.Integer) {
                this.c.f7194a.edit().putInt(this.d, ((java.lang.Number) this.b).intValue()).apply();
            } else if (t instanceof java.lang.String) {
                this.c.f7194a.edit().putString(this.d, (java.lang.String) this.b).apply();
            } else if (t instanceof java.lang.Float) {
                this.c.f7194a.edit().putFloat(this.d, ((java.lang.Number) this.b).floatValue()).apply();
            } else if (t instanceof java.lang.Boolean) {
                this.c.f7194a.edit().putBoolean(this.d, ((java.lang.Boolean) this.b).booleanValue()).apply();
            } else if (t instanceof java.lang.Double) {
                this.c.f7194a.edit().putString(this.d, java.lang.String.valueOf(((java.lang.Number) this.b).doubleValue())).apply();
            } else if (t instanceof java.lang.Long) {
                this.c.f7194a.edit().putString(this.d, java.lang.String.valueOf(((java.lang.Number) this.b).longValue())).apply();
            } else {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type: " + this.b + " for key: " + this.d, null, false, 12, null);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public D(android.content.SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f7194a = sharedPreferences;
    }

    @Override // com.moloco.sdk.internal.services.w
    public java.lang.Object b(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Double> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.internal.services.D.b(str, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.w
    public java.lang.Object c(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.internal.services.D.c(str, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.w
    public java.lang.Object d(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.internal.services.D.f(str, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.w
    public java.lang.Object e(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.internal.services.D.d(str, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.w
    public java.lang.Object f(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.internal.services.D.a(str, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.w
    public java.lang.Object g(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.internal.services.D.e(str, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.w
    public java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.internal.services.D.g(str, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.internal.services.w
    public <T> java.lang.Object a(java.lang.String str, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.internal.services.D.h(t, this, str, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
