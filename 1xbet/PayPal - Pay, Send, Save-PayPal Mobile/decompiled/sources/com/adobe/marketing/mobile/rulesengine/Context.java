package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class Context {
    public final com.adobe.marketing.mobile.rulesengine.Evaluating evaluator;
    public final com.adobe.marketing.mobile.rulesengine.TokenFinder tokenFinder;
    public final com.adobe.marketing.mobile.rulesengine.Transforming transformer;

    public Context(com.adobe.marketing.mobile.rulesengine.TokenFinder tokenFinder, com.adobe.marketing.mobile.rulesengine.Evaluating evaluating, com.adobe.marketing.mobile.rulesengine.Transforming transforming) {
        this.tokenFinder = tokenFinder;
        this.evaluator = evaluating;
        this.transformer = transforming;
    }
}
