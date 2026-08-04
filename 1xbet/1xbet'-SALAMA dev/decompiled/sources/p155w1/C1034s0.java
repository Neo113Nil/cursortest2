package p155w1;

import com.google.android.gms.common.internal.w;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: w1.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1034s0 extends AbstractC1056z1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f17858A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1009l0 f17859B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final HashSet f17860C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final w f17861D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f17862z;

    public C1034s0() {
        super(AbstractC1044v1.a(EnumC1038t1.f17873e), false);
        this.f17860C = new HashSet();
        Y y4 = H2.a().f17404b;
        B b7 = new B(this, 6);
        this.f17862z = "FlurryStreamingWithFramesDataSender";
        this.f17858A = "AnalyticsData_";
        y4.i(b7);
        w wVar = new w(22);
        wVar.f11335b = "StreamingMain";
        wVar.f11336c = new LinkedHashMap();
        this.f17861D = wVar;
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
