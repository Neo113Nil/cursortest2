package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class RulesEngine<T extends com.adobe.marketing.mobile.rulesengine.Rule> {
    private final com.adobe.marketing.mobile.rulesengine.Evaluating getHighResolutionOutputSizeshNQ4ISI;
    private final com.adobe.marketing.mobile.rulesengine.Transforming getHighSpeedVideoSizes;
    private final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    private java.util.List<T> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();

    public RulesEngine(com.adobe.marketing.mobile.rulesengine.Evaluating evaluating, com.adobe.marketing.mobile.rulesengine.Transforming transforming) {
        this.getHighResolutionOutputSizeshNQ4ISI = evaluating;
        this.getHighSpeedVideoSizes = transforming;
    }

    public java.util.List<T> evaluate(com.adobe.marketing.mobile.rulesengine.TokenFinder tokenFinder) {
        java.util.ArrayList arrayList;
        synchronized (this.Camera2StreamConfigurationMap) {
            com.adobe.marketing.mobile.rulesengine.Context context = new com.adobe.marketing.mobile.rulesengine.Context(tokenFinder, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
            arrayList = new java.util.ArrayList();
            for (T t : this.getHighSpeedVideoFpsRangesFor) {
                if (t.getEvaluable().evaluate(context).isSuccess()) {
                    arrayList.add(t);
                }
            }
        }
        return arrayList;
    }

    public void replaceRules(java.util.List<T> list) {
        if (list == null) {
            return;
        }
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(list);
        }
    }

    public void addRules(java.util.List<T> list) {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor.addAll(list);
        }
    }

    public java.util.List<T> getRules() {
        return new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
    }
}
