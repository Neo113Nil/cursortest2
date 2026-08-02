package com.datadog.trace.common.sampling;

/* loaded from: classes3.dex */
public class TraceSamplingRules {
    public static final com.datadog.trace.common.sampling.TraceSamplingRules EMPTY = new com.datadog.trace.common.sampling.TraceSamplingRules(java.util.Collections.emptyList());
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoSizes = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.common.sampling.TraceSamplingRules.class);
    private final java.util.List<com.datadog.trace.common.sampling.TraceSamplingRules.Rule> Camera2StreamConfigurationMap;

    public TraceSamplingRules(java.util.List<com.datadog.trace.common.sampling.TraceSamplingRules.Rule> list) {
        this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(list);
    }

    public static com.datadog.trace.common.sampling.TraceSamplingRules deserialize(java.lang.String str) {
        java.util.List<com.datadog.trace.common.sampling.TraceSamplingRules.Rule> emptyList;
        com.datadog.trace.common.sampling.TraceSamplingRules traceSamplingRules = EMPTY;
        try {
            com.google.gson.JsonArray asJsonArray = com.google.gson.JsonParser.parseString(str).getAsJsonArray();
            if (asJsonArray == null || asJsonArray.isEmpty()) {
                emptyList = java.util.Collections.emptyList();
            } else {
                emptyList = new java.util.LinkedList();
                for (int i = 0; i < asJsonArray.size(); i++) {
                    emptyList.add(com.datadog.trace.common.sampling.TraceSamplingRules.Rule.create(com.datadog.trace.common.sampling.TraceSamplingRules.JsonRule.Camera2StreamConfigurationMap(asJsonArray.get(i).getAsJsonObject())));
                }
            }
            if (emptyList != null && !emptyList.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(emptyList.size());
                for (com.datadog.trace.common.sampling.TraceSamplingRules.Rule rule : emptyList) {
                    if (rule != null) {
                        arrayList.add(rule);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new com.datadog.trace.common.sampling.TraceSamplingRules(arrayList);
                }
            }
            return EMPTY;
        } catch (java.lang.Throwable th) {
            getHighSpeedVideoSizes.error("Couldn't parse Trace Sampling Rules from JSON: {}", str, th);
            return traceSamplingRules;
        }
    }

    public java.util.List<com.datadog.trace.common.sampling.TraceSamplingRules.Rule> getRules() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isEmpty() {
        return this.Camera2StreamConfigurationMap.isEmpty();
    }

    public static final class Rule implements com.datadog.trace.api.sampling.SamplingRule.TraceSamplingRule {
        private final java.lang.String Camera2StreamConfigurationMap;
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges;
        private final double getHighSpeedVideoFpsRangesFor;
        private final java.lang.String getHighSpeedVideoSizes;

        private Rule(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, double d) {
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoSizes = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = str3;
            this.getHighSpeedVideoFpsRanges = map;
            this.getHighSpeedVideoFpsRangesFor = d;
        }

        public static com.datadog.trace.common.sampling.TraceSamplingRules.Rule create(com.datadog.trace.common.sampling.TraceSamplingRules.JsonRule jsonRule) {
            java.lang.String normalizeGlob = com.datadog.trace.api.sampling.SamplingRule.normalizeGlob(jsonRule.getHighSpeedVideoFpsRanges);
            java.lang.String normalizeGlob2 = com.datadog.trace.api.sampling.SamplingRule.normalizeGlob(jsonRule.getHighSpeedVideoSizes);
            java.lang.String normalizeGlob3 = com.datadog.trace.api.sampling.SamplingRule.normalizeGlob(jsonRule.Camera2StreamConfigurationMap);
            java.util.Map<java.lang.String, java.lang.String> map = jsonRule.getHighResolutionOutputSizeshNQ4ISI;
            if (map == null) {
                map = java.util.Collections.emptyMap();
            }
            java.util.Map<java.lang.String, java.lang.String> map2 = map;
            double d = 1.0d;
            if (jsonRule.getHighSpeedVideoFpsRangesFor != null) {
                try {
                    double parseDouble = java.lang.Double.parseDouble(jsonRule.getHighSpeedVideoFpsRangesFor);
                    if (parseDouble < 0.0d || parseDouble > 1.0d) {
                        com.datadog.trace.common.sampling.TraceSamplingRules.getHighSpeedVideoSizes.error("Skipping invalid Trace Sampling Rule: {} - {}", jsonRule, "sample_rate must be between 0.0 and 1.0");
                        return null;
                    }
                    d = parseDouble;
                } catch (java.lang.NumberFormatException unused) {
                    com.datadog.trace.common.sampling.TraceSamplingRules.getHighSpeedVideoSizes.error("Skipping invalid Trace Sampling Rule: {} - {}", jsonRule, "sample_rate must be a number between 0.0 and 1.0");
                    return null;
                }
            }
            return new com.datadog.trace.common.sampling.TraceSamplingRules.Rule(normalizeGlob, normalizeGlob2, normalizeGlob3, map2, d);
        }

        @Override // com.datadog.trace.api.sampling.SamplingRule
        public final java.lang.String getService() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // com.datadog.trace.api.sampling.SamplingRule
        public final java.lang.String getName() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // com.datadog.trace.api.sampling.SamplingRule
        public final java.lang.String getResource() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // com.datadog.trace.api.sampling.SamplingRule
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // com.datadog.trace.api.sampling.SamplingRule
        public final double getSampleRate() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final java.lang.String asStringJsonRule() {
            com.datadog.trace.common.sampling.TraceSamplingRules.JsonRule jsonRule = new com.datadog.trace.common.sampling.TraceSamplingRules.JsonRule((byte) 0);
            jsonRule.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap;
            jsonRule.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
            jsonRule.Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
            jsonRule.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges;
            jsonRule.getHighSpeedVideoFpsRangesFor = java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor);
            return jsonRule.toString();
        }
    }

    static final class JsonRule {
        java.lang.String Camera2StreamConfigurationMap;
        java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        java.lang.String getHighSpeedVideoSizes;
        java.lang.String getInputFormats;

        private JsonRule() {
        }

        public final java.lang.String toString() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.getHighSpeedVideoSizes;
            if (str != null) {
                jsonObject.addProperty("name", str);
            }
            java.lang.String str2 = this.Camera2StreamConfigurationMap;
            if (str2 != null) {
                jsonObject.addProperty("resource", str2);
            }
            java.lang.String str3 = this.getHighSpeedVideoFpsRangesFor;
            if (str3 != null) {
                jsonObject.addProperty("sample_rate", str3);
            }
            java.lang.String str4 = this.getHighSpeedVideoFpsRanges;
            if (str4 != null) {
                jsonObject.addProperty("service", str4);
            }
            java.lang.String str5 = this.getInputFormats;
            if (str5 != null) {
                jsonObject.addProperty("target_span", str5);
            }
            java.util.Map<java.lang.String, java.lang.String> map = this.getHighResolutionOutputSizeshNQ4ISI;
            if (map != null) {
                jsonObject.add("tags", com.datadog.trace.core.util.MapUtils.getAsJsonObject(map));
            }
            return jsonObject.toString();
        }

        static /* synthetic */ com.datadog.trace.common.sampling.TraceSamplingRules.JsonRule Camera2StreamConfigurationMap(com.google.gson.JsonObject jsonObject) {
            com.datadog.trace.common.sampling.TraceSamplingRules.JsonRule jsonRule = new com.datadog.trace.common.sampling.TraceSamplingRules.JsonRule();
            jsonRule.getHighSpeedVideoSizes = com.datadog.trace.core.util.JsonObjectUtils.getAsString(jsonObject, "name");
            jsonRule.Camera2StreamConfigurationMap = com.datadog.trace.core.util.JsonObjectUtils.getAsString(jsonObject, "resource");
            jsonRule.getHighSpeedVideoFpsRangesFor = com.datadog.trace.core.util.JsonObjectUtils.getAsString(jsonObject, "sample_rate");
            jsonRule.getHighSpeedVideoFpsRanges = com.datadog.trace.core.util.JsonObjectUtils.getAsString(jsonObject, "service");
            jsonRule.getInputFormats = com.datadog.trace.core.util.JsonObjectUtils.getAsString(jsonObject, "target_span");
            jsonRule.getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.core.util.JsonObjectUtils.safeGetAsMap(jsonObject, "tags");
            return jsonRule;
        }

        /* synthetic */ JsonRule(byte b) {
            this();
        }
    }
}
