package p000;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: z6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0940z6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f9611b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WeakReference f9612c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0164e7 f9613d;

    public C0940z6(C0164e7 c0164e7, int i, int i2, WeakReference weakReference) {
        this.f9613d = c0164e7;
        this.f9610a = i;
        this.f9611b = i2;
        this.f9612c = weakReference;
    }

    /* JADX INFO: renamed from: a */
    public final void m5863a() {
        new Handler(Looper.getMainLooper()).post(new RunnableC0456m3(this));
    }

    /* JADX INFO: renamed from: b */
    public final void m5864b(Typeface typeface) {
        int i = this.f9610a;
        if (i != -1) {
            typeface = AbstractC0128d7.m1105a(typeface, i, (this.f9611b & 2) != 0);
        }
        C0164e7 c0164e7 = this.f9613d;
        if (c0164e7.f1992m) {
            c0164e7.f1991l = typeface;
            TextView textView = (TextView) this.f9612c.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = c0164e7.f1989j;
                if (zIsAttachedToWindow) {
                    textView.post(new RunnableC0008a7(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }
}
