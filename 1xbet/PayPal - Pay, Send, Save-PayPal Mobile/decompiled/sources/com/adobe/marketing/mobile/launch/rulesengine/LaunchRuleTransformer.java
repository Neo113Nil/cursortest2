package com.adobe.marketing.mobile.launch.rulesengine;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRuleTransformer;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/rulesengine/Transforming;", "createTransforming", "()Lcom/adobe/marketing/mobile/rulesengine/Transforming;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class LaunchRuleTransformer {
    public static final com.adobe.marketing.mobile.launch.rulesengine.LaunchRuleTransformer INSTANCE = new com.adobe.marketing.mobile.launch.rulesengine.LaunchRuleTransformer();

    private LaunchRuleTransformer() {
    }

    public final com.adobe.marketing.mobile.rulesengine.Transforming createTransforming() {
        com.adobe.marketing.mobile.rulesengine.Transformer transformer = new com.adobe.marketing.mobile.rulesengine.Transformer();
        transformer.register(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.URL_ENCODING_FUNCTION, new com.adobe.marketing.mobile.rulesengine.TransformerBlock() { // from class: com.adobe.marketing.mobile.launch.rulesengine.LaunchRuleTransformer$$ExternalSyntheticLambda4
            @Override // com.adobe.marketing.mobile.rulesengine.TransformerBlock
            public final java.lang.Object transform(java.lang.Object obj) {
                return com.adobe.marketing.mobile.launch.rulesengine.LaunchRuleTransformer.$r8$lambda$uAH27LTtLINEvfe3JOc7svt9bsc(obj);
            }
        });
        transformer.register(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT, new com.adobe.marketing.mobile.rulesengine.TransformerBlock() { // from class: com.adobe.marketing.mobile.launch.rulesengine.LaunchRuleTransformer$$ExternalSyntheticLambda0
            @Override // com.adobe.marketing.mobile.rulesengine.TransformerBlock
            public final java.lang.Object transform(java.lang.Object obj) {
                return com.adobe.marketing.mobile.launch.rulesengine.LaunchRuleTransformer.$r8$lambda$64QoEdRqsbjPSrWE3kQbfwiTeQ0(obj);
            }
        });
        transformer.register("string", new com.adobe.marketing.mobile.rulesengine.TransformerBlock() { // from class: com.adobe.marketing.mobile.launch.rulesengine.LaunchRuleTransformer$$ExternalSyntheticLambda1
            @Override // com.adobe.marketing.mobile.rulesengine.TransformerBlock
            public final java.lang.Object transform(java.lang.Object obj) {
                return com.adobe.marketing.mobile.launch.rulesengine.LaunchRuleTransformer.$r8$lambda$bN8dAUQ3dYA4QGQVqHZS68z3YnA(obj);
            }
        });
        transformer.register(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_DOUBLE, new com.adobe.marketing.mobile.rulesengine.TransformerBlock() { // from class: com.adobe.marketing.mobile.launch.rulesengine.LaunchRuleTransformer$$ExternalSyntheticLambda2
            @Override // com.adobe.marketing.mobile.rulesengine.TransformerBlock
            public final java.lang.Object transform(java.lang.Object obj) {
                return com.adobe.marketing.mobile.launch.rulesengine.LaunchRuleTransformer.$r8$lambda$40NthKGyfmWCMPiLQDJRLW5To4g(obj);
            }
        });
        transformer.register(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_BOOL, new com.adobe.marketing.mobile.rulesengine.TransformerBlock() { // from class: com.adobe.marketing.mobile.launch.rulesengine.LaunchRuleTransformer$$ExternalSyntheticLambda3
            @Override // com.adobe.marketing.mobile.rulesengine.TransformerBlock
            public final java.lang.Object transform(java.lang.Object obj) {
                return com.adobe.marketing.mobile.launch.rulesengine.LaunchRuleTransformer.$r8$lambda$SqCENskGlnZxBfSEOOqJh3uk48Q(obj);
            }
        });
        return transformer;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$40NthKGyfmWCMPiLQDJRLW5To4g(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull((java.lang.String) obj);
            return doubleOrNull == null ? obj : doubleOrNull;
        }
        if (obj instanceof java.lang.Number) {
            return java.lang.Double.valueOf(((java.lang.Number) obj).doubleValue());
        }
        if (!(obj instanceof java.lang.Boolean)) {
            return obj;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return java.lang.Double.valueOf(((java.lang.Boolean) obj).booleanValue() ? 1.0d : 0.0d);
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$64QoEdRqsbjPSrWE3kQbfwiTeQ0(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull((java.lang.String) obj);
            return intOrNull == null ? obj : intOrNull;
        }
        if (obj instanceof java.lang.Number) {
            return java.lang.Integer.valueOf(((java.lang.Number) obj).intValue());
        }
        if (!(obj instanceof java.lang.Boolean)) {
            return obj;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return java.lang.Integer.valueOf(((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$SqCENskGlnZxBfSEOOqJh3uk48Q(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean((java.lang.String) obj));
        }
        if (!(obj instanceof java.lang.Number)) {
            return obj;
        }
        java.lang.Number number = (java.lang.Number) obj;
        return java.lang.Boolean.valueOf(number.longValue() == 1 && number.doubleValue() == 1.0d);
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$bN8dAUQ3dYA4QGQVqHZS68z3YnA(java.lang.Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$uAH27LTtLINEvfe3JOc7svt9bsc(java.lang.Object obj) {
        return obj instanceof java.lang.String ? com.adobe.marketing.mobile.internal.util.UrlEncoder.urlEncode((java.lang.String) obj) : obj;
    }
}
