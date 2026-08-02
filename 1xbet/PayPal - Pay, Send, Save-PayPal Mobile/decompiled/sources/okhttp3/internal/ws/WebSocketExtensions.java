package okhttp3.internal.ws;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010JP\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010!R\u0011\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\t\u0010!"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "", "perMessageDeflate", "", "clientMaxWindowBits", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "clientOriginated", "noContextTakeover", "(Z)Z", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/lang/Integer;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WebSocketExtensions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.ws.WebSocketExtensions.Companion INSTANCE = new okhttp3.internal.ws.WebSocketExtensions.Companion(null);
    public final java.lang.Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final java.lang.Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public WebSocketExtensions(boolean z, java.lang.Integer num, boolean z2, java.lang.Integer num2, boolean z3, boolean z4) {
        this.perMessageDeflate = z;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z2;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z3;
        this.unknownValues = z4;
    }

    public /* synthetic */ WebSocketExtensions(boolean z, java.lang.Integer num, boolean z2, java.lang.Integer num2, boolean z3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }

    public final boolean noContextTakeover(boolean clientOriginated) {
        if (clientOriginated) {
            return this.clientNoContextTakeover;
        }
        return this.serverNoContextTakeover;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "<init>", "()V", "Lokhttp3/Headers;", "responseHeaders", "Lokhttp3/internal/ws/WebSocketExtensions;", "parse", "(Lokhttp3/Headers;)Lokhttp3/internal/ws/WebSocketExtensions;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        
            if (r6 != false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r12 >= r14) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
        
            r2 = okhttp3.internal._UtilCommonKt.delimiterOffset(r5, ';', r12, r14);
            r3 = okhttp3.internal._UtilCommonKt.delimiterOffset(r5, '=', r12, r2);
            r6 = okhttp3.internal._UtilCommonKt.trimSubstring(r5, r12, r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        
            if (r3 >= r2) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        
            r3 = kotlin.text.StringsKt.removeSurrounding(okhttp3.internal._UtilCommonKt.trimSubstring(r5, r3 + 1, r2), (java.lang.CharSequence) "\"");
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        
            r12 = r2 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        
            if (kotlin.text.StringsKt.equals(r6, "client_max_window_bits", true) == false) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        
            if (kotlin.text.StringsKt.equals(r6, "client_no_context_takeover", true) == false) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
        
            if (kotlin.text.StringsKt.equals(r6, "server_max_window_bits", true) == false) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
        
            if (kotlin.text.StringsKt.equals(r6, "server_no_context_takeover", true) == false) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
        
            if (r10 == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
        
            if (r3 == null) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
        
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
        
            if (r9 == null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
        
            if (r3 == null) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:
        
            r2 = kotlin.text.StringsKt.toIntOrNull(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
        
            r9 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
        
            if (r2 != null) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00b2, code lost:
        
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0098, code lost:
        
            if (r8 == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x009a, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009b, code lost:
        
            if (r3 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x009e, code lost:
        
            r8 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0081, code lost:
        
            if (r7 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0083, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0084, code lost:
        
            if (r3 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0086, code lost:
        
            r2 = kotlin.text.StringsKt.toIntOrNull(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x008c, code lost:
        
            r7 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x008d, code lost:
        
            if (r2 != null) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x008b, code lost:
        
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0076, code lost:
        
            r3 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x00c9, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00c7 -> B:12:0x0055). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final okhttp3.internal.ws.WebSocketExtensions parse(okhttp3.Headers responseHeaders) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseHeaders, "");
            int size = responseHeaders.size();
            boolean z = false;
            java.lang.Integer num = null;
            boolean z2 = false;
            java.lang.Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < size; i++) {
                if (kotlin.text.StringsKt.equals(responseHeaders.name(i), com.google.common.net.HttpHeaders.SEC_WEBSOCKET_EXTENSIONS, true)) {
                    java.lang.String value = responseHeaders.value(i);
                    int i2 = 0;
                    while (i2 < value.length()) {
                        int delimiterOffset$default = okhttp3.internal._UtilCommonKt.delimiterOffset$default(value, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA, i2, 0, 4, (java.lang.Object) null);
                        int delimiterOffset = okhttp3.internal._UtilCommonKt.delimiterOffset(value, ';', i2, delimiterOffset$default);
                        java.lang.String trimSubstring = okhttp3.internal._UtilCommonKt.trimSubstring(value, i2, delimiterOffset);
                        int i3 = delimiterOffset + 1;
                        if (kotlin.text.StringsKt.equals(trimSubstring, "permessage-deflate", true)) {
                            i2 = i3;
                        } else {
                            i2 = i3;
                            z4 = true;
                        }
                    }
                }
            }
            return new okhttp3.internal.ws.WebSocketExtensions(z, num, z2, num2, z3, z4);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.perMessageDeflate);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.clientMaxWindowBits);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.clientNoContextTakeover);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.serverMaxWindowBits);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.serverNoContextTakeover);
        sb.append(", unknownValues=");
        sb.append(this.unknownValues);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.perMessageDeflate);
        java.lang.Integer num = this.clientMaxWindowBits;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.clientNoContextTakeover);
        java.lang.Integer num2 = this.serverMaxWindowBits;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.serverNoContextTakeover)) * 31) + java.lang.Boolean.hashCode(this.unknownValues);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof okhttp3.internal.ws.WebSocketExtensions)) {
            return false;
        }
        okhttp3.internal.ws.WebSocketExtensions webSocketExtensions = (okhttp3.internal.ws.WebSocketExtensions) other;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && kotlin.jvm.internal.Intrinsics.areEqual(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && kotlin.jvm.internal.Intrinsics.areEqual(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    public final okhttp3.internal.ws.WebSocketExtensions copy(boolean perMessageDeflate, java.lang.Integer clientMaxWindowBits, boolean clientNoContextTakeover, java.lang.Integer serverMaxWindowBits, boolean serverNoContextTakeover, boolean unknownValues) {
        return new okhttp3.internal.ws.WebSocketExtensions(perMessageDeflate, clientMaxWindowBits, clientNoContextTakeover, serverMaxWindowBits, serverNoContextTakeover, unknownValues);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUnknownValues() {
        return this.unknownValues;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getServerNoContextTakeover() {
        return this.serverNoContextTakeover;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getServerMaxWindowBits() {
        return this.serverMaxWindowBits;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getClientNoContextTakeover() {
        return this.clientNoContextTakeover;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getClientMaxWindowBits() {
        return this.clientMaxWindowBits;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPerMessageDeflate() {
        return this.perMessageDeflate;
    }

    public static /* synthetic */ okhttp3.internal.ws.WebSocketExtensions copy$default(okhttp3.internal.ws.WebSocketExtensions webSocketExtensions, boolean z, java.lang.Integer num, boolean z2, java.lang.Integer num2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = webSocketExtensions.perMessageDeflate;
        }
        if ((i & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        java.lang.Integer num3 = num;
        if ((i & 4) != 0) {
            z2 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        java.lang.Integer num4 = num2;
        if ((i & 16) != 0) {
            z3 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            z4 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z, num3, z5, num4, z6, z4);
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }
}
