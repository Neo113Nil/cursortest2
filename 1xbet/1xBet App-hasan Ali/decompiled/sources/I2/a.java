package I2;

import a.AbstractC0444a;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import h0.C1991e;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a implements Drawable.Callback {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2597k;

    /* renamed from: l, reason: collision with root package name */
    public Object f2598l;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f2597k) {
            case 0:
                l.f("d", drawable);
                b bVar = (b) this.f2598l;
                bVar.f2600p.setValue(Integer.valueOf(((Number) bVar.f2600p.getValue()).intValue() + 1));
                Object obj = d.f2604a;
                Drawable drawable2 = bVar.f2599o;
                bVar.f2601q.setValue(new C1991e((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC0444a.d(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                break;
            case 1:
                ((b2.d) this.f2598l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [W3.e, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        switch (this.f2597k) {
            case 0:
                l.f("d", drawable);
                l.f("what", runnable);
                ((Handler) d.f2604a.getValue()).postAtTime(runnable, j5);
                break;
            case 1:
                ((b2.d) this.f2598l).scheduleSelf(runnable, j5);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f2598l;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j5);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [W3.e, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f2597k) {
            case 0:
                l.f("d", drawable);
                l.f("what", runnable);
                ((Handler) d.f2604a.getValue()).removeCallbacks(runnable);
                break;
            case 1:
                ((b2.d) this.f2598l).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f2598l;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a(int i, Object obj) {
        this.f2597k = i;
        this.f2598l = obj;
    }

    private final void a(Drawable drawable) {
    }
}
