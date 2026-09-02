package com.goldenboot.saga.zone;

import java.util.Objects;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class AnchorMutex {
    public static final AnchorMutex growPayload = new AnchorMutex("", 0, 0, 1.0f, 0, 0, 0, 1.0f);
    public final ActivityMutator evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public interface ActivityMutator {
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class BounceHandler implements ActivityMutator {
        public final int clipOrigin;
        public final int detachStream;
        public final String evictLayout;
        public final int flushSample;
        public final float growPayload;
        public final int injectMetric;
        public final int releaseHeader;
        public final float updateTimer;

        public BounceHandler(String str, int i, int i2, float f, int i3, int i4, int i5, float f2) {
            this.evictLayout = str;
            this.injectMetric = i;
            this.detachStream = i2;
            this.growPayload = f;
            this.releaseHeader = i3;
            this.clipOrigin = i4;
            this.flushSample = i5;
            this.updateTimer = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BounceHandler)) {
                return false;
            }
            BounceHandler bounceHandler = (BounceHandler) obj;
            return Objects.equals(this.evictLayout, bounceHandler.evictLayout) && this.injectMetric == bounceHandler.injectMetric && this.detachStream == bounceHandler.detachStream && this.growPayload == bounceHandler.growPayload && this.releaseHeader == bounceHandler.releaseHeader && this.clipOrigin == bounceHandler.clipOrigin && this.flushSample == bounceHandler.flushSample && this.updateTimer == bounceHandler.updateTimer;
        }

        public int hashCode() {
            return Objects.hash(this.evictLayout, Integer.valueOf(this.injectMetric), Integer.valueOf(this.detachStream), Float.valueOf(this.growPayload), Integer.valueOf(this.releaseHeader), Integer.valueOf(this.clipOrigin), Integer.valueOf(this.flushSample), Float.valueOf(this.updateTimer));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DisplayShapeCompat{ spec=");
            String str = this.evictLayout;
            sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
            sb.append(" displayWidth=");
            sb.append(this.injectMetric);
            sb.append(" displayHeight=");
            sb.append(this.detachStream);
            sb.append(" physicalPixelDisplaySizeRatio=");
            sb.append(this.growPayload);
            sb.append(" rotation=");
            sb.append(this.releaseHeader);
            sb.append(" offsetX=");
            sb.append(this.clipOrigin);
            sb.append(" offsetY=");
            sb.append(this.flushSample);
            sb.append(" scale=");
            sb.append(this.updateTimer);
            sb.append("}");
            return sb.toString();
        }
    }

    public AnchorMutex(String str, int i, int i2, float f, int i3, int i4, int i5, float f2) {
        this.evictLayout = new BounceHandler(str, i, i2, f, i3, i4, i5, f2);
    }

    public static AnchorMutex evictLayout(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        return new AnchorMutex(growPayload(i, i2, z, i3, i4, i5, i6), i, i2, 1.0f, 0, 0, 0, 1.0f);
    }

    public static String growPayload(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            return "M0," + i8 + " A" + i7 + "," + i8 + " 0 1,1 " + i + "," + i8 + " A" + i7 + "," + i8 + " 0 1,1 0," + i8 + " Z";
        }
        StringBuilder sb = new StringBuilder();
        int min = Math.min(i / 2, i2 / 2);
        int min2 = Math.min(min, i3);
        int min3 = Math.min(min, i4);
        int min4 = Math.min(min, i5);
        int min5 = Math.min(min, i6);
        sb.append("M ");
        sb.append(min2);
        sb.append(",0");
        sb.append(" L ");
        sb.append(i - min3);
        sb.append(",0");
        if (min3 > 0) {
            sb.append(" A ");
            sb.append(min3);
            sb.append(",");
            sb.append(min3);
            sb.append(" 0 0,1 ");
            sb.append(i);
            sb.append(",");
            sb.append(min3);
        }
        sb.append(" L ");
        sb.append(i);
        sb.append(",");
        sb.append(i2 - min4);
        if (min4 > 0) {
            sb.append(" A ");
            sb.append(min4);
            sb.append(",");
            sb.append(min4);
            sb.append(" 0 0,1 ");
            sb.append(i - min4);
            sb.append(",");
            sb.append(i2);
        }
        sb.append(" L ");
        sb.append(min5);
        sb.append(",");
        sb.append(i2);
        if (min5 > 0) {
            sb.append(" A ");
            sb.append(min5);
            sb.append(",");
            sb.append(min5);
            sb.append(" 0 0,1 ");
            sb.append(0);
            sb.append(",");
            sb.append(i2 - min5);
        }
        if (min2 > 0) {
            sb.append(" L ");
            sb.append(0);
            sb.append(",");
            sb.append(min2);
            sb.append(" A ");
            sb.append(min2);
            sb.append(",");
            sb.append(min2);
            sb.append(" 0 0,1 ");
            sb.append(min2);
            sb.append(",");
            sb.append(0);
        }
        sb.append(" Z");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnchorMutex) {
            return Objects.equals(this.evictLayout, ((AnchorMutex) obj).evictLayout);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.evictLayout);
    }

    public String toString() {
        return this.evictLayout.toString();
    }
}
