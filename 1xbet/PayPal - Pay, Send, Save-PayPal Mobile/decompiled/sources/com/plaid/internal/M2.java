package com.plaid.internal;

/* loaded from: classes16.dex */
public final class M2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0573l0 f5842a;
    public final java.util.List<java.lang.String> b;

    public M2(android.app.Application application) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        com.plaid.internal.C0573l0 c0573l0 = new com.plaid.internal.C0573l0();
        this.f5842a = c0573l0;
        this.b = kotlin.collections.CollectionsKt.listOf(com.plaid.internal.link.LinkActivity.class.getName());
        application.registerActivityLifecycleCallbacks(c0573l0);
    }

    public final boolean a(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        android.app.Activity activity = this.f5842a.f6467a.get();
        if (activity == null || !this.b.contains(activity.getClass().getName())) {
            return false;
        }
        com.plaid.link.Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(activity, 6148, com.plaid.internal.L2.b(th, null));
        com.plaid.internal.C0573l0 c0573l0 = this.f5842a;
        java.lang.ref.WeakReference<android.app.Activity> weakReference = new java.lang.ref.WeakReference<>(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
        c0573l0.f6467a = weakReference;
        return true;
    }
}
