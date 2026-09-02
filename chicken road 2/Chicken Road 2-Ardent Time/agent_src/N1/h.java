package N1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1159a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f1160b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f1161c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f1162d;

    public h(I1.t tVar, int i2, java.lang.String str) {
        this.f1161c = tVar;
        this.f1160b = i2;
        this.f1162d = str;
    }

    public int a() {
        int contentSensitivity;
        if (android.os.Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        P0.AbstractActivityC0047e abstractActivityC0047e = (P0.AbstractActivityC0047e) this.f1161c;
        int i2 = this.f1160b;
        android.view.View findViewById = abstractActivityC0047e.findViewById(i2);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new java.lang.IllegalArgumentException("FlutterView with ID " + i2 + "not found");
    }

    public void b(int i2) {
        int contentSensitivity;
        if (android.os.Build.VERSION.SDK_INT < 35) {
            throw new java.lang.IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        P0.AbstractActivityC0047e abstractActivityC0047e = (P0.AbstractActivityC0047e) this.f1161c;
        int i3 = this.f1160b;
        android.view.View findViewById = abstractActivityC0047e.findViewById(i3);
        if (findViewById == null) {
            throw new java.lang.IllegalArgumentException("FlutterView with ID " + i3 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i2) {
            return;
        }
        findViewById.setContentSensitivity(i2);
        findViewById.invalidate();
    }

    public java.lang.String toString() {
        switch (this.f1159a) {
            case 0:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (((I1.t) this.f1161c) == I1.t.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f1160b);
                sb.append(' ');
                sb.append((java.lang.String) this.f1162d);
                java.lang.String sb2 = sb.toString();
                kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public h(int i2, P0.AbstractActivityC0047e abstractActivityC0047e, Z0.h hVar) {
        this.f1161c = abstractActivityC0047e;
        this.f1160b = i2;
        this.f1162d = hVar;
        hVar.f1903b = this;
    }
}
