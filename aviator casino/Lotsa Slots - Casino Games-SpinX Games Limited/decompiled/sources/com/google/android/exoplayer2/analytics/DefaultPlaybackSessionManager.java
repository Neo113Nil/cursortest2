package com.google.android.exoplayer2.analytics;

/* loaded from: classes3.dex */
public final class DefaultPlaybackSessionManager implements com.google.android.exoplayer2.analytics.PlaybackSessionManager {
    public static final com.google.common.base.Supplier<java.lang.String> DEFAULT_SESSION_ID_GENERATOR = new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Supplier
        public final java.lang.Object get() {
            java.lang.String generateDefaultSessionId;
            generateDefaultSessionId = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.generateDefaultSessionId();
            return generateDefaultSessionId;
        }
    };
    private static final java.util.Random RANDOM = new java.util.Random();
    private static final int SESSION_ID_LENGTH = 12;
    private java.lang.String currentSessionId;
    private com.google.android.exoplayer2.Timeline currentTimeline;
    private com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener listener;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private final com.google.common.base.Supplier<java.lang.String> sessionIdGenerator;
    private final java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor> sessions;
    private final com.google.android.exoplayer2.Timeline.Window window;

    public DefaultPlaybackSessionManager() {
        this(DEFAULT_SESSION_ID_GENERATOR);
    }

    public DefaultPlaybackSessionManager(com.google.common.base.Supplier<java.lang.String> supplier) {
        this.sessionIdGenerator = supplier;
        this.window = new com.google.android.exoplayer2.Timeline.Window();
        this.period = new com.google.android.exoplayer2.Timeline.Period();
        this.sessions = new java.util.HashMap<>();
        this.currentTimeline = com.google.android.exoplayer2.Timeline.EMPTY;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public void setListener(com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener listener) {
        this.listener = listener;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized java.lang.String getSessionForMediaPeriodId(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return getOrAddSession(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId).sessionId;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = this.sessions.get(str);
        if (sessionDescriptor == null) {
            return false;
        }
        sessionDescriptor.maybeSetWindowSequenceNumber(eventTime.windowIndex, eventTime.mediaPeriodId);
        return sessionDescriptor.belongsToSession(eventTime.windowIndex, eventTime.mediaPeriodId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r25.mediaPeriodId.windowSequenceNumber < r2.windowSequenceNumber) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2 A[Catch: all -> 0x0119, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x0014, B:12:0x0024, B:14:0x002e, B:19:0x0037, B:22:0x0045, B:24:0x0051, B:25:0x0057, B:27:0x005c, B:29:0x0064, B:31:0x0081, B:32:0x00dc, B:34:0x00e2, B:35:0x00f8, B:37:0x0104, B:39:0x010a), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void updateSessions(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor;
        com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime2;
        com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor2;
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.listener);
        if (eventTime.timeline.isEmpty()) {
            return;
        }
        com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor3 = this.sessions.get(this.currentSessionId);
        if (eventTime.mediaPeriodId != null && sessionDescriptor3 != null) {
            if (sessionDescriptor3.windowSequenceNumber == -1) {
                if (sessionDescriptor3.windowIndex != eventTime.windowIndex) {
                    return;
                }
            }
        }
        com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        if (this.currentSessionId == null) {
            this.currentSessionId = orAddSession.sessionId;
        }
        if (eventTime.mediaPeriodId != null && eventTime.mediaPeriodId.isAd()) {
            com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(eventTime.mediaPeriodId.periodUid, eventTime.mediaPeriodId.windowSequenceNumber, eventTime.mediaPeriodId.adGroupIndex);
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor orAddSession2 = getOrAddSession(eventTime.windowIndex, mediaPeriodId);
            if (!orAddSession2.isCreated) {
                orAddSession2.isCreated = true;
                eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period);
                sessionDescriptor = orAddSession;
                this.listener.onSessionCreated(new com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime(eventTime.realtimeMs, eventTime.timeline, eventTime.windowIndex, mediaPeriodId, java.lang.Math.max(0L, com.google.android.exoplayer2.util.Util.usToMs(this.period.getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex)) + this.period.getPositionInWindowMs()), eventTime.currentTimeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs), orAddSession2.sessionId);
                if (sessionDescriptor.isCreated) {
                    sessionDescriptor2 = sessionDescriptor;
                    sessionDescriptor2.isCreated = true;
                    eventTime2 = eventTime;
                    this.listener.onSessionCreated(eventTime2, sessionDescriptor2.sessionId);
                } else {
                    eventTime2 = eventTime;
                    sessionDescriptor2 = sessionDescriptor;
                }
                if (sessionDescriptor2.sessionId.equals(this.currentSessionId) && !sessionDescriptor2.isActive) {
                    sessionDescriptor2.isActive = true;
                    this.listener.onSessionActive(eventTime2, sessionDescriptor2.sessionId);
                }
            }
        }
        sessionDescriptor = orAddSession;
        if (sessionDescriptor.isCreated) {
        }
        if (sessionDescriptor2.sessionId.equals(this.currentSessionId)) {
            sessionDescriptor2.isActive = true;
            this.listener.onSessionActive(eventTime2, sessionDescriptor2.sessionId);
        }
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.listener);
        com.google.android.exoplayer2.Timeline timeline = this.currentTimeline;
        this.currentTimeline = eventTime.timeline;
        java.util.Iterator<com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor next = it.next();
            if (!next.tryResolvingToNewTimeline(timeline, this.currentTimeline) || next.isFinishedAtEventTime(eventTime)) {
                it.remove();
                if (next.isCreated) {
                    if (next.sessionId.equals(this.currentSessionId)) {
                        this.currentSessionId = null;
                    }
                    this.listener.onSessionFinished(eventTime, next.sessionId, false);
                }
            }
        }
        updateCurrentSession(eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.listener);
        boolean z = i == 0;
        java.util.Iterator<com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor next = it.next();
            if (next.isFinishedAtEventTime(eventTime)) {
                it.remove();
                if (next.isCreated) {
                    boolean equals = next.sessionId.equals(this.currentSessionId);
                    boolean z2 = z && equals && next.isActive;
                    if (equals) {
                        this.currentSessionId = null;
                    }
                    this.listener.onSessionFinished(eventTime, next.sessionId, z2);
                }
            }
        }
        updateCurrentSession(eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized java.lang.String getActiveSessionId() {
        return this.currentSessionId;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void finishAllSessions(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener listener;
        this.currentSessionId = null;
        java.util.Iterator<com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor next = it.next();
            it.remove();
            if (next.isCreated && (listener = this.listener) != null) {
                listener.onSessionFinished(eventTime, next.sessionId, false);
            }
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private void updateCurrentSession(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        if (eventTime.timeline.isEmpty()) {
            this.currentSessionId = null;
            return;
        }
        com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = this.sessions.get(this.currentSessionId);
        com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        this.currentSessionId = orAddSession.sessionId;
        updateSessions(eventTime);
        if (eventTime.mediaPeriodId == null || !eventTime.mediaPeriodId.isAd()) {
            return;
        }
        if (sessionDescriptor != null && sessionDescriptor.windowSequenceNumber == eventTime.mediaPeriodId.windowSequenceNumber && sessionDescriptor.adMediaPeriodId != null && sessionDescriptor.adMediaPeriodId.adGroupIndex == eventTime.mediaPeriodId.adGroupIndex && sessionDescriptor.adMediaPeriodId.adIndexInAdGroup == eventTime.mediaPeriodId.adIndexInAdGroup) {
            return;
        }
        this.listener.onAdPlaybackStarted(eventTime, getOrAddSession(eventTime.windowIndex, new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(eventTime.mediaPeriodId.periodUid, eventTime.mediaPeriodId.windowSequenceNumber)).sessionId, orAddSession.sessionId);
    }

    private com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor getOrAddSession(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = null;
        long j = Long.MAX_VALUE;
        for (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor2 : this.sessions.values()) {
            sessionDescriptor2.maybeSetWindowSequenceNumber(i, mediaPeriodId);
            if (sessionDescriptor2.belongsToSession(i, mediaPeriodId)) {
                long j2 = sessionDescriptor2.windowSequenceNumber;
                if (j2 == -1 || j2 < j) {
                    sessionDescriptor = sessionDescriptor2;
                    j = j2;
                } else if (j2 == j && ((com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) com.google.android.exoplayer2.util.Util.castNonNull(sessionDescriptor)).adMediaPeriodId != null && sessionDescriptor2.adMediaPeriodId != null) {
                    sessionDescriptor = sessionDescriptor2;
                }
            }
        }
        if (sessionDescriptor != null) {
            return sessionDescriptor;
        }
        java.lang.String str = this.sessionIdGenerator.get();
        com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor3 = new com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor(str, i, mediaPeriodId);
        this.sessions.put(str, sessionDescriptor3);
        return sessionDescriptor3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 10);
    }

    private final class SessionDescriptor {
        private com.google.android.exoplayer2.source.MediaSource.MediaPeriodId adMediaPeriodId;
        private boolean isActive;
        private boolean isCreated;
        private final java.lang.String sessionId;
        private int windowIndex;
        private long windowSequenceNumber;

        public SessionDescriptor(java.lang.String str, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
            this.sessionId = str;
            this.windowIndex = i;
            this.windowSequenceNumber = mediaPeriodId == null ? -1L : mediaPeriodId.windowSequenceNumber;
            if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
                return;
            }
            this.adMediaPeriodId = mediaPeriodId;
        }

        public boolean tryResolvingToNewTimeline(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.Timeline timeline2) {
            int resolveWindowIndexToNewTimeline = resolveWindowIndexToNewTimeline(timeline, timeline2, this.windowIndex);
            this.windowIndex = resolveWindowIndexToNewTimeline;
            if (resolveWindowIndexToNewTimeline == -1) {
                return false;
            }
            com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = this.adMediaPeriodId;
            return mediaPeriodId == null || timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) != -1;
        }

        public boolean belongsToSession(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
            return mediaPeriodId == null ? i == this.windowIndex : this.adMediaPeriodId == null ? !mediaPeriodId.isAd() && mediaPeriodId.windowSequenceNumber == this.windowSequenceNumber : mediaPeriodId.windowSequenceNumber == this.adMediaPeriodId.windowSequenceNumber && mediaPeriodId.adGroupIndex == this.adMediaPeriodId.adGroupIndex && mediaPeriodId.adIndexInAdGroup == this.adMediaPeriodId.adIndexInAdGroup;
        }

        public void maybeSetWindowSequenceNumber(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
            if (this.windowSequenceNumber == -1 && i == this.windowIndex && mediaPeriodId != null) {
                this.windowSequenceNumber = mediaPeriodId.windowSequenceNumber;
            }
        }

        public boolean isFinishedAtEventTime(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
            if (eventTime.mediaPeriodId == null) {
                return this.windowIndex != eventTime.windowIndex;
            }
            if (this.windowSequenceNumber == -1) {
                return false;
            }
            if (eventTime.mediaPeriodId.windowSequenceNumber > this.windowSequenceNumber) {
                return true;
            }
            if (this.adMediaPeriodId == null) {
                return false;
            }
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid);
            int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(this.adMediaPeriodId.periodUid);
            if (eventTime.mediaPeriodId.windowSequenceNumber < this.adMediaPeriodId.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (!eventTime.mediaPeriodId.isAd()) {
                return eventTime.mediaPeriodId.nextAdGroupIndex == -1 || eventTime.mediaPeriodId.nextAdGroupIndex > this.adMediaPeriodId.adGroupIndex;
            }
            int i = eventTime.mediaPeriodId.adGroupIndex;
            int i2 = eventTime.mediaPeriodId.adIndexInAdGroup;
            if (i <= this.adMediaPeriodId.adGroupIndex) {
                return i == this.adMediaPeriodId.adGroupIndex && i2 > this.adMediaPeriodId.adIndexInAdGroup;
            }
            return true;
        }

        private int resolveWindowIndexToNewTimeline(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.Timeline timeline2, int i) {
            if (i < timeline.getWindowCount()) {
                timeline.getWindow(i, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.this.window);
                for (int i2 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.this.window.firstPeriodIndex; i2 <= com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.this.window.lastPeriodIndex; i2++) {
                    int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i2));
                    if (indexOfPeriod != -1) {
                        return timeline2.getPeriod(indexOfPeriod, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.this.period).windowIndex;
                    }
                }
                return -1;
            }
            if (i < timeline2.getWindowCount()) {
                return i;
            }
            return -1;
        }
    }
}
