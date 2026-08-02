package M0;

import android.text.SegmentFinder;
import v3.g;

/* loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f3585a;

    public a(g gVar) {
        this.f3585a = gVar;
    }

    public final int nextEndBoundary(int i) {
        return this.f3585a.g(i);
    }

    public final int nextStartBoundary(int i) {
        return this.f3585a.q(i);
    }

    public final int previousEndBoundary(int i) {
        return this.f3585a.r(i);
    }

    public final int previousStartBoundary(int i) {
        return this.f3585a.f(i);
    }
}
