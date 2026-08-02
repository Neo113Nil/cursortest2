package com.paypal.oslo.feature.qrc.ui.review.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Preset", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME, "Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection$Custom;", "Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection$None;", "Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection$Preset;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class TipSelection {
    public static final int $stable = 0;

    private TipSelection() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection$None;", "Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None extends com.paypal.oslo.feature.qrc.ui.review.model.TipSelection {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.None INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.None();

        public final int hashCode() {
            return -1835314633;
        }

        private None() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.None)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection$Preset;", "Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection;", "Lcom/paypal/oslo/feature/qrc/ui/review/model/PresetTipOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/review/model/PresetTipOption;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/review/model/PresetTipOption;", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/review/model/PresetTipOption;)Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection$Preset;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/ui/review/model/PresetTipOption;", "getOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Preset extends com.paypal.oslo.feature.qrc.ui.review.model.TipSelection {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption option;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Preset(com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption presetTipOption) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presetTipOption, "");
            this.option = presetTipOption;
        }

        public final com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption getOption() {
            return this.option;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption presetTipOption = this.option;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Preset(option=");
            sb.append(presetTipOption);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.option.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Preset) && kotlin.jvm.internal.Intrinsics.areEqual(this.option, ((com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Preset) other).option);
        }

        public final com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Preset copy(com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption option) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
            return new com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Preset(option);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption getOption() {
            return this.option;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Preset copy$default(com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Preset preset, com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption presetTipOption, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                presetTipOption = preset.option;
            }
            return preset.copy(presetTipOption);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection$Custom;", "Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection;", "", "enteredValue", "calculatedAmount", "displayPercentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection$Custom;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEnteredValue", "getCalculatedAmount", "getDisplayPercentage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Custom extends com.paypal.oslo.feature.qrc.ui.review.model.TipSelection {
        public static final int $stable = 0;
        private final java.lang.String calculatedAmount;
        private final java.lang.String displayPercentage;
        private final java.lang.String enteredValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.enteredValue = str;
            this.calculatedAmount = str2;
            this.displayPercentage = str3;
        }

        public /* synthetic */ Custom(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }

        public final java.lang.String getEnteredValue() {
            return this.enteredValue;
        }

        public final java.lang.String getCalculatedAmount() {
            return this.calculatedAmount;
        }

        public final java.lang.String getDisplayPercentage() {
            return this.displayPercentage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.enteredValue;
            java.lang.String str2 = this.calculatedAmount;
            java.lang.String str3 = this.displayPercentage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Custom(enteredValue=");
            sb.append(str);
            sb.append(", calculatedAmount=");
            sb.append(str2);
            sb.append(", displayPercentage=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.enteredValue.hashCode();
            int hashCode2 = this.calculatedAmount.hashCode();
            java.lang.String str = this.displayPercentage;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Custom)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Custom custom = (com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Custom) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.enteredValue, custom.enteredValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.calculatedAmount, custom.calculatedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayPercentage, custom.displayPercentage);
        }

        public final com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Custom copy(java.lang.String enteredValue, java.lang.String calculatedAmount, java.lang.String displayPercentage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enteredValue, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calculatedAmount, "");
            return new com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Custom(enteredValue, calculatedAmount, displayPercentage);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDisplayPercentage() {
            return this.displayPercentage;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCalculatedAmount() {
            return this.calculatedAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEnteredValue() {
            return this.enteredValue;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Custom copy$default(com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Custom custom, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = custom.enteredValue;
            }
            if ((i & 2) != 0) {
                str2 = custom.calculatedAmount;
            }
            if ((i & 4) != 0) {
                str3 = custom.displayPercentage;
            }
            return custom.copy(str, str2, str3);
        }
    }

    public /* synthetic */ TipSelection(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
