package com.paypal.oslo.feature.ads.data.models.smithy;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;", "", "Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier$Builder;", "p0", "<init>", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier$Builder;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "copy", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;", "profileId", "Ljava/lang/String;", "getProfileId", "Companion", "Builder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VenmoUserIdentifier {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Companion INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Companion(null);
    private final java.lang.String profileId;

    private VenmoUserIdentifier(com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder builder) {
        java.lang.String profileId = builder.getProfileId();
        if (profileId == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for profileId".toString());
        }
        this.profileId = profileId;
    }

    public final java.lang.String getProfileId() {
        return this.profileId;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier invoke(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder builder = new com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder();
            block.invoke(builder);
            return builder.build();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VenmoUserIdentifier(");
        sb.append("profileId=".concat(java.lang.String.valueOf(this.profileId)));
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.profileId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.profileId, ((com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier) other).profileId);
    }

    public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier copy$default(com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier venmoUserIdentifier, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder, kotlin.Unit>() { // from class: com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier$copy$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder builder) {
                    invoke2(builder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder builder = new com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder(venmoUserIdentifier);
        function1.invoke(builder);
        return builder.build();
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier copy(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder builder = new com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder(this);
        block.invoke(builder);
        return builder.build();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier$Builder;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;", "x", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;)V", "build", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier;", "correctErrors$ads_prodRelease", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/VenmoUserIdentifier$Builder;", "", "profileId", "Ljava/lang/String;", "getProfileId", "()Ljava/lang/String;", "setProfileId", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private java.lang.String profileId;

        public final java.lang.String getProfileId() {
            return this.profileId;
        }

        public final void setProfileId(java.lang.String str) {
            this.profileId = str;
        }

        public Builder() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier venmoUserIdentifier) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(venmoUserIdentifier, "");
            this.profileId = venmoUserIdentifier.getProfileId();
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier build() {
            return new com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier(this, null);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder correctErrors$ads_prodRelease() {
            if (this.profileId == null) {
                this.profileId = "";
            }
            return this;
        }
    }

    public /* synthetic */ VenmoUserIdentifier(com.paypal.oslo.feature.ads.data.models.smithy.VenmoUserIdentifier.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
