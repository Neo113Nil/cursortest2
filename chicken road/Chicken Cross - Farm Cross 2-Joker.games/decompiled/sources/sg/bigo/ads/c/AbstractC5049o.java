package sg.bigo.ads.c;

import io.ktor.util.date.GMTDateParser;
import org.json.JSONObject;

/* renamed from: sg.bigo.ads.c.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5049o {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f12700a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
