package I;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.j implements s1.l {

    /* renamed from: e, reason: collision with root package name */
    public static final I.a f642e = new I.a(1);

    @Override // s1.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String valueOf;
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.i.e(entry, "entry");
        java.lang.Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            kotlin.jvm.internal.i.e(bArr, "<this>");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((java.lang.CharSequence) "[");
            int i2 = 0;
            for (byte b2 : bArr) {
                i2++;
                if (i2 > 1) {
                    sb.append((java.lang.CharSequence) ", ");
                }
                sb.append((java.lang.CharSequence) java.lang.String.valueOf((int) b2));
            }
            sb.append((java.lang.CharSequence) "]");
            valueOf = sb.toString();
        } else {
            valueOf = java.lang.String.valueOf(entry.getValue());
        }
        return "  " + ((I.d) entry.getKey()).f648a + " = " + valueOf;
    }
}
