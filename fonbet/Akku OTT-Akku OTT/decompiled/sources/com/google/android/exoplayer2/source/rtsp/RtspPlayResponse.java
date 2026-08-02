package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.G;
import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
final class RtspPlayResponse {
    public final RtspSessionTiming sessionTiming;
    public final int status;
    public final G<RtspTrackTiming> trackTimingList;

    public RtspPlayResponse(int i, RtspSessionTiming rtspSessionTiming, List<RtspTrackTiming> list) {
        this.status = i;
        this.sessionTiming = rtspSessionTiming;
        this.trackTimingList = G.j(list);
    }
}
