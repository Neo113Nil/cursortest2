package N1;

/* loaded from: classes.dex */
public final class c extends java.lang.ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1148a;

    @Override // java.lang.ThreadLocal
    public final java.lang.Object initialValue() {
        switch (this.f1148a) {
            case 0:
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", java.util.Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(J1.b.f935d);
                return simpleDateFormat;
            default:
                return new java.util.Random();
        }
    }
}
