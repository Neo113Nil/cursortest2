package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001aI\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u001e\b\u0002\u0010\u0005\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\u0007\u0010\b\")\u0010\u0010\u001a\u00020\n*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\")\u0010\u0015\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00018G@GX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014"}, d2 = {"T", "", "name", "accessibilityExtraKey", "Lkotlin/Function2;", "mergePolicy", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "SemanticsPropertyKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "<set-?>", "getTestTagsAsResourceId", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setTestTagsAsResourceId", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "testTagsAsResourceId", "getAccessibilityClassName", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setAccessibilityClassName", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "accessibilityClassName"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SemanticsProperties_androidKt {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsProperties_androidKt.class, "accessibilityClassName", "getAccessibilityClassName(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1))};

    public static /* synthetic */ androidx.compose.ui.semantics.SemanticsPropertyKey SemanticsPropertyKey$default(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function2 = new kotlin.jvm.functions.Function2<T, T, T>() { // from class: androidx.compose.ui.semantics.SemanticsProperties_androidKt$SemanticsPropertyKey$1
                @Override // kotlin.jvm.functions.Function2
                public final T invoke(T t, T t2) {
                    return t;
                }
            };
        }
        return SemanticsPropertyKey(str, str2, function2);
    }

    public static final <T> androidx.compose.ui.semantics.SemanticsPropertyKey<T> SemanticsPropertyKey(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends T> function2) {
        return new androidx.compose.ui.semantics.SemanticsPropertyKey<>(str, false, (kotlin.jvm.functions.Function2) function2, str2);
    }

    public static final boolean getTestTagsAsResourceId(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().getValue(semanticsPropertyReceiver, getHighResolutionOutputSizeshNQ4ISI[0]).booleanValue();
    }

    public static final void setTestTagsAsResourceId(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        androidx.compose.ui.semantics.SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue(semanticsPropertyReceiver, getHighResolutionOutputSizeshNQ4ISI[0], java.lang.Boolean.valueOf(z));
    }

    public static final java.lang.String getAccessibilityClassName(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName().getValue(semanticsPropertyReceiver, getHighResolutionOutputSizeshNQ4ISI[1]);
    }

    public static final void setAccessibilityClassName(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str) {
        androidx.compose.ui.semantics.SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName().setValue(semanticsPropertyReceiver, getHighResolutionOutputSizeshNQ4ISI[1], str);
    }

    static {
        androidx.compose.ui.semantics.SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId();
        androidx.compose.ui.semantics.SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName();
    }
}
