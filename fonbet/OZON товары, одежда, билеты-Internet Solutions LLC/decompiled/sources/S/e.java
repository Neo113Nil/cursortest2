package S;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public abstract class e implements Comparable<e> {

    /* renamed from: a, reason: collision with root package name */
    public static final e f25186a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f25187b;

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f25188c;

    static {
        new a(1, 0, 0, "");
        new a(1, 1, 0, "");
        new a(1, 2, 0, "");
        f25186a = new a(1, 3, 0, "");
        f25187b = new a(1, 4, 0, "");
        f25188c = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");
    }

    e() {
    }

    private static BigInteger a(e eVar) {
        return BigInteger.valueOf(eVar.c()).shiftLeft(32).or(BigInteger.valueOf(eVar.d())).shiftLeft(32).or(BigInteger.valueOf(eVar.e()));
    }

    public static e f(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f25188c.matcher(str);
        if (matcher.matches()) {
            return new a(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    abstract String b();

    public abstract int c();

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull e eVar) {
        return a(this).compareTo(a(eVar));
    }

    abstract int d();

    abstract int e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Integer.valueOf(c()).equals(Integer.valueOf(eVar.c())) && Integer.valueOf(d()).equals(Integer.valueOf(eVar.d())) && Integer.valueOf(e()).equals(Integer.valueOf(eVar.e()));
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(c()), Integer.valueOf(d()), Integer.valueOf(e()));
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(c() + "." + d() + "." + e());
        if (!TextUtils.isEmpty(b())) {
            sb2.append("-" + b());
        }
        return sb2.toString();
    }
}
