package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "", "", "groupKey", "Landroidx/compose/runtime/tooling/SourceInformation;", "sourceInfo", "groupOffset", "<init>", "(ILandroidx/compose/runtime/tooling/SourceInformation;Ljava/lang/Integer;)V", "component1", "()I", "component2", "()Landroidx/compose/runtime/tooling/SourceInformation;", "component3", "()Ljava/lang/Integer;", "copy", "(ILandroidx/compose/runtime/tooling/SourceInformation;Ljava/lang/Integer;)Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getGroupKey", "Landroidx/compose/runtime/tooling/SourceInformation;", "getSourceInfo", "Ljava/lang/Integer;", "getGroupOffset"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ComposeStackTraceFrame {
    public static final int $stable = 8;
    private final int groupKey;
    private final java.lang.Integer groupOffset;
    private final androidx.compose.runtime.tooling.SourceInformation sourceInfo;

    public ComposeStackTraceFrame(int i, androidx.compose.runtime.tooling.SourceInformation sourceInformation, java.lang.Integer num) {
        this.groupKey = i;
        this.sourceInfo = sourceInformation;
        this.groupOffset = num;
    }

    public final int getGroupKey() {
        return this.groupKey;
    }

    public final androidx.compose.runtime.tooling.SourceInformation getSourceInfo() {
        return this.sourceInfo;
    }

    public final java.lang.Integer getGroupOffset() {
        return this.groupOffset;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ComposeStackTraceFrame(groupKey=");
        sb.append(this.groupKey);
        sb.append(", sourceInfo=");
        sb.append(this.sourceInfo);
        sb.append(", groupOffset=");
        sb.append(this.groupOffset);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.groupKey);
        androidx.compose.runtime.tooling.SourceInformation sourceInformation = this.sourceInfo;
        int hashCode2 = sourceInformation == null ? 0 : sourceInformation.hashCode();
        java.lang.Integer num = this.groupOffset;
        return (((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.runtime.tooling.ComposeStackTraceFrame)) {
            return false;
        }
        androidx.compose.runtime.tooling.ComposeStackTraceFrame composeStackTraceFrame = (androidx.compose.runtime.tooling.ComposeStackTraceFrame) other;
        return this.groupKey == composeStackTraceFrame.groupKey && kotlin.jvm.internal.Intrinsics.areEqual(this.sourceInfo, composeStackTraceFrame.sourceInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.groupOffset, composeStackTraceFrame.groupOffset);
    }

    public final androidx.compose.runtime.tooling.ComposeStackTraceFrame copy(int groupKey, androidx.compose.runtime.tooling.SourceInformation sourceInfo, java.lang.Integer groupOffset) {
        return new androidx.compose.runtime.tooling.ComposeStackTraceFrame(groupKey, sourceInfo, groupOffset);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getGroupOffset() {
        return this.groupOffset;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.runtime.tooling.SourceInformation getSourceInfo() {
        return this.sourceInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final int getGroupKey() {
        return this.groupKey;
    }

    public static /* synthetic */ androidx.compose.runtime.tooling.ComposeStackTraceFrame copy$default(androidx.compose.runtime.tooling.ComposeStackTraceFrame composeStackTraceFrame, int i, androidx.compose.runtime.tooling.SourceInformation sourceInformation, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = composeStackTraceFrame.groupKey;
        }
        if ((i2 & 2) != 0) {
            sourceInformation = composeStackTraceFrame.sourceInfo;
        }
        if ((i2 & 4) != 0) {
            num = composeStackTraceFrame.groupOffset;
        }
        return composeStackTraceFrame.copy(i, sourceInformation, num);
    }
}
