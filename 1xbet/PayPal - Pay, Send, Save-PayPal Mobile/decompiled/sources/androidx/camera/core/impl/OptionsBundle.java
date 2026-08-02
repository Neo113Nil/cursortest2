package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class OptionsBundle implements androidx.camera.core.impl.Config {
    protected static final java.util.Comparator<androidx.camera.core.impl.Config.Option<?>> ID_COMPARE;
    private static final androidx.camera.core.impl.OptionsBundle getHighSpeedVideoSizes;
    protected final java.util.TreeMap<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> mOptions;

    static {
        java.util.Comparator<androidx.camera.core.impl.Config.Option<?>> comparator = new java.util.Comparator() { // from class: androidx.camera.core.impl.OptionsBundle$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int compareTo;
                compareTo = ((androidx.camera.core.impl.Config.Option) obj).getId().compareTo(((androidx.camera.core.impl.Config.Option) obj2).getId());
                return compareTo;
            }
        };
        ID_COMPARE = comparator;
        getHighSpeedVideoSizes = new androidx.camera.core.impl.OptionsBundle(new java.util.TreeMap(comparator));
    }

    OptionsBundle(java.util.TreeMap<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> treeMap) {
        this.mOptions = treeMap;
    }

    public static androidx.camera.core.impl.OptionsBundle from(androidx.camera.core.impl.Config config) {
        if (androidx.camera.core.impl.OptionsBundle.class.equals(config.getClass())) {
            return (androidx.camera.core.impl.OptionsBundle) config;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(ID_COMPARE);
        for (androidx.camera.core.impl.Config.Option<?> option : config.listOptions()) {
            java.util.Set<androidx.camera.core.impl.Config.OptionPriority> priorities = config.getPriorities(option);
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            for (androidx.camera.core.impl.Config.OptionPriority optionPriority : priorities) {
                arrayMap.put(optionPriority, config.retrieveOptionWithPriority(option, optionPriority));
            }
            treeMap.put(option, arrayMap);
        }
        return new androidx.camera.core.impl.OptionsBundle(treeMap);
    }

    public static androidx.camera.core.impl.OptionsBundle emptyBundle() {
        return getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.Config
    public java.util.Set<androidx.camera.core.impl.Config.Option<?>> listOptions() {
        return java.util.Collections.unmodifiableSet(this.mOptions.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public boolean containsOption(androidx.camera.core.impl.Config.Option<?> option) {
        return this.mOptions.containsKey(option);
    }

    @Override // androidx.camera.core.impl.Config
    public <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> option) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(option);
        if (map == null) {
            throw new java.lang.IllegalArgumentException("Option does not exist: ".concat(java.lang.String.valueOf(option)));
        }
        return (ValueT) map.get((androidx.camera.core.impl.Config.OptionPriority) java.util.Collections.min(map.keySet()));
    }

    @Override // androidx.camera.core.impl.Config
    public <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> option, ValueT valuet) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(option);
        return map == null ? valuet : (ValueT) map.get((androidx.camera.core.impl.Config.OptionPriority) java.util.Collections.min(map.keySet()));
    }

    @Override // androidx.camera.core.impl.Config
    public <ValueT> ValueT retrieveOptionWithPriority(androidx.camera.core.impl.Config.Option<ValueT> option, androidx.camera.core.impl.Config.OptionPriority optionPriority) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(option);
        if (map == null) {
            throw new java.lang.IllegalArgumentException("Option does not exist: ".concat(java.lang.String.valueOf(option)));
        }
        if (!map.containsKey(optionPriority)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Option does not exist: ");
            sb.append(option);
            sb.append(" with priority=");
            sb.append(optionPriority);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return (ValueT) map.get(optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    public androidx.camera.core.impl.Config.OptionPriority getOptionPriority(androidx.camera.core.impl.Config.Option<?> option) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(option);
        if (map == null) {
            throw new java.lang.IllegalArgumentException("Option does not exist: ".concat(java.lang.String.valueOf(option)));
        }
        return (androidx.camera.core.impl.Config.OptionPriority) java.util.Collections.min(map.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public void findOptions(java.lang.String str, androidx.camera.core.impl.Config.OptionMatcher optionMatcher) {
        for (java.util.Map.Entry<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> entry : this.mOptions.tailMap(androidx.camera.core.impl.Config.Option.create(str, java.lang.Void.class)).entrySet()) {
            if (!entry.getKey().getId().startsWith(str) || !optionMatcher.onOptionMatched(entry.getKey())) {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.Config
    public java.util.Set<androidx.camera.core.impl.Config.OptionPriority> getPriorities(androidx.camera.core.impl.Config.Option<?> option) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(option);
        if (map == null) {
            return java.util.Collections.emptySet();
        }
        return java.util.Collections.unmodifiableSet(map.keySet());
    }
}
