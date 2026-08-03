package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers;

/* loaded from: classes5.dex */
public final class a {
    public static final androidx.compose.ui.Modifier a(androidx.compose.ui.Modifier modifier, final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c savedStateButton, final kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> updateButtonState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "modifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateButton, "savedStateButton");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateButtonState, "updateButtonState");
        return androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.this, updateButtonState, (androidx.compose.ui.layout.LayoutCoordinates) obj);
            }
        });
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c cVar, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.layout.LayoutCoordinates it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c cVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f7665a;
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c a2 = cVar2.a(it, cVar.d());
        if (cVar2.a(a2) && !kotlin.jvm.internal.Intrinsics.areEqual(a2, cVar)) {
            function1.invoke(a2);
        }
        return kotlin.Unit.INSTANCE;
    }
}
