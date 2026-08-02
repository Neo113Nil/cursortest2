package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface ReadableConfig extends androidx.camera.core.impl.Config {
    androidx.camera.core.impl.Config getConfig();

    @Override // androidx.camera.core.impl.Config
    default boolean containsOption(androidx.camera.core.impl.Config.Option<?> option) {
        return getConfig().containsOption(option);
    }

    @Override // androidx.camera.core.impl.Config
    default <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> option) {
        return (ValueT) getConfig().retrieveOption(option);
    }

    @Override // androidx.camera.core.impl.Config
    default <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> option, ValueT valuet) {
        return (ValueT) getConfig().retrieveOption(option, valuet);
    }

    @Override // androidx.camera.core.impl.Config
    default void findOptions(java.lang.String str, androidx.camera.core.impl.Config.OptionMatcher optionMatcher) {
        getConfig().findOptions(str, optionMatcher);
    }

    @Override // androidx.camera.core.impl.Config
    default java.util.Set<androidx.camera.core.impl.Config.Option<?>> listOptions() {
        return getConfig().listOptions();
    }

    @Override // androidx.camera.core.impl.Config
    default <ValueT> ValueT retrieveOptionWithPriority(androidx.camera.core.impl.Config.Option<ValueT> option, androidx.camera.core.impl.Config.OptionPriority optionPriority) {
        return (ValueT) getConfig().retrieveOptionWithPriority(option, optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    default androidx.camera.core.impl.Config.OptionPriority getOptionPriority(androidx.camera.core.impl.Config.Option<?> option) {
        return getConfig().getOptionPriority(option);
    }

    @Override // androidx.camera.core.impl.Config
    default java.util.Set<androidx.camera.core.impl.Config.OptionPriority> getPriorities(androidx.camera.core.impl.Config.Option<?> option) {
        return getConfig().getPriorities(option);
    }
}
