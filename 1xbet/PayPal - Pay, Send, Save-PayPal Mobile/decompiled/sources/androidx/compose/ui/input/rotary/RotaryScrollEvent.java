package androidx.compose.ui.input.rotary;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "", "verticalScrollPixels", "horizontalScrollPixels", "", "uptimeMillis", "", "inputDeviceId", "<init>", "(FFJI)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getVerticalScrollPixels", "()F", "getHorizontalScrollPixels", "J", "getUptimeMillis", "()J", com.visa.cbp.getEncExpo.warmup, "getInputDeviceId"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RotaryScrollEvent {
    public static final int $stable = 0;
    private final float horizontalScrollPixels;
    private final int inputDeviceId;
    private final long uptimeMillis;
    private final float verticalScrollPixels;

    public RotaryScrollEvent(float f, float f2, long j, int i) {
        this.verticalScrollPixels = f;
        this.horizontalScrollPixels = f2;
        this.uptimeMillis = j;
        this.inputDeviceId = i;
    }

    public final float getVerticalScrollPixels() {
        return this.verticalScrollPixels;
    }

    public final float getHorizontalScrollPixels() {
        return this.horizontalScrollPixels;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final int getInputDeviceId() {
        return this.inputDeviceId;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.compose.ui.input.rotary.RotaryScrollEvent)) {
            return false;
        }
        androidx.compose.ui.input.rotary.RotaryScrollEvent rotaryScrollEvent = (androidx.compose.ui.input.rotary.RotaryScrollEvent) other;
        return rotaryScrollEvent.verticalScrollPixels == this.verticalScrollPixels && rotaryScrollEvent.horizontalScrollPixels == this.horizontalScrollPixels && rotaryScrollEvent.uptimeMillis == this.uptimeMillis && rotaryScrollEvent.inputDeviceId == this.inputDeviceId;
    }

    public final int hashCode() {
        int hashCode = java.lang.Float.hashCode(this.verticalScrollPixels);
        return (((((hashCode * 31) + java.lang.Float.hashCode(this.horizontalScrollPixels)) * 31) + java.lang.Long.hashCode(this.uptimeMillis)) * 31) + java.lang.Integer.hashCode(this.inputDeviceId);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.verticalScrollPixels);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.horizontalScrollPixels);
        sb.append(",uptimeMillis=");
        sb.append(this.uptimeMillis);
        sb.append(",deviceId=");
        sb.append(this.inputDeviceId);
        sb.append(')');
        return sb.toString();
    }
}
