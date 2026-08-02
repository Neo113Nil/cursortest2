package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/pds/components/AvatarBadge;", "", "<init>", "()V", "Icon", com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL, "Pip", "Lcom/paypal/pds/components/AvatarBadge$Icon;", "Lcom/paypal/pds/components/AvatarBadge$Image;", "Lcom/paypal/pds/components/AvatarBadge$Pip;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class AvatarBadge {
    public static final int $stable = 0;

    private AvatarBadge() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/pds/components/AvatarBadge$Icon;", "Lcom/paypal/pds/components/AvatarBadge;", "Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/pds/components/BadgeStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/components/BadgeStyle;)V", "Lcom/paypal/pds/core/Icon;", "getIcon$pds_release", "()Lcom/paypal/pds/core/Icon;", "Lcom/paypal/pds/components/BadgeStyle;", "getStyle$pds_release", "()Lcom/paypal/pds/components/BadgeStyle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Icon extends com.paypal.pds.components.AvatarBadge {
        public static final int $stable = 0;
        private final com.paypal.pds.core.Icon icon;
        private final com.paypal.pds.components.BadgeStyle style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Icon(com.paypal.pds.core.Icon icon, com.paypal.pds.components.BadgeStyle badgeStyle) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeStyle, "");
            this.icon = icon;
            this.style = badgeStyle;
        }

        /* renamed from: getIcon$pds_release, reason: from getter */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        /* renamed from: getStyle$pds_release, reason: from getter */
        public final com.paypal.pds.components.BadgeStyle getStyle() {
            return this.style;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/pds/components/AvatarBadge$Image;", "Lcom/paypal/pds/components/AvatarBadge;", "Landroidx/compose/ui/graphics/painter/Painter;", "image", "Lcom/paypal/pds/components/BadgeStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Lcom/paypal/pds/components/BadgeStyle;)V", "Landroidx/compose/ui/graphics/painter/Painter;", "getImage$pds_release", "()Landroidx/compose/ui/graphics/painter/Painter;", "Lcom/paypal/pds/components/BadgeStyle;", "getStyle$pds_release", "()Lcom/paypal/pds/components/BadgeStyle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Image extends com.paypal.pds.components.AvatarBadge {
        public static final int $stable = androidx.compose.ui.graphics.painter.Painter.$stable;
        private final androidx.compose.ui.graphics.painter.Painter image;
        private final com.paypal.pds.components.BadgeStyle style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(androidx.compose.ui.graphics.painter.Painter painter, com.paypal.pds.components.BadgeStyle badgeStyle) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeStyle, "");
            this.image = painter;
            this.style = badgeStyle;
        }

        /* renamed from: getImage$pds_release, reason: from getter */
        public final androidx.compose.ui.graphics.painter.Painter getImage() {
            return this.image;
        }

        /* renamed from: getStyle$pds_release, reason: from getter */
        public final com.paypal.pds.components.BadgeStyle getStyle() {
            return this.style;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/pds/components/AvatarBadge$Pip;", "Lcom/paypal/pds/components/AvatarBadge;", "Lcom/paypal/pds/components/BadgeStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "<init>", "(Lcom/paypal/pds/components/BadgeStyle;)V", "Lcom/paypal/pds/components/BadgeStyle;", "getStyle$pds_release", "()Lcom/paypal/pds/components/BadgeStyle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Pip extends com.paypal.pds.components.AvatarBadge {
        public static final int $stable = 0;
        private final com.paypal.pds.components.BadgeStyle style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pip(com.paypal.pds.components.BadgeStyle badgeStyle) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeStyle, "");
            this.style = badgeStyle;
        }

        /* renamed from: getStyle$pds_release, reason: from getter */
        public final com.paypal.pds.components.BadgeStyle getStyle() {
            return this.style;
        }
    }

    public /* synthetic */ AvatarBadge(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
