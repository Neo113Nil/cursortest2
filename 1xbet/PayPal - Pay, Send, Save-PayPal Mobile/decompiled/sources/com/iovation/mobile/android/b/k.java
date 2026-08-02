package com.iovation.mobile.android.b;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f3934a;
    public final java.util.HashMap b;

    public k(java.util.concurrent.ExecutorService executorService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        this.f3934a = executorService;
        this.b = new java.util.HashMap();
    }

    public final void a(java.lang.String str, final java.util.concurrent.Callable callable, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        if (this.b.get(str) != null) {
            return;
        }
        this.b.put(str, this.f3934a.submit(new java.lang.Runnable() { // from class: com.iovation.mobile.android.b.k$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.iovation.mobile.android.b.k.a(callable, function1, function12);
            }
        }));
    }

    public static final void a(java.util.concurrent.Callable callable, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12) {
        try {
            function1.invoke(callable.call());
        } catch (java.lang.Exception e) {
            function12.invoke(e);
        }
    }
}
