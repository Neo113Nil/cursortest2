package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public interface TypographyPipe extends BorderEdge {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements TypographyPipe {
        public final TouchRecord evictLayout;

        public ActivityMutator(TouchRecord touchRecord) {
            this.evictLayout = touchRecord;
        }

        @Override // com.goldenboot.saga.zone.TypographyPipe
        public void evictLayout(Throwable th) {
            this.evictLayout.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + ToolbarCycle.evictLayout(this.evictLayout) + '@' + ToolbarCycle.growPayload(this) + ']';
        }
    }

    void evictLayout(Throwable th);
}
