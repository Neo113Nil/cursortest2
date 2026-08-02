package com.datadog.trace.common.sampling;

/* loaded from: classes3.dex */
public class SpanSamplingRules {
    public static final com.datadog.trace.common.sampling.SpanSamplingRules EMPTY = new com.datadog.trace.common.sampling.SpanSamplingRules(java.util.Collections.emptyList());
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoSizes = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.common.sampling.SpanSamplingRules.class);
    private final java.util.List<com.datadog.trace.common.sampling.SpanSamplingRules.Rule> getHighResolutionOutputSizeshNQ4ISI;

    public SpanSamplingRules(java.util.List<com.datadog.trace.common.sampling.SpanSamplingRules.Rule> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(list);
    }

    public static com.datadog.trace.common.sampling.SpanSamplingRules deserialize(java.lang.String str) {
        com.datadog.trace.common.sampling.SpanSamplingRules spanSamplingRules = EMPTY;
        try {
            return getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(new com.google.gson.stream.JsonReader(new java.io.StringReader(str))));
        } catch (java.lang.Throwable th) {
            getHighSpeedVideoSizes.error("Couldn't parse Span Sampling Rules from JSON: {}", str, th);
            return spanSamplingRules;
        }
    }

    public static com.datadog.trace.common.sampling.SpanSamplingRules deserializeFile(java.lang.String str) {
        com.datadog.trace.common.sampling.SpanSamplingRules spanSamplingRules = EMPTY;
        try {
            com.google.gson.stream.JsonReader jsonReader = new com.google.gson.stream.JsonReader(new java.io.FileReader(str));
            try {
                com.datadog.trace.common.sampling.SpanSamplingRules highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(jsonReader));
                jsonReader.close();
                return highSpeedVideoFpsRanges;
            } catch (java.lang.Throwable th) {
                try {
                    jsonReader.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException unused) {
            getHighSpeedVideoSizes.warn("Span Sampling Rules file {} doesn't exist", str);
            return spanSamplingRules;
        } catch (java.io.IOException e) {
            getHighSpeedVideoSizes.error("Couldn't read Span Sampling Rules file {}.", str, e);
            return spanSamplingRules;
        } catch (java.lang.Throwable th3) {
            getHighSpeedVideoSizes.error("Couldn't parse Span Sampling Rules from JSON file {}.", str, th3);
            return spanSamplingRules;
        }
    }

    private static java.util.List<com.datadog.trace.common.sampling.SpanSamplingRules.Rule> getHighSpeedVideoFpsRangesFor(com.google.gson.stream.JsonReader jsonReader) throws java.lang.IllegalStateException {
        com.google.gson.JsonArray asJsonArray = com.google.gson.JsonParser.parseReader(jsonReader).getAsJsonArray();
        if (asJsonArray == null || asJsonArray.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i = 0; i < asJsonArray.size(); i++) {
            linkedList.add(com.datadog.trace.common.sampling.SpanSamplingRules.Rule.create(com.datadog.trace.common.sampling.SpanSamplingRules.JsonRule.getHighResolutionOutputSizeshNQ4ISI(asJsonArray.get(i).getAsJsonObject())));
        }
        return linkedList;
    }

    private static com.datadog.trace.common.sampling.SpanSamplingRules getHighSpeedVideoFpsRanges(java.util.List<com.datadog.trace.common.sampling.SpanSamplingRules.Rule> list) {
        if (list == null || list.isEmpty()) {
            return EMPTY;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (com.datadog.trace.common.sampling.SpanSamplingRules.Rule rule : list) {
            if (rule != null) {
                arrayList.add(rule);
            }
        }
        if (arrayList.isEmpty()) {
            return EMPTY;
        }
        return new com.datadog.trace.common.sampling.SpanSamplingRules(arrayList);
    }

    public java.util.List<com.datadog.trace.common.sampling.SpanSamplingRules.Rule> getRules() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }

    public static final class Rule implements com.datadog.trace.api.sampling.SamplingRule.SpanSamplingRule {
        private final java.lang.String Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.String getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;
        private final double getHighSpeedVideoSizes;
        private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizesFor;

        private Rule(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, double d, int i) {
            this.getHighSpeedVideoFpsRanges = str;
            this.Camera2StreamConfigurationMap = str2;
            this.getHighSpeedVideoFpsRangesFor = str3;
            this.getHighSpeedVideoSizesFor = map;
            this.getHighSpeedVideoSizes = d;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        public static com.datadog.trace.common.sampling.SpanSamplingRules.Rule create(com.datadog.trace.common.sampling.SpanSamplingRules.JsonRule jsonRule) {
            int max;
            java.lang.String normalizeGlob = com.datadog.trace.api.sampling.SamplingRule.normalizeGlob(jsonRule.getHighSpeedVideoFpsRanges);
            java.lang.String normalizeGlob2 = com.datadog.trace.api.sampling.SamplingRule.normalizeGlob(jsonRule.Camera2StreamConfigurationMap);
            java.lang.String normalizeGlob3 = com.datadog.trace.api.sampling.SamplingRule.normalizeGlob(jsonRule.getHighResolutionOutputSizeshNQ4ISI);
            java.util.Map<java.lang.String, java.lang.String> map = jsonRule.getOutputFormats;
            if (map == null) {
                map = java.util.Collections.emptyMap();
            }
            java.util.Map<java.lang.String, java.lang.String> map2 = map;
            double d = 1.0d;
            if (jsonRule.getHighSpeedVideoFpsRangesFor != null) {
                try {
                    double parseDouble = java.lang.Double.parseDouble(jsonRule.getHighSpeedVideoFpsRangesFor);
                    if (parseDouble < 0.0d || parseDouble > 1.0d) {
                        com.datadog.trace.common.sampling.SpanSamplingRules.getHighSpeedVideoSizes.error("Skipping invalid Span Sampling Rule: {} - {}", jsonRule, "sample_rate must be between 0.0 and 1.0");
                        return null;
                    }
                    d = parseDouble;
                } catch (java.lang.NumberFormatException unused) {
                    com.datadog.trace.common.sampling.SpanSamplingRules.getHighSpeedVideoSizes.error("Skipping invalid Span Sampling Rule: {} - {}", jsonRule, "sample_rate must be a number between 0.0 and 1.0");
                    return null;
                }
            }
            if (jsonRule.getHighSpeedVideoSizes != null) {
                try {
                    double parseDouble2 = java.lang.Double.parseDouble(jsonRule.getHighSpeedVideoSizes);
                    if (parseDouble2 <= 0.0d) {
                        com.datadog.trace.common.sampling.SpanSamplingRules.getHighSpeedVideoSizes.error("Skipping invalid Span Sampling Rule: {} - {}", jsonRule, "max_per_second must be greater than 0.0");
                        return null;
                    }
                    max = java.lang.Math.max((int) parseDouble2, 1);
                } catch (java.lang.NumberFormatException unused2) {
                    com.datadog.trace.common.sampling.SpanSamplingRules.getHighSpeedVideoSizes.error("Skipping invalid Span Sampling Rule: {} - {}", jsonRule, "max_per_second must be a number greater than 0.0");
                    return null;
                }
            } else {
                max = Integer.MAX_VALUE;
            }
            return new com.datadog.trace.common.sampling.SpanSamplingRules.Rule(normalizeGlob, normalizeGlob2, normalizeGlob3, map2, d, max);
        }

        @Override // com.datadog.trace.api.sampling.SamplingRule
        public final java.lang.String getService() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // com.datadog.trace.api.sampling.SamplingRule
        public final java.lang.String getName() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // com.datadog.trace.api.sampling.SamplingRule
        public final java.lang.String getResource() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // com.datadog.trace.api.sampling.SamplingRule
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.getHighSpeedVideoSizesFor;
        }

        @Override // com.datadog.trace.api.sampling.SamplingRule
        public final double getSampleRate() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // com.datadog.trace.api.sampling.SamplingRule.SpanSamplingRule
        public final int getMaxPerSecond() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.lang.String asStringJsonRule() {
            com.datadog.trace.common.sampling.SpanSamplingRules.JsonRule jsonRule = new com.datadog.trace.common.sampling.SpanSamplingRules.JsonRule((byte) 0);
            jsonRule.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
            jsonRule.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
            jsonRule.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor;
            jsonRule.getOutputFormats = this.getHighSpeedVideoSizesFor;
            jsonRule.getHighSpeedVideoFpsRangesFor = java.lang.String.valueOf(this.getHighSpeedVideoSizes);
            jsonRule.getHighSpeedVideoSizes = java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI);
            return jsonRule.toString();
        }
    }

    static final class JsonRule {
        java.lang.String Camera2StreamConfigurationMap;
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        java.lang.String getHighSpeedVideoSizes;
        java.util.Map<java.lang.String, java.lang.String> getOutputFormats;

        private JsonRule() {
        }

        public final java.lang.String toString() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.getHighSpeedVideoSizes;
            if (str != null) {
                jsonObject.addProperty("max_per_second", str);
            }
            java.lang.String str2 = this.Camera2StreamConfigurationMap;
            if (str2 != null) {
                jsonObject.addProperty("name", str2);
            }
            java.lang.String str3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (str3 != null) {
                jsonObject.addProperty("resource", str3);
            }
            java.lang.String str4 = this.getHighSpeedVideoFpsRangesFor;
            if (str4 != null) {
                jsonObject.addProperty("sample_rate", str4);
            }
            java.lang.String str5 = this.getHighSpeedVideoFpsRanges;
            if (str5 != null) {
                jsonObject.addProperty("service", str5);
            }
            java.util.Map<java.lang.String, java.lang.String> map = this.getOutputFormats;
            if (map != null) {
                jsonObject.add("tags", com.datadog.trace.core.util.MapUtils.getAsJsonObject(map));
            }
            return jsonObject.toString();
        }

        static /* synthetic */ com.datadog.trace.common.sampling.SpanSamplingRules.JsonRule getHighResolutionOutputSizeshNQ4ISI(com.google.gson.JsonObject jsonObject) {
            com.datadog.trace.common.sampling.SpanSamplingRules.JsonRule jsonRule = new com.datadog.trace.common.sampling.SpanSamplingRules.JsonRule();
            jsonRule.Camera2StreamConfigurationMap = com.datadog.trace.core.util.JsonObjectUtils.getAsString(jsonObject, "name");
            jsonRule.getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.core.util.JsonObjectUtils.getAsString(jsonObject, "resource");
            jsonRule.getHighSpeedVideoFpsRangesFor = com.datadog.trace.core.util.JsonObjectUtils.getAsString(jsonObject, "sample_rate");
            jsonRule.getHighSpeedVideoFpsRanges = com.datadog.trace.core.util.JsonObjectUtils.getAsString(jsonObject, "service");
            jsonRule.getHighSpeedVideoSizes = com.datadog.trace.core.util.JsonObjectUtils.getAsString(jsonObject, "max_per_second");
            jsonRule.getOutputFormats = com.datadog.trace.core.util.JsonObjectUtils.safeGetAsMap(jsonObject, "tags");
            return jsonRule;
        }

        /* synthetic */ JsonRule(byte b) {
            this();
        }
    }
}
