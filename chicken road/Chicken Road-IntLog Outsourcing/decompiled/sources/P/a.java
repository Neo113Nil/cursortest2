package P;

import g4.AbstractC0464i;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class a extends j implements InterfaceC1441l {

    /* renamed from: e, reason: collision with root package name */
    public static final a f2267e = new a(1);

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "entry");
        Object value = entry.getValue();
        return "  " + ((d) entry.getKey()).f2273a + " = " + (value instanceof byte[] ? AbstractC0464i.W((byte[]) value, ", ", "[", "]", null, 56) : String.valueOf(entry.getValue()));
    }
}
