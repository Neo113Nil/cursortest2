package androidx.camera.core.internal;

/* loaded from: classes6.dex */
public interface TargetConfig<T> extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<java.lang.String> OPTION_TARGET_NAME = androidx.camera.core.impl.Config.Option.create("camerax.core.target.name", java.lang.String.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Class<?>> OPTION_TARGET_CLASS = androidx.camera.core.impl.Config.Option.create("camerax.core.target.class", java.lang.Class.class);

    public interface Builder<T, B> {
        B setTargetClass(java.lang.Class<T> cls);

        B setTargetName(java.lang.String str);
    }

    default java.lang.Class<T> getTargetClass(java.lang.Class<T> cls) {
        return (java.lang.Class) retrieveOption(OPTION_TARGET_CLASS, cls);
    }

    default java.lang.Class<T> getTargetClass() {
        return (java.lang.Class) retrieveOption(OPTION_TARGET_CLASS);
    }

    default java.lang.String getTargetName(java.lang.String str) {
        return (java.lang.String) retrieveOption(OPTION_TARGET_NAME, str);
    }

    default java.lang.String getTargetName() {
        return (java.lang.String) retrieveOption(OPTION_TARGET_NAME);
    }
}
