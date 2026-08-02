package com.zettle.sdk.common.ui.components.illustration;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#"}, d2 = {"Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationAttr;", "", "Landroid/content/res/TypedArray;", "attrsTypedArray", "<init>", "(Landroid/content/res/TypedArray;)V", "component1", "()Landroid/content/res/TypedArray;", "copy", "(Landroid/content/res/TypedArray;)Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationAttr;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/content/res/TypedArray;", "getAttrsTypedArray", "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages;", "image", "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages;", "getImage", "()Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages;", "setImage", "(Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages;)V", "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationStyles;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationStyles;", "getStyle", "()Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationStyles;", "setStyle", "(Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationStyles;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class OttoIllustrationAttr {
    private final android.content.res.TypedArray attrsTypedArray;
    private com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages image;
    private com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles style;

    public OttoIllustrationAttr(android.content.res.TypedArray typedArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "");
        this.attrsTypedArray = typedArray;
        this.style = com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles.DEFAULT;
        try {
            this.image = com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages.INSTANCE.findByValue(typedArray.getInt(com.zettle.sdk.common.ui.R.styleable.OttoIllustration_i_image, -1));
            this.style = com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles.INSTANCE.findByValue(typedArray.getInt(com.zettle.sdk.common.ui.R.styleable.OttoIllustration_i_styles, com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles.DEFAULT.getValue()));
            typedArray.recycle();
        } catch (java.lang.Throwable th) {
            this.attrsTypedArray.recycle();
            throw th;
        }
    }

    public final android.content.res.TypedArray getAttrsTypedArray() {
        return this.attrsTypedArray;
    }

    public final com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages getImage() {
        return this.image;
    }

    public final void setImage(com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages ottoIllustrationImages) {
        this.image = ottoIllustrationImages;
    }

    public final com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles getStyle() {
        return this.style;
    }

    public final void setStyle(com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles ottoIllustrationStyles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ottoIllustrationStyles, "");
        this.style = ottoIllustrationStyles;
    }

    public final java.lang.String toString() {
        android.content.res.TypedArray typedArray = this.attrsTypedArray;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OttoIllustrationAttr(attrsTypedArray=");
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
        return (other instanceof com.zettle.sdk.common.ui.components.illustration.OttoIllustrationAttr) && kotlin.jvm.internal.Intrinsics.areEqual(this.attrsTypedArray, ((com.zettle.sdk.common.ui.components.illustration.OttoIllustrationAttr) other).attrsTypedArray);
    }

    public final com.zettle.sdk.common.ui.components.illustration.OttoIllustrationAttr copy(android.content.res.TypedArray attrsTypedArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrsTypedArray, "");
        return new com.zettle.sdk.common.ui.components.illustration.OttoIllustrationAttr(attrsTypedArray);
    }

    /* renamed from: component1, reason: from getter */
    public final android.content.res.TypedArray getAttrsTypedArray() {
        return this.attrsTypedArray;
    }

    public static /* synthetic */ com.zettle.sdk.common.ui.components.illustration.OttoIllustrationAttr copy$default(com.zettle.sdk.common.ui.components.illustration.OttoIllustrationAttr ottoIllustrationAttr, android.content.res.TypedArray typedArray, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            typedArray = ottoIllustrationAttr.attrsTypedArray;
        }
        return ottoIllustrationAttr.copy(typedArray);
    }
}
