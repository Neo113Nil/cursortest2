package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Xf implements android.app.Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:11:0x004a, B:13:0x004e, B:15:0x0057, B:19:0x006b, B:21:0x0078, B:22:0x0081, B:24:0x0091, B:25:0x0094, B:17:0x0072), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(android.app.Activity activity, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Vf vf;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.ref.WeakReference weakReference;
        try {
            if (continuationImpl instanceof com.inmobi.media.Vf) {
                vf = (com.inmobi.media.Vf) continuationImpl;
                int i2 = vf.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vf.e = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = vf.c;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = vf.e;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = com.inmobi.media.Yf.b;
                        vf.f5015a = activity;
                        vf.b = mutex;
                        vf.e = 1;
                        if (mutex.lock(null, vf) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.Mutex mutex2 = vf.b;
                        android.app.Activity activity2 = vf.f5015a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        activity = activity2;
                    }
                    if (com.inmobi.media.Yf.f5066a != null) {
                        int size = com.inmobi.media.Yf.c.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                weakReference = null;
                                break;
                            }
                            java.util.ArrayList arrayList = com.inmobi.media.Yf.c;
                            if (kotlin.jvm.internal.Intrinsics.areEqual((android.content.Context) ((java.lang.ref.WeakReference) arrayList.get(i3)).get(), activity)) {
                                weakReference = (java.lang.ref.WeakReference) arrayList.get(i3);
                                break;
                            }
                            i3++;
                        }
                        if (weakReference != null) {
                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.inmobi.media.Yf.c.remove(weakReference));
                        }
                        java.util.ArrayList arrayList2 = com.inmobi.media.Yf.c;
                        kotlin.collections.CollectionsKt.removeAll((java.util.List) arrayList2, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Xf$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return java.lang.Boolean.valueOf(com.inmobi.media.Xf.a((java.lang.ref.WeakReference) obj2));
                            }
                        });
                        if (arrayList2.isEmpty()) {
                            a(activity);
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (com.inmobi.media.Yf.f5066a != null) {
            }
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        vf = new com.inmobi.media.Vf(this, continuationImpl);
        java.lang.Object obj2 = vf.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = vf.e;
        if (i != 0) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.Wf(this, activity, null), 3, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public static final boolean a(java.lang.ref.WeakReference it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }

    public final void a(android.app.Activity activity) {
        com.squareup.picasso.Picasso picasso = com.inmobi.media.Yf.f5066a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Yf", "access$getTAG$p(...)");
        java.util.Objects.toString(com.inmobi.media.Yf.f5066a);
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        com.squareup.picasso.Picasso picasso2 = com.inmobi.media.Yf.f5066a;
        if (picasso2 != null) {
            picasso2.shutdown();
        }
        com.inmobi.media.Yf.f5066a = null;
    }
}
