package p040f2;

import A1.C0045t0;
import D3.f;
import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p146u2.C0956o;
import p146u2.M;

/* JADX INFO: loaded from: classes.dex */
public final class e implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f12829a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // p146u2.M
    public final Object c(Uri uri, C0956o c0956o) throws IOException {
        String line = new BufferedReader(new InputStreamReader(c0956o, f.f1719c)).readLine();
        try {
            Matcher matcher = f12829a.matcher(line);
            if (!matcher.matches()) {
                throw C0045t0.b("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j3 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j3 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e7) {
            throw C0045t0.b(null, e7);
        }
    }
}
