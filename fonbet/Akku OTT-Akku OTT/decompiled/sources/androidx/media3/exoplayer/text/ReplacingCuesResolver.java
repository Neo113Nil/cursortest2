package androidx.media3.exoplayer.text;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.G;
import com.google.common.collect.N;
import com.google.common.collect.i0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class ReplacingCuesResolver implements CuesResolver {
    private final ArrayList<CuesWithTiming> cuesWithTimingList = new ArrayList<>();

    private int getIndexOfCuesStartingAfter(long j) {
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            if (j < this.cuesWithTimingList.get(i).startTimeUs) {
                return i;
            }
        }
        return this.cuesWithTimingList.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean addCues(CuesWithTiming cuesWithTiming, long j) {
        boolean z;
        int size;
        Assertions.checkArgument(cuesWithTiming.startTimeUs != -9223372036854775807L);
        if (cuesWithTiming.startTimeUs <= j) {
            long j2 = cuesWithTiming.endTimeUs;
            if (j2 == -9223372036854775807L || j < j2) {
                z = true;
                for (size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
                    if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                        this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                        return z;
                    }
                    if (this.cuesWithTimingList.get(size).startTimeUs <= j) {
                        z = false;
                    }
                }
                this.cuesWithTimingList.add(0, cuesWithTiming);
                return z;
            }
        }
        z = false;
        while (size >= 0) {
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter == 0) {
            return;
        }
        long j2 = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1).endTimeUs;
        if (j2 == -9223372036854775807L || j2 >= j) {
            indexOfCuesStartingAfter--;
        }
        this.cuesWithTimingList.subList(0, indexOfCuesStartingAfter).clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public G<Cue> getCuesAtTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter == 0) {
            G.b bVar = G.b;
            return i0.e;
        }
        CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1);
        long j2 = cuesWithTiming.endTimeUs;
        if (j2 == -9223372036854775807L || j < j2) {
            return cuesWithTiming.cues;
        }
        G.b bVar2 = G.b;
        return i0.e;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < this.cuesWithTimingList.get(0).startTimeUs) {
            return this.cuesWithTimingList.get(0).startTimeUs;
        }
        for (int i = 1; i < this.cuesWithTimingList.size(); i++) {
            CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i);
            if (j < cuesWithTiming.startTimeUs) {
                long j2 = this.cuesWithTimingList.get(i - 1).endTimeUs;
                return (j2 == -9223372036854775807L || j2 <= j || j2 >= cuesWithTiming.startTimeUs) ? cuesWithTiming.startTimeUs : j2;
            }
        }
        long j3 = ((CuesWithTiming) N.b(this.cuesWithTimingList)).endTimeUs;
        if (j3 == -9223372036854775807L || j >= j3) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty() || j < this.cuesWithTimingList.get(0).startTimeUs) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < this.cuesWithTimingList.size(); i++) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i - 1);
                long j3 = cuesWithTiming.endTimeUs;
                return (j3 == -9223372036854775807L || j3 > j) ? cuesWithTiming.startTimeUs : j3;
            }
        }
        CuesWithTiming cuesWithTiming2 = (CuesWithTiming) N.b(this.cuesWithTimingList);
        long j4 = cuesWithTiming2.endTimeUs;
        return (j4 == -9223372036854775807L || j < j4) ? cuesWithTiming2.startTimeUs : j4;
    }
}
