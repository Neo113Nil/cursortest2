package coil3;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001!BK\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001f\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b \u0010\u0014"}, d2 = {"Lcoil3/Uri;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "separator", "scheme", "authority", "path", "query", "fragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcoil3/Uri$Builder;", "newBuilder", "()Lcoil3/Uri$Builder;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getSeparator", "getScheme", "getAuthority", "getPath", "getQuery", "getFragment", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Uri {
    private final java.lang.String authority;
    private final java.lang.String fragment;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String path;
    private final java.lang.String query;
    private final java.lang.String scheme;
    private final java.lang.String separator;

    public Uri(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.getHighSpeedVideoFpsRanges = str;
        this.separator = str2;
        this.scheme = str3;
        this.authority = str4;
        this.path = str5;
        this.query = str6;
        this.fragment = str7;
    }

    public final java.lang.String getSeparator() {
        return this.separator;
    }

    public final java.lang.String getScheme() {
        return this.scheme;
    }

    public final java.lang.String getAuthority() {
        return this.authority;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public final java.lang.String getQuery() {
        return this.query;
    }

    public final java.lang.String getFragment() {
        return this.fragment;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof coil3.Uri) && kotlin.jvm.internal.Intrinsics.areEqual(((coil3.Uri) other).getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    /* renamed from: toString, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final coil3.Uri.Builder newBuilder() {
        return new coil3.Uri.Builder(this.scheme, this.authority, this.path, this.query, this.fragment, this.separator);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BC\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u000bJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u000bJ\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010"}, d2 = {"Lcoil3/Uri$Builder;", "", "", "scheme", "authority", "path", "query", "fragment", "separator", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)Lcoil3/Uri$Builder;", "Lcoil3/Uri;", "build", "()Lcoil3/Uri;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRangesFor;
        private java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.lang.String Camera2StreamConfigurationMap;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private java.lang.String getInputSizeshNQ4ISI;

        public Builder(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.Camera2StreamConfigurationMap = str3;
            this.getHighSpeedVideoSizes = str4;
            this.getHighSpeedVideoFpsRanges = str5;
            this.getInputSizeshNQ4ISI = str6;
        }

        public final coil3.Uri.Builder scheme(java.lang.String scheme) {
            this.getHighResolutionOutputSizeshNQ4ISI = scheme;
            return this;
        }

        public final coil3.Uri.Builder authority(java.lang.String authority) {
            this.getHighSpeedVideoFpsRangesFor = authority;
            return this;
        }

        public final coil3.Uri.Builder path(java.lang.String path) {
            this.Camera2StreamConfigurationMap = path;
            return this;
        }

        public final coil3.Uri.Builder query(java.lang.String query) {
            this.getHighSpeedVideoSizes = query;
            return this;
        }

        public final coil3.Uri.Builder fragment(java.lang.String fragment) {
            this.getHighSpeedVideoFpsRanges = fragment;
            return this;
        }

        public final coil3.Uri.Builder separator(java.lang.String separator) {
            this.getInputSizeshNQ4ISI = separator;
            return this;
        }

        public final coil3.Uri build() {
            return coil3.UriKt.Uri(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI);
        }
    }
}
