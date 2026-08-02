package kotlin.reflect.jvm.internal.impl.types.error;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ErrorEntity {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity ERROR_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity ERROR_FUNCTION;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity ERROR_MODULE;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity ERROR_PROPERTY;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity ERROR_SCOPE;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity ERROR_TYPE;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity PARENT_OF_ERROR_SCOPE;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity[] getHighSpeedVideoSizes;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    private ErrorEntity(java.lang.String str, int i, java.lang.String str2) {
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
    }

    public final java.lang.String getDebugText() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    static {
        kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity errorEntity = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity("ERROR_CLASS", 0, "<Error class: %s>");
        ERROR_CLASS = errorEntity;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity errorEntity2 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity("ERROR_FUNCTION", 1, "<Error function>");
        ERROR_FUNCTION = errorEntity2;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity errorEntity3 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity("ERROR_SCOPE", 2, "<Error scope>");
        ERROR_SCOPE = errorEntity3;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity errorEntity4 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity("ERROR_MODULE", 3, "<Error module>");
        ERROR_MODULE = errorEntity4;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity errorEntity5 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity("ERROR_PROPERTY", 4, "<Error property>");
        ERROR_PROPERTY = errorEntity5;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity errorEntity6 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity("ERROR_TYPE", 5, "[Error type: %s]");
        ERROR_TYPE = errorEntity6;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity errorEntity7 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");
        PARENT_OF_ERROR_SCOPE = errorEntity7;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity[] errorEntityArr = {errorEntity, errorEntity2, errorEntity3, errorEntity4, errorEntity5, errorEntity6, errorEntity7};
        getHighSpeedVideoSizes = errorEntityArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(errorEntityArr);
    }

    public static kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity[] values() {
        return (kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.class, str);
    }
}
