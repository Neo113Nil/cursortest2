package retrofit2;

/* loaded from: classes5.dex */
abstract class ParameterHandler<T> {
    abstract void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) throws java.io.IOException;

    ParameterHandler() {
    }

    static final class RelativeUrl extends retrofit2.ParameterHandler<java.lang.Object> {
        private final java.lang.reflect.Method Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoFpsRangesFor;

        RelativeUrl(java.lang.reflect.Method method, int i) {
            this.Camera2StreamConfigurationMap = method;
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // retrofit2.ParameterHandler
        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) {
            if (obj == null) {
                throw retrofit2.Utils.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, "@Url parameter is null.", new java.lang.Object[0]);
            }
            requestBuilder.getInputSizeshNQ4ISI = obj.toString();
        }
    }

    static final class Header<T> extends retrofit2.ParameterHandler<T> {
        private final retrofit2.Converter<T, java.lang.String> Camera2StreamConfigurationMap;
        private final java.lang.String getHighSpeedVideoFpsRanges;
        private final boolean getHighSpeedVideoSizes;

        Header(java.lang.String str, retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.getHighSpeedVideoFpsRanges = (java.lang.String) java.util.Objects.requireNonNull(str, "name == null");
            this.Camera2StreamConfigurationMap = converter;
            this.getHighSpeedVideoSizes = z;
        }

        @Override // retrofit2.ParameterHandler
        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) throws java.io.IOException {
            java.lang.String convert;
            if (t == null || (convert = this.Camera2StreamConfigurationMap.convert(t)) == null) {
                return;
            }
            requestBuilder.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, convert, this.getHighSpeedVideoSizes);
        }
    }

    static final class Path<T> extends retrofit2.ParameterHandler<T> {
        private final retrofit2.Converter<T, java.lang.String> Camera2StreamConfigurationMap;
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRanges;
        private final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;
        private final boolean getHighSpeedVideoSizes;

        Path(java.lang.reflect.Method method, int i, java.lang.String str, retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = method;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighResolutionOutputSizeshNQ4ISI = (java.lang.String) java.util.Objects.requireNonNull(str, "name == null");
            this.Camera2StreamConfigurationMap = converter;
            this.getHighSpeedVideoSizes = z;
        }

        @Override // retrofit2.ParameterHandler
        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) throws java.io.IOException {
            if (t == null) {
                java.lang.reflect.Method method = this.getHighSpeedVideoFpsRangesFor;
                int i = this.getHighSpeedVideoFpsRanges;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Path parameter \"");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                sb.append("\" value must not be null.");
                throw retrofit2.Utils.getHighSpeedVideoSizes(method, i, sb.toString(), new java.lang.Object[0]);
            }
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String convert = this.Camera2StreamConfigurationMap.convert(t);
            boolean z = this.getHighSpeedVideoSizes;
            if (requestBuilder.getInputSizeshNQ4ISI == null) {
                throw new java.lang.AssertionError();
            }
            java.lang.String highSpeedVideoSizes = retrofit2.RequestBuilder.getHighSpeedVideoSizes(convert, z);
            java.lang.String str2 = requestBuilder.getInputSizeshNQ4ISI;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("{");
            sb2.append(str);
            sb2.append("}");
            java.lang.String replace = str2.replace(sb2.toString(), highSpeedVideoSizes);
            if (retrofit2.RequestBuilder.getHighSpeedVideoSizes.matcher(replace).matches()) {
                throw new java.lang.IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(java.lang.String.valueOf(convert)));
            }
            requestBuilder.getInputSizeshNQ4ISI = replace;
        }
    }

    static final class Query<T> extends retrofit2.ParameterHandler<T> {
        private final java.lang.String Camera2StreamConfigurationMap;
        private final retrofit2.Converter<T, java.lang.String> getHighSpeedVideoFpsRanges;
        private final boolean getHighSpeedVideoFpsRangesFor;

        Query(java.lang.String str, retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.Camera2StreamConfigurationMap = (java.lang.String) java.util.Objects.requireNonNull(str, "name == null");
            this.getHighSpeedVideoFpsRanges = converter;
            this.getHighSpeedVideoFpsRangesFor = z;
        }

        @Override // retrofit2.ParameterHandler
        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) throws java.io.IOException {
            java.lang.String convert;
            if (t == null || (convert = this.getHighSpeedVideoFpsRanges.convert(t)) == null) {
                return;
            }
            requestBuilder.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, convert, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    static final class QueryName<T> extends retrofit2.ParameterHandler<T> {
        private final boolean getHighSpeedVideoFpsRanges;
        private final retrofit2.Converter<T, java.lang.String> getHighSpeedVideoFpsRangesFor;

        QueryName(retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = converter;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // retrofit2.ParameterHandler
        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) throws java.io.IOException {
            if (t == null) {
                return;
            }
            requestBuilder.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor.convert(t), null, this.getHighSpeedVideoFpsRanges);
        }
    }

    static final class QueryMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final boolean Camera2StreamConfigurationMap;
        private final java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
        private final retrofit2.Converter<T, java.lang.String> getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoSizes;

        @Override // retrofit2.ParameterHandler
        final /* synthetic */ void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
            java.util.Map map = (java.util.Map) obj;
            if (map == null) {
                throw retrofit2.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, "Query map was null", new java.lang.Object[0]);
            }
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                if (str == null) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, "Query map contained null key.", new java.lang.Object[0]);
                }
                java.lang.Object value = entry.getValue();
                if (value == null) {
                    java.lang.reflect.Method method = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i = this.getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Query map contained null value for key '");
                    sb.append(str);
                    sb.append("'.");
                    throw retrofit2.Utils.getHighSpeedVideoSizes(method, i, sb.toString(), new java.lang.Object[0]);
                }
                java.lang.String str2 = (java.lang.String) this.getHighSpeedVideoFpsRanges.convert(value);
                if (str2 == null) {
                    java.lang.reflect.Method method2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i2 = this.getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Query map value '");
                    sb2.append(value);
                    sb2.append("' converted to null by ");
                    sb2.append(this.getHighSpeedVideoFpsRanges.getClass().getName());
                    sb2.append(" for key '");
                    sb2.append(str);
                    sb2.append("'.");
                    throw retrofit2.Utils.getHighSpeedVideoSizes(method2, i2, sb2.toString(), new java.lang.Object[0]);
                }
                requestBuilder.getHighResolutionOutputSizeshNQ4ISI(str, str2, this.Camera2StreamConfigurationMap);
            }
        }

        QueryMap(java.lang.reflect.Method method, int i, retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = method;
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRanges = converter;
            this.Camera2StreamConfigurationMap = z;
        }
    }

    static final class HeaderMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final boolean Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoFpsRanges;
        private final retrofit2.Converter<T, java.lang.String> getHighSpeedVideoFpsRangesFor;
        private final java.lang.reflect.Method getHighSpeedVideoSizes;

        @Override // retrofit2.ParameterHandler
        final /* synthetic */ void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
            java.util.Map map = (java.util.Map) obj;
            if (map == null) {
                throw retrofit2.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, "Header map was null.", new java.lang.Object[0]);
            }
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                if (str == null) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, "Header map contained null key.", new java.lang.Object[0]);
                }
                java.lang.Object value = entry.getValue();
                if (value == null) {
                    java.lang.reflect.Method method = this.getHighSpeedVideoSizes;
                    int i = this.getHighSpeedVideoFpsRanges;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Header map contained null value for key '");
                    sb.append(str);
                    sb.append("'.");
                    throw retrofit2.Utils.getHighSpeedVideoSizes(method, i, sb.toString(), new java.lang.Object[0]);
                }
                requestBuilder.getHighSpeedVideoFpsRangesFor(str, (java.lang.String) this.getHighSpeedVideoFpsRangesFor.convert(value), this.Camera2StreamConfigurationMap);
            }
        }

        HeaderMap(java.lang.reflect.Method method, int i, retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.getHighSpeedVideoSizes = method;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoFpsRangesFor = converter;
            this.Camera2StreamConfigurationMap = z;
        }
    }

    static final class Headers extends retrofit2.ParameterHandler<okhttp3.Headers> {
        private final int Camera2StreamConfigurationMap;
        private final java.lang.reflect.Method getHighSpeedVideoSizes;

        @Override // retrofit2.ParameterHandler
        final /* synthetic */ void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable okhttp3.Headers headers) throws java.io.IOException {
            okhttp3.Headers headers2 = headers;
            if (headers2 == null) {
                throw retrofit2.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, "Headers parameter must not be null.", new java.lang.Object[0]);
            }
            requestBuilder.getHighSpeedVideoSizesFor.addAll(headers2);
        }

        Headers(java.lang.reflect.Method method, int i) {
            this.getHighSpeedVideoSizes = method;
            this.Camera2StreamConfigurationMap = i;
        }
    }

    static final class Field<T> extends retrofit2.ParameterHandler<T> {
        private final retrofit2.Converter<T, java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.String getHighSpeedVideoFpsRanges;
        private final boolean getHighSpeedVideoFpsRangesFor;

        Field(java.lang.String str, retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.getHighSpeedVideoFpsRanges = (java.lang.String) java.util.Objects.requireNonNull(str, "name == null");
            this.getHighResolutionOutputSizeshNQ4ISI = converter;
            this.getHighSpeedVideoFpsRangesFor = z;
        }

        @Override // retrofit2.ParameterHandler
        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) throws java.io.IOException {
            java.lang.String convert;
            if (t == null || (convert = this.getHighResolutionOutputSizeshNQ4ISI.convert(t)) == null) {
                return;
            }
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            if (this.getHighSpeedVideoFpsRangesFor) {
                requestBuilder.Camera2StreamConfigurationMap.addEncoded(str, convert);
            } else {
                requestBuilder.Camera2StreamConfigurationMap.add(str, convert);
            }
        }
    }

    static final class FieldMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final boolean getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.reflect.Method getHighSpeedVideoFpsRanges;
        private final retrofit2.Converter<T, java.lang.String> getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;

        @Override // retrofit2.ParameterHandler
        final /* synthetic */ void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
            java.util.Map map = (java.util.Map) obj;
            if (map == null) {
                throw retrofit2.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, "Field map was null.", new java.lang.Object[0]);
            }
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                if (str == null) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, "Field map contained null key.", new java.lang.Object[0]);
                }
                java.lang.Object value = entry.getValue();
                if (value == null) {
                    java.lang.reflect.Method method = this.getHighSpeedVideoFpsRanges;
                    int i = this.getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Field map contained null value for key '");
                    sb.append(str);
                    sb.append("'.");
                    throw retrofit2.Utils.getHighSpeedVideoSizes(method, i, sb.toString(), new java.lang.Object[0]);
                }
                java.lang.String str2 = (java.lang.String) this.getHighSpeedVideoFpsRangesFor.convert(value);
                if (str2 == null) {
                    java.lang.reflect.Method method2 = this.getHighSpeedVideoFpsRanges;
                    int i2 = this.getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Field map value '");
                    sb2.append(value);
                    sb2.append("' converted to null by ");
                    sb2.append(this.getHighSpeedVideoFpsRangesFor.getClass().getName());
                    sb2.append(" for key '");
                    sb2.append(str);
                    sb2.append("'.");
                    throw retrofit2.Utils.getHighSpeedVideoSizes(method2, i2, sb2.toString(), new java.lang.Object[0]);
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    requestBuilder.Camera2StreamConfigurationMap.addEncoded(str, str2);
                } else {
                    requestBuilder.Camera2StreamConfigurationMap.add(str, str2);
                }
            }
        }

        FieldMap(java.lang.reflect.Method method, int i, retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.getHighSpeedVideoFpsRanges = method;
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRangesFor = converter;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }
    }

    static final class Part<T> extends retrofit2.ParameterHandler<T> {
        private final okhttp3.Headers Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoFpsRanges;
        private final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;
        private final retrofit2.Converter<T, okhttp3.RequestBody> getHighSpeedVideoSizes;

        Part(java.lang.reflect.Method method, int i, okhttp3.Headers headers, retrofit2.Converter<T, okhttp3.RequestBody> converter) {
            this.getHighSpeedVideoFpsRangesFor = method;
            this.getHighSpeedVideoFpsRanges = i;
            this.Camera2StreamConfigurationMap = headers;
            this.getHighSpeedVideoSizes = converter;
        }

        @Override // retrofit2.ParameterHandler
        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                okhttp3.RequestBody convert = this.getHighSpeedVideoSizes.convert(t);
                requestBuilder.getOutputFormats.addPart(this.Camera2StreamConfigurationMap, convert);
            } catch (java.io.IOException e) {
                java.lang.reflect.Method method = this.getHighSpeedVideoFpsRangesFor;
                int i = this.getHighSpeedVideoFpsRanges;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to convert ");
                sb.append(t);
                sb.append(" to RequestBody");
                throw retrofit2.Utils.getHighSpeedVideoSizes(method, i, sb.toString(), e);
            }
        }
    }

    static final class RawPart extends retrofit2.ParameterHandler<okhttp3.MultipartBody.Part> {
        static final retrofit2.ParameterHandler.RawPart getHighResolutionOutputSizeshNQ4ISI = new retrofit2.ParameterHandler.RawPart();

        @Override // retrofit2.ParameterHandler
        final /* synthetic */ void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable okhttp3.MultipartBody.Part part) throws java.io.IOException {
            okhttp3.MultipartBody.Part part2 = part;
            if (part2 != null) {
                requestBuilder.getOutputFormats.addPart(part2);
            }
        }

        private RawPart() {
        }
    }

    static final class PartMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final retrofit2.Converter<T, okhttp3.RequestBody> Camera2StreamConfigurationMap;
        private final java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.String getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;

        @Override // retrofit2.ParameterHandler
        final /* synthetic */ void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
            java.util.Map map = (java.util.Map) obj;
            if (map == null) {
                throw retrofit2.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, "Part map was null.", new java.lang.Object[0]);
            }
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                if (str == null) {
                    throw retrofit2.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, "Part map contained null key.", new java.lang.Object[0]);
                }
                java.lang.Object value = entry.getValue();
                if (value == null) {
                    java.lang.reflect.Method method = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Part map contained null value for key '");
                    sb.append(str);
                    sb.append("'.");
                    throw retrofit2.Utils.getHighSpeedVideoSizes(method, i, sb.toString(), new java.lang.Object[0]);
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("form-data; name=\"");
                sb2.append(str);
                sb2.append("\"");
                requestBuilder.getOutputFormats.addPart(okhttp3.Headers.of("Content-Disposition", sb2.toString(), "Content-Transfer-Encoding", this.getHighSpeedVideoFpsRanges), (okhttp3.RequestBody) this.Camera2StreamConfigurationMap.convert(value));
            }
        }

        PartMap(java.lang.reflect.Method method, int i, retrofit2.Converter<T, okhttp3.RequestBody> converter, java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = method;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.Camera2StreamConfigurationMap = converter;
            this.getHighSpeedVideoFpsRanges = str;
        }
    }

    static final class Body<T> extends retrofit2.ParameterHandler<T> {
        private final int Camera2StreamConfigurationMap;
        private final retrofit2.Converter<T, okhttp3.RequestBody> getHighSpeedVideoFpsRangesFor;
        private final java.lang.reflect.Method getHighSpeedVideoSizes;

        Body(java.lang.reflect.Method method, int i, retrofit2.Converter<T, okhttp3.RequestBody> converter) {
            this.getHighSpeedVideoSizes = method;
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRangesFor = converter;
        }

        @Override // retrofit2.ParameterHandler
        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) {
            if (t == null) {
                throw retrofit2.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, "Body parameter value must not be null.", new java.lang.Object[0]);
            }
            try {
                requestBuilder.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.convert(t);
            } catch (java.io.IOException e) {
                java.lang.reflect.Method method = this.getHighSpeedVideoSizes;
                int i = this.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to convert ");
                sb.append(t);
                sb.append(" to RequestBody");
                throw retrofit2.Utils.getHighSpeedVideoFpsRanges(method, e, i, sb.toString(), new java.lang.Object[0]);
            }
        }
    }

    static final class Tag<T> extends retrofit2.ParameterHandler<T> {
        final java.lang.Class<T> Camera2StreamConfigurationMap;

        Tag(java.lang.Class<T> cls) {
            this.Camera2StreamConfigurationMap = cls;
        }

        @Override // retrofit2.ParameterHandler
        final void Camera2StreamConfigurationMap(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) {
            requestBuilder.getOutputMinFrameDurationlomOqCM.tag((java.lang.Class<? super java.lang.Class<T>>) this.Camera2StreamConfigurationMap, (java.lang.Class<T>) t);
        }
    }
}
