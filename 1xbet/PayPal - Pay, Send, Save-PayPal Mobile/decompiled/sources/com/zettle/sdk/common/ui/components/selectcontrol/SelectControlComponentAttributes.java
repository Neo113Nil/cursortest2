package com.zettle.sdk.common.ui.components.selectcontrol;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\"\u0010\u0016\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010\u001f\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\"\u0010\"\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR$\u0010%\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010)R$\u0010*\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010)R$\u0010-\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010)R$\u00100\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u0013\"\u0004\b2\u0010)"}, d2 = {"Lcom/zettle/sdk/common/ui/components/selectcontrol/SelectControlComponentAttributes;", "", "Landroid/content/res/TypedArray;", "attrsTypedArray", "<init>", "(Landroid/content/res/TypedArray;)V", "component1", "()Landroid/content/res/TypedArray;", "copy", "(Landroid/content/res/TypedArray;)Lcom/zettle/sdk/common/ui/components/selectcontrol/SelectControlComponentAttributes;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/content/res/TypedArray;", "getAttrsTypedArray", "checked", "Z", "getChecked", "()Z", "setChecked", "(Z)V", "clickable", "getClickable", "setClickable", "enabled", "getEnabled", "setEnabled", "error", "getError", "setError", "hintText", "Ljava/lang/String;", "getHintText", "setHintText", "(Ljava/lang/String;)V", "label", "getLabel", "setLabel", "selectControlDefaultContentDescription", "getSelectControlDefaultContentDescription", "setSelectControlDefaultContentDescription", "selectControlErrorContentDescription", "getSelectControlErrorContentDescription", "setSelectControlErrorContentDescription"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SelectControlComponentAttributes {
    private final android.content.res.TypedArray attrsTypedArray;
    private boolean checked;
    private boolean clickable;
    private boolean enabled;
    private boolean error;
    private java.lang.String hintText;
    private java.lang.String label;
    private java.lang.String selectControlDefaultContentDescription;
    private java.lang.String selectControlErrorContentDescription;

    public SelectControlComponentAttributes(android.content.res.TypedArray typedArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "");
        this.attrsTypedArray = typedArray;
        this.enabled = true;
        this.clickable = true;
        try {
            this.label = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.SelectControlComponent_scc_label);
            this.hintText = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.SelectControlComponent_scc_hintText);
            this.enabled = typedArray.getBoolean(com.zettle.sdk.common.ui.R.styleable.SelectControlComponent_android_enabled, this.enabled);
            this.error = typedArray.getBoolean(com.zettle.sdk.common.ui.R.styleable.SelectControlComponent_scc_error, this.error);
            this.checked = typedArray.getBoolean(com.zettle.sdk.common.ui.R.styleable.SelectControlComponent_android_checked, this.checked);
            this.clickable = typedArray.getBoolean(com.zettle.sdk.common.ui.R.styleable.SelectControlComponent_android_clickable, this.clickable);
            this.selectControlDefaultContentDescription = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.SelectControlComponent_scc_contentDescription);
            this.selectControlErrorContentDescription = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.SelectControlComponent_scc_errorContentDescription);
            typedArray.recycle();
        } catch (java.lang.Throwable th) {
            this.attrsTypedArray.recycle();
            throw th;
        }
    }

    public final android.content.res.TypedArray getAttrsTypedArray() {
        return this.attrsTypedArray;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final void setLabel(java.lang.String str) {
        this.label = str;
    }

    public final java.lang.String getHintText() {
        return this.hintText;
    }

    public final void setHintText(java.lang.String str) {
        this.hintText = str;
    }

    public final boolean getError() {
        return this.error;
    }

    public final void setError(boolean z) {
        this.error = z;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final void setClickable(boolean z) {
        this.clickable = z;
    }

    public final java.lang.String getSelectControlDefaultContentDescription() {
        return this.selectControlDefaultContentDescription;
    }

    public final void setSelectControlDefaultContentDescription(java.lang.String str) {
        this.selectControlDefaultContentDescription = str;
    }

    public final java.lang.String getSelectControlErrorContentDescription() {
        return this.selectControlErrorContentDescription;
    }

    public final void setSelectControlErrorContentDescription(java.lang.String str) {
        this.selectControlErrorContentDescription = str;
    }

    public final java.lang.String toString() {
        android.content.res.TypedArray typedArray = this.attrsTypedArray;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectControlComponentAttributes(attrsTypedArray=");
        sb.append(typedArray);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.attrsTypedArray.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.sdk.common.ui.components.selectcontrol.SelectControlComponentAttributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.attrsTypedArray, ((com.zettle.sdk.common.ui.components.selectcontrol.SelectControlComponentAttributes) other).attrsTypedArray);
    }

    public final com.zettle.sdk.common.ui.components.selectcontrol.SelectControlComponentAttributes copy(android.content.res.TypedArray attrsTypedArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrsTypedArray, "");
        return new com.zettle.sdk.common.ui.components.selectcontrol.SelectControlComponentAttributes(attrsTypedArray);
    }

    /* renamed from: component1, reason: from getter */
    public final android.content.res.TypedArray getAttrsTypedArray() {
        return this.attrsTypedArray;
    }

    public static /* synthetic */ com.zettle.sdk.common.ui.components.selectcontrol.SelectControlComponentAttributes copy$default(com.zettle.sdk.common.ui.components.selectcontrol.SelectControlComponentAttributes selectControlComponentAttributes, android.content.res.TypedArray typedArray, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            typedArray = selectControlComponentAttributes.attrsTypedArray;
        }
        return selectControlComponentAttributes.copy(typedArray);
    }
}
