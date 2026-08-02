package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class UnaryExpression<A> implements com.adobe.marketing.mobile.rulesengine.Evaluable {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final com.adobe.marketing.mobile.rulesengine.Operand<A> getHighSpeedVideoFpsRangesFor;

    public UnaryExpression(com.adobe.marketing.mobile.rulesengine.Operand<A> operand, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = operand;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Evaluable
    public com.adobe.marketing.mobile.rulesengine.RulesResult evaluate(com.adobe.marketing.mobile.rulesengine.Context context) {
        com.adobe.marketing.mobile.rulesengine.Operand<A> operand = this.getHighSpeedVideoFpsRangesFor;
        A resolve = operand != null ? operand.resolve(context) : null;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        if (str == null || str.isEmpty()) {
            return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.INVALID_OPERAND, java.lang.String.format("Evaluating %s %s returned false", resolve, this.getHighResolutionOutputSizeshNQ4ISI));
        }
        return context.evaluator.evaluate(this.getHighResolutionOutputSizeshNQ4ISI, resolve);
    }
}
