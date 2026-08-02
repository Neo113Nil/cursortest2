package com.amplitude.core.utilities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1101n0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.W;

@SourceDebugExtension({"SMAP\nInMemoryResponseHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InMemoryResponseHandler.kt\ncom/amplitude/core/utilities/InMemoryResponseHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1864#2,3:177\n1855#2,2:180\n1864#2,3:182\n1855#2,2:185\n1855#2,2:187\n1855#2,2:189\n1855#2,2:191\n*S KotlinDebug\n*F\n+ 1 InMemoryResponseHandler.kt\ncom/amplitude/core/utilities/InMemoryResponseHandler\n*L\n54#1:177,3\n62#1:180,2\n101#1:182,3\n115#1:185,2\n148#1:187,2\n156#1:189,2\n166#1:191,2\n*E\n"})
/* loaded from: classes3.dex */
public final class t implements com.amplitude.core.utilities.http.h {
    public static final a Companion = new a();
    public final com.amplitude.core.platform.b a;
    public final com.amplitude.android.h b;
    public final K c;
    public final C1101n0 d;

    public static final class a {
    }

    @DebugMetadata(c = "com.amplitude.core.utilities.InMemoryResponseHandler$handlePayloadTooLargeResponse$1", f = "InMemoryResponseHandler.kt", i = {0}, l = {86}, m = "invokeSuspend", n = {"it"}, s = {"L$2"})
    @SourceDebugExtension({"SMAP\nInMemoryResponseHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InMemoryResponseHandler.kt\ncom/amplitude/core/utilities/InMemoryResponseHandler$handlePayloadTooLargeResponse$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1855#2,2:177\n*S KotlinDebug\n*F\n+ 1 InMemoryResponseHandler.kt\ncom/amplitude/core/utilities/InMemoryResponseHandler$handlePayloadTooLargeResponse$1\n*L\n85#1:177,2\n*E\n"})
    public static final class b extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public t a;
        public Iterator b;
        public com.amplitude.core.events.a c;
        public int d;
        public final /* synthetic */ List<com.amplitude.core.events.a> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends com.amplitude.core.events.a> list, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return t.this.new b(this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((b) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x004c -> B:5:0x004f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            t tVar;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.this;
                tVar2.a.k.incrementAndGet();
                tVar = tVar2;
                it = this.f.iterator();
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.amplitude.core.events.a aVar = this.c;
                it = this.b;
                tVar = this.a;
                ResultKt.throwOnFailure(obj);
                tVar.a.a(aVar);
                if (it.hasNext()) {
                    aVar = (com.amplitude.core.events.a) it.next();
                    this.a = tVar;
                    this.b = it;
                    this.c = aVar;
                    this.d = 1;
                    if (W.b(30000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tVar.a.a(aVar);
                    if (it.hasNext()) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    @DebugMetadata(c = "com.amplitude.core.utilities.InMemoryResponseHandler$handleTimeoutResponse$1", f = "InMemoryResponseHandler.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nInMemoryResponseHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InMemoryResponseHandler.kt\ncom/amplitude/core/utilities/InMemoryResponseHandler$handleTimeoutResponse$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1855#2,2:177\n*S KotlinDebug\n*F\n+ 1 InMemoryResponseHandler.kt\ncom/amplitude/core/utilities/InMemoryResponseHandler$handleTimeoutResponse$1\n*L\n134#1:177,2\n*E\n"})
    public static final class c extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<com.amplitude.core.events.a> b;
        public final /* synthetic */ t c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t tVar, List list, Continuation continuation) {
            super(2, continuation);
            this.b = list;
            this.c = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.c, this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((c) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (W.b(30000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                this.c.a.a((com.amplitude.core.events.a) it.next());
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.amplitude.core.utilities.InMemoryResponseHandler$handleTooManyRequestsResponse$3", f = "InMemoryResponseHandler.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nInMemoryResponseHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InMemoryResponseHandler.kt\ncom/amplitude/core/utilities/InMemoryResponseHandler$handleTooManyRequestsResponse$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1855#2,2:177\n*S KotlinDebug\n*F\n+ 1 InMemoryResponseHandler.kt\ncom/amplitude/core/utilities/InMemoryResponseHandler$handleTooManyRequestsResponse$3\n*L\n120#1:177,2\n*E\n"})
    public static final class d extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ t c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ArrayList arrayList, t tVar, Continuation continuation) {
            super(2, continuation);
            this.b = arrayList;
            this.c = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((d) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (W.b(30000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                this.c.a.a((com.amplitude.core.events.a) it.next());
            }
            return Unit.INSTANCE;
        }
    }

    public t(com.amplitude.core.platform.b eventPipeline, com.amplitude.android.h configuration, K scope, C1101n0 storageDispatcher) {
        Intrinsics.checkNotNullParameter(eventPipeline, "eventPipeline");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storageDispatcher, "storageDispatcher");
        this.a = eventPipeline;
        this.b = configuration;
        this.c = scope;
        this.d = storageDispatcher;
    }

    @Override // com.amplitude.core.utilities.http.h
    public final void a(com.amplitude.core.utilities.http.j timeoutResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(timeoutResponse, "timeoutResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        C1082i.c(this.c, this.d, null, new c(this, (List) events, null), 2);
    }

    @Override // com.amplitude.core.utilities.http.h
    public final void b(com.amplitude.core.utilities.http.k tooManyRequestsResponse, Object events, String eventsString) {
        String str;
        Intrinsics.checkNotNullParameter(tooManyRequestsResponse, "tooManyRequestsResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (Object obj : (List) events) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            com.amplitude.core.events.a event = (com.amplitude.core.events.a) obj;
            tooManyRequestsResponse.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            String str2 = event.a;
            if ((str2 != null && CollectionsKt.contains(tooManyRequestsResponse.b, str2)) || ((str = event.b) != null && CollectionsKt.contains(tooManyRequestsResponse.c, str))) {
                arrayList.add(event);
            } else if (tooManyRequestsResponse.g.contains(Integer.valueOf(i))) {
                arrayList3.add(event);
            } else {
                arrayList2.add(event);
            }
            i = i2;
        }
        h(com.amplitude.core.utilities.http.f.f.a.getFirst(), tooManyRequestsResponse.f, arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.a.a((com.amplitude.core.events.a) it.next());
        }
        C1082i.c(this.c, this.d, null, new d(arrayList3, this, null), 2);
    }

    @Override // com.amplitude.core.utilities.http.h
    public final void c(com.amplitude.core.utilities.http.c failedResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(failedResponse, "failedResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.amplitude.core.events.a aVar : (List) events) {
            if (aVar.N >= this.b.k) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        h(com.amplitude.core.utilities.http.f.i.a.getFirst(), failedResponse.b, arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.a.a((com.amplitude.core.events.a) it.next());
        }
    }

    @Override // com.amplitude.core.utilities.http.h
    public final void e(com.amplitude.core.utilities.http.g payloadTooLargeResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(payloadTooLargeResponse, "payloadTooLargeResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        List list = (List) events;
        if (list.size() == 1) {
            h(com.amplitude.core.utilities.http.f.e.a.getFirst(), payloadTooLargeResponse.b, list);
        } else {
            C1082i.c(this.c, this.d, null, new b(list, null), 2);
        }
    }

    @Override // com.amplitude.core.utilities.http.h
    public final boolean f(com.amplitude.core.utilities.http.b badRequestResponse, Object events, String eventsString) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(badRequestResponse, "badRequestResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        List list = (List) events;
        String lowerCase = badRequestResponse.b.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        contains$default = StringsKt__StringsKt.contains$default(lowerCase, "invalid api key", false, 2, (Object) null);
        String str = badRequestResponse.b;
        if (contains$default) {
            h(com.amplitude.core.utilities.http.f.c.a.getFirst(), str, list);
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(badRequestResponse.c);
        linkedHashSet.addAll(badRequestResponse.d);
        linkedHashSet.addAll(badRequestResponse.e);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            com.amplitude.core.events.a event = (com.amplitude.core.events.a) obj;
            if (!linkedHashSet.contains(Integer.valueOf(i))) {
                Intrinsics.checkNotNullParameter(event, "event");
                String str2 = event.b;
                if (!(str2 != null ? badRequestResponse.f.contains(str2) : false)) {
                    arrayList2.add(event);
                    i = i2;
                }
            }
            arrayList.add(event);
            i = i2;
        }
        h(com.amplitude.core.utilities.http.f.c.a.getFirst(), str, arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.a.a((com.amplitude.core.events.a) it.next());
        }
        return arrayList.isEmpty();
    }

    @Override // com.amplitude.core.utilities.http.h
    public final void g(com.amplitude.core.utilities.http.i successResponse, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(successResponse, "successResponse");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        h(com.amplitude.core.utilities.http.f.b.a.getFirst(), "Event sent success.", (List) events);
    }

    public final void h(int i, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.amplitude.core.events.a) it.next()).getClass();
        }
    }
}
