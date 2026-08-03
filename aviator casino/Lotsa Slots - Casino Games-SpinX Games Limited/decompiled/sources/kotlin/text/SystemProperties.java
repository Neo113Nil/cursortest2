package kotlin.text;

/* compiled from: StringBuilderJVM.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/text/SystemProperties;", "", "<init>", "()V", "LINE_SEPARATOR", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SystemProperties {
    public static final kotlin.text.SystemProperties INSTANCE = new kotlin.text.SystemProperties();
    public static final java.lang.String LINE_SEPARATOR;

    private SystemProperties() {
    }

    static {
        java.lang.String property = java.lang.System.getProperty("line.separator");
        kotlin.jvm.internal.Intrinsics.checkNotNull(property);
        LINE_SEPARATOR = property;
    }
}
