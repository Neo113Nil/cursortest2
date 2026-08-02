package Gl0;

import B0.C2454a;
import bb.AbstractC5615b;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a extends AbstractC5615b {

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f10282b;

    public a(Boolean bool) {
        super("CheckAppCanShowNotificationEvent");
        this.f10282b = bool;
    }

    @Override // bb.AbstractC5615b
    @NotNull
    public final Map<String, String> b() {
        String str;
        Boolean bool = this.f10282b;
        if (bool == null || (str = bool.toString()) == null) {
            str = "null";
        }
        return C2454a.b("is_app_can_show_notification", str);
    }
}
