package com.amplitude.core.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1101n0;
import kotlinx.coroutines.K;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nFileResponseHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileResponseHandler.kt\ncom/amplitude/core/utilities/FileResponseHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,210:1\n1864#2,3:211\n1855#2,2:214\n1855#2,2:216\n1313#3,2:218\n*S KotlinDebug\n*F\n+ 1 FileResponseHandler.kt\ncom/amplitude/core/utilities/FileResponseHandler\n*L\n63#1:211,3\n80#1:214,2\n186#1:216,2\n203#1:218,2\n*E\n"})
/* loaded from: classes3.dex */
public final class q implements com.amplitude.core.utilities.http.h {
    public final com.amplitude.android.storage.i a;
    public final com.amplitude.core.platform.b b;
    public final K c;
    public final C1101n0 d;
    public final com.amplitude.common.a e;

    @DebugMetadata(c = "com.amplitude.core.utilities.FileResponseHandler$handleBadRequestResponse$1", f = "FileResponseHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            q.this.a.e(this.b);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.amplitude.core.utilities.FileResponseHandler$handleBadRequestResponse$3", f = "FileResponseHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new b(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((b) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            q.this.a.i((String) this.b);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.amplitude.core.utilities.FileResponseHandler$handleBadRequestResponse$5", f = "FileResponseHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String b;
        public final /* synthetic */ ArrayList c;
        public final /* synthetic */ ArrayList d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, ArrayList arrayList, ArrayList arrayList2, Continuation continuation) {
            super(2, continuation);
            this.b = str;
            this.c = arrayList;
            this.d = arrayList2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new c(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((c) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List split$default;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            q qVar = q.this;
            com.amplitude.common.a aVar = qVar.e;
            String str = this.b;
            if (aVar != null) {
                StringBuilder sb = new StringBuilder("--> remove file: ");
                split$default = StringsKt__StringsKt.split$default(str, new String[]{"-"}, false, 0, 6, (Object) null);
                sb.append(CollectionsKt.takeLast(split$default, 2));
                sb.append(", dropped events: ");
                sb.append(this.c.size());
                sb.append(", retry events: ");
                sb.append(this.d.size());
                aVar.c(sb.toString());
            }
            qVar.a.e(str);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.amplitude.core.utilities.FileResponseHandler$handleFailedResponse$1", f = "FileResponseHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new d(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((d) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            com.amplitude.android.storage.i iVar = q.this.a;
            Object obj2 = this.b;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            iVar.i((String) obj2);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.amplitude.core.utilities.FileResponseHandler$handlePayloadTooLargeResponse$1", f = "FileResponseHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new e(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((e) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            q.this.a.e(this.b);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.amplitude.core.utilities.FileResponseHandler$handlePayloadTooLargeResponse$2", f = "FileResponseHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONArray c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, JSONArray jSONArray, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = jSONArray;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new f(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((f) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            com.amplitude.android.storage.i iVar = q.this.a;
            String filePath = this.b;
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            JSONArray events = this.c;
            Intrinsics.checkNotNullParameter(events, "events");
            com.amplitude.core.utilities.h hVar = iVar.c;
            File file = hVar.a;
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            Intrinsics.checkNotNullParameter(events, "events");
            File file2 = new File(filePath);
            if (file2.exists()) {
                String name = file2.getName();
                File file3 = new File(file, androidx.compose.runtime.changelist.d.b(name, "-1.tmp"));
                File file4 = new File(file, androidx.compose.runtime.changelist.d.b(name, "-2.tmp"));
                Intrinsics.checkNotNullParameter(events, "<this>");
                int length = events.length() / 2;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<Integer> it = RangesKt.until(0, events.length()).iterator();
                while (it.hasNext()) {
                    int nextInt = ((IntIterator) it).nextInt();
                    if (nextInt < length) {
                        JSONObject jSONObject = events.getJSONObject(nextInt);
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                        arrayList.add(jSONObject);
                    } else {
                        JSONObject jSONObject2 = events.getJSONObject(nextInt);
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                        arrayList2.add(jSONObject2);
                    }
                }
                Pair pair = new Pair(arrayList, arrayList2);
                hVar.j((List) pair.getFirst(), file3, true);
                hVar.j((List) pair.getSecond(), file4, true);
                hVar.f(filePath);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.amplitude.core.utilities.FileResponseHandler$handleSuccessResponse$1", f = "FileResponseHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new g(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((g) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            q.this.a.e(this.b);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.amplitude.core.utilities.FileResponseHandler$handleTimeoutResponse$1", f = "FileResponseHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new h(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((h) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            com.amplitude.android.storage.i iVar = q.this.a;
            Object obj2 = this.b;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            iVar.i((String) obj2);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.amplitude.core.utilities.FileResponseHandler$handleTooManyRequestsResponse$1", f = "FileResponseHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Object obj, Continuation<? super i> continuation) {
            super(2, continuation);
            this.b = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new i(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((i) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            com.amplitude.android.storage.i iVar = q.this.a;
            Object obj2 = this.b;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            iVar.i((String) obj2);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.amplitude.core.utilities.FileResponseHandler$parseEvents$1", f = "FileResponseHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, Continuation<? super j> continuation) {
            super(2, continuation);
            this.b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new j(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((j) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            q.this.a.e(this.b);
            return Unit.INSTANCE;
        }
    }

    public q(com.amplitude.android.storage.i storage, com.amplitude.core.platform.b eventPipeline, com.amplitude.android.h configuration, K scope, C1101n0 storageDispatcher, com.amplitude.common.a aVar) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(eventPipeline, "eventPipeline");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storageDispatcher, "storageDispatcher");
        this.a = storage;
        this.b = eventPipeline;
        this.c = scope;
        this.d = storageDispatcher;
        this.e = aVar;
    }

    @Override // com.amplitude.core.utilities.http.h
    public final void a(com.amplitude.core.utilities.http.j timeoutResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(timeoutResponse, "timeoutResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        com.amplitude.common.a aVar = this.e;
        if (aVar != null) {
            aVar.c("Handle response, status: " + timeoutResponse.a);
        }
        C1082i.c(this.c, this.d, null, new h(events, null), 2);
    }

    @Override // com.amplitude.core.utilities.http.h
    public final void b(com.amplitude.core.utilities.http.k tooManyRequestsResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(tooManyRequestsResponse, "tooManyRequestsResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        com.amplitude.common.a aVar = this.e;
        if (aVar != null) {
            aVar.c("Handle response, status: " + tooManyRequestsResponse.a + ", error: " + tooManyRequestsResponse.f);
        }
        C1082i.c(this.c, this.d, null, new i(events, null), 2);
    }

    @Override // com.amplitude.core.utilities.http.h
    public final void c(com.amplitude.core.utilities.http.c failedResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(failedResponse, "failedResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        com.amplitude.common.a aVar = this.e;
        if (aVar != null) {
            aVar.c("Handle response, status: " + failedResponse.a + ", error: " + failedResponse.b);
        }
        C1082i.c(this.c, this.d, null, new d(events, null), 2);
    }

    @Override // com.amplitude.core.utilities.http.h
    public final void e(com.amplitude.core.utilities.http.g payloadTooLargeResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(payloadTooLargeResponse, "payloadTooLargeResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        com.amplitude.common.a aVar = this.e;
        if (aVar != null) {
            aVar.c("Handle response, status: " + payloadTooLargeResponse.a + ", error: " + payloadTooLargeResponse.b);
        }
        String str = (String) events;
        JSONArray h2 = h(eventsString, str);
        int length = h2.length();
        C1101n0 c1101n0 = this.d;
        K k = this.c;
        if (length != 1) {
            C1082i.c(k, c1101n0, null, new f(str, h2, null), 2);
            return;
        }
        i(com.amplitude.core.utilities.http.f.e.a.getFirst(), payloadTooLargeResponse.b, x.g(h2));
        C1082i.c(k, c1101n0, null, new e(str, null), 2);
    }

    @Override // com.amplitude.core.utilities.http.h
    public final boolean f(com.amplitude.core.utilities.http.b badRequestResponse, Object events, String eventsString) {
        boolean contains$default;
        boolean z;
        Intrinsics.checkNotNullParameter(badRequestResponse, "badRequestResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        com.amplitude.common.a aVar = this.e;
        if (aVar != null) {
            aVar.c("Handle response, status: " + badRequestResponse.a + ", error: " + badRequestResponse.b);
        }
        String str = (String) events;
        ArrayList g2 = x.g(h(eventsString, str));
        String lowerCase = badRequestResponse.b.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        contains$default = StringsKt__StringsKt.contains$default(lowerCase, "invalid api key", false, 2, (Object) null);
        String str2 = badRequestResponse.b;
        C1101n0 c1101n0 = this.d;
        K k = this.c;
        boolean z2 = false;
        if (contains$default) {
            i(com.amplitude.core.utilities.http.f.c.a.getFirst(), str2, g2);
            C1082i.c(k, c1101n0, null, new a(str, null), 2);
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(badRequestResponse.c);
        linkedHashSet.addAll(badRequestResponse.d);
        linkedHashSet.addAll(badRequestResponse.e);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = g2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            com.amplitude.core.events.a event = (com.amplitude.core.events.a) next;
            if (linkedHashSet.contains(Integer.valueOf(i2))) {
                z = z2;
            } else {
                Intrinsics.checkNotNullParameter(event, "event");
                String str3 = event.b;
                z = z2;
                if (str3 != null) {
                    z2 = badRequestResponse.f.contains(str3);
                }
                if (!z2) {
                    arrayList2.add(event);
                    z2 = z;
                    i2 = i3;
                }
            }
            arrayList.add(event);
            z2 = z;
            i2 = i3;
        }
        boolean z3 = z2;
        if (arrayList.isEmpty()) {
            C1082i.c(k, c1101n0, null, new b(events, null), 2);
            return true;
        }
        i(com.amplitude.core.utilities.http.f.c.a.getFirst(), str2, arrayList);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.b.a((com.amplitude.core.events.a) it2.next());
        }
        C1082i.c(k, c1101n0, null, new c(str, arrayList, arrayList2, null), 2);
        return z3;
    }

    @Override // com.amplitude.core.utilities.http.h
    public final void g(com.amplitude.core.utilities.http.i successResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(successResponse, "successResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        String str = (String) events;
        com.amplitude.common.a aVar = this.e;
        if (aVar != null) {
            aVar.c("Handle response, status: " + successResponse.a);
        }
        i(com.amplitude.core.utilities.http.f.b.a.getFirst(), "Event sent success.", x.g(h(eventsString, str)));
        C1082i.c(this.c, this.d, null, new g(str, null), 2);
    }

    public final JSONArray h(String str, String str2) {
        try {
            return new JSONArray(str);
        } catch (JSONException e2) {
            j jVar = new j(str2, null);
            K k = this.c;
            C1101n0 c1101n0 = this.d;
            C1082i.c(k, c1101n0, null, jVar, 2);
            Iterator it = Regex.findAll$default(new Regex("\"insert_id\":\"(.{36})\","), str, 0, 2, null).iterator();
            while (it.hasNext()) {
                C1082i.c(k, c1101n0, null, new r(this, (MatchResult) it.next(), null), 2);
            }
            throw e2;
        }
    }

    public final void i(int i2, String str, ArrayList arrayList) {
        int i3;
        String str2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.amplitude.core.events.a aVar = (com.amplitude.core.events.a) it.next();
            String str3 = aVar.f;
            if (str3 != null) {
                i3 = i2;
                str2 = str;
                C1082i.c(this.c, this.d, null, new s(this, str3, aVar, i3, str2, null), 2);
            } else {
                i3 = i2;
                str2 = str;
            }
            i2 = i3;
            str = str2;
        }
    }
}
