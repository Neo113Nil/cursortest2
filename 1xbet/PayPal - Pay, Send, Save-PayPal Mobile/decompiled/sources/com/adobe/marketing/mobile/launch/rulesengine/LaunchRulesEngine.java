package com.adobe.marketing.mobile.launch.rulesengine;

/* loaded from: classes7.dex */
public class LaunchRulesEngine {
    private boolean Camera2StreamConfigurationMap;
    final com.adobe.marketing.mobile.rulesengine.RulesEngine<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<com.adobe.marketing.mobile.Event> getHighSpeedVideoFpsRanges;
    final com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesConsequence getHighSpeedVideoFpsRangesFor;
    private final com.adobe.marketing.mobile.ExtensionApi getHighSpeedVideoSizes;
    private com.adobe.marketing.mobile.launch.rulesengine.RuleReevaluationInterceptor getInputSizeshNQ4ISI;
    private final java.lang.String getOutputMinFrameDuration;

    public LaunchRulesEngine(java.lang.String str, com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        this(str, extensionApi, new com.adobe.marketing.mobile.rulesengine.RulesEngine(new com.adobe.marketing.mobile.rulesengine.ConditionEvaluator(com.adobe.marketing.mobile.rulesengine.ConditionEvaluator.Option.CASE_INSENSITIVE), com.adobe.marketing.mobile.launch.rulesengine.LaunchRuleTransformer.INSTANCE.createTransforming()), new com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesConsequence(extensionApi));
    }

    private LaunchRulesEngine(java.lang.String str, com.adobe.marketing.mobile.ExtensionApi extensionApi, com.adobe.marketing.mobile.rulesengine.RulesEngine<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> rulesEngine, com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesConsequence launchRulesConsequence) {
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        this.Camera2StreamConfigurationMap = false;
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            throw new java.lang.IllegalArgumentException("LaunchRulesEngine cannot have a null/empty name");
        }
        this.getOutputMinFrameDuration = str;
        this.getHighSpeedVideoFpsRangesFor = launchRulesConsequence;
        this.getHighSpeedVideoSizes = extensionApi;
        this.getHighResolutionOutputSizeshNQ4ISI = rulesEngine;
    }

    public void setRuleReevaluationInterceptor(com.adobe.marketing.mobile.launch.rulesengine.RuleReevaluationInterceptor ruleReevaluationInterceptor) {
        this.getInputSizeshNQ4ISI = ruleReevaluationInterceptor;
    }

    public void replaceRules(java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> list) {
        if (list == null) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.replaceRules(list);
        this.getHighSpeedVideoSizes.dispatch(new com.adobe.marketing.mobile.Event.Builder(this.getOutputMinFrameDuration, com.adobe.marketing.mobile.EventType.RULES_ENGINE, com.adobe.marketing.mobile.EventSource.REQUEST_RESET).setEventData(java.util.Collections.singletonMap("name", this.getOutputMinFrameDuration)).build());
    }

    public void addRules(java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> list) {
        this.getHighResolutionOutputSizeshNQ4ISI.addRules(list);
    }

    public com.adobe.marketing.mobile.Event processEvent(com.adobe.marketing.mobile.Event event) {
        if (event == null) {
            throw new java.lang.IllegalArgumentException("Cannot evaluate null event.");
        }
        if (!this.Camera2StreamConfigurationMap) {
            if (!com.adobe.marketing.mobile.EventType.RULES_ENGINE.equals(event.getType()) || !com.adobe.marketing.mobile.EventSource.REQUEST_RESET.equals(event.getSource()) || !this.getOutputMinFrameDuration.equals(com.adobe.marketing.mobile.util.DataReader.optString(event.getEventData(), "name", ""))) {
                this.getHighSpeedVideoFpsRanges.add(event);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
                this.getHighSpeedVideoFpsRanges.clear();
                this.Camera2StreamConfigurationMap = true;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    processEvent((com.adobe.marketing.mobile.Event) it.next());
                }
            }
        }
        java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> evaluate = this.getHighResolutionOutputSizeshNQ4ISI.evaluate(new com.adobe.marketing.mobile.launch.rulesengine.LaunchTokenFinder(event, this.getHighSpeedVideoSizes));
        if (this.getInputSizeshNQ4ISI == null) {
            return this.getHighSpeedVideoFpsRangesFor.process(event, evaluate);
        }
        java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> reevaluableRules = this.getHighSpeedVideoFpsRangesFor.getReevaluableRules(evaluate);
        if (reevaluableRules.isEmpty()) {
            return this.getHighSpeedVideoFpsRangesFor.process(event, evaluate);
        }
        java.util.List<com.adobe.marketing.mobile.launch.rulesengine.LaunchRule> rulesToHoldForReevaluation = this.getHighSpeedVideoFpsRangesFor.getRulesToHoldForReevaluation(evaluate);
        final java.util.ArrayList arrayList2 = new java.util.ArrayList(evaluate);
        arrayList2.removeAll(rulesToHoldForReevaluation);
        final com.adobe.marketing.mobile.Event process = this.getHighSpeedVideoFpsRangesFor.process(event, arrayList2);
        com.adobe.marketing.mobile.launch.rulesengine.RuleReevaluationInterceptor ruleReevaluationInterceptor = this.getInputSizeshNQ4ISI;
        final com.adobe.marketing.mobile.launch.rulesengine.LaunchTokenFinder launchTokenFinder = new com.adobe.marketing.mobile.launch.rulesengine.LaunchTokenFinder(process, this.getHighSpeedVideoSizes);
        ruleReevaluationInterceptor.onReevaluationTriggered(process, reevaluableRules, new com.adobe.marketing.mobile.AdobeCallback() { // from class: com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine$$ExternalSyntheticLambda0
            @Override // com.adobe.marketing.mobile.AdobeCallback
            public final void call(java.lang.Object obj) {
                com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine launchRulesEngine = com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngine.this;
                com.adobe.marketing.mobile.launch.rulesengine.LaunchTokenFinder launchTokenFinder2 = launchTokenFinder;
                java.util.List list = arrayList2;
                com.adobe.marketing.mobile.Event event2 = process;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(launchRulesEngine.getHighResolutionOutputSizeshNQ4ISI.evaluate(launchTokenFinder2));
                    arrayList3.removeAll(list);
                    launchRulesEngine.getHighSpeedVideoFpsRangesFor.process(event2, arrayList3);
                }
            }
        });
        return process;
    }

    public java.util.List<com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence> evaluateEvent(com.adobe.marketing.mobile.Event event) {
        if (event == null) {
            throw new java.lang.IllegalArgumentException("Cannot evaluate null event.");
        }
        return this.getHighSpeedVideoFpsRangesFor.evaluate(event, this.getHighResolutionOutputSizeshNQ4ISI.evaluate(new com.adobe.marketing.mobile.launch.rulesengine.LaunchTokenFinder(event, this.getHighSpeedVideoSizes)));
    }
}
