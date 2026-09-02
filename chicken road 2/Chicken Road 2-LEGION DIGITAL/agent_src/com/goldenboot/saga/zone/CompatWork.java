package com.goldenboot.saga.zone;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class CompatWork implements Spannable {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public final int detachStream;
        public final TextPaint evictLayout;
        public final TextDirectionHeuristic growPayload;
        public final int injectMetric;
        public final PrecomputedText.Params releaseHeader;

        public ActivityMutator(PrecomputedText.Params params) {
            this.evictLayout = params.getTextPaint();
            this.growPayload = params.getTextDirection();
            this.injectMetric = params.getBreakStrategy();
            this.detachStream = params.getHyphenationFrequency();
            this.releaseHeader = params;
        }

        public TextDirectionHeuristic detachStream() {
            return this.growPayload;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivityMutator)) {
                return false;
            }
            ActivityMutator activityMutator = (ActivityMutator) obj;
            return evictLayout(activityMutator) && this.growPayload == activityMutator.detachStream();
        }

        public boolean evictLayout(ActivityMutator activityMutator) {
            if (this.injectMetric == activityMutator.growPayload() && this.detachStream == activityMutator.injectMetric() && this.evictLayout.getTextSize() == activityMutator.releaseHeader().getTextSize() && this.evictLayout.getTextScaleX() == activityMutator.releaseHeader().getTextScaleX() && this.evictLayout.getTextSkewX() == activityMutator.releaseHeader().getTextSkewX() && this.evictLayout.getLetterSpacing() == activityMutator.releaseHeader().getLetterSpacing() && TextUtils.equals(this.evictLayout.getFontFeatureSettings(), activityMutator.releaseHeader().getFontFeatureSettings()) && this.evictLayout.getFlags() == activityMutator.releaseHeader().getFlags() && this.evictLayout.getTextLocales().equals(activityMutator.releaseHeader().getTextLocales())) {
                return this.evictLayout.getTypeface() == null ? activityMutator.releaseHeader().getTypeface() == null : this.evictLayout.getTypeface().equals(activityMutator.releaseHeader().getTypeface());
            }
            return false;
        }

        public int growPayload() {
            return this.injectMetric;
        }

        public int hashCode() {
            return ModuleAdministrator.growPayload(Float.valueOf(this.evictLayout.getTextSize()), Float.valueOf(this.evictLayout.getTextScaleX()), Float.valueOf(this.evictLayout.getTextSkewX()), Float.valueOf(this.evictLayout.getLetterSpacing()), Integer.valueOf(this.evictLayout.getFlags()), this.evictLayout.getTextLocales(), this.evictLayout.getTypeface(), Boolean.valueOf(this.evictLayout.isElegantTextHeight()), this.growPayload, Integer.valueOf(this.injectMetric), Integer.valueOf(this.detachStream));
        }

        public int injectMetric() {
            return this.detachStream;
        }

        public TextPaint releaseHeader() {
            return this.evictLayout;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.evictLayout.getTextSize());
            sb.append(", textScaleX=" + this.evictLayout.getTextScaleX());
            sb.append(", textSkewX=" + this.evictLayout.getTextSkewX());
            sb.append(", letterSpacing=" + this.evictLayout.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.evictLayout.isElegantTextHeight());
            sb.append(", textLocale=" + this.evictLayout.getTextLocales());
            sb.append(", typeface=" + this.evictLayout.getTypeface());
            sb.append(", variationSettings=" + this.evictLayout.getFontVariationSettings());
            sb.append(", textDir=" + this.growPayload);
            sb.append(", breakStrategy=" + this.injectMetric);
            sb.append(", hyphenationFrequency=" + this.detachStream);
            sb.append("}");
            return sb.toString();
        }
    }
}
