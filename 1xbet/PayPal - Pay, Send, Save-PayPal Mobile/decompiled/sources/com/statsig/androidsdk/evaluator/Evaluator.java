package com.statsig.androidsdk.evaluator;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019JQ\u0010 \u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2.\u0010\u001f\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d0\u001cj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d`\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\"\u0010\u0019J\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b#\u0010\u0019J'\u0010%\u001a\u00020$2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010(JG\u0010.\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00012\"\u0010-\u001a\u001e\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b,\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b,\u0012\u0004\u0012\u00020$0+H\u0002¢\u0006\u0004\b.\u0010/R\u0018\u00101\u001a\u0006*\u000200008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0006*\u000200008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\"\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/statsig/androidsdk/evaluator/Evaluator;", "", "Lcom/statsig/androidsdk/evaluator/SpecStore;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "<init>", "(Lcom/statsig/androidsdk/evaluator/SpecStore;)V", "", "input", "Lkotlin/ULong;", "computeUserHash-I7RO_PI", "(Ljava/lang/String;)J", "computeUserHash", "Lcom/statsig/androidsdk/StatsigUser;", "user", "Lcom/statsig/androidsdk/evaluator/Spec;", "spec", "Lcom/statsig/androidsdk/evaluator/ConfigEvaluation;", "evaluate", "(Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/evaluator/Spec;)Lcom/statsig/androidsdk/evaluator/ConfigEvaluation;", "Lcom/statsig/androidsdk/evaluator/SpecCondition;", "condition", "evaluateCondition", "(Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/evaluator/SpecCondition;)Lcom/statsig/androidsdk/evaluator/ConfigEvaluation;", "name", "evaluateConfig$android_sdk_release", "(Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;)Lcom/statsig/androidsdk/evaluator/ConfigEvaluation;", "Lcom/statsig/androidsdk/evaluator/SpecRule;", "rule", "Ljava/util/ArrayList;", "", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "secondaryExposures", "evaluateDelegate", "(Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/evaluator/SpecRule;Ljava/util/ArrayList;)Lcom/statsig/androidsdk/evaluator/ConfigEvaluation;", "evaluateGate$android_sdk_release", "evaluateLayer$android_sdk_release", "", "evaluatePassPercent", "(Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/evaluator/Spec;Lcom/statsig/androidsdk/evaluator/SpecRule;)Z", "evaluateRule", "(Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/evaluator/SpecRule;)Lcom/statsig/androidsdk/evaluator/ConfigEvaluation;", "version1", "version2", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "compare", "versionCompareHelper", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Z", "Ljava/util/Calendar;", "calendarOne", "Ljava/util/Calendar;", "calendarTwo", "", "hashLookupTable", "Ljava/util/Map;", "Lcom/statsig/androidsdk/evaluator/SpecStore;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Evaluator {
    private final java.util.Calendar calendarOne;
    private final java.util.Calendar calendarTwo;
    private java.util.Map<java.lang.String, kotlin.ULong> hashLookupTable;
    private final com.statsig.androidsdk.evaluator.SpecStore store;

    public Evaluator(com.statsig.androidsdk.evaluator.SpecStore specStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specStore, "");
        this.store = specStore;
        this.calendarOne = java.util.Calendar.getInstance();
        this.calendarTwo = java.util.Calendar.getInstance();
        this.hashLookupTable = new java.util.HashMap();
    }

    public final com.statsig.androidsdk.evaluator.ConfigEvaluation evaluateGate$android_sdk_release(java.lang.String name2, com.statsig.androidsdk.StatsigUser user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        com.statsig.androidsdk.evaluator.Spec gate = this.store.getGate(name2);
        return gate == null ? new com.statsig.androidsdk.evaluator.ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, true, null, 3071, null) : evaluate(user, gate);
    }

    public final com.statsig.androidsdk.evaluator.ConfigEvaluation evaluateConfig$android_sdk_release(java.lang.String name2, com.statsig.androidsdk.StatsigUser user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        com.statsig.androidsdk.evaluator.Spec config = this.store.getConfig(name2);
        return config == null ? new com.statsig.androidsdk.evaluator.ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, true, null, 3071, null) : evaluate(user, config);
    }

    public final com.statsig.androidsdk.evaluator.ConfigEvaluation evaluateLayer$android_sdk_release(java.lang.String name2, com.statsig.androidsdk.StatsigUser user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        com.statsig.androidsdk.evaluator.Spec layer = this.store.getLayer(name2);
        return layer == null ? new com.statsig.androidsdk.evaluator.ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, true, null, 3071, null) : evaluate(user, layer);
    }

    private final com.statsig.androidsdk.evaluator.ConfigEvaluation evaluate(com.statsig.androidsdk.StatsigUser user, com.statsig.androidsdk.evaluator.Spec spec) {
        try {
            if (!spec.getEnabled()) {
                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(false, spec.getDefaultValue().getValue(), spec.getDefaultValue(), "disabled", null, null, null, null, false, false, false, spec.getVersion(), 2032, null);
            }
            java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arrayList = new java.util.ArrayList<>();
            for (com.statsig.androidsdk.evaluator.SpecRule specRule : spec.getRules()) {
                try {
                    com.statsig.androidsdk.evaluator.ConfigEvaluation evaluateRule = evaluateRule(user, specRule);
                    arrayList.addAll(evaluateRule.getSecondaryExposures());
                    if (evaluateRule.getBooleanValue()) {
                        com.statsig.androidsdk.evaluator.ConfigEvaluation evaluateDelegate = evaluateDelegate(user, specRule, arrayList);
                        if (evaluateDelegate != null) {
                            evaluateDelegate.setConfigVersion(spec.getVersion());
                            return evaluateDelegate;
                        }
                        boolean evaluatePassPercent = evaluatePassPercent(user, spec, specRule);
                        java.lang.Object jsonValue = evaluatePassPercent ? evaluateRule.getJsonValue() : spec.getDefaultValue().getValue();
                        com.statsig.androidsdk.evaluator.ReturnableValue returnableValue = evaluatePassPercent ? evaluateRule.getReturnableValue() : spec.getDefaultValue();
                        java.lang.String ruleID = evaluateRule.getRuleID();
                        java.lang.String groupName = evaluateRule.getGroupName();
                        java.lang.Boolean isExperimentGroup = specRule.isExperimentGroup();
                        return new com.statsig.androidsdk.evaluator.ConfigEvaluation(evaluatePassPercent, jsonValue, returnableValue, ruleID, groupName, arrayList, null, null, isExperimentGroup != null ? isExperimentGroup.booleanValue() : false, spec.isActive(), false, spec.getVersion(), 1216, null);
                    }
                } catch (com.statsig.androidsdk.evaluator.UnsupportedEvaluationException e) {
                    e = e;
                    com.statsig.androidsdk.ErrorBoundary.logException$android_sdk_release$default(com.statsig.androidsdk.Statsig.INSTANCE.getClient$android_sdk_release().getErrorBoundary(), e, "evaluate", null, 4, null);
                    com.statsig.androidsdk.evaluator.ReturnableValue defaultValue = spec.getDefaultValue();
                    java.util.List<java.lang.String> explicitParameters = spec.getExplicitParameters();
                    if (explicitParameters == null) {
                        explicitParameters = kotlin.collections.CollectionsKt.emptyList();
                    }
                    return new com.statsig.androidsdk.evaluator.ConfigEvaluation(false, defaultValue, null, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, null, null, explicitParameters, null, false, spec.isActive(), false, spec.getVersion(), 1460, null);
                }
            }
            return new com.statsig.androidsdk.evaluator.ConfigEvaluation(false, spec.getDefaultValue().getValue(), spec.getDefaultValue(), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, null, arrayList, null, null, false, spec.isActive(), false, spec.getVersion(), 1472, null);
        } catch (com.statsig.androidsdk.evaluator.UnsupportedEvaluationException e2) {
            e = e2;
        }
    }

    private final com.statsig.androidsdk.evaluator.ConfigEvaluation evaluateRule(com.statsig.androidsdk.StatsigUser user, com.statsig.androidsdk.evaluator.SpecRule rule) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.statsig.androidsdk.evaluator.SpecCondition> it = rule.getConditions().iterator();
        boolean z = true;
        while (it.hasNext()) {
            com.statsig.androidsdk.evaluator.ConfigEvaluation evaluateCondition = evaluateCondition(user, it.next());
            if (!evaluateCondition.getBooleanValue()) {
                z = false;
            }
            arrayList.addAll(evaluateCondition.getSecondaryExposures());
        }
        return new com.statsig.androidsdk.evaluator.ConfigEvaluation(z, rule.getReturnValue().getValue(), rule.getReturnValue(), rule.getId(), rule.getGroupName(), arrayList, null, null, kotlin.jvm.internal.Intrinsics.areEqual(rule.isExperimentGroup(), java.lang.Boolean.TRUE), false, false, null, 3776, null);
    }

    private final com.statsig.androidsdk.evaluator.ConfigEvaluation evaluateDelegate(com.statsig.androidsdk.StatsigUser user, com.statsig.androidsdk.evaluator.SpecRule rule, java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> secondaryExposures) {
        com.statsig.androidsdk.evaluator.Spec config;
        java.lang.String configDelegate = rule.getConfigDelegate();
        if (configDelegate == null || (config = this.store.getConfig(configDelegate)) == null) {
            return null;
        }
        com.statsig.androidsdk.evaluator.ConfigEvaluation evaluate = evaluate(user, config);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(secondaryExposures);
        secondaryExposures.addAll(evaluate.getSecondaryExposures());
        com.statsig.androidsdk.evaluator.ConfigEvaluation configEvaluation = new com.statsig.androidsdk.evaluator.ConfigEvaluation(evaluate.getBooleanValue(), evaluate.getJsonValue(), evaluate.getReturnableValue(), evaluate.getRuleID(), evaluate.getGroupName(), secondaryExposures, config.getExplicitParameters(), configDelegate, evaluate.getIsExperimentGroup(), evaluate.getIsActive(), false, null, 3072, null);
        configEvaluation.setUndelegatedSecondaryExposures(arrayList);
        return configEvaluation;
    }

    private final com.statsig.androidsdk.evaluator.ConfigEvaluation evaluateCondition(com.statsig.androidsdk.StatsigUser user, com.statsig.androidsdk.evaluator.SpecCondition condition) {
        java.lang.String str;
        boolean z;
        java.lang.String obj;
        java.lang.Object fromUser;
        try {
            java.lang.String field = condition.getField();
            str = "";
            if (field == null) {
                field = "";
            }
            try {
                java.lang.String upperCase = condition.getType().toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                com.statsig.androidsdk.evaluator.ConfigCondition valueOf = com.statsig.androidsdk.evaluator.ConfigCondition.valueOf(upperCase);
                boolean z2 = false;
                switch (valueOf == null ? -1 : com.statsig.androidsdk.evaluator.Evaluator.WhenMappings.$EnumSwitchMapping$0[valueOf.ordinal()]) {
                    case 1:
                        return new com.statsig.androidsdk.evaluator.ConfigEvaluation(true, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                    case 2:
                    case 3:
                        java.lang.Object targetValue = condition.getTargetValue();
                        if (targetValue != null && (obj = targetValue.toString()) != null) {
                            str = obj;
                        }
                        com.statsig.androidsdk.evaluator.ConfigEvaluation evaluateGate$android_sdk_release = evaluateGate$android_sdk_release(str, user);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.addAll(evaluateGate$android_sdk_release.getSecondaryExposures());
                        if (!kotlin.text.StringsKt.startsWith$default(str, "segment:", false, 2, (java.lang.Object) null)) {
                            arrayList.add(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("gate", str), kotlin.TuplesKt.to("gateValue", java.lang.String.valueOf(evaluateGate$android_sdk_release.getBooleanValue())), kotlin.TuplesKt.to("ruleID", evaluateGate$android_sdk_release.getRuleID())));
                        }
                        if (valueOf == com.statsig.androidsdk.evaluator.ConfigCondition.PASS_GATE) {
                            z2 = evaluateGate$android_sdk_release.getBooleanValue();
                        } else if (!evaluateGate$android_sdk_release.getBooleanValue()) {
                            z = true;
                            return new com.statsig.androidsdk.evaluator.ConfigEvaluation(z, evaluateGate$android_sdk_release.getJsonValue(), evaluateGate$android_sdk_release.getReturnableValue(), "", "", arrayList, null, null, false, false, false, null, 4032, null);
                        }
                        z = z2;
                        return new com.statsig.androidsdk.evaluator.ConfigEvaluation(z, evaluateGate$android_sdk_release.getJsonValue(), evaluateGate$android_sdk_release.getReturnableValue(), "", "", arrayList, null, null, false, false, false, null, 4032, null);
                    case 4:
                    case 5:
                    case 6:
                        fromUser = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getFromUser(user, field);
                        break;
                    case 7:
                        fromUser = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                        break;
                    case 8:
                        fromUser = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getFromEnvironment(user, field);
                        break;
                    case 9:
                        com.statsig.androidsdk.evaluator.EvaluatorUtils evaluatorUtils = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE;
                        java.util.Map<java.lang.String, java.lang.Object> additionalValues = condition.getAdditionalValues();
                        java.lang.String valueAsString = evaluatorUtils.getValueAsString(additionalValues != null ? additionalValues.get("salt") : null);
                        java.lang.String unitID = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getUnitID(user, condition.getIdType());
                        str = unitID != null ? unitID : "";
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(valueAsString);
                        sb.append(".");
                        sb.append(str);
                        fromUser = kotlin.ULong.m23493boximpl(java.lang.Long.remainderUnsigned(m23131computeUserHashI7RO_PI(sb.toString()), 1000L));
                        break;
                    case 10:
                        fromUser = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getUnitID(user, condition.getIdType());
                        break;
                    default:
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported evaluation condition: ");
                        sb2.append(valueOf);
                        throw new com.statsig.androidsdk.evaluator.UnsupportedEvaluationException(sb2.toString());
                }
                java.lang.String operator = condition.getOperator();
                if (operator != null) {
                    switch (operator.hashCode()) {
                        case -1691202285:
                            if (operator.equals("str_starts_with_any")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.matchStringInArray(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$11
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.startsWith(str2, str3, true));
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case -1548092646:
                            if (operator.equals("str_contains_any")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.matchStringInArray(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$13
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.contains((java.lang.CharSequence) str2, (java.lang.CharSequence) str3, true));
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case -1392885889:
                            if (operator.equals("before")) {
                                return com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.compareDates(new kotlin.jvm.functions.Function2<java.util.Date, java.util.Date, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$15
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.util.Date date, java.util.Date date2) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date2, "");
                                        return java.lang.Boolean.valueOf(date.before(date2));
                                    }
                                }, fromUser, condition.getTargetValue());
                            }
                            break;
                        case -921508102:
                            if (operator.equals("any_case_sensitive")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.matchStringInArray(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$9
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.equals(str2, str3, false));
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case -745843766:
                            if (operator.equals("str_contains_none")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(!com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.matchStringInArray(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$14
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.contains((java.lang.CharSequence) str2, (java.lang.CharSequence) str3, true));
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case -670497421:
                            if (operator.equals("version_eq")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(versionCompareHelper(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.versionCompare(str2, str3) == 0);
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case -670497356:
                            if (operator.equals("version_gt")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(versionCompareHelper(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.versionCompare(str2, str3) > 0);
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case -670497201:
                            if (operator.equals("version_lt")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(versionCompareHelper(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.versionCompare(str2, str3) < 0);
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 3244:
                            if (operator.equals("eq")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(kotlin.jvm.internal.Intrinsics.areEqual(fromUser, condition.getTargetValue()), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 3309:
                            if (operator.equals("gt")) {
                                java.lang.Double valueAsDouble = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getValueAsDouble(fromUser);
                                java.lang.Double valueAsDouble2 = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getValueAsDouble(condition.getTargetValue());
                                if (valueAsDouble == null || valueAsDouble2 == null) {
                                    return new com.statsig.androidsdk.evaluator.ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                                }
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(valueAsDouble.doubleValue() > valueAsDouble2.doubleValue(), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 3464:
                            if (operator.equals("lt")) {
                                java.lang.Double valueAsDouble3 = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getValueAsDouble(fromUser);
                                java.lang.Double valueAsDouble4 = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getValueAsDouble(condition.getTargetValue());
                                if (valueAsDouble3 == null || valueAsDouble4 == null) {
                                    return new com.statsig.androidsdk.evaluator.ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                                }
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(valueAsDouble3.doubleValue() < valueAsDouble4.doubleValue(), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 3551:
                            if (operator.equals("on")) {
                                return com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.compareDates(new kotlin.jvm.functions.Function2<java.util.Date, java.util.Date, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$17
                                    /* JADX WARN: Code restructure failed: missing block: B:4:0x0046, code lost:
                                    
                                        if (r3 != r1.get(6)) goto L6;
                                     */
                                    @Override // kotlin.jvm.functions.Function2
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final java.lang.Boolean invoke(java.util.Date date, java.util.Date date2) {
                                        java.util.Calendar calendar;
                                        java.util.Calendar calendar2;
                                        java.util.Calendar calendar3;
                                        java.util.Calendar calendar4;
                                        java.util.Calendar calendar5;
                                        java.util.Calendar calendar6;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date2, "");
                                        calendar = com.statsig.androidsdk.evaluator.Evaluator.this.calendarOne;
                                        calendar.setTime(date);
                                        calendar2 = com.statsig.androidsdk.evaluator.Evaluator.this.calendarTwo;
                                        calendar2.setTime(date2);
                                        calendar3 = com.statsig.androidsdk.evaluator.Evaluator.this.calendarOne;
                                        boolean z3 = true;
                                        int i = calendar3.get(1);
                                        calendar4 = com.statsig.androidsdk.evaluator.Evaluator.this.calendarTwo;
                                        if (i == calendar4.get(1)) {
                                            calendar5 = com.statsig.androidsdk.evaluator.Evaluator.this.calendarOne;
                                            int i2 = calendar5.get(6);
                                            calendar6 = com.statsig.androidsdk.evaluator.Evaluator.this.calendarTwo;
                                        }
                                        z3 = false;
                                        return java.lang.Boolean.valueOf(z3);
                                    }

                                    {
                                        super(2);
                                    }
                                }, fromUser, condition.getTargetValue());
                            }
                            break;
                        case 96748:
                            if (operator.equals("any")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.matchStringInArray(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.equals(str2, str3, true));
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 102680:
                            if (operator.equals("gte")) {
                                java.lang.Double valueAsDouble5 = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getValueAsDouble(fromUser);
                                java.lang.Double valueAsDouble6 = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getValueAsDouble(condition.getTargetValue());
                                if (valueAsDouble5 == null || valueAsDouble6 == null) {
                                    return new com.statsig.androidsdk.evaluator.ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                                }
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(valueAsDouble5.doubleValue() >= valueAsDouble6.doubleValue(), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 107485:
                            if (operator.equals("lte")) {
                                java.lang.Double valueAsDouble7 = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getValueAsDouble(fromUser);
                                java.lang.Double valueAsDouble8 = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getValueAsDouble(condition.getTargetValue());
                                if (valueAsDouble7 == null || valueAsDouble8 == null) {
                                    return new com.statsig.androidsdk.evaluator.ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                                }
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(valueAsDouble7.doubleValue() <= valueAsDouble8.doubleValue(), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 108954:
                            if (operator.equals("neq")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(!kotlin.jvm.internal.Intrinsics.areEqual(fromUser, condition.getTargetValue()), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 3387192:
                            if (operator.equals("none")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(!com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.matchStringInArray(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$8
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.equals(str2, str3, true));
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 92734940:
                            if (operator.equals("after")) {
                                return com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.compareDates(new kotlin.jvm.functions.Function2<java.util.Date, java.util.Date, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$16
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.util.Date date, java.util.Date date2) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date2, "");
                                        return java.lang.Boolean.valueOf(date.after(date2));
                                    }
                                }, fromUser, condition.getTargetValue());
                            }
                            break;
                        case 689418545:
                            if (operator.equals("version_gte")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(versionCompareHelper(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.versionCompare(str2, str3) >= 0);
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 689423350:
                            if (operator.equals("version_lte")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(versionCompareHelper(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.versionCompare(str2, str3) <= 0);
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 689424819:
                            if (operator.equals("version_neq")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(versionCompareHelper(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.versionCompare(str2, str3) != 0);
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 1222504494:
                            if (operator.equals("none_case_sensitive")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(!com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.matchStringInArray(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$10
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.equals(str2, str3, false));
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 1496001829:
                            if (operator.equals("str_matches")) {
                                java.lang.String valueAsString2 = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getValueAsString(condition.getTargetValue());
                                if (valueAsString2 == null) {
                                    return new com.statsig.androidsdk.evaluator.ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                                }
                                java.lang.String valueAsString3 = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getValueAsString(fromUser);
                                return valueAsString3 == null ? new com.statsig.androidsdk.evaluator.ConfigEvaluation(false, null, null, null, null, null, null, null, false, false, false, null, 4094, null) : new com.statsig.androidsdk.evaluator.ConfigEvaluation(new kotlin.text.Regex(valueAsString2).containsMatchIn(valueAsString3), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                        case 1662804684:
                            if (operator.equals("str_ends_with_any")) {
                                return new com.statsig.androidsdk.evaluator.ConfigEvaluation(com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.matchStringInArray(fromUser, condition.getTargetValue(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean>() { // from class: com.statsig.androidsdk.evaluator.Evaluator$evaluateCondition$12
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Boolean invoke(java.lang.String str2, java.lang.String str3) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                                        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.endsWith(str2, str3, true));
                                    }
                                }), null, null, null, null, null, null, null, false, false, false, null, 4094, null);
                            }
                            break;
                    }
                }
                java.lang.String operator2 = condition.getOperator();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unsupported evaluation conditon operator: ");
                sb3.append(operator2);
                throw new com.statsig.androidsdk.evaluator.UnsupportedEvaluationException(sb3.toString());
            } catch (java.lang.IllegalArgumentException unused) {
                java.lang.String type = condition.getType();
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Unsupported condition: ");
                sb4.append(type);
                throw new com.statsig.androidsdk.evaluator.UnsupportedEvaluationException(sb4.toString());
            }
        } catch (java.lang.IllegalArgumentException unused2) {
            throw new com.statsig.androidsdk.evaluator.UnsupportedEvaluationException("IllegalArgumentException when evaluate conditions");
        }
    }

    private final boolean versionCompareHelper(java.lang.Object version1, java.lang.Object version2, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, java.lang.Boolean> compare) {
        java.lang.String valueAsString = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getValueAsString(version1);
        java.lang.String valueAsString2 = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getValueAsString(version2);
        if (valueAsString != null && valueAsString2 != null) {
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) valueAsString, '-', 0, false, 6, (java.lang.Object) null);
            if (indexOf$default > 0) {
                valueAsString = valueAsString.substring(0, indexOf$default);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueAsString, "");
            }
            int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) valueAsString2, '-', 0, false, 6, (java.lang.Object) null);
            if (indexOf$default2 > 0) {
                valueAsString2 = valueAsString2.substring(0, indexOf$default2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueAsString2, "");
            }
            try {
                return compare.invoke(valueAsString, valueAsString2).booleanValue();
            } catch (java.lang.NumberFormatException unused) {
            } catch (java.lang.Exception e) {
                com.statsig.androidsdk.ErrorBoundary.logException$android_sdk_release$default(com.statsig.androidsdk.Statsig.INSTANCE.getClient$android_sdk_release().getErrorBoundary(), e, "versionCompareHelper", null, 4, null);
            }
        }
        return false;
    }

    private final boolean evaluatePassPercent(com.statsig.androidsdk.StatsigUser user, com.statsig.androidsdk.evaluator.Spec spec, com.statsig.androidsdk.evaluator.SpecRule rule) {
        java.lang.String salt = spec.getSalt();
        java.lang.String salt2 = rule.getSalt();
        if (salt2 == null) {
            salt2 = rule.getId();
        }
        java.lang.String unitID = com.statsig.androidsdk.evaluator.EvaluatorUtils.INSTANCE.getUnitID(user, rule.getIdType());
        if (unitID == null) {
            unitID = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(salt);
        sb.append(".");
        sb.append(salt2);
        sb.append(".");
        sb.append(unitID);
        return java.lang.Long.compareUnsigned(java.lang.Long.remainderUnsigned(m23131computeUserHashI7RO_PI(sb.toString()), 10000L), kotlin.UnsignedKt.doubleToULong(rule.getPassPercentage() * 100.0d)) < 0;
    }

    /* renamed from: computeUserHash-I7RO_PI, reason: not valid java name */
    private final long m23131computeUserHashI7RO_PI(java.lang.String input) {
        kotlin.ULong uLong = this.hashLookupTable.get(input);
        if (uLong != null) {
            return uLong.getGetHighSpeedVideoFpsRanges();
        }
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] bytes = input.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        long m23494constructorimpl = kotlin.ULong.m23494constructorimpl(java.nio.ByteBuffer.wrap(messageDigest.digest(bytes)).getLong());
        if (this.hashLookupTable.size() > 1000) {
            this.hashLookupTable.clear();
        }
        this.hashLookupTable.put(input, kotlin.ULong.m23493boximpl(m23494constructorimpl));
        return m23494constructorimpl;
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.statsig.androidsdk.evaluator.ConfigCondition.values().length];
            try {
                iArr[com.statsig.androidsdk.evaluator.ConfigCondition.PUBLIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.statsig.androidsdk.evaluator.ConfigCondition.FAIL_GATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.statsig.androidsdk.evaluator.ConfigCondition.PASS_GATE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.statsig.androidsdk.evaluator.ConfigCondition.USER_FIELD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.statsig.androidsdk.evaluator.ConfigCondition.IP_BASED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.statsig.androidsdk.evaluator.ConfigCondition.UA_BASED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.statsig.androidsdk.evaluator.ConfigCondition.CURRENT_TIME.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.statsig.androidsdk.evaluator.ConfigCondition.ENVIRONMENT_FIELD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.statsig.androidsdk.evaluator.ConfigCondition.USER_BUCKET.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.statsig.androidsdk.evaluator.ConfigCondition.UNIT_ID.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
