package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/tooling/ParameterSourceInformation;", "", "", "sortedIndex", "", "name", "inlineClass", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", com.visa.cbp.getEncExpo.warmup, "getSortedIndex", "()I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getInlineClass"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ParameterSourceInformation {
    public static final int $stable = 0;
    private final java.lang.String inlineClass;
    private final java.lang.String name;
    private final int sortedIndex;

    public ParameterSourceInformation(int i, java.lang.String str, java.lang.String str2) {
        this.sortedIndex = i;
        this.name = str;
        this.inlineClass = str2;
    }

    public /* synthetic */ ParameterSourceInformation(int i, java.lang.String str, java.lang.String str2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }

    public final int getSortedIndex() {
        return this.sortedIndex;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getInlineClass() {
        return this.inlineClass;
    }
}
