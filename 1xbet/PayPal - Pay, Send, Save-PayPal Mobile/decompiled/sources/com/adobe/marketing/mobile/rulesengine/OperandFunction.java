package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class OperandFunction<T> implements com.adobe.marketing.mobile.rulesengine.Operand<T> {
    private final java.lang.Object[] getHighSpeedVideoFpsRanges;
    private final com.adobe.marketing.mobile.rulesengine.FunctionBlock<T> getHighSpeedVideoFpsRangesFor;

    public OperandFunction(com.adobe.marketing.mobile.rulesengine.FunctionBlock<T> functionBlock, java.lang.Object... objArr) {
        this.getHighSpeedVideoFpsRangesFor = functionBlock;
        this.getHighSpeedVideoFpsRanges = objArr;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Operand
    public T resolve(com.adobe.marketing.mobile.rulesengine.Context context) {
        return this.getHighSpeedVideoFpsRangesFor.execute(this.getHighSpeedVideoFpsRanges);
    }
}
