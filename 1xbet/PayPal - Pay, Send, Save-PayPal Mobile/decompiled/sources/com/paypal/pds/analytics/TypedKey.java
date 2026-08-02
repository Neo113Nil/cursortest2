package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u0011R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/pds/analytics/TypedKey;", "T", "", "", "name", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "Ljava/lang/Class;", "getType", "()Ljava/lang/Class;", "getType$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TypedKey<T> {
    public static final int $stable = 0;
    private final java.lang.String name;
    private final java.lang.Class<T> type;

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public TypedKey(java.lang.String str, java.lang.Class<T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        this.name = str;
        this.type = cls;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.Class<T> getType() {
        return this.type;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof com.paypal.pds.analytics.TypedKey)) {
            return false;
        }
        com.paypal.pds.analytics.TypedKey typedKey = (com.paypal.pds.analytics.TypedKey) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, typedKey.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, typedKey.type);
    }

    public final int hashCode() {
        return (this.name.hashCode() * 31) + this.type.hashCode();
    }

    public final java.lang.String toString() {
        return this.name;
    }
}
