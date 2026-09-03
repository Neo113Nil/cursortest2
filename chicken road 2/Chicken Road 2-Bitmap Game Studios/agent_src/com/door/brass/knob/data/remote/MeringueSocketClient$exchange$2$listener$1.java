package com.door.brass.knob.data.remote;

import com.door.brass.knob.data.remote.dto.DessertMenuResponse;
import com.door.brass.knob.data.remote.dto.DessertProbeRequest;
import com.google.gson.FormattingStyle;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.Strictness;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.NotCompleted;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/door/brass/knob/data/remote/MeringueSocketClient$exchange$2$listener$1", "Lokhttp3/WebSocketListener;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MeringueSocketClient$exchange$2$listener$1 extends WebSocketListener {
    public final /* synthetic */ DessertProbeRequest hRNgd2zGCE5kj;
    public final /* synthetic */ AtomicBoolean oyjLVtGms9eZwJ0;
    public final /* synthetic */ CancellableContinuationImpl ra306ClFT3HT;
    public final /* synthetic */ MeringueSocketClient yzPsTade5rL7D3;

    public MeringueSocketClient$exchange$2$listener$1(MeringueSocketClient meringueSocketClient, DessertProbeRequest dessertProbeRequest, CancellableContinuationImpl cancellableContinuationImpl, AtomicBoolean atomicBoolean) {
        this.yzPsTade5rL7D3 = meringueSocketClient;
        this.hRNgd2zGCE5kj = dessertProbeRequest;
        this.ra306ClFT3HT = cancellableContinuationImpl;
        this.oyjLVtGms9eZwJ0 = atomicBoolean;
    }

    public final void hRNgd2zGCE5kj(WebSocket webSocket, Response response) {
        String sb;
        MeringueSocketClient meringueSocketClient = this.yzPsTade5rL7D3;
        Gson gson = meringueSocketClient.ra306ClFT3HT;
        gson.getClass();
        boolean z = gson.i7xAcZoXXiIt;
        FormattingStyle formattingStyle = gson.Uo5pffGf8LUU;
        Strictness strictness = Strictness.b41X89IqSbKt;
        DessertProbeRequest dessertProbeRequest = this.hRNgd2zGCE5kj;
        if (dessertProbeRequest == null) {
            StringBuilder sb2 = new StringBuilder();
            try {
                JsonWriter jsonWriter = new JsonWriter(Streams.yzPsTade5rL7D3(sb2));
                jsonWriter.tp5sG1Fy0ZCmW(formattingStyle);
                jsonWriter.kSPEzfraxudm4i = z;
                jsonWriter.vywRyEooKGLFsX(strictness);
                jsonWriter.yRx9jbDCTnXb3 = false;
                gson.oyjLVtGms9eZwJ0(jsonWriter);
                sb = sb2.toString();
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            try {
                JsonWriter jsonWriter2 = new JsonWriter(Streams.yzPsTade5rL7D3(sb3));
                jsonWriter2.tp5sG1Fy0ZCmW(formattingStyle);
                jsonWriter2.kSPEzfraxudm4i = z;
                jsonWriter2.vywRyEooKGLFsX(strictness);
                jsonWriter2.yRx9jbDCTnXb3 = false;
                gson.b41X89IqSbKt(dessertProbeRequest, DessertProbeRequest.class, jsonWriter2);
                sb = sb3.toString();
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
        if (webSocket.yzPsTade5rL7D3(sb)) {
            return;
        }
        MeringueSocketClient.yzPsTade5rL7D3(meringueSocketClient, this.ra306ClFT3HT, this.oyjLVtGms9eZwJ0, new IOException("Request frame was not queued"));
    }

    public final void yzPsTade5rL7D3(RealWebSocket realWebSocket, String str) {
        AtomicBoolean atomicBoolean = this.oyjLVtGms9eZwJ0;
        CancellableContinuationImpl cancellableContinuationImpl = this.ra306ClFT3HT;
        MeringueSocketClient meringueSocketClient = this.yzPsTade5rL7D3;
        try {
            DessertMenuResponse dessertMenuResponse = (DessertMenuResponse) meringueSocketClient.ra306ClFT3HT.yzPsTade5rL7D3(str);
            if (dessertMenuResponse == null) {
                MeringueSocketClient.yzPsTade5rL7D3(meringueSocketClient, cancellableContinuationImpl, atomicBoolean, new IOException("Empty menu frame"));
                return;
            }
            realWebSocket.FsuUJlzzWhYnMlD(null, 1000);
            if (atomicBoolean.compareAndSet(false, true) && (cancellableContinuationImpl.AGl7HBCQ8xrHABq() instanceof NotCompleted)) {
                cancellableContinuationImpl.FsuUJlzzWhYnMlD(dessertMenuResponse);
            }
        } catch (Exception e) {
            MeringueSocketClient.yzPsTade5rL7D3(meringueSocketClient, cancellableContinuationImpl, atomicBoolean, new IOException("Malformed menu frame", e));
        }
    }
}
