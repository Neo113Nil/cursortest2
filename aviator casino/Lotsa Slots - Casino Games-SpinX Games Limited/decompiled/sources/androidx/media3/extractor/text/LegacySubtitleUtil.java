package androidx.media3.extractor.text;

/* loaded from: classes2.dex */
public class LegacySubtitleUtil {
    private LegacySubtitleUtil() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[LOOP:0: B:11:0x0041->B:13:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void toCuesWithTiming(androidx.media3.extractor.text.Subtitle subtitle, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        boolean z;
        int i;
        int startIndex = getStartIndex(subtitle, outputOptions.startTimeUs);
        if (outputOptions.startTimeUs != -9223372036854775807L && startIndex < subtitle.getEventTimeCount()) {
            java.util.List<androidx.media3.common.text.Cue> cues = subtitle.getCues(outputOptions.startTimeUs);
            long eventTime = subtitle.getEventTime(startIndex);
            if (!cues.isEmpty() && outputOptions.startTimeUs < eventTime) {
                consumer.accept(new androidx.media3.extractor.text.CuesWithTiming(cues, outputOptions.startTimeUs, eventTime - outputOptions.startTimeUs));
                z = true;
                for (i = startIndex; i < subtitle.getEventTimeCount(); i++) {
                    outputSubtitleEvent(subtitle, i, consumer);
                }
                if (outputOptions.outputAllCues) {
                    return;
                }
                if (z) {
                    startIndex--;
                }
                for (int i2 = 0; i2 < startIndex; i2++) {
                    outputSubtitleEvent(subtitle, i2, consumer);
                }
                if (z) {
                    consumer.accept(new androidx.media3.extractor.text.CuesWithTiming(subtitle.getCues(outputOptions.startTimeUs), subtitle.getEventTime(startIndex), outputOptions.startTimeUs - subtitle.getEventTime(startIndex)));
                    return;
                }
                return;
            }
        }
        z = false;
        while (i < subtitle.getEventTimeCount()) {
        }
        if (outputOptions.outputAllCues) {
        }
    }

    private static int getStartIndex(androidx.media3.extractor.text.Subtitle subtitle, long j) {
        if (j == -9223372036854775807L) {
            return 0;
        }
        int nextEventTimeIndex = subtitle.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == -1) {
            nextEventTimeIndex = subtitle.getEventTimeCount();
        }
        return (nextEventTimeIndex <= 0 || subtitle.getEventTime(nextEventTimeIndex + (-1)) != j) ? nextEventTimeIndex : nextEventTimeIndex - 1;
    }

    private static void outputSubtitleEvent(androidx.media3.extractor.text.Subtitle subtitle, int i, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        long eventTime = subtitle.getEventTime(i);
        java.util.List<androidx.media3.common.text.Cue> cues = subtitle.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i == subtitle.getEventTimeCount() - 1) {
            throw new java.lang.IllegalStateException();
        }
        long eventTime2 = subtitle.getEventTime(i + 1) - subtitle.getEventTime(i);
        if (eventTime2 > 0) {
            consumer.accept(new androidx.media3.extractor.text.CuesWithTiming(cues, eventTime, eventTime2));
        }
    }
}
