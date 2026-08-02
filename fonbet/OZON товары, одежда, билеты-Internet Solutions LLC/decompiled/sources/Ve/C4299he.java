package Ve;

import Ae.C2399j;
import Sc.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import om0.C8754a;
import om0.C8755b;
import spay.sdk.domain.model.MerchantData;

/* renamed from: Ve.he, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4299he implements InterfaceC4765xk {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Vm f31184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f31185b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C8755b f31186c;

    public C4299he(Vm vm, String str, C8755b c8755b) {
        this.f31184a = vm;
        this.f31185b = str;
        this.f31186c = c8755b;
    }

    public final void a(Bi event) {
        Object a11;
        int i11 = 0;
        Intrinsics.checkNotNullParameter(event, "event");
        C8755b c8755b = this.f31186c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C4654tn c4654tn = (C4654tn) this.f31184a;
        MerchantData merchantData = c4654tn.f32130G;
        if (merchantData == null) {
            throw L3.f29386a;
        }
        linkedHashMap.put("OrderNumber", merchantData.getOrderNumber());
        linkedHashMap.put("MerchLogin", merchantData.getMerchantLogin());
        linkedHashMap.put("UserId", this.f31185b);
        linkedHashMap.put("View", event.f28708b.f30165a);
        linkedHashMap.put("Event", event.f28709c.f29711a);
        Integer num = event.f28711e;
        if (num != null) {
            linkedHashMap.put("HttpCode", String.valueOf(num.intValue()));
        }
        String str = event.f28712f;
        if (str != null) {
            linkedHashMap.put("ErrorCode", str);
        }
        String str2 = event.f28713g;
        if (str2 != null) {
            linkedHashMap.put("ParsingError", str2);
        }
        linkedHashMap.put("SDKVersion", "3.1.3");
        String str3 = "";
        Map map = event.f28710d;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                str3 = ((Object) str3) + new Pair(entry.getKey(), entry.getValue()) + "; ";
            }
        }
        if (str3 == null || kotlin.text.h.K(str3)) {
            str3 = null;
        }
        if (str3 != null) {
            linkedHashMap.put("ActionParams", str3);
        }
        String n11 = M1.b.n(c4654tn.k());
        if (n11 != null) {
            linkedHashMap.put("SessionId", n11);
        }
        String n12 = M1.b.n((String) C2399j.b(c4654tn.f32157z).getValue());
        if (n12 != null) {
            linkedHashMap.put("LocalSessionId", n12);
        }
        try {
            r.Companion companion = Sc.r.INSTANCE;
            C8754a c8754a = new C8754a(event.f28707a.a(), C8754a.EnumC1333a.BUSINESS);
            c8754a.a(linkedHashMap);
            c8755b.a(c8754a);
            a11 = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        if (Sc.r.b(a11) != null) {
            Lm0.a.f17149a.i("Exception while sending inner analytics", new Object[0]);
        }
        Bd block = new Bd(i11, event, linkedHashMap);
        Intrinsics.checkNotNullParameter(block, "block");
    }
}
