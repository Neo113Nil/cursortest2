package Q3;

import android.graphics.Typeface;
import android.util.LongSparseArray;
import c.AbstractActivityC0531j;
import c.C0519F;
import c.C0525d;
import d0.ViewOnAttachStateChangeListenerC1909d;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5091k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5092l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5093m;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.f5091k = i;
        this.f5092l = obj;
        this.f5093m = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5091k) {
            case 0:
                ((O0.e) this.f5092l).c(Boolean.valueOf(((s) this.f5093m).f17620k));
                break;
            case 1:
                C0519F c0519f = (C0519F) this.f5093m;
                AbstractActivityC0531j abstractActivityC0531j = (AbstractActivityC0531j) this.f5092l;
                abstractActivityC0531j.getClass();
                abstractActivityC0531j.f16854k.a(new C0525d(c0519f, abstractActivityC0531j));
                break;
            case 2:
                N4.b.r((ViewOnAttachStateChangeListenerC1909d) this.f5092l, (LongSparseArray) this.f5093m);
                break;
            default:
                ((M0.e) this.f5092l).k((Typeface) this.f5093m);
                break;
        }
    }
}
