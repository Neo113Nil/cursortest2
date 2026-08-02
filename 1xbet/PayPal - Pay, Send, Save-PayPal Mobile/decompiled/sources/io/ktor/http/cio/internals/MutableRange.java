package io.ktor.http.cio.internals;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e"}, d2 = {"Lio/ktor/http/cio/internals/MutableRange;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStart", "()I", "setStart", "(I)V", "getEnd", "setEnd"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MutableRange {
    private int end;
    private int start;

    public MutableRange(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final void setEnd(int i) {
        this.end = i;
    }

    public final void setStart(int i) {
        this.start = i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MutableRange(start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(')');
        return sb.toString();
    }
}
