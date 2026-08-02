package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "", "", "name", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "toString-impl", "toString", "Ljava/lang/String;", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class DeviceFontFamilyName {
    private final java.lang.String name;

    private /* synthetic */ DeviceFontFamilyName(java.lang.String str) {
        this.name = str;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m8116constructorimpl(java.lang.String str) {
        if (str.length() <= 0) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("name may not be empty");
        }
        return str;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m8121unboximpl() {
        return this.name;
    }

    public final java.lang.String toString() {
        return m8120toStringimpl(this.name);
    }

    public final int hashCode() {
        return m8119hashCodeimpl(this.name);
    }

    public final boolean equals(java.lang.Object obj) {
        return m8117equalsimpl(this.name, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8120toStringimpl(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceFontFamilyName(name=");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8119hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8118equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8117equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.font.DeviceFontFamilyName) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((androidx.compose.ui.text.font.DeviceFontFamilyName) obj).m8121unboximpl());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.font.DeviceFontFamilyName m8115boximpl(java.lang.String str) {
        return new androidx.compose.ui.text.font.DeviceFontFamilyName(str);
    }
}
