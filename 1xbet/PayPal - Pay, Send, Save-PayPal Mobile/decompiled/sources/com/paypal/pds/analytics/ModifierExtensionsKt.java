package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aC\u0010\u0000\u001a\u00020\u0001*\u00020\u000122\u0010\u0002\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007\u001aO\u0010\b\u001a\u00020\u0001*\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u0016\u001aQ\u0010\u0017\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u001a¢\u0006\u0002\b\u001b\u001aK\u0010\u001c\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u001e\u001a'\u0010\u001f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010 \u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014H\u0007¢\u0006\u0002\u0010\"\u001a\u001e\u0010#\u001a\u00020\u0001*\u00020\u00012\u0006\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0012¨\u0006'²\u0006\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014X\u008a\u0084\u0002"}, d2 = {"analytics", "Landroidx/compose/ui/Modifier;", "pair", "", "Lkotlin/Pair;", "Lcom/paypal/pds/analytics/TypedKey;", "", "(Landroidx/compose/ui/Modifier;[Lkotlin/Pair;)Landroidx/compose/ui/Modifier;", "clickableWithAnalytics", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClickLabel", "", "onClick", "Lkotlin/Function0;", "", "clickableWithAnalytics-sF6913U", "toggleableWithAnalytics", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "onValueChange", "Lkotlin/Function1;", "toggleableWithAnalytics-O2vRcR0", "selectableWithAnalytics", com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag, "selectableWithAnalytics-O2vRcR0", "trackWhen", "key", "condition", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "trackVisibility", "threshold", "", "kidKey", "analytics_release", "currentCondition"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModifierExtensionsKt {
    /* renamed from: clickableWithAnalytics-sF6913U$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m21551clickableWithAnalyticssF6913U$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.Indication indication, boolean z, androidx.compose.ui.semantics.Role role, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str = null;
        }
        return m21550clickableWithAnalyticssF6913U(modifier, mutableInteractionSource, indication, z, role, str, function0);
    }

    /* renamed from: clickableWithAnalytics-sF6913U, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m21550clickableWithAnalyticssF6913U(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.foundation.Indication indication, final boolean z, final androidx.compose.ui.semantics.Role role, final java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return modifier.then(new com.paypal.pds.analytics.ClickableElement(function0, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.analytics.ModifierExtensionsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.analytics.ModifierExtensionsKt.$r8$lambda$THHOYMYPVnJJV1LjjsJI2g25piU(androidx.compose.foundation.interaction.MutableInteractionSource.this, indication, z, str, role, (kotlin.jvm.functions.Function0) obj);
            }
        }));
    }

    /* renamed from: toggleableWithAnalytics-O2vRcR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m21553toggleableWithAnalyticsO2vRcR0(androidx.compose.ui.Modifier modifier, final boolean z, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.foundation.Indication indication, final boolean z2, final androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return modifier.then(new com.paypal.pds.analytics.ToggleableElement(function1, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.analytics.ModifierExtensionsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.analytics.ModifierExtensionsKt.$r8$lambda$teI_4n4GRnhE1EiaSjX5dgXAOfk(z, mutableInteractionSource, indication, z2, role, (kotlin.jvm.functions.Function1) obj);
            }
        }));
    }

    /* renamed from: selectableWithAnalytics-O2vRcR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m21552selectableWithAnalyticsO2vRcR0(androidx.compose.ui.Modifier modifier, final boolean z, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.foundation.Indication indication, final boolean z2, final androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return modifier.then(new com.paypal.pds.analytics.ClickableElement(function0, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.analytics.ModifierExtensionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.analytics.ModifierExtensionsKt.$r8$lambda$MRvuCyeY3suD0bEd497TTO0n2hg(z, mutableInteractionSource, indication, z2, role, (kotlin.jvm.functions.Function0) obj);
            }
        }));
    }

    public static final androidx.compose.ui.Modifier trackWhen(androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2116677032, i, -1, "com.paypal.pds.analytics.trackWhen (ModifierExtensions.kt:233)");
        }
        boolean booleanValue = ((java.lang.Boolean) ((kotlin.jvm.functions.Function0) androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, composer, (i >> 6) & 14).getValue()).invoke()).booleanValue();
        java.lang.Object rememberedValue = composer.rememberedValue();
        boolean z = true;
        java.lang.Object obj = rememberedValue;
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            com.paypal.pds.analytics.AnalyticsLeafElement analyticsLeafElement = new com.paypal.pds.analytics.AnalyticsLeafElement(str);
            analyticsLeafElement.setState(new com.paypal.pds.analytics.AnalyticsLeafState.Condition(false, booleanValue, 1, null));
            composer.updateRememberedValue(analyticsLeafElement);
            obj = analyticsLeafElement;
        }
        com.paypal.pds.analytics.AnalyticsLeafElement analyticsLeafElement2 = (com.paypal.pds.analytics.AnalyticsLeafElement) obj;
        boolean changed = composer.changed(booleanValue);
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(str)) && (i & 48) != 32) {
            z = false;
        }
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.pds.analytics.ModifierExtensionsKt$trackWhen$1$1(analyticsLeafElement2, booleanValue, str, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, 0);
        androidx.compose.ui.Modifier then = modifier.then(analyticsLeafElement2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return then;
    }

    public static /* synthetic */ androidx.compose.ui.Modifier trackVisibility$default(androidx.compose.ui.Modifier modifier, float f, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return trackVisibility(modifier, f, str);
    }

    public static final androidx.compose.ui.Modifier trackVisibility(androidx.compose.ui.Modifier modifier, float f, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        return modifier.then(new com.paypal.pds.analytics.VisibilityElement(f, str));
    }

    public static final androidx.compose.ui.Modifier analytics(androidx.compose.ui.Modifier modifier, kotlin.Pair<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>... pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(pairArr.length), 16));
        for (kotlin.Pair<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object> pair : pairArr) {
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return modifier.then(new com.paypal.pds.analytics.AnalyticsElement(linkedHashMap));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier $r8$lambda$MRvuCyeY3suD0bEd497TTO0n2hg(boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.Indication indication, boolean z2, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return androidx.compose.foundation.selection.SelectableKt.m1941selectableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, z, mutableInteractionSource, indication, z2, role, function0);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier $r8$lambda$THHOYMYPVnJJV1LjjsJI2g25piU(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.Indication indication, boolean z, java.lang.String str, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return androidx.compose.foundation.ClickableKt.m1317clickableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, mutableInteractionSource, indication, z, str, role, function0);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier $r8$lambda$teI_4n4GRnhE1EiaSjX5dgXAOfk(boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.Indication indication, boolean z2, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return androidx.compose.foundation.selection.ToggleableKt.m1947toggleableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, z, mutableInteractionSource, indication, z2, role, function1);
    }
}
