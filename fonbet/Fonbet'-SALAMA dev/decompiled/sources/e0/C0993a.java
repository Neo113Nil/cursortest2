package e0;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993a extends t6.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0993a f12495a = new C0993a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        t6.h.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            t6.h.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i7 = 0;
            for (byte b7 : bArr) {
                i7++;
                if (i7 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b7));
            }
            sb.append((CharSequence) "]");
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((e) entry.getKey()).f12502a + " = " + valueOf;
    }
}
