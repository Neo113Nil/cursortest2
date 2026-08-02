package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class ComparisonExpression<A, B> implements com.adobe.marketing.mobile.rulesengine.Evaluable {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final com.adobe.marketing.mobile.rulesengine.Operand<B> getHighSpeedVideoFpsRanges;
    private final com.adobe.marketing.mobile.rulesengine.Operand<A> getHighSpeedVideoSizes;

    public ComparisonExpression(com.adobe.marketing.mobile.rulesengine.Operand<A> operand, java.lang.String str, com.adobe.marketing.mobile.rulesengine.Operand<B> operand2) {
        this.getHighSpeedVideoSizes = operand;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = operand2;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Evaluable
    public com.adobe.marketing.mobile.rulesengine.RulesResult evaluate(com.adobe.marketing.mobile.rulesengine.Context context) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.MISSING_OPERATOR, "Operator is null, Comparison returned false");
        }
        com.adobe.marketing.mobile.rulesengine.Operand<A> operand = this.getHighSpeedVideoSizes;
        if (operand == null || this.getHighSpeedVideoFpsRanges == null) {
            return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.INVALID_OPERAND, "Operand is null, Comparison returned false.");
        }
        A resolve = operand.resolve(context);
        B resolve2 = this.getHighSpeedVideoFpsRanges.resolve(context);
        if (resolve == null || resolve2 == null) {
            return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.INVALID_OPERAND, java.lang.String.format("Comparison %s %s %s returned false", resolve, this.getHighResolutionOutputSizeshNQ4ISI, resolve2));
        }
        return context.evaluator.evaluate(resolve, this.getHighResolutionOutputSizeshNQ4ISI, resolve2);
    }
}
