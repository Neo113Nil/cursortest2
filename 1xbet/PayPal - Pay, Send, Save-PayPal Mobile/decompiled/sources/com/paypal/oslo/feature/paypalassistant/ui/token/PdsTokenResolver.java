package com.paypal.oslo.feature.paypalassistant.ui.token;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0005\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0005\u0010\bJ!\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0014\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0019\u0010\u001cJ!\u0010\u001f\u001a\u00020\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/ui/token/PdsTokenResolver;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/paypalassistant/domain/model/AvatarSize;", "avatarSize", "Lcom/paypal/pds/components/AvatarSize;", "defaultAvatarSize", "(Lcom/paypal/oslo/feature/paypalassistant/domain/model/AvatarSize;Lcom/paypal/pds/components/AvatarSize;)Lcom/paypal/pds/components/AvatarSize;", "", "name", "Lcom/paypal/pds/core/Color;", "defaultColor", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "(Ljava/lang/String;Lcom/paypal/pds/core/Color;)Lcom/paypal/pds/core/Color;", "Lcom/paypal/pds/core/Typography;", "defaultTypography", "typography", "(Ljava/lang/String;Lcom/paypal/pds/core/Typography;)Lcom/paypal/pds/core/Typography;", "Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonStyle;", "buttonStyle", "Lcom/paypal/pds/components/ButtonStyle;", "defaultButtonStyle", "(Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonStyle;Lcom/paypal/pds/components/ButtonStyle;)Lcom/paypal/pds/components/ButtonStyle;", "Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonSize;", "buttonSize", "Lcom/paypal/pds/components/ButtonSize;", "defaultButtonSize", "(Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonSize;Lcom/paypal/pds/components/ButtonSize;)Lcom/paypal/pds/components/ButtonSize;", "Lcom/paypal/pds/core/Icon;", "defaultIcon", "icon", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;)Lcom/paypal/pds/core/Icon;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdsTokenResolver {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.paypalassistant.ui.token.PdsTokenResolver INSTANCE = new com.paypal.oslo.feature.paypalassistant.ui.token.PdsTokenResolver();

    private PdsTokenResolver() {
    }

    public final com.paypal.pds.components.AvatarSize avatarSize(com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize avatarSize, com.paypal.pds.components.AvatarSize defaultAvatarSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultAvatarSize, "");
        com.paypal.pds.components.AvatarSize findAvatarSize = com.paypal.oslo.feature.paypalassistant.ui.token.PdsAvatarResolver.INSTANCE.findAvatarSize(avatarSize);
        return findAvatarSize == null ? defaultAvatarSize : findAvatarSize;
    }

    public static /* synthetic */ com.paypal.pds.core.Color color$default(com.paypal.oslo.feature.paypalassistant.ui.token.PdsTokenResolver pdsTokenResolver, java.lang.String str, com.paypal.pds.core.Color color, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            color = com.paypal.pds.core.Color.Unspecified.INSTANCE;
        }
        return pdsTokenResolver.color(str, color);
    }

    public final com.paypal.pds.core.Color color(java.lang.String name2, com.paypal.pds.core.Color defaultColor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultColor, "");
        com.paypal.pds.core.Color findColor = com.paypal.oslo.feature.paypalassistant.ui.token.PdsColorResolver.INSTANCE.findColor(name2);
        return findColor == null ? defaultColor : findColor;
    }

    public final com.paypal.pds.core.Typography typography(java.lang.String name2, com.paypal.pds.core.Typography defaultTypography) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultTypography, "");
        com.paypal.pds.core.Typography findTypography = com.paypal.oslo.feature.paypalassistant.ui.token.PdsTypographyResolver.INSTANCE.findTypography(name2);
        return findTypography == null ? defaultTypography : findTypography;
    }

    public final com.paypal.pds.components.ButtonStyle buttonStyle(com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle buttonStyle, com.paypal.pds.components.ButtonStyle defaultButtonStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultButtonStyle, "");
        com.paypal.pds.components.ButtonStyle findButtonStyle = com.paypal.oslo.feature.paypalassistant.ui.token.PdsButtonResolver.INSTANCE.findButtonStyle(buttonStyle);
        return findButtonStyle == null ? defaultButtonStyle : findButtonStyle;
    }

    public final com.paypal.pds.components.ButtonSize buttonSize(com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize buttonSize, com.paypal.pds.components.ButtonSize defaultButtonSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultButtonSize, "");
        com.paypal.pds.components.ButtonSize findButtonSize = com.paypal.oslo.feature.paypalassistant.ui.token.PdsButtonResolver.INSTANCE.findButtonSize(buttonSize);
        return findButtonSize == null ? defaultButtonSize : findButtonSize;
    }

    public static /* synthetic */ com.paypal.pds.core.Icon icon$default(com.paypal.oslo.feature.paypalassistant.ui.token.PdsTokenResolver pdsTokenResolver, java.lang.String str, com.paypal.pds.core.Icon icon, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            icon = com.paypal.pds.core.Icon.NoIcon.INSTANCE;
        }
        return pdsTokenResolver.icon(str, icon);
    }

    public final com.paypal.pds.core.Icon icon(java.lang.String name2, com.paypal.pds.core.Icon defaultIcon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultIcon, "");
        com.paypal.pds.core.Icon findIcon = com.paypal.oslo.feature.paypalassistant.ui.token.PdsIconResolver.INSTANCE.findIcon(name2);
        return findIcon == null ? defaultIcon : findIcon;
    }
}
