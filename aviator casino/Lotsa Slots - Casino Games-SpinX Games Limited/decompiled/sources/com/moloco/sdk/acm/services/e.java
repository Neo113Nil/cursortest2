package com.moloco.sdk.acm.services;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.acm.services.e f6920a = new com.moloco.sdk.acm.services.e();
    public static final kotlinx.coroutines.CoroutineScope b = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain());
    public static final java.util.ArrayList<com.moloco.sdk.acm.services.e.a> c = new java.util.ArrayList<>();
    public static boolean d = com.moloco.sdk.acm.services.a.f6916a.a("debug.moloco.enable_logs");
    public static final java.lang.String e = "ACM";

    public interface a {
        void a(java.lang.String str, java.lang.String str2);
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.services.MolocoMetricsLogger$fireListeners$1", f = "MolocoMetricsLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6921a;
        public final /* synthetic */ java.lang.String b;
        public final /* synthetic */ java.lang.String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.services.e.b> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.acm.services.e.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.acm.services.e.b(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6921a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.ArrayList arrayList = com.moloco.sdk.acm.services.e.c;
            java.lang.String str = this.b;
            java.lang.String str2 = this.c;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.moloco.sdk.acm.services.e.a) it.next()).a(com.moloco.sdk.acm.services.e.f6920a.b(str), str2);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void b(com.moloco.sdk.acm.services.e eVar, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = e;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        eVar.b(str, str2, z);
    }

    public static final boolean c() {
        return d;
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void d() {
    }

    public final void b(java.lang.String tag, java.lang.String msg, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        if (d || z) {
            java.lang.String b2 = b(tag);
            java.lang.String a2 = a(msg);
            android.util.Log.i(b2, a2);
            a(b2, a2);
        }
    }

    public final void c(java.lang.String msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        android.util.Log.i("==tlog==", a(msg));
    }

    public static final void a(boolean z) {
        d = z;
    }

    @kotlin.jvm.JvmStatic
    public static final void a(com.moloco.sdk.acm.services.e.a loggerListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerListener, "loggerListener");
        c.add(loggerListener);
    }

    public static /* synthetic */ void a(com.moloco.sdk.acm.services.e eVar, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = e;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        eVar.a(str, str2, z);
    }

    public final void a(java.lang.String tag, java.lang.String msg, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        if (d || z) {
            java.lang.String b2 = b(tag);
            java.lang.String a2 = a(msg);
            android.util.Log.d(b2, a2);
            a(b2, a2);
        }
    }

    public static /* synthetic */ void b(com.moloco.sdk.acm.services.e eVar, java.lang.String str, java.lang.String str2, java.lang.Throwable th, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = e;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        eVar.b(str, str2, th, z);
    }

    public final void b(java.lang.String tag, java.lang.String msg, java.lang.Throwable th, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        if (d || z) {
            java.lang.String b2 = b(tag);
            java.lang.String a2 = a(msg);
            android.util.Log.w(b2, a2, th);
            a(b2, a2);
        }
    }

    public static /* synthetic */ void a(com.moloco.sdk.acm.services.e eVar, java.lang.String str, java.lang.String str2, java.lang.Throwable th, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = e;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        eVar.a(str, str2, th, z);
    }

    public final void a(java.lang.String tag, java.lang.String msg, java.lang.Throwable th, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        if (d || z) {
            java.lang.String b2 = b(tag);
            java.lang.String a2 = a(msg);
            android.util.Log.e(b2, a2, th);
            a(b2, a2);
        }
    }

    public final java.lang.String b() {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        java.lang.StackTraceElement a2 = a(stackTrace);
        java.lang.String className = a2.getClassName();
        a2.getMethodName();
        java.lang.Class<?> cls = java.lang.Class.forName(className);
        cls.isAnonymousClass();
        cls.getDeclaredMethods();
        java.lang.String methodName = a2.getMethodName();
        if (kotlin.jvm.internal.Intrinsics.areEqual(methodName, "invokeSuspend")) {
            java.lang.String className2 = a2.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            methodName = kotlin.text.StringsKt.substringAfterLast$default(kotlin.text.StringsKt.removeSuffix(className2, (java.lang.CharSequence) "$1"), "$", (java.lang.String) null, 2, (java.lang.Object) null);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methodName, "let(...)");
        return methodName;
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(b, null, null, new com.moloco.sdk.acm.services.e.b(str, str2, null), 3, null);
    }

    public final java.lang.String a(java.lang.String str) {
        try {
            return com.ironsource.X3.j.d + b() + "] " + str;
        } catch (java.lang.Exception unused) {
            return str;
        }
    }

    public final java.lang.StackTraceElement a(java.lang.StackTraceElement[] stackTraceElementArr) {
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getClassName(), f6920a.getClass().getCanonicalName())) {
                return stackTraceElement;
            }
        }
        return (java.lang.StackTraceElement) kotlin.collections.ArraysKt.first(stackTraceElementArr);
    }

    public final java.lang.String b(java.lang.String str) {
        if (kotlin.text.StringsKt.startsWith$default(str, e, false, 2, (java.lang.Object) null)) {
            return str;
        }
        return e + str;
    }
}
