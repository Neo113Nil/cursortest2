package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a {
    public static final Modifier a(Modifier modifier, final a.AbstractC1622a.c savedStateButton, final Function1<? super a.AbstractC1622a.c, Unit> updateButtonState) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(savedStateButton, "savedStateButton");
        Intrinsics.checkNotNullParameter(updateButtonState, "updateButtonState");
        return OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a.a(a.AbstractC1622a.c.this, updateButtonState, (LayoutCoordinates) obj);
            }
        });
    }

    public static final Unit a(a.AbstractC1622a.c cVar, Function1 function1, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c cVar2 = c.f11199a;
        a.AbstractC1622a.c a2 = cVar2.a(it, cVar.d());
        if (cVar2.a(a2) && !Intrinsics.areEqual(a2, cVar)) {
            function1.invoke(a2);
        }
        return Unit.INSTANCE;
    }
}
