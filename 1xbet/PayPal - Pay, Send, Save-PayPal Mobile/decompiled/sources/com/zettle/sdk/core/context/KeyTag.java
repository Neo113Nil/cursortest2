package com.zettle.sdk.core.context;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/core/context/KeyTag;", "T", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "tag", "(Ljava/lang/Class;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getTag", "Ljava/lang/Class;", "getType", "()Ljava/lang/Class;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue$core_publicRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KeyTag<T> {
    private final java.lang.String tag;
    private final java.lang.Class<T> type;
    private final java.lang.String value;

    public KeyTag(java.lang.Class<T> cls, java.lang.String str) {
        java.lang.String name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        this.type = cls;
        this.tag = str;
        if (str != null) {
            java.lang.String name3 = cls.getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(name3);
            sb.append("#");
            sb.append(str);
            name2 = sb.toString();
        } else {
            name2 = cls.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        }
        this.value = name2;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final java.lang.Class<T> getType() {
        return this.type;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyTag(java.lang.Class<T> cls) {
        this(cls, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
    }

    /* renamed from: getValue$core_publicRelease, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        java.lang.String name2 = this.type.getName();
        java.lang.String str = this.tag;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyTag(type=");
        sb.append(name2);
        sb.append(", tag=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
