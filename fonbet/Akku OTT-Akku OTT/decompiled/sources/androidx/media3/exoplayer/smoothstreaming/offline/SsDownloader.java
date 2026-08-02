package androidx.media3.exoplayer.smoothstreaming.offline;

import androidx.credentials.ExecutorC0293h;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifest;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@UnstableApi
/* loaded from: classes3.dex */
public final class SsDownloader extends SegmentDownloader<SsManifest> {

    public static final class Factory extends SegmentDownloader.BaseFactory<SsManifest> {
        public Factory(CacheDataSource.Factory factory) {
            super(factory, new SsManifestParser());
        }

        public Factory setManifestParser(SsManifestParser ssManifestParser) {
            this.manifestParser = ssManifestParser;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public SsDownloader create(MediaItem mediaItem) {
            return new SsDownloader(mediaItem.buildUpon().setUri(Util.fixSmoothStreamingIsmManifestUri(((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)).uri)).build(), this.manifestParser, this.cacheDataSourceFactory, this.executor, this.maxMergedSegmentStartTimeDiffMs, this.startPositionUs, this.durationUs);
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public Factory setDurationUs(long j) {
            super.setDurationUs(j);
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public Factory setExecutor(Executor executor) {
            super.setExecutor(executor);
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public Factory setMaxMergedSegmentStartTimeDiffMs(long j) {
            super.setMaxMergedSegmentStartTimeDiffMs(j);
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public Factory setStartPositionUs(long j) {
            super.setStartPositionUs(j);
            return this;
        }
    }

    @Deprecated
    public SsDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new ExecutorC0293h());
    }

    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, SsManifest ssManifest, boolean z) {
        ArrayList arrayList = new ArrayList();
        long j = z ? 0L : this.startPositionUs;
        long j2 = -9223372036854775807L;
        long j3 = z ? -9223372036854775807L : this.durationUs;
        SsManifest.StreamElement[] streamElementArr = ssManifest.streamElements;
        int length = streamElementArr.length;
        int i = 0;
        while (i < length) {
            SsManifest.StreamElement streamElement = streamElementArr[i];
            int i2 = 0;
            while (i2 < streamElement.formats.length) {
                int i3 = 0;
                while (i3 < streamElement.chunkCount) {
                    long startTimeUs = streamElement.getStartTimeUs(i3);
                    if (streamElement.getChunkDurationUs(i3) + startTimeUs > j) {
                        if (j3 == j2 || startTimeUs < j + j3) {
                            arrayList.add(new SegmentDownloader.Segment(streamElement.getStartTimeUs(i3), new DataSpec(streamElement.buildRequestUri(i2, i3))));
                        }
                    }
                    i3++;
                    j2 = -9223372036854775807L;
                }
                i2++;
                j2 = -9223372036854775807L;
            }
            i++;
            j2 = -9223372036854775807L;
        }
        return arrayList;
    }

    @Deprecated
    public SsDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        super(mediaItem.buildUpon().setUri(Util.fixSmoothStreamingIsmManifestUri(((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)).uri)).build(), new SsManifestParser(), factory, executor, 20000L, 0L, -9223372036854775807L);
    }

    private SsDownloader(MediaItem mediaItem, ParsingLoadable.Parser<SsManifest> parser, CacheDataSource.Factory factory, Executor executor, long j, long j2, long j3) {
        super(mediaItem, parser, factory, executor, j, j2, j3);
    }
}
