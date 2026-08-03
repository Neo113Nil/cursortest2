package com.google.android.exoplayer2.text;

/* loaded from: classes3.dex */
public interface TextOutput {

    /* renamed from: com.google.android.exoplayer2.text.TextOutput$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @java.lang.Deprecated
        public static void $default$onCues(com.google.android.exoplayer2.text.TextOutput _this, java.util.List list) {
        }
    }

    void onCues(com.google.android.exoplayer2.text.CueGroup cueGroup);

    @java.lang.Deprecated
    void onCues(java.util.List<com.google.android.exoplayer2.text.Cue> list);
}
