package kotlin.reflect.jvm.internal.impl.resolve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ReturnValueStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus.Companion Companion;
    public static final kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus ExplicitlyIgnorable;
    public static final kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus MustUse;
    public static final kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus Unspecified;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus[] getHighSpeedVideoFpsRangesFor;

    private ReturnValueStatus(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus returnValueStatus = new kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus("MustUse", 0);
        MustUse = returnValueStatus;
        kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus returnValueStatus2 = new kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus("ExplicitlyIgnorable", 1);
        ExplicitlyIgnorable = returnValueStatus2;
        kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus returnValueStatus3 = new kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus("Unspecified", 2);
        Unspecified = returnValueStatus3;
        kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus[] returnValueStatusArr = {returnValueStatus, returnValueStatus2, returnValueStatus3};
        getHighSpeedVideoFpsRangesFor = returnValueStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(returnValueStatusArr);
        Companion = new kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus.Companion(null);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus[] values() {
        return (kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus.class, str);
    }
}
