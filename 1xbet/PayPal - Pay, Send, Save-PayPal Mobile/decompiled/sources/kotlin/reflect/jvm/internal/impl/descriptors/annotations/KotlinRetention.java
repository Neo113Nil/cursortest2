package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class KotlinRetention {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention BINARY;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention RUNTIME;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention SOURCE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention[] getHighSpeedVideoFpsRangesFor;

    private KotlinRetention(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention kotlinRetention = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention("RUNTIME", 0);
        RUNTIME = kotlinRetention;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention kotlinRetention2 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention("BINARY", 1);
        BINARY = kotlinRetention2;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention kotlinRetention3 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention("SOURCE", 2);
        SOURCE = kotlinRetention3;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention[] kotlinRetentionArr = {kotlinRetention, kotlinRetention2, kotlinRetention3};
        getHighSpeedVideoFpsRangesFor = kotlinRetentionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(kotlinRetentionArr);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention[] values() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention.class, str);
    }
}
