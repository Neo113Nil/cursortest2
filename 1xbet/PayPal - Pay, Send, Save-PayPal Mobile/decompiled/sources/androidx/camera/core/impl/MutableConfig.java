package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface MutableConfig extends androidx.camera.core.impl.Config {
    <ValueT> void insertOption(androidx.camera.core.impl.Config.Option<ValueT> option, androidx.camera.core.impl.Config.OptionPriority optionPriority, ValueT valuet);

    <ValueT> void insertOption(androidx.camera.core.impl.Config.Option<ValueT> option, ValueT valuet);

    <ValueT> ValueT removeOption(androidx.camera.core.impl.Config.Option<ValueT> option);
}
