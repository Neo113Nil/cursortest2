package com.adobe.marketing.mobile.messaging;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a'\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "", "", "", "getMeta", "(Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;)Ljava/util/Map;"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentCardAepUIExtensionsKt {
    public static final java.util.Map<java.lang.String, java.lang.Object> getMeta(com.adobe.marketing.mobile.aepcomposeui.AepUI<?, ?> aepUI) {
        com.adobe.marketing.mobile.messaging.ContentCardSchemaData contentCardSchemaData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepUI, "");
        java.lang.Object template = aepUI.getTemplate();
        if (!(template instanceof com.adobe.marketing.mobile.aepcomposeui.uimodels.SmallImageTemplate) || (contentCardSchemaData = com.adobe.marketing.mobile.messaging.ContentCardMapper.INSTANCE.getInstance().getContentCardSchemaData(((com.adobe.marketing.mobile.aepcomposeui.uimodels.SmallImageTemplate) template).getId())) == null) {
            return null;
        }
        return contentCardSchemaData.getMeta();
    }
}
