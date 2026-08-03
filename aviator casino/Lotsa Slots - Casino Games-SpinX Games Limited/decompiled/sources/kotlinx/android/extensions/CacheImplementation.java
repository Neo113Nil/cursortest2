package kotlinx.android.extensions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CacheImplementation.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation;", "", "(Ljava/lang/String;I)V", "SPARSE_ARRAY", "HASH_MAP", "NO_CACHE", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheImplementation {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlinx.android.extensions.CacheImplementation[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.android.extensions.CacheImplementation.Companion INSTANCE;
    private static final kotlinx.android.extensions.CacheImplementation DEFAULT;
    public static final kotlinx.android.extensions.CacheImplementation HASH_MAP;
    public static final kotlinx.android.extensions.CacheImplementation NO_CACHE;
    public static final kotlinx.android.extensions.CacheImplementation SPARSE_ARRAY = new kotlinx.android.extensions.CacheImplementation("SPARSE_ARRAY", 0);

    private static final /* synthetic */ kotlinx.android.extensions.CacheImplementation[] $values() {
        return new kotlinx.android.extensions.CacheImplementation[]{SPARSE_ARRAY, HASH_MAP, NO_CACHE};
    }

    public static kotlin.enums.EnumEntries<kotlinx.android.extensions.CacheImplementation> getEntries() {
        return $ENTRIES;
    }

    public static kotlinx.android.extensions.CacheImplementation valueOf(java.lang.String str) {
        return (kotlinx.android.extensions.CacheImplementation) java.lang.Enum.valueOf(kotlinx.android.extensions.CacheImplementation.class, str);
    }

    public static kotlinx.android.extensions.CacheImplementation[] values() {
        return (kotlinx.android.extensions.CacheImplementation[]) $VALUES.clone();
    }

    private CacheImplementation(java.lang.String str, int i) {
    }

    static {
        kotlinx.android.extensions.CacheImplementation cacheImplementation = new kotlinx.android.extensions.CacheImplementation("HASH_MAP", 1);
        HASH_MAP = cacheImplementation;
        NO_CACHE = new kotlinx.android.extensions.CacheImplementation("NO_CACHE", 2);
        kotlinx.android.extensions.CacheImplementation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new kotlinx.android.extensions.CacheImplementation.Companion(null);
        DEFAULT = cacheImplementation;
    }

    /* compiled from: CacheImplementation.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation$Companion;", "", "()V", "DEFAULT", "Lkotlinx/android/extensions/CacheImplementation;", "getDEFAULT", "()Lkotlinx/android/extensions/CacheImplementation;", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.android.extensions.CacheImplementation getDEFAULT() {
            return kotlinx.android.extensions.CacheImplementation.DEFAULT;
        }
    }
}
