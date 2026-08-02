package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class Transformer implements com.adobe.marketing.mobile.rulesengine.Transforming {
    java.util.Map<java.lang.String, com.adobe.marketing.mobile.rulesengine.TransformerBlock<?>> Camera2StreamConfigurationMap = new java.util.HashMap();

    public void register(java.lang.String str, com.adobe.marketing.mobile.rulesengine.TransformerBlock<?> transformerBlock) {
        this.Camera2StreamConfigurationMap.put(str, transformerBlock);
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Transforming
    public java.lang.Object transform(java.lang.String str, java.lang.Object obj) {
        com.adobe.marketing.mobile.rulesengine.TransformerBlock<?> transformerBlock = this.Camera2StreamConfigurationMap.get(str);
        return transformerBlock == null ? obj : transformerBlock.transform(obj);
    }
}
