package w1;

import android.os.SystemClock;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class C2 {

    /* renamed from: c, reason: collision with root package name */
    public final D1.a f17316c;

    /* renamed from: a, reason: collision with root package name */
    public final long f17314a = System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final long f17315b = SystemClock.elapsedRealtime();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17317d = true;

    public C2(D1.a aVar) {
        this.f17316c = aVar;
    }

    public abstract D2 a();

    public final String b() {
        try {
            return this.f17316c.a().toString();
        } catch (JSONException e7) {
            e7.printStackTrace();
            return "";
        }
    }
}
