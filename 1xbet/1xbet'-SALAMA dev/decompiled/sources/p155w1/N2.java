package p155w1;

import java.text.SimpleDateFormat;
import java.util.Locale;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class N2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SimpleDateFormat f17482c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17484b;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(f17482c.format(Long.valueOf(this.f17484b)));
        sb.append(": ");
        return k.i(sb, this.f17483a, "\n");
    }
}
