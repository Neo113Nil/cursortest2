package com.yandex.varioqub.analyticadapter;

/* loaded from: classes.dex */
public interface VarioqubConfigReporter {
    void reportConfigChanged(com.yandex.varioqub.analyticadapter.data.ConfigData configData);

    void setExperiments(java.lang.String str);

    void setTriggeredTestIds(java.util.Set<java.lang.Long> set);
}
