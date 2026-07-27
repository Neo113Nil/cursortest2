package sg.bigo.ads.z1;

import com.adjust.sdk.Constants;
import io.ktor.sse.ServerSentEventKt;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f13448a = Pattern.compile("((\\d{1,2})|(100))%");
    public static final Pattern b = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");

    public static int a(String str) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split(ServerSentEventKt.COLON);
        if (split.length != 3) {
            return -1;
        }
        try {
            return (Integer.parseInt(split[1]) * 60000) + (Integer.parseInt(split[0]) * Constants.ONE_HOUR) + ((int) (Float.parseFloat(split[2]) * 1000.0f));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
