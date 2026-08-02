package com.zettle.sdk.commons.accessibility;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\f\u001a\u00020\u0003*\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\f\u001a\u00020\u0003*\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u000f\u001a*\u0010\u0014\u001a\u00020\u0003*\u00020\u00062\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u0003*\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u001c\u001a\u00020\u0000*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroid/view/accessibility/AccessibilityManager;", "", "text", "", "announceText", "(Landroid/view/accessibility/AccessibilityManager;Ljava/lang/String;)V", "Landroid/view/View;", "disableAccessibilityForNestedViews", "(Landroid/view/View;)V", "announcement", "", "isImportant", "requestAccessibilityFocus", "(Landroid/view/View;Ljava/lang/String;Z)V", "Landroid/widget/TextView;", "(Landroid/widget/TextView;Z)V", "Lkotlin/Function1;", "Lcom/zettle/sdk/commons/accessibility/AccessibilityDelegateBuilder;", "Lkotlin/ExtensionFunctionType;", "block", "setAccessibilityDelegateBuilder", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "content", "setContentDescriptionForNumberAsDigits", "(Landroid/view/View;Ljava/lang/String;)Lkotlin/Unit;", "Landroid/content/Context;", "getAccessibilityManager", "(Landroid/content/Context;)Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SpeechTextUtilsKt {
    public static final kotlin.Unit setContentDescriptionForNumberAsDigits(android.view.View view, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.text.StringsKt.toIntOrNull(str) == null) {
            return null;
        }
        view.setContentDescription(new kotlin.text.Regex(".").replace(str, "$0 "));
        return kotlin.Unit.INSTANCE;
    }

    public static final void disableAccessibilityForNestedViews(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        view.setImportantForAccessibility(2);
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                disableAccessibilityForNestedViews(viewGroup.getChildAt(i));
            }
        }
    }

    public static final void announceText(android.view.accessibility.AccessibilityManager accessibilityManager, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilityManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (accessibilityManager.isEnabled()) {
            android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.getText().add(str);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public static /* synthetic */ void requestAccessibilityFocus$default(android.widget.TextView textView, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        requestAccessibilityFocus(textView, z);
    }

    public static final void requestAccessibilityFocus(android.widget.TextView textView, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "");
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        android.view.accessibility.AccessibilityManager accessibilityManager = getAccessibilityManager(context);
        if (accessibilityManager.isEnabled()) {
            if (z) {
                accessibilityManager.interrupt();
            }
            if (textView.isAccessibilityFocused()) {
                java.lang.CharSequence contentDescription = textView.getContentDescription();
                java.lang.String str = null;
                if (contentDescription != null) {
                    if (contentDescription.length() <= 0) {
                        contentDescription = null;
                    }
                    if (contentDescription != null) {
                        str = contentDescription.toString();
                    }
                }
                if (str == null) {
                    str = textView.getText().toString();
                }
                announceText(accessibilityManager, str);
                return;
            }
            textView.requestFocus();
            textView.sendAccessibilityEvent(8);
        }
    }

    public static /* synthetic */ void requestAccessibilityFocus$default(android.view.View view, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        requestAccessibilityFocus(view, str, z);
    }

    public static final void requestAccessibilityFocus(android.view.View view, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        android.view.accessibility.AccessibilityManager accessibilityManager = getAccessibilityManager(context);
        if (accessibilityManager.isEnabled()) {
            if (z) {
                accessibilityManager.interrupt();
            }
            if (str == null) {
                java.lang.CharSequence contentDescription = view.getContentDescription();
                if (contentDescription != null) {
                    if (contentDescription.length() <= 0) {
                        contentDescription = null;
                    }
                    if (contentDescription != null) {
                        str = contentDescription.toString();
                    }
                }
                str = null;
            }
            if (view.isAccessibilityFocused() && str != null) {
                announceText(accessibilityManager, str);
            } else {
                view.requestFocus();
                view.sendAccessibilityEvent(8);
            }
        }
    }

    public static final void setAccessibilityDelegateBuilder(android.view.View view, kotlin.jvm.functions.Function1<? super com.zettle.sdk.commons.accessibility.AccessibilityDelegateBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        final com.zettle.sdk.commons.accessibility.AccessibilityDelegateBuilder accessibilityDelegateBuilder = new com.zettle.sdk.commons.accessibility.AccessibilityDelegateBuilder();
        function1.invoke(accessibilityDelegateBuilder);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(view, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.zettle.sdk.commons.accessibility.SpeechTextUtilsKt$setAccessibilityDelegateBuilder$1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void onInitializeAccessibilityEvent(android.view.View host, android.view.accessibility.AccessibilityEvent inputEvent) {
                kotlin.jvm.functions.Function0<kotlin.Unit> onFocusedListener$core_publicRelease;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputEvent, "");
                super.onInitializeAccessibilityEvent(host, inputEvent);
                java.lang.String className = com.zettle.sdk.commons.accessibility.AccessibilityDelegateBuilder.this.getClassName();
                if (className != null) {
                    inputEvent.setClassName(className);
                }
                if (inputEvent.getEventType() != 32768 || (onFocusedListener$core_publicRelease = com.zettle.sdk.commons.accessibility.AccessibilityDelegateBuilder.this.getOnFocusedListener$core_publicRelease()) == null) {
                    return;
                }
                onFocusedListener$core_publicRelease.invoke();
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void onInitializeAccessibilityNodeInfo(android.view.View host, androidx.core.view.accessibility.AccessibilityNodeInfoCompat inputInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputInfo, "");
                super.onInitializeAccessibilityNodeInfo(host, inputInfo);
                java.lang.String className = com.zettle.sdk.commons.accessibility.AccessibilityDelegateBuilder.this.getClassName();
                if (className != null) {
                    inputInfo.setClassName(className);
                }
                java.lang.Boolean isClickable = com.zettle.sdk.commons.accessibility.AccessibilityDelegateBuilder.this.getIsClickable();
                if (isClickable != null) {
                    boolean booleanValue = isClickable.booleanValue();
                    inputInfo.setClickable(booleanValue);
                    if (booleanValue) {
                        inputInfo.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                    } else {
                        inputInfo.removeAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                    }
                }
            }
        });
    }

    public static final android.view.accessibility.AccessibilityManager getAccessibilityManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        return (android.view.accessibility.AccessibilityManager) systemService;
    }
}
