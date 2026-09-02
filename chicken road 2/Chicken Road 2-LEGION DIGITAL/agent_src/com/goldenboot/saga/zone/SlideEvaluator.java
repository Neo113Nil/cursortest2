package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class SlideEvaluator {
    public final String evictLayout;
    public int growPayload;

    public SlideEvaluator(String str) {
        this.evictLayout = str;
    }

    public static /* synthetic */ void growPayload(SlideEvaluator slideEvaluator, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        slideEvaluator.evictLayout(i);
    }

    public final void applyTask(String str) {
        while (this.growPayload < this.evictLayout.length() && !CachedPropagator.packPackage(str, this.evictLayout.charAt(this.growPayload), false, 2, null)) {
            this.growPayload++;
        }
    }

    public final String clipOrigin() {
        return this.evictLayout;
    }

    public final String connectJob() {
        String str = this.evictLayout;
        String substring = str.substring(this.growPayload, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final char detachStream() {
        return this.evictLayout.charAt(this.growPayload);
    }

    public final String drawField(String str) {
        int i = this.growPayload;
        applyTask(str);
        int i2 = this.growPayload;
        if (i2 <= i) {
            return "";
        }
        String substring = this.evictLayout.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final void evictLayout(int i) {
        this.growPayload += i;
    }

    public final int flushSample() {
        return this.growPayload;
    }

    public final boolean injectMetric() {
        return this.growPayload >= this.evictLayout.length();
    }

    public final Void peekRevision(String str) {
        int min = Math.min(this.growPayload, this.evictLayout.length());
        StringBuilder sb = new StringBuilder();
        sb.append("Error while parsing source information: ");
        sb.append(str);
        sb.append(" at ");
        String substring = this.evictLayout.substring(0, min);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sb.append(substring);
        sb.append('|');
        String substring2 = this.evictLayout.substring(min);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb.append(substring2);
        throw new LegacyHerald(sb.toString());
    }

    public final int popBlueprint(String str) {
        Integer peekRevision = CoreConstructor.peekRevision(drawField(str));
        if (peekRevision != null) {
            return peekRevision.intValue();
        }
        peekRevision("expected int");
        throw new ShadowBroadcaster();
    }

    public final void releaseHeader(char c) {
        if (updateTimer(c)) {
            return;
        }
        peekRevision("expected " + c);
        throw new ShadowBroadcaster();
    }

    public final boolean updateTimer(char c) {
        return this.growPayload < this.evictLayout.length() && this.evictLayout.charAt(this.growPayload) == c;
    }
}
