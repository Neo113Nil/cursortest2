package G0;

/* loaded from: classes.dex */
public abstract class d {
    public static com.yandex.varioqub.config.VarioqubSettings a(H0.d dVar) {
        java.lang.String str = dVar.f614a;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Client id must not be null");
        }
        com.yandex.varioqub.config.VarioqubSettings.Builder builder = new com.yandex.varioqub.config.VarioqubSettings.Builder(str);
        if (!android.text.TextUtils.isEmpty(dVar.f615b)) {
            builder.withUrl(dVar.f615b);
        }
        java.lang.Long l2 = dVar.f616c;
        if (l2 != null) {
            builder.withThrottleInterval(l2.longValue());
        }
        java.lang.Boolean bool = dVar.f618e;
        if (bool != null && bool.booleanValue()) {
            builder.withLogs();
        }
        java.lang.Boolean bool2 = dVar.f619f;
        if (bool2 != null) {
            builder.withActivateEvent(bool2.booleanValue());
        }
        java.util.Map map = dVar.f617d;
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                builder.withClientFeature((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        return builder.build();
    }
}
