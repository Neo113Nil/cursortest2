package com.google.android.exoplayer2.source.dash.offline;

import androidx.annotation.Nullable;
import androidx.credentials.ExecutorC0293h;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.offline.DownloadException;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.dash.BaseUrlExclusionList;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.DashUtil;
import com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes4.dex */
public final class DashDownloader extends SegmentDownloader<DashManifest> {
    private final BaseUrlExclusionList baseUrlExclusionList;

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new ExecutorC0293h());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void addSegmentsForAdaptationSet(DataSource dataSource, AdaptationSet adaptationSet, long j, long j2, boolean z, ArrayList<SegmentDownloader.Segment> arrayList) throws IOException, InterruptedException {
        DashSegmentIndex segmentIndex;
        DashDownloader dashDownloader = this;
        int i = 0;
        while (i < adaptationSet.representations.size()) {
            Representation representation = adaptationSet.representations.get(i);
            try {
            } catch (IOException e) {
                e = e;
            }
            try {
                segmentIndex = dashDownloader.getSegmentIndex(dataSource, adaptationSet.type, representation, z);
            } catch (IOException e2) {
                e = e2;
                if (z) {
                    throw e;
                }
                i++;
                dashDownloader = this;
            }
            if (segmentIndex != null) {
                long segmentCount = segmentIndex.getSegmentCount(j2);
                if (segmentCount == -1) {
                    throw new DownloadException("Unbounded segment index");
                }
                String str = ((BaseUrl) Util.castNonNull(dashDownloader.baseUrlExclusionList.selectBaseUrl(representation.baseUrls))).url;
                RangedUri initializationUri = representation.getInitializationUri();
                if (initializationUri != null) {
                    arrayList.add(dashDownloader.createSegment(representation, str, j, initializationUri));
                }
                RangedUri indexUri = representation.getIndexUri();
                if (indexUri != null) {
                    arrayList.add(createSegment(representation, str, j, indexUri));
                }
                long firstSegmentNum = segmentIndex.getFirstSegmentNum();
                long j3 = (segmentCount + firstSegmentNum) - 1;
                while (firstSegmentNum <= j3) {
                    arrayList.add(createSegment(representation, str, segmentIndex.getTimeUs(firstSegmentNum) + j, segmentIndex.getSegmentUrl(firstSegmentNum)));
                    firstSegmentNum++;
                }
                i++;
                dashDownloader = this;
            } else {
                try {
                    throw new DownloadException("Missing segment index");
                } catch (IOException e3) {
                    e = e3;
                    if (z) {
                    }
                }
            }
        }
    }

    private SegmentDownloader.Segment createSegment(Representation representation, String str, long j, RangedUri rangedUri) {
        return new SegmentDownloader.Segment(j, DashUtil.buildDataSpec(representation, str, rangedUri, 0, j0.i));
    }

    @Nullable
    private DashSegmentIndex getSegmentIndex(final DataSource dataSource, final int i, final Representation representation, boolean z) throws IOException, InterruptedException {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex chunkIndex = (ChunkIndex) execute(new RunnableFutureTask<ChunkIndex, IOException>() { // from class: com.google.android.exoplayer2.source.dash.offline.DashDownloader.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.exoplayer2.util.RunnableFutureTask
            public ChunkIndex doWork() throws IOException {
                return DashUtil.loadChunkIndex(dataSource, i, representation);
            }
        }, z);
        if (chunkIndex == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(chunkIndex, representation.presentationTimeOffsetUs);
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, new DashManifestParser(), factory, executor, 20000L);
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, DashManifest dashManifest, boolean z) throws IOException, InterruptedException {
        ArrayList<SegmentDownloader.Segment> arrayList = new ArrayList<>();
        for (int i = 0; i < dashManifest.getPeriodCount(); i++) {
            Period period = dashManifest.getPeriod(i);
            long msToUs = Util.msToUs(period.startMs);
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            List<AdaptationSet> list = period.adaptationSets;
            for (int i2 = 0; i2 < list.size(); i2++) {
                addSegmentsForAdaptationSet(dataSource, list.get(i2), msToUs, periodDurationUs, z, arrayList);
            }
        }
        return arrayList;
    }

    @Deprecated
    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor, long j) {
        super(mediaItem, parser, factory, executor, j);
        this.baseUrlExclusionList = new BaseUrlExclusionList();
    }
}
