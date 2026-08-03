package io.ktor.http;

/* compiled from: CacheControl.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lio/ktor/http/CacheControl;", "", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "Lio/ktor/http/CacheControl$Visibility;", "getVisibility", "()Lio/ktor/http/CacheControl$Visibility;", "Visibility", "NoCache", "NoStore", "MaxAge", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CacheControl {
    private final io.ktor.http.CacheControl.Visibility visibility;

    public CacheControl(io.ktor.http.CacheControl.Visibility visibility) {
        this.visibility = visibility;
    }

    public final io.ktor.http.CacheControl.Visibility getVisibility() {
        return this.visibility;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CacheControl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/CacheControl$Visibility;", "", "", "headerValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getHeaderValue$ktor_http", "()Ljava/lang/String;", "Public", "Private", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Visibility {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ io.ktor.http.CacheControl.Visibility[] $VALUES;
        private final java.lang.String headerValue;
        public static final io.ktor.http.CacheControl.Visibility Public = new io.ktor.http.CacheControl.Visibility("Public", 0, io.ktor.client.utils.CacheControl.PUBLIC);
        public static final io.ktor.http.CacheControl.Visibility Private = new io.ktor.http.CacheControl.Visibility("Private", 1, io.ktor.client.utils.CacheControl.PRIVATE);

        private static final /* synthetic */ io.ktor.http.CacheControl.Visibility[] $values() {
            return new io.ktor.http.CacheControl.Visibility[]{Public, Private};
        }

        public static kotlin.enums.EnumEntries<io.ktor.http.CacheControl.Visibility> getEntries() {
            return $ENTRIES;
        }

        private Visibility(java.lang.String str, int i, java.lang.String str2) {
            this.headerValue = str2;
        }

        /* renamed from: getHeaderValue$ktor_http, reason: from getter */
        public final java.lang.String getHeaderValue() {
            return this.headerValue;
        }

        static {
            io.ktor.http.CacheControl.Visibility[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        public static io.ktor.http.CacheControl.Visibility valueOf(java.lang.String str) {
            return (io.ktor.http.CacheControl.Visibility) java.lang.Enum.valueOf(io.ktor.http.CacheControl.Visibility.class, str);
        }

        public static io.ktor.http.CacheControl.Visibility[] values() {
            return (io.ktor.http.CacheControl.Visibility[]) $VALUES.clone();
        }
    }

    /* compiled from: CacheControl.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/http/CacheControl$NoCache;", "Lio/ktor/http/CacheControl;", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoCache extends io.ktor.http.CacheControl {
        public NoCache(io.ktor.http.CacheControl.Visibility visibility) {
            super(visibility);
        }

        public java.lang.String toString() {
            if (getVisibility() == null) {
                return io.ktor.client.utils.CacheControl.NO_CACHE;
            }
            return "no-cache, " + getVisibility().getHeaderValue();
        }

        public boolean equals(java.lang.Object other) {
            return (other instanceof io.ktor.http.CacheControl.NoCache) && getVisibility() == ((io.ktor.http.CacheControl.NoCache) other).getVisibility();
        }

        public int hashCode() {
            io.ktor.http.CacheControl.Visibility visibility = getVisibility();
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }
    }

    /* compiled from: CacheControl.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/http/CacheControl$NoStore;", "Lio/ktor/http/CacheControl;", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoStore extends io.ktor.http.CacheControl {
        public NoStore(io.ktor.http.CacheControl.Visibility visibility) {
            super(visibility);
        }

        public java.lang.String toString() {
            if (getVisibility() == null) {
                return io.ktor.client.utils.CacheControl.NO_STORE;
            }
            return "no-store, " + getVisibility().getHeaderValue();
        }

        public boolean equals(java.lang.Object other) {
            return (other instanceof io.ktor.http.CacheControl.NoStore) && ((io.ktor.http.CacheControl.NoStore) other).getVisibility() == getVisibility();
        }

        public int hashCode() {
            io.ktor.http.CacheControl.Visibility visibility = getVisibility();
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }
    }

    /* compiled from: CacheControl.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/ktor/http/CacheControl$MaxAge;", "Lio/ktor/http/CacheControl;", "", "maxAgeSeconds", "proxyMaxAgeSeconds", "", "mustRevalidate", "proxyRevalidate", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(ILjava/lang/Integer;ZZLio/ktor/http/CacheControl$Visibility;)V", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getMaxAgeSeconds", "Ljava/lang/Integer;", "getProxyMaxAgeSeconds", "()Ljava/lang/Integer;", "Z", "getMustRevalidate", "()Z", "getProxyRevalidate", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MaxAge extends io.ktor.http.CacheControl {
        private final int maxAgeSeconds;
        private final boolean mustRevalidate;
        private final java.lang.Integer proxyMaxAgeSeconds;
        private final boolean proxyRevalidate;

        public /* synthetic */ MaxAge(int i, java.lang.Integer num, boolean z, boolean z2, io.ktor.http.CacheControl.Visibility visibility, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : visibility);
        }

        public final int getMaxAgeSeconds() {
            return this.maxAgeSeconds;
        }

        public final java.lang.Integer getProxyMaxAgeSeconds() {
            return this.proxyMaxAgeSeconds;
        }

        public final boolean getMustRevalidate() {
            return this.mustRevalidate;
        }

        public final boolean getProxyRevalidate() {
            return this.proxyRevalidate;
        }

        public MaxAge(int i, java.lang.Integer num, boolean z, boolean z2, io.ktor.http.CacheControl.Visibility visibility) {
            super(visibility);
            this.maxAgeSeconds = i;
            this.proxyMaxAgeSeconds = num;
            this.mustRevalidate = z;
            this.proxyRevalidate = z2;
        }

        public java.lang.String toString() {
            java.util.ArrayList arrayList = new java.util.ArrayList(5);
            arrayList.add("max-age=" + this.maxAgeSeconds);
            if (this.proxyMaxAgeSeconds != null) {
                arrayList.add("s-maxage=" + this.proxyMaxAgeSeconds);
            }
            if (this.mustRevalidate) {
                arrayList.add(io.ktor.client.utils.CacheControl.MUST_REVALIDATE);
            }
            if (this.proxyRevalidate) {
                arrayList.add(io.ktor.client.utils.CacheControl.PROXY_REVALIDATE);
            }
            if (getVisibility() != null) {
                arrayList.add(getVisibility().getHeaderValue());
            }
            return kotlin.collections.CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        }

        public boolean equals(java.lang.Object other) {
            if (other != this) {
                if (other instanceof io.ktor.http.CacheControl.MaxAge) {
                    io.ktor.http.CacheControl.MaxAge maxAge = (io.ktor.http.CacheControl.MaxAge) other;
                    if (maxAge.maxAgeSeconds != this.maxAgeSeconds || !kotlin.jvm.internal.Intrinsics.areEqual(maxAge.proxyMaxAgeSeconds, this.proxyMaxAgeSeconds) || maxAge.mustRevalidate != this.mustRevalidate || maxAge.proxyRevalidate != this.proxyRevalidate || maxAge.getVisibility() != getVisibility()) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.maxAgeSeconds * 31;
            java.lang.Integer num = this.proxyMaxAgeSeconds;
            int intValue = (((((i + (num != null ? num.intValue() : 0)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.mustRevalidate)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.proxyRevalidate)) * 31;
            io.ktor.http.CacheControl.Visibility visibility = getVisibility();
            return intValue + (visibility != null ? visibility.hashCode() : 0);
        }
    }
}
