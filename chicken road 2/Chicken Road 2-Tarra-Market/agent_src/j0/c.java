package j0;

import android.text.TextUtils;
import com.yandex.varioqub.config.VarioqubSettings;
import java.util.Map;
import k0.C0783c;

/* loaded from: classes.dex */
public abstract class c {
    public static VarioqubSettings a(C0783c c0783c) {
        String str = c0783c.f6064a;
        if (str == null) {
            throw new IllegalArgumentException("Client id must not be null");
        }
        VarioqubSettings.Builder builder = new VarioqubSettings.Builder(str);
        if (!TextUtils.isEmpty(c0783c.f6065b)) {
            builder.withUrl(c0783c.f6065b);
        }
        Long l2 = c0783c.f6066c;
        if (l2 != null) {
            builder.withThrottleInterval(l2.longValue());
        }
        Boolean bool = c0783c.f6068e;
        if (bool != null && bool.booleanValue()) {
            builder.withLogs();
        }
        Boolean bool2 = c0783c.f6069f;
        if (bool2 != null) {
            builder.withActivateEvent(bool2.booleanValue());
        }
        Map map = c0783c.f6067d;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                builder.withClientFeature((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return builder.build();
    }
}
