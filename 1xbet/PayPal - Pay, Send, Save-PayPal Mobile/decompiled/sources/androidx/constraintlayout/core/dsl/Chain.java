package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public abstract class Chain extends androidx.constraintlayout.core.dsl.Helper {
    protected static final java.util.Map<androidx.constraintlayout.core.dsl.Chain.Style, java.lang.String> styleMap;
    private androidx.constraintlayout.core.dsl.Chain.Style getHighSpeedVideoFpsRanges;
    protected java.util.ArrayList<androidx.constraintlayout.core.dsl.Ref> references;

    public enum Style {
        PACKED,
        SPREAD,
        SPREAD_INSIDE
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        styleMap = hashMap;
        hashMap.put(androidx.constraintlayout.core.dsl.Chain.Style.SPREAD, "'spread'");
        hashMap.put(androidx.constraintlayout.core.dsl.Chain.Style.SPREAD_INSIDE, "'spread_inside'");
        hashMap.put(androidx.constraintlayout.core.dsl.Chain.Style.PACKED, "'packed'");
    }

    public Chain(java.lang.String str) {
        super(str, new androidx.constraintlayout.core.dsl.Helper.HelperType(""));
        this.getHighSpeedVideoFpsRanges = null;
        this.references = new java.util.ArrayList<>();
    }

    public androidx.constraintlayout.core.dsl.Chain.Style getStyle() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setStyle(androidx.constraintlayout.core.dsl.Chain.Style style) {
        this.getHighSpeedVideoFpsRanges = style;
        this.configMap.put(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, styleMap.get(style));
    }

    public java.lang.String referencesToString() {
        if (this.references.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.util.Iterator<androidx.constraintlayout.core.dsl.Ref> it = this.references.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public androidx.constraintlayout.core.dsl.Chain addReference(androidx.constraintlayout.core.dsl.Ref ref) {
        this.references.add(ref);
        this.configMap.put("contains", referencesToString());
        return this;
    }

    public androidx.constraintlayout.core.dsl.Chain addReference(java.lang.String str) {
        return addReference(androidx.constraintlayout.core.dsl.Ref.parseStringToRef(str));
    }

    public class Anchor {
        androidx.constraintlayout.core.dsl.Constraint.Anchor getHighResolutionOutputSizeshNQ4ISI = null;
        int getHighSpeedVideoFpsRanges = Integer.MIN_VALUE;
        int getHighSpeedVideoFpsRangesFor;
        final androidx.constraintlayout.core.dsl.Constraint.Side getHighSpeedVideoSizes;

        Anchor(androidx.constraintlayout.core.dsl.Constraint.Side side) {
            this.getHighSpeedVideoSizes = side;
        }

        public java.lang.String getId() {
            return androidx.constraintlayout.core.dsl.Chain.this.f2719name;
        }

        public void build(java.lang.StringBuilder sb) {
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                sb.append(this.getHighSpeedVideoSizes.toString().toLowerCase());
                sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                sb.append(this);
                sb.append(",\n");
            }
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                sb.append("'");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getId());
                sb.append("','");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.toString().toLowerCase());
                sb.append("'");
            }
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                sb.append(",");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
            }
            if (this.getHighSpeedVideoFpsRanges != Integer.MIN_VALUE) {
                if (this.getHighSpeedVideoFpsRangesFor == 0) {
                    sb.append(",0,");
                    sb.append(this.getHighSpeedVideoFpsRanges);
                } else {
                    sb.append(",");
                    sb.append(this.getHighSpeedVideoFpsRanges);
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
