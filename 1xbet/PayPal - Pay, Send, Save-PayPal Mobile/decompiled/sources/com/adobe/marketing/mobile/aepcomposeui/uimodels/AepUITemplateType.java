package com.adobe.marketing.mobile.aepcomposeui.uimodels;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplateType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "typeName", "Ljava/lang/String;", "getTypeName", "()Ljava/lang/String;", "SMALL_IMAGE", "LARGE_IMAGE", "IMAGE_ONLY"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public enum AepUITemplateType {
    SMALL_IMAGE("SmallImage"),
    LARGE_IMAGE("LargeImage"),
    IMAGE_ONLY("ImageOnly");

    private final java.lang.String typeName;

    AepUITemplateType(java.lang.String str) {
        this.typeName = str;
    }

    public final java.lang.String getTypeName() {
        return this.typeName;
    }
}
