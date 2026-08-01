package io.ktor.http;

import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import io.ktor.utils.io.JvmSerializable_jvmKt;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Url.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b:\b\u0007\u0018\u0000 P2\u00060\u0001j\u0002`\u0002:\u0001PBe\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R!\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010.R\u0019\u00107\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b;\u0010:R\u0011\u0010=\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b<\u0010\u001cR\u001b\u0010@\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b?\u0010\u0016R\u001b\u0010C\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u00104\u001a\u0004\bB\u0010\u0016R\u001b\u0010F\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u00104\u001a\u0004\bE\u0010\u0016R\u001d\u0010I\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u00104\u001a\u0004\bH\u0010\u0016R\u001d\u0010L\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u00104\u001a\u0004\bK\u0010\u0016R\u001b\u0010O\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u00104\u001a\u0004\bN\u0010\u0016¨\u0006Q"}, d2 = {"Lio/ktor/http/Url;", "Ljava/io/Serializable;", "Lio/ktor/utils/io/JvmSerializable;", "Lio/ktor/http/URLProtocol;", "protocol", "", "host", "", "specifiedPort", "", "pathSegments", "Lio/ktor/http/Parameters;", "parameters", "fragment", "user", HintConstants.AUTOFILL_HINT_PASSWORD, "", "trailingQuery", "urlString", "<init>", "(Lio/ktor/http/URLProtocol;Ljava/lang/String;ILjava/util/List;Lio/ktor/http/Parameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "writeReplace", "()Ljava/lang/Object;", "Ljava/lang/String;", "getHost", "I", "getSpecifiedPort", "Lio/ktor/http/Parameters;", "getParameters", "()Lio/ktor/http/Parameters;", "getFragment", "getUser", "getPassword", "Z", "getTrailingQuery", "()Z", "Ljava/util/List;", "getPathSegments", "()Ljava/util/List;", "getPathSegments$annotations", "()V", "rawSegments", "getRawSegments", "segments$delegate", "Lkotlin/Lazy;", "getSegments", "segments", "protocolOrNull", "Lio/ktor/http/URLProtocol;", "getProtocolOrNull", "()Lio/ktor/http/URLProtocol;", "getProtocol", "getPort", "port", "encodedPath$delegate", "getEncodedPath", "encodedPath", "encodedQuery$delegate", "getEncodedQuery", "encodedQuery", "encodedPathAndQuery$delegate", "getEncodedPathAndQuery", "encodedPathAndQuery", "encodedUser$delegate", "getEncodedUser", "encodedUser", "encodedPassword$delegate", "getEncodedPassword", "encodedPassword", "encodedFragment$delegate", "getEncodedFragment", "encodedFragment", k.M, "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = UrlSerializer.class)
/* loaded from: classes7.dex */
public final class Url implements java.io.Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: encodedFragment$delegate, reason: from kotlin metadata */
    private final Lazy encodedFragment;

    /* renamed from: encodedPassword$delegate, reason: from kotlin metadata */
    private final Lazy encodedPassword;

    /* renamed from: encodedPath$delegate, reason: from kotlin metadata */
    private final Lazy encodedPath;

    /* renamed from: encodedPathAndQuery$delegate, reason: from kotlin metadata */
    private final Lazy encodedPathAndQuery;

    /* renamed from: encodedQuery$delegate, reason: from kotlin metadata */
    private final Lazy encodedQuery;

    /* renamed from: encodedUser$delegate, reason: from kotlin metadata */
    private final Lazy encodedUser;
    private final String fragment;
    private final String host;
    private final Parameters parameters;
    private final String password;
    private final List<String> pathSegments;
    private final URLProtocol protocol;
    private final URLProtocol protocolOrNull;
    private final List<String> rawSegments;

    /* renamed from: segments$delegate, reason: from kotlin metadata */
    private final Lazy segments;
    private final int specifiedPort;
    private final boolean trailingQuery;
    private final String urlString;
    private final String user;

    @Deprecated(message = "\n        `pathSegments` is deprecated.\n\n        This property will contain an empty path segment at the beginning for URLs with a hostname,\n        and an empty path segment at the end for the URLs with a trailing slash. If you need to keep this behaviour please\n        use [rawSegments]. If you only need to access the meaningful parts of the path, consider using [segments] instead.\n             \n        Please decide if you need [rawSegments] or [segments] explicitly.\n        ", replaceWith = @ReplaceWith(expression = "rawSegments", imports = {}))
    public static /* synthetic */ void getPathSegments$annotations() {
    }

    public Url(URLProtocol uRLProtocol, String host, int i, final List<String> pathSegments, Parameters parameters, String fragment, String str, String str2, boolean z, String urlString) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.host = host;
        this.specifiedPort = i;
        this.parameters = parameters;
        this.fragment = fragment;
        this.user = str;
        this.password = str2;
        this.trailingQuery = z;
        this.urlString = urlString;
        if (i < 0 || i >= 65536) {
            throw new IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i).toString());
        }
        this.pathSegments = pathSegments;
        this.rawSegments = pathSegments;
        this.segments = LazyKt.lazy(new Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List segments_delegate$lambda$1;
                segments_delegate$lambda$1 = Url.segments_delegate$lambda$1(pathSegments);
                return segments_delegate$lambda$1;
            }
        });
        this.protocolOrNull = uRLProtocol;
        this.protocol = uRLProtocol == null ? URLProtocol.INSTANCE.getHTTP() : uRLProtocol;
        this.encodedPath = LazyKt.lazy(new Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String encodedPath_delegate$lambda$3;
                encodedPath_delegate$lambda$3 = Url.encodedPath_delegate$lambda$3(pathSegments, this);
                return encodedPath_delegate$lambda$3;
            }
        });
        this.encodedQuery = LazyKt.lazy(new Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String encodedQuery_delegate$lambda$4;
                encodedQuery_delegate$lambda$4 = Url.encodedQuery_delegate$lambda$4(Url.this);
                return encodedQuery_delegate$lambda$4;
            }
        });
        this.encodedPathAndQuery = LazyKt.lazy(new Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String encodedPathAndQuery_delegate$lambda$5;
                encodedPathAndQuery_delegate$lambda$5 = Url.encodedPathAndQuery_delegate$lambda$5(Url.this);
                return encodedPathAndQuery_delegate$lambda$5;
            }
        });
        this.encodedUser = LazyKt.lazy(new Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String encodedUser_delegate$lambda$6;
                encodedUser_delegate$lambda$6 = Url.encodedUser_delegate$lambda$6(Url.this);
                return encodedUser_delegate$lambda$6;
            }
        });
        this.encodedPassword = LazyKt.lazy(new Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String encodedPassword_delegate$lambda$7;
                encodedPassword_delegate$lambda$7 = Url.encodedPassword_delegate$lambda$7(Url.this);
                return encodedPassword_delegate$lambda$7;
            }
        });
        this.encodedFragment = LazyKt.lazy(new Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String encodedFragment_delegate$lambda$8;
                encodedFragment_delegate$lambda$8 = Url.encodedFragment_delegate$lambda$8(Url.this);
                return encodedFragment_delegate$lambda$8;
            }
        });
    }

    public final String getHost() {
        return this.host;
    }

    public final int getSpecifiedPort() {
        return this.specifiedPort;
    }

    public final Parameters getParameters() {
        return this.parameters;
    }

    public final String getFragment() {
        return this.fragment;
    }

    public final String getUser() {
        return this.user;
    }

    public final String getPassword() {
        return this.password;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final List<String> getPathSegments() {
        return this.pathSegments;
    }

    public final List<String> getRawSegments() {
        return this.rawSegments;
    }

    public final List<String> getSegments() {
        return (List) this.segments.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List segments_delegate$lambda$1(List list) {
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        return list.subList((((CharSequence) CollectionsKt.first(list)).length() != 0 || list.size() <= 1) ? 0 : 1, ((CharSequence) CollectionsKt.last(list)).length() == 0 ? CollectionsKt.getLastIndex(list) : 1 + CollectionsKt.getLastIndex(list));
    }

    public final URLProtocol getProtocolOrNull() {
        return this.protocolOrNull;
    }

    public final URLProtocol getProtocol() {
        return this.protocol;
    }

    public final int getPort() {
        Integer valueOf = Integer.valueOf(this.specifiedPort);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.protocol.getDefaultPort();
    }

    public final String getEncodedPath() {
        return (String) this.encodedPath.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodedPath_delegate$lambda$3(List list, Url url) {
        int indexOf$default;
        if (list.isEmpty() || (indexOf$default = StringsKt.indexOf$default((CharSequence) url.urlString, FileSystemKt.UnixPathSeparator, url.protocol.getName().length() + 3, false, 4, (Object) null)) == -1) {
            return "";
        }
        int indexOfAny$default = StringsKt.indexOfAny$default((CharSequence) url.urlString, new char[]{'?', '#'}, indexOf$default, false, 4, (Object) null);
        if (indexOfAny$default == -1) {
            String substring = url.urlString.substring(indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        String substring2 = url.urlString.substring(indexOf$default, indexOfAny$default);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2;
    }

    public final String getEncodedQuery() {
        return (String) this.encodedQuery.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodedQuery_delegate$lambda$4(Url url) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) url.urlString, '?', 0, false, 6, (Object) null) + 1;
        if (indexOf$default == 0) {
            return "";
        }
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) url.urlString, '#', indexOf$default, false, 4, (Object) null);
        if (indexOf$default2 == -1) {
            String substring = url.urlString.substring(indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        String substring2 = url.urlString.substring(indexOf$default, indexOf$default2);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2;
    }

    public final String getEncodedPathAndQuery() {
        return (String) this.encodedPathAndQuery.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodedPathAndQuery_delegate$lambda$5(Url url) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) url.urlString, FileSystemKt.UnixPathSeparator, url.protocol.getName().length() + 3, false, 4, (Object) null);
        if (indexOf$default == -1) {
            return "";
        }
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) url.urlString, '#', indexOf$default, false, 4, (Object) null);
        if (indexOf$default2 == -1) {
            String substring = url.urlString.substring(indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        String substring2 = url.urlString.substring(indexOf$default, indexOf$default2);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2;
    }

    public final String getEncodedUser() {
        return (String) this.encodedUser.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodedUser_delegate$lambda$6(Url url) {
        String str = url.user;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int length = url.protocol.getName().length() + 3;
        String substring = url.urlString.substring(length, StringsKt.indexOfAny$default((CharSequence) url.urlString, new char[]{AbstractJsonLexerKt.COLON, '@'}, length, false, 4, (Object) null));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String getEncodedPassword() {
        return (String) this.encodedPassword.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodedPassword_delegate$lambda$7(Url url) {
        String str = url.password;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        String substring = url.urlString.substring(StringsKt.indexOf$default((CharSequence) url.urlString, AbstractJsonLexerKt.COLON, url.protocol.getName().length() + 3, false, 4, (Object) null) + 1, StringsKt.indexOf$default((CharSequence) url.urlString, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String getEncodedFragment() {
        return (String) this.encodedFragment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodedFragment_delegate$lambda$8(Url url) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) url.urlString, '#', 0, false, 6, (Object) null) + 1;
        if (indexOf$default == 0) {
            return "";
        }
        String substring = url.urlString.substring(indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    /* renamed from: toString, reason: from getter */
    public String getUrlString() {
        return this.urlString;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.urlString, ((Url) other).urlString);
    }

    public int hashCode() {
        return this.urlString.hashCode();
    }

    private final Object writeReplace() {
        return JvmSerializable_jvmKt.JvmSerializerReplacement(UrlJvmSerializer.INSTANCE, this);
    }

    /* compiled from: Url.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/Url$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lio/ktor/http/Url;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Url> serializer() {
            return UrlSerializer.INSTANCE;
        }
    }
}
