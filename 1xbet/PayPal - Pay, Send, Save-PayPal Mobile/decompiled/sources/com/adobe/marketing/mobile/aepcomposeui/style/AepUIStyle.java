package com.adobe.marketing.mobile.aepcomposeui.style;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/style/AepUIStyle;", "", "Lcom/adobe/marketing/mobile/aepcomposeui/style/SmallImageUIStyle;", "smallImageUiStyle", "<init>", "(Lcom/adobe/marketing/mobile/aepcomposeui/style/SmallImageUIStyle;)V", "Lcom/adobe/marketing/mobile/aepcomposeui/style/SmallImageUIStyle;", "getSmallImageUiStyle", "()Lcom/adobe/marketing/mobile/aepcomposeui/style/SmallImageUIStyle;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepUIStyle {
    public static final int $stable = 8;
    private final com.adobe.marketing.mobile.aepcomposeui.style.SmallImageUIStyle smallImageUiStyle;

    public AepUIStyle(com.adobe.marketing.mobile.aepcomposeui.style.SmallImageUIStyle smallImageUIStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smallImageUIStyle, "");
        this.smallImageUiStyle = smallImageUIStyle;
    }

    public /* synthetic */ AepUIStyle(com.adobe.marketing.mobile.aepcomposeui.style.SmallImageUIStyle smallImageUIStyle, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.adobe.marketing.mobile.aepcomposeui.style.SmallImageUIStyle.Builder().build() : smallImageUIStyle);
    }

    public final com.adobe.marketing.mobile.aepcomposeui.style.SmallImageUIStyle getSmallImageUiStyle() {
        return this.smallImageUiStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AepUIStyle() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
