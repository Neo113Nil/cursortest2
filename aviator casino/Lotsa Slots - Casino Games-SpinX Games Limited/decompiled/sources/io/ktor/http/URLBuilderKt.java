package io.ktor.http;

/* compiled from: URLBuilder.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a)\u0010\u0005\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000e\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\u0003*\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0017\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u0017\u001a\u00020\u0003*\u00020\u00032\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0019\"\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u001b\u001a%\u0010\u001c\u001a\u00020\n*\u00020\u00032\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0019\"\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\u001e\u001a\u00020\u0003*\u00020\u00032\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0019\"\u00020\u0007¢\u0006\u0004\b\u001e\u0010 \u001a\u0019\u0010!\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0002¢\u0006\u0004\b!\u0010\"\u001a\\\u0010)\u001a\u00020\n*\u00020\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0019\b\u0002\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0&¢\u0006\u0002\b'¢\u0006\u0004\b)\u0010*\u001a'\u0010+\u001a\u00020\u0003*\u00020\u00032\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0019\"\u00020\u0007H\u0007¢\u0006\u0004\b+\u0010 \u001a!\u0010+\u001a\u00020\u0003*\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0007¢\u0006\u0004\b+\u0010\u001f\"\u0014\u0010,\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010-\"\u0018\u00100\u001a\u00020\u0007*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0015\u00102\u001a\u00020\u0007*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b1\u0010/\"(\u0010\r\u001a\u00020\u0007*\u00020\u00032\u0006\u00103\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010/\"\u0004\b5\u00106¨\u00067"}, d2 = {"Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lio/ktor/http/URLBuilder;", "out", "appendTo", "(Lio/ktor/http/URLBuilder;Ljava/lang/Appendable;)Ljava/lang/Appendable;", "", "encodedUser", "host", "", "appendMailto", "(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;)V", "encodedPath", "appendFile", "appendPayload", "(Ljava/lang/Appendable;Ljava/lang/String;)V", "clone", "(Lio/ktor/http/URLBuilder;)Lio/ktor/http/URLBuilder;", "", "segments", "", "encodeSlash", "appendPathSegments", "(Lio/ktor/http/URLBuilder;Ljava/util/List;Z)Lio/ktor/http/URLBuilder;", "", "components", "(Lio/ktor/http/URLBuilder;[Ljava/lang/String;Z)Lio/ktor/http/URLBuilder;", "path", "(Lio/ktor/http/URLBuilder;[Ljava/lang/String;)V", "appendEncodedPathSegments", "(Lio/ktor/http/URLBuilder;Ljava/util/List;)Lio/ktor/http/URLBuilder;", "(Lio/ktor/http/URLBuilder;[Ljava/lang/String;)Lio/ktor/http/URLBuilder;", "joinPath", "(Ljava/util/List;)Ljava/lang/String;", "scheme", "", "port", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "set", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "pathComponents", "DEFAULT_PORT", "I", "getEncodedUserAndPassword", "(Lio/ktor/http/URLBuilder;)Ljava/lang/String;", "encodedUserAndPassword", "getAuthority", "authority", "value", "getEncodedPath", "setEncodedPath", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class URLBuilderKt {
    public static final int DEFAULT_PORT = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final <A extends java.lang.Appendable> A appendTo(io.ktor.http.URLBuilder uRLBuilder, A a2) {
        a2.append(uRLBuilder.getProtocol().getName());
        java.lang.String name = uRLBuilder.getProtocol().getName();
        switch (name.hashCode()) {
            case -1081572750:
                if (name.equals("mailto")) {
                    appendMailto(a2, getEncodedUserAndPassword(uRLBuilder), uRLBuilder.getHost());
                    return a2;
                }
                break;
            case 114715:
                if (name.equals("tel")) {
                    appendPayload(a2, uRLBuilder.getHost());
                    return a2;
                }
                break;
            case 3076010:
                if (name.equals("data")) {
                    appendPayload(a2, uRLBuilder.getHost());
                    return a2;
                }
                break;
            case 3143036:
                if (name.equals("file")) {
                    appendFile(a2, uRLBuilder.getHost(), getEncodedPath(uRLBuilder));
                    return a2;
                }
                break;
            case 92611469:
                if (name.equals("about")) {
                    appendPayload(a2, uRLBuilder.getHost());
                    return a2;
                }
                break;
        }
        a2.append("://");
        a2.append(getAuthority(uRLBuilder));
        io.ktor.http.URLUtilsKt.appendUrlFullPath(a2, getEncodedPath(uRLBuilder), uRLBuilder.getEncodedParameters(), uRLBuilder.getTrailingQuery());
        if (uRLBuilder.getEncodedFragment().length() > 0) {
            a2.append('#');
            a2.append(uRLBuilder.getEncodedFragment());
        }
        return a2;
    }

    private static final void appendMailto(java.lang.Appendable appendable, java.lang.String str, java.lang.String str2) {
        appendable.append(":");
        appendable.append(str);
        appendable.append(str2);
    }

    private static final void appendFile(java.lang.Appendable appendable, java.lang.String str, java.lang.String str2) {
        appendable.append("://");
        appendable.append(str);
        java.lang.String str3 = str2;
        if (!kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) str3, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 2, (java.lang.Object) null)) {
            appendable.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        }
        appendable.append(str3);
    }

    private static final void appendPayload(java.lang.Appendable appendable, java.lang.String str) {
        appendable.append(":");
        appendable.append(str);
    }

    public static final io.ktor.http.URLBuilder clone(io.ktor.http.URLBuilder uRLBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        return io.ktor.http.URLUtilsKt.takeFrom(new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, androidx.core.app.FrameMetricsAggregator.EVERY_DURATION, null), uRLBuilder);
    }

    public static final java.lang.String getEncodedUserAndPassword(io.ktor.http.URLBuilder uRLBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        io.ktor.http.URLUtilsKt.appendUserAndPassword(sb, uRLBuilder.getEncodedUser(), uRLBuilder.getEncodedPassword());
        return sb.toString();
    }

    public static /* synthetic */ io.ktor.http.URLBuilder appendPathSegments$default(io.ktor.http.URLBuilder uRLBuilder, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return appendPathSegments(uRLBuilder, (java.util.List<java.lang.String>) list, z);
    }

    public static final io.ktor.http.URLBuilder appendPathSegments(io.ktor.http.URLBuilder uRLBuilder, java.util.List<java.lang.String> segments, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segments, "segments");
        if (!z) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = segments.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, kotlin.text.StringsKt.split$default((java.lang.CharSequence) it.next(), new char[]{kotlinx.io.files.FileSystemKt.UnixPathSeparator}, false, 0, 6, (java.lang.Object) null));
            }
            segments = arrayList;
        }
        java.util.List<java.lang.String> list = segments;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(io.ktor.http.CodecsKt.encodeURLPathPart((java.lang.String) it2.next()));
        }
        appendEncodedPathSegments(uRLBuilder, arrayList2);
        return uRLBuilder;
    }

    public static /* synthetic */ io.ktor.http.URLBuilder appendPathSegments$default(io.ktor.http.URLBuilder uRLBuilder, java.lang.String[] strArr, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return appendPathSegments(uRLBuilder, strArr, z);
    }

    public static final io.ktor.http.URLBuilder appendPathSegments(io.ktor.http.URLBuilder uRLBuilder, java.lang.String[] components, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "components");
        return appendPathSegments(uRLBuilder, (java.util.List<java.lang.String>) kotlin.collections.ArraysKt.toList(components), z);
    }

    public static final io.ktor.http.URLBuilder appendEncodedPathSegments(io.ktor.http.URLBuilder uRLBuilder, java.util.List<java.lang.String> segments) {
        java.util.List<java.lang.String> plus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segments, "segments");
        boolean z = false;
        boolean z2 = uRLBuilder.getEncodedPathSegments().size() > 1 && ((java.lang.CharSequence) kotlin.collections.CollectionsKt.last((java.util.List) uRLBuilder.getEncodedPathSegments())).length() == 0 && (segments.isEmpty() ^ true);
        if (segments.size() > 1 && ((java.lang.CharSequence) kotlin.collections.CollectionsKt.first((java.util.List) segments)).length() == 0 && (!uRLBuilder.getEncodedPathSegments().isEmpty())) {
            z = true;
        }
        if (z2 && z) {
            plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.dropLast(uRLBuilder.getEncodedPathSegments(), 1), (java.lang.Iterable) kotlin.collections.CollectionsKt.drop(segments, 1));
        } else if (z2) {
            plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.dropLast(uRLBuilder.getEncodedPathSegments(), 1), (java.lang.Iterable) segments);
        } else if (z) {
            plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) uRLBuilder.getEncodedPathSegments(), (java.lang.Iterable) kotlin.collections.CollectionsKt.drop(segments, 1));
        } else {
            plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) uRLBuilder.getEncodedPathSegments(), (java.lang.Iterable) segments);
        }
        uRLBuilder.setEncodedPathSegments(plus);
        return uRLBuilder;
    }

    public static final io.ktor.http.URLBuilder appendEncodedPathSegments(io.ktor.http.URLBuilder uRLBuilder, java.lang.String... components) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "components");
        return appendEncodedPathSegments(uRLBuilder, (java.util.List<java.lang.String>) kotlin.collections.ArraysKt.toList(components));
    }

    public static final java.lang.String getAuthority(io.ktor.http.URLBuilder uRLBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getEncodedUserAndPassword(uRLBuilder));
        sb.append(uRLBuilder.getHost());
        if (uRLBuilder.getPort() != 0 && uRLBuilder.getPort() != uRLBuilder.getProtocol().getDefaultPort()) {
            sb.append(":");
            sb.append(java.lang.String.valueOf(uRLBuilder.getPort()));
        }
        return sb.toString();
    }

    public static final java.lang.String getEncodedPath(io.ktor.http.URLBuilder uRLBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        return joinPath(uRLBuilder.getEncodedPathSegments());
    }

    public static final void setEncodedPath(io.ktor.http.URLBuilder uRLBuilder, java.lang.String value) {
        java.util.List<java.lang.String> root_path;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.lang.String str = value;
        if (kotlin.text.StringsKt.isBlank(str)) {
            root_path = kotlin.collections.CollectionsKt.emptyList();
        } else {
            root_path = kotlin.jvm.internal.Intrinsics.areEqual(value, com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING) ? io.ktor.http.URLParserKt.getROOT_PATH() : kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new char[]{kotlinx.io.files.FileSystemKt.UnixPathSeparator}, false, 0, 6, (java.lang.Object) null));
        }
        uRLBuilder.setEncodedPathSegments(root_path);
    }

    private static final java.lang.String joinPath(java.util.List<java.lang.String> list) {
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((java.lang.CharSequence) kotlin.collections.CollectionsKt.first((java.util.List) list)).length() == 0 ? com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING : (java.lang.String) kotlin.collections.CollectionsKt.first((java.util.List) list);
        }
        return kotlin.collections.CollectionsKt.joinToString$default(list, com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ void set$default(io.ktor.http.URLBuilder uRLBuilder, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.URLBuilderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit unit;
                    unit = io.ktor.http.URLBuilderKt.set$lambda$5((io.ktor.http.URLBuilder) obj2);
                    return unit;
                }
            };
        }
        set(uRLBuilder, str, str2, num, str3, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit set$lambda$5(io.ktor.http.URLBuilder uRLBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static final void set(io.ktor.http.URLBuilder uRLBuilder, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1<? super io.ktor.http.URLBuilder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        if (str != null) {
            uRLBuilder.setProtocol(io.ktor.http.URLProtocol.INSTANCE.createOrDefault(str));
        }
        if (str2 != null) {
            uRLBuilder.setHost(str2);
        }
        if (num != null) {
            uRLBuilder.setPort(num.intValue());
        }
        if (str3 != null) {
            setEncodedPath(uRLBuilder, str3);
        }
        block.invoke(uRLBuilder);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Please use appendPathSegments method", replaceWith = @kotlin.ReplaceWith(expression = "this.appendPathSegments(components", imports = {}))
    public static final io.ktor.http.URLBuilder pathComponents(io.ktor.http.URLBuilder uRLBuilder, java.lang.String... components) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "components");
        return appendPathSegments$default(uRLBuilder, kotlin.collections.ArraysKt.toList(components), false, 2, (java.lang.Object) null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Please use appendPathSegments method", replaceWith = @kotlin.ReplaceWith(expression = "this.appendPathSegments(components", imports = {}))
    public static final io.ktor.http.URLBuilder pathComponents(io.ktor.http.URLBuilder uRLBuilder, java.util.List<java.lang.String> components) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "components");
        return appendPathSegments$default(uRLBuilder, (java.util.List) components, false, 2, (java.lang.Object) null);
    }

    public static final void path(io.ktor.http.URLBuilder uRLBuilder, java.lang.String... path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        java.util.ArrayList arrayList = new java.util.ArrayList(path.length);
        for (java.lang.String str : path) {
            arrayList.add(io.ktor.http.CodecsKt.encodeURLPath$default(str, false, false, 3, null));
        }
        uRLBuilder.setEncodedPathSegments(arrayList);
    }
}
