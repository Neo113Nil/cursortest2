package androidx.compose.ui.tooling.data;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fJ\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b \u0010\f"}, d2 = {"Landroidx/compose/ui/tooling/data/SourceLocation;", "", "", "lineNumber", "offset", "length", "", "sourceFile", "packageHash", "<init>", "(IIILjava/lang/String;I)V", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "copy", "(IIILjava/lang/String;I)Landroidx/compose/ui/tooling/data/SourceLocation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getLineNumber", "getOffset", "getLength", "Ljava/lang/String;", "getSourceFile", "getPackageHash"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SourceLocation {
    public static final int $stable = 0;
    private final int length;
    private final int lineNumber;
    private final int offset;
    private final int packageHash;
    private final java.lang.String sourceFile;

    public SourceLocation(int i, int i2, int i3, java.lang.String str, int i4) {
        this.lineNumber = i;
        this.offset = i2;
        this.length = i3;
        this.sourceFile = str;
        this.packageHash = i4;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getLength() {
        return this.length;
    }

    public final java.lang.String getSourceFile() {
        return this.sourceFile;
    }

    public final int getPackageHash() {
        return this.packageHash;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SourceLocation(lineNumber=");
        sb.append(this.lineNumber);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", sourceFile=");
        sb.append(this.sourceFile);
        sb.append(", packageHash=");
        sb.append(this.packageHash);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.lineNumber);
        int hashCode2 = java.lang.Integer.hashCode(this.offset);
        int hashCode3 = java.lang.Integer.hashCode(this.length);
        java.lang.String str = this.sourceFile;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.packageHash);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.tooling.data.SourceLocation)) {
            return false;
        }
        androidx.compose.ui.tooling.data.SourceLocation sourceLocation = (androidx.compose.ui.tooling.data.SourceLocation) other;
        return this.lineNumber == sourceLocation.lineNumber && this.offset == sourceLocation.offset && this.length == sourceLocation.length && kotlin.jvm.internal.Intrinsics.areEqual(this.sourceFile, sourceLocation.sourceFile) && this.packageHash == sourceLocation.packageHash;
    }

    public final androidx.compose.ui.tooling.data.SourceLocation copy(int lineNumber, int offset, int length, java.lang.String sourceFile, int packageHash) {
        return new androidx.compose.ui.tooling.data.SourceLocation(lineNumber, offset, length, sourceFile, packageHash);
    }

    /* renamed from: component5, reason: from getter */
    public final int getPackageHash() {
        return this.packageHash;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSourceFile() {
        return this.sourceFile;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* renamed from: component1, reason: from getter */
    public final int getLineNumber() {
        return this.lineNumber;
    }

    public static /* synthetic */ androidx.compose.ui.tooling.data.SourceLocation copy$default(androidx.compose.ui.tooling.data.SourceLocation sourceLocation, int i, int i2, int i3, java.lang.String str, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = sourceLocation.lineNumber;
        }
        if ((i5 & 2) != 0) {
            i2 = sourceLocation.offset;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = sourceLocation.length;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            str = sourceLocation.sourceFile;
        }
        java.lang.String str2 = str;
        if ((i5 & 16) != 0) {
            i4 = sourceLocation.packageHash;
        }
        return sourceLocation.copy(i, i6, i7, str2, i4);
    }
}
