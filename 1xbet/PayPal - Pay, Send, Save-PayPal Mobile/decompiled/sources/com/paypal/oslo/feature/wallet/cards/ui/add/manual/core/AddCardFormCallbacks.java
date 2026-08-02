package com.paypal.oslo.feature.wallet.cards.ui.add.manual.core;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\fHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J´\u0001\u0010\u001b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010$R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0012R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010\u0012R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b)\u0010\u0012R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b*\u0010\u0012R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b+\u0010\u0012R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u0019R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b.\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/core/AddCardFormCallbacks;", "", "Lkotlin/Function1;", "", "", "onCardNumberChange", "onExpirationDateChange", "onCvvChange", "", "onCardNumberFocusChanged", "onExpirationDateFocusChanged", "onCvvFocusChanged", "Lkotlin/Function0;", "onAddressChangeClick", "onCameraClick", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lkotlin/jvm/functions/Function0;", "component8", "copy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/core/AddCardFormCallbacks;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getOnCardNumberChange", "getOnExpirationDateChange", "getOnCvvChange", "getOnCardNumberFocusChanged", "getOnExpirationDateFocusChanged", "getOnCvvFocusChanged", "Lkotlin/jvm/functions/Function0;", "getOnAddressChangeClick", "getOnCameraClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AddCardFormCallbacks {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onAddressChangeClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onCameraClick;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onCardNumberChange;
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onCardNumberFocusChanged;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onCvvChange;
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onCvvFocusChanged;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onExpirationDateChange;
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onExpirationDateFocusChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public AddCardFormCallbacks(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function14, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function15, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function16, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function14, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function15, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function16, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.onCardNumberChange = function1;
        this.onExpirationDateChange = function12;
        this.onCvvChange = function13;
        this.onCardNumberFocusChanged = function14;
        this.onExpirationDateFocusChanged = function15;
        this.onCvvFocusChanged = function16;
        this.onAddressChangeClick = function0;
        this.onCameraClick = function02;
    }

    public /* synthetic */ AddCardFormCallbacks(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function1 function15, kotlin.jvm.functions.Function1 function16, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks.m21018$r8$lambda$aNAPrrn5jUIsjgTyXPcY3UPOKM((java.lang.String) obj);
            }
        } : function1, (i & 2) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks.m21016$r8$lambda$9DcVK7WC8RQeljb2lMj6QgDSU((java.lang.String) obj);
            }
        } : function12, (i & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks.$r8$lambda$4shbP8EGFMICydSdap55nVnnOgQ((java.lang.String) obj);
            }
        } : function13, (i & 8) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                ((java.lang.Boolean) obj).booleanValue();
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function14, (i & 16) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                ((java.lang.Boolean) obj).booleanValue();
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function15, (i & 32) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                ((java.lang.Boolean) obj).booleanValue();
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function16, (i & 64) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function0, (i & 128) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function02);
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnCardNumberChange() {
        return this.onCardNumberChange;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnExpirationDateChange() {
        return this.onExpirationDateChange;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnCvvChange() {
        return this.onCvvChange;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnCardNumberFocusChanged() {
        return this.onCardNumberFocusChanged;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnExpirationDateFocusChanged() {
        return this.onExpirationDateFocusChanged;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnCvvFocusChanged() {
        return this.onCvvFocusChanged;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnAddressChangeClick() {
        return this.onAddressChangeClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCameraClick() {
        return this.onCameraClick;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4shbP8EGFMICydSdap55nVnnOgQ(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9Dc-VK7WC8RQeljb2l-Mj6QgDSU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21016$r8$lambda$9DcVK7WC8RQeljb2lMj6QgDSU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aNAPrrn5j-UIsjgTyXPcY3UPOKM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21018$r8$lambda$aNAPrrn5jUIsjgTyXPcY3UPOKM(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.String toString() {
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onCardNumberChange;
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function12 = this.onExpirationDateChange;
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function13 = this.onCvvChange;
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function14 = this.onCardNumberFocusChanged;
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function15 = this.onExpirationDateFocusChanged;
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function16 = this.onCvvFocusChanged;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onAddressChangeClick;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onCameraClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCardFormCallbacks(onCardNumberChange=");
        sb.append(function1);
        sb.append(", onExpirationDateChange=");
        sb.append(function12);
        sb.append(", onCvvChange=");
        sb.append(function13);
        sb.append(", onCardNumberFocusChanged=");
        sb.append(function14);
        sb.append(", onExpirationDateFocusChanged=");
        sb.append(function15);
        sb.append(", onCvvFocusChanged=");
        sb.append(function16);
        sb.append(", onAddressChangeClick=");
        sb.append(function0);
        sb.append(", onCameraClick=");
        sb.append(function02);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((this.onCardNumberChange.hashCode() * 31) + this.onExpirationDateChange.hashCode()) * 31) + this.onCvvChange.hashCode()) * 31) + this.onCardNumberFocusChanged.hashCode()) * 31) + this.onExpirationDateFocusChanged.hashCode()) * 31) + this.onCvvFocusChanged.hashCode()) * 31) + this.onAddressChangeClick.hashCode()) * 31) + this.onCameraClick.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks addCardFormCallbacks = (com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onCardNumberChange, addCardFormCallbacks.onCardNumberChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onExpirationDateChange, addCardFormCallbacks.onExpirationDateChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCvvChange, addCardFormCallbacks.onCvvChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCardNumberFocusChanged, addCardFormCallbacks.onCardNumberFocusChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.onExpirationDateFocusChanged, addCardFormCallbacks.onExpirationDateFocusChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCvvFocusChanged, addCardFormCallbacks.onCvvFocusChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAddressChangeClick, addCardFormCallbacks.onAddressChangeClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCameraClick, addCardFormCallbacks.onCameraClick);
    }

    public final com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks copy(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onCardNumberChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onExpirationDateChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onCvvChange, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onCardNumberFocusChanged, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onExpirationDateFocusChanged, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onCvvFocusChanged, kotlin.jvm.functions.Function0<kotlin.Unit> onAddressChangeClick, kotlin.jvm.functions.Function0<kotlin.Unit> onCameraClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCardNumberChange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onExpirationDateChange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCvvChange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCardNumberFocusChanged, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onExpirationDateFocusChanged, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCvvFocusChanged, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAddressChangeClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCameraClick, "");
        return new com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormCallbacks(onCardNumberChange, onExpirationDateChange, onCvvChange, onCardNumberFocusChanged, onExpirationDateFocusChanged, onCvvFocusChanged, onAddressChangeClick, onCameraClick);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component8() {
        return this.onCameraClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component7() {
        return this.onAddressChangeClick;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> component6() {
        return this.onCvvFocusChanged;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> component5() {
        return this.onExpirationDateFocusChanged;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> component4() {
        return this.onCardNumberFocusChanged;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component3() {
        return this.onCvvChange;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component2() {
        return this.onExpirationDateChange;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component1() {
        return this.onCardNumberChange;
    }

    public AddCardFormCallbacks() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
