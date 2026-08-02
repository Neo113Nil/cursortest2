package com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;", "", "", "dateFormat", "inputMaskFormat", "", "isFocused", "errorText", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDateFormat", "getInputMaskFormat", "Z", "getErrorText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MosaicDateFieldUiModel {
    public static final int $stable = 0;
    private final java.lang.String dateFormat;
    private final java.lang.String errorText;
    private final java.lang.String inputMaskFormat;
    private final boolean isFocused;

    public MosaicDateFieldUiModel(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.dateFormat = str;
        this.inputMaskFormat = str2;
        this.isFocused = z;
        this.errorText = str3;
    }

    public /* synthetic */ MosaicDateFieldUiModel(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3);
    }

    public final java.lang.String getDateFormat() {
        return this.dateFormat;
    }

    public final java.lang.String getInputMaskFormat() {
        return this.inputMaskFormat;
    }

    public final boolean isFocused() {
        return this.isFocused;
    }

    public final java.lang.String getErrorText() {
        return this.errorText;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.dateFormat;
        java.lang.String str2 = this.inputMaskFormat;
        boolean z = this.isFocused;
        java.lang.String str3 = this.errorText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicDateFieldUiModel(dateFormat=");
        sb.append(str);
        sb.append(", inputMaskFormat=");
        sb.append(str2);
        sb.append(", isFocused=");
        sb.append(z);
        sb.append(", errorText=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.dateFormat.hashCode();
        int hashCode2 = this.inputMaskFormat.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isFocused);
        java.lang.String str = this.errorText;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel mosaicDateFieldUiModel = (com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dateFormat, mosaicDateFieldUiModel.dateFormat) && kotlin.jvm.internal.Intrinsics.areEqual(this.inputMaskFormat, mosaicDateFieldUiModel.inputMaskFormat) && this.isFocused == mosaicDateFieldUiModel.isFocused && kotlin.jvm.internal.Intrinsics.areEqual(this.errorText, mosaicDateFieldUiModel.errorText);
    }

    public final com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel copy(java.lang.String dateFormat, java.lang.String inputMaskFormat, boolean isFocused, java.lang.String errorText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMaskFormat, "");
        return new com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel(dateFormat, inputMaskFormat, isFocused, errorText);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getErrorText() {
        return this.errorText;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getInputMaskFormat() {
        return this.inputMaskFormat;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDateFormat() {
        return this.dateFormat;
    }

    public static /* synthetic */ com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel copy$default(com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel mosaicDateFieldUiModel, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = mosaicDateFieldUiModel.dateFormat;
        }
        if ((i & 2) != 0) {
            str2 = mosaicDateFieldUiModel.inputMaskFormat;
        }
        if ((i & 4) != 0) {
            z = mosaicDateFieldUiModel.isFocused;
        }
        if ((i & 8) != 0) {
            str3 = mosaicDateFieldUiModel.errorText;
        }
        return mosaicDateFieldUiModel.copy(str, str2, z, str3);
    }

    public MosaicDateFieldUiModel() {
        this(null, null, false, null, 15, null);
    }
}
