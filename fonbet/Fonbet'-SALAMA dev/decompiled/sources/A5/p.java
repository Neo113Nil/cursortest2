package A5;

import E4.RunnableC0181n;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c5.RunnableC0821b;
import java.util.Objects;
import w1.V0;

/* loaded from: classes2.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f678a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f679b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f680c;

    public /* synthetic */ p(int i7, Object obj, Object obj2) {
        this.f678a = i7;
        this.f680c = obj;
        this.f679b = obj2;
    }

    @Override // A5.r
    public final void error(String str, String str2, Object obj) {
        switch (this.f678a) {
            case 0:
                ((s5.f) this.f679b).a(((s) ((V0) this.f680c).f17563c).f683c.e(str, str2, obj));
                break;
            case 1:
                ((Handler) this.f680c).post(new RunnableC0181n(this, str, str2, obj, 8));
                break;
            default:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
        }
    }

    @Override // A5.r
    public final void notImplemented() {
        switch (this.f678a) {
            case 0:
                ((s5.f) this.f679b).a(null);
                break;
            case 1:
                Handler handler = (Handler) this.f680c;
                p pVar = (p) this.f679b;
                Objects.requireNonNull(pVar);
                handler.post(new RunnableC0821b(pVar, 0));
                break;
        }
    }

    @Override // A5.r
    public final void success(Object obj) {
        switch (this.f678a) {
            case 0:
                ((s5.f) this.f679b).a(((s) ((V0) this.f680c).f17563c).f683c.c(obj));
                break;
            case 1:
                ((Handler) this.f680c).post(new K5.a(9, this, obj));
                break;
            default:
                ((D3.j) this.f680c).f1723b = (byte[]) this.f679b;
                break;
        }
    }

    public p(p pVar) {
        this.f678a = 1;
        this.f680c = new Handler(Looper.getMainLooper());
        this.f679b = pVar;
    }

    private final void a() {
    }
}
