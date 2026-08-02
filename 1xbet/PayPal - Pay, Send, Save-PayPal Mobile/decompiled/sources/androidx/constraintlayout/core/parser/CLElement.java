package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLElement implements java.lang.Cloneable {
    protected static int sBaseIndent = 2;
    protected static int sMaxLine = 80;
    private final char[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoSizes;
    protected androidx.constraintlayout.core.parser.CLContainer mContainer;
    protected long mStart = -1;
    protected long mEnd = Long.MAX_VALUE;

    public CLElement(char[] cArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = cArr;
    }

    public boolean notStarted() {
        return this.mStart == -1;
    }

    public void setLine(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public int getLine() {
        return this.getHighSpeedVideoSizes;
    }

    public void setStart(long j) {
        this.mStart = j;
    }

    public long getStart() {
        return this.mStart;
    }

    public long getEnd() {
        return this.mEnd;
    }

    public void setEnd(long j) {
        if (this.mEnd == Long.MAX_VALUE) {
            this.mEnd = j;
            if (androidx.constraintlayout.core.parser.CLParser.getHighSpeedVideoSizes) {
                java.io.PrintStream printStream = java.lang.System.out;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("closing ");
                sb.append(hashCode());
                sb.append(" -> ");
                sb.append(this);
                printStream.println(sb.toString());
            }
            androidx.constraintlayout.core.parser.CLContainer cLContainer = this.mContainer;
            if (cLContainer != null) {
                cLContainer.add(this);
            }
        }
    }

    protected void addIndent(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
    }

    public java.lang.String toString() {
        long j = this.mStart;
        long j2 = this.mEnd;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.mStart);
            sb.append("-");
            sb.append(this.mEnd);
            sb.append(")");
            return sb.toString();
        }
        java.lang.String substring = new java.lang.String(this.getHighResolutionOutputSizeshNQ4ISI).substring((int) this.mStart, ((int) this.mEnd) + 1);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(getStrClass());
        sb2.append(" (");
        sb2.append(this.mStart);
        sb2.append(" : ");
        sb2.append(this.mEnd);
        sb2.append(") <<");
        sb2.append(substring);
        sb2.append(">>");
        return sb2.toString();
    }

    protected java.lang.String getStrClass() {
        java.lang.String obj = getClass().toString();
        return obj.substring(obj.lastIndexOf(46) + 1);
    }

    protected java.lang.String getDebugName() {
        if (androidx.constraintlayout.core.parser.CLParser.getHighSpeedVideoSizes) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getStrClass());
            sb.append(" -> ");
            return sb.toString();
        }
        return "";
    }

    public java.lang.String content() {
        java.lang.String str = new java.lang.String(this.getHighResolutionOutputSizeshNQ4ISI);
        if (str.length() <= 0) {
            return "";
        }
        long j = this.mEnd;
        if (j != Long.MAX_VALUE) {
            long j2 = this.mStart;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        int i = (int) this.mStart;
        return str.substring(i, i + 1);
    }

    public boolean hasContent() {
        char[] cArr = this.getHighResolutionOutputSizeshNQ4ISI;
        return cArr != null && cArr.length > 0;
    }

    public boolean isDone() {
        return this.mEnd != Long.MAX_VALUE;
    }

    public void setContainer(androidx.constraintlayout.core.parser.CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    public androidx.constraintlayout.core.parser.CLElement getContainer() {
        return this.mContainer;
    }

    public boolean isStarted() {
        return this.mStart > -1;
    }

    protected java.lang.String toJSON() {
        return "";
    }

    protected java.lang.String toFormattedJSON(int i, int i2) {
        return "";
    }

    public int getInt() {
        if (this instanceof androidx.constraintlayout.core.parser.CLNumber) {
            return ((androidx.constraintlayout.core.parser.CLNumber) this).getInt();
        }
        return 0;
    }

    public float getFloat() {
        if (this instanceof androidx.constraintlayout.core.parser.CLNumber) {
            return ((androidx.constraintlayout.core.parser.CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.constraintlayout.core.parser.CLElement)) {
            return false;
        }
        androidx.constraintlayout.core.parser.CLElement cLElement = (androidx.constraintlayout.core.parser.CLElement) obj;
        if (this.mStart == cLElement.mStart && this.mEnd == cLElement.mEnd && this.getHighSpeedVideoSizes == cLElement.getHighSpeedVideoSizes && java.util.Arrays.equals(this.getHighResolutionOutputSizeshNQ4ISI, cLElement.getHighResolutionOutputSizeshNQ4ISI)) {
            return java.util.Objects.equals(this.mContainer, cLElement.mContainer);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = java.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        long j = this.mStart;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.mEnd;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        androidx.constraintlayout.core.parser.CLContainer cLContainer = this.mContainer;
        return (((((((hashCode * 31) + i) * 31) + i2) * 31) + (cLContainer != null ? cLContainer.hashCode() : 0)) * 31) + this.getHighSpeedVideoSizes;
    }

    @Override // 
    /* renamed from: clone */
    public androidx.constraintlayout.core.parser.CLElement mo9053clone() {
        try {
            return (androidx.constraintlayout.core.parser.CLElement) super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.AssertionError();
        }
    }
}
