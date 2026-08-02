package com.daon.sdk.face.module;

/* loaded from: classes7.dex */
public abstract class CustomAnalyzer extends com.daon.sdk.face.module.Analyzer {
    @Override // com.daon.sdk.face.module.Analyzer
    public void analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle, com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback) {
        startAnalyzer(yuv, bundle, analyzerCallback);
    }

    @Override // com.daon.sdk.face.module.Module
    public java.lang.String getName() {
        return getClass().getName();
    }
}
