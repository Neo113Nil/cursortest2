package com.door.brass.knob.data.remote;

import com.door.brass.knob.data.remote.dto.DessertMenuResponse;
import com.door.brass.knob.data.remote.dto.DessertProbeRequest;
import defpackage.e7;
import defpackage.h1;
import defpackage.yzPsTade5rL7D3;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealCall.AsyncCall;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.RealWebSocket$connect$1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/door/brass/knob/data/remote/dto/DessertMenuResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.data.remote.MeringueSocketClient$requestMenu$2", f = "MeringueSocketClient.kt", l = {59}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MeringueSocketClient$requestMenu$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DessertMenuResponse>, Object> {
    public final /* synthetic */ MeringueSocketClient FsuUJlzzWhYnMlD;
    public final /* synthetic */ String MRfxZSx8l5UG62U;
    public final /* synthetic */ DessertProbeRequest UEutaskTsxaI;
    public int Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeringueSocketClient$requestMenu$2(MeringueSocketClient meringueSocketClient, DessertProbeRequest dessertProbeRequest, String str, Continuation continuation) {
        super(2, continuation);
        this.FsuUJlzzWhYnMlD = meringueSocketClient;
        this.UEutaskTsxaI = dessertProbeRequest;
        this.MRfxZSx8l5UG62U = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        int i = this.Uo5pffGf8LUU;
        if (i != 0) {
            if (i == 1) {
                ResultKt.hRNgd2zGCE5kj(obj);
                return obj;
            }
            yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.hRNgd2zGCE5kj(obj);
        MeringueSocketClient meringueSocketClient = this.FsuUJlzzWhYnMlD;
        DessertProbeRequest dessertProbeRequest = this.UEutaskTsxaI;
        String str = this.MRfxZSx8l5UG62U;
        this.Uo5pffGf8LUU = 1;
        meringueSocketClient.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.hRNgd2zGCE5kj(this));
        cancellableContinuationImpl.pu0JZhzR2Or6();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Request.Builder builder = new Request.Builder();
        String str2 = "https://lemonmeringue.space/api/citrusDessert/meringueMenu";
        if (StringsKt.o4ticBN7g1K8jE("https://lemonmeringue.space/api/citrusDessert/meringueMenu", "ws:", true)) {
            str2 = "http:".concat("ps://lemonmeringue.space/api/citrusDessert/meringueMenu");
        } else if (StringsKt.o4ticBN7g1K8jE("https://lemonmeringue.space/api/citrusDessert/meringueMenu", "wss:", true)) {
            str2 = "https:".concat("s://lemonmeringue.space/api/citrusDessert/meringueMenu");
        }
        HttpUrl.Builder builder2 = new HttpUrl.Builder();
        builder2.hRNgd2zGCE5kj(null, str2);
        builder.yzPsTade5rL7D3 = builder2.yzPsTade5rL7D3();
        builder.yzPsTade5rL7D3("User-Agent", str);
        Request request = new Request(builder);
        MeringueSocketClient$exchange$2$listener$1 meringueSocketClient$exchange$2$listener$1 = new MeringueSocketClient$exchange$2$listener$1(meringueSocketClient, dessertProbeRequest, cancellableContinuationImpl, atomicBoolean);
        OkHttpClient okHttpClient = meringueSocketClient.hRNgd2zGCE5kj;
        okHttpClient.getClass();
        TaskRunner taskRunner = okHttpClient.o4ticBN7g1K8jE;
        Random random = new Random();
        int i2 = okHttpClient.ZvpnNpCMEWSR3;
        long j = okHttpClient.BD2CRjLJ8EtOqGQ;
        int i3 = okHttpClient.uY26rxeEAFnDq;
        final RealWebSocket realWebSocket = new RealWebSocket(taskRunner, request, meringueSocketClient$exchange$2$listener$1, random, i2, j, i3);
        if (request.ra306ClFT3HT.hRNgd2zGCE5kj("Sec-WebSocket-Extensions") != null) {
            RealWebSocket.UEutaskTsxaI(realWebSocket, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
        } else {
            OkHttpClient.Builder builder3 = new OkHttpClient.Builder();
            builder3.yzPsTade5rL7D3 = okHttpClient.yzPsTade5rL7D3;
            builder3.hRNgd2zGCE5kj = okHttpClient.Yey4RyhSyBRHub;
            CollectionsKt.FsuUJlzzWhYnMlD(okHttpClient.hRNgd2zGCE5kj, builder3.ra306ClFT3HT);
            CollectionsKt.FsuUJlzzWhYnMlD(okHttpClient.ra306ClFT3HT, builder3.oyjLVtGms9eZwJ0);
            builder3.b41X89IqSbKt = okHttpClient.oyjLVtGms9eZwJ0;
            builder3.gmXBnHsR2YSm = okHttpClient.b41X89IqSbKt;
            builder3.i7xAcZoXXiIt = okHttpClient.gmXBnHsR2YSm;
            builder3.Uo5pffGf8LUU = okHttpClient.i7xAcZoXXiIt;
            builder3.FsuUJlzzWhYnMlD = okHttpClient.Uo5pffGf8LUU;
            builder3.UEutaskTsxaI = okHttpClient.FsuUJlzzWhYnMlD;
            builder3.MRfxZSx8l5UG62U = okHttpClient.UEutaskTsxaI;
            builder3.kSPEzfraxudm4i = okHttpClient.MRfxZSx8l5UG62U;
            builder3.uypNJrpDByoB = okHttpClient.kSPEzfraxudm4i;
            builder3.yRx9jbDCTnXb3 = okHttpClient.uypNJrpDByoB;
            builder3.NIabVTHf6LMJyXq = okHttpClient.yRx9jbDCTnXb3;
            builder3.GiTAvmtrM6Bh8SJ = okHttpClient.NIabVTHf6LMJyXq;
            builder3.o2t7oodqU1bUMaS = okHttpClient.GiTAvmtrM6Bh8SJ;
            builder3.MCcLy95b8Awzmw = okHttpClient.o2t7oodqU1bUMaS;
            builder3.FTJ2XS7ULgY8 = okHttpClient.MCcLy95b8Awzmw;
            builder3.exVmIuryuB8HeQ = okHttpClient.FTJ2XS7ULgY8;
            builder3.AGl7HBCQ8xrHABq = okHttpClient.exVmIuryuB8HeQ;
            builder3.pu0JZhzR2Or6 = okHttpClient.AGl7HBCQ8xrHABq;
            builder3.OcGJUxcOVecQiKb = okHttpClient.pu0JZhzR2Or6;
            builder3.XrorSzThrtvJ4A = okHttpClient.OcGJUxcOVecQiKb;
            builder3.ZvpnNpCMEWSR3 = okHttpClient.XrorSzThrtvJ4A;
            builder3.uY26rxeEAFnDq = i2;
            builder3.BD2CRjLJ8EtOqGQ = i3;
            builder3.jJwKDtysO3vm5E = okHttpClient.BD2CRjLJ8EtOqGQ;
            builder3.o4ticBN7g1K8jE = okHttpClient.jJwKDtysO3vm5E;
            builder3.Yey4RyhSyBRHub = okHttpClient.o4ticBN7g1K8jE;
            TimeZone timeZone = _UtilJvmKt.yzPsTade5rL7D3;
            builder3.b41X89IqSbKt = new e7(6);
            List list = RealWebSocket.BD2CRjLJ8EtOqGQ;
            list.getClass();
            ArrayList arrayList = new ArrayList(list);
            Protocol protocol = Protocol.UEutaskTsxaI;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.i7xAcZoXXiIt)) {
                h1.Yey4RyhSyBRHub(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
                return null;
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                h1.Yey4RyhSyBRHub(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
                return null;
            }
            if (arrayList.contains(Protocol.gmXBnHsR2YSm)) {
                h1.Yey4RyhSyBRHub(arrayList, "protocols must not contain http/1.0: ");
                return null;
            }
            if (arrayList.contains(null)) {
                yzPsTade5rL7D3.yRx9jbDCTnXb3("protocols must not contain null");
                return null;
            }
            arrayList.remove(Protocol.Uo5pffGf8LUU);
            if (!arrayList.equals(builder3.FTJ2XS7ULgY8)) {
                builder3.o4ticBN7g1K8jE = null;
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            unmodifiableList.getClass();
            builder3.FTJ2XS7ULgY8 = unmodifiableList;
            OkHttpClient okHttpClient2 = new OkHttpClient(builder3);
            Request.Builder yzPsTade5rL7D3 = request.yzPsTade5rL7D3();
            yzPsTade5rL7D3.yzPsTade5rL7D3("Upgrade", "websocket");
            yzPsTade5rL7D3.yzPsTade5rL7D3("Connection", "Upgrade");
            yzPsTade5rL7D3.yzPsTade5rL7D3("Sec-WebSocket-Key", realWebSocket.UEutaskTsxaI);
            yzPsTade5rL7D3.yzPsTade5rL7D3("Sec-WebSocket-Version", "13");
            yzPsTade5rL7D3.yzPsTade5rL7D3("Sec-WebSocket-Extensions", "permessage-deflate");
            Request request2 = new Request(yzPsTade5rL7D3);
            RealCall realCall = new RealCall(okHttpClient2, request2);
            realWebSocket.MRfxZSx8l5UG62U = realCall;
            RealWebSocket$connect$1 realWebSocket$connect$1 = new RealWebSocket$connect$1(realWebSocket, request2);
            if (!realCall.FsuUJlzzWhYnMlD.compareAndSet(false, true)) {
                yzPsTade5rL7D3.kSPEzfraxudm4i("Already Executed");
                return null;
            }
            Platform platform = Platform.yzPsTade5rL7D3;
            realCall.UEutaskTsxaI = Platform.yzPsTade5rL7D3.Uo5pffGf8LUU();
            realCall.eventListener.b41X89IqSbKt(realCall);
            Dispatcher dispatcher = okHttpClient2.yzPsTade5rL7D3;
            RealCall.AsyncCall asyncCall = realCall.new AsyncCall(realWebSocket$connect$1);
            dispatcher.getClass();
            Dispatcher.hRNgd2zGCE5kj(dispatcher, asyncCall, null, 6);
        }
        cancellableContinuationImpl.XrorSzThrtvJ4A(new Function1<Throwable, Unit>() { // from class: com.door.brass.knob.data.remote.MeringueSocketClient$exchange$2$1
            @Override // kotlin.jvm.functions.Function1
            public final Object uypNJrpDByoB(Object obj2) {
                RealWebSocket.this.i7xAcZoXXiIt();
                return Unit.yzPsTade5rL7D3;
            }
        });
        Object exVmIuryuB8HeQ = cancellableContinuationImpl.exVmIuryuB8HeQ();
        return exVmIuryuB8HeQ == coroutineSingletons ? coroutineSingletons : exVmIuryuB8HeQ;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new MeringueSocketClient$requestMenu$2(this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, this.MRfxZSx8l5UG62U, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((MeringueSocketClient$requestMenu$2) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
