package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.common.collect.C0964l;
import com.google.common.collect.G;
import com.google.common.collect.b0;
import com.google.common.collect.d0;
import com.google.common.collect.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
final class CuesWithTimingSubtitle implements Subtitle {
    private static final d0<CuesWithTiming> CUES_BY_START_TIME_ASCENDING;
    private static final String TAG = "CuesWithTimingSubtitle";
    private final G<G<Cue>> eventCues;
    private final long[] eventTimesUs;

    static {
        b0 b0Var = b0.a;
        a aVar = new a();
        b0Var.getClass();
        CUES_BY_START_TIME_ASCENDING = new C0964l(aVar, b0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CuesWithTimingSubtitle(List<CuesWithTiming> list) {
        int i = 0;
        if (list.size() == 1) {
            Iterator<T> it = list.iterator();
            Object next = it.next();
            if (it.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i < 4 && it.hasNext()) {
                    sb.append(", ");
                    sb.append(it.next());
                    i++;
                }
                if (it.hasNext()) {
                    sb.append(", ...");
                }
                sb.append(Typography.greater);
                throw new IllegalArgumentException(sb.toString());
            }
            CuesWithTiming cuesWithTiming = (CuesWithTiming) next;
            long normalizeUnsetStartTimeToZero = normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs);
            if (cuesWithTiming.durationUs == -9223372036854775807L) {
                this.eventCues = G.n(cuesWithTiming.cues);
                this.eventTimesUs = new long[]{normalizeUnsetStartTimeToZero};
                return;
            } else {
                G<Cue> g = cuesWithTiming.cues;
                G.b bVar = G.b;
                this.eventCues = G.o(g, i0.e);
                this.eventTimesUs = new long[]{normalizeUnsetStartTimeToZero, cuesWithTiming.durationUs + normalizeUnsetStartTimeToZero};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.eventTimesUs = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        i0 r = G.r(list, CUES_BY_START_TIME_ASCENDING);
        int i2 = 0;
        while (i < r.d) {
            CuesWithTiming cuesWithTiming2 = (CuesWithTiming) r.get(i);
            long normalizeUnsetStartTimeToZero2 = normalizeUnsetStartTimeToZero(cuesWithTiming2.startTimeUs);
            long j = cuesWithTiming2.durationUs + normalizeUnsetStartTimeToZero2;
            if (i2 != 0) {
                int i3 = i2 - 1;
                long j2 = this.eventTimesUs[i3];
                if (j2 >= normalizeUnsetStartTimeToZero2) {
                    if (j2 == normalizeUnsetStartTimeToZero2 && ((G) arrayList.get(i3)).isEmpty()) {
                        arrayList.set(i3, cuesWithTiming2.cues);
                    } else {
                        Log.w(TAG, "Truncating unsupported overlapping cues.");
                        this.eventTimesUs[i3] = normalizeUnsetStartTimeToZero2;
                        arrayList.set(i3, cuesWithTiming2.cues);
                    }
                    if (cuesWithTiming2.durationUs == -9223372036854775807L) {
                        this.eventTimesUs[i2] = j;
                        arrayList.add(i0.e);
                        i2++;
                    }
                    i++;
                }
            }
            this.eventTimesUs[i2] = normalizeUnsetStartTimeToZero2;
            arrayList.add(cuesWithTiming2.cues);
            i2++;
            if (cuesWithTiming2.durationUs == -9223372036854775807L) {
            }
            i++;
        }
        this.eventCues = G.j(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable lambda$static$0(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs));
    }

    private static long normalizeUnsetStartTimeToZero(long j) {
        if (j == -9223372036854775807L) {
            return 0L;
        }
        return j;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        Assertions.checkArgument(i < this.eventCues.size());
        return this.eventTimesUs[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventCues.size();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int binarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j, false, false);
        if (binarySearchCeil < this.eventCues.size()) {
            return binarySearchCeil;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public G<Cue> getCues(long j) {
        int binarySearchFloor = Util.binarySearchFloor(this.eventTimesUs, j, true, false);
        if (binarySearchFloor != -1) {
            return this.eventCues.get(binarySearchFloor);
        }
        G.b bVar = G.b;
        return i0.e;
    }
}
