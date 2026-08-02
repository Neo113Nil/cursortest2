package com.paypal.oslo.feature.onboarding.signup.address.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/address/domain/model/AddressSuggestion;", "", "Lcom/paypal/oslo/feature/onboarding/signup/address/domain/model/PlaceId;", "placeId", "", "mainText", "secondaryText", "completeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-quPJ1pI", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy-u-b3xac", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/address/domain/model/AddressSuggestion;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPlaceId-quPJ1pI", "getMainText", "getSecondaryText", "getCompleteText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddressSuggestion {
    public static final int $stable = 0;
    private final java.lang.String completeText;
    private final java.lang.String mainText;
    private final java.lang.String placeId;
    private final java.lang.String secondaryText;

    private AddressSuggestion(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.placeId = str;
        this.mainText = str2;
        this.secondaryText = str3;
        this.completeText = str4;
    }

    /* renamed from: getPlaceId-quPJ1pI, reason: not valid java name */
    public final java.lang.String m16204getPlaceIdquPJ1pI() {
        return this.placeId;
    }

    public final java.lang.String getMainText() {
        return this.mainText;
    }

    public final java.lang.String getSecondaryText() {
        return this.secondaryText;
    }

    public final java.lang.String getCompleteText() {
        return this.completeText;
    }

    public final java.lang.String toString() {
        java.lang.String m16210toStringimpl = com.paypal.oslo.feature.onboarding.signup.address.domain.model.PlaceId.m16210toStringimpl(this.placeId);
        java.lang.String str = this.mainText;
        java.lang.String str2 = this.secondaryText;
        java.lang.String str3 = this.completeText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressSuggestion(placeId=");
        sb.append(m16210toStringimpl);
        sb.append(", mainText=");
        sb.append(str);
        sb.append(", secondaryText=");
        sb.append(str2);
        sb.append(", completeText=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((com.paypal.oslo.feature.onboarding.signup.address.domain.model.PlaceId.m16209hashCodeimpl(this.placeId) * 31) + this.mainText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + this.completeText.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion addressSuggestion = (com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion) other;
        return com.paypal.oslo.feature.onboarding.signup.address.domain.model.PlaceId.m16208equalsimpl0(this.placeId, addressSuggestion.placeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.mainText, addressSuggestion.mainText) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryText, addressSuggestion.secondaryText) && kotlin.jvm.internal.Intrinsics.areEqual(this.completeText, addressSuggestion.completeText);
    }

    /* renamed from: copy-u-b3xac, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion m16203copyub3xac(java.lang.String placeId, java.lang.String mainText, java.lang.String secondaryText, java.lang.String completeText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completeText, "");
        return new com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion(placeId, mainText, secondaryText, completeText, null);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCompleteText() {
        return this.completeText;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMainText() {
        return this.mainText;
    }

    /* renamed from: component1-quPJ1pI, reason: not valid java name and from getter */
    public final java.lang.String getPlaceId() {
        return this.placeId;
    }

    /* renamed from: copy-u-b3xac$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion m16201copyub3xac$default(com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion addressSuggestion, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = addressSuggestion.placeId;
        }
        if ((i & 2) != 0) {
            str2 = addressSuggestion.mainText;
        }
        if ((i & 4) != 0) {
            str3 = addressSuggestion.secondaryText;
        }
        if ((i & 8) != 0) {
            str4 = addressSuggestion.completeText;
        }
        return addressSuggestion.m16203copyub3xac(str, str2, str3, str4);
    }

    public /* synthetic */ AddressSuggestion(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }
}
