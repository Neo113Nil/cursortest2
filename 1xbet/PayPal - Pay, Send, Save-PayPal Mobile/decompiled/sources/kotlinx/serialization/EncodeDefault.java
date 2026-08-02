package kotlinx.serialization;

@java.lang.annotation.Target({})
@kotlin.annotation.MustBeDocumented
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/serialization/EncodeDefault;", "", "Lkotlinx/serialization/EncodeDefault$Mode;", "mode", "()Lkotlinx/serialization/EncodeDefault$Mode;", "Mode"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.PROPERTY})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface EncodeDefault {
    kotlinx.serialization.EncodeDefault.Mode mode() default kotlinx.serialization.EncodeDefault.Mode.ALWAYS;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lkotlinx/serialization/EncodeDefault$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "ALWAYS", "NEVER"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Mode {
        public static final kotlinx.serialization.EncodeDefault.Mode ALWAYS;
        public static final kotlinx.serialization.EncodeDefault.Mode NEVER;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlinx.serialization.EncodeDefault.Mode[] getHighSpeedVideoSizes;

        private Mode(java.lang.String str, int i) {
        }

        static {
            kotlinx.serialization.EncodeDefault.Mode mode = new kotlinx.serialization.EncodeDefault.Mode("ALWAYS", 0);
            ALWAYS = mode;
            kotlinx.serialization.EncodeDefault.Mode mode2 = new kotlinx.serialization.EncodeDefault.Mode("NEVER", 1);
            NEVER = mode2;
            kotlinx.serialization.EncodeDefault.Mode[] modeArr = {mode, mode2};
            getHighSpeedVideoSizes = modeArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(modeArr);
        }

        public static kotlinx.serialization.EncodeDefault.Mode[] values() {
            return (kotlinx.serialization.EncodeDefault.Mode[]) getHighSpeedVideoSizes.clone();
        }

        public static kotlinx.serialization.EncodeDefault.Mode valueOf(java.lang.String str) {
            return (kotlinx.serialization.EncodeDefault.Mode) java.lang.Enum.valueOf(kotlinx.serialization.EncodeDefault.Mode.class, str);
        }

        public static kotlin.enums.EnumEntries<kotlinx.serialization.EncodeDefault.Mode> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }
}
