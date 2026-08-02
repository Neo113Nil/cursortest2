package com.google.common.cache;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.cache.LocalCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class CacheBuilderSpec {
    private static final Splitter KEYS_SPLITTER = Splitter.on(',').trimResults();
    private static final Splitter KEY_VALUE_SPLITTER = Splitter.on('=').trimResults();
    private static final ImmutableMap<String, ValueParser> VALUE_PARSERS;
    long accessExpirationDuration;
    TimeUnit accessExpirationTimeUnit;
    Integer concurrencyLevel;
    Integer initialCapacity;
    LocalCache.Strength keyStrength;
    Long maximumSize;
    Long maximumWeight;
    Boolean recordStats;
    long refreshDuration;
    TimeUnit refreshTimeUnit;
    private final String specification;
    LocalCache.Strength valueStrength;
    long writeExpirationDuration;
    TimeUnit writeExpirationTimeUnit;

    private interface ValueParser {
        void parse(CacheBuilderSpec spec, String key, String value);
    }

    static {
        AnonymousClass1 anonymousClass1 = null;
        VALUE_PARSERS = ImmutableMap.builder().put("initialCapacity", new InitialCapacityParser(anonymousClass1)).put("maximumSize", new MaximumSizeParser(anonymousClass1)).put("maximumWeight", new MaximumWeightParser(anonymousClass1)).put("concurrencyLevel", new ConcurrencyLevelParser(anonymousClass1)).put("weakKeys", new KeyStrengthParser(LocalCache.Strength.WEAK)).put("softValues", new ValueStrengthParser(LocalCache.Strength.SOFT)).put("weakValues", new ValueStrengthParser(LocalCache.Strength.WEAK)).put("recordStats", new RecordStatsParser(anonymousClass1)).put("expireAfterAccess", new AccessDurationParser(anonymousClass1)).put("expireAfterWrite", new WriteDurationParser(anonymousClass1)).put("refreshAfterWrite", new RefreshDurationParser(anonymousClass1)).put("refreshInterval", new RefreshDurationParser(anonymousClass1)).buildOrThrow();
    }

    private CacheBuilderSpec(String specification) {
        this.specification = specification;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CacheBuilderSpec parse(String cacheBuilderSpecification) {
        CacheBuilderSpec cacheBuilderSpec = new CacheBuilderSpec(cacheBuilderSpecification);
        if (!cacheBuilderSpecification.isEmpty()) {
            for (String str : KEYS_SPLITTER.split(cacheBuilderSpecification)) {
                ImmutableList copyOf = ImmutableList.copyOf(KEY_VALUE_SPLITTER.split(str));
                Preconditions.checkArgument(!copyOf.isEmpty(), "blank key-value pair");
                Preconditions.checkArgument(copyOf.size() <= 2, "key-value pair %s with more than one equals sign", str);
                String str2 = (String) copyOf.get(0);
                ValueParser valueParser = VALUE_PARSERS.get(str2);
                Preconditions.checkArgument(valueParser != null, "unknown key %s", str2);
                valueParser.parse(cacheBuilderSpec, str2, copyOf.size() == 1 ? null : (String) copyOf.get(1));
            }
        }
        return cacheBuilderSpec;
    }

    public static CacheBuilderSpec disableCaching() {
        return parse("maximumSize=0");
    }

    CacheBuilder<Object, Object> toCacheBuilder() {
        CacheBuilder<Object, Object> newBuilder = CacheBuilder.newBuilder();
        Integer num = this.initialCapacity;
        if (num != null) {
            newBuilder.initialCapacity(num.intValue());
        }
        Long l = this.maximumSize;
        if (l != null) {
            newBuilder.maximumSize(l.longValue());
        }
        Long l2 = this.maximumWeight;
        if (l2 != null) {
            newBuilder.maximumWeight(l2.longValue());
        }
        Integer num2 = this.concurrencyLevel;
        if (num2 != null) {
            newBuilder.concurrencyLevel(num2.intValue());
        }
        if (this.keyStrength != null) {
            if (AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength[this.keyStrength.ordinal()] == 1) {
                newBuilder.weakKeys();
            } else {
                throw new AssertionError();
            }
        }
        if (this.valueStrength != null) {
            int i = AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength[this.valueStrength.ordinal()];
            if (i == 1) {
                newBuilder.weakValues();
            } else if (i == 2) {
                newBuilder.softValues();
            } else {
                throw new AssertionError();
            }
        }
        Boolean bool = this.recordStats;
        if (bool != null && bool.booleanValue()) {
            newBuilder.recordStats();
        }
        TimeUnit timeUnit = this.writeExpirationTimeUnit;
        if (timeUnit != null) {
            newBuilder.expireAfterWrite(this.writeExpirationDuration, timeUnit);
        }
        TimeUnit timeUnit2 = this.accessExpirationTimeUnit;
        if (timeUnit2 != null) {
            newBuilder.expireAfterAccess(this.accessExpirationDuration, timeUnit2);
        }
        TimeUnit timeUnit3 = this.refreshTimeUnit;
        if (timeUnit3 != null) {
            newBuilder.refreshAfterWrite(this.refreshDuration, timeUnit3);
        }
        return newBuilder;
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$cache$LocalCache$Strength;

        static {
            int[] iArr = new int[LocalCache.Strength.values().length];
            $SwitchMap$com$google$common$cache$LocalCache$Strength = iArr;
            try {
                iArr[LocalCache.Strength.WEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$cache$LocalCache$Strength[LocalCache.Strength.SOFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public String toParsableString() {
        return this.specification;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(toParsableString()).toString();
    }

    public int hashCode() {
        return Objects.hash(this.initialCapacity, this.maximumSize, this.maximumWeight, this.concurrencyLevel, this.keyStrength, this.valueStrength, this.recordStats, durationInNanos(this.writeExpirationDuration, this.writeExpirationTimeUnit), durationInNanos(this.accessExpirationDuration, this.accessExpirationTimeUnit), durationInNanos(this.refreshDuration, this.refreshTimeUnit));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheBuilderSpec)) {
            return false;
        }
        CacheBuilderSpec cacheBuilderSpec = (CacheBuilderSpec) obj;
        return Objects.equals(this.initialCapacity, cacheBuilderSpec.initialCapacity) && Objects.equals(this.maximumSize, cacheBuilderSpec.maximumSize) && Objects.equals(this.maximumWeight, cacheBuilderSpec.maximumWeight) && Objects.equals(this.concurrencyLevel, cacheBuilderSpec.concurrencyLevel) && Objects.equals(this.keyStrength, cacheBuilderSpec.keyStrength) && Objects.equals(this.valueStrength, cacheBuilderSpec.valueStrength) && Objects.equals(this.recordStats, cacheBuilderSpec.recordStats) && Objects.equals(durationInNanos(this.writeExpirationDuration, this.writeExpirationTimeUnit), durationInNanos(cacheBuilderSpec.writeExpirationDuration, cacheBuilderSpec.writeExpirationTimeUnit)) && Objects.equals(durationInNanos(this.accessExpirationDuration, this.accessExpirationTimeUnit), durationInNanos(cacheBuilderSpec.accessExpirationDuration, cacheBuilderSpec.accessExpirationTimeUnit)) && Objects.equals(durationInNanos(this.refreshDuration, this.refreshTimeUnit), durationInNanos(cacheBuilderSpec.refreshDuration, cacheBuilderSpec.refreshTimeUnit));
    }

    private static Long durationInNanos(long duration, TimeUnit unit) {
        if (unit == null) {
            return null;
        }
        return Long.valueOf(unit.toNanos(duration));
    }

    static abstract class IntegerParser implements ValueParser {
        protected abstract void parseInteger(CacheBuilderSpec spec, int value);

        IntegerParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec spec, String key, String value) {
            if (Strings.isNullOrEmpty(value)) {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
            try {
                parseInteger(spec, Integer.parseInt(value));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(CacheBuilderSpec.format("key %s value set to %s, must be integer", key, value), e);
            }
        }
    }

    static abstract class LongParser implements ValueParser {
        protected abstract void parseLong(CacheBuilderSpec spec, long value);

        LongParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec spec, String key, String value) {
            if (Strings.isNullOrEmpty(value)) {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
            try {
                parseLong(spec, Long.parseLong(value));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(CacheBuilderSpec.format("key %s value set to %s, must be integer", key, value), e);
            }
        }
    }

    private static final class InitialCapacityParser extends IntegerParser {
        private InitialCapacityParser() {
        }

        /* synthetic */ InitialCapacityParser(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        protected void parseInteger(CacheBuilderSpec spec, int value) {
            Preconditions.checkArgument(spec.initialCapacity == null, "initial capacity was already set to %s", spec.initialCapacity);
            spec.initialCapacity = Integer.valueOf(value);
        }
    }

    private static final class MaximumSizeParser extends LongParser {
        private MaximumSizeParser() {
        }

        /* synthetic */ MaximumSizeParser(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        protected void parseLong(CacheBuilderSpec spec, long value) {
            Preconditions.checkArgument(spec.maximumSize == null, "maximum size was already set to %s", spec.maximumSize);
            Preconditions.checkArgument(spec.maximumWeight == null, "maximum weight was already set to %s", spec.maximumWeight);
            spec.maximumSize = Long.valueOf(value);
        }
    }

    private static final class MaximumWeightParser extends LongParser {
        private MaximumWeightParser() {
        }

        /* synthetic */ MaximumWeightParser(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        protected void parseLong(CacheBuilderSpec spec, long value) {
            Preconditions.checkArgument(spec.maximumWeight == null, "maximum weight was already set to %s", spec.maximumWeight);
            Preconditions.checkArgument(spec.maximumSize == null, "maximum size was already set to %s", spec.maximumSize);
            spec.maximumWeight = Long.valueOf(value);
        }
    }

    private static final class ConcurrencyLevelParser extends IntegerParser {
        private ConcurrencyLevelParser() {
        }

        /* synthetic */ ConcurrencyLevelParser(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        protected void parseInteger(CacheBuilderSpec spec, int value) {
            Preconditions.checkArgument(spec.concurrencyLevel == null, "concurrency level was already set to %s", spec.concurrencyLevel);
            spec.concurrencyLevel = Integer.valueOf(value);
        }
    }

    private static final class KeyStrengthParser implements ValueParser {
        private final LocalCache.Strength strength;

        public KeyStrengthParser(LocalCache.Strength strength) {
            this.strength = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec spec, String key, String value) {
            Preconditions.checkArgument(value == null, "key %s does not take values", key);
            Preconditions.checkArgument(spec.keyStrength == null, "%s was already set to %s", key, spec.keyStrength);
            spec.keyStrength = this.strength;
        }
    }

    private static final class ValueStrengthParser implements ValueParser {
        private final LocalCache.Strength strength;

        public ValueStrengthParser(LocalCache.Strength strength) {
            this.strength = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec spec, String key, String value) {
            Preconditions.checkArgument(value == null, "key %s does not take values", key);
            Preconditions.checkArgument(spec.valueStrength == null, "%s was already set to %s", key, spec.valueStrength);
            spec.valueStrength = this.strength;
        }
    }

    private static final class RecordStatsParser implements ValueParser {
        private RecordStatsParser() {
        }

        /* synthetic */ RecordStatsParser(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec spec, String key, String value) {
            Preconditions.checkArgument(value == null, "recordStats does not take values");
            Preconditions.checkArgument(spec.recordStats == null, "recordStats already set");
            spec.recordStats = true;
        }
    }

    static abstract class DurationParser implements ValueParser {
        protected abstract void parseDuration(CacheBuilderSpec spec, long duration, TimeUnit unit);

        DurationParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec spec, String key, String value) {
            TimeUnit timeUnit;
            if (Strings.isNullOrEmpty(value)) {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
            try {
                char charAt = value.charAt(value.length() - 1);
                if (charAt == 'd') {
                    timeUnit = TimeUnit.DAYS;
                } else if (charAt == 'h') {
                    timeUnit = TimeUnit.HOURS;
                } else if (charAt == 'm') {
                    timeUnit = TimeUnit.MINUTES;
                } else if (charAt == 's') {
                    timeUnit = TimeUnit.SECONDS;
                } else {
                    throw new IllegalArgumentException(CacheBuilderSpec.format("key %s invalid unit: was %s, must end with one of [dhms]", key, value));
                }
                parseDuration(spec, Long.parseLong(value.substring(0, value.length() - 1)), timeUnit);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(CacheBuilderSpec.format("key %s value set to %s, must be integer", key, value));
            }
        }
    }

    private static final class AccessDurationParser extends DurationParser {
        private AccessDurationParser() {
        }

        /* synthetic */ AccessDurationParser(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void parseDuration(CacheBuilderSpec spec, long duration, TimeUnit unit) {
            Preconditions.checkArgument(spec.accessExpirationTimeUnit == null, "expireAfterAccess already set");
            spec.accessExpirationDuration = duration;
            spec.accessExpirationTimeUnit = unit;
        }
    }

    private static final class WriteDurationParser extends DurationParser {
        private WriteDurationParser() {
        }

        /* synthetic */ WriteDurationParser(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void parseDuration(CacheBuilderSpec spec, long duration, TimeUnit unit) {
            Preconditions.checkArgument(spec.writeExpirationTimeUnit == null, "expireAfterWrite already set");
            spec.writeExpirationDuration = duration;
            spec.writeExpirationTimeUnit = unit;
        }
    }

    private static final class RefreshDurationParser extends DurationParser {
        private RefreshDurationParser() {
        }

        /* synthetic */ RefreshDurationParser(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void parseDuration(CacheBuilderSpec spec, long duration, TimeUnit unit) {
            Preconditions.checkArgument(spec.refreshTimeUnit == null, "refreshAfterWrite already set");
            spec.refreshDuration = duration;
            spec.refreshTimeUnit = unit;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String format(String format, Object... args) {
        return String.format(Locale.ROOT, format, args);
    }
}
