package androidx.media3.extractor.text;

/* loaded from: classes2.dex */
public interface Subtitle {
    java.util.List<androidx.media3.common.text.Cue> getCues(long j);

    long getEventTime(int i);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j);
}
