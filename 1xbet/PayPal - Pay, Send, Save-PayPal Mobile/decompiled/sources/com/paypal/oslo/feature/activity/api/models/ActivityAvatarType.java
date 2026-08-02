package com.paypal.oslo.feature.activity.api.models;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "ImageActivityAvatar", "InitialsActivityAvatar", "GenericActivityAvatar", "IconActivityAvatar", "Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType$GenericActivityAvatar;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType$IconActivityAvatar;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType$ImageActivityAvatar;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType$InitialsActivityAvatar;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class ActivityAvatarType {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.Companion INSTANCE = new com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.api.models.ActivityAvatarType$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.$r8$lambda$Lzew7M7h9P3GPnWm43sKDsQGw88();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.activity.api.models.ActivityAvatarType self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.api.models.ActivityAvatarType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ActivityAvatarType() {
    }

    public /* synthetic */ ActivityAvatarType(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType$ImageActivityAvatar;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType;", "", "imageUrl", "initials", "Lcom/paypal/pds/components/AvatarBadge;", "badgeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/components/AvatarBadge;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/pds/components/AvatarBadge;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/components/AvatarBadge;)Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType$ImageActivityAvatar;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getImageUrl", "getInitials", "Lcom/paypal/pds/components/AvatarBadge;", "getBadgeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class ImageActivityAvatar extends com.paypal.oslo.feature.activity.api.models.ActivityAvatarType {
        public static final int $stable = 0;
        private final com.paypal.pds.components.AvatarBadge badgeType;
        private final java.lang.String imageUrl;
        private final java.lang.String initials;

        public ImageActivityAvatar(java.lang.String str, java.lang.String str2, com.paypal.pds.components.AvatarBadge avatarBadge) {
            super(null);
            this.imageUrl = str;
            this.initials = str2;
            this.badgeType = avatarBadge;
        }

        public /* synthetic */ ImageActivityAvatar(java.lang.String str, java.lang.String str2, com.paypal.pds.components.AvatarBadge avatarBadge, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : avatarBadge);
        }

        public final java.lang.String getImageUrl() {
            return this.imageUrl;
        }

        public final java.lang.String getInitials() {
            return this.initials;
        }

        public final com.paypal.pds.components.AvatarBadge getBadgeType() {
            return this.badgeType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.imageUrl;
            java.lang.String str2 = this.initials;
            com.paypal.pds.components.AvatarBadge avatarBadge = this.badgeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageActivityAvatar(imageUrl=");
            sb.append(str);
            sb.append(", initials=");
            sb.append(str2);
            sb.append(", badgeType=");
            sb.append(avatarBadge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.imageUrl;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.initials;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            com.paypal.pds.components.AvatarBadge avatarBadge = this.badgeType;
            return (((hashCode * 31) + hashCode2) * 31) + (avatarBadge != null ? avatarBadge.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.ImageActivityAvatar)) {
                return false;
            }
            com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.ImageActivityAvatar imageActivityAvatar = (com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.ImageActivityAvatar) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, imageActivityAvatar.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.initials, imageActivityAvatar.initials) && kotlin.jvm.internal.Intrinsics.areEqual(this.badgeType, imageActivityAvatar.badgeType);
        }

        public final com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.ImageActivityAvatar copy(java.lang.String imageUrl, java.lang.String initials, com.paypal.pds.components.AvatarBadge badgeType) {
            return new com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.ImageActivityAvatar(imageUrl, initials, badgeType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.pds.components.AvatarBadge getBadgeType() {
            return this.badgeType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getInitials() {
            return this.initials;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getImageUrl() {
            return this.imageUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.ImageActivityAvatar copy$default(com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.ImageActivityAvatar imageActivityAvatar, java.lang.String str, java.lang.String str2, com.paypal.pds.components.AvatarBadge avatarBadge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = imageActivityAvatar.imageUrl;
            }
            if ((i & 2) != 0) {
                str2 = imageActivityAvatar.initials;
            }
            if ((i & 4) != 0) {
                avatarBadge = imageActivityAvatar.badgeType;
            }
            return imageActivityAvatar.copy(str, str2, avatarBadge);
        }

        public ImageActivityAvatar() {
            this(null, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType$InitialsActivityAvatar;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType;", "", "initials", "Lcom/paypal/pds/components/AvatarBadge;", "badgeType", "<init>", "(Ljava/lang/String;Lcom/paypal/pds/components/AvatarBadge;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/pds/components/AvatarBadge;", "copy", "(Ljava/lang/String;Lcom/paypal/pds/components/AvatarBadge;)Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType$InitialsActivityAvatar;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInitials", "Lcom/paypal/pds/components/AvatarBadge;", "getBadgeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class InitialsActivityAvatar extends com.paypal.oslo.feature.activity.api.models.ActivityAvatarType {
        public static final int $stable = 0;
        private final com.paypal.pds.components.AvatarBadge badgeType;
        private final java.lang.String initials;

        public InitialsActivityAvatar(java.lang.String str, com.paypal.pds.components.AvatarBadge avatarBadge) {
            super(null);
            this.initials = str;
            this.badgeType = avatarBadge;
        }

        public /* synthetic */ InitialsActivityAvatar(java.lang.String str, com.paypal.pds.components.AvatarBadge avatarBadge, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : avatarBadge);
        }

        public final java.lang.String getInitials() {
            return this.initials;
        }

        public final com.paypal.pds.components.AvatarBadge getBadgeType() {
            return this.badgeType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.initials;
            com.paypal.pds.components.AvatarBadge avatarBadge = this.badgeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitialsActivityAvatar(initials=");
            sb.append(str);
            sb.append(", badgeType=");
            sb.append(avatarBadge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.initials;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.pds.components.AvatarBadge avatarBadge = this.badgeType;
            return (hashCode * 31) + (avatarBadge != null ? avatarBadge.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.InitialsActivityAvatar)) {
                return false;
            }
            com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.InitialsActivityAvatar initialsActivityAvatar = (com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.InitialsActivityAvatar) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.initials, initialsActivityAvatar.initials) && kotlin.jvm.internal.Intrinsics.areEqual(this.badgeType, initialsActivityAvatar.badgeType);
        }

        public final com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.InitialsActivityAvatar copy(java.lang.String initials, com.paypal.pds.components.AvatarBadge badgeType) {
            return new com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.InitialsActivityAvatar(initials, badgeType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.pds.components.AvatarBadge getBadgeType() {
            return this.badgeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInitials() {
            return this.initials;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.InitialsActivityAvatar copy$default(com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.InitialsActivityAvatar initialsActivityAvatar, java.lang.String str, com.paypal.pds.components.AvatarBadge avatarBadge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initialsActivityAvatar.initials;
            }
            if ((i & 2) != 0) {
                avatarBadge = initialsActivityAvatar.badgeType;
            }
            return initialsActivityAvatar.copy(str, avatarBadge);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType$GenericActivityAvatar;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType;", "Lcom/paypal/pds/core/Icon;", "name", "Lcom/paypal/pds/components/AvatarBadge;", "badgeType", "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/components/AvatarBadge;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Lcom/paypal/pds/components/AvatarBadge;", "copy", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/components/AvatarBadge;)Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType$GenericActivityAvatar;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Icon;", "getName", "Lcom/paypal/pds/components/AvatarBadge;", "getBadgeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class GenericActivityAvatar extends com.paypal.oslo.feature.activity.api.models.ActivityAvatarType {
        public static final int $stable = 0;
        private final com.paypal.pds.components.AvatarBadge badgeType;
        private final com.paypal.pds.core.Icon name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenericActivityAvatar(com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarBadge avatarBadge) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            this.name = icon;
            this.badgeType = avatarBadge;
        }

        public /* synthetic */ GenericActivityAvatar(com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarBadge avatarBadge, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(icon, (i & 2) != 0 ? null : avatarBadge);
        }

        public final com.paypal.pds.core.Icon getName() {
            return this.name;
        }

        public final com.paypal.pds.components.AvatarBadge getBadgeType() {
            return this.badgeType;
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.Icon icon = this.name;
            com.paypal.pds.components.AvatarBadge avatarBadge = this.badgeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GenericActivityAvatar(name=");
            sb.append(icon);
            sb.append(", badgeType=");
            sb.append(avatarBadge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            com.paypal.pds.components.AvatarBadge avatarBadge = this.badgeType;
            return (hashCode * 31) + (avatarBadge == null ? 0 : avatarBadge.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.GenericActivityAvatar)) {
                return false;
            }
            com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.GenericActivityAvatar genericActivityAvatar = (com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.GenericActivityAvatar) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, genericActivityAvatar.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.badgeType, genericActivityAvatar.badgeType);
        }

        public final com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.GenericActivityAvatar copy(com.paypal.pds.core.Icon name2, com.paypal.pds.components.AvatarBadge badgeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.GenericActivityAvatar(name2, badgeType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.pds.components.AvatarBadge getBadgeType() {
            return this.badgeType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.core.Icon getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.GenericActivityAvatar copy$default(com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.GenericActivityAvatar genericActivityAvatar, com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarBadge avatarBadge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                icon = genericActivityAvatar.name;
            }
            if ((i & 2) != 0) {
                avatarBadge = genericActivityAvatar.badgeType;
            }
            return genericActivityAvatar.copy(icon, avatarBadge);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType$IconActivityAvatar;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType;", "Lcom/paypal/pds/core/Icon;", "name", "Lcom/paypal/pds/components/AvatarBadge;", "badgeType", "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/components/AvatarBadge;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Lcom/paypal/pds/components/AvatarBadge;", "copy", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/components/AvatarBadge;)Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType$IconActivityAvatar;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Icon;", "getName", "Lcom/paypal/pds/components/AvatarBadge;", "getBadgeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class IconActivityAvatar extends com.paypal.oslo.feature.activity.api.models.ActivityAvatarType {
        public static final int $stable = 0;
        private final com.paypal.pds.components.AvatarBadge badgeType;
        private final com.paypal.pds.core.Icon name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconActivityAvatar(com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarBadge avatarBadge) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            this.name = icon;
            this.badgeType = avatarBadge;
        }

        public /* synthetic */ IconActivityAvatar(com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarBadge avatarBadge, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(icon, (i & 2) != 0 ? null : avatarBadge);
        }

        public final com.paypal.pds.core.Icon getName() {
            return this.name;
        }

        public final com.paypal.pds.components.AvatarBadge getBadgeType() {
            return this.badgeType;
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.Icon icon = this.name;
            com.paypal.pds.components.AvatarBadge avatarBadge = this.badgeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IconActivityAvatar(name=");
            sb.append(icon);
            sb.append(", badgeType=");
            sb.append(avatarBadge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            com.paypal.pds.components.AvatarBadge avatarBadge = this.badgeType;
            return (hashCode * 31) + (avatarBadge == null ? 0 : avatarBadge.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.IconActivityAvatar)) {
                return false;
            }
            com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.IconActivityAvatar iconActivityAvatar = (com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.IconActivityAvatar) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, iconActivityAvatar.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.badgeType, iconActivityAvatar.badgeType);
        }

        public final com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.IconActivityAvatar copy(com.paypal.pds.core.Icon name2, com.paypal.pds.components.AvatarBadge badgeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.IconActivityAvatar(name2, badgeType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.pds.components.AvatarBadge getBadgeType() {
            return this.badgeType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.core.Icon getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.IconActivityAvatar copy$default(com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.IconActivityAvatar iconActivityAvatar, com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarBadge avatarBadge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                icon = iconActivityAvatar.name;
            }
            if ((i & 2) != 0) {
                avatarBadge = iconActivityAvatar.badgeType;
            }
            return iconActivityAvatar.copy(icon, avatarBadge);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$Lzew7M7h9P3GPnWm43sKDsQGw88() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.activity.api.models.ActivityAvatarType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.class), new kotlin.reflect.KClass[0], new kotlinx.serialization.KSerializer[0], new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ ActivityAvatarType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
