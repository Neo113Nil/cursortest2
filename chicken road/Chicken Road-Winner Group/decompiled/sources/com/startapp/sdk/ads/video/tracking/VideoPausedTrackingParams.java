package com.startapp.sdk.ads.video.tracking;

/* loaded from: classes.dex */
public class VideoPausedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 4019115021800482057L;
    private int pauseNum;
    private PauseOrigin pauseOrigin;

    public enum PauseOrigin {
        INAPP,
        EXTERNAL
    }

    public VideoPausedTrackingParams(String str, int i3, int i4, int i5, PauseOrigin pauseOrigin, String str2) {
        super(i3, i4, str, str2);
        this.pauseNum = i5;
        this.pauseOrigin = pauseOrigin;
    }

    @Override // com.startapp.sdk.ads.video.tracking.VideoTrackingParams, com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        sb.append("&po=" + this.pauseOrigin.toString());
        sb.append("&pn=" + this.pauseNum);
        sb.append(h());
        return b(sb.toString());
    }
}
