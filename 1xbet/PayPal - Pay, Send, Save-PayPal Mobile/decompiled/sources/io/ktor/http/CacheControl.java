package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/http/CacheControl;", "", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "Lio/ktor/http/CacheControl$Visibility;", "getVisibility", "()Lio/ktor/http/CacheControl$Visibility;", "Visibility", "NoCache", "NoStore", "MaxAge"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
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
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lio/ktor/http/CacheControl$Visibility;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "headerValue", "Ljava/lang/String;", "getHeaderValue$ktor_http", "()Ljava/lang/String;", "Public", "Private"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Visibility {
        private static final /* synthetic */ io.ktor.http.CacheControl.Visibility[] Camera2StreamConfigurationMap;
        public static final io.ktor.http.CacheControl.Visibility Private;
        public static final io.ktor.http.CacheControl.Visibility Public;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private final java.lang.String headerValue;

        private Visibility(java.lang.String str, int i, java.lang.String str2) {
            this.headerValue = str2;
        }

        /* renamed from: getHeaderValue$ktor_http, reason: from getter */
        public final java.lang.String getHeaderValue() {
            return this.headerValue;
        }

        static {
            io.ktor.http.CacheControl.Visibility visibility = new io.ktor.http.CacheControl.Visibility("Public", 0, "public");
            Public = visibility;
            io.ktor.http.CacheControl.Visibility visibility2 = new io.ktor.http.CacheControl.Visibility("Private", 1, io.ktor.client.utils.CacheControl.PRIVATE);
            Private = visibility2;
            io.ktor.http.CacheControl.Visibility[] visibilityArr = {visibility, visibility2};
            Camera2StreamConfigurationMap = visibilityArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(visibilityArr);
        }

        public static io.ktor.http.CacheControl.Visibility valueOf(java.lang.String str) {
            return (io.ktor.http.CacheControl.Visibility) java.lang.Enum.valueOf(io.ktor.http.CacheControl.Visibility.class, str);
        }

        public static io.ktor.http.CacheControl.Visibility[] values() {
            return (io.ktor.http.CacheControl.Visibility[]) Camera2StreamConfigurationMap.clone();
        }

        public static kotlin.enums.EnumEntries<io.ktor.http.CacheControl.Visibility> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lio/ktor/http/CacheControl$NoCache;", "Lio/ktor/http/CacheControl;", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoCache extends io.ktor.http.CacheControl {
        public NoCache(io.ktor.http.CacheControl.Visibility visibility) {
            super(visibility);
        }

        public final java.lang.String toString() {
            if (getVisibility() == null) {
                return "no-cache";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("no-cache, ");
            sb.append(getVisibility().getHeaderValue());
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            return (other instanceof io.ktor.http.CacheControl.NoCache) && getVisibility() == ((io.ktor.http.CacheControl.NoCache) other).getVisibility();
        }

        public final int hashCode() {
            io.ktor.http.CacheControl.Visibility visibility = getVisibility();
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lio/ktor/http/CacheControl$NoStore;", "Lio/ktor/http/CacheControl;", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoStore extends io.ktor.http.CacheControl {
        public NoStore(io.ktor.http.CacheControl.Visibility visibility) {
            super(visibility);
        }

        public final java.lang.String toString() {
            if (getVisibility() == null) {
                return io.ktor.client.utils.CacheControl.NO_STORE;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("no-store, ");
            sb.append(getVisibility().getHeaderValue());
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            return (other instanceof io.ktor.http.CacheControl.NoStore) && ((io.ktor.http.CacheControl.NoStore) other).getVisibility() == getVisibility();
        }

        public final int hashCode() {
            io.ktor.http.CacheControl.Visibility visibility = getVisibility();
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c"}, d2 = {"Lio/ktor/http/CacheControl$MaxAge;", "Lio/ktor/http/CacheControl;", "", "maxAgeSeconds", "proxyMaxAgeSeconds", "", "mustRevalidate", "proxyRevalidate", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(ILjava/lang/Integer;ZZLio/ktor/http/CacheControl$Visibility;)V", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getMaxAgeSeconds", "Ljava/lang/Integer;", "getProxyMaxAgeSeconds", "()Ljava/lang/Integer;", "Z", "getMustRevalidate", "()Z", "getProxyRevalidate"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

        public final java.lang.String toString() {
            java.util.ArrayList arrayList = new java.util.ArrayList(5);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("max-age=");
            sb.append(this.maxAgeSeconds);
            arrayList.add(sb.toString());
            if (this.proxyMaxAgeSeconds != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("s-maxage=");
                sb2.append(this.proxyMaxAgeSeconds);
                arrayList.add(sb2.toString());
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

        public final boolean equals(java.lang.Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof io.ktor.http.CacheControl.MaxAge)) {
                return false;
            }
            io.ktor.http.CacheControl.MaxAge maxAge = (io.ktor.http.CacheControl.MaxAge) other;
            return maxAge.maxAgeSeconds == this.maxAgeSeconds && kotlin.jvm.internal.Intrinsics.areEqual(maxAge.proxyMaxAgeSeconds, this.proxyMaxAgeSeconds) && maxAge.mustRevalidate == this.mustRevalidate && maxAge.proxyRevalidate == this.proxyRevalidate && maxAge.getVisibility() == getVisibility();
        }

        public final int hashCode() {
            int i = this.maxAgeSeconds;
            java.lang.Integer num = this.proxyMaxAgeSeconds;
            int intValue = num != null ? num.intValue() : 0;
            int hashCode = java.lang.Boolean.hashCode(this.mustRevalidate);
            int hashCode2 = java.lang.Boolean.hashCode(this.proxyRevalidate);
            io.ktor.http.CacheControl.Visibility visibility = getVisibility();
            return (((((((i * 31) + intValue) * 31) + hashCode) * 31) + hashCode2) * 31) + (visibility != null ? visibility.hashCode() : 0);
        }
    }
}
