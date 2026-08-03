package androidx.compose.ui.text.font;

/* compiled from: DeviceFontFamilyNameFont.android.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "", "name", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getName", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class DeviceFontFamilyName {
    private final java.lang.String name;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.font.DeviceFontFamilyName m4040boximpl(java.lang.String str) {
        return new androidx.compose.ui.text.font.DeviceFontFamilyName(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4042equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.font.DeviceFontFamilyName) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((androidx.compose.ui.text.font.DeviceFontFamilyName) obj).m4046unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4043equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4044hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m4045toStringimpl(java.lang.String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return m4042equalsimpl(this.name, obj);
    }

    public int hashCode() {
        return m4044hashCodeimpl(this.name);
    }

    public java.lang.String toString() {
        return m4045toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m4046unboximpl() {
        return this.name;
    }

    private /* synthetic */ DeviceFontFamilyName(java.lang.String str) {
        this.name = str;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m4041constructorimpl(java.lang.String str) {
        if (str.length() > 0) {
            return str;
        }
        throw new java.lang.IllegalArgumentException("name may not be empty".toString());
    }
}
