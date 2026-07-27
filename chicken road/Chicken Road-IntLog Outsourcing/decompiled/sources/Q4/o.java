package Q4;

import java.util.Map;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.j implements InterfaceC1441l {

    /* renamed from: f, reason: collision with root package name */
    public static final o f2549f = new o(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final o f2550g = new o(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i2, int i3) {
        super(i2);
        this.f2551e = i3;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        switch (this.f2551e) {
            case 0:
                N4.a buildSerialDescriptor = (N4.a) obj;
                kotlin.jvm.internal.i.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                N4.a.a(buildSerialDescriptor, "JsonPrimitive", new q(n.f2542f));
                N4.a.a(buildSerialDescriptor, "JsonNull", new q(n.f2543g));
                N4.a.a(buildSerialDescriptor, "JsonLiteral", new q(n.f2544h));
                N4.a.a(buildSerialDescriptor, "JsonObject", new q(n.f2545i));
                N4.a.a(buildSerialDescriptor, "JsonArray", new q(n.f2546j));
                return f4.v.f5689a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.i.e(entry, "<name for destructuring parameter 0>");
                String str = (String) entry.getKey();
                l lVar = (l) entry.getValue();
                StringBuilder sb = new StringBuilder();
                R4.v.a(sb, str);
                sb.append(':');
                sb.append(lVar);
                String sb2 = sb.toString();
                kotlin.jvm.internal.i.d(sb2, "toString(...)");
                return sb2;
        }
    }
}
