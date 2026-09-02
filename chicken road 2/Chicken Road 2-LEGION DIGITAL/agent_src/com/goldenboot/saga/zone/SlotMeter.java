package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class SlotMeter {
    public static final RowMutex evictLayout = new RowMutex("NO_VALUE");

    public static final Object clipOrigin(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final FragmentMulticaster evictLayout(int i, int i2, RailAssembler railAssembler) {
        if (i < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        if (i > 0 || i2 > 0 || railAssembler == RailAssembler.reduceScope) {
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            return new SurfaceHub(i, i3, railAssembler);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + railAssembler).toString());
    }

    public static final void flushSample(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static /* synthetic */ FragmentMulticaster growPayload(int i, int i2, RailAssembler railAssembler, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            railAssembler = RailAssembler.reduceScope;
        }
        return evictLayout(i, i2, railAssembler);
    }

    public static final CursorKeeper releaseHeader(FlingBootstrapper flingBootstrapper, LongPressGateway longPressGateway, int i, RailAssembler railAssembler) {
        return ((i == 0 || i == -3) && railAssembler == RailAssembler.reduceScope) ? flingBootstrapper : new SwipeCallback(flingBootstrapper, longPressGateway, i, railAssembler);
    }
}
