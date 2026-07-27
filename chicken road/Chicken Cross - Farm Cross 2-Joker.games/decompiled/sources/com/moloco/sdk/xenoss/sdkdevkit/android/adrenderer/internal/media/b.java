package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.ironsource.Te;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpRequestRetryConfig;
import io.ktor.client.plugins.HttpRequestRetryKt;
import io.ktor.client.plugins.HttpRetryDelayContext;
import io.ktor.client.plugins.HttpRetryModifyRequestContext;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.util.cio.FileChannelsKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.core.PacketKt;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.io.Source;

/* loaded from: classes7.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a {
    public static final int f = 8;

    /* renamed from: a, reason: collision with root package name */
    public final l f10989a;
    public final u b;
    public final com.moloco.sdk.internal.error.b c;
    public final HttpClient d;
    public final String e;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.ChunkedMediaDownloaderImpl", f = "ChunkedMediaDownloader.kt", i = {0, 0, 0, 1, 1, 1}, l = {294, 294}, m = "downloadFullFile", n = {"this", "dstFile", Te.n, "this", "dstFile", Te.n}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10990a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return b.this.a((File) null, (HttpResponse) null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.ChunkedMediaDownloaderImpl$downloadMedia$2", f = "ChunkedMediaDownloader.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {95, 106, 138, 149}, m = "invokeSuspend", n = {"previousEtag", "maxRange", "remainingBytes", "previousBytes", "chunk", "previousEtag", "maxRange", "remainingBytes", "previousBytes", "chunk", "previousEtag", "maxRange", "hasMoreData", "remainingBytes", "previousBytes", "chunk", "previousEtag", "maxRange", "remainingBytes", "previousBytes", "chunk"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "L$0", "I$0", "I$1", "J$0", "I$2", "L$0", "I$0", "I$1", "I$2", "J$0", "I$3", "L$0", "I$0", "I$1", "J$0", "I$2"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$b, reason: collision with other inner class name */
    public static final class C1529b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super i.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10991a;
        public int b;
        public int c;
        public int d;
        public long e;
        public Object f;
        public int g;
        public final /* synthetic */ String i;
        public final /* synthetic */ File j;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a k;
        public final /* synthetic */ String l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1529b(String str, File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar, String str2, Continuation<? super C1529b> continuation) {
            super(2, continuation);
            this.i = str;
            this.j = file;
            this.k = aVar;
            this.l = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super i.a> continuation) {
            return ((C1529b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new C1529b(this.i, this.j, this.k, this.l, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0169 A[Catch: Exception -> 0x0434, TryCatch #0 {Exception -> 0x0434, blocks: (B:9:0x002d, B:14:0x0169, B:20:0x0188, B:22:0x0190, B:24:0x0194, B:25:0x019e, B:27:0x01a1, B:31:0x01fd, B:34:0x020e, B:36:0x026f, B:38:0x02cd, B:39:0x02d4, B:42:0x031e, B:45:0x0357, B:49:0x0375, B:51:0x0379, B:53:0x0391, B:55:0x03a7, B:61:0x0300, B:62:0x03c3, B:63:0x03c8, B:65:0x03c9, B:69:0x0429, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b1, B:87:0x00bb, B:89:0x00cf, B:91:0x00d7, B:92:0x00fc, B:94:0x0100, B:95:0x0109, B:97:0x0138, B:99:0x0158, B:104:0x00df), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0190 A[Catch: Exception -> 0x0434, TryCatch #0 {Exception -> 0x0434, blocks: (B:9:0x002d, B:14:0x0169, B:20:0x0188, B:22:0x0190, B:24:0x0194, B:25:0x019e, B:27:0x01a1, B:31:0x01fd, B:34:0x020e, B:36:0x026f, B:38:0x02cd, B:39:0x02d4, B:42:0x031e, B:45:0x0357, B:49:0x0375, B:51:0x0379, B:53:0x0391, B:55:0x03a7, B:61:0x0300, B:62:0x03c3, B:63:0x03c8, B:65:0x03c9, B:69:0x0429, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b1, B:87:0x00bb, B:89:0x00cf, B:91:0x00d7, B:92:0x00fc, B:94:0x0100, B:95:0x0109, B:97:0x0138, B:99:0x0158, B:104:0x00df), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x01a1 A[Catch: Exception -> 0x0434, TryCatch #0 {Exception -> 0x0434, blocks: (B:9:0x002d, B:14:0x0169, B:20:0x0188, B:22:0x0190, B:24:0x0194, B:25:0x019e, B:27:0x01a1, B:31:0x01fd, B:34:0x020e, B:36:0x026f, B:38:0x02cd, B:39:0x02d4, B:42:0x031e, B:45:0x0357, B:49:0x0375, B:51:0x0379, B:53:0x0391, B:55:0x03a7, B:61:0x0300, B:62:0x03c3, B:63:0x03c8, B:65:0x03c9, B:69:0x0429, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b1, B:87:0x00bb, B:89:0x00cf, B:91:0x00d7, B:92:0x00fc, B:94:0x0100, B:95:0x0109, B:97:0x0138, B:99:0x0158, B:104:0x00df), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x020d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x020e A[Catch: Exception -> 0x0434, TryCatch #0 {Exception -> 0x0434, blocks: (B:9:0x002d, B:14:0x0169, B:20:0x0188, B:22:0x0190, B:24:0x0194, B:25:0x019e, B:27:0x01a1, B:31:0x01fd, B:34:0x020e, B:36:0x026f, B:38:0x02cd, B:39:0x02d4, B:42:0x031e, B:45:0x0357, B:49:0x0375, B:51:0x0379, B:53:0x0391, B:55:0x03a7, B:61:0x0300, B:62:0x03c3, B:63:0x03c8, B:65:0x03c9, B:69:0x0429, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b1, B:87:0x00bb, B:89:0x00cf, B:91:0x00d7, B:92:0x00fc, B:94:0x0100, B:95:0x0109, B:97:0x0138, B:99:0x0158, B:104:0x00df), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0379 A[Catch: Exception -> 0x0434, TryCatch #0 {Exception -> 0x0434, blocks: (B:9:0x002d, B:14:0x0169, B:20:0x0188, B:22:0x0190, B:24:0x0194, B:25:0x019e, B:27:0x01a1, B:31:0x01fd, B:34:0x020e, B:36:0x026f, B:38:0x02cd, B:39:0x02d4, B:42:0x031e, B:45:0x0357, B:49:0x0375, B:51:0x0379, B:53:0x0391, B:55:0x03a7, B:61:0x0300, B:62:0x03c3, B:63:0x03c8, B:65:0x03c9, B:69:0x0429, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b1, B:87:0x00bb, B:89:0x00cf, B:91:0x00d7, B:92:0x00fc, B:94:0x0100, B:95:0x0109, B:97:0x0138, B:99:0x0158, B:104:0x00df), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0391 A[Catch: Exception -> 0x0434, TryCatch #0 {Exception -> 0x0434, blocks: (B:9:0x002d, B:14:0x0169, B:20:0x0188, B:22:0x0190, B:24:0x0194, B:25:0x019e, B:27:0x01a1, B:31:0x01fd, B:34:0x020e, B:36:0x026f, B:38:0x02cd, B:39:0x02d4, B:42:0x031e, B:45:0x0357, B:49:0x0375, B:51:0x0379, B:53:0x0391, B:55:0x03a7, B:61:0x0300, B:62:0x03c3, B:63:0x03c8, B:65:0x03c9, B:69:0x0429, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b1, B:87:0x00bb, B:89:0x00cf, B:91:0x00d7, B:92:0x00fc, B:94:0x0100, B:95:0x0109, B:97:0x0138, B:99:0x0158, B:104:0x00df), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x03a7 A[Catch: Exception -> 0x0434, TryCatch #0 {Exception -> 0x0434, blocks: (B:9:0x002d, B:14:0x0169, B:20:0x0188, B:22:0x0190, B:24:0x0194, B:25:0x019e, B:27:0x01a1, B:31:0x01fd, B:34:0x020e, B:36:0x026f, B:38:0x02cd, B:39:0x02d4, B:42:0x031e, B:45:0x0357, B:49:0x0375, B:51:0x0379, B:53:0x0391, B:55:0x03a7, B:61:0x0300, B:62:0x03c3, B:63:0x03c8, B:65:0x03c9, B:69:0x0429, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b1, B:87:0x00bb, B:89:0x00cf, B:91:0x00d7, B:92:0x00fc, B:94:0x0100, B:95:0x0109, B:97:0x0138, B:99:0x0158, B:104:0x00df), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x038d  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0429 A[Catch: Exception -> 0x0434, TRY_LEAVE, TryCatch #0 {Exception -> 0x0434, blocks: (B:9:0x002d, B:14:0x0169, B:20:0x0188, B:22:0x0190, B:24:0x0194, B:25:0x019e, B:27:0x01a1, B:31:0x01fd, B:34:0x020e, B:36:0x026f, B:38:0x02cd, B:39:0x02d4, B:42:0x031e, B:45:0x0357, B:49:0x0375, B:51:0x0379, B:53:0x0391, B:55:0x03a7, B:61:0x0300, B:62:0x03c3, B:63:0x03c8, B:65:0x03c9, B:69:0x0429, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b1, B:87:0x00bb, B:89:0x00cf, B:91:0x00d7, B:92:0x00fc, B:94:0x0100, B:95:0x0109, B:97:0x0138, B:99:0x0158, B:104:0x00df), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0100 A[Catch: Exception -> 0x0434, TryCatch #0 {Exception -> 0x0434, blocks: (B:9:0x002d, B:14:0x0169, B:20:0x0188, B:22:0x0190, B:24:0x0194, B:25:0x019e, B:27:0x01a1, B:31:0x01fd, B:34:0x020e, B:36:0x026f, B:38:0x02cd, B:39:0x02d4, B:42:0x031e, B:45:0x0357, B:49:0x0375, B:51:0x0379, B:53:0x0391, B:55:0x03a7, B:61:0x0300, B:62:0x03c3, B:63:0x03c8, B:65:0x03c9, B:69:0x0429, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b1, B:87:0x00bb, B:89:0x00cf, B:91:0x00d7, B:92:0x00fc, B:94:0x0100, B:95:0x0109, B:97:0x0138, B:99:0x0158, B:104:0x00df), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0138 A[Catch: Exception -> 0x0434, TryCatch #0 {Exception -> 0x0434, blocks: (B:9:0x002d, B:14:0x0169, B:20:0x0188, B:22:0x0190, B:24:0x0194, B:25:0x019e, B:27:0x01a1, B:31:0x01fd, B:34:0x020e, B:36:0x026f, B:38:0x02cd, B:39:0x02d4, B:42:0x031e, B:45:0x0357, B:49:0x0375, B:51:0x0379, B:53:0x0391, B:55:0x03a7, B:61:0x0300, B:62:0x03c3, B:63:0x03c8, B:65:0x03c9, B:69:0x0429, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b1, B:87:0x00bb, B:89:0x00cf, B:91:0x00d7, B:92:0x00fc, B:94:0x0100, B:95:0x0109, B:97:0x0138, B:99:0x0158, B:104:0x00df), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0158 A[Catch: Exception -> 0x0434, TryCatch #0 {Exception -> 0x0434, blocks: (B:9:0x002d, B:14:0x0169, B:20:0x0188, B:22:0x0190, B:24:0x0194, B:25:0x019e, B:27:0x01a1, B:31:0x01fd, B:34:0x020e, B:36:0x026f, B:38:0x02cd, B:39:0x02d4, B:42:0x031e, B:45:0x0357, B:49:0x0375, B:51:0x0379, B:53:0x0391, B:55:0x03a7, B:61:0x0300, B:62:0x03c3, B:63:0x03c8, B:65:0x03c9, B:69:0x0429, B:74:0x004d, B:77:0x0067, B:80:0x0080, B:83:0x008f, B:85:0x00b1, B:87:0x00bb, B:89:0x00cf, B:91:0x00d7, B:92:0x00fc, B:94:0x0100, B:95:0x0109, B:97:0x0138, B:99:0x0158, B:104:0x00df), top: B:2:0x0017, inners: #1 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x041f -> B:11:0x0421). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar;
            long length;
            String str;
            String d;
            long j;
            int i2;
            int i3;
            int i4;
            int i5;
            String e;
            List split$default;
            String str2;
            String str3;
            int i6;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar2;
            int i7;
            int i8;
            int i9;
            long j2;
            Object obj2;
            i.a a2;
            int parseInt;
            int i10;
            Object obj3;
            String str4 = ": ";
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.g;
            int i12 = 2;
            int i13 = 1;
            try {
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, b.this.e, "Fetching asset from network: " + this.i, null, false, 12, null);
                    try {
                        e = b.this.e(this.j);
                    } catch (NumberFormatException e2) {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, b.this.e, "Failed to read range file", e2, false, 8, null);
                        b.this.h(this.j);
                    }
                    if (e != null && (split$default = StringsKt.split$default((CharSequence) e, new String[]{"/"}, false, 0, 6, (Object) null)) != null && (str2 = (String) CollectionsKt.last(split$default)) != null) {
                        i = Integer.parseInt(str2);
                        aVar = this.k;
                        if (aVar != null) {
                            aVar.a(this.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d.a());
                        }
                        length = this.j.length();
                        b bVar = b.this;
                        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                        MolocoLogger.info$default(molocoLogger, bVar.e, "Previous tmpfile bytes: " + length, null, false, 12, null);
                        str = "/";
                        if (i != length) {
                            MolocoLogger.info$default(molocoLogger, b.this.e, "File already downloaded, skipping download", null, false, 12, null);
                            return b.this.a(this.j, this.k);
                        }
                        d = b.this.d(this.j);
                        j = length;
                        i2 = -1;
                        i3 = 1;
                        i4 = i;
                        i5 = 0;
                        if (i3 != 0) {
                        }
                    }
                    i = Integer.MAX_VALUE;
                    aVar = this.k;
                    if (aVar != null) {
                    }
                    length = this.j.length();
                    b bVar2 = b.this;
                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger2, bVar2.e, "Previous tmpfile bytes: " + length, null, false, 12, null);
                    str = "/";
                    if (i != length) {
                    }
                } else if (i11 == 1) {
                    i5 = this.c;
                    j = this.e;
                    int i14 = this.b;
                    int i15 = this.f10991a;
                    d = (String) this.f;
                    ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    i8 = i14;
                    i10 = i15;
                    str = "/";
                    long j3 = j;
                    if (((Boolean) obj3).booleanValue()) {
                    }
                } else if (i11 == 2) {
                    i5 = this.c;
                    long j4 = this.e;
                    int i16 = this.b;
                    i4 = this.f10991a;
                    d = (String) this.f;
                    ResultKt.throwOnFailure(obj);
                    i8 = i16;
                    i9 = 1;
                    str = "/";
                    j2 = j4;
                    obj2 = obj;
                    HttpResponse httpResponse = (HttpResponse) obj2;
                    a2 = b.this.a(this.j, httpResponse, this.k);
                    if (!(a2 instanceof i.a.AbstractC1530a)) {
                    }
                } else if (i11 == 3) {
                    i5 = this.d;
                    j = this.e;
                    i2 = this.c;
                    int i17 = this.b;
                    int i18 = this.f10991a;
                    String str5 = (String) this.f;
                    ResultKt.throwOnFailure(obj);
                    str3 = ": ";
                    str = "/";
                    i6 = i17;
                    i4 = i18;
                    d = str5;
                    aVar2 = this.k;
                    if (aVar2 == null) {
                    }
                    if (i7 == 0) {
                    }
                    i12 = 2;
                    if (i3 != 0) {
                    }
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5 = this.c;
                    j = this.e;
                    i2 = this.b;
                    i4 = this.f10991a;
                    d = (String) this.f;
                    ResultKt.throwOnFailure(obj);
                    String str6 = ": ";
                    str = "/";
                    str4 = str6;
                    i13 = 1;
                    i3 = 0;
                    i12 = 2;
                    if (i3 != 0) {
                        u uVar = b.this.b;
                        this.f = d;
                        this.f10991a = i4;
                        this.b = i2;
                        this.e = j;
                        this.c = i5;
                        this.g = i13;
                        obj3 = uVar.a(5000L, this);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i8 = i2;
                        i10 = i4;
                        long j32 = j;
                        if (((Boolean) obj3).booleanValue()) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar3 = this.k;
                            if (aVar3 != null) {
                                aVar3.a(new c.b(i.a.AbstractC1530a.n.c));
                            }
                            return i.a.AbstractC1530a.n.c;
                        }
                        i5++;
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, b.this.e, "Making request to fetch chunk: " + i5 + " for remainingBytes: " + i8, null, false, 12, null);
                        b bVar3 = b.this;
                        String str7 = this.i;
                        this.f = d;
                        this.f10991a = i10;
                        this.b = i8;
                        this.e = j32;
                        this.c = i5;
                        this.g = i12;
                        String str8 = d;
                        i9 = 1;
                        int i19 = i10;
                        obj2 = bVar3.a(str7, j32, i10, str8, this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j2 = j32;
                        d = str8;
                        i4 = i19;
                        HttpResponse httpResponse2 = (HttpResponse) obj2;
                        a2 = b.this.a(this.j, httpResponse2, this.k);
                        if (!(a2 instanceof i.a.AbstractC1530a)) {
                            return a2;
                        }
                        b.this.a(this.j, httpResponse2);
                        MolocoLogger molocoLogger3 = MolocoLogger.INSTANCE;
                        String str9 = b.this.e;
                        StringBuilder append = new StringBuilder().append("ResponseCode: ").append(httpResponse2.getStatus().getValue()).append(", ");
                        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                        MolocoLogger.info$default(molocoLogger3, str9, append.append(httpHeaders.getContentLength()).append(str4).append(HttpMessagePropertiesKt.contentLength(httpResponse2)).toString(), null, false, 12, null);
                        String str10 = httpResponse2.getHeaders().get(httpHeaders.getContentRange());
                        if (str10 != null) {
                            MolocoLogger.info$default(molocoLogger3, b.this.e, "Content range header is available, " + httpHeaders.getContentRange() + str4 + str10, null, false, 12, null);
                            b.this.a(this.j, str10);
                            String[] strArr = new String[i9];
                            strArr[0] = str;
                            i4 = Integer.parseInt((String) CollectionsKt.last(StringsKt.split$default((CharSequence) str10, strArr, false, 0, 6, (Object) null)));
                            Long contentLength = HttpMessagePropertiesKt.contentLength(httpResponse2);
                            long longValue = contentLength != null ? contentLength.longValue() : 0L;
                            String[] strArr2 = new String[i9];
                            strArr2[0] = str;
                            String str11 = (String) CollectionsKt.first(StringsKt.split$default((CharSequence) str10, strArr2, false, 0, 6, (Object) null));
                            str3 = str4;
                            boolean contains$default = StringsKt.contains$default((CharSequence) str11, (CharSequence) "-", false, 2, (Object) null);
                            if (!contains$default) {
                                parseInt = i4;
                            } else {
                                if (!contains$default) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                parseInt = Integer.parseInt((String) CollectionsKt.last(StringsKt.split$default((CharSequence) str11, new String[]{"-"}, false, 0, 6, (Object) null)));
                            }
                            int i20 = (i4 - parseInt) - 1;
                            MolocoLogger.info$default(molocoLogger3, b.this.e, "maxRange: " + i4 + ", Response contentLength: " + longValue, null, false, 12, null);
                            int i21 = i20 > 0 ? 1 : 0;
                            long j5 = j2 + longValue;
                            b bVar4 = b.this;
                            File file = this.j;
                            this.f = d;
                            this.f10991a = i4;
                            this.b = i21;
                            this.c = i20;
                            this.e = j5;
                            this.d = i5;
                            this.g = 3;
                            if (bVar4.b(file, httpResponse2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j = j5;
                            i6 = i21;
                            i2 = i20;
                            aVar2 = this.k;
                            if (aVar2 == null) {
                                i7 = i6;
                                aVar2.a(this.j, new c.d(this.j.length(), i4));
                            } else {
                                i7 = i6;
                            }
                            if (i7 == 0) {
                                MolocoLogger.info$default(MolocoLogger.INSTANCE, b.this.e, "Server has more data", null, false, 12, null);
                                str4 = str3;
                                i3 = i7;
                                i13 = 1;
                            } else {
                                MolocoLogger.info$default(MolocoLogger.INSTANCE, b.this.e, "Server does not have more data to send", null, false, 12, null);
                                str4 = str3;
                                i3 = i7;
                                i13 = 1;
                            }
                            i12 = 2;
                            if (i3 != 0) {
                                return b.this.a(this.j, this.k);
                            }
                        } else {
                            str6 = str4;
                            MolocoLogger.warn$default(molocoLogger3, b.this.e, httpHeaders.getContentRange() + " is not available", null, false, 12, null);
                            b.this.c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.c.c, new com.moloco.sdk.internal.error.a(this.l));
                            b bVar5 = b.this;
                            File file2 = this.j;
                            this.f = d;
                            this.f10991a = i4;
                            this.b = i8;
                            this.e = j2;
                            this.c = i5;
                            this.g = 4;
                            if (bVar5.a(file2, httpResponse2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j = j2;
                            i2 = i8;
                            str4 = str6;
                            i13 = 1;
                            i3 = 0;
                            i12 = 2;
                            if (i3 != 0) {
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                i.a.AbstractC1530a a3 = o.a(e3);
                MolocoLogger.error$default(MolocoLogger.INSTANCE, b.this.e, "Failed to fetch media from url: " + this.i + " due to error: " + a3, e3, false, 8, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar4 = this.k;
                if (aVar4 == null) {
                    return a3;
                }
                aVar4.a(new c.b(a3));
                return a3;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.ChunkedMediaDownloaderImpl", f = "ChunkedMediaDownloader.kt", i = {0, 0, 1, 1, 1}, l = {276, 278}, m = "writeChunkToFile", n = {"this", "dstFile", "this", "dstFile", "channel"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10992a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return b.this.b(null, null, this);
        }
    }

    public b(l mediaConfig, u connectivityService, com.moloco.sdk.internal.error.b errorReportingService, HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(mediaConfig, "mediaConfig");
        Intrinsics.checkNotNullParameter(connectivityService, "connectivityService");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f10989a = mediaConfig;
        this.b = connectivityService;
        this.c = errorReportingService;
        this.d = httpClient;
        this.e = "ChunkedMediaDownloader";
    }

    public static final long a(HttpRetryDelayContext delayMillis, int i) {
        Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return 100L;
    }

    public final String d(File file) {
        File c2 = c(file);
        if (c2.exists()) {
            return FilesKt.readText$default(c2, null, 1, null);
        }
        return null;
    }

    public final String e(File file) {
        File f2 = f(file);
        if (f2.exists()) {
            return FilesKt.readText$default(f2, null, 1, null);
        }
        return null;
    }

    public final File f(File file) {
        return new File(file.getParent(), file.getName() + ".range");
    }

    public final void g(File file) {
        c(file).delete();
    }

    public final void h(File file) {
        f(file).delete();
    }

    public final File c(File file) {
        return new File(file.getParent(), file.getName() + ".etag");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    public boolean b(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.exists() && !f(file).exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[LOOP:0: B:12:0x0083->B:14:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:11:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(File file, HttpResponse httpResponse, Continuation<? super Unit> continuation) {
        c cVar;
        int i;
        b bVar;
        b bVar2;
        File file2;
        ByteReadChannel byteReadChannel;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.f = i2 - Integer.MIN_VALUE;
                Object obj = cVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    cVar.f10992a = this;
                    cVar.b = file;
                    cVar.f = 1;
                    obj = HttpResponseKt.bodyAsChannel(httpResponse, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bVar = this;
                } else if (i == 1) {
                    file = (File) cVar.b;
                    bVar = (b) cVar.f10992a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteReadChannel = (ByteReadChannel) cVar.c;
                    file2 = (File) cVar.b;
                    bVar2 = (b) cVar.f10992a;
                    ResultKt.throwOnFailure(obj);
                    Source source = (Source) obj;
                    while (!PacketKt.isEmpty(source)) {
                        FilesKt.appendBytes(file2, io.ktor.utils.io.core.StringsKt.readBytes(source));
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, bVar2.e, "dst file length: " + file2.length() + " bytes", null, false, 12, null);
                    }
                    if (byteReadChannel.isClosedForRead()) {
                        cVar.f10992a = bVar2;
                        cVar.b = file2;
                        cVar.c = byteReadChannel;
                        cVar.f = 2;
                        obj = ByteReadChannelOperationsKt.readRemaining(byteReadChannel, bVar2.f10989a.e() * 2, cVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Source source2 = (Source) obj;
                        while (!PacketKt.isEmpty(source2)) {
                        }
                        if (byteReadChannel.isClosedForRead()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
                bVar2 = bVar;
                file2 = file;
                byteReadChannel = (ByteReadChannel) obj;
                if (byteReadChannel.isClosedForRead()) {
                }
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.f;
        if (i != 0) {
        }
        bVar2 = bVar;
        file2 = file;
        byteReadChannel = (ByteReadChannel) obj2;
        if (byteReadChannel.isClosedForRead()) {
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    public boolean a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.exists() && f(file).exists();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    public Object a(String str, File file, String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar, Continuation<? super i.a> continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new C1529b(str, file, aVar, str2, null), continuation);
    }

    public final i.a a(File file, HttpResponse httpResponse, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar) {
        int value = httpResponse.getStatus().getValue();
        if (400 <= value && value < 500) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.e, "Failed to fetch media from url: " + HttpResponseKt.getRequest(httpResponse).getUrl() + ", status: " + httpResponse.getStatus(), null, false, 12, null);
            if (aVar != null) {
                aVar.a(new c.b(i.a.AbstractC1530a.e.c));
            }
            return i.a.AbstractC1530a.e.c;
        }
        if (500 <= value && value < 600) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.e, "Failed to fetch media from url: " + HttpResponseKt.getRequest(httpResponse).getUrl() + ", status: " + httpResponse.getStatus(), null, false, 12, null);
            if (aVar != null) {
                aVar.a(new c.b(i.a.AbstractC1530a.h.c));
            }
            return i.a.AbstractC1530a.h.c;
        }
        return new i.a.b(file);
    }

    public final i.a a(File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar) {
        g(file);
        h(file);
        if (aVar != null) {
            aVar.a(new c.a(file));
        }
        return new i.a.b(file);
    }

    public final Object a(String str, final long j, final int i, final String str2, Continuation<? super HttpResponse> continuation) {
        HttpClient httpClient = this.d;
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        HttpRequestRetryKt.retry(httpRequestBuilder, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(b.this, (HttpRequestRetryConfig) obj);
            }
        });
        HttpRequestKt.headers(httpRequestBuilder, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(j, this, i, str2, (HeadersBuilder) obj);
            }
        });
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Unit a(final b bVar, HttpRequestRetryConfig retry) {
        Intrinsics.checkNotNullParameter(retry, "$this$retry");
        retry.setMaxRetries(10);
        HttpRequestRetryConfig.delayMillis$default(retry, false, new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(b.a((HttpRetryDelayContext) obj, ((Integer) obj2).intValue()));
            }
        }, 1, null);
        retry.retryOnException(10, true);
        retry.retryOnServerErrors(10);
        retry.modifyRequest(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return b.a(b.this, (HttpRetryModifyRequestContext) obj, (HttpRequestBuilder) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit a(b bVar, HttpRetryModifyRequestContext modifyRequest, HttpRequestBuilder it) {
        Intrinsics.checkNotNullParameter(modifyRequest, "$this$modifyRequest");
        Intrinsics.checkNotNullParameter(it, "it");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, bVar.e, "Retry attempt #" + modifyRequest.getRetryCount() + " for " + modifyRequest.getRequest().getUrl(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit a(long j, b bVar, int i, String str, HeadersBuilder headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        String str2 = "bytes=" + j + '-' + Math.min(j + bVar.f10989a.e(), i);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str3 = bVar.e;
        StringBuilder sb = new StringBuilder("Adding ");
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        MolocoLogger.info$default(molocoLogger, str3, sb.append(httpHeaders.getRange()).append(" header: ").append(str2).toString(), null, false, 12, null);
        headers.append(httpHeaders.getRange(), str2);
        if (str != null) {
            MolocoLogger.info$default(molocoLogger, bVar.e, "Adding " + httpHeaders.getIfRange() + " header: " + str, null, false, 12, null);
            headers.append(httpHeaders.getIfRange(), str);
            MolocoLogger.info$default(molocoLogger, bVar.e, "Adding " + httpHeaders.getETag() + " header: " + str, null, false, 12, null);
            headers.append(httpHeaders.getETag(), str);
        }
        return Unit.INSTANCE;
    }

    public final void a(File file, String str) {
        FilesKt.writeText$default(f(file), str, null, 2, null);
    }

    public final void a(File file, HttpResponse httpResponse) {
        Headers headers = httpResponse.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String str = headers.get(httpHeaders.getETag());
        if (str != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.e, httpHeaders.getETag() + ": " + str, null, false, 12, null);
            FilesKt.writeText$default(c(file), str, null, 2, null);
        } else {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, this.e, "No " + httpHeaders.getETag() + " in header", null, false, 12, null);
            g(file);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(File file, HttpResponse httpResponse, Continuation<? super Unit> continuation) {
        a aVar;
        Object coroutine_suspended;
        int i;
        File file2;
        Object bodyAsChannel;
        b bVar;
        Object copyAndClose;
        File file3;
        b bVar2;
        HttpResponse httpResponse2 = httpResponse;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f = i2 - Integer.MIN_VALUE;
                Object obj = aVar.d;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, this.e, "Range header not supported, downloading full file", null, false, 12, null);
                    if (file.exists()) {
                        MolocoLogger.info$default(molocoLogger, this.e, "Deleting existing file and fully re-downloading it", null, false, 12, null);
                        file.delete();
                    }
                    aVar.f10990a = this;
                    file2 = file;
                    aVar.b = file2;
                    aVar.c = httpResponse2;
                    aVar.f = 1;
                    bodyAsChannel = HttpResponseKt.bodyAsChannel(httpResponse2, aVar);
                    if (bodyAsChannel == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        httpResponse2 = (HttpResponse) aVar.c;
                        file3 = (File) aVar.b;
                        bVar2 = (b) aVar.f10990a;
                        ResultKt.throwOnFailure(obj);
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, bVar2.e, "Downloaded full response: " + HttpMessagePropertiesKt.contentLength(httpResponse2) + " and saved to disk: " + ((Number) obj).longValue() + " bytes, file size: " + file3.length(), null, false, 12, null);
                        return Unit.INSTANCE;
                    }
                    httpResponse2 = (HttpResponse) aVar.c;
                    File file4 = (File) aVar.b;
                    bVar = (b) aVar.f10990a;
                    ResultKt.throwOnFailure(obj);
                    bodyAsChannel = obj;
                    file2 = file4;
                }
                ByteWriteChannel writeChannel$default = FileChannelsKt.writeChannel$default(file2, null, 1, null);
                aVar.f10990a = bVar;
                aVar.b = file2;
                aVar.c = httpResponse2;
                aVar.f = 2;
                copyAndClose = ByteReadChannelOperationsKt.copyAndClose((ByteReadChannel) bodyAsChannel, writeChannel$default, aVar);
                if (copyAndClose != coroutine_suspended) {
                    return coroutine_suspended;
                }
                file3 = file2;
                obj = copyAndClose;
                bVar2 = bVar;
                MolocoLogger.info$default(MolocoLogger.INSTANCE, bVar2.e, "Downloaded full response: " + HttpMessagePropertiesKt.contentLength(httpResponse2) + " and saved to disk: " + ((Number) obj).longValue() + " bytes, file size: " + file3.length(), null, false, 12, null);
                return Unit.INSTANCE;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.d;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.f;
        if (i != 0) {
        }
        ByteWriteChannel writeChannel$default2 = FileChannelsKt.writeChannel$default(file2, null, 1, null);
        aVar.f10990a = bVar;
        aVar.b = file2;
        aVar.c = httpResponse2;
        aVar.f = 2;
        copyAndClose = ByteReadChannelOperationsKt.copyAndClose((ByteReadChannel) bodyAsChannel, writeChannel$default2, aVar);
        if (copyAndClose != coroutine_suspended) {
        }
    }
}
