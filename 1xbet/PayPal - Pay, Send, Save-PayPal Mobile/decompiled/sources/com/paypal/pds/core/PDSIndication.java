package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001:\u0006\u0014\u0015\u0016\u0017\u0018\u0019B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/paypal/pds/core/PDSIndication;", "Landroidx/compose/foundation/IndicationNodeFactory;", "Lcom/paypal/pds/core/PDSIndication$StyleState;", "pressed", "hovered", "focused", "<init>", "(Lcom/paypal/pds/core/PDSIndication$StyleState;Lcom/paypal/pds/core/PDSIndication$StyleState;Lcom/paypal/pds/core/PDSIndication$StyleState;)V", "Lcom/paypal/pds/core/Color;", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/ui/node/DelegatableNode;", "create", "(Landroidx/compose/foundation/interaction/InteractionSource;)Landroidx/compose/ui/node/DelegatableNode;", "Lcom/paypal/pds/core/PDSIndication$StyleState;", "getPressed$pds_release", "()Lcom/paypal/pds/core/PDSIndication$StyleState;", "getHovered$pds_release", "getFocused$pds_release", "StyleState", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Base", "Emphasis", "Keyboard", "Inline"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PDSIndication implements androidx.compose.foundation.IndicationNodeFactory {
    public static final int $stable = 0;
    private final com.paypal.pds.core.PDSIndication.StyleState focused;
    private final com.paypal.pds.core.PDSIndication.StyleState hovered;
    private final com.paypal.pds.core.PDSIndication.StyleState pressed;

    public PDSIndication(com.paypal.pds.core.PDSIndication.StyleState styleState, com.paypal.pds.core.PDSIndication.StyleState styleState2, com.paypal.pds.core.PDSIndication.StyleState styleState3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(styleState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(styleState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(styleState3, "");
        this.pressed = styleState;
        this.hovered = styleState2;
        this.focused = styleState3;
    }

    @Override // androidx.compose.foundation.Indication
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "rememberUpdatedInstance has been deprecated - implementers should instead implement IndicationNodeFactory#create for improved performance and efficiency. Callers should check if the Indication is an IndicationNodeFactory, and call that API instead. For a migration guide and background information, please visit developer.android.com")
    public /* bridge */ androidx.compose.foundation.IndicationInstance rememberUpdatedInstance(androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i) {
        return super.rememberUpdatedInstance(interactionSource, composer, i);
    }

    public /* synthetic */ PDSIndication(com.paypal.pds.core.PDSIndication.StyleState styleState, com.paypal.pds.core.PDSIndication.StyleState styleState2, com.paypal.pds.core.PDSIndication.StyleState styleState3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(styleState, styleState2, (i & 4) != 0 ? styleState2 : styleState3);
    }

    /* renamed from: getPressed$pds_release, reason: from getter */
    public final com.paypal.pds.core.PDSIndication.StyleState getPressed() {
        return this.pressed;
    }

    /* renamed from: getHovered$pds_release, reason: from getter */
    public final com.paypal.pds.core.PDSIndication.StyleState getHovered() {
        return this.hovered;
    }

    /* renamed from: getFocused$pds_release, reason: from getter */
    public final com.paypal.pds.core.PDSIndication.StyleState getFocused() {
        return this.focused;
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0012"}, d2 = {"Lcom/paypal/pds/core/PDSIndication$StyleState;", "", "Lcom/paypal/pds/core/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "borderColor", "Landroidx/compose/ui/unit/Dp;", "borderWidth", "Landroidx/compose/ui/graphics/Shape;", "borderShape", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;FLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/paypal/pds/core/Color;", "component2", "component3-D9Ej5fM", "()F", "component3", "component4", "()Landroidx/compose/ui/graphics/Shape;", "copy-d8LSEHM", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;FLandroidx/compose/ui/graphics/Shape;)Lcom/paypal/pds/core/PDSIndication$StyleState;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Color;", "getColor", "getBorderColor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getBorderWidth-D9Ej5fM", "Landroidx/compose/ui/graphics/Shape;", "getBorderShape"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StyleState {
        public static final int $stable = 0;
        private final com.paypal.pds.core.Color borderColor;
        private final androidx.compose.ui.graphics.Shape borderShape;
        private final float borderWidth;
        private final com.paypal.pds.core.Color color;

        private StyleState(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, float f, androidx.compose.ui.graphics.Shape shape) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shape, "");
            this.color = color;
            this.borderColor = color2;
            this.borderWidth = f;
            this.borderShape = shape;
        }

        public final com.paypal.pds.core.Color getColor() {
            return this.color;
        }

        public /* synthetic */ StyleState(com.paypal.pds.core.Color color, com.paypal.pds.core.Color.Unspecified unspecified, float f, androidx.compose.ui.graphics.Shape shape, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(color, (i & 2) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : unspecified, (i & 4) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM() : f, (i & 8) != 0 ? com.paypal.pds.core.ConstantsKt.getRoundedCornerShapeFull() : shape, null);
        }

        public final com.paypal.pds.core.Color getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name */
        public final float m22109getBorderWidthD9Ej5fM() {
            return this.borderWidth;
        }

        public final androidx.compose.ui.graphics.Shape getBorderShape() {
            return this.borderShape;
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.Color color = this.color;
            com.paypal.pds.core.Color color2 = this.borderColor;
            java.lang.String m8612toStringimpl = androidx.compose.ui.unit.Dp.m8612toStringimpl(this.borderWidth);
            androidx.compose.ui.graphics.Shape shape = this.borderShape;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StyleState(color=");
            sb.append(color);
            sb.append(", borderColor=");
            sb.append(color2);
            sb.append(", borderWidth=");
            sb.append(m8612toStringimpl);
            sb.append(", borderShape=");
            sb.append(shape);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.color.hashCode() * 31) + this.borderColor.hashCode()) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.borderWidth)) * 31) + this.borderShape.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.core.PDSIndication.StyleState)) {
                return false;
            }
            com.paypal.pds.core.PDSIndication.StyleState styleState = (com.paypal.pds.core.PDSIndication.StyleState) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.color, styleState.color) && kotlin.jvm.internal.Intrinsics.areEqual(this.borderColor, styleState.borderColor) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.borderWidth, styleState.borderWidth) && kotlin.jvm.internal.Intrinsics.areEqual(this.borderShape, styleState.borderShape);
        }

        /* renamed from: copy-d8LSEHM, reason: not valid java name */
        public final com.paypal.pds.core.PDSIndication.StyleState m22108copyd8LSEHM(com.paypal.pds.core.Color color, com.paypal.pds.core.Color borderColor, float borderWidth, androidx.compose.ui.graphics.Shape borderShape) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(borderColor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(borderShape, "");
            return new com.paypal.pds.core.PDSIndication.StyleState(color, borderColor, borderWidth, borderShape, null);
        }

        /* renamed from: component4, reason: from getter */
        public final androidx.compose.ui.graphics.Shape getBorderShape() {
            return this.borderShape;
        }

        /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
        public final float getBorderWidth() {
            return this.borderWidth;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.pds.core.Color getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.core.Color getColor() {
            return this.color;
        }

        /* renamed from: copy-d8LSEHM$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.pds.core.PDSIndication.StyleState m22106copyd8LSEHM$default(com.paypal.pds.core.PDSIndication.StyleState styleState, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, float f, androidx.compose.ui.graphics.Shape shape, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                color = styleState.color;
            }
            if ((i & 2) != 0) {
                color2 = styleState.borderColor;
            }
            if ((i & 4) != 0) {
                f = styleState.borderWidth;
            }
            if ((i & 8) != 0) {
                shape = styleState.borderShape;
            }
            return styleState.m22108copyd8LSEHM(color, color2, f, shape);
        }

        public /* synthetic */ StyleState(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, float f, androidx.compose.ui.graphics.Shape shape, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(color, color2, f, shape);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PDSIndication(com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2) {
        this(new com.paypal.pds.core.PDSIndication.StyleState(color, r3, r4, r5, r6, r7), new com.paypal.pds.core.PDSIndication.StyleState(color2, r3, r4, r5, r6, r7), null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color2, "");
        com.paypal.pds.core.Color color3 = null;
        float f = 0.0f;
        androidx.compose.ui.graphics.Shape shape = null;
        int i = 14;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/pds/core/PDSIndication$None;", "Lcom/paypal/pds/core/PDSIndication;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None extends com.paypal.pds.core.PDSIndication {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.PDSIndication.None INSTANCE = new com.paypal.pds.core.PDSIndication.None();

        @Override // androidx.compose.foundation.IndicationNodeFactory
        public final int hashCode() {
            return 291945373;
        }

        private None() {
            super(com.paypal.pds.core.Color.Unspecified.INSTANCE, com.paypal.pds.core.Color.Unspecified.INSTANCE);
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        @Override // androidx.compose.foundation.IndicationNodeFactory
        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.core.PDSIndication.None)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/pds/core/PDSIndication$Base;", "Lcom/paypal/pds/core/PDSIndication;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Base extends com.paypal.pds.core.PDSIndication {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.PDSIndication.Base INSTANCE = new com.paypal.pds.core.PDSIndication.Base();

        @Override // androidx.compose.foundation.IndicationNodeFactory
        public final int hashCode() {
            return 291574582;
        }

        private Base() {
            super(com.paypal.pds.core.Color.BackgroundStatesBasePressed.INSTANCE, com.paypal.pds.core.Color.BackgroundStatesBaseHover.INSTANCE);
        }

        public final java.lang.String toString() {
            return "Base";
        }

        @Override // androidx.compose.foundation.IndicationNodeFactory
        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.core.PDSIndication.Base)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/pds/core/PDSIndication$Emphasis;", "Lcom/paypal/pds/core/PDSIndication;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Emphasis extends com.paypal.pds.core.PDSIndication {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.PDSIndication.Emphasis INSTANCE = new com.paypal.pds.core.PDSIndication.Emphasis();

        @Override // androidx.compose.foundation.IndicationNodeFactory
        public final int hashCode() {
            return 893413217;
        }

        private Emphasis() {
            super(com.paypal.pds.core.Color.BackgroundStatesEmphasisPressed.INSTANCE, com.paypal.pds.core.Color.BackgroundStatesEmphasisHover.INSTANCE);
        }

        public final java.lang.String toString() {
            return "Emphasis";
        }

        @Override // androidx.compose.foundation.IndicationNodeFactory
        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.core.PDSIndication.Emphasis)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/pds/core/PDSIndication$Keyboard;", "Lcom/paypal/pds/core/PDSIndication;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Keyboard extends com.paypal.pds.core.PDSIndication {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.PDSIndication.Keyboard INSTANCE = new com.paypal.pds.core.PDSIndication.Keyboard();

        @Override // androidx.compose.foundation.IndicationNodeFactory
        public final int hashCode() {
            return 207799756;
        }

        private Keyboard() {
            super(new com.paypal.pds.core.PDSIndication.StyleState(com.paypal.pds.core.Color.BackgroundBrandPrimary.INSTANCE, null, 0.0f, null, 14, null), com.paypal.pds.core.PDSIndication.Base.INSTANCE.getHovered(), new com.paypal.pds.core.PDSIndication.StyleState(com.paypal.pds.core.Color.Unspecified.INSTANCE, com.paypal.pds.core.Color.BorderFocus.INSTANCE, com.paypal.pds.core.ConstantsKt.getBorderSize2(), com.paypal.pds.core.ConstantsKt.getRoundedCornerShapeFull(), null));
        }

        public final java.lang.String toString() {
            return "Keyboard";
        }

        @Override // androidx.compose.foundation.IndicationNodeFactory
        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.core.PDSIndication.Keyboard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/pds/core/PDSIndication$Inline;", "Lcom/paypal/pds/core/PDSIndication;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Inline extends com.paypal.pds.core.PDSIndication {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.PDSIndication.Inline INSTANCE = new com.paypal.pds.core.PDSIndication.Inline();

        @Override // androidx.compose.foundation.IndicationNodeFactory
        public final int hashCode() {
            return 1242507710;
        }

        private Inline() {
            super(com.paypal.pds.core.Color.BackgroundStatesBasePressed.INSTANCE, com.paypal.pds.core.Color.BackgroundStatesBasePressed.INSTANCE);
        }

        public final java.lang.String toString() {
            return "Inline";
        }

        @Override // androidx.compose.foundation.IndicationNodeFactory
        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.core.PDSIndication.Inline)) {
                return false;
            }
            return true;
        }
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public androidx.compose.ui.node.DelegatableNode create(androidx.compose.foundation.interaction.InteractionSource interactionSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionSource, "");
        return new com.paypal.pds.core.DelegatingThemeAwareIndicationNode(interactionSource, this);
    }
}
