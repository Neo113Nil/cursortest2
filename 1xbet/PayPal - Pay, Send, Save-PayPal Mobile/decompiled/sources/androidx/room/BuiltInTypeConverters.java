package androidx.room;

@java.lang.annotation.Target({})
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u001e\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/room/BuiltInTypeConverters;", "", "Landroidx/room/BuiltInTypeConverters$State;", "enums", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, "byteBuffer", "()Landroidx/room/BuiltInTypeConverters$State;", "State"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes.dex */
public @interface BuiltInTypeConverters {
    androidx.room.BuiltInTypeConverters.State byteBuffer() default androidx.room.BuiltInTypeConverters.State.INHERITED;

    androidx.room.BuiltInTypeConverters.State enums() default androidx.room.BuiltInTypeConverters.State.INHERITED;

    androidx.room.BuiltInTypeConverters.State uuid() default androidx.room.BuiltInTypeConverters.State.INHERITED;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/room/BuiltInTypeConverters$State;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "INHERITED"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        public static final androidx.room.BuiltInTypeConverters.State DISABLED;
        public static final androidx.room.BuiltInTypeConverters.State ENABLED;
        public static final androidx.room.BuiltInTypeConverters.State INHERITED;
        private static final /* synthetic */ androidx.room.BuiltInTypeConverters.State[] getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

        private State(java.lang.String str, int i) {
        }

        static {
            androidx.room.BuiltInTypeConverters.State state = new androidx.room.BuiltInTypeConverters.State("ENABLED", 0);
            ENABLED = state;
            androidx.room.BuiltInTypeConverters.State state2 = new androidx.room.BuiltInTypeConverters.State("DISABLED", 1);
            DISABLED = state2;
            androidx.room.BuiltInTypeConverters.State state3 = new androidx.room.BuiltInTypeConverters.State("INHERITED", 2);
            INHERITED = state3;
            androidx.room.BuiltInTypeConverters.State[] stateArr = {state, state2, state3};
            getHighSpeedVideoFpsRanges = stateArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(stateArr);
        }

        public static androidx.room.BuiltInTypeConverters.State[] values() {
            return (androidx.room.BuiltInTypeConverters.State[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static androidx.room.BuiltInTypeConverters.State valueOf(java.lang.String str) {
            return (androidx.room.BuiltInTypeConverters.State) java.lang.Enum.valueOf(androidx.room.BuiltInTypeConverters.State.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.room.BuiltInTypeConverters.State> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }
}
