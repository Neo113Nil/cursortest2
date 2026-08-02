package w1;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class N2 {

    /* renamed from: c, reason: collision with root package name */
    public static final SimpleDateFormat f17476c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public String f17477a;

    /* renamed from: b, reason: collision with root package name */
    public long f17478b;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(f17476c.format(Long.valueOf(this.f17478b)));
        sb.append(": ");
        return e1.k.i(sb, this.f17477a, "\n");
    }
}
