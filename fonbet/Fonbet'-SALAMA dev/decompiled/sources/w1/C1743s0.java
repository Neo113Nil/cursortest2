package w1;

import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: w1.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1743s0 extends AbstractC1765z1 {

    /* renamed from: A, reason: collision with root package name */
    public final String f17852A;

    /* renamed from: B, reason: collision with root package name */
    public C1718l0 f17853B;

    /* renamed from: C, reason: collision with root package name */
    public final HashSet f17854C;

    /* renamed from: D, reason: collision with root package name */
    public final com.google.android.gms.common.internal.w f17855D;

    /* renamed from: z, reason: collision with root package name */
    public final String f17856z;

    public C1743s0() {
        super(AbstractC1753v1.a(EnumC1747t1.f17867e), false);
        this.f17854C = new HashSet();
        Y y4 = H2.a().f17398b;
        B b7 = new B(this, 6);
        this.f17856z = "FlurryStreamingWithFramesDataSender";
        this.f17852A = "AnalyticsData_";
        y4.i(b7);
        com.google.android.gms.common.internal.w wVar = new com.google.android.gms.common.internal.w(22);
        wVar.f11335b = "StreamingMain";
        wVar.f11336c = new LinkedHashMap();
        this.f17855D = wVar;
    }

    public static /* synthetic */ String h(String str) {
        if (str != null && str.contains("<body>") && str.contains("</body>")) {
            return str.substring(str.indexOf("<body>") + 6, str.indexOf("</body>"));
        }
        if (str == null) {
            str = "NULL";
        }
        return "Can not parse http error message: ".concat(str);
    }
}
