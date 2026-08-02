package com.zettle.sdk.commons.accessibility;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/commons/accessibility/AccessibilityDelegateBuilder;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "className", "(Ljava/lang/String;)V", "", "isClickable", "(Z)V", "Lkotlin/Function0;", "block", "onFocused", "(Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/String;", "getClassName$core_publicRelease", "()Ljava/lang/String;", "setClassName$core_publicRelease", "Ljava/lang/Boolean;", "isClickable$core_publicRelease", "()Ljava/lang/Boolean;", "setClickable$core_publicRelease", "(Ljava/lang/Boolean;)V", "onFocusedListener", "Lkotlin/jvm/functions/Function0;", "getOnFocusedListener$core_publicRelease", "()Lkotlin/jvm/functions/Function0;", "setOnFocusedListener$core_publicRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccessibilityDelegateBuilder {
    private java.lang.String className;
    private java.lang.Boolean isClickable;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onFocusedListener;

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnFocusedListener$core_publicRelease() {
        return this.onFocusedListener;
    }

    public final void setOnFocusedListener$core_publicRelease(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onFocusedListener = function0;
    }

    /* renamed from: getClassName$core_publicRelease, reason: from getter */
    public final java.lang.String getClassName() {
        return this.className;
    }

    public final void setClassName$core_publicRelease(java.lang.String str) {
        this.className = str;
    }

    /* renamed from: isClickable$core_publicRelease, reason: from getter */
    public final java.lang.Boolean getIsClickable() {
        return this.isClickable;
    }

    public final void setClickable$core_publicRelease(java.lang.Boolean bool) {
        this.isClickable = bool;
    }

    public final void onFocused(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        this.onFocusedListener = block;
    }

    public final void className(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.className = value;
    }

    public final void isClickable(boolean value) {
        this.isClickable = java.lang.Boolean.valueOf(value);
    }
}
