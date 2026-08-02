package com.plaid.internal;

/* renamed from: com.plaid.internal.l0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0573l0 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference<android.app.Activity> f6467a = new java.lang.ref.WeakReference<>(null);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String name2 = activity.getClass().getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) name2, (java.lang.CharSequence) "com.plaid", false, 2, (java.lang.Object) null)) {
            this.f6467a = new java.lang.ref.WeakReference<>(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String name2 = activity.getClass().getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) name2, (java.lang.CharSequence) "com.plaid", false, 2, (java.lang.Object) null)) {
            this.f6467a = new java.lang.ref.WeakReference<>(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String name2 = activity.getClass().getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) name2, (java.lang.CharSequence) "com.plaid", false, 2, (java.lang.Object) null)) {
            this.f6467a = new java.lang.ref.WeakReference<>(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }
}
