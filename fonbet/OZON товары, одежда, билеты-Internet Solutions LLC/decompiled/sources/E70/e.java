package E70;

import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@j(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LE70/e;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "PENDING", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @i(name = "success")
    public static final e SUCCESS = new e("SUCCESS", 0);

    @i(name = "error")
    public static final e ERROR = new e("ERROR", 1);

    @i(name = "pending")
    public static final e PENDING = new e("PENDING", 2);

    private static final /* synthetic */ e[] $values() {
        return new e[]{SUCCESS, ERROR, PENDING};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private e(String str, int i11) {
    }

    @NotNull
    public static Xc.a<e> getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
