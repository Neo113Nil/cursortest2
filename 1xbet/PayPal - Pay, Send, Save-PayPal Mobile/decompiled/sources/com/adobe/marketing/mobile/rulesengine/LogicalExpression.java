package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class LogicalExpression implements com.adobe.marketing.mobile.rulesengine.Evaluable {
    public final java.util.List<com.adobe.marketing.mobile.rulesengine.Evaluable> operands;
    public final java.lang.String operationName;

    public LogicalExpression(java.util.List<com.adobe.marketing.mobile.rulesengine.Evaluable> list, java.lang.String str) {
        this.operands = list;
        this.operationName = str;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Evaluable
    public com.adobe.marketing.mobile.rulesengine.RulesResult evaluate(com.adobe.marketing.mobile.rulesengine.Context context) {
        java.lang.String str = this.operationName;
        if (str == null || str.isEmpty()) {
            return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.MISSING_OPERATOR, "Null or empty operator for logical expression");
        }
        java.lang.String str2 = this.operationName;
        str2.hashCode();
        if (str2.equals("or")) {
            for (com.adobe.marketing.mobile.rulesengine.Evaluable evaluable : this.operands) {
                if (evaluable != null && evaluable.evaluate(context).isSuccess()) {
                    return com.adobe.marketing.mobile.rulesengine.RulesResult.SUCCESS;
                }
            }
            return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.CONDITION_FAILED, "OR operation returned false.");
        }
        if (!str2.equals("and")) {
            return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.MISSING_OPERATOR, java.lang.String.format("Unknown conjunction operator - %s.", this.operationName));
        }
        for (com.adobe.marketing.mobile.rulesengine.Evaluable evaluable2 : this.operands) {
            if (evaluable2 != null && !evaluable2.evaluate(context).isSuccess()) {
                return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.CONDITION_FAILED, "AND operation returned false.");
            }
        }
        return com.adobe.marketing.mobile.rulesengine.RulesResult.SUCCESS;
    }
}
