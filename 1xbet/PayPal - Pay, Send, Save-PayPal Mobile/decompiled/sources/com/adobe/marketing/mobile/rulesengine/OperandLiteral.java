package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class OperandLiteral<T> implements com.adobe.marketing.mobile.rulesengine.Operand<T> {
    private final T Camera2StreamConfigurationMap;

    public OperandLiteral(T t) {
        this.Camera2StreamConfigurationMap = t;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Operand
    public T resolve(com.adobe.marketing.mobile.rulesengine.Context context) {
        return this.Camera2StreamConfigurationMap;
    }
}
