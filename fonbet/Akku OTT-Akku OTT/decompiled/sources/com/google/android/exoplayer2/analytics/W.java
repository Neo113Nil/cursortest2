package com.google.android.exoplayer2.analytics;

/* loaded from: classes4.dex */
public final /* synthetic */ class W implements com.google.common.base.s {
    @Override // com.google.common.base.s
    /* renamed from: get */
    public final Object get2() {
        String generateDefaultSessionId;
        generateDefaultSessionId = DefaultPlaybackSessionManager.generateDefaultSessionId();
        return generateDefaultSessionId;
    }
}
