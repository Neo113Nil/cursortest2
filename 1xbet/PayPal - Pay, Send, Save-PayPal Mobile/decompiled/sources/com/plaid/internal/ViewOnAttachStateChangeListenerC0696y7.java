package com.plaid.internal;

/* renamed from: com.plaid.internal.y7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnAttachStateChangeListenerC0696y7 implements kotlinx.coroutines.CoroutineScope, android.view.View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.coroutines.CoroutineContext f6632a = kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getIO());

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.f6632a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        view.setTag(com.plaid.link.R.string.plaid_view_coroutine_scope, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlinx.coroutines.JobKt__JobKt.cancel$default(this.f6632a, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        view.setTag(com.plaid.link.R.string.plaid_view_coroutine_scope, null);
    }
}
