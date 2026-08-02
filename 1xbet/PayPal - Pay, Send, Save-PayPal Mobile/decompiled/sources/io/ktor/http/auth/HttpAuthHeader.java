package io.ktor.http.auth;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u000f2\u00020\u0001:\u0004\u0010\u0011\u000f\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\n\u0082\u0001\u0002\u0013\u0014"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "Lio/ktor/http/auth/HeaderValueEncoding;", "encoding", "render", "(Lio/ktor/http/auth/HeaderValueEncoding;)Ljava/lang/String;", "()Ljava/lang/String;", "toString", "authScheme", "Ljava/lang/String;", "getAuthScheme", "Companion", "Single", "Parameterized", "Parameters", "Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "Lio/ktor/http/auth/HttpAuthHeader$Single;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class HttpAuthHeader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.auth.HttpAuthHeader.Companion INSTANCE = new io.ktor.http.auth.HttpAuthHeader.Companion(null);
    private final java.lang.String authScheme;

    public abstract java.lang.String render();

    public abstract java.lang.String render(io.ktor.http.auth.HeaderValueEncoding encoding);

    private HttpAuthHeader(java.lang.String str) {
        kotlin.text.Regex regex;
        this.authScheme = str;
        regex = io.ktor.http.auth.HttpAuthHeaderKt.getHighResolutionOutputSizeshNQ4ISI;
        if (!regex.matches(str)) {
            throw new io.ktor.http.parsing.ParseException("Invalid authScheme value: it should be token, but instead it is ".concat(java.lang.String.valueOf(str)), null, 2, null);
        }
    }

    public final java.lang.String getAuthScheme() {
        return this.authScheme;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Single;", "Lio/ktor/http/auth/HttpAuthHeader;", "", "authScheme", "blob", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "render", "()Ljava/lang/String;", "Lio/ktor/http/auth/HeaderValueEncoding;", "encoding", "(Lio/ktor/http/auth/HeaderValueEncoding;)Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getBlob"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Single extends io.ktor.http.auth.HttpAuthHeader {
        private final java.lang.String blob;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Single(java.lang.String str, java.lang.String str2) {
            super(str, null);
            kotlin.text.Regex regex;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.blob = str2;
            regex = io.ktor.http.auth.HttpAuthHeaderKt.getHighResolutionOutputSizeshNQ4ISI;
            if (!regex.matches(str2)) {
                throw new io.ktor.http.parsing.ParseException("Invalid blob value: it should be token68", null, 2, null);
            }
        }

        public final java.lang.String getBlob() {
            return this.blob;
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public final java.lang.String render() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAuthScheme());
            sb.append(' ');
            sb.append(this.blob);
            return sb.toString();
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public final java.lang.String render(io.ktor.http.auth.HeaderValueEncoding encoding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoding, "");
            return render();
        }

        public final boolean equals(java.lang.Object other) {
            if (!(other instanceof io.ktor.http.auth.HttpAuthHeader.Single)) {
                return false;
            }
            io.ktor.http.auth.HttpAuthHeader.Single single = (io.ktor.http.auth.HttpAuthHeader.Single) other;
            return kotlin.text.StringsKt.equals(single.getAuthScheme(), getAuthScheme(), true) && kotlin.text.StringsKt.equals(single.blob, this.blob, true);
        }

        public final int hashCode() {
            io.ktor.util.Hash hash = io.ktor.util.Hash.INSTANCE;
            java.lang.String lowerCase = getAuthScheme().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String lowerCase2 = this.blob.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return hash.combine(lowerCase, lowerCase2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "Lio/ktor/http/auth/HttpAuthHeader;", "", "authScheme", "", "Lio/ktor/http/HeaderValueParam;", "parameters", "Lio/ktor/http/auth/HeaderValueEncoding;", "encoding", "<init>", "(Ljava/lang/String;Ljava/util/List;Lio/ktor/http/auth/HeaderValueEncoding;)V", "", "(Ljava/lang/String;Ljava/util/Map;Lio/ktor/http/auth/HeaderValueEncoding;)V", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "withParameter", "(Ljava/lang/String;Ljava/lang/String;)Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "withReplacedParameter", "render", "(Lio/ktor/http/auth/HeaderValueEncoding;)Ljava/lang/String;", "parameter", "(Ljava/lang/String;)Ljava/lang/String;", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "Lio/ktor/http/auth/HeaderValueEncoding;", "getEncoding", "()Lio/ktor/http/auth/HeaderValueEncoding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Parameterized extends io.ktor.http.auth.HttpAuthHeader {
        private final io.ktor.http.auth.HeaderValueEncoding encoding;
        private final java.util.List<io.ktor.http.HeaderValueParam> parameters;

        public final java.util.List<io.ktor.http.HeaderValueParam> getParameters() {
            return this.parameters;
        }

        public /* synthetic */ Parameterized(java.lang.String str, java.util.List list, io.ktor.http.auth.HeaderValueEncoding headerValueEncoding, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (java.util.List<io.ktor.http.HeaderValueParam>) list, (i & 4) != 0 ? io.ktor.http.auth.HeaderValueEncoding.QUOTED_WHEN_REQUIRED : headerValueEncoding);
        }

        public final io.ktor.http.auth.HeaderValueEncoding getEncoding() {
            return this.encoding;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Parameterized(java.lang.String str, java.util.List<io.ktor.http.HeaderValueParam> list, io.ktor.http.auth.HeaderValueEncoding headerValueEncoding) {
            super(str, null);
            kotlin.text.Regex regex;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValueEncoding, "");
            this.parameters = list;
            this.encoding = headerValueEncoding;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.lang.String name2 = ((io.ktor.http.HeaderValueParam) it.next()).getName();
                regex = io.ktor.http.auth.HttpAuthHeaderKt.getHighResolutionOutputSizeshNQ4ISI;
                if (!regex.matches(name2)) {
                    throw new io.ktor.http.parsing.ParseException("Parameter name should be a token", null, 2, null);
                }
            }
        }

        public /* synthetic */ Parameterized(java.lang.String str, java.util.Map map, io.ktor.http.auth.HeaderValueEncoding headerValueEncoding, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (java.util.Map<java.lang.String, java.lang.String>) map, (i & 4) != 0 ? io.ktor.http.auth.HeaderValueEncoding.QUOTED_WHEN_REQUIRED : headerValueEncoding);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Parameterized(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, io.ktor.http.auth.HeaderValueEncoding headerValueEncoding) {
            this(str, r0, headerValueEncoding);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValueEncoding, "");
            java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> entrySet = map.entrySet();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entrySet, 10));
            java.util.Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                arrayList.add(new io.ktor.http.HeaderValueParam((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue()));
            }
        }

        public final io.ktor.http.auth.HttpAuthHeader.Parameterized withParameter(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new io.ktor.http.auth.HttpAuthHeader.Parameterized(getAuthScheme(), (java.util.List<io.ktor.http.HeaderValueParam>) kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends io.ktor.http.HeaderValueParam>) this.parameters, new io.ktor.http.HeaderValueParam(name2, value)), this.encoding);
        }

        public final io.ktor.http.auth.HttpAuthHeader.Parameterized withReplacedParameter(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<io.ktor.http.HeaderValueParam> it = this.parameters.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(it.next().getName(), name2)) {
                    i++;
                } else if (i != -1) {
                    java.util.List<io.ktor.http.HeaderValueParam> list = this.parameters;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (io.ktor.http.HeaderValueParam headerValueParam : list) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(headerValueParam.getName(), name2)) {
                            if (z) {
                                headerValueParam = null;
                            } else {
                                headerValueParam = new io.ktor.http.HeaderValueParam(name2, value);
                                z = true;
                            }
                        }
                        if (headerValueParam != null) {
                            arrayList.add(headerValueParam);
                        }
                    }
                    return new io.ktor.http.auth.HttpAuthHeader.Parameterized(getAuthScheme(), arrayList, this.encoding);
                }
            }
            return withParameter(name2, value);
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public final java.lang.String render(final io.ktor.http.auth.HeaderValueEncoding encoding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoding, "");
            if (this.parameters.isEmpty()) {
                return getAuthScheme();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAuthScheme());
            sb.append(' ');
            return kotlin.collections.CollectionsKt.joinToString$default(this.parameters, ", ", sb.toString(), null, 0, null, new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.auth.HttpAuthHeader$Parameterized$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return io.ktor.http.auth.HttpAuthHeader.Parameterized.m23358$r8$lambda$F3Vztg_9d4qnZbGvEoMUShC1Co(io.ktor.http.auth.HttpAuthHeader.Parameterized.this, encoding, (io.ktor.http.HeaderValueParam) obj);
                }
            }, 28, null);
        }

        public final java.lang.String parameter(java.lang.String name2) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            java.util.Iterator<T> it = this.parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.http.HeaderValueParam) obj).getName(), name2)) {
                    break;
                }
            }
            io.ktor.http.HeaderValueParam headerValueParam = (io.ktor.http.HeaderValueParam) obj;
            if (headerValueParam != null) {
                return headerValueParam.getValue();
            }
            return null;
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public final java.lang.String render() {
            return render(this.encoding);
        }

        public final boolean equals(java.lang.Object other) {
            if (!(other instanceof io.ktor.http.auth.HttpAuthHeader.Parameterized)) {
                return false;
            }
            io.ktor.http.auth.HttpAuthHeader.Parameterized parameterized = (io.ktor.http.auth.HttpAuthHeader.Parameterized) other;
            return kotlin.text.StringsKt.equals(parameterized.getAuthScheme(), getAuthScheme(), true) && kotlin.jvm.internal.Intrinsics.areEqual(parameterized.parameters, this.parameters);
        }

        public final int hashCode() {
            io.ktor.util.Hash hash = io.ktor.util.Hash.INSTANCE;
            java.lang.String lowerCase = getAuthScheme().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return hash.combine(lowerCase, this.parameters);
        }

        /* renamed from: $r8$lambda$F3Vztg_9d4q-nZbGvEoMUShC1Co, reason: not valid java name */
        public static /* synthetic */ java.lang.CharSequence m23358$r8$lambda$F3Vztg_9d4qnZbGvEoMUShC1Co(io.ktor.http.auth.HttpAuthHeader.Parameterized parameterized, io.ktor.http.auth.HeaderValueEncoding headerValueEncoding, io.ktor.http.HeaderValueParam headerValueParam) {
            java.lang.String escapeIfNeeded;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValueParam, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(headerValueParam.getName());
            sb.append('=');
            java.lang.String value = headerValueParam.getValue();
            int i = io.ktor.http.auth.HttpAuthHeader.Parameterized.WhenMappings.$EnumSwitchMapping$0[headerValueEncoding.ordinal()];
            if (i == 1) {
                escapeIfNeeded = io.ktor.http.HeaderValueWithParametersKt.escapeIfNeeded(value);
            } else if (i == 2) {
                escapeIfNeeded = io.ktor.http.HeaderValueWithParametersKt.quote(value);
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                escapeIfNeeded = io.ktor.http.CodecsKt.encodeURLParameter$default(value, false, 1, null);
            }
            sb.append(escapeIfNeeded);
            return sb.toString();
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[io.ktor.http.auth.HeaderValueEncoding.values().length];
                try {
                    iArr[io.ktor.http.auth.HeaderValueEncoding.QUOTED_WHEN_REQUIRED.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[io.ktor.http.auth.HeaderValueEncoding.QUOTED_ALWAYS.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[io.ktor.http.auth.HeaderValueEncoding.URI_ENCODE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    public java.lang.String toString() {
        return render();
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJQ\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Companion;", "", "<init>", "()V", "", io.ktor.http.auth.HttpAuthHeader.Parameters.Realm, "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Camera2StreamConfigurationMap;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "basicAuthChallenge", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "scheme", "Lio/ktor/http/auth/HttpAuthHeader;", "bearerAuthChallenge", "(Ljava/lang/String;Ljava/lang/String;)Lio/ktor/http/auth/HttpAuthHeader;", "nonce", "", "domain", "opaque", "", "stale", "algorithm", "digestAuthChallenge", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lio/ktor/http/auth/HttpAuthHeader$Parameterized;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final io.ktor.http.auth.HttpAuthHeader.Parameterized basicAuthChallenge(java.lang.String realm, java.nio.charset.Charset charset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realm, "");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put(io.ktor.http.auth.HttpAuthHeader.Parameters.Realm, realm);
            if (charset != null) {
                linkedHashMap.put(io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, io.ktor.utils.io.charsets.CharsetJVMKt.getName(charset));
            }
            return new io.ktor.http.auth.HttpAuthHeader.Parameterized(io.ktor.http.auth.AuthScheme.Basic, linkedHashMap, (io.ktor.http.auth.HeaderValueEncoding) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public static /* synthetic */ io.ktor.http.auth.HttpAuthHeader bearerAuthChallenge$default(io.ktor.http.auth.HttpAuthHeader.Companion companion, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.bearerAuthChallenge(str, str2);
        }

        public final io.ktor.http.auth.HttpAuthHeader bearerAuthChallenge(java.lang.String scheme, java.lang.String realm) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "");
            return new io.ktor.http.auth.HttpAuthHeader.Parameterized(scheme, realm == null ? kotlin.collections.MapsKt.emptyMap() : kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(io.ktor.http.auth.HttpAuthHeader.Parameters.Realm, realm)), (io.ktor.http.auth.HeaderValueEncoding) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public static /* synthetic */ io.ktor.http.auth.HttpAuthHeader.Parameterized digestAuthChallenge$default(io.ktor.http.auth.HttpAuthHeader.Companion companion, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = io.ktor.util.CryptoKt.generateNonce();
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                list = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List list2 = list;
            java.lang.String str6 = (i & 8) != 0 ? null : str3;
            java.lang.Boolean bool2 = (i & 16) != 0 ? null : bool;
            if ((i & 32) != 0) {
                str4 = "MD5";
            }
            return companion.digestAuthChallenge(str, str5, list2, str6, bool2, str4);
        }

        public final io.ktor.http.auth.HttpAuthHeader.Parameterized digestAuthChallenge(java.lang.String realm, java.lang.String nonce, java.util.List<java.lang.String> domain, java.lang.String opaque, java.lang.Boolean stale, java.lang.String algorithm) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realm, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put(io.ktor.http.auth.HttpAuthHeader.Parameters.Realm, io.ktor.http.HeaderValueWithParametersKt.quote(realm));
            linkedHashMap.put("nonce", io.ktor.http.HeaderValueWithParametersKt.quote(nonce));
            if (!domain.isEmpty()) {
                linkedHashMap.put("domain", io.ktor.http.HeaderValueWithParametersKt.quote(kotlin.collections.CollectionsKt.joinToString$default(domain, " ", null, null, 0, null, null, 62, null)));
            }
            if (opaque != null) {
                linkedHashMap.put("opaque", io.ktor.http.HeaderValueWithParametersKt.quote(opaque));
            }
            if (stale != null) {
                linkedHashMap.put("stale", stale.toString());
            }
            linkedHashMap.put("algorithm", algorithm);
            return new io.ktor.http.auth.HttpAuthHeader.Parameterized(io.ktor.http.auth.AuthScheme.Digest, linkedHashMap, io.ktor.http.auth.HeaderValueEncoding.QUOTED_WHEN_REQUIRED);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Parameters;", "", "<init>", "()V", "", "Realm", "Ljava/lang/String;", "Charset", "OAuthCallback", "OAuthConsumerKey", "OAuthNonce", "OAuthToken", "OAuthTokenSecret", "OAuthVerifier", "OAuthSignatureMethod", "OAuthTimestamp", "OAuthVersion", "OAuthSignature", "OAuthCallbackConfirmed"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Parameters {
        public static final java.lang.String Charset = "charset";
        public static final io.ktor.http.auth.HttpAuthHeader.Parameters INSTANCE = new io.ktor.http.auth.HttpAuthHeader.Parameters();
        public static final java.lang.String OAuthCallback = "oauth_callback";
        public static final java.lang.String OAuthCallbackConfirmed = "oauth_callback_confirmed";
        public static final java.lang.String OAuthConsumerKey = "oauth_consumer_key";
        public static final java.lang.String OAuthNonce = "oauth_nonce";
        public static final java.lang.String OAuthSignature = "oauth_signature";
        public static final java.lang.String OAuthSignatureMethod = "oauth_signature_method";
        public static final java.lang.String OAuthTimestamp = "oauth_timestamp";
        public static final java.lang.String OAuthToken = "oauth_token";
        public static final java.lang.String OAuthTokenSecret = "oauth_token_secret";
        public static final java.lang.String OAuthVerifier = "oauth_verifier";
        public static final java.lang.String OAuthVersion = "oauth_version";
        public static final java.lang.String Realm = "realm";

        private Parameters() {
        }
    }

    public /* synthetic */ HttpAuthHeader(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
