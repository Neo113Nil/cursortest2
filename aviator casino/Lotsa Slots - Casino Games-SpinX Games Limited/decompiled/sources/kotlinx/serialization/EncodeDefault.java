package kotlinx.serialization;

/* compiled from: Annotations.kt */
@java.lang.annotation.Target({})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.PROPERTY})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.MustBeDocumented
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/EncodeDefault;", "", com.ironsource.X3.a.t, "Lkotlinx/serialization/EncodeDefault$Mode;", "()Lkotlinx/serialization/EncodeDefault$Mode;", "Mode", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
@java.lang.annotation.Documented
/* loaded from: classes6.dex */
public @interface EncodeDefault {
    kotlinx.serialization.EncodeDefault.Mode mode() default kotlinx.serialization.EncodeDefault.Mode.ALWAYS;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Annotations.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/EncodeDefault$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "ALWAYS", "NEVER", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.ExperimentalSerializationApi
    public static final class Mode {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ kotlinx.serialization.EncodeDefault.Mode[] $VALUES;
        public static final kotlinx.serialization.EncodeDefault.Mode ALWAYS = new kotlinx.serialization.EncodeDefault.Mode("ALWAYS", 0);
        public static final kotlinx.serialization.EncodeDefault.Mode NEVER = new kotlinx.serialization.EncodeDefault.Mode("NEVER", 1);

        private static final /* synthetic */ kotlinx.serialization.EncodeDefault.Mode[] $values() {
            return new kotlinx.serialization.EncodeDefault.Mode[]{ALWAYS, NEVER};
        }

        public static kotlin.enums.EnumEntries<kotlinx.serialization.EncodeDefault.Mode> getEntries() {
            return $ENTRIES;
        }

        private Mode(java.lang.String str, int i) {
        }

        static {
            kotlinx.serialization.EncodeDefault.Mode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        public static kotlinx.serialization.EncodeDefault.Mode valueOf(java.lang.String str) {
            return (kotlinx.serialization.EncodeDefault.Mode) java.lang.Enum.valueOf(kotlinx.serialization.EncodeDefault.Mode.class, str);
        }

        public static kotlinx.serialization.EncodeDefault.Mode[] values() {
            return (kotlinx.serialization.EncodeDefault.Mode[]) $VALUES.clone();
        }
    }
}
