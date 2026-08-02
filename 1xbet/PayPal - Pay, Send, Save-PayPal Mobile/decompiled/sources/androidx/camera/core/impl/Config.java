package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface Config {

    public interface OptionMatcher {
        boolean onOptionMatched(androidx.camera.core.impl.Config.Option<?> option);
    }

    public enum OptionPriority {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    boolean containsOption(androidx.camera.core.impl.Config.Option<?> option);

    void findOptions(java.lang.String str, androidx.camera.core.impl.Config.OptionMatcher optionMatcher);

    androidx.camera.core.impl.Config.OptionPriority getOptionPriority(androidx.camera.core.impl.Config.Option<?> option);

    java.util.Set<androidx.camera.core.impl.Config.OptionPriority> getPriorities(androidx.camera.core.impl.Config.Option<?> option);

    java.util.Set<androidx.camera.core.impl.Config.Option<?>> listOptions();

    <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> option);

    <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> option, ValueT valuet);

    <ValueT> ValueT retrieveOptionWithPriority(androidx.camera.core.impl.Config.Option<ValueT> option, androidx.camera.core.impl.Config.OptionPriority optionPriority);

    public static abstract class Option<T> {
        public abstract java.lang.String getId();

        public abstract java.lang.Object getToken();

        public abstract java.lang.Class<T> getValueClass();

        Option() {
        }

        public static <T> androidx.camera.core.impl.Config.Option<T> create(java.lang.String str, java.lang.Class<?> cls) {
            return create(str, cls, null);
        }

        public static <T> androidx.camera.core.impl.Config.Option<T> create(java.lang.String str, java.lang.Class<?> cls, java.lang.Object obj) {
            return new androidx.camera.core.impl.AutoValue_Config_Option(str, cls, obj);
        }
    }

    static boolean hasConflict(androidx.camera.core.impl.Config.OptionPriority optionPriority, androidx.camera.core.impl.Config.OptionPriority optionPriority2) {
        return optionPriority == androidx.camera.core.impl.Config.OptionPriority.REQUIRED && optionPriority2 == androidx.camera.core.impl.Config.OptionPriority.REQUIRED;
    }

    static androidx.camera.core.impl.Config mergeConfigs(androidx.camera.core.impl.Config config, androidx.camera.core.impl.Config config2) {
        androidx.camera.core.impl.MutableOptionsBundle create;
        if (config == null && config2 == null) {
            return androidx.camera.core.impl.OptionsBundle.emptyBundle();
        }
        if (config2 != null) {
            create = androidx.camera.core.impl.MutableOptionsBundle.from(config2);
        } else {
            create = androidx.camera.core.impl.MutableOptionsBundle.create();
        }
        if (config != null) {
            java.util.Iterator<androidx.camera.core.impl.Config.Option<?>> it = config.listOptions().iterator();
            while (it.hasNext()) {
                mergeOptionValue(create, config2, config, it.next());
            }
        }
        return androidx.camera.core.impl.OptionsBundle.from(create);
    }

    static void mergeOptionValue(androidx.camera.core.impl.MutableOptionsBundle mutableOptionsBundle, androidx.camera.core.impl.Config config, androidx.camera.core.impl.Config config2, androidx.camera.core.impl.Config.Option<?> option) {
        if (java.util.Objects.equals(option, androidx.camera.core.impl.ImageOutputConfig.OPTION_RESOLUTION_SELECTOR)) {
            androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector = (androidx.camera.core.resolutionselector.ResolutionSelector) config2.retrieveOption(option, null);
            mutableOptionsBundle.insertOption(option, config2.getOptionPriority(option), androidx.camera.core.impl.utils.ResolutionSelectorUtil.overrideResolutionSelectors((androidx.camera.core.resolutionselector.ResolutionSelector) config.retrieveOption(option, null), resolutionSelector));
            return;
        }
        mutableOptionsBundle.insertOption(option, config2.getOptionPriority(option), config2.retrieveOption(option));
    }
}
