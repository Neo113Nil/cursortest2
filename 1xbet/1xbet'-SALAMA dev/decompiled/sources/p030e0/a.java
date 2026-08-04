package p030e0;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12501a = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strValueOf;
        Map.Entry entry = (Map.Entry) obj;
        h.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            h.e(bArr, "<this>");
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
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((e) entry.getKey()).f12508a + " = " + strValueOf;
    }
}
