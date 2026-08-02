package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001f\u001a\u00020\u001d2\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010#\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-"}, d2 = {"Lio/ktor/util/StringValuesSingleImpl;", "Lio/ktor/util/StringValues;", "", "caseInsensitiveName", "", "name", "", "values", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "", "entries", "()Ljava/util/Set;", "isEmpty", "()Z", "names", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "forEach", "(Lkotlin/jvm/functions/Function2;)V", "get", "(Ljava/lang/String;)Ljava/lang/String;", "contains", "(Ljava/lang/String;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/String;Ljava/lang/String;)Z", "Z", "getCaseInsensitiveName", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getValues", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public class StringValuesSingleImpl implements io.ktor.util.StringValues {
    private final boolean caseInsensitiveName;
    private final java.lang.String name;
    private final java.util.List<java.lang.String> values;

    @Override // io.ktor.util.StringValues
    public boolean isEmpty() {
        return false;
    }

    public StringValuesSingleImpl(boolean z, java.lang.String str, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.caseInsensitiveName = z;
        this.name = str;
        this.values = list;
    }

    @Override // io.ktor.util.StringValues
    public boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.util.List<java.lang.String> getValues() {
        return this.values;
    }

    @Override // io.ktor.util.StringValues
    public java.util.List<java.lang.String> getAll(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        if (kotlin.text.StringsKt.equals(this.name, name2, getCaseInsensitiveName())) {
            return this.values;
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries() {
        return kotlin.collections.SetsKt.setOf(new io.ktor.util.StringValuesSingleImpl$entries$1(this));
    }

    @Override // io.ktor.util.StringValues
    public java.util.Set<java.lang.String> names() {
        return kotlin.collections.SetsKt.setOf(this.name);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StringValues(case=");
        sb.append(!getCaseInsensitiveName());
        sb.append(") ");
        sb.append(entries());
        return sb.toString();
    }

    public int hashCode() {
        return io.ktor.util.StringValuesKt.access$entriesHashCode(entries(), java.lang.Boolean.hashCode(getCaseInsensitiveName()) * 31);
    }

    public boolean equals(java.lang.Object other) {
        boolean areEqual;
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.util.StringValues)) {
            return false;
        }
        io.ktor.util.StringValues stringValues = (io.ktor.util.StringValues) other;
        if (getCaseInsensitiveName() != stringValues.getCaseInsensitiveName()) {
            return false;
        }
        areEqual = kotlin.jvm.internal.Intrinsics.areEqual(entries(), stringValues.entries());
        return areEqual;
    }

    @Override // io.ktor.util.StringValues
    public void forEach(kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.List<java.lang.String>, kotlin.Unit> body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
        body.invoke(this.name, this.values);
    }

    @Override // io.ktor.util.StringValues
    public java.lang.String get(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        if (kotlin.text.StringsKt.equals(name2, this.name, getCaseInsensitiveName())) {
            return (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.values);
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return kotlin.text.StringsKt.equals(name2, this.name, getCaseInsensitiveName());
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(java.lang.String name2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return kotlin.text.StringsKt.equals(name2, this.name, getCaseInsensitiveName()) && this.values.contains(value);
    }
}
