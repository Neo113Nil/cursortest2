package kotlin.reflect.jvm.internal.impl.name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
final class State {
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.State[] Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.name.State getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    public static final kotlin.reflect.jvm.internal.impl.name.State getHighSpeedVideoFpsRangesFor;
    public static final kotlin.reflect.jvm.internal.impl.name.State getHighSpeedVideoSizes;

    private State(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.State state = new kotlin.reflect.jvm.internal.impl.name.State("BEGINNING", 0);
        getHighResolutionOutputSizeshNQ4ISI = state;
        kotlin.reflect.jvm.internal.impl.name.State state2 = new kotlin.reflect.jvm.internal.impl.name.State("MIDDLE", 1);
        getHighSpeedVideoSizes = state2;
        kotlin.reflect.jvm.internal.impl.name.State state3 = new kotlin.reflect.jvm.internal.impl.name.State("AFTER_DOT", 2);
        getHighSpeedVideoFpsRangesFor = state3;
        kotlin.reflect.jvm.internal.impl.name.State[] stateArr = {state, state2, state3};
        Camera2StreamConfigurationMap = stateArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(stateArr);
    }

    public static kotlin.reflect.jvm.internal.impl.name.State[] values() {
        return (kotlin.reflect.jvm.internal.impl.name.State[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.name.State valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.name.State) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.name.State.class, str);
    }
}
