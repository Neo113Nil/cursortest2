package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\r"}, d2 = {"Landroidx/work/impl/model/Preference;", "", "", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Landroidx/work/impl/model/Preference;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getKey", "Ljava/lang/Long;", "getValue"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Preference {
    private final java.lang.String key;
    private final java.lang.Long value;

    public Preference(java.lang.String str, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.key = str;
        this.value = l;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final java.lang.Long getValue() {
        return this.value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Preference(java.lang.String str, boolean z) {
        this(str, java.lang.Long.valueOf(z ? 1L : 0L));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Preference(key=");
        sb.append(this.key);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.key.hashCode();
        java.lang.Long l = this.value;
        return (hashCode * 31) + (l == null ? 0 : l.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.work.impl.model.Preference)) {
            return false;
        }
        androidx.work.impl.model.Preference preference = (androidx.work.impl.model.Preference) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.key, preference.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, preference.value);
    }

    public final androidx.work.impl.model.Preference copy(java.lang.String key, java.lang.Long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return new androidx.work.impl.model.Preference(key, value);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getValue() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    public static /* synthetic */ androidx.work.impl.model.Preference copy$default(androidx.work.impl.model.Preference preference, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = preference.key;
        }
        if ((i & 2) != 0) {
            l = preference.value;
        }
        return preference.copy(str, l);
    }
}
