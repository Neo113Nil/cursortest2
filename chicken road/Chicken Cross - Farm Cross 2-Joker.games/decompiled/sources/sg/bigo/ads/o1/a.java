package sg.bigo.ads.o1;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sg.bigo.ads.U.o;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class a {
    public static final Pattern d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");
    public static final Pattern e = Pattern.compile("GET /(.*) HTTP");

    /* renamed from: a, reason: collision with root package name */
    public final String f13224a;
    public final long b;
    public final boolean c;

    public a(String str) {
        str.getClass();
        Matcher matcher = d.matcher(str);
        long parseLong = matcher.find() ? Long.parseLong(matcher.group(1)) : -1L;
        this.b = Math.max(0L, parseLong);
        this.c = parseLong >= 0;
        Matcher matcher2 = e.matcher(str);
        this.f13224a = matcher2.find() ? matcher2.group(1) : new String();
    }

    public static a a(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (TextUtils.isEmpty(readLine)) {
                    return new a(sb.toString());
                }
                sb.append(readLine).append('\n');
            }
        } catch (IOException e2) {
            AbstractC5496a.a("ProxyCache", "GetRequest#read, error message is : " + e2.toString());
            return null;
        }
    }

    public final String toString() {
        return o.a(new StringBuilder("GetRequest{rangeOffset=").append(this.b).append(", partial=").append(this.c).append(", uri='"), this.f13224a, "'}");
    }
}
