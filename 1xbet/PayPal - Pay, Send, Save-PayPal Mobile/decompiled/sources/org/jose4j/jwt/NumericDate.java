package org.jose4j.jwt;

/* loaded from: classes18.dex */
public class NumericDate {
    private long getHighSpeedVideoFpsRangesFor;

    private NumericDate(long j) {
        setValue(j);
    }

    public static org.jose4j.jwt.NumericDate now() {
        return fromMilliseconds(java.lang.System.currentTimeMillis());
    }

    public static org.jose4j.jwt.NumericDate fromSeconds(long j) {
        return new org.jose4j.jwt.NumericDate(j);
    }

    public static org.jose4j.jwt.NumericDate fromMilliseconds(long j) {
        return fromSeconds(j / 1000);
    }

    public void addSeconds(long j) {
        setValue(org.jose4j.lang.Maths.add(this.getHighSpeedVideoFpsRangesFor, j));
    }

    public long getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setValue(long j) {
        this.getHighSpeedVideoFpsRangesFor = j;
    }

    public long getValueInMillis() {
        long value = getValue();
        long j = 1000 * value;
        if (getHighSpeedVideoSizes()) {
            return j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("converting ");
        sb.append(value);
        sb.append(" seconds to milliseconds (x1000) resulted in long integer overflow (");
        sb.append(j);
        sb.append(")");
        throw new java.lang.ArithmeticException(sb.toString());
    }

    private boolean getHighSpeedVideoSizes() {
        long value = getValue();
        long j = 1000 * value;
        if (value > 0 && j < value) {
            return false;
        }
        if (value >= 0 || j <= value) {
            return value != 0 || j == 0;
        }
        return false;
    }

    public boolean isBefore(org.jose4j.jwt.NumericDate numericDate) {
        return this.getHighSpeedVideoFpsRangesFor < numericDate.getValue();
    }

    public boolean isOnOrAfter(org.jose4j.jwt.NumericDate numericDate) {
        return !isBefore(numericDate);
    }

    public boolean isAfter(org.jose4j.jwt.NumericDate numericDate) {
        return this.getHighSpeedVideoFpsRangesFor > numericDate.getValue();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NumericDate{");
        sb.append(getValue());
        if (getHighSpeedVideoSizes()) {
            java.text.DateFormat dateTimeInstance = java.text.DateFormat.getDateTimeInstance(2, 1);
            java.util.Date date = new java.util.Date(getValueInMillis());
            sb.append(" -> ");
            sb.append(dateTimeInstance.format(date));
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof org.jose4j.jwt.NumericDate) && this.getHighSpeedVideoFpsRangesFor == ((org.jose4j.jwt.NumericDate) obj).getHighSpeedVideoFpsRangesFor;
        }
        return true;
    }

    public int hashCode() {
        long j = this.getHighSpeedVideoFpsRangesFor;
        return (int) (j ^ (j >>> 32));
    }
}
