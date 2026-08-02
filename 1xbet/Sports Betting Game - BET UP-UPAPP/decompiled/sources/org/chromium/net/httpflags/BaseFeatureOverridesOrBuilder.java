package org.chromium.net.httpflags;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;
import org.chromium.net.httpflags.BaseFeatureOverrides;

/* loaded from: classes4.dex */
public interface BaseFeatureOverridesOrBuilder extends MessageLiteOrBuilder {
    boolean containsFeatureStates(String key);

    @Deprecated
    Map<String, BaseFeatureOverrides.FeatureState> getFeatureStates();

    int getFeatureStatesCount();

    Map<String, BaseFeatureOverrides.FeatureState> getFeatureStatesMap();

    BaseFeatureOverrides.FeatureState getFeatureStatesOrDefault(String key, BaseFeatureOverrides.FeatureState defaultValue);

    BaseFeatureOverrides.FeatureState getFeatureStatesOrThrow(String key);
}
