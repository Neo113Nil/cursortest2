package com.inmobi.media;

/* loaded from: classes5.dex */
public final class D1 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C1 f4653a;
    public java.lang.ref.WeakReference b;
    public final /* synthetic */ android.content.Context c;

    public D1(android.content.Context context) {
        this.c = context;
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainLooper, "getMainLooper(...)");
        this.f4653a = new com.inmobi.media.C1(mainLooper);
    }

    public static final void a(android.content.Context context, com.inmobi.media.D1 d1) {
        if (com.inmobi.media.E1.a(context) || d1.b != null) {
            return;
        }
        d1.f4653a.sendEmptyMessageDelayed(1001, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        java.lang.ref.WeakReference weakReference = this.b;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(weakReference != null ? (android.app.Activity) weakReference.get() : null, activity)) {
            this.b = new java.lang.ref.WeakReference(activity);
        }
        this.f4653a.removeMessages(1001);
        this.f4653a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        java.lang.ref.WeakReference weakReference = this.b;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(weakReference != null ? (android.app.Activity) weakReference.get() : null, activity)) {
            this.b = new java.lang.ref.WeakReference(activity);
        }
        this.f4653a.removeMessages(1001);
        this.f4653a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        java.lang.ref.WeakReference weakReference = this.b;
        if (kotlin.jvm.internal.Intrinsics.areEqual(weakReference != null ? (android.app.Activity) weakReference.get() : null, activity)) {
            this.f4653a.sendEmptyMessageDelayed(1001, 3000L);
            return;
        }
        if (this.b == null) {
            final android.content.Context context = this.c;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.D1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.D1.a(context, this);
                }
            };
            android.content.Context context2 = com.inmobi.media.Xi.f5051a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            com.inmobi.media.Xi.g.submit(runnable);
        }
    }
}
