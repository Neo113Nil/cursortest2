package com.plaid.internal;

/* renamed from: com.plaid.internal.z7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0705z7 {
    public static final kotlinx.coroutines.CoroutineScope a(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object tag = view.getTag(com.plaid.link.R.string.plaid_view_coroutine_scope);
        kotlinx.coroutines.CoroutineScope coroutineScope = tag instanceof kotlinx.coroutines.CoroutineScope ? (kotlinx.coroutines.CoroutineScope) tag : null;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        com.plaid.internal.ViewOnAttachStateChangeListenerC0696y7 viewOnAttachStateChangeListenerC0696y7 = new com.plaid.internal.ViewOnAttachStateChangeListenerC0696y7();
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0696y7);
        return viewOnAttachStateChangeListenerC0696y7;
    }
}
