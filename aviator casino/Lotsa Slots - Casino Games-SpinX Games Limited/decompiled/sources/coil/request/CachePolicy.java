package coil.request;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CachePolicy.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcoil/request/CachePolicy;", "", "readEnabled", "", "writeEnabled", "<init>", "(Ljava/lang/String;IZZ)V", "getReadEnabled", "()Z", "getWriteEnabled", "ENABLED", "READ_ONLY", "WRITE_ONLY", "DISABLED", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CachePolicy {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ coil.request.CachePolicy[] $VALUES;
    private final boolean readEnabled;
    private final boolean writeEnabled;
    public static final coil.request.CachePolicy ENABLED = new coil.request.CachePolicy("ENABLED", 0, true, true);
    public static final coil.request.CachePolicy READ_ONLY = new coil.request.CachePolicy("READ_ONLY", 1, true, false);
    public static final coil.request.CachePolicy WRITE_ONLY = new coil.request.CachePolicy("WRITE_ONLY", 2, false, true);
    public static final coil.request.CachePolicy DISABLED = new coil.request.CachePolicy("DISABLED", 3, false, false);

    private static final /* synthetic */ coil.request.CachePolicy[] $values() {
        return new coil.request.CachePolicy[]{ENABLED, READ_ONLY, WRITE_ONLY, DISABLED};
    }

    public static kotlin.enums.EnumEntries<coil.request.CachePolicy> getEntries() {
        return $ENTRIES;
    }

    private CachePolicy(java.lang.String str, int i, boolean z, boolean z2) {
        this.readEnabled = z;
        this.writeEnabled = z2;
    }

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }

    static {
        coil.request.CachePolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static coil.request.CachePolicy valueOf(java.lang.String str) {
        return (coil.request.CachePolicy) java.lang.Enum.valueOf(coil.request.CachePolicy.class, str);
    }

    public static coil.request.CachePolicy[] values() {
        return (coil.request.CachePolicy[]) $VALUES.clone();
    }
}
