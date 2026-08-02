package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0002\u0019\u001aBa\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017"}, d2 = {"Lcom/apollographql/apollo/api/Error;", "", "", "message", "", "Lcom/apollographql/apollo/api/Error$Location;", "locations", "path", "", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "nonStandardFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getLocations", "()Ljava/util/List;", "getPath", "Ljava/util/Map;", "getExtensions", "()Ljava/util/Map;", "getNonStandardFields", "Builder", "Location"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Error {
    private final java.util.Map<java.lang.String, java.lang.Object> extensions;
    private final java.util.List<com.apollographql.apollo.api.Error.Location> locations;
    private final java.lang.String message;
    private final java.util.Map<java.lang.String, java.lang.Object> nonStandardFields;
    private final java.util.List<java.lang.Object> path;

    @kotlin.Deprecated(message = "Use Error.Builder instead", replaceWith = @kotlin.ReplaceWith(expression = "Builder(message = message).locations(locations).path(path).extensions(extensions)", imports = {}))
    public Error(java.lang.String str, java.util.List<com.apollographql.apollo.api.Error.Location> list, java.util.List<? extends java.lang.Object> list2, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.String, ? extends java.lang.Object> map2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
        this.locations = list;
        this.path = list2;
        this.extensions = map;
        this.nonStandardFields = map2;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.util.List<com.apollographql.apollo.api.Error.Location> getLocations() {
        return this.locations;
    }

    public final java.util.List<java.lang.Object> getPath() {
        return this.path;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getExtensions() {
        return this.extensions;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getNonStandardFields() {
        return this.nonStandardFields;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/apollographql/apollo/api/Error$Builder;", "", "", "message", "<init>", "(Ljava/lang/String;)V", "", "Lcom/apollographql/apollo/api/Error$Location;", "locations", "(Ljava/util/List;)Lcom/apollographql/apollo/api/Error$Builder;", "path", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "putExtension", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/apollographql/apollo/api/Error$Builder;", "Lcom/apollographql/apollo/api/Error;", "build", "()Lcom/apollographql/apollo/api/Error;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Ljava/util/List;", "getLocations", "()Ljava/util/List;", "setLocations", "(Ljava/util/List;)V", "getPath", "setPath", "", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "Ljava/util/Map;", "getExtensions", "()Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private final java.util.Map<java.lang.String, java.lang.Object> extensions;
        private java.util.List<com.apollographql.apollo.api.Error.Location> locations;
        private final java.lang.String message;
        private java.util.List<? extends java.lang.Object> path;

        public Builder(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.extensions = new java.util.LinkedHashMap();
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.util.List<com.apollographql.apollo.api.Error.Location> getLocations() {
            return this.locations;
        }

        public final void setLocations(java.util.List<com.apollographql.apollo.api.Error.Location> list) {
            this.locations = list;
        }

        public final java.util.List<java.lang.Object> getPath() {
            return this.path;
        }

        public final void setPath(java.util.List<? extends java.lang.Object> list) {
            this.path = list;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getExtensions() {
            return this.extensions;
        }

        public final com.apollographql.apollo.api.Error.Builder locations(java.util.List<com.apollographql.apollo.api.Error.Location> locations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locations, "");
            this.locations = locations;
            return this;
        }

        public final com.apollographql.apollo.api.Error.Builder path(java.util.List<? extends java.lang.Object> path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            this.path = path;
            return this;
        }

        public final com.apollographql.apollo.api.Error.Builder putExtension(java.lang.String name2, java.lang.Object value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            this.extensions.put(name2, value);
            return this;
        }

        public final com.apollographql.apollo.api.Error build() {
            return new com.apollographql.apollo.api.Error(this.message, this.locations, this.path, this.extensions, null);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message = ");
        sb.append(this.message);
        sb.append(", locations = ");
        sb.append(this.locations);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", extensions = ");
        sb.append(this.extensions);
        sb.append(", nonStandardFields = ");
        sb.append(this.nonStandardFields);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\f"}, d2 = {"Lcom/apollographql/apollo/api/Error$Location;", "", "", "line", "column", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getLine", "()I", "getColumn"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Location {
        private final int column;
        private final int line;

        public Location(int i, int i2) {
            this.line = i;
            this.column = i2;
        }

        public final int getLine() {
            return this.line;
        }

        public final int getColumn() {
            return this.column;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Location(line = ");
            sb.append(this.line);
            sb.append(", column = ");
            sb.append(this.column);
            sb.append(')');
            return sb.toString();
        }
    }
}
