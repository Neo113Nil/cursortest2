package W;

import android.view.View;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.O0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f33025d;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, int i11) {
        this.f33022a = i11;
        this.f33023b = obj;
        this.f33024c = obj2;
        this.f33025d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33022a) {
            case 0:
                x2.i.f("Surface update cancellation should only occur on main thread.", G.q.b());
                ((AtomicBoolean) this.f33023b).set(true);
                ((O0.b) this.f33024c).o((AbstractC5111p) this.f33025d);
                break;
            default:
                io.sentry.android.replay.screenshot.f.d((io.sentry.android.replay.screenshot.f) this.f33023b, (io.sentry.android.replay.viewhierarchy.b) this.f33024c, (View) this.f33025d);
                break;
        }
    }
}
