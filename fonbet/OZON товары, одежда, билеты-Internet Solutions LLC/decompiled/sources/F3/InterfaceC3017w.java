package F3;

import F3.V;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: F3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3017w extends V {

    /* renamed from: F3.w$a */
    public interface a extends V.a<InterfaceC3017w> {
        void e(InterfaceC3017w interfaceC3017w);
    }

    default List d(ArrayList arrayList) {
        return Collections.EMPTY_LIST;
    }

    void discardBuffer(long j11, boolean z11);

    long getAdjustedSeekPositionUs(long j11, t3.I i11);

    d0 getTrackGroups();

    void maybeThrowPrepareError() throws IOException;

    void prepare(a aVar, long j11);

    long readDiscontinuity();

    long seekToUs(long j11);

    long selectTracks(I3.y[] yVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j11);
}
