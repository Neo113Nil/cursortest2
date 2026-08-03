package com.google.android.exoplayer2.text.webvtt;

/* loaded from: classes3.dex */
final class WebvttSubtitle implements com.google.android.exoplayer2.text.Subtitle {
    private final java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCueInfo> cueInfos;
    private final long[] cueTimesUs;
    private final long[] sortedCueTimesUs;

    public WebvttSubtitle(java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCueInfo> list) {
        this.cueInfos = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        this.cueTimesUs = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            com.google.android.exoplayer2.text.webvtt.WebvttCueInfo webvttCueInfo = list.get(i);
            int i2 = i * 2;
            this.cueTimesUs[i2] = webvttCueInfo.startTimeUs;
            this.cueTimesUs[i2 + 1] = webvttCueInfo.endTimeUs;
        }
        long[] jArr = this.cueTimesUs;
        long[] copyOf = java.util.Arrays.copyOf(jArr, jArr.length);
        this.sortedCueTimesUs = copyOf;
        java.util.Arrays.sort(copyOf);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int binarySearchCeil = com.google.android.exoplayer2.util.Util.binarySearchCeil(this.sortedCueTimesUs, j, false, false);
        if (binarySearchCeil < this.sortedCueTimesUs.length) {
            return binarySearchCeil;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.sortedCueTimesUs.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(i >= 0);
        com.google.android.exoplayer2.util.Assertions.checkArgument(i < this.sortedCueTimesUs.length);
        return this.sortedCueTimesUs[i];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public java.util.List<com.google.android.exoplayer2.text.Cue> getCues(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < this.cueInfos.size(); i++) {
            long[] jArr = this.cueTimesUs;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                com.google.android.exoplayer2.text.webvtt.WebvttCueInfo webvttCueInfo = this.cueInfos.get(i);
                if (webvttCueInfo.cue.line == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(webvttCueInfo.cue);
                }
            }
        }
        java.util.Collections.sort(arrayList2, new java.util.Comparator() { // from class: com.google.android.exoplayer2.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int compare;
                compare = java.lang.Long.compare(((com.google.android.exoplayer2.text.webvtt.WebvttCueInfo) obj).startTimeUs, ((com.google.android.exoplayer2.text.webvtt.WebvttCueInfo) obj2).startTimeUs);
                return compare;
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((com.google.android.exoplayer2.text.webvtt.WebvttCueInfo) arrayList2.get(i3)).cue.buildUpon().setLine((-1) - i3, 1).build());
        }
        return arrayList;
    }
}
