package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface ImageInputConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_INPUT_FORMAT = androidx.camera.core.impl.Config.Option.create("camerax.core.imageInput.inputFormat", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_SECONDARY_INPUT_FORMAT = androidx.camera.core.impl.Config.Option.create("camerax.core.imageInput.secondaryInputFormat", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.DynamicRange> OPTION_INPUT_DYNAMIC_RANGE = androidx.camera.core.impl.Config.Option.create("camerax.core.imageInput.inputDynamicRange", androidx.camera.core.DynamicRange.class);

    public interface Builder<B> {
        B setDynamicRange(androidx.camera.core.DynamicRange dynamicRange);
    }

    default int getInputFormat() {
        return ((java.lang.Integer) retrieveOption(OPTION_INPUT_FORMAT)).intValue();
    }

    default int getSecondaryInputFormat() {
        return ((java.lang.Integer) retrieveOption(OPTION_SECONDARY_INPUT_FORMAT, 0)).intValue();
    }

    default androidx.camera.core.DynamicRange getDynamicRange() {
        return (androidx.camera.core.DynamicRange) androidx.core.util.Preconditions.checkNotNull((androidx.camera.core.DynamicRange) retrieveOption(OPTION_INPUT_DYNAMIC_RANGE, androidx.camera.core.DynamicRange.UNSPECIFIED));
    }

    default boolean hasDynamicRange() {
        return containsOption(OPTION_INPUT_DYNAMIC_RANGE);
    }
}
