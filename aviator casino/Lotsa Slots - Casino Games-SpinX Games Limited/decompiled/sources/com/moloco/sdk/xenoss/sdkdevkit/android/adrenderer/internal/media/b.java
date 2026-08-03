package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a {
    public static final int f = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l f7463a;
    public final com.moloco.sdk.internal.services.u b;
    public final com.moloco.sdk.internal.error.b c;
    public final io.ktor.client.HttpClient d;
    public final java.lang.String e;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.ChunkedMediaDownloaderImpl", f = "ChunkedMediaDownloader.kt", i = {0, 0, 0, 1, 1, 1}, l = {294, 294}, m = "downloadFullFile", n = {"this", "dstFile", com.ironsource.Ve.n, "this", "dstFile", com.ironsource.Ve.n}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7464a;
        public java.lang.Object b;
        public java.lang.Object c;
        public /* synthetic */ java.lang.Object d;
        public int f;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.a((java.io.File) null, (io.ktor.client.statement.HttpResponse) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.ChunkedMediaDownloaderImpl$downloadMedia$2", f = "ChunkedMediaDownloader.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {95, 106, 138, 149}, m = "invokeSuspend", n = {"previousEtag", "maxRange", "remainingBytes", "previousBytes", "chunk", "previousEtag", "maxRange", "remainingBytes", "previousBytes", "chunk", "previousEtag", "maxRange", "hasMoreData", "remainingBytes", "previousBytes", "chunk", "previousEtag", "maxRange", "remainingBytes", "previousBytes", "chunk"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "L$0", "I$0", "I$1", "J$0", "I$2", "L$0", "I$0", "I$1", "I$2", "J$0", "I$3", "L$0", "I$0", "I$1", "J$0", "I$2"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$b, reason: collision with other inner class name */
    public static final class C0233b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7465a;
        public int b;
        public int c;
        public int d;
        public long e;
        public java.lang.Object f;
        public int g;
        public final /* synthetic */ java.lang.String i;
        public final /* synthetic */ java.io.File j;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a k;
        public final /* synthetic */ java.lang.String l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0233b(java.lang.String str, java.io.File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar, java.lang.String str2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.C0233b> continuation) {
            super(2, continuation);
            this.i = str;
            this.j = file;
            this.k = aVar;
            this.l = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.C0233b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.new C0233b(this.i, this.j, this.k, this.l, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0167 A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:9:0x002d, B:14:0x0167, B:20:0x0186, B:22:0x018e, B:24:0x0192, B:25:0x019c, B:27:0x019f, B:31:0x01f7, B:34:0x0208, B:36:0x0263, B:38:0x02bd, B:39:0x02c4, B:42:0x030e, B:45:0x0343, B:49:0x0361, B:51:0x0365, B:53:0x037d, B:55:0x0393, B:61:0x02f0, B:62:0x03af, B:63:0x03b4, B:65:0x03b5, B:69:0x0413, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b0, B:87:0x00ba, B:89:0x00ce, B:91:0x00d6, B:92:0x00fb, B:94:0x00ff, B:95:0x0108, B:97:0x0136, B:99:0x0156, B:104:0x00de), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x018e A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:9:0x002d, B:14:0x0167, B:20:0x0186, B:22:0x018e, B:24:0x0192, B:25:0x019c, B:27:0x019f, B:31:0x01f7, B:34:0x0208, B:36:0x0263, B:38:0x02bd, B:39:0x02c4, B:42:0x030e, B:45:0x0343, B:49:0x0361, B:51:0x0365, B:53:0x037d, B:55:0x0393, B:61:0x02f0, B:62:0x03af, B:63:0x03b4, B:65:0x03b5, B:69:0x0413, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b0, B:87:0x00ba, B:89:0x00ce, B:91:0x00d6, B:92:0x00fb, B:94:0x00ff, B:95:0x0108, B:97:0x0136, B:99:0x0156, B:104:0x00de), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x019f A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:9:0x002d, B:14:0x0167, B:20:0x0186, B:22:0x018e, B:24:0x0192, B:25:0x019c, B:27:0x019f, B:31:0x01f7, B:34:0x0208, B:36:0x0263, B:38:0x02bd, B:39:0x02c4, B:42:0x030e, B:45:0x0343, B:49:0x0361, B:51:0x0365, B:53:0x037d, B:55:0x0393, B:61:0x02f0, B:62:0x03af, B:63:0x03b4, B:65:0x03b5, B:69:0x0413, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b0, B:87:0x00ba, B:89:0x00ce, B:91:0x00d6, B:92:0x00fb, B:94:0x00ff, B:95:0x0108, B:97:0x0136, B:99:0x0156, B:104:0x00de), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0207 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0208 A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:9:0x002d, B:14:0x0167, B:20:0x0186, B:22:0x018e, B:24:0x0192, B:25:0x019c, B:27:0x019f, B:31:0x01f7, B:34:0x0208, B:36:0x0263, B:38:0x02bd, B:39:0x02c4, B:42:0x030e, B:45:0x0343, B:49:0x0361, B:51:0x0365, B:53:0x037d, B:55:0x0393, B:61:0x02f0, B:62:0x03af, B:63:0x03b4, B:65:0x03b5, B:69:0x0413, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b0, B:87:0x00ba, B:89:0x00ce, B:91:0x00d6, B:92:0x00fb, B:94:0x00ff, B:95:0x0108, B:97:0x0136, B:99:0x0156, B:104:0x00de), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0365 A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:9:0x002d, B:14:0x0167, B:20:0x0186, B:22:0x018e, B:24:0x0192, B:25:0x019c, B:27:0x019f, B:31:0x01f7, B:34:0x0208, B:36:0x0263, B:38:0x02bd, B:39:0x02c4, B:42:0x030e, B:45:0x0343, B:49:0x0361, B:51:0x0365, B:53:0x037d, B:55:0x0393, B:61:0x02f0, B:62:0x03af, B:63:0x03b4, B:65:0x03b5, B:69:0x0413, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b0, B:87:0x00ba, B:89:0x00ce, B:91:0x00d6, B:92:0x00fb, B:94:0x00ff, B:95:0x0108, B:97:0x0136, B:99:0x0156, B:104:0x00de), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x037d A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:9:0x002d, B:14:0x0167, B:20:0x0186, B:22:0x018e, B:24:0x0192, B:25:0x019c, B:27:0x019f, B:31:0x01f7, B:34:0x0208, B:36:0x0263, B:38:0x02bd, B:39:0x02c4, B:42:0x030e, B:45:0x0343, B:49:0x0361, B:51:0x0365, B:53:0x037d, B:55:0x0393, B:61:0x02f0, B:62:0x03af, B:63:0x03b4, B:65:0x03b5, B:69:0x0413, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b0, B:87:0x00ba, B:89:0x00ce, B:91:0x00d6, B:92:0x00fb, B:94:0x00ff, B:95:0x0108, B:97:0x0136, B:99:0x0156, B:104:0x00de), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0393 A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:9:0x002d, B:14:0x0167, B:20:0x0186, B:22:0x018e, B:24:0x0192, B:25:0x019c, B:27:0x019f, B:31:0x01f7, B:34:0x0208, B:36:0x0263, B:38:0x02bd, B:39:0x02c4, B:42:0x030e, B:45:0x0343, B:49:0x0361, B:51:0x0365, B:53:0x037d, B:55:0x0393, B:61:0x02f0, B:62:0x03af, B:63:0x03b4, B:65:0x03b5, B:69:0x0413, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b0, B:87:0x00ba, B:89:0x00ce, B:91:0x00d6, B:92:0x00fb, B:94:0x00ff, B:95:0x0108, B:97:0x0136, B:99:0x0156, B:104:0x00de), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0379  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0413 A[Catch: Exception -> 0x041e, TRY_LEAVE, TryCatch #0 {Exception -> 0x041e, blocks: (B:9:0x002d, B:14:0x0167, B:20:0x0186, B:22:0x018e, B:24:0x0192, B:25:0x019c, B:27:0x019f, B:31:0x01f7, B:34:0x0208, B:36:0x0263, B:38:0x02bd, B:39:0x02c4, B:42:0x030e, B:45:0x0343, B:49:0x0361, B:51:0x0365, B:53:0x037d, B:55:0x0393, B:61:0x02f0, B:62:0x03af, B:63:0x03b4, B:65:0x03b5, B:69:0x0413, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b0, B:87:0x00ba, B:89:0x00ce, B:91:0x00d6, B:92:0x00fb, B:94:0x00ff, B:95:0x0108, B:97:0x0136, B:99:0x0156, B:104:0x00de), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x00ff A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:9:0x002d, B:14:0x0167, B:20:0x0186, B:22:0x018e, B:24:0x0192, B:25:0x019c, B:27:0x019f, B:31:0x01f7, B:34:0x0208, B:36:0x0263, B:38:0x02bd, B:39:0x02c4, B:42:0x030e, B:45:0x0343, B:49:0x0361, B:51:0x0365, B:53:0x037d, B:55:0x0393, B:61:0x02f0, B:62:0x03af, B:63:0x03b4, B:65:0x03b5, B:69:0x0413, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b0, B:87:0x00ba, B:89:0x00ce, B:91:0x00d6, B:92:0x00fb, B:94:0x00ff, B:95:0x0108, B:97:0x0136, B:99:0x0156, B:104:0x00de), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0136 A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:9:0x002d, B:14:0x0167, B:20:0x0186, B:22:0x018e, B:24:0x0192, B:25:0x019c, B:27:0x019f, B:31:0x01f7, B:34:0x0208, B:36:0x0263, B:38:0x02bd, B:39:0x02c4, B:42:0x030e, B:45:0x0343, B:49:0x0361, B:51:0x0365, B:53:0x037d, B:55:0x0393, B:61:0x02f0, B:62:0x03af, B:63:0x03b4, B:65:0x03b5, B:69:0x0413, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b0, B:87:0x00ba, B:89:0x00ce, B:91:0x00d6, B:92:0x00fb, B:94:0x00ff, B:95:0x0108, B:97:0x0136, B:99:0x0156, B:104:0x00de), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0156 A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:9:0x002d, B:14:0x0167, B:20:0x0186, B:22:0x018e, B:24:0x0192, B:25:0x019c, B:27:0x019f, B:31:0x01f7, B:34:0x0208, B:36:0x0263, B:38:0x02bd, B:39:0x02c4, B:42:0x030e, B:45:0x0343, B:49:0x0361, B:51:0x0365, B:53:0x037d, B:55:0x0393, B:61:0x02f0, B:62:0x03af, B:63:0x03b4, B:65:0x03b5, B:69:0x0413, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b0, B:87:0x00ba, B:89:0x00ce, B:91:0x00d6, B:92:0x00fb, B:94:0x00ff, B:95:0x0108, B:97:0x0136, B:99:0x0156, B:104:0x00de), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0409 -> B:11:0x040b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int i;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar;
            long length;
            java.lang.String str;
            int i2;
            java.lang.String d;
            long j;
            int i3;
            int i4;
            int i5;
            java.lang.String e;
            java.util.List split$default;
            java.lang.String str2;
            java.lang.String str3;
            int i6;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar2;
            int i7;
            int i8;
            int i9;
            long j2;
            java.lang.Object obj2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a a2;
            int parseInt;
            int i10;
            java.lang.Object obj3;
            java.lang.String str4 = ": ";
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.g;
            int i12 = 2;
            int i13 = 1;
            try {
                if (i11 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.e, "Fetching asset from network: " + this.i, null, false, 12, null);
                    try {
                        e = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.e(this.j);
                    } catch (java.lang.NumberFormatException e2) {
                        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.e, "Failed to read range file", e2, false, 8, null);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.h(this.j);
                    }
                    if (e != null && (split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) e, new java.lang.String[]{com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING}, false, 0, 6, (java.lang.Object) null)) != null && (str2 = (java.lang.String) kotlin.collections.CollectionsKt.last(split$default)) != null) {
                        i = java.lang.Integer.parseInt(str2);
                        aVar = this.k;
                        if (aVar != null) {
                            aVar.a(this.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d.a());
                        }
                        length = this.j.length();
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this;
                        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, bVar.e, "Previous tmpfile bytes: " + length, null, false, 12, null);
                        str = com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING;
                        if (i != length) {
                            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.e, "File already downloaded, skipping download", null, false, 12, null);
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.a(this.j, this.k);
                        }
                        i2 = i;
                        d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.d(this.j);
                        j = length;
                        i3 = 0;
                        i4 = -1;
                        i5 = 1;
                        if (i5 != 0) {
                        }
                    }
                    i = Integer.MAX_VALUE;
                    aVar = this.k;
                    if (aVar != null) {
                    }
                    length = this.j.length();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b bVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this;
                    com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, bVar2.e, "Previous tmpfile bytes: " + length, null, false, 12, null);
                    str = com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING;
                    if (i != length) {
                    }
                } else if (i11 == 1) {
                    i3 = this.c;
                    j = this.e;
                    int i14 = this.b;
                    int i15 = this.f7465a;
                    d = (java.lang.String) this.f;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    i8 = i14;
                    i10 = i15;
                    str = com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING;
                    long j3 = j;
                    if (((java.lang.Boolean) obj3).booleanValue()) {
                    }
                } else if (i11 == 2) {
                    i3 = this.c;
                    long j4 = this.e;
                    int i16 = this.b;
                    i2 = this.f7465a;
                    d = (java.lang.String) this.f;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i8 = i16;
                    str = com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING;
                    i9 = 1;
                    j2 = j4;
                    obj2 = obj;
                    io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) obj2;
                    a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.a(this.j, httpResponse, this.k);
                    if (!(a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a)) {
                    }
                } else if (i11 == 3) {
                    i3 = this.d;
                    j = this.e;
                    i4 = this.c;
                    int i17 = this.b;
                    int i18 = this.f7465a;
                    java.lang.String str5 = (java.lang.String) this.f;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i6 = i17;
                    i2 = i18;
                    str3 = ": ";
                    d = str5;
                    str = com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING;
                    aVar2 = this.k;
                    if (aVar2 == null) {
                    }
                    if (i7 == 0) {
                    }
                    i12 = 2;
                    if (i5 != 0) {
                    }
                } else {
                    if (i11 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = this.c;
                    j = this.e;
                    i4 = this.b;
                    i2 = this.f7465a;
                    d = (java.lang.String) this.f;
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str6 = ": ";
                    str = com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING;
                    str4 = str6;
                    i13 = 1;
                    i5 = 0;
                    i12 = 2;
                    if (i5 != 0) {
                        com.moloco.sdk.internal.services.u uVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.b;
                        this.f = d;
                        this.f7465a = i2;
                        this.b = i4;
                        this.e = j;
                        this.c = i3;
                        this.g = i13;
                        obj3 = uVar.a(5000L, this);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i8 = i4;
                        i10 = i2;
                        long j32 = j;
                        if (((java.lang.Boolean) obj3).booleanValue()) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar3 = this.k;
                            if (aVar3 != null) {
                                aVar3.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.n.c));
                            }
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.n.c;
                        }
                        i3++;
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.e, "Making request to fetch chunk: " + i3 + " for remainingBytes: " + i8, null, false, 12, null);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b bVar3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this;
                        java.lang.String str7 = this.i;
                        this.f = d;
                        this.f7465a = i10;
                        this.b = i8;
                        this.e = j32;
                        this.c = i3;
                        this.g = i12;
                        java.lang.String str8 = d;
                        i9 = 1;
                        int i19 = i10;
                        obj2 = bVar3.a(str7, j32, i10, str8, this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j2 = j32;
                        d = str8;
                        i2 = i19;
                        io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) obj2;
                        a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.a(this.j, httpResponse2, this.k);
                        if (!(a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a)) {
                            return a2;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.a(this.j, httpResponse2);
                        com.moloco.sdk.internal.MolocoLogger molocoLogger3 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                        java.lang.String str9 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.e;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("ResponseCode: ");
                        sb.append(httpResponse2.getStatus().getValue());
                        sb.append(", ");
                        io.ktor.http.HttpHeaders httpHeaders = io.ktor.http.HttpHeaders.INSTANCE;
                        sb.append(httpHeaders.getContentLength());
                        sb.append(str4);
                        sb.append(io.ktor.http.HttpMessagePropertiesKt.contentLength(httpResponse2));
                        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger3, str9, sb.toString(), null, false, 12, null);
                        java.lang.String str10 = httpResponse2.getHeaders().get(httpHeaders.getContentRange());
                        if (str10 != null) {
                            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.e, "Content range header is available, " + httpHeaders.getContentRange() + str4 + str10, null, false, 12, null);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.a(this.j, str10);
                            java.lang.String[] strArr = new java.lang.String[i9];
                            strArr[0] = str;
                            i2 = java.lang.Integer.parseInt((java.lang.String) kotlin.collections.CollectionsKt.last(kotlin.text.StringsKt.split$default((java.lang.CharSequence) str10, strArr, false, 0, 6, (java.lang.Object) null)));
                            java.lang.Long contentLength = io.ktor.http.HttpMessagePropertiesKt.contentLength(httpResponse2);
                            long longValue = contentLength != null ? contentLength.longValue() : 0L;
                            java.lang.String[] strArr2 = new java.lang.String[i9];
                            strArr2[0] = str;
                            java.lang.String str11 = (java.lang.String) kotlin.collections.CollectionsKt.first(kotlin.text.StringsKt.split$default((java.lang.CharSequence) str10, strArr2, false, 0, 6, (java.lang.Object) null));
                            str3 = str4;
                            boolean contains$default = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str11, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null);
                            if (!contains$default) {
                                parseInt = i2;
                            } else {
                                if (!contains$default) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                parseInt = java.lang.Integer.parseInt((java.lang.String) kotlin.collections.CollectionsKt.last(kotlin.text.StringsKt.split$default((java.lang.CharSequence) str11, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null)));
                            }
                            int i20 = (i2 - parseInt) - 1;
                            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.e, "maxRange: " + i2 + ", Response contentLength: " + longValue, null, false, 12, null);
                            int i21 = i20 > 0 ? 1 : 0;
                            long j5 = j2 + longValue;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b bVar4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this;
                            java.io.File file = this.j;
                            this.f = d;
                            this.f7465a = i2;
                            this.b = i21;
                            this.c = i20;
                            this.e = j5;
                            this.d = i3;
                            this.g = 3;
                            if (bVar4.b(file, httpResponse2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j = j5;
                            i6 = i21;
                            i4 = i20;
                            aVar2 = this.k;
                            if (aVar2 == null) {
                                i7 = i6;
                                aVar2.a(this.j, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d(this.j.length(), i2));
                            } else {
                                i7 = i6;
                            }
                            if (i7 == 0) {
                                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.e, "Server has more data", null, false, 12, null);
                                str4 = str3;
                                i5 = i7;
                                i13 = 1;
                            } else {
                                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.e, "Server does not have more data to send", null, false, 12, null);
                                str4 = str3;
                                i5 = i7;
                                i13 = 1;
                            }
                            i12 = 2;
                            if (i5 != 0) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.a(this.j, this.k);
                            }
                        } else {
                            str6 = str4;
                            com.moloco.sdk.internal.MolocoLogger.warn$default(molocoLogger3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.e, httpHeaders.getContentRange() + " is not available", null, false, 12, null);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.c.c, new com.moloco.sdk.internal.error.a(this.l));
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b bVar5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this;
                            java.io.File file2 = this.j;
                            this.f = d;
                            this.f7465a = i2;
                            this.b = i8;
                            this.e = j2;
                            this.c = i3;
                            this.g = 4;
                            if (bVar5.a(file2, httpResponse2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j = j2;
                            i4 = i8;
                            str4 = str6;
                            i13 = 1;
                            i5 = 0;
                            i12 = 2;
                            if (i5 != 0) {
                            }
                        }
                    }
                }
            } catch (java.lang.Exception e3) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o.a(e3);
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.e, "Failed to fetch media from url: " + this.i + " due to error: " + a3, e3, false, 8, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar4 = this.k;
                if (aVar4 == null) {
                    return a3;
                }
                aVar4.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b(a3));
                return a3;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.ChunkedMediaDownloaderImpl", f = "ChunkedMediaDownloader.kt", i = {0, 0, 1, 1, 1}, l = {276, 278}, m = "writeChunkToFile", n = {"this", "dstFile", "this", "dstFile", "channel"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class c extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7466a;
        public java.lang.Object b;
        public java.lang.Object c;
        public /* synthetic */ java.lang.Object d;
        public int f;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this.b(null, null, this);
        }
    }

    public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l mediaConfig, com.moloco.sdk.internal.services.u connectivityService, com.moloco.sdk.internal.error.b errorReportingService, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaConfig, "mediaConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityService, "connectivityService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f7463a = mediaConfig;
        this.b = connectivityService;
        this.c = errorReportingService;
        this.d = httpClient;
        this.e = "ChunkedMediaDownloader";
    }

    public static final long a(io.ktor.client.plugins.HttpRetryDelayContext delayMillis, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return 100L;
    }

    public final java.lang.String d(java.io.File file) {
        java.io.File c2 = c(file);
        if (c2.exists()) {
            return kotlin.io.FilesKt.readText$default(c2, null, 1, null);
        }
        return null;
    }

    public final java.lang.String e(java.io.File file) {
        java.io.File f2 = f(file);
        if (f2.exists()) {
            return kotlin.io.FilesKt.readText$default(f2, null, 1, null);
        }
        return null;
    }

    public final java.io.File f(java.io.File file) {
        return new java.io.File(file.getParent(), file.getName() + ".range");
    }

    public final void g(java.io.File file) {
        c(file).delete();
    }

    public final void h(java.io.File file) {
        f(file).delete();
    }

    public final java.io.File c(java.io.File file) {
        return new java.io.File(file.getParent(), file.getName() + ".etag");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    public boolean b(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        return file.exists() && !f(file).exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008a A[LOOP:0: B:12:0x0084->B:14:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007f -> B:11:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(java.io.File file, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.c cVar;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b bVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b bVar2;
        java.io.File file2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.c) {
            cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.c) continuation;
            int i2 = cVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.f = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = cVar.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    cVar.f7466a = this;
                    cVar.b = file;
                    cVar.f = 1;
                    obj = io.ktor.client.statement.HttpResponseKt.bodyAsChannel(httpResponse, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bVar = this;
                } else if (i == 1) {
                    file = (java.io.File) cVar.b;
                    bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b) cVar.f7466a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (io.ktor.utils.io.ByteReadChannel) cVar.c;
                    file2 = (java.io.File) cVar.b;
                    bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b) cVar.f7466a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.io.Source source = (kotlinx.io.Source) obj;
                    while (!io.ktor.utils.io.core.PacketKt.isEmpty(source)) {
                        kotlin.io.FilesKt.appendBytes(file2, io.ktor.utils.io.core.StringsKt.readBytes(source));
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, bVar2.e, "dst file length: " + file2.length() + " bytes", null, false, 12, null);
                    }
                    if (byteReadChannel.isClosedForRead()) {
                        cVar.f7466a = bVar2;
                        cVar.b = file2;
                        cVar.c = byteReadChannel;
                        cVar.f = 2;
                        obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(byteReadChannel, bVar2.f7463a.e() * 2, cVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kotlinx.io.Source source2 = (kotlinx.io.Source) obj;
                        while (!io.ktor.utils.io.core.PacketKt.isEmpty(source2)) {
                        }
                        if (byteReadChannel.isClosedForRead()) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
                bVar2 = bVar;
                file2 = file;
                byteReadChannel = (io.ktor.utils.io.ByteReadChannel) obj;
                if (byteReadChannel.isClosedForRead()) {
                }
            }
        }
        cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.c(continuation);
        java.lang.Object obj2 = cVar.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.f;
        if (i != 0) {
        }
        bVar2 = bVar;
        file2 = file;
        byteReadChannel = (io.ktor.utils.io.ByteReadChannel) obj2;
        if (byteReadChannel.isClosedForRead()) {
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    public boolean a(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        return file.exists() && f(file).exists();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    public java.lang.Object a(java.lang.String str, java.io.File file, java.lang.String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.C0233b(str, file, aVar, str2, null), continuation);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a a(java.io.File file, io.ktor.client.statement.HttpResponse httpResponse, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar) {
        int value = httpResponse.getStatus().getValue();
        if (400 <= value && value < 500) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.e, "Failed to fetch media from url: " + io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse).getUrl() + ", status: " + httpResponse.getStatus(), null, false, 12, null);
            if (aVar != null) {
                aVar.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.e.c));
            }
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.e.c;
        }
        if (500 <= value && value < 600) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.e, "Failed to fetch media from url: " + io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse).getUrl() + ", status: " + httpResponse.getStatus(), null, false, 12, null);
            if (aVar != null) {
                aVar.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.h.c));
            }
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a.h.c;
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b(file);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a a(java.io.File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar) {
        g(file);
        h(file);
        if (aVar != null) {
            aVar.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a(file));
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b(file);
    }

    public final java.lang.Object a(java.lang.String str, final long j, final int i, final java.lang.String str2, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.HttpClient httpClient = this.d;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        io.ktor.client.plugins.HttpRequestRetryKt.retry(httpRequestBuilder, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this, (io.ktor.client.plugins.HttpRequestRetryConfig) obj);
            }
        });
        io.ktor.client.request.HttpRequestKt.headers(httpRequestBuilder, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.a(j, this, i, str2, (io.ktor.http.HeadersBuilder) obj);
            }
        });
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final kotlin.Unit a(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b bVar, io.ktor.client.plugins.HttpRequestRetryConfig retry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retry, "$this$retry");
        retry.setMaxRetries(10);
        io.ktor.client.plugins.HttpRequestRetryConfig.delayMillis$default(retry, false, new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.a((io.ktor.client.plugins.HttpRetryDelayContext) obj, ((java.lang.Integer) obj2).intValue()));
            }
        }, 1, null);
        retry.retryOnException(10, true);
        retry.retryOnServerErrors(10);
        retry.modifyRequest(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.this, (io.ktor.client.plugins.HttpRetryModifyRequestContext) obj, (io.ktor.client.request.HttpRequestBuilder) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b bVar, io.ktor.client.plugins.HttpRetryModifyRequestContext modifyRequest, io.ktor.client.request.HttpRequestBuilder it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifyRequest, "$this$modifyRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, bVar.e, "Retry attempt #" + modifyRequest.getRetryCount() + " for " + modifyRequest.getRequest().getUrl(), null, false, 12, null);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b bVar, int i, java.lang.String str, io.ktor.http.HeadersBuilder headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "$this$headers");
        java.lang.String str2 = "bytes=" + j + '-' + java.lang.Math.min(j + bVar.f7463a.e(), i);
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        java.lang.String str3 = bVar.e;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Adding ");
        io.ktor.http.HttpHeaders httpHeaders = io.ktor.http.HttpHeaders.INSTANCE;
        sb.append(httpHeaders.getRange());
        sb.append(" header: ");
        sb.append(str2);
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str3, sb.toString(), null, false, 12, null);
        headers.append(httpHeaders.getRange(), str2);
        if (str != null) {
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, bVar.e, "Adding " + httpHeaders.getIfRange() + " header: " + str, null, false, 12, null);
            headers.append(httpHeaders.getIfRange(), str);
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, bVar.e, "Adding " + httpHeaders.getETag() + " header: " + str, null, false, 12, null);
            headers.append(httpHeaders.getETag(), str);
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void a(java.io.File file, java.lang.String str) {
        kotlin.io.FilesKt.writeText$default(f(file), str, null, 2, null);
    }

    public final void a(java.io.File file, io.ktor.client.statement.HttpResponse httpResponse) {
        io.ktor.http.Headers headers = httpResponse.getHeaders();
        io.ktor.http.HttpHeaders httpHeaders = io.ktor.http.HttpHeaders.INSTANCE;
        java.lang.String str = headers.get(httpHeaders.getETag());
        if (str != null) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.e, httpHeaders.getETag() + ": " + str, null, false, 12, null);
            kotlin.io.FilesKt.writeText$default(c(file), str, null, 2, null);
            return;
        }
        com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.e, "No " + httpHeaders.getETag() + " in header", null, false, 12, null);
        g(file);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.io.File file, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.a aVar;
        java.lang.Object coroutine_suspended;
        int i;
        java.io.File file2;
        java.lang.Object bodyAsChannel;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b bVar;
        java.lang.Object copyAndClose;
        java.io.File file3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b bVar2;
        io.ktor.client.statement.HttpResponse httpResponse2 = httpResponse;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.a) {
            aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.a) continuation;
            int i2 = aVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.d;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, this.e, "Range header not supported, downloading full file", null, false, 12, null);
                    if (file.exists()) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, this.e, "Deleting existing file and fully re-downloading it", null, false, 12, null);
                        file.delete();
                    }
                    aVar.f7464a = this;
                    file2 = file;
                    aVar.b = file2;
                    aVar.c = httpResponse2;
                    aVar.f = 1;
                    bodyAsChannel = io.ktor.client.statement.HttpResponseKt.bodyAsChannel(httpResponse2, aVar);
                    if (bodyAsChannel == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        httpResponse2 = (io.ktor.client.statement.HttpResponse) aVar.c;
                        file3 = (java.io.File) aVar.b;
                        bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b) aVar.f7464a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        long longValue = ((java.lang.Number) obj).longValue();
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, bVar2.e, "Downloaded full response: " + io.ktor.http.HttpMessagePropertiesKt.contentLength(httpResponse2) + " and saved to disk: " + longValue + " bytes, file size: " + file3.length(), null, false, 12, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    httpResponse2 = (io.ktor.client.statement.HttpResponse) aVar.c;
                    java.io.File file4 = (java.io.File) aVar.b;
                    bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b) aVar.f7464a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    bodyAsChannel = obj;
                    file2 = file4;
                }
                io.ktor.utils.io.ByteWriteChannel writeChannel$default = io.ktor.util.cio.FileChannelsKt.writeChannel$default(file2, null, 1, null);
                aVar.f7464a = bVar;
                aVar.b = file2;
                aVar.c = httpResponse2;
                aVar.f = 2;
                copyAndClose = io.ktor.utils.io.ByteReadChannelOperationsKt.copyAndClose((io.ktor.utils.io.ByteReadChannel) bodyAsChannel, writeChannel$default, aVar);
                if (copyAndClose != coroutine_suspended) {
                    return coroutine_suspended;
                }
                file3 = file2;
                obj = copyAndClose;
                bVar2 = bVar;
                long longValue2 = ((java.lang.Number) obj).longValue();
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, bVar2.e, "Downloaded full response: " + io.ktor.http.HttpMessagePropertiesKt.contentLength(httpResponse2) + " and saved to disk: " + longValue2 + " bytes, file size: " + file3.length(), null, false, 12, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b.a(continuation);
        java.lang.Object obj2 = aVar.d;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.f;
        if (i != 0) {
        }
        io.ktor.utils.io.ByteWriteChannel writeChannel$default2 = io.ktor.util.cio.FileChannelsKt.writeChannel$default(file2, null, 1, null);
        aVar.f7464a = bVar;
        aVar.b = file2;
        aVar.c = httpResponse2;
        aVar.f = 2;
        copyAndClose = io.ktor.utils.io.ByteReadChannelOperationsKt.copyAndClose((io.ktor.utils.io.ByteReadChannel) bodyAsChannel, writeChannel$default2, aVar);
        if (copyAndClose != coroutine_suspended) {
        }
    }
}
