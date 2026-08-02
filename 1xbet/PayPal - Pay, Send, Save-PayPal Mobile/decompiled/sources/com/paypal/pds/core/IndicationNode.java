package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8!X \u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128!X \u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168!X \u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u00020\u001a8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u001a8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010$\u001a\u00020\u001a8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 "}, d2 = {"Lcom/paypal/pds/core/IndicationNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "<init>", "()V", "", "onAttach", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Lcom/paypal/pds/core/PDSIndication$StyleState;", "styleState", "drawStyleState$pds_release", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Lcom/paypal/pds/core/PDSIndication$StyleState;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource$pds_release", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lcom/paypal/pds/tokens/PDSTokens;", "getTokens$pds_release", "()Lcom/paypal/pds/tokens/PDSTokens;", "tokens", "Lcom/paypal/pds/core/PDSIndication;", "getIndication$pds_release", "()Lcom/paypal/pds/core/PDSIndication;", "indication", "", "isPressed", "Z", "isPressed$pds_release", "()Z", "setPressed$pds_release", "(Z)V", "isHovered", "isHovered$pds_release", "setHovered$pds_release", "isFocused", "isFocused$pds_release", "setFocused$pds_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class IndicationNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.DrawModifierNode {
    public static final int $stable = 8;
    private boolean isFocused;
    private boolean isHovered;
    private boolean isPressed;

    /* renamed from: getIndication$pds_release */
    public abstract com.paypal.pds.core.PDSIndication getIndication();

    /* renamed from: getInteractionSource$pds_release */
    public abstract androidx.compose.foundation.interaction.InteractionSource getInteractionSource();

    /* renamed from: getTokens$pds_release */
    public abstract com.paypal.pds.tokens.PDSTokens getTokens();

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* bridge */ void onMeasureResultChanged() {
        super.onMeasureResultChanged();
    }

    /* renamed from: isPressed$pds_release, reason: from getter */
    public final boolean getIsPressed() {
        return this.isPressed;
    }

    public final void setPressed$pds_release(boolean z) {
        this.isPressed = z;
    }

    /* renamed from: isHovered$pds_release, reason: from getter */
    public final boolean getIsHovered() {
        return this.isHovered;
    }

    public final void setHovered$pds_release(boolean z) {
        this.isHovered = z;
    }

    /* renamed from: isFocused$pds_release, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    public final void setFocused$pds_release(boolean z) {
        this.isFocused = z;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new com.paypal.pds.core.IndicationNode$onAttach$1(this, null), 3, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentDrawScope, "");
        contentDrawScope.drawContent();
        if (this.isPressed) {
            drawStyleState$pds_release(contentDrawScope, getIndication().getPressed());
        } else if (this.isFocused) {
            drawStyleState$pds_release(contentDrawScope, getIndication().getFocused());
        } else if (this.isHovered) {
            drawStyleState$pds_release(contentDrawScope, getIndication().getHovered());
        }
    }

    public final void drawStyleState$pds_release(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, com.paypal.pds.core.PDSIndication.StyleState styleState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentDrawScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(styleState, "");
        if (styleState.getColor().getIsSpecified()) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(contentDrawScope, styleState.getColor().value(getTokens()), 0L, contentDrawScope.mo6531getSizeNHjbRc(), 0.0f, null, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        }
        if (!styleState.getBorderColor().getIsSpecified() || java.lang.Float.isNaN(styleState.m22109getBorderWidthD9Ej5fM())) {
            return;
        }
        androidx.compose.ui.graphics.OutlineKt.m6250drawOutlinewDX37Ww(contentDrawScope, styleState.getBorderShape().mo1334createOutlinePq9zytI(contentDrawScope.mo6531getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope), styleState.getBorderColor().value(getTokens()), (r17 & 4) != 0 ? 1.0f : 0.0f, (r17 & 8) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : new androidx.compose.ui.graphics.drawscope.Stroke(contentDrawScope.mo1418toPx0680j_4(styleState.m22109getBorderWidthD9Ej5fM()), 0.0f, 0, 0, null, 30, null), (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m6533getDefaultBlendMode0nO6VwU() : 0);
    }
}
