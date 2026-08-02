package kotlin.reflect.jvm.internal.impl.types.error;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ErrorScopeKind {
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind CAPTURED_TYPE_SCOPE;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[] Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind ERASED_RECEIVER_TYPE_SCOPE;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind ERROR_TYPE_SCOPE;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind INTEGER_LITERAL_TYPE_SCOPE;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind NON_CLASSIFIER_SUPER_TYPE_SCOPE;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind SCOPE_FOR_ABBREVIATION_TYPE;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind SCOPE_FOR_ERROR_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind STUB_TYPE_SCOPE;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind UNSUPPORTED_TYPE_SCOPE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoSizes;

    private ErrorScopeKind(java.lang.String str, int i, java.lang.String str2) {
        this.getHighSpeedVideoSizes = str2;
    }

    public final java.lang.String getDebugMessage() {
        return this.getHighSpeedVideoSizes;
    }

    static {
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
        CAPTURED_TYPE_SCOPE = errorScopeKind;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind2 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
        INTEGER_LITERAL_TYPE_SCOPE = errorScopeKind2;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind3 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
        ERASED_RECEIVER_TYPE_SCOPE = errorScopeKind3;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind4 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
        SCOPE_FOR_ABBREVIATION_TYPE = errorScopeKind4;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind5 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
        STUB_TYPE_SCOPE = errorScopeKind5;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind6 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
        NON_CLASSIFIER_SUPER_TYPE_SCOPE = errorScopeKind6;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind7 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
        ERROR_TYPE_SCOPE = errorScopeKind7;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind8 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
        UNSUPPORTED_TYPE_SCOPE = errorScopeKind8;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind9 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
        SCOPE_FOR_ERROR_CLASS = errorScopeKind9;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind10 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");
        SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE = errorScopeKind10;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[] errorScopeKindArr = {errorScopeKind, errorScopeKind2, errorScopeKind3, errorScopeKind4, errorScopeKind5, errorScopeKind6, errorScopeKind7, errorScopeKind8, errorScopeKind9, errorScopeKind10};
        Camera2StreamConfigurationMap = errorScopeKindArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(errorScopeKindArr);
    }

    public static kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[] values() {
        return (kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.class, str);
    }
}
