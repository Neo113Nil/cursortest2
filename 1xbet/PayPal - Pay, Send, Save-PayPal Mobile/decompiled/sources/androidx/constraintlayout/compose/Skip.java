package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u0016\u0092\u0001\u00020\u0012"}, d2 = {"Landroidx/constraintlayout/compose/Skip;", "", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "rows", "columns", "constructor-impl", "(III)Ljava/lang/String;", io.ktor.http.ContentDisposition.Parameters.Size, "(II)Ljava/lang/String;", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "", "toString-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class Skip {
    private final java.lang.String description;

    private /* synthetic */ Skip(java.lang.String str) {
        this.description = str;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m9025constructorimpl(int i, int i2, int i3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(i2);
        sb.append('x');
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m9024constructorimpl(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m9030unboximpl() {
        return this.description;
    }

    public final java.lang.String toString() {
        return m9029toStringimpl(this.description);
    }

    public final int hashCode() {
        return m9028hashCodeimpl(this.description);
    }

    public final boolean equals(java.lang.Object obj) {
        return m9026equalsimpl(this.description, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m9029toStringimpl(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Skip(description=");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9028hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9027equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9026equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof androidx.constraintlayout.compose.Skip) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((androidx.constraintlayout.compose.Skip) obj).m9030unboximpl());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.constraintlayout.compose.Skip m9023boximpl(java.lang.String str) {
        return new androidx.constraintlayout.compose.Skip(str);
    }
}
