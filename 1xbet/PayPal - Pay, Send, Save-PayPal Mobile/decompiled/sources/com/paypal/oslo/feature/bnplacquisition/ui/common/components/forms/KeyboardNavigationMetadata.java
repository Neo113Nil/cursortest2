package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/KeyboardNavigationMetadata;", "", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "", "scrollKey", "<init>", "(ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-eUduSuo", "()I", "component1", "component2", "()Ljava/lang/String;", "copy-_5mk2c8", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/KeyboardNavigationMetadata;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getImeAction-eUduSuo", "Ljava/lang/String;", "getScrollKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class KeyboardNavigationMetadata {
    public static final int $stable = 0;
    private final int imeAction;
    private final java.lang.String scrollKey;

    private KeyboardNavigationMetadata(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.imeAction = i;
        this.scrollKey = str;
    }

    public /* synthetic */ KeyboardNavigationMetadata(int i, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? androidx.compose.ui.text.input.ImeAction.INSTANCE.m8213getDefaulteUduSuo() : i, (i2 & 2) != 0 ? "" : str, null);
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m12381getImeActioneUduSuo() {
        return this.imeAction;
    }

    public final java.lang.String getScrollKey() {
        return this.scrollKey;
    }

    public final java.lang.String toString() {
        java.lang.String m8202toStringimpl = androidx.compose.ui.text.input.ImeAction.m8202toStringimpl(this.imeAction);
        java.lang.String str = this.scrollKey;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyboardNavigationMetadata(imeAction=");
        sb.append(m8202toStringimpl);
        sb.append(", scrollKey=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (androidx.compose.ui.text.input.ImeAction.m8201hashCodeimpl(this.imeAction) * 31) + this.scrollKey.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.KeyboardNavigationMetadata)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.KeyboardNavigationMetadata keyboardNavigationMetadata = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.KeyboardNavigationMetadata) other;
        return androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(this.imeAction, keyboardNavigationMetadata.imeAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.scrollKey, keyboardNavigationMetadata.scrollKey);
    }

    /* renamed from: copy-_5mk2c8, reason: not valid java name */
    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.KeyboardNavigationMetadata m12380copy_5mk2c8(int imeAction, java.lang.String scrollKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollKey, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.KeyboardNavigationMetadata(imeAction, scrollKey, null);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getScrollKey() {
        return this.scrollKey;
    }

    /* renamed from: component1-eUduSuo, reason: not valid java name and from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    /* renamed from: copy-_5mk2c8$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.KeyboardNavigationMetadata m12378copy_5mk2c8$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.KeyboardNavigationMetadata keyboardNavigationMetadata, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = keyboardNavigationMetadata.imeAction;
        }
        if ((i2 & 2) != 0) {
            str = keyboardNavigationMetadata.scrollKey;
        }
        return keyboardNavigationMetadata.m12380copy_5mk2c8(i, str);
    }

    public /* synthetic */ KeyboardNavigationMetadata(int i, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }
}
