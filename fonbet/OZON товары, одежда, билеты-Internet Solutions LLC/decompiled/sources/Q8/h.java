package Q8;

import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f23033b = Pattern.compile("^[\\p{L}\\p{N}]+$");

    /* renamed from: a, reason: collision with root package name */
    private final String f23034a;

    public h(String str) {
        this.f23034a = str.concat("_");
    }

    public final String a(Object obj) {
        String obj2 = obj.toString();
        if (!f23033b.matcher(obj2).matches()) {
            throw new IllegalArgumentException(Nk.a.b("Invalid key: ", obj2));
        }
        return this.f23034a + obj;
    }
}
