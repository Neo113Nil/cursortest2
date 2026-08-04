package p155w1;

import D1.a;
import android.os.SystemClock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public abstract class C2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f17322c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17320a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17321b = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17323d = true;

    public C2(a aVar) {
        this.f17322c = aVar;
    }

    public abstract D2 a();

    public final String b() {
        try {
            return this.f17322c.a().toString();
        } catch (JSONException e7) {
            e7.printStackTrace();
            return "";
        }
    }
}
