package com.google.common.cache;

/* loaded from: classes9.dex */
public final class CacheBuilderSpec {
    private static final com.google.common.base.Splitter KEYS_SPLITTER = com.google.common.base.Splitter.on(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA).trimResults();
    private static final com.google.common.base.Splitter KEY_VALUE_SPLITTER = com.google.common.base.Splitter.on('=').trimResults();
    private static final com.google.common.collect.ImmutableMap<java.lang.String, com.google.common.cache.CacheBuilderSpec.ValueParser> VALUE_PARSERS;
    long accessExpirationDuration;
    java.util.concurrent.TimeUnit accessExpirationTimeUnit;
    java.lang.Integer concurrencyLevel;
    java.lang.Integer initialCapacity;
    com.google.common.cache.LocalCache.Strength keyStrength;
    java.lang.Long maximumSize;
    java.lang.Long maximumWeight;
    java.lang.Boolean recordStats;
    long refreshDuration;
    java.util.concurrent.TimeUnit refreshTimeUnit;
    private final java.lang.String specification;
    com.google.common.cache.LocalCache.Strength valueStrength;
    long writeExpirationDuration;
    java.util.concurrent.TimeUnit writeExpirationTimeUnit;

    interface ValueParser {
        void parse(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, java.lang.String str, java.lang.String str2);
    }

    static {
        com.google.common.cache.CacheBuilderSpec.AnonymousClass1 anonymousClass1 = null;
        VALUE_PARSERS = com.google.common.collect.ImmutableMap.builder().put("initialCapacity", new com.google.common.cache.CacheBuilderSpec.InitialCapacityParser(anonymousClass1)).put("maximumSize", new com.google.common.cache.CacheBuilderSpec.MaximumSizeParser(anonymousClass1)).put("maximumWeight", new com.google.common.cache.CacheBuilderSpec.MaximumWeightParser(anonymousClass1)).put("concurrencyLevel", new com.google.common.cache.CacheBuilderSpec.ConcurrencyLevelParser(anonymousClass1)).put("weakKeys", new com.google.common.cache.CacheBuilderSpec.KeyStrengthParser(com.google.common.cache.LocalCache.Strength.WEAK)).put("softValues", new com.google.common.cache.CacheBuilderSpec.ValueStrengthParser(com.google.common.cache.LocalCache.Strength.SOFT)).put("weakValues", new com.google.common.cache.CacheBuilderSpec.ValueStrengthParser(com.google.common.cache.LocalCache.Strength.WEAK)).put("recordStats", new com.google.common.cache.CacheBuilderSpec.RecordStatsParser(anonymousClass1)).put("expireAfterAccess", new com.google.common.cache.CacheBuilderSpec.AccessDurationParser(anonymousClass1)).put("expireAfterWrite", new com.google.common.cache.CacheBuilderSpec.WriteDurationParser(anonymousClass1)).put("refreshAfterWrite", new com.google.common.cache.CacheBuilderSpec.RefreshDurationParser(anonymousClass1)).put("refreshInterval", new com.google.common.cache.CacheBuilderSpec.RefreshDurationParser(anonymousClass1)).buildOrThrow();
    }

    private CacheBuilderSpec(java.lang.String str) {
        this.specification = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.common.cache.CacheBuilderSpec parse(java.lang.String str) {
        com.google.common.cache.CacheBuilderSpec cacheBuilderSpec = new com.google.common.cache.CacheBuilderSpec(str);
        if (!str.isEmpty()) {
            for (java.lang.String str2 : KEYS_SPLITTER.split(str)) {
                com.google.common.collect.ImmutableList copyOf = com.google.common.collect.ImmutableList.copyOf(KEY_VALUE_SPLITTER.split(str2));
                com.google.common.base.Preconditions.checkArgument(!copyOf.isEmpty(), "blank key-value pair");
                com.google.common.base.Preconditions.checkArgument(copyOf.size() <= 2, "key-value pair %s with more than one equals sign", str2);
                java.lang.String str3 = (java.lang.String) copyOf.get(0);
                com.google.common.cache.CacheBuilderSpec.ValueParser valueParser = VALUE_PARSERS.get(str3);
                com.google.common.base.Preconditions.checkArgument(valueParser != null, "unknown key %s", str3);
                valueParser.parse(cacheBuilderSpec, str3, copyOf.size() == 1 ? null : (java.lang.String) copyOf.get(1));
            }
        }
        return cacheBuilderSpec;
    }

    public static com.google.common.cache.CacheBuilderSpec disableCaching() {
        return parse("maximumSize=0");
    }

    final com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> toCacheBuilder() {
        com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> newBuilder = com.google.common.cache.CacheBuilder.newBuilder();
        java.lang.Integer num = this.initialCapacity;
        if (num != null) {
            newBuilder.initialCapacity(num.intValue());
        }
        java.lang.Long l = this.maximumSize;
        if (l != null) {
            newBuilder.maximumSize(l.longValue());
        }
        java.lang.Long l2 = this.maximumWeight;
        if (l2 != null) {
            newBuilder.maximumWeight(l2.longValue());
        }
        java.lang.Integer num2 = this.concurrencyLevel;
        if (num2 != null) {
            newBuilder.concurrencyLevel(num2.intValue());
        }
        if (this.keyStrength != null) {
            if (com.google.common.cache.CacheBuilderSpec.AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength[this.keyStrength.ordinal()] == 1) {
                newBuilder.weakKeys();
            } else {
                throw new java.lang.AssertionError();
            }
        }
        if (this.valueStrength != null) {
            int i = com.google.common.cache.CacheBuilderSpec.AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength[this.valueStrength.ordinal()];
            if (i == 1) {
                newBuilder.weakValues();
            } else if (i == 2) {
                newBuilder.softValues();
            } else {
                throw new java.lang.AssertionError();
            }
        }
        java.lang.Boolean bool = this.recordStats;
        if (bool != null && bool.booleanValue()) {
            newBuilder.recordStats();
        }
        java.util.concurrent.TimeUnit timeUnit = this.writeExpirationTimeUnit;
        if (timeUnit != null) {
            newBuilder.expireAfterWrite(this.writeExpirationDuration, timeUnit);
        }
        java.util.concurrent.TimeUnit timeUnit2 = this.accessExpirationTimeUnit;
        if (timeUnit2 != null) {
            newBuilder.expireAfterAccess(this.accessExpirationDuration, timeUnit2);
        }
        java.util.concurrent.TimeUnit timeUnit3 = this.refreshTimeUnit;
        if (timeUnit3 != null) {
            newBuilder.refreshAfterWrite(this.refreshDuration, timeUnit3);
        }
        return newBuilder;
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$cache$LocalCache$Strength;

        static {
            int[] iArr = new int[com.google.common.cache.LocalCache.Strength.values().length];
            $SwitchMap$com$google$common$cache$LocalCache$Strength = iArr;
            try {
                iArr[com.google.common.cache.LocalCache.Strength.WEAK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$cache$LocalCache$Strength[com.google.common.cache.LocalCache.Strength.SOFT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public final java.lang.String toParsableString() {
        return this.specification;
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).addValue(toParsableString()).toString();
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.initialCapacity, this.maximumSize, this.maximumWeight, this.concurrencyLevel, this.keyStrength, this.valueStrength, this.recordStats, durationInNanos(this.writeExpirationDuration, this.writeExpirationTimeUnit), durationInNanos(this.accessExpirationDuration, this.accessExpirationTimeUnit), durationInNanos(this.refreshDuration, this.refreshTimeUnit));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.common.cache.CacheBuilderSpec)) {
            return false;
        }
        com.google.common.cache.CacheBuilderSpec cacheBuilderSpec = (com.google.common.cache.CacheBuilderSpec) obj;
        return java.util.Objects.equals(this.initialCapacity, cacheBuilderSpec.initialCapacity) && java.util.Objects.equals(this.maximumSize, cacheBuilderSpec.maximumSize) && java.util.Objects.equals(this.maximumWeight, cacheBuilderSpec.maximumWeight) && java.util.Objects.equals(this.concurrencyLevel, cacheBuilderSpec.concurrencyLevel) && java.util.Objects.equals(this.keyStrength, cacheBuilderSpec.keyStrength) && java.util.Objects.equals(this.valueStrength, cacheBuilderSpec.valueStrength) && java.util.Objects.equals(this.recordStats, cacheBuilderSpec.recordStats) && java.util.Objects.equals(durationInNanos(this.writeExpirationDuration, this.writeExpirationTimeUnit), durationInNanos(cacheBuilderSpec.writeExpirationDuration, cacheBuilderSpec.writeExpirationTimeUnit)) && java.util.Objects.equals(durationInNanos(this.accessExpirationDuration, this.accessExpirationTimeUnit), durationInNanos(cacheBuilderSpec.accessExpirationDuration, cacheBuilderSpec.accessExpirationTimeUnit)) && java.util.Objects.equals(durationInNanos(this.refreshDuration, this.refreshTimeUnit), durationInNanos(cacheBuilderSpec.refreshDuration, cacheBuilderSpec.refreshTimeUnit));
    }

    private static java.lang.Long durationInNanos(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return java.lang.Long.valueOf(timeUnit.toNanos(j));
    }

    static abstract class IntegerParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        protected abstract void parseInteger(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, int i);

        IntegerParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, java.lang.String str, java.lang.String str2) {
            if (com.google.common.base.Strings.isNullOrEmpty(str2)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("value of key ");
                sb.append(str);
                sb.append(" omitted");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            try {
                parseInteger(cacheBuilderSpec, java.lang.Integer.parseInt(str2));
            } catch (java.lang.NumberFormatException e) {
                throw new java.lang.IllegalArgumentException(com.google.common.cache.CacheBuilderSpec.format("key %s value set to %s, must be integer", str, str2), e);
            }
        }
    }

    static abstract class LongParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        protected abstract void parseLong(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, long j);

        LongParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, java.lang.String str, java.lang.String str2) {
            if (com.google.common.base.Strings.isNullOrEmpty(str2)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("value of key ");
                sb.append(str);
                sb.append(" omitted");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            try {
                parseLong(cacheBuilderSpec, java.lang.Long.parseLong(str2));
            } catch (java.lang.NumberFormatException e) {
                throw new java.lang.IllegalArgumentException(com.google.common.cache.CacheBuilderSpec.format("key %s value set to %s, must be integer", str, str2), e);
            }
        }
    }

    static final class InitialCapacityParser extends com.google.common.cache.CacheBuilderSpec.IntegerParser {
        private InitialCapacityParser() {
        }

        /* synthetic */ InitialCapacityParser(com.google.common.cache.CacheBuilderSpec.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        protected final void parseInteger(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, int i) {
            com.google.common.base.Preconditions.checkArgument(cacheBuilderSpec.initialCapacity == null, "initial capacity was already set to %s", cacheBuilderSpec.initialCapacity);
            cacheBuilderSpec.initialCapacity = java.lang.Integer.valueOf(i);
        }
    }

    static final class MaximumSizeParser extends com.google.common.cache.CacheBuilderSpec.LongParser {
        private MaximumSizeParser() {
        }

        /* synthetic */ MaximumSizeParser(com.google.common.cache.CacheBuilderSpec.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        protected final void parseLong(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, long j) {
            com.google.common.base.Preconditions.checkArgument(cacheBuilderSpec.maximumSize == null, "maximum size was already set to %s", cacheBuilderSpec.maximumSize);
            com.google.common.base.Preconditions.checkArgument(cacheBuilderSpec.maximumWeight == null, "maximum weight was already set to %s", cacheBuilderSpec.maximumWeight);
            cacheBuilderSpec.maximumSize = java.lang.Long.valueOf(j);
        }
    }

    static final class MaximumWeightParser extends com.google.common.cache.CacheBuilderSpec.LongParser {
        private MaximumWeightParser() {
        }

        /* synthetic */ MaximumWeightParser(com.google.common.cache.CacheBuilderSpec.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        protected final void parseLong(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, long j) {
            com.google.common.base.Preconditions.checkArgument(cacheBuilderSpec.maximumWeight == null, "maximum weight was already set to %s", cacheBuilderSpec.maximumWeight);
            com.google.common.base.Preconditions.checkArgument(cacheBuilderSpec.maximumSize == null, "maximum size was already set to %s", cacheBuilderSpec.maximumSize);
            cacheBuilderSpec.maximumWeight = java.lang.Long.valueOf(j);
        }
    }

    static final class ConcurrencyLevelParser extends com.google.common.cache.CacheBuilderSpec.IntegerParser {
        private ConcurrencyLevelParser() {
        }

        /* synthetic */ ConcurrencyLevelParser(com.google.common.cache.CacheBuilderSpec.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        protected final void parseInteger(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, int i) {
            com.google.common.base.Preconditions.checkArgument(cacheBuilderSpec.concurrencyLevel == null, "concurrency level was already set to %s", cacheBuilderSpec.concurrencyLevel);
            cacheBuilderSpec.concurrencyLevel = java.lang.Integer.valueOf(i);
        }
    }

    static final class KeyStrengthParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        private final com.google.common.cache.LocalCache.Strength strength;

        public KeyStrengthParser(com.google.common.cache.LocalCache.Strength strength) {
            this.strength = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public final void parse(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, java.lang.String str, java.lang.String str2) {
            com.google.common.base.Preconditions.checkArgument(str2 == null, "key %s does not take values", str);
            com.google.common.base.Preconditions.checkArgument(cacheBuilderSpec.keyStrength == null, "%s was already set to %s", str, cacheBuilderSpec.keyStrength);
            cacheBuilderSpec.keyStrength = this.strength;
        }
    }

    static final class ValueStrengthParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        private final com.google.common.cache.LocalCache.Strength strength;

        public ValueStrengthParser(com.google.common.cache.LocalCache.Strength strength) {
            this.strength = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public final void parse(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, java.lang.String str, java.lang.String str2) {
            com.google.common.base.Preconditions.checkArgument(str2 == null, "key %s does not take values", str);
            com.google.common.base.Preconditions.checkArgument(cacheBuilderSpec.valueStrength == null, "%s was already set to %s", str, cacheBuilderSpec.valueStrength);
            cacheBuilderSpec.valueStrength = this.strength;
        }
    }

    static final class RecordStatsParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        private RecordStatsParser() {
        }

        /* synthetic */ RecordStatsParser(com.google.common.cache.CacheBuilderSpec.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public final void parse(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, java.lang.String str, java.lang.String str2) {
            com.google.common.base.Preconditions.checkArgument(str2 == null, "recordStats does not take values");
            com.google.common.base.Preconditions.checkArgument(cacheBuilderSpec.recordStats == null, "recordStats already set");
            cacheBuilderSpec.recordStats = java.lang.Boolean.TRUE;
        }
    }

    static abstract class DurationParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        protected abstract void parseDuration(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, long j, java.util.concurrent.TimeUnit timeUnit);

        DurationParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, java.lang.String str, java.lang.String str2) {
            java.util.concurrent.TimeUnit timeUnit;
            if (com.google.common.base.Strings.isNullOrEmpty(str2)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("value of key ");
                sb.append(str);
                sb.append(" omitted");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            try {
                char charAt = str2.charAt(str2.length() - 1);
                if (charAt == 'd') {
                    timeUnit = java.util.concurrent.TimeUnit.DAYS;
                } else if (charAt == 'h') {
                    timeUnit = java.util.concurrent.TimeUnit.HOURS;
                } else if (charAt == 'm') {
                    timeUnit = java.util.concurrent.TimeUnit.MINUTES;
                } else if (charAt == 's') {
                    timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                } else {
                    throw new java.lang.IllegalArgumentException(com.google.common.cache.CacheBuilderSpec.format("key %s invalid unit: was %s, must end with one of [dhms]", str, str2));
                }
                parseDuration(cacheBuilderSpec, java.lang.Long.parseLong(str2.substring(0, str2.length() - 1)), timeUnit);
            } catch (java.lang.NumberFormatException unused) {
                throw new java.lang.IllegalArgumentException(com.google.common.cache.CacheBuilderSpec.format("key %s value set to %s, must be integer", str, str2));
            }
        }
    }

    static final class AccessDurationParser extends com.google.common.cache.CacheBuilderSpec.DurationParser {
        private AccessDurationParser() {
        }

        /* synthetic */ AccessDurationParser(com.google.common.cache.CacheBuilderSpec.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected final void parseDuration(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.base.Preconditions.checkArgument(cacheBuilderSpec.accessExpirationTimeUnit == null, "expireAfterAccess already set");
            cacheBuilderSpec.accessExpirationDuration = j;
            cacheBuilderSpec.accessExpirationTimeUnit = timeUnit;
        }
    }

    static final class WriteDurationParser extends com.google.common.cache.CacheBuilderSpec.DurationParser {
        private WriteDurationParser() {
        }

        /* synthetic */ WriteDurationParser(com.google.common.cache.CacheBuilderSpec.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected final void parseDuration(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.base.Preconditions.checkArgument(cacheBuilderSpec.writeExpirationTimeUnit == null, "expireAfterWrite already set");
            cacheBuilderSpec.writeExpirationDuration = j;
            cacheBuilderSpec.writeExpirationTimeUnit = timeUnit;
        }
    }

    static final class RefreshDurationParser extends com.google.common.cache.CacheBuilderSpec.DurationParser {
        private RefreshDurationParser() {
        }

        /* synthetic */ RefreshDurationParser(com.google.common.cache.CacheBuilderSpec.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected final void parseDuration(com.google.common.cache.CacheBuilderSpec cacheBuilderSpec, long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.base.Preconditions.checkArgument(cacheBuilderSpec.refreshTimeUnit == null, "refreshAfterWrite already set");
            cacheBuilderSpec.refreshDuration = j;
            cacheBuilderSpec.refreshTimeUnit = timeUnit;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String format(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.ROOT, str, objArr);
    }
}
