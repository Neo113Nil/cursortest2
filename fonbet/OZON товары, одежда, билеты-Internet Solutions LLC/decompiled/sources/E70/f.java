package E70;

import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@j(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LE70/f;", "", "<init>", "(Ljava/lang/String;I)V", "ACWP", "RCVD", "RJCT", "UNKNOWN_STATUS", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @i(name = "ACWP")
    public static final f ACWP = new f("ACWP", 0);

    @i(name = "RCVD")
    public static final f RCVD = new f("RCVD", 1);

    @i(name = "RJCT")
    public static final f RJCT = new f("RJCT", 2);

    @i(name = "UNKNOWN_STATUS")
    public static final f UNKNOWN_STATUS = new f("UNKNOWN_STATUS", 3);

    private static final /* synthetic */ f[] $values() {
        return new f[]{ACWP, RCVD, RJCT, UNKNOWN_STATUS};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private f(String str, int i11) {
    }

    @NotNull
    public static Xc.a<f> getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
