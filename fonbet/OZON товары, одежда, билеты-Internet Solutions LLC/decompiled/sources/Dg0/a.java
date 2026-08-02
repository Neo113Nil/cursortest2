package Dg0;

import Sc.InterfaceC3999a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CDN_CHOOSER_ENABLED;
    public static final a IMAGE_LOADING_FAILURE_LOGGING_ENABLED;
    public static final a IMAGE_PLACEHOLDER_ANALYTICS_ENABLED;
    public static final a IN_MEMORY_RETAIN_CACHE_ENABLED;
    public static final a IS_COMPOSE_INTRINSIC_SIZE_ENABLED;
    public static final a PERF_LOGS_IN_CONSOLE_ENABLED;

    @InterfaceC3999a
    public static final a SHOULD_CHECK_SIZE_PARAM;
    public static final a THUMBNAIL_CACHE_ENABLED;
    public static final a USE_NEW_VISIBILITY_CHECKER;

    @NotNull
    private final String flagName;
    private final boolean isDeprecated;

    static {
        a aVar = new a("THUMBNAIL_CACHE_ENABLED", 0, "thumbnailCacheEnabled");
        THUMBNAIL_CACHE_ENABLED = aVar;
        a aVar2 = new a("CDN_CHOOSER_ENABLED", 1, "cdnChooserEnabled");
        CDN_CHOOSER_ENABLED = aVar2;
        a aVar3 = new a("IMAGE_LOADING_FAILURE_LOGGING_ENABLED", 2, "imageLoadingFailureLoggingEnabled");
        IMAGE_LOADING_FAILURE_LOGGING_ENABLED = aVar3;
        a aVar4 = new a("IMAGE_PLACEHOLDER_ANALYTICS_ENABLED", 3, "imagePlaceholderAnalyticsEnabled");
        IMAGE_PLACEHOLDER_ANALYTICS_ENABLED = aVar4;
        a aVar5 = new a() { // from class: Dg0.a.a
            private final boolean isDeprecated = true;
        };
        SHOULD_CHECK_SIZE_PARAM = aVar5;
        a aVar6 = new a("PERF_LOGS_IN_CONSOLE_ENABLED", 5, "perfLogsInConsoleEnabled");
        PERF_LOGS_IN_CONSOLE_ENABLED = aVar6;
        a aVar7 = new a("IN_MEMORY_RETAIN_CACHE_ENABLED", 6, "inMemoryRetainCacheEnabled");
        IN_MEMORY_RETAIN_CACHE_ENABLED = aVar7;
        a aVar8 = new a("USE_NEW_VISIBILITY_CHECKER", 7, "useNewVisibilityChecker");
        USE_NEW_VISIBILITY_CHECKER = aVar8;
        a aVar9 = new a("IS_COMPOSE_INTRINSIC_SIZE_ENABLED", 8, "isComposeIntrinsicSizeEnabled");
        IS_COMPOSE_INTRINSIC_SIZE_ENABLED = aVar9;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        $VALUES = aVarArr;
        $ENTRIES = Xc.b.a(aVarArr);
    }

    public /* synthetic */ a() {
        this("SHOULD_CHECK_SIZE_PARAM", 4, "shouldCheckSizeParam");
    }

    @NotNull
    public static Xc.a<a> a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    private a(String str, int i11, String str2) {
        this.flagName = str2;
    }
}
