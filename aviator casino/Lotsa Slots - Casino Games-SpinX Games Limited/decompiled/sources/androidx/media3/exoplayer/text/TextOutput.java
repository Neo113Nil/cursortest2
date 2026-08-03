package androidx.media3.exoplayer.text;

/* loaded from: classes2.dex */
public interface TextOutput {

    /* renamed from: androidx.media3.exoplayer.text.TextOutput$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @java.lang.Deprecated
        public static void $default$onCues(androidx.media3.exoplayer.text.TextOutput _this, java.util.List list) {
        }
    }

    void onCues(androidx.media3.common.text.CueGroup cueGroup);

    @java.lang.Deprecated
    void onCues(java.util.List<androidx.media3.common.text.Cue> list);
}
