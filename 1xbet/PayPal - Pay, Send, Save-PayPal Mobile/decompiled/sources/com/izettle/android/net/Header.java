package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t"}, d2 = {"Lcom/izettle/android/net/Header;", "", "", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getValue", "Companion", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Header {
    public static final java.lang.String NAME_ACCEPT = "Accept";
    public static final java.lang.String NAME_CONTENT_TYPE = "Content-Type";
    private final java.lang.String name;
    private final java.lang.String value;

    public Header(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.value = str2;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    @com.izettle.android.net.RequestDsl
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r"}, d2 = {"Lcom/izettle/android/net/Header$Builder;", "", "<init>", "()V", "Lcom/izettle/android/net/Header;", "build", "()Lcom/izettle/android/net/Header;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue", "setValue"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String name = "";
        private java.lang.String value = "";

        public final java.lang.String getName() {
            return this.name;
        }

        public final void setName(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final void setValue(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        public final com.izettle.android.net.Header build() {
            return new com.izettle.android.net.Header(this.name, this.value);
        }
    }
}
