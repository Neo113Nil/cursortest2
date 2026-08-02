package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0083@\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u0011\u0092\u0001\u00020\u0007"}, d2 = {"Landroidx/compose/material3/ListItemType;", "", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion", "lines"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
final class ListItemType implements java.lang.Comparable<androidx.compose.material3.ListItemType> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.ListItemType.Companion INSTANCE = new androidx.compose.material3.ListItemType.Companion(null);
    private static final int OneLine = 1;
    private static final int TwoLine = 2;
    private static final int ThreeLine = 3;

    public static final boolean getHighSpeedVideoSizes(int i, int i2) {
        return i == i2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(androidx.compose.material3.ListItemType listItemType) {
        return kotlin.jvm.internal.Intrinsics.compare(this.Camera2StreamConfigurationMap, listItemType.Camera2StreamConfigurationMap);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0080\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f"}, d2 = {"Landroidx/compose/material3/ListItemType$Companion;", "", "<init>", "()V", "", "hasOverline", "hasSupporting", "isSupportingMultiline", "Landroidx/compose/material3/ListItemType;", "invoke-Z-LSjz4$material3", "(ZZZ)I", "invoke", "OneLine", com.visa.cbp.getEncExpo.warmup, "getOneLine-AlXitO8", "()I", "TwoLine", "getTwoLine-AlXitO8", "ThreeLine", "getThreeLine-AlXitO8"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getOneLine-AlXitO8, reason: not valid java name */
        public final int m3437getOneLineAlXitO8() {
            return androidx.compose.material3.ListItemType.OneLine;
        }

        /* renamed from: getTwoLine-AlXitO8, reason: not valid java name */
        public final int m3439getTwoLineAlXitO8() {
            return androidx.compose.material3.ListItemType.TwoLine;
        }

        /* renamed from: getThreeLine-AlXitO8, reason: not valid java name */
        public final int m3438getThreeLineAlXitO8() {
            return androidx.compose.material3.ListItemType.ThreeLine;
        }

        /* renamed from: invoke-Z-LSjz4$material3, reason: not valid java name */
        public final int m3440invokeZLSjz4$material3(boolean hasOverline, boolean hasSupporting, boolean isSupportingMultiline) {
            if ((hasOverline && hasSupporting) || isSupportingMultiline) {
                return m3438getThreeLineAlXitO8();
            }
            if (hasOverline || hasSupporting) {
                return m3439getTwoLineAlXitO8();
            }
            return m3437getOneLineAlXitO8();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean equals(java.lang.Object p0) {
        return (p0 instanceof androidx.compose.material3.ListItemType) && this.Camera2StreamConfigurationMap == ((androidx.compose.material3.ListItemType) p0).Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.Camera2StreamConfigurationMap);
    }

    public final java.lang.String toString() {
        int i = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ListItemType(Camera2StreamConfigurationMap=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }
}
