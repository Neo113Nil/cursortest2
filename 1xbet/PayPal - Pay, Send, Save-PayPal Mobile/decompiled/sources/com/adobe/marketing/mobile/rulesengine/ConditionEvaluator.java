package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class ConditionEvaluator implements com.adobe.marketing.mobile.rulesengine.Evaluating {
    private final com.adobe.marketing.mobile.rulesengine.ConditionEvaluator.Option getHighResolutionOutputSizeshNQ4ISI;

    public enum Option {
        DEFAULT,
        CASE_INSENSITIVE
    }

    public ConditionEvaluator(com.adobe.marketing.mobile.rulesengine.ConditionEvaluator.Option option) {
        this.getHighResolutionOutputSizeshNQ4ISI = option;
    }

    public ConditionEvaluator() {
        this.getHighResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.rulesengine.ConditionEvaluator.Option.DEFAULT;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a5, code lost:
    
        if (r6.doubleValue() < r8.doubleValue()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0174, code lost:
    
        return com.adobe.marketing.mobile.rulesengine.RulesResult.SUCCESS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0170, code lost:
    
        if (r6 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f3, code lost:
    
        if (r6.doubleValue() > r8.doubleValue()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0112, code lost:
    
        if (r6.doubleValue() <= r8.doubleValue()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013b, code lost:
    
        if (r6.doubleValue() >= r8.doubleValue()) goto L88;
     */
    @Override // com.adobe.marketing.mobile.rulesengine.Evaluating
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <A, B> com.adobe.marketing.mobile.rulesengine.RulesResult evaluate(A a2, java.lang.String str, B b) {
        char c;
        java.lang.String str2;
        boolean matches;
        boolean highResolutionOutputSizeshNQ4ISI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1555538761:
                if (str.equals("startsWith")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1398769830:
                if (str.equals("greaterEqual")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1295482945:
                if (str.equals("equals")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -567445985:
                if (str.equals("contains")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -148438510:
                if (str.equals("notContains")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 341896475:
                if (str.equals("lessEqual")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 881486962:
                if (str.equals("notEquals")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 925147323:
                if (str.equals("greaterThan")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1743158238:
                if (str.equals("endsWith")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2089676506:
                if (str.equals("lessThan")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if ((a2 instanceof java.lang.String) && (b instanceof java.lang.String)) {
                    java.lang.String obj = a2.toString();
                    java.lang.String obj2 = b.toString();
                    str2 = this.getHighResolutionOutputSizeshNQ4ISI != com.adobe.marketing.mobile.rulesengine.ConditionEvaluator.Option.CASE_INSENSITIVE ? "" : "(?i)";
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str2);
                    sb.append(java.util.regex.Pattern.quote(obj2));
                    sb.append(".*");
                    matches = obj.matches(sb.toString());
                    break;
                }
                return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.CONDITION_FAILED, java.lang.String.format("Condition not matched for operation \"%s\"", str));
            case 1:
                java.lang.Double Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(a2);
                java.lang.Double Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(b);
                if (Camera2StreamConfigurationMap != null) {
                    if (Camera2StreamConfigurationMap2 != null) {
                        break;
                    }
                }
                return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.CONDITION_FAILED, java.lang.String.format("Condition not matched for operation \"%s\"", str));
            case 2:
                matches = Camera2StreamConfigurationMap(a2, b);
                break;
            case 3:
                matches = getHighResolutionOutputSizeshNQ4ISI(a2, b);
                break;
            case 4:
                highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(a2, b);
                matches = !highResolutionOutputSizeshNQ4ISI;
                break;
            case 5:
                java.lang.Double Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(a2);
                java.lang.Double Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(b);
                if (Camera2StreamConfigurationMap3 != null) {
                    if (Camera2StreamConfigurationMap4 != null) {
                        break;
                    }
                }
                return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.CONDITION_FAILED, java.lang.String.format("Condition not matched for operation \"%s\"", str));
            case 6:
                highResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(a2, b);
                matches = !highResolutionOutputSizeshNQ4ISI;
                break;
            case 7:
                java.lang.Double Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(a2);
                java.lang.Double Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap(b);
                if (Camera2StreamConfigurationMap5 != null) {
                    if (Camera2StreamConfigurationMap6 != null) {
                        break;
                    }
                }
                return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.CONDITION_FAILED, java.lang.String.format("Condition not matched for operation \"%s\"", str));
            case '\b':
                if ((a2 instanceof java.lang.String) && (b instanceof java.lang.String)) {
                    java.lang.String obj3 = a2.toString();
                    java.lang.String obj4 = b.toString();
                    str2 = this.getHighResolutionOutputSizeshNQ4ISI != com.adobe.marketing.mobile.rulesengine.ConditionEvaluator.Option.CASE_INSENSITIVE ? "" : "(?i)";
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(str2);
                    sb2.append(".*");
                    sb2.append(java.util.regex.Pattern.quote(obj4));
                    matches = obj3.matches(sb2.toString());
                    break;
                }
                return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.CONDITION_FAILED, java.lang.String.format("Condition not matched for operation \"%s\"", str));
            case '\t':
                java.lang.Double Camera2StreamConfigurationMap7 = Camera2StreamConfigurationMap(a2);
                java.lang.Double Camera2StreamConfigurationMap8 = Camera2StreamConfigurationMap(b);
                if (Camera2StreamConfigurationMap7 != null) {
                    if (Camera2StreamConfigurationMap8 != null) {
                        break;
                    }
                }
                return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.CONDITION_FAILED, java.lang.String.format("Condition not matched for operation \"%s\"", str));
            default:
                return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.MISSING_OPERATOR, java.lang.String.format("Operator is invalid \"%s\"", str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.CONDITION_FAILED, java.lang.String.format("Condition not matched for operation \"%s\"", r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        return com.adobe.marketing.mobile.rulesengine.RulesResult.SUCCESS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r4 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r4 == null) goto L11;
     */
    @Override // com.adobe.marketing.mobile.rulesengine.Evaluating
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <A> com.adobe.marketing.mobile.rulesengine.RulesResult evaluate(java.lang.String str, A a2) {
        str.hashCode();
        if (!str.equals("exists")) {
            if (!str.equals("notExist")) {
                return new com.adobe.marketing.mobile.rulesengine.RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType.MISSING_OPERATOR, java.lang.String.format("Operator is invalid \"%s\"", str));
            }
        }
    }

    private boolean Camera2StreamConfigurationMap(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.String) && (obj2 instanceof java.lang.String) && this.getHighResolutionOutputSizeshNQ4ISI == com.adobe.marketing.mobile.rulesengine.ConditionEvaluator.Option.CASE_INSENSITIVE) {
            return obj.toString().equalsIgnoreCase(obj2.toString());
        }
        return obj.equals(obj2);
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, java.lang.Object obj2) {
        if (!(obj instanceof java.lang.String) || !(obj2 instanceof java.lang.String)) {
            return false;
        }
        java.lang.String obj3 = obj.toString();
        java.lang.String obj4 = obj2.toString();
        if (this.getHighResolutionOutputSizeshNQ4ISI == com.adobe.marketing.mobile.rulesengine.ConditionEvaluator.Option.CASE_INSENSITIVE) {
            obj3 = obj3.toLowerCase();
            obj4 = obj4.toLowerCase();
        }
        return obj3.contains(obj4);
    }

    private static java.lang.Double Camera2StreamConfigurationMap(java.lang.Object obj) {
        try {
            return java.lang.Double.valueOf(obj.toString());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
