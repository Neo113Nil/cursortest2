package com.bbflight.background_downloader;

import android.content.Context;
import android.net.Uri;
import androidx.work.WorkerParameters;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.serialization.internal.C1135f;
import kotlinx.serialization.json.b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0002J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\rH\u0002¨\u0006\u001f"}, d2 = {"Lcom/bbflight/background_downloader/UploadTaskWorker;", "Lcom/bbflight/background_downloader/TaskWorker;", "applicationContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "process", "Lcom/bbflight/background_downloader/TaskStatus;", "connection", "Ljava/net/HttpURLConnection;", "filePath", "", "(Ljava/net/HttpURLConnection;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processBinaryUpload", "processMultipartUpload", "extractResponseBody", "", "fieldEntry", "name", "value", "headerForField", "isPlainAscii", "", "string", "isJsonString", "browserEncode", "lengthInBytes", "", "Companion", "background_downloader_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUploadTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadTaskWorker.kt\ncom/bbflight/background_downloader/UploadTaskWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n1#2:458\n*E\n"})
/* loaded from: classes3.dex */
public final class UploadTaskWorker extends TaskWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Regex B = new Regex("^[\\x00-\\x7F]+$");
    public static final Regex C = new Regex("^\\s*(\\{.*\\}|\\[.*\\])\\s*$");
    public static final Regex D = new Regex("\r\n|\r|\n");

    /* renamed from: com.bbflight.background_downloader.UploadTaskWorker$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    @DebugMetadata(c = "com.bbflight.background_downloader.UploadTaskWorker", f = "UploadTaskWorker.kt", i = {0, 0, 1, 1}, l = {45, 47}, m = "process", n = {"connection", "filePath", "connection", "filePath"}, nl = {47, 44}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
    public static final class b extends ContinuationImpl {
        public HttpURLConnection a;
        public /* synthetic */ Object b;
        public int d;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return UploadTaskWorker.this.l(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadTaskWorker(Context applicationContext, WorkerParameters workerParams) {
        super(applicationContext, workerParams);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    public static String r(String str) {
        String replace$default;
        replace$default = StringsKt__StringsJVMKt.replace$default(D.replace(str, "%0D%0A"), "\"", "%22", false, 4, (Object) null);
        return replace$default;
    }

    public static String s(String str, String str2) {
        String b2 = android.support.v4.media.b.b("content-disposition: form-data; name=\"", r(str), "\"");
        if (!B.matches(str2)) {
            b2 = androidx.compose.runtime.changelist.d.b(b2, "\r\ncontent-type: text/plain; charset=utf-8\r\ncontent-transfer-encoding: binary");
        } else if (C.matches(str2)) {
            b2 = androidx.compose.runtime.changelist.d.b(b2, "\r\ncontent-type: application/json; charset=utf-8\r\n");
        }
        return androidx.fragment.app.u.a("-------background_downloader-akjhfw281onqciyhnIk\r\n", androidx.compose.runtime.changelist.d.b(b2, "\r\n\r\n"), str2, "\r\n");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0347 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r7v20, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19, types: [T, java.lang.String] */
    @Override // com.bbflight.background_downloader.TaskWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(HttpURLConnection httpURLConnection, String str, Continuation<? super W0> continuation) {
        b bVar;
        int i;
        String str2;
        List<Triple> list;
        int i2;
        Object f;
        HttpURLConnection httpURLConnection2;
        W0 w0;
        int ordinal;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i3 = bVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.d = i3 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar2.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    httpURLConnection.setDoOutput(true);
                    String str3 = k().h;
                    if (str3 != null) {
                        str2 = str3.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.areEqual(str2, "binary")) {
                        bVar2.a = httpURLConnection;
                        bVar2.d = 1;
                        obj = t(httpURLConnection, str, bVar2);
                        if (obj != coroutine_suspended) {
                            httpURLConnection2 = httpURLConnection;
                            w0 = (W0) obj;
                        }
                    } else {
                        bVar2.a = httpURLConnection;
                        bVar2.d = 2;
                        Regex regex = new Regex("^(?:\"[^\"]+\"\\s*,\\s*)+\"[^\"]+\"$");
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        objectRef.element = "";
                        for (Map.Entry<String, String> entry : k().k.entrySet()) {
                            if (regex.matches(entry.getValue())) {
                                for (MatchResult matchResult : Regex.findAll$default(new Regex("\"([^\"]+)\""), entry.getValue(), 0, 2, null)) {
                                    objectRef.element = objectRef.element + s(entry.getKey(), matchResult.getGroupValues().get(1));
                                }
                            } else {
                                objectRef.element = objectRef.element + s(entry.getKey(), entry.getValue());
                            }
                        }
                        if (str.length() > 0) {
                            list = CollectionsKt.listOf(new Triple(k().i, str, k().j));
                        } else {
                            M0 k = k();
                            Context context = getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
                            k.getClass();
                            Intrinsics.checkNotNullParameter(context, "context");
                            b.a aVar = kotlinx.serialization.json.b.d;
                            String str4 = k.i;
                            aVar.getClass();
                            kotlinx.serialization.internal.S0 s0 = kotlinx.serialization.internal.S0.a;
                            List list2 = (List) aVar.a(new C1135f(s0), str4);
                            List list3 = (List) aVar.a(new C1135f(s0), k.d);
                            List list4 = (List) aVar.a(new C1135f(s0), k.j);
                            ArrayList arrayList = new ArrayList();
                            int size = list2.size();
                            int i4 = 0;
                            while (i4 < size) {
                                if (new File((String) list3.get(i4)).exists()) {
                                    i2 = size;
                                    arrayList.add(new Triple(list2.get(i4), list3.get(i4), list4.get(i4)));
                                } else {
                                    i2 = size;
                                    arrayList.add(new Triple(list2.get(i4), k.b(context, (String) list3.get(i4)), list4.get(i4)));
                                }
                                i4++;
                                size = i2;
                            }
                            list = arrayList;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (Triple triple : list) {
                            String str5 = (String) triple.component1();
                            String str6 = (String) triple.component2();
                            String str7 = (String) triple.component3();
                            File file = new File(str6);
                            if (!file.exists() || !file.isFile()) {
                                this.q = new P0(W.c, defpackage.g.a("File to upload does not exist: ", str6), 2);
                                f = W0.f;
                                break;
                            }
                            String r = r(str5);
                            String name = file.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            arrayList2.add(androidx.core.database.a.d("Content-Disposition: form-data; name=\"", r, "\"; filename=\"", r(name), "\"\r\n"));
                            arrayList3.add("Content-Type: " + str7 + "\r\n\r\n");
                            arrayList4.add(Boxing.boxLong(file.length()));
                            list = list;
                        }
                        List list5 = list;
                        Iterator it = arrayList2.iterator();
                        int i5 = 0;
                        while (it.hasNext()) {
                            byte[] bytes = ((String) it.next()).getBytes(Charsets.UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            i5 += bytes.length;
                        }
                        Iterator it2 = arrayList3.iterator();
                        int i6 = 0;
                        while (it2.hasNext()) {
                            i6 += ((String) it2.next()).length();
                        }
                        long sumOfLong = CollectionsKt.sumOfLong(arrayList4) + i5 + i6 + (arrayList2.size() * 52) + 2;
                        Intrinsics.checkNotNullExpressionValue(((String) objectRef.element).getBytes(Charsets.UTF_8), "getBytes(...)");
                        long length = r0.length + 50 + sumOfLong;
                        f(k(), length);
                        httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
                        httpURLConnection.setRequestProperty(RtspHeaders.CONNECTION, "Keep-Alive");
                        httpURLConnection.setRequestProperty(RtspHeaders.CACHE_CONTROL, "no-cache");
                        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "multipart/form-data; boundary=-----background_downloader-akjhfw281onqciyhnIk");
                        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_LENGTH, String.valueOf(length));
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        httpURLConnection.setUseCaches(false);
                        kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                        f = C1082i.f(new z1(httpURLConnection, objectRef, list5, arrayList2, arrayList3, this, length, null), kotlinx.coroutines.scheduling.b.a, bVar2);
                        obj = f;
                        if (obj != coroutine_suspended) {
                            httpURLConnection2 = httpURLConnection;
                            w0 = (W0) obj;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    httpURLConnection2 = bVar2.a;
                    ResultKt.throwOnFailure(obj);
                    w0 = (W0) obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpURLConnection2 = bVar2.a;
                    ResultKt.throwOnFailure(obj);
                    w0 = (W0) obj;
                }
                HttpURLConnection httpURLConnection3 = httpURLConnection2;
                ordinal = w0.ordinal();
                if (ordinal == 2) {
                    if (ordinal == 4) {
                        return W0.f;
                    }
                    if (ordinal != 5) {
                        return W0.f;
                    }
                    String str8 = k().a;
                    return W0.i;
                }
                try {
                    InputStream inputStream = httpURLConnection3.getInputStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                    this.r = TextStreamsKt.readText(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192));
                } catch (Exception e) {
                    httpURLConnection3.getResponseCode();
                    e.toString();
                    this.r = null;
                }
                Map<String, List<String>> headerFields = httpURLConnection3.getHeaderFields();
                Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
                i(headerFields);
                this.t = Boxing.boxInt(httpURLConnection3.getResponseCode());
                int responseCode = httpURLConnection3.getResponseCode();
                if (200 <= responseCode && responseCode < 207) {
                    String str9 = k().a;
                    return W0.d;
                }
                httpURLConnection3.getResponseCode();
                String str10 = k().b;
                String m = TaskWorker.m(httpURLConnection3);
                W w = W.i;
                int responseCode2 = httpURLConnection3.getResponseCode();
                if (m == null || m.length() <= 0) {
                    m = httpURLConnection3.getResponseMessage();
                }
                Intrinsics.checkNotNull(m);
                this.q = new P0(w, responseCode2, m);
                return httpURLConnection3.getResponseCode() == 404 ? W0.e : W0.f;
            }
        }
        bVar = new b((ContinuationImpl) continuation);
        b bVar22 = bVar;
        Object obj2 = bVar22.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar22.d;
        if (i != 0) {
        }
        HttpURLConnection httpURLConnection32 = httpURLConnection2;
        ordinal = w0.ordinal();
        if (ordinal == 2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(HttpURLConnection httpURLConnection, String str, ContinuationImpl continuationImpl) {
        w1 w1Var;
        int i;
        ?? r1;
        String str2;
        HttpURLConnection httpURLConnection2;
        boolean startsWith$default;
        int i2;
        Long l;
        if (continuationImpl instanceof w1) {
            w1Var = (w1) continuationImpl;
            int i3 = w1Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w1Var.l = i3 - Integer.MIN_VALUE;
                w1 w1Var2 = w1Var;
                Object obj = w1Var2.j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = w1Var2.l;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (k().m == B.e) {
                        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(k().l, "content://", false, 2, null);
                        if (startsWith$default) {
                            r1 = 1;
                            kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.scheduling.b.a;
                            x1 x1Var = new x1(r1, this, str, null);
                            w1Var2.a = httpURLConnection;
                            w1Var2.b = SpillingKt.nullOutSpilledVariable(str);
                            w1Var2.i = r1;
                            w1Var2.l = 1;
                            obj = C1082i.f(x1Var, bVar, w1Var2);
                            if (obj != coroutine_suspended) {
                                str2 = str;
                                httpURLConnection2 = httpURLConnection;
                                i2 = r1;
                            }
                        }
                    }
                    r1 = 0;
                    kotlinx.coroutines.scheduling.c cVar2 = C1049c0.a;
                    kotlinx.coroutines.scheduling.b bVar2 = kotlinx.coroutines.scheduling.b.a;
                    x1 x1Var2 = new x1(r1, this, str, null);
                    w1Var2.a = httpURLConnection;
                    w1Var2.b = SpillingKt.nullOutSpilledVariable(str);
                    w1Var2.i = r1;
                    w1Var2.l = 1;
                    obj = C1082i.f(x1Var2, bVar2, w1Var2);
                    if (obj != coroutine_suspended) {
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                int i4 = w1Var2.i;
                String str3 = (String) w1Var2.b;
                httpURLConnection2 = (HttpURLConnection) w1Var2.a;
                ResultKt.throwOnFailure(obj);
                str2 = str3;
                i2 = i4;
                int i5 = i2;
                Pair pair = (Pair) obj;
                l = (Long) pair.component1();
                InputStream inputStream = (InputStream) pair.component2();
                if (l != null || inputStream == null) {
                    return W0.f;
                }
                Ref.LongRef longRef = new Ref.LongRef();
                long longValue = l.longValue() - 1;
                String str4 = k().e.get(RtspHeaders.RANGE);
                if (str4 != null) {
                    MatchResult find$default = Regex.find$default(new Regex("bytes=(\\d+)-(\\d*)"), str4, 0, 2, null);
                    if (find$default == null) {
                        this.q = new P0(W.b, "Invalid Range header ".concat(str4), 2);
                        return W0.f;
                    }
                    longRef.element = Long.parseLong(find$default.getGroupValues().get(1));
                    if (find$default.getGroupValues().size() > 2 && find$default.getGroupValues().get(2).length() > 0) {
                        longValue = Long.parseLong(find$default.getGroupValues().get(2));
                    }
                }
                long j = (longValue - longRef.element) + 1;
                f(k(), j);
                String str5 = k().a;
                httpURLConnection2.setRequestProperty(RtspHeaders.CONTENT_TYPE, k().j);
                httpURLConnection2.setRequestProperty("Content-Disposition", "attachment; filename=\"" + Uri.encode(k().d) + "\"");
                httpURLConnection2.setRequestProperty(RtspHeaders.CONTENT_LENGTH, String.valueOf(j));
                httpURLConnection2.setFixedLengthStreamingMode(j);
                kotlinx.coroutines.scheduling.c cVar3 = C1049c0.a;
                kotlinx.coroutines.scheduling.b bVar3 = kotlinx.coroutines.scheduling.b.a;
                y1 y1Var = new y1(inputStream, str4, longRef, j, httpURLConnection2, this, l, null);
                w1Var2.a = SpillingKt.nullOutSpilledVariable(httpURLConnection2);
                w1Var2.b = SpillingKt.nullOutSpilledVariable(str2);
                w1Var2.c = SpillingKt.nullOutSpilledVariable(l);
                w1Var2.d = SpillingKt.nullOutSpilledVariable(inputStream);
                w1Var2.e = SpillingKt.nullOutSpilledVariable(longRef);
                w1Var2.f = SpillingKt.nullOutSpilledVariable(str4);
                w1Var2.i = i5;
                w1Var2.l = 2;
                Object f = C1082i.f(y1Var, bVar3, w1Var2);
                return f == coroutine_suspended ? coroutine_suspended : f;
            }
        }
        w1Var = new w1(this, continuationImpl);
        w1 w1Var22 = w1Var;
        Object obj2 = w1Var22.j;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = w1Var22.l;
        if (i != 0) {
        }
        int i52 = i2;
        Pair pair2 = (Pair) obj2;
        l = (Long) pair2.component1();
        InputStream inputStream2 = (InputStream) pair2.component2();
        if (l != null) {
        }
        return W0.f;
    }
}
