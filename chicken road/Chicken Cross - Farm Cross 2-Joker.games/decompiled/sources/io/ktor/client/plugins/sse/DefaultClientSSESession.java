package io.ktor.client.plugins.sse;

import androidx.core.app.NotificationCompat;
import com.google.common.net.HttpHeaders;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.sse.ServerSentEvent;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ClosedByteChannelException;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DefaultClientSSESession.kt */
@Deprecated(message = "It should be marked with `@InternalAPI`, please use `ClientSSESession` instead")
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u000b*\u00060\u0017j\u0002`\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u0019*\u00060\u0017j\u0002`\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0013H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u001f*\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010!J\u0013\u0010#\u001a\u00020\u001f*\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010!R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010.R\u0014\u00104\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0013098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0013098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lio/ktor/client/plugins/sse/DefaultClientSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lio/ktor/client/plugins/sse/SSEClientContent;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/client/plugins/sse/SSEClientContent;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;)V", "(Lio/ktor/client/plugins/sse/SSEClientContent;Lio/ktor/utils/io/ByteReadChannel;)V", "", "doReconnection", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "getRequestForReconnection", "()Lio/ktor/client/request/HttpRequestBuilder;", "close", "()V", "Lio/ktor/sse/ServerSentEvent;", "tryParseEvent", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseEvent", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "comment", "appendComment", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "toText", "(Ljava/lang/StringBuilder;)Ljava/lang/String;", "", "isEmpty", "(Lio/ktor/sse/ServerSentEvent;)Z", "isCommentsEvent", "isRetryEvent", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "lastEventId", "Ljava/lang/String;", "", "reconnectionTimeMillis", "J", "showCommentEvents", "Z", "showRetryEvents", "", "maxReconnectionAttempts", "I", "needToReconnect", "initialRequest", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/HttpClient;", "clientForReconnection", "Lio/ktor/client/HttpClient;", "Lkotlinx/coroutines/flow/Flow;", "_incoming", "Lkotlinx/coroutines/flow/Flow;", "getIncoming", "()Lkotlinx/coroutines/flow/Flow;", "incoming", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultClientSSESession implements SSESession {
    private Flow<ServerSentEvent> _incoming;
    private final HttpClient clientForReconnection;
    private final CoroutineContext coroutineContext;
    private final HttpRequestBuilder initialRequest;
    private ByteReadChannel input;
    private String lastEventId;
    private final int maxReconnectionAttempts;
    private boolean needToReconnect;
    private long reconnectionTimeMillis;
    private final boolean showCommentEvents;
    private final boolean showRetryEvents;

    public DefaultClientSSESession(SSEClientContent content, ByteReadChannel input, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.input = input;
        this.coroutineContext = coroutineContext;
        this.reconnectionTimeMillis = Duration.m9437getInWholeMillisecondsimpl(content.getReconnectionTime());
        this.showCommentEvents = content.getShowCommentEvents();
        this.showRetryEvents = content.getShowRetryEvents();
        int maxReconnectionAttempts = content.getMaxReconnectionAttempts();
        this.maxReconnectionAttempts = maxReconnectionAttempts;
        this.needToReconnect = maxReconnectionAttempts > 0;
        HttpRequestBuilder initialRequest = content.getInitialRequest();
        this.initialRequest = initialRequest;
        this.clientForReconnection = (HttpClient) initialRequest.getAttributes().get(SSEKt.getSSEClientForReconnectionAttr());
        this._incoming = FlowKt.onCompletion(FlowKt.m9620catch(FlowKt.flow(new DefaultClientSSESession$_incoming$1(this, null)), new DefaultClientSSESession$_incoming$2(this, null)), new DefaultClientSSESession$_incoming$3(this, null));
        JobKt.getJob(getCoroutineContext()).invokeOnCompletion(new Function1() { // from class: io.ktor.client.plugins.sse.DefaultClientSSESession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$0;
                _init_$lambda$0 = DefaultClientSSESession._init_$lambda$0(DefaultClientSSESession.this, (Throwable) obj);
                return _init_$lambda$0;
            }
        });
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DefaultClientSSESession(SSEClientContent content, ByteReadChannel input) {
        this(content, input, r0.plus(r1).plus(new CoroutineName("DefaultClientSSESession")));
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(input, "input");
        CoroutineContext callContext = content.getCallContext();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(DefaultClientSSESession defaultClientSSESession, Throwable th) {
        defaultClientSSESession.close();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doReconnection(Continuation<? super Unit> continuation) {
        Object withContext = kotlinx.coroutines.BuildersKt.withContext(getCoroutineContext(), new DefaultClientSSESession$doReconnection$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpRequestBuilder getRequestForReconnection() {
        HttpRequestBuilder takeFrom = new HttpRequestBuilder().takeFrom(this.initialRequest);
        takeFrom.getAttributes().remove(BuildersKt.getSseRequestAttr());
        takeFrom.getAttributes().put(SSEKt.getSSEReconnectionRequestAttr(), true);
        String str = this.lastEventId;
        if (str != null) {
            takeFrom.getHeaders().append(HttpHeaders.LAST_EVENT_ID, str);
        }
        return takeFrom;
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    public Flow<ServerSentEvent> getIncoming() {
        return this._incoming;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close() {
        JobKt__JobKt.cancel$default(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        ByteReadChannelKt.cancel(this.input);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryParseEvent(ByteReadChannel byteReadChannel, Continuation<? super ServerSentEvent> continuation) {
        DefaultClientSSESession$tryParseEvent$1 defaultClientSSESession$tryParseEvent$1;
        int i;
        try {
            if (continuation instanceof DefaultClientSSESession$tryParseEvent$1) {
                defaultClientSSESession$tryParseEvent$1 = (DefaultClientSSESession$tryParseEvent$1) continuation;
                if ((defaultClientSSESession$tryParseEvent$1.label & Integer.MIN_VALUE) != 0) {
                    defaultClientSSESession$tryParseEvent$1.label -= Integer.MIN_VALUE;
                    Object obj = defaultClientSSESession$tryParseEvent$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = defaultClientSSESession$tryParseEvent$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        defaultClientSSESession$tryParseEvent$1.label = 1;
                        obj = parseEvent(byteReadChannel, defaultClientSSESession$tryParseEvent$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (ServerSentEvent) obj;
                }
            }
            if (i != 0) {
            }
            return (ServerSentEvent) obj;
        } catch (ClosedByteChannelException unused) {
            return null;
        }
        defaultClientSSESession$tryParseEvent$1 = new DefaultClientSSESession$tryParseEvent$1(this, continuation);
        Object obj2 = defaultClientSSESession$tryParseEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultClientSSESession$tryParseEvent$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x021e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0213 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0214 -> B:12:0x021a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00f1 -> B:68:0x00f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object parseEvent(ByteReadChannel byteReadChannel, Continuation<? super ServerSentEvent> continuation) {
        DefaultClientSSESession$parseEvent$1 defaultClientSSESession$parseEvent$1;
        int i;
        StringBuilder sb;
        StringBuilder sb2;
        Ref.ObjectRef objectRef;
        String str;
        ByteReadChannel byteReadChannel2;
        int i2;
        int i3;
        String str2;
        String str3;
        String str4;
        ByteReadChannel byteReadChannel3;
        Ref.ObjectRef objectRef2;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        Ref.ObjectRef objectRef3;
        ByteReadChannel byteReadChannel4;
        StringBuilder sb6;
        Ref.ObjectRef objectRef4;
        String str5;
        ByteReadChannel byteReadChannel5;
        Long longOrNull;
        boolean z;
        if (continuation instanceof DefaultClientSSESession$parseEvent$1) {
            defaultClientSSESession$parseEvent$1 = (DefaultClientSSESession$parseEvent$1) continuation;
            if ((defaultClientSSESession$parseEvent$1.label & Integer.MIN_VALUE) != 0) {
                defaultClientSSESession$parseEvent$1.label -= Integer.MIN_VALUE;
                Object obj = defaultClientSSESession$parseEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultClientSSESession$parseEvent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    sb = new StringBuilder();
                    sb2 = new StringBuilder();
                    objectRef = new Ref.ObjectRef();
                    str = this.lastEventId;
                    defaultClientSSESession$parseEvent$1.L$0 = byteReadChannel;
                    defaultClientSSESession$parseEvent$1.L$1 = sb;
                    defaultClientSSESession$parseEvent$1.L$2 = sb2;
                    defaultClientSSESession$parseEvent$1.L$3 = objectRef;
                    defaultClientSSESession$parseEvent$1.L$4 = str;
                    defaultClientSSESession$parseEvent$1.I$0 = 0;
                    defaultClientSSESession$parseEvent$1.I$1 = 0;
                    defaultClientSSESession$parseEvent$1.label = 1;
                    obj = ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel, 0, defaultClientSSESession$parseEvent$1, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteReadChannel2 = byteReadChannel;
                    i2 = 0;
                    i3 = 0;
                } else if (i == 1) {
                    i2 = defaultClientSSESession$parseEvent$1.I$1;
                    i3 = defaultClientSSESession$parseEvent$1.I$0;
                    str = (String) defaultClientSSESession$parseEvent$1.L$4;
                    objectRef = (Ref.ObjectRef) defaultClientSSESession$parseEvent$1.L$3;
                    sb2 = (StringBuilder) defaultClientSSESession$parseEvent$1.L$2;
                    sb = (StringBuilder) defaultClientSSESession$parseEvent$1.L$1;
                    byteReadChannel2 = (ByteReadChannel) defaultClientSSESession$parseEvent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    i2 = defaultClientSSESession$parseEvent$1.I$1;
                    i3 = defaultClientSSESession$parseEvent$1.I$0;
                    str = (String) defaultClientSSESession$parseEvent$1.L$4;
                    objectRef = (Ref.ObjectRef) defaultClientSSESession$parseEvent$1.L$3;
                    sb2 = (StringBuilder) defaultClientSSESession$parseEvent$1.L$2;
                    sb = (StringBuilder) defaultClientSSESession$parseEvent$1.L$1;
                    byteReadChannel2 = (ByteReadChannel) defaultClientSSESession$parseEvent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    str3 = null;
                    str2 = (String) obj;
                    if (str2 == null) {
                        return null;
                    }
                    if (StringsKt.isBlank(str2)) {
                        defaultClientSSESession$parseEvent$1.L$0 = byteReadChannel2;
                        defaultClientSSESession$parseEvent$1.L$1 = sb;
                        defaultClientSSESession$parseEvent$1.L$2 = sb2;
                        defaultClientSSESession$parseEvent$1.L$3 = objectRef;
                        defaultClientSSESession$parseEvent$1.L$4 = str;
                        defaultClientSSESession$parseEvent$1.I$0 = i3;
                        defaultClientSSESession$parseEvent$1.I$1 = i2;
                        defaultClientSSESession$parseEvent$1.label = 2;
                        obj = ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel2, 0, defaultClientSSESession$parseEvent$1, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = (String) obj;
                        if (str2 == null) {
                        }
                        if (StringsKt.isBlank(str2)) {
                            str4 = str3;
                            byteReadChannel3 = byteReadChannel2;
                            objectRef2 = objectRef;
                            StringBuilder sb7 = sb;
                            sb3 = sb2;
                            sb4 = sb7;
                            if (!StringsKt.isBlank(str2)) {
                            }
                            objectRef4 = objectRef3;
                            str5 = str4;
                            byteReadChannel5 = byteReadChannel4;
                            defaultClientSSESession$parseEvent$1.L$0 = byteReadChannel5;
                            defaultClientSSESession$parseEvent$1.L$1 = sb5;
                            defaultClientSSESession$parseEvent$1.L$2 = sb6;
                            defaultClientSSESession$parseEvent$1.L$3 = str5;
                            defaultClientSSESession$parseEvent$1.L$4 = objectRef4;
                            defaultClientSSESession$parseEvent$1.L$5 = str;
                            defaultClientSSESession$parseEvent$1.I$0 = i3;
                            defaultClientSSESession$parseEvent$1.I$1 = i2;
                            defaultClientSSESession$parseEvent$1.label = 3;
                            z = true;
                            obj = ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel5, 0, defaultClientSSESession$parseEvent$1, 1, null);
                            if (obj == coroutine_suspended) {
                            }
                        }
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = defaultClientSSESession$parseEvent$1.I$1;
                    i3 = defaultClientSSESession$parseEvent$1.I$0;
                    String str6 = (String) defaultClientSSESession$parseEvent$1.L$5;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) defaultClientSSESession$parseEvent$1.L$4;
                    String str7 = (String) defaultClientSSESession$parseEvent$1.L$3;
                    StringBuilder sb8 = (StringBuilder) defaultClientSSESession$parseEvent$1.L$2;
                    StringBuilder sb9 = (StringBuilder) defaultClientSSESession$parseEvent$1.L$1;
                    ByteReadChannel byteReadChannel6 = (ByteReadChannel) defaultClientSSESession$parseEvent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    str4 = str7;
                    sb3 = sb8;
                    objectRef2 = objectRef5;
                    sb4 = sb9;
                    z = true;
                    ByteReadChannel byteReadChannel7 = byteReadChannel6;
                    str = str6;
                    str2 = (String) obj;
                    if (str2 != null) {
                        return null;
                    }
                    byteReadChannel3 = byteReadChannel7;
                    if (!StringsKt.isBlank(str2)) {
                        this.lastEventId = str;
                        sb5 = sb4;
                        StringBuilder sb10 = sb3;
                        objectRef3 = objectRef2;
                        byteReadChannel4 = byteReadChannel3;
                        ServerSentEvent serverSentEvent = new ServerSentEvent(i3 != 0 ? toText(sb4) : null, str4, str, (Long) objectRef2.element, i2 != 0 ? toText(sb3) : null);
                        if (!isEmpty(serverSentEvent)) {
                            return serverSentEvent;
                        }
                        sb6 = sb10;
                    } else {
                        sb5 = sb4;
                        StringBuilder sb11 = sb3;
                        objectRef3 = objectRef2;
                        byteReadChannel4 = byteReadChannel3;
                        if (StringsKt.startsWith$default(str2, ServerSentEventKt.COLON, false, 2, (Object) null)) {
                            sb6 = sb11;
                            appendComment(sb6, str2);
                            str5 = str4;
                            objectRef4 = objectRef3;
                            byteReadChannel5 = byteReadChannel4;
                            i2 = 1;
                        } else {
                            sb6 = sb11;
                            String substringBefore$default = StringsKt.substringBefore$default(str2, ServerSentEventKt.COLON, (String) null, 2, (Object) null);
                            String removePrefix = StringsKt.removePrefix(StringsKt.substringAfter(str2, ServerSentEventKt.COLON, ""), (CharSequence) ServerSentEventKt.SPACE);
                            int hashCode = substringBefore$default.hashCode();
                            if (hashCode == 3355) {
                                objectRef4 = objectRef3;
                                if (substringBefore$default.equals("id") && !StringsKt.contains$default((CharSequence) removePrefix, (CharSequence) "\u0000", false, 2, (Object) null)) {
                                    str = removePrefix;
                                }
                            } else if (hashCode == 3076010) {
                                objectRef4 = objectRef3;
                                if (substringBefore$default.equals("data")) {
                                    sb5.append(removePrefix).append(ServerSentEventKt.END_OF_LINE);
                                    str5 = str4;
                                    byteReadChannel5 = byteReadChannel4;
                                    i3 = 1;
                                }
                            } else if (hashCode == 96891546) {
                                objectRef4 = objectRef3;
                                if (substringBefore$default.equals(NotificationCompat.CATEGORY_EVENT)) {
                                    str5 = removePrefix;
                                    byteReadChannel5 = byteReadChannel4;
                                }
                            } else if (hashCode == 108405416 && substringBefore$default.equals("retry") && (longOrNull = StringsKt.toLongOrNull(removePrefix)) != null) {
                                long longValue = longOrNull.longValue();
                                this.reconnectionTimeMillis = longValue;
                                objectRef4 = objectRef3;
                                objectRef4.element = Boxing.boxLong(longValue);
                            }
                            str5 = str4;
                            byteReadChannel5 = byteReadChannel4;
                        }
                        defaultClientSSESession$parseEvent$1.L$0 = byteReadChannel5;
                        defaultClientSSESession$parseEvent$1.L$1 = sb5;
                        defaultClientSSESession$parseEvent$1.L$2 = sb6;
                        defaultClientSSESession$parseEvent$1.L$3 = str5;
                        defaultClientSSESession$parseEvent$1.L$4 = objectRef4;
                        defaultClientSSESession$parseEvent$1.L$5 = str;
                        defaultClientSSESession$parseEvent$1.I$0 = i3;
                        defaultClientSSESession$parseEvent$1.I$1 = i2;
                        defaultClientSSESession$parseEvent$1.label = 3;
                        z = true;
                        obj = ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel5, 0, defaultClientSSESession$parseEvent$1, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str4 = str5;
                        sb3 = sb6;
                        sb4 = sb5;
                        byteReadChannel7 = byteReadChannel5;
                        objectRef2 = objectRef4;
                        str2 = (String) obj;
                        if (str2 != null) {
                        }
                    }
                    objectRef4 = objectRef3;
                    str5 = str4;
                    byteReadChannel5 = byteReadChannel4;
                    defaultClientSSESession$parseEvent$1.L$0 = byteReadChannel5;
                    defaultClientSSESession$parseEvent$1.L$1 = sb5;
                    defaultClientSSESession$parseEvent$1.L$2 = sb6;
                    defaultClientSSESession$parseEvent$1.L$3 = str5;
                    defaultClientSSESession$parseEvent$1.L$4 = objectRef4;
                    defaultClientSSESession$parseEvent$1.L$5 = str;
                    defaultClientSSESession$parseEvent$1.I$0 = i3;
                    defaultClientSSESession$parseEvent$1.I$1 = i2;
                    defaultClientSSESession$parseEvent$1.label = 3;
                    z = true;
                    obj = ByteReadChannelOperationsKt.readUTF8Line$default(byteReadChannel5, 0, defaultClientSSESession$parseEvent$1, 1, null);
                    if (obj == coroutine_suspended) {
                    }
                }
                str2 = (String) obj;
                if (str2 != null) {
                    return null;
                }
                str3 = null;
                if (StringsKt.isBlank(str2)) {
                }
            }
        }
        defaultClientSSESession$parseEvent$1 = new DefaultClientSSESession$parseEvent$1(this, continuation);
        Object obj2 = defaultClientSSESession$parseEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultClientSSESession$parseEvent$1.label;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 != null) {
        }
    }

    private final void appendComment(StringBuilder sb, String str) {
        sb.append(StringsKt.removePrefix(StringsKt.removePrefix(str, (CharSequence) ServerSentEventKt.COLON), (CharSequence) ServerSentEventKt.SPACE)).append(ServerSentEventKt.END_OF_LINE);
    }

    private final String toText(StringBuilder sb) {
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return StringsKt.removeSuffix(sb2, (CharSequence) ServerSentEventKt.END_OF_LINE);
    }

    private final boolean isEmpty(ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getId() == null && serverSentEvent.getEvent() == null && serverSentEvent.getRetry() == null && serverSentEvent.getComments() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCommentsEvent(ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getEvent() == null && serverSentEvent.getId() == null && serverSentEvent.getRetry() == null && serverSentEvent.getComments() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRetryEvent(ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getEvent() == null && serverSentEvent.getId() == null && serverSentEvent.getComments() == null && serverSentEvent.getRetry() != null;
    }
}
