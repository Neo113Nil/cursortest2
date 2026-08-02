package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Landroidx/compose/material3/internal/DateInputFormat;", "", "", "patternWithDelimiters", "", "delimiter", "<init>", "(Ljava/lang/String;C)V", "component1", "()Ljava/lang/String;", "component2", "()C", "copy", "(Ljava/lang/String;C)Landroidx/compose/material3/internal/DateInputFormat;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPatternWithDelimiters", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getDelimiter", "patternWithoutDelimiters", "getPatternWithoutDelimiters"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DateInputFormat {
    public static final int $stable = 0;
    private final char delimiter;
    private final java.lang.String patternWithDelimiters;
    private final java.lang.String patternWithoutDelimiters;

    public DateInputFormat(java.lang.String str, char c) {
        this.patternWithDelimiters = str;
        this.delimiter = c;
        this.patternWithoutDelimiters = kotlin.text.StringsKt.replace$default(str, java.lang.String.valueOf(c), "", false, 4, (java.lang.Object) null);
    }

    public final char getDelimiter() {
        return this.delimiter;
    }

    public final java.lang.String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    public final java.lang.String getPatternWithoutDelimiters() {
        return this.patternWithoutDelimiters;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DateInputFormat(patternWithDelimiters=");
        sb.append(this.patternWithDelimiters);
        sb.append(", delimiter=");
        sb.append(this.delimiter);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.patternWithDelimiters.hashCode() * 31) + java.lang.Character.hashCode(this.delimiter);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material3.internal.DateInputFormat)) {
            return false;
        }
        androidx.compose.material3.internal.DateInputFormat dateInputFormat = (androidx.compose.material3.internal.DateInputFormat) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.patternWithDelimiters, dateInputFormat.patternWithDelimiters) && this.delimiter == dateInputFormat.delimiter;
    }

    public final androidx.compose.material3.internal.DateInputFormat copy(java.lang.String patternWithDelimiters, char delimiter) {
        return new androidx.compose.material3.internal.DateInputFormat(patternWithDelimiters, delimiter);
    }

    /* renamed from: component2, reason: from getter */
    public final char getDelimiter() {
        return this.delimiter;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    public static /* synthetic */ androidx.compose.material3.internal.DateInputFormat copy$default(androidx.compose.material3.internal.DateInputFormat dateInputFormat, java.lang.String str, char c, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dateInputFormat.patternWithDelimiters;
        }
        if ((i & 2) != 0) {
            c = dateInputFormat.delimiter;
        }
        return dateInputFormat.copy(str, c);
    }
}
