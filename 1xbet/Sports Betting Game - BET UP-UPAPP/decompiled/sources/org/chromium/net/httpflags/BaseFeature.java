package org.chromium.net.httpflags;

import androidx.credentials.provider.CredentialEntry;
import com.google.protobuf.ByteString;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.httpflags.BaseFeatureOverrides;
import org.chromium.net.httpflags.ResolvedFlags;

/* loaded from: classes4.dex */
public final class BaseFeature {
    public static final String FLAG_PREFIX = "ChromiumBaseFeature_";
    public static final String PARAM_DELIMITER = "_PARAM_";

    private BaseFeature() {
    }

    public static BaseFeatureOverrides getOverrides(ResolvedFlags flags) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ResolvedFlags.Value> entry : flags.flags().entrySet()) {
            try {
                applyOverride(entry.getKey(), entry.getValue(), hashMap);
            } catch (RuntimeException e) {
                throw new IllegalArgumentException("Could not parse HTTP flag `" + entry.getKey() + "` as a base::Feature override", e);
            }
        }
        BaseFeatureOverrides.Builder newBuilder = BaseFeatureOverrides.newBuilder();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            newBuilder.putFeatureStates((String) entry2.getKey(), ((BaseFeatureOverrides.FeatureState.Builder) entry2.getValue()).build());
        }
        return newBuilder.build();
    }

    private static void applyOverride(String flagName, ResolvedFlags.Value flagValue, Map<String, BaseFeatureOverrides.FeatureState.Builder> featureStateBuilders) {
        ParsedFlagName parseFlagName = parseFlagName(flagName);
        if (parseFlagName == null) {
            return;
        }
        BaseFeatureOverrides.FeatureState.Builder builder = featureStateBuilders.get(parseFlagName.featureName);
        if (builder == null) {
            builder = BaseFeatureOverrides.FeatureState.newBuilder();
            featureStateBuilders.put(parseFlagName.featureName, builder);
        }
        if (parseFlagName.paramName == null) {
            applyStateOverride(flagValue, builder);
        } else {
            applyParamOverride(parseFlagName.paramName, flagValue, builder);
        }
    }

    private static final class ParsedFlagName {
        public String featureName;
        public String paramName;

        private ParsedFlagName() {
        }
    }

    private static ParsedFlagName parseFlagName(String flagName) {
        if (!flagName.startsWith(FLAG_PREFIX)) {
            return null;
        }
        String substring = flagName.substring(FLAG_PREFIX.length());
        ParsedFlagName parsedFlagName = new ParsedFlagName();
        int indexOf = substring.indexOf(PARAM_DELIMITER);
        if (indexOf < 0) {
            parsedFlagName.featureName = substring;
        } else {
            parsedFlagName.featureName = substring.substring(0, indexOf);
            parsedFlagName.paramName = substring.substring(indexOf + PARAM_DELIMITER.length());
        }
        return parsedFlagName;
    }

    private static void applyStateOverride(ResolvedFlags.Value value, BaseFeatureOverrides.FeatureState.Builder featureStateBuilder) {
        ResolvedFlags.Value.Type type = value.getType();
        if (type != ResolvedFlags.Value.Type.BOOL) {
            throw new IllegalArgumentException("HTTP flag has type " + String.valueOf(type) + ", but only boolean flags are supported as base::Feature overrides");
        }
        featureStateBuilder.setEnabled(value.getBoolValue());
    }

    private static void applyParamOverride(String paramName, ResolvedFlags.Value value, BaseFeatureOverrides.FeatureState.Builder featureStateBuilder) {
        ByteString copyFrom;
        ResolvedFlags.Value.Type type = value.getType();
        int i = AnonymousClass1.$SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[type.ordinal()];
        if (i == 1) {
            copyFrom = ByteString.copyFrom(value.getBoolValue() ? "true" : CredentialEntry.FALSE_STRING, StandardCharsets.UTF_8);
        } else if (i == 2) {
            copyFrom = ByteString.copyFrom(Long.toString(value.getIntValue(), 10), StandardCharsets.UTF_8);
        } else if (i == 3) {
            copyFrom = ByteString.copyFrom(Float.toString(value.getFloatValue()), StandardCharsets.UTF_8);
        } else if (i == 4) {
            copyFrom = ByteString.copyFrom(value.getStringValue(), StandardCharsets.UTF_8);
        } else if (i == 5) {
            copyFrom = value.getBytesValue();
        } else {
            throw new UnsupportedOperationException("Unsupported HTTP flag value type for base::Feature param `" + paramName + "`: " + String.valueOf(type));
        }
        featureStateBuilder.putParams(paramName, copyFrom);
    }

    /* renamed from: org.chromium.net.httpflags.BaseFeature$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type;

        static {
            int[] iArr = new int[ResolvedFlags.Value.Type.values().length];
            $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type = iArr;
            try {
                iArr[ResolvedFlags.Value.Type.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[ResolvedFlags.Value.Type.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[ResolvedFlags.Value.Type.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[ResolvedFlags.Value.Type.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[ResolvedFlags.Value.Type.BYTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }
}
