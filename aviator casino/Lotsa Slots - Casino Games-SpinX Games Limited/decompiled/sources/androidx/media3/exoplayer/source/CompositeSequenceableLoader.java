package androidx.media3.exoplayer.source;

/* loaded from: classes2.dex */
public final class CompositeSequenceableLoader implements androidx.media3.exoplayer.source.SequenceableLoader {
    private long lastAudioVideoBufferedPositionUs;
    private final com.google.common.collect.ImmutableList<androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes> loadersWithTrackTypes;

    @java.lang.Deprecated
    public CompositeSequenceableLoader(androidx.media3.exoplayer.source.SequenceableLoader[] sequenceableLoaderArr) {
        this(com.google.common.collect.ImmutableList.copyOf(sequenceableLoaderArr), java.util.Collections.nCopies(sequenceableLoaderArr.length, com.google.common.collect.ImmutableList.of(-1)));
    }

    public CompositeSequenceableLoader(java.util.List<? extends androidx.media3.exoplayer.source.SequenceableLoader> list, java.util.List<java.util.List<java.lang.Integer>> list2) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        androidx.media3.common.util.Assertions.checkArgument(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            builder.add((com.google.common.collect.ImmutableList.Builder) new androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes(list.get(i), list2.get(i)));
        }
        this.loadersWithTrackTypes = builder.build();
        this.lastAudioVideoBufferedPositionUs = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
            androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes sequenceableLoaderWithTrackTypes = this.loadersWithTrackTypes.get(i);
            long bufferedPositionUs = sequenceableLoaderWithTrackTypes.getBufferedPositionUs();
            if ((sequenceableLoaderWithTrackTypes.getTrackTypes().contains(1) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(2) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                j = java.lang.Math.min(j, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j2 = java.lang.Math.min(j2, bufferedPositionUs);
            }
        }
        if (j != Long.MAX_VALUE) {
            this.lastAudioVideoBufferedPositionUs = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.lastAudioVideoBufferedPositionUs;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
            long nextLoadPositionUs = this.loadersWithTrackTypes.get(i).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j = java.lang.Math.min(j, nextLoadPositionUs);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
            this.loadersWithTrackTypes.get(i).reevaluateBuffer(j);
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        boolean z;
        boolean z2 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
                long nextLoadPositionUs2 = this.loadersWithTrackTypes.get(i).getNextLoadPositionUs();
                boolean z3 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= loadingInfo.playbackPositionUs;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z3) {
                    z |= this.loadersWithTrackTypes.get(i).continueLoading(loadingInfo);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
            if (this.loadersWithTrackTypes.get(i).isLoading()) {
                return true;
            }
        }
        return false;
    }

    private static final class SequenceableLoaderWithTrackTypes implements androidx.media3.exoplayer.source.SequenceableLoader {
        private final androidx.media3.exoplayer.source.SequenceableLoader loader;
        private final com.google.common.collect.ImmutableList<java.lang.Integer> trackTypes;

        public SequenceableLoaderWithTrackTypes(androidx.media3.exoplayer.source.SequenceableLoader sequenceableLoader, java.util.List<java.lang.Integer> list) {
            this.loader = sequenceableLoader;
            this.trackTypes = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        }

        public com.google.common.collect.ImmutableList<java.lang.Integer> getTrackTypes() {
            return this.trackTypes;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.loader.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.loader.getNextLoadPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
            return this.loader.continueLoading(loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return this.loader.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
            this.loader.reevaluateBuffer(j);
        }
    }
}
