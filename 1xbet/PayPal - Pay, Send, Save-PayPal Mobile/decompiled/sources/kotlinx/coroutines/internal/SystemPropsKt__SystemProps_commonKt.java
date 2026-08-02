package kotlinx.coroutines.internal;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0004\u0010\t\u001a3\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\n2\b\b\u0002\u0010\b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0004\u0010\u000b\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\f"}, d2 = {"", "p0", "", "p1", "systemProp", "(Ljava/lang/String;Z)Z", "", "p2", "p3", "(Ljava/lang/String;III)I", "", "(Ljava/lang/String;JJJ)J", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* loaded from: classes5.dex */
public final /* synthetic */ class SystemPropsKt__SystemProps_commonKt {
    public static final boolean systemProp(java.lang.String str, boolean z) {
        java.lang.String systemProp = kotlinx.coroutines.internal.SystemPropsKt.systemProp(str);
        return systemProp != null ? java.lang.Boolean.parseBoolean(systemProp) : z;
    }

    public static /* synthetic */ int systemProp$default(java.lang.String str, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return kotlinx.coroutines.internal.SystemPropsKt.systemProp(str, i, i2, i3);
    }

    public static final int systemProp(java.lang.String str, int i, int i2, int i3) {
        return (int) kotlinx.coroutines.internal.SystemPropsKt.systemProp(str, i, i2, i3);
    }

    public static /* synthetic */ long systemProp$default(java.lang.String str, long j, long j2, long j3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return kotlinx.coroutines.internal.SystemPropsKt.systemProp(str, j, j4, j3);
    }

    public static final long systemProp(java.lang.String str, long j, long j2, long j3) {
        java.lang.String systemProp = kotlinx.coroutines.internal.SystemPropsKt.systemProp(str);
        if (systemProp == null) {
            return j;
        }
        java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(systemProp);
        if (longOrNull == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("System property '");
            sb.append(str);
            sb.append("' has unrecognized value '");
            sb.append(systemProp);
            sb.append('\'');
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        long longValue = longOrNull.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' should be in range ");
        sb2.append(j2);
        sb2.append("..");
        sb2.append(j3);
        sb2.append(", but is '");
        sb2.append(longValue);
        sb2.append('\'');
        throw new java.lang.IllegalStateException(sb2.toString().toString());
    }

    public static final java.lang.String systemProp(java.lang.String str, java.lang.String str2) {
        java.lang.String systemProp = kotlinx.coroutines.internal.SystemPropsKt.systemProp(str);
        return systemProp == null ? str2 : systemProp;
    }
}
