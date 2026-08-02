package kotlin.annotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlin/annotation/AnnotationRetention;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE", "BINARY", "RUNTIME"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnnotationRetention {
    public static final kotlin.annotation.AnnotationRetention BINARY;
    public static final kotlin.annotation.AnnotationRetention RUNTIME;
    public static final kotlin.annotation.AnnotationRetention SOURCE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.annotation.AnnotationRetention[] getHighSpeedVideoFpsRanges;

    private AnnotationRetention(java.lang.String str, int i) {
    }

    static {
        kotlin.annotation.AnnotationRetention annotationRetention = new kotlin.annotation.AnnotationRetention("SOURCE", 0);
        SOURCE = annotationRetention;
        kotlin.annotation.AnnotationRetention annotationRetention2 = new kotlin.annotation.AnnotationRetention("BINARY", 1);
        BINARY = annotationRetention2;
        kotlin.annotation.AnnotationRetention annotationRetention3 = new kotlin.annotation.AnnotationRetention("RUNTIME", 2);
        RUNTIME = annotationRetention3;
        kotlin.annotation.AnnotationRetention[] annotationRetentionArr = {annotationRetention, annotationRetention2, annotationRetention3};
        getHighSpeedVideoFpsRanges = annotationRetentionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(annotationRetentionArr);
    }

    public static kotlin.annotation.AnnotationRetention[] values() {
        return (kotlin.annotation.AnnotationRetention[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.annotation.AnnotationRetention valueOf(java.lang.String str) {
        return (kotlin.annotation.AnnotationRetention) java.lang.Enum.valueOf(kotlin.annotation.AnnotationRetention.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.annotation.AnnotationRetention> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
