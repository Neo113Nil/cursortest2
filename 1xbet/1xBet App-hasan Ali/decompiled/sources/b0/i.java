package b0;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public static final i f7156l = new i(2);

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        n nVar = (n) obj2;
        if (str.length() == 0) {
            return nVar.toString();
        }
        return str + ", " + nVar;
    }
}
