package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public final class ConcatenatingMediaSource extends com.google.android.exoplayer2.source.CompositeMediaSource<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> {
    private static final com.google.android.exoplayer2.MediaItem EMPTY_MEDIA_ITEM = new com.google.android.exoplayer2.MediaItem.Builder().setUri(android.net.Uri.EMPTY).build();
    private static final int MSG_ADD = 0;
    private static final int MSG_MOVE = 2;
    private static final int MSG_ON_COMPLETION = 5;
    private static final int MSG_REMOVE = 1;
    private static final int MSG_SET_SHUFFLE_ORDER = 3;
    private static final int MSG_UPDATE_TIMELINE = 4;
    private final java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> enabledMediaSourceHolders;
    private final boolean isAtomic;
    private final java.util.IdentityHashMap<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> mediaSourceByMediaPeriod;
    private final java.util.Map<java.lang.Object, com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> mediaSourceByUid;
    private final java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> mediaSourceHolders;
    private final java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> mediaSourcesPublic;
    private java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable> nextTimelineUpdateOnCompletionActions;
    private final java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable> pendingOnCompletionActions;
    private android.os.Handler playbackThreadHandler;
    private com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder;
    private boolean timelineUpdateScheduled;
    private final boolean useLazyPreparation;

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void enableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
        return false;
    }

    public ConcatenatingMediaSource(com.google.android.exoplayer2.source.MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, com.google.android.exoplayer2.source.MediaSource... mediaSourceArr) {
        this(z, new com.google.android.exoplayer2.source.ShuffleOrder.DefaultShuffleOrder(0), mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder, com.google.android.exoplayer2.source.MediaSource... mediaSourceArr) {
        this(z, false, shuffleOrder, mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, boolean z2, com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder, com.google.android.exoplayer2.source.MediaSource... mediaSourceArr) {
        for (com.google.android.exoplayer2.source.MediaSource mediaSource : mediaSourceArr) {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaSource);
        }
        this.shuffleOrder = shuffleOrder.getLength() > 0 ? shuffleOrder.cloneAndClear() : shuffleOrder;
        this.mediaSourceByMediaPeriod = new java.util.IdentityHashMap<>();
        this.mediaSourceByUid = new java.util.HashMap();
        this.mediaSourcesPublic = new java.util.ArrayList();
        this.mediaSourceHolders = new java.util.ArrayList();
        this.nextTimelineUpdateOnCompletionActions = new java.util.HashSet();
        this.pendingOnCompletionActions = new java.util.HashSet();
        this.enabledMediaSourceHolders = new java.util.HashSet();
        this.isAtomic = z;
        this.useLazyPreparation = z2;
        addMediaSources(java.util.Arrays.asList(mediaSourceArr));
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public synchronized com.google.android.exoplayer2.Timeline getInitialTimeline() {
        com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder;
        if (this.shuffleOrder.getLength() != this.mediaSourcesPublic.size()) {
            shuffleOrder = this.shuffleOrder.cloneAndClear().cloneAndInsert(0, this.mediaSourcesPublic.size());
        } else {
            shuffleOrder = this.shuffleOrder;
        }
        return new com.google.android.exoplayer2.source.ConcatenatingMediaSource.ConcatenatedTimeline(this.mediaSourcesPublic, shuffleOrder, this.isAtomic);
    }

    public synchronized void addMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource);
    }

    public synchronized void addMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource, android.os.Handler handler, java.lang.Runnable runnable) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, handler, runnable);
    }

    public synchronized void addMediaSource(int i, com.google.android.exoplayer2.source.MediaSource mediaSource) {
        addPublicMediaSources(i, java.util.Collections.singletonList(mediaSource), null, null);
    }

    public synchronized void addMediaSource(int i, com.google.android.exoplayer2.source.MediaSource mediaSource, android.os.Handler handler, java.lang.Runnable runnable) {
        addPublicMediaSources(i, java.util.Collections.singletonList(mediaSource), handler, runnable);
    }

    public synchronized void addMediaSources(java.util.Collection<com.google.android.exoplayer2.source.MediaSource> collection) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, null, null);
    }

    public synchronized void addMediaSources(java.util.Collection<com.google.android.exoplayer2.source.MediaSource> collection, android.os.Handler handler, java.lang.Runnable runnable) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, handler, runnable);
    }

    public synchronized void addMediaSources(int i, java.util.Collection<com.google.android.exoplayer2.source.MediaSource> collection) {
        addPublicMediaSources(i, collection, null, null);
    }

    public synchronized void addMediaSources(int i, java.util.Collection<com.google.android.exoplayer2.source.MediaSource> collection, android.os.Handler handler, java.lang.Runnable runnable) {
        addPublicMediaSources(i, collection, handler, runnable);
    }

    public synchronized com.google.android.exoplayer2.source.MediaSource removeMediaSource(int i) {
        com.google.android.exoplayer2.source.MediaSource mediaSource;
        mediaSource = getMediaSource(i);
        removePublicMediaSources(i, i + 1, null, null);
        return mediaSource;
    }

    public synchronized com.google.android.exoplayer2.source.MediaSource removeMediaSource(int i, android.os.Handler handler, java.lang.Runnable runnable) {
        com.google.android.exoplayer2.source.MediaSource mediaSource;
        mediaSource = getMediaSource(i);
        removePublicMediaSources(i, i + 1, handler, runnable);
        return mediaSource;
    }

    public synchronized void removeMediaSourceRange(int i, int i2) {
        removePublicMediaSources(i, i2, null, null);
    }

    public synchronized void removeMediaSourceRange(int i, int i2, android.os.Handler handler, java.lang.Runnable runnable) {
        removePublicMediaSources(i, i2, handler, runnable);
    }

    public synchronized void moveMediaSource(int i, int i2) {
        movePublicMediaSource(i, i2, null, null);
    }

    public synchronized void moveMediaSource(int i, int i2, android.os.Handler handler, java.lang.Runnable runnable) {
        movePublicMediaSource(i, i2, handler, runnable);
    }

    public synchronized void clear() {
        removeMediaSourceRange(0, getSize());
    }

    public synchronized void clear(android.os.Handler handler, java.lang.Runnable runnable) {
        removeMediaSourceRange(0, getSize(), handler, runnable);
    }

    public synchronized int getSize() {
        return this.mediaSourcesPublic.size();
    }

    public synchronized com.google.android.exoplayer2.source.MediaSource getMediaSource(int i) {
        return this.mediaSourcesPublic.get(i).mediaSource;
    }

    public synchronized void setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder) {
        setPublicShuffleOrder(shuffleOrder, null, null);
    }

    public synchronized void setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder, android.os.Handler handler, java.lang.Runnable runnable) {
        setPublicShuffleOrder(shuffleOrder, handler, runnable);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
        return EMPTY_MEDIA_ITEM;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected synchronized void prepareSourceInternal(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new android.os.Handler(new android.os.Handler.Callback() { // from class: com.google.android.exoplayer2.source.ConcatenatingMediaSource$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                boolean handleMessage;
                handleMessage = com.google.android.exoplayer2.source.ConcatenatingMediaSource.this.handleMessage(message);
                return handleMessage;
            }
        });
        if (this.mediaSourcesPublic.isEmpty()) {
            updateTimelineAndScheduleOnCompletionActions();
        } else {
            this.shuffleOrder = this.shuffleOrder.cloneAndInsert(0, this.mediaSourcesPublic.size());
            addMediaSourcesInternal(0, this.mediaSourcesPublic);
            scheduleTimelineUpdate();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.upstream.Allocator allocator, long j) {
        java.lang.Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId copyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder = this.mediaSourceByUid.get(mediaSourceHolderUid);
        if (mediaSourceHolder == null) {
            mediaSourceHolder = new com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder(new com.google.android.exoplayer2.source.ConcatenatingMediaSource.FakeMediaSource(), this.useLazyPreparation);
            mediaSourceHolder.isRemoved = true;
            prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        }
        enableMediaSource(mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriodIds.add(copyWithPeriodUid);
        com.google.android.exoplayer2.source.MaskingMediaPeriod createPeriod = mediaSourceHolder.mediaSource.createPeriod(copyWithPeriodUid, allocator, j);
        this.mediaSourceByMediaPeriod.put(createPeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return createPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        mediaSourceHolder.mediaSource.releasePeriod(mediaPeriod);
        mediaSourceHolder.activeMediaPeriodIds.remove(((com.google.android.exoplayer2.source.MaskingMediaPeriod) mediaPeriod).id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(mediaSourceHolder);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void disableInternal() {
        super.disableInternal();
        this.enabledMediaSourceHolders.clear();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected synchronized void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.mediaSourceHolders.clear();
        this.enabledMediaSourceHolders.clear();
        this.mediaSourceByUid.clear();
        this.shuffleOrder = this.shuffleOrder.cloneAndClear();
        android.os.Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
        this.nextTimelineUpdateOnCompletionActions.clear();
        dispatchOnCompletionActions(this.pendingOnCompletionActions);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void m5419x365769cd(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder, com.google.android.exoplayer2.source.MediaSource mediaSource, com.google.android.exoplayer2.Timeline timeline) {
        updateMediaSourceInternal(mediaSourceHolder, timeline);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i = 0; i < mediaSourceHolder.activeMediaPeriodIds.size(); i++) {
            if (mediaSourceHolder.activeMediaPeriodIds.get(i).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(mediaSourceHolder, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder, int i) {
        return i + mediaSourceHolder.firstWindowIndexInChild;
    }

    private void addPublicMediaSources(int i, java.util.Collection<com.google.android.exoplayer2.source.MediaSource> collection, android.os.Handler handler, java.lang.Runnable runnable) {
        com.google.android.exoplayer2.util.Assertions.checkArgument((handler == null) == (runnable == null));
        android.os.Handler handler2 = this.playbackThreadHandler;
        java.util.Iterator<com.google.android.exoplayer2.source.MediaSource> it = collection.iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(it.next());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        java.util.Iterator<com.google.android.exoplayer2.source.MediaSource> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder(it2.next(), this.useLazyPreparation));
        }
        this.mediaSourcesPublic.addAll(i, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData(i, arrayList, createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void removePublicMediaSources(int i, int i2, android.os.Handler handler, java.lang.Runnable runnable) {
        com.google.android.exoplayer2.util.Assertions.checkArgument((handler == null) == (runnable == null));
        android.os.Handler handler2 = this.playbackThreadHandler;
        com.google.android.exoplayer2.util.Util.removeRange(this.mediaSourcesPublic, i, i2);
        if (handler2 != null) {
            handler2.obtainMessage(1, new com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData(i, java.lang.Integer.valueOf(i2), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void movePublicMediaSource(int i, int i2, android.os.Handler handler, java.lang.Runnable runnable) {
        com.google.android.exoplayer2.util.Assertions.checkArgument((handler == null) == (runnable == null));
        android.os.Handler handler2 = this.playbackThreadHandler;
        java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> list = this.mediaSourcesPublic;
        list.add(i2, list.remove(i));
        if (handler2 != null) {
            handler2.obtainMessage(2, new com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData(i, java.lang.Integer.valueOf(i2), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void setPublicShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder, android.os.Handler handler, java.lang.Runnable runnable) {
        com.google.android.exoplayer2.util.Assertions.checkArgument((handler == null) == (runnable == null));
        android.os.Handler handler2 = this.playbackThreadHandler;
        if (handler2 != null) {
            int size = getSize();
            if (shuffleOrder.getLength() != size) {
                shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
            }
            handler2.obtainMessage(3, new com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData(0, shuffleOrder, createOnCompletionAction(handler, runnable))).sendToTarget();
            return;
        }
        if (shuffleOrder.getLength() > 0) {
            shuffleOrder = shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    private com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable createOnCompletionAction(android.os.Handler handler, java.lang.Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable handlerAndRunnable = new com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable(handler, runnable);
        this.pendingOnCompletionActions.add(handlerAndRunnable);
        return handlerAndRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 0) {
            com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData messageData = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData) com.google.android.exoplayer2.util.Util.castNonNull(message.obj);
            this.shuffleOrder = this.shuffleOrder.cloneAndInsert(messageData.index, ((java.util.Collection) messageData.customData).size());
            addMediaSourcesInternal(messageData.index, (java.util.Collection) messageData.customData);
            scheduleTimelineUpdate(messageData.onCompletionAction);
        } else if (i == 1) {
            com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData messageData2 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData) com.google.android.exoplayer2.util.Util.castNonNull(message.obj);
            int i2 = messageData2.index;
            int intValue = ((java.lang.Integer) messageData2.customData).intValue();
            if (i2 == 0 && intValue == this.shuffleOrder.getLength()) {
                this.shuffleOrder = this.shuffleOrder.cloneAndClear();
            } else {
                this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i2, intValue);
            }
            for (int i3 = intValue - 1; i3 >= i2; i3--) {
                removeMediaSourceInternal(i3);
            }
            scheduleTimelineUpdate(messageData2.onCompletionAction);
        } else if (i == 2) {
            com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData messageData3 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData) com.google.android.exoplayer2.util.Util.castNonNull(message.obj);
            com.google.android.exoplayer2.source.ShuffleOrder cloneAndRemove = this.shuffleOrder.cloneAndRemove(messageData3.index, messageData3.index + 1);
            this.shuffleOrder = cloneAndRemove;
            this.shuffleOrder = cloneAndRemove.cloneAndInsert(((java.lang.Integer) messageData3.customData).intValue(), 1);
            moveMediaSourceInternal(messageData3.index, ((java.lang.Integer) messageData3.customData).intValue());
            scheduleTimelineUpdate(messageData3.onCompletionAction);
        } else if (i == 3) {
            com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData messageData4 = (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData) com.google.android.exoplayer2.util.Util.castNonNull(message.obj);
            this.shuffleOrder = (com.google.android.exoplayer2.source.ShuffleOrder) messageData4.customData;
            scheduleTimelineUpdate(messageData4.onCompletionAction);
        } else if (i == 4) {
            updateTimelineAndScheduleOnCompletionActions();
        } else if (i == 5) {
            dispatchOnCompletionActions((java.util.Set) com.google.android.exoplayer2.util.Util.castNonNull(message.obj));
        } else {
            throw new java.lang.IllegalStateException();
        }
        return true;
    }

    private void scheduleTimelineUpdate() {
        scheduleTimelineUpdate(null);
    }

    private void scheduleTimelineUpdate(com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable handlerAndRunnable) {
        if (!this.timelineUpdateScheduled) {
            getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(4).sendToTarget();
            this.timelineUpdateScheduled = true;
        }
        if (handlerAndRunnable != null) {
            this.nextTimelineUpdateOnCompletionActions.add(handlerAndRunnable);
        }
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
        this.timelineUpdateScheduled = false;
        java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable> set = this.nextTimelineUpdateOnCompletionActions;
        this.nextTimelineUpdateOnCompletionActions = new java.util.HashSet();
        refreshSourceInfo(new com.google.android.exoplayer2.source.ConcatenatingMediaSource.ConcatenatedTimeline(this.mediaSourceHolders, this.shuffleOrder, this.isAtomic));
        getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(5, set).sendToTarget();
    }

    private android.os.Handler getPlaybackThreadHandlerOnPlaybackThread() {
        return (android.os.Handler) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.playbackThreadHandler);
    }

    private synchronized void dispatchOnCompletionActions(java.util.Set<com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable> set) {
        java.util.Iterator<com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable> it = set.iterator();
        while (it.hasNext()) {
            it.next().dispatch();
        }
        this.pendingOnCompletionActions.removeAll(set);
    }

    private void addMediaSourcesInternal(int i, java.util.Collection<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> collection) {
        java.util.Iterator<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> it = collection.iterator();
        while (it.hasNext()) {
            addMediaSourceInternal(i, it.next());
            i++;
        }
    }

    private void addMediaSourceInternal(int i, com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder) {
        if (i > 0) {
            com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder2 = this.mediaSourceHolders.get(i - 1);
            mediaSourceHolder.reset(i, mediaSourceHolder2.firstWindowIndexInChild + mediaSourceHolder2.mediaSource.getTimeline().getWindowCount());
        } else {
            mediaSourceHolder.reset(i, 0);
        }
        correctOffsets(i, 1, mediaSourceHolder.mediaSource.getTimeline().getWindowCount());
        this.mediaSourceHolders.add(i, mediaSourceHolder);
        this.mediaSourceByUid.put(mediaSourceHolder.uid, mediaSourceHolder);
        prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        if (isEnabled() && this.mediaSourceByMediaPeriod.isEmpty()) {
            this.enabledMediaSourceHolders.add(mediaSourceHolder);
        } else {
            disableChildSource(mediaSourceHolder);
        }
    }

    private void updateMediaSourceInternal(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder, com.google.android.exoplayer2.Timeline timeline) {
        if (mediaSourceHolder.childIndex + 1 < this.mediaSourceHolders.size()) {
            int windowCount = timeline.getWindowCount() - (this.mediaSourceHolders.get(mediaSourceHolder.childIndex + 1).firstWindowIndexInChild - mediaSourceHolder.firstWindowIndexInChild);
            if (windowCount != 0) {
                correctOffsets(mediaSourceHolder.childIndex + 1, 0, windowCount);
            }
        }
        scheduleTimelineUpdate();
    }

    private void removeMediaSourceInternal(int i) {
        com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder remove = this.mediaSourceHolders.remove(i);
        this.mediaSourceByUid.remove(remove.uid);
        correctOffsets(i, -1, -remove.mediaSource.getTimeline().getWindowCount());
        remove.isRemoved = true;
        maybeReleaseChildSource(remove);
    }

    private void moveMediaSourceInternal(int i, int i2) {
        int min = java.lang.Math.min(i, i2);
        int max = java.lang.Math.max(i, i2);
        int i3 = this.mediaSourceHolders.get(min).firstWindowIndexInChild;
        java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> list = this.mediaSourceHolders;
        list.add(i2, list.remove(i));
        while (min <= max) {
            com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(min);
            mediaSourceHolder.childIndex = min;
            mediaSourceHolder.firstWindowIndexInChild = i3;
            i3 += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
            min++;
        }
    }

    private void correctOffsets(int i, int i2, int i3) {
        while (i < this.mediaSourceHolders.size()) {
            com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i);
            mediaSourceHolder.childIndex += i2;
            mediaSourceHolder.firstWindowIndexInChild += i3;
            i++;
        }
    }

    private void maybeReleaseChildSource(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.isRemoved && mediaSourceHolder.activeMediaPeriodIds.isEmpty()) {
            this.enabledMediaSourceHolders.remove(mediaSourceHolder);
            releaseChildSource(mediaSourceHolder);
        }
    }

    private void enableMediaSource(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder) {
        this.enabledMediaSourceHolders.add(mediaSourceHolder);
        enableChildSource(mediaSourceHolder);
    }

    private void disableUnusedMediaSources() {
        java.util.Iterator<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> it = this.enabledMediaSourceHolders.iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder next = it.next();
            if (next.activeMediaPeriodIds.isEmpty()) {
                disableChildSource(next);
                it.remove();
            }
        }
    }

    private static java.lang.Object getMediaSourceHolderUid(java.lang.Object obj) {
        return com.google.android.exoplayer2.source.ConcatenatingMediaSource.ConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static java.lang.Object getChildPeriodUid(java.lang.Object obj) {
        return com.google.android.exoplayer2.source.ConcatenatingMediaSource.ConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static java.lang.Object getPeriodUid(com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder, java.lang.Object obj) {
        return com.google.android.exoplayer2.source.ConcatenatingMediaSource.ConcatenatedTimeline.getConcatenatedUid(mediaSourceHolder.uid, obj);
    }

    static final class MediaSourceHolder {
        public int childIndex;
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final com.google.android.exoplayer2.source.MaskingMediaSource mediaSource;
        public final java.util.List<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> activeMediaPeriodIds = new java.util.ArrayList();
        public final java.lang.Object uid = new java.lang.Object();

        public MediaSourceHolder(com.google.android.exoplayer2.source.MediaSource mediaSource, boolean z) {
            this.mediaSource = new com.google.android.exoplayer2.source.MaskingMediaSource(mediaSource, z);
        }

        public void reset(int i, int i2) {
            this.childIndex = i;
            this.firstWindowIndexInChild = i2;
            this.isRemoved = false;
            this.activeMediaPeriodIds.clear();
        }
    }

    private static final class MessageData<T> {
        public final T customData;
        public final int index;
        public final com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable onCompletionAction;

        public MessageData(int i, T t, com.google.android.exoplayer2.source.ConcatenatingMediaSource.HandlerAndRunnable handlerAndRunnable) {
            this.index = i;
            this.customData = t;
            this.onCompletionAction = handlerAndRunnable;
        }
    }

    private static final class ConcatenatedTimeline extends com.google.android.exoplayer2.AbstractConcatenatedTimeline {
        private final java.util.HashMap<java.lang.Object, java.lang.Integer> childIndexByUid;
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final com.google.android.exoplayer2.Timeline[] timelines;
        private final java.lang.Object[] uids;
        private final int windowCount;

        public ConcatenatedTimeline(java.util.Collection<com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder> collection, com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder, boolean z) {
            super(z, shuffleOrder);
            int size = collection.size();
            this.firstPeriodInChildIndices = new int[size];
            this.firstWindowInChildIndices = new int[size];
            this.timelines = new com.google.android.exoplayer2.Timeline[size];
            this.uids = new java.lang.Object[size];
            this.childIndexByUid = new java.util.HashMap<>();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder : collection) {
                this.timelines[i3] = mediaSourceHolder.mediaSource.getTimeline();
                this.firstWindowInChildIndices[i3] = i;
                this.firstPeriodInChildIndices[i3] = i2;
                i += this.timelines[i3].getWindowCount();
                i2 += this.timelines[i3].getPeriodCount();
                this.uids[i3] = mediaSourceHolder.uid;
                this.childIndexByUid.put(this.uids[i3], java.lang.Integer.valueOf(i3));
                i3++;
            }
            this.windowCount = i;
            this.periodCount = i2;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getChildIndexByPeriodIndex(int i) {
            return com.google.android.exoplayer2.util.Util.binarySearchFloor(this.firstPeriodInChildIndices, i + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getChildIndexByWindowIndex(int i) {
            return com.google.android.exoplayer2.util.Util.binarySearchFloor(this.firstWindowInChildIndices, i + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getChildIndexByChildUid(java.lang.Object obj) {
            java.lang.Integer num = this.childIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected com.google.android.exoplayer2.Timeline getTimelineByChildIndex(int i) {
            return this.timelines[i];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getFirstPeriodIndexByChildIndex(int i) {
            return this.firstPeriodInChildIndices[i];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getFirstWindowIndexByChildIndex(int i) {
            return this.firstWindowInChildIndices[i];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected java.lang.Object getChildUidByChildIndex(int i) {
            return this.uids[i];
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return this.windowCount;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.periodCount;
        }
    }

    private static final class FakeMediaSource extends com.google.android.exoplayer2.source.BaseMediaSource {
        @Override // com.google.android.exoplayer2.source.MediaSource
        public void maybeThrowSourceInfoRefreshError() {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        protected void prepareSourceInternal(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        protected void releaseSourceInternal() {
        }

        private FakeMediaSource() {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public com.google.android.exoplayer2.MediaItem getMediaItem() {
            return com.google.android.exoplayer2.source.ConcatenatingMediaSource.EMPTY_MEDIA_ITEM;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.upstream.Allocator allocator, long j) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static final class HandlerAndRunnable {
        private final android.os.Handler handler;
        private final java.lang.Runnable runnable;

        public HandlerAndRunnable(android.os.Handler handler, java.lang.Runnable runnable) {
            this.handler = handler;
            this.runnable = runnable;
        }

        public void dispatch() {
            this.handler.post(this.runnable);
        }
    }
}
