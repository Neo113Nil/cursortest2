package kotlin.reflect.jvm.internal.impl.descriptors;

import io.flutter.plugins.firebase.crashlytics.Constants;

/* loaded from: classes5.dex */
public enum ClassKind {
    CLASS(Constants.CLASS),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");

    private final String codeRepresentation;

    ClassKind(String str) {
        this.codeRepresentation = str;
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
