package org.jose4j.jwt;

/* loaded from: classes18.dex */
public class IntDate {
    private long getHighSpeedVideoFpsRangesFor;

    private IntDate(long j) {
        this.getHighSpeedVideoFpsRangesFor = j;
    }

    public static org.jose4j.jwt.IntDate now() {
        return fromMillis(java.lang.System.currentTimeMillis());
    }

    public static org.jose4j.jwt.IntDate fromSeconds(long j) {
        return new org.jose4j.jwt.IntDate(j);
    }

    public static org.jose4j.jwt.IntDate fromMillis(long j) {
        return fromSeconds(j / 1000);
    }

    public void addSeconds(long j) {
        this.getHighSpeedVideoFpsRangesFor += j;
    }

    public void addSeconds(int i) {
        addSeconds(i);
    }

    public long getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public long getValueInMillis() {
        return getValue() * 1000;
    }

    public boolean before(org.jose4j.jwt.IntDate intDate) {
        return this.getHighSpeedVideoFpsRangesFor < intDate.getValue();
    }

    public boolean after(org.jose4j.jwt.IntDate intDate) {
        return this.getHighSpeedVideoFpsRangesFor > intDate.getValue();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IntDate{");
        sb.append(getValue());
        sb.append(" --> ");
        sb.append(new java.util.Date(getValueInMillis()));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof org.jose4j.jwt.IntDate) && this.getHighSpeedVideoFpsRangesFor == ((org.jose4j.jwt.IntDate) obj).getHighSpeedVideoFpsRangesFor;
        }
        return true;
    }

    public int hashCode() {
        long j = this.getHighSpeedVideoFpsRangesFor;
        return (int) (j ^ (j >>> 32));
    }
}
