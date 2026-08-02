package p000;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: e1 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0158e1 {

    /* JADX INFO: renamed from: g */
    public static final String[] f1889g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h */
    public static final SimpleDateFormat f1890h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a */
    public final String f1891a;

    /* JADX INFO: renamed from: b */
    public final String f1892b;

    /* JADX INFO: renamed from: c */
    public final String f1893c;

    /* JADX INFO: renamed from: d */
    public final Date f1894d;

    /* JADX INFO: renamed from: e */
    public final long f1895e;

    /* JADX INFO: renamed from: f */
    public final long f1896f;

    public C0158e1(String str, String str2, String str3, Date date, long j, long j2) {
        this.f1891a = str;
        this.f1892b = str2;
        this.f1893c = str3;
        this.f1894d = date;
        this.f1895e = j;
        this.f1896f = j2;
    }

    /* JADX INFO: renamed from: b */
    public static void m1345b(HashMap map) throws C0122d1 {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            String str = f1889g[i];
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new C0122d1(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    /* JADX INFO: renamed from: a */
    public final HashMap m1346a() {
        HashMap map = new HashMap();
        map.put("experimentId", this.f1891a);
        map.put("variantId", this.f1892b);
        map.put("triggerEvent", this.f1893c);
        map.put("experimentStartTime", f1890h.format(this.f1894d));
        map.put("triggerTimeoutMillis", Long.toString(this.f1895e));
        map.put("timeToLiveMillis", Long.toString(this.f1896f));
        return map;
    }
}
