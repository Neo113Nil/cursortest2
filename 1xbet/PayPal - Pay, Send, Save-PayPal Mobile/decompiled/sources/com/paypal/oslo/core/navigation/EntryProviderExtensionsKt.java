package com.paypal.oslo.core.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00020\u00002\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Landroidx/navigation3/runtime/NavKey;", "Landroidx/navigation3/runtime/NavEntry;", "baseProvider", "enrichEntryProvider", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EntryProviderExtensionsKt {
    public static final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> enrichEntryProvider(final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.EntryProviderExtensionsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.navigation.EntryProviderExtensionsKt.m11576$r8$lambda$BYjJytHA2lxhCuCYwmKkt7GnhU(kotlin.jvm.functions.Function1.this, (androidx.navigation3.runtime.NavKey) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1R2vPdvfbIqbMq4xtgdSNidpZSk(androidx.navigation3.runtime.NavEntry navEntry, androidx.navigation3.runtime.NavKey navKey, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1269271933, i, -1, "com.paypal.oslo.core.navigation.enrichEntryProvider.<anonymous>.<anonymous> (EntryProviderExtensions.kt:40)");
        }
        navEntry.Content(composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BYjJytHA2lxhCuCY-wmKkt7GnhU, reason: not valid java name */
    public static /* synthetic */ androidx.navigation3.runtime.NavEntry m11576$r8$lambda$BYjJytHA2lxhCuCYwmKkt7GnhU(kotlin.jvm.functions.Function1 function1, androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        final androidx.navigation3.runtime.NavEntry navEntry = (androidx.navigation3.runtime.NavEntry) function1.invoke(navKey);
        return new androidx.navigation3.runtime.NavEntry(navKey, navEntry.getContentKey(), kotlin.collections.MapsKt.plus(navEntry.getMetadata(), kotlin.TuplesKt.to(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.MetadataNavKey, navKey)), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1269271933, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.core.navigation.EntryProviderExtensionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.core.navigation.EntryProviderExtensionsKt.$r8$lambda$1R2vPdvfbIqbMq4xtgdSNidpZSk(androidx.navigation3.runtime.NavEntry.this, (androidx.navigation3.runtime.NavKey) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }
}
