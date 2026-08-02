package androidx.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017BH\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nR\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000fR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0007¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0013R\u0011\u0010\t\u001a\u00020\b8\u0007¢\u0006\u0006\u001a\u0004\b\t\u0010\u0014"}, d2 = {"Landroidx/annotation/InspectableProperty;", "", "", "name", "", "attributeId", "", "hasAttributeId", "Landroidx/annotation/InspectableProperty$ValueType;", "valueType", "", "Landroidx/annotation/InspectableProperty$EnumEntry;", "enumMapping", "Landroidx/annotation/InspectableProperty$FlagEntry;", "flagMapping", "()I", "()[Landroidx/annotation/InspectableProperty$EnumEntry;", "()[Landroidx/annotation/InspectableProperty$FlagEntry;", "()Z", "()Ljava/lang/String;", "()Landroidx/annotation/InspectableProperty$ValueType;", "EnumEntry", "FlagEntry", "ValueType"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.Deprecated(message = "Replaced by the androidx.resourceinpsection package.")
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
/* loaded from: classes.dex */
public @interface InspectableProperty {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"Landroidx/annotation/InspectableProperty$EnumEntry;", "", "", "name", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "()Ljava/lang/String;", "()I"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface EnumEntry {
        java.lang.String name();

        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004R\u0011\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\bR\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"Landroidx/annotation/InspectableProperty$FlagEntry;", "", "", "name", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, com.daon.sdk.face.license.License.FEATURE_MASK, "()I", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface FlagEntry {
        int mask() default 0;

        java.lang.String name();

        int target();
    }

    int attributeId() default 0;

    androidx.annotation.InspectableProperty.EnumEntry[] enumMapping() default {};

    androidx.annotation.InspectableProperty.FlagEntry[] flagMapping() default {};

    boolean hasAttributeId() default true;

    java.lang.String name() default "";

    androidx.annotation.InspectableProperty.ValueType valueType() default androidx.annotation.InspectableProperty.ValueType.INFERRED;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Landroidx/annotation/InspectableProperty$ValueType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "INFERRED", "INT_ENUM", "INT_FLAG", "COLOR", "GRAVITY", "RESOURCE_ID"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ValueType {
        public static final androidx.annotation.InspectableProperty.ValueType COLOR;
        public static final androidx.annotation.InspectableProperty.ValueType GRAVITY;
        public static final androidx.annotation.InspectableProperty.ValueType INFERRED;
        public static final androidx.annotation.InspectableProperty.ValueType INT_ENUM;
        public static final androidx.annotation.InspectableProperty.ValueType INT_FLAG;
        public static final androidx.annotation.InspectableProperty.ValueType NONE;
        public static final androidx.annotation.InspectableProperty.ValueType RESOURCE_ID;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ androidx.annotation.InspectableProperty.ValueType[] getHighSpeedVideoSizes;

        private ValueType(java.lang.String str, int i) {
        }

        static {
            androidx.annotation.InspectableProperty.ValueType valueType = new androidx.annotation.InspectableProperty.ValueType("NONE", 0);
            NONE = valueType;
            androidx.annotation.InspectableProperty.ValueType valueType2 = new androidx.annotation.InspectableProperty.ValueType("INFERRED", 1);
            INFERRED = valueType2;
            androidx.annotation.InspectableProperty.ValueType valueType3 = new androidx.annotation.InspectableProperty.ValueType("INT_ENUM", 2);
            INT_ENUM = valueType3;
            androidx.annotation.InspectableProperty.ValueType valueType4 = new androidx.annotation.InspectableProperty.ValueType("INT_FLAG", 3);
            INT_FLAG = valueType4;
            androidx.annotation.InspectableProperty.ValueType valueType5 = new androidx.annotation.InspectableProperty.ValueType("COLOR", 4);
            COLOR = valueType5;
            androidx.annotation.InspectableProperty.ValueType valueType6 = new androidx.annotation.InspectableProperty.ValueType("GRAVITY", 5);
            GRAVITY = valueType6;
            androidx.annotation.InspectableProperty.ValueType valueType7 = new androidx.annotation.InspectableProperty.ValueType("RESOURCE_ID", 6);
            RESOURCE_ID = valueType7;
            androidx.annotation.InspectableProperty.ValueType[] valueTypeArr = {valueType, valueType2, valueType3, valueType4, valueType5, valueType6, valueType7};
            getHighSpeedVideoSizes = valueTypeArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(valueTypeArr);
        }

        public static androidx.annotation.InspectableProperty.ValueType[] values() {
            return (androidx.annotation.InspectableProperty.ValueType[]) getHighSpeedVideoSizes.clone();
        }

        public static androidx.annotation.InspectableProperty.ValueType valueOf(java.lang.String str) {
            return (androidx.annotation.InspectableProperty.ValueType) java.lang.Enum.valueOf(androidx.annotation.InspectableProperty.ValueType.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.annotation.InspectableProperty.ValueType> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }
}
