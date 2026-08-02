package F3;

import j3.AbstractC7252H;

/* renamed from: F3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3012q extends AbstractC7252H {
    protected final AbstractC7252H timeline;

    public AbstractC3012q(AbstractC7252H abstractC7252H) {
        this.timeline = abstractC7252H;
    }

    @Override // j3.AbstractC7252H
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // j3.AbstractC7252H
    public int getFirstWindowIndex(boolean z11) {
        return this.timeline.getFirstWindowIndex(z11);
    }

    @Override // j3.AbstractC7252H
    public int getIndexOfPeriod(Object obj) {
        return this.timeline.getIndexOfPeriod(obj);
    }

    @Override // j3.AbstractC7252H
    public int getLastWindowIndex(boolean z11) {
        return this.timeline.getLastWindowIndex(z11);
    }

    @Override // j3.AbstractC7252H
    public int getNextWindowIndex(int i11, int i12, boolean z11) {
        return this.timeline.getNextWindowIndex(i11, i12, z11);
    }

    @Override // j3.AbstractC7252H
    public AbstractC7252H.b getPeriod(int i11, AbstractC7252H.b bVar, boolean z11) {
        return this.timeline.getPeriod(i11, bVar, z11);
    }

    @Override // j3.AbstractC7252H
    public final AbstractC7252H.b getPeriodByUid(Object obj, AbstractC7252H.b bVar) {
        return super.getPeriodByUid(obj, bVar);
    }

    @Override // j3.AbstractC7252H
    public int getPeriodCount() {
        return this.timeline.getPeriodCount();
    }

    @Override // j3.AbstractC7252H
    public int getPreviousWindowIndex(int i11, int i12, boolean z11) {
        return this.timeline.getPreviousWindowIndex(i11, i12, z11);
    }

    @Override // j3.AbstractC7252H
    public Object getUidOfPeriod(int i11) {
        return this.timeline.getUidOfPeriod(i11);
    }

    @Override // j3.AbstractC7252H
    public AbstractC7252H.c getWindow(int i11, AbstractC7252H.c cVar, long j11) {
        return this.timeline.getWindow(i11, cVar, j11);
    }

    @Override // j3.AbstractC7252H
    public int getWindowCount() {
        return this.timeline.getWindowCount();
    }

    @Override // j3.AbstractC7252H
    public final int hashCode() {
        return super.hashCode();
    }
}
