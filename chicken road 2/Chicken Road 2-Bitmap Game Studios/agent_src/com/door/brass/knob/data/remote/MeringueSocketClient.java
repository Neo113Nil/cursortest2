package com.door.brass.knob.data.remote;

import android.content.Context;
import com.door.brass.knob.data.remote.dto.DessertMenuResponse;
import com.door.brass.knob.data.remote.dto.DessertProbeRequest;
import com.google.gson.Gson;
import defpackage.yzPsTade5rL7D3;
import java.net.SocketTimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/door/brass/knob/data/remote/MeringueSocketClient;", "", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MeringueSocketClient {
    public final OkHttpClient hRNgd2zGCE5kj;
    public String oyjLVtGms9eZwJ0;
    public final Gson ra306ClFT3HT;
    public final Context yzPsTade5rL7D3;

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/door/brass/knob/data/remote/MeringueSocketClient$Companion;", "", "", "ENDPOINT_URL", "Ljava/lang/String;", "", "RESPONSE_TIMEOUT_MS", "J", "", "NORMAL_CLOSURE", "I", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    public MeringueSocketClient(Context context, OkHttpClient okHttpClient, Gson gson) {
        okHttpClient.getClass();
        gson.getClass();
        this.yzPsTade5rL7D3 = context;
        this.hRNgd2zGCE5kj = okHttpClient;
        this.ra306ClFT3HT = gson;
    }

    public static final void yzPsTade5rL7D3(MeringueSocketClient meringueSocketClient, CancellableContinuationImpl cancellableContinuationImpl, AtomicBoolean atomicBoolean, Exception exc) {
        meringueSocketClient.getClass();
        if (atomicBoolean.compareAndSet(false, true) && (cancellableContinuationImpl.AGl7HBCQ8xrHABq() instanceof NotCompleted)) {
            cancellableContinuationImpl.FsuUJlzzWhYnMlD(new Result.Failure(exc));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hRNgd2zGCE5kj(DessertProbeRequest dessertProbeRequest, ContinuationImpl continuationImpl) {
        MeringueSocketClient$requestMenu$1 meringueSocketClient$requestMenu$1;
        int i;
        if (continuationImpl instanceof MeringueSocketClient$requestMenu$1) {
            meringueSocketClient$requestMenu$1 = (MeringueSocketClient$requestMenu$1) continuationImpl;
            int i2 = meringueSocketClient$requestMenu$1.UEutaskTsxaI;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                meringueSocketClient$requestMenu$1.UEutaskTsxaI = i2 - Integer.MIN_VALUE;
                Object obj = meringueSocketClient$requestMenu$1.Uo5pffGf8LUU;
                Object obj2 = CoroutineSingletons.oyjLVtGms9eZwJ0;
                i = meringueSocketClient$requestMenu$1.UEutaskTsxaI;
                if (i != 0) {
                    ResultKt.hRNgd2zGCE5kj(obj);
                    meringueSocketClient$requestMenu$1.i7xAcZoXXiIt = dessertProbeRequest;
                    meringueSocketClient$requestMenu$1.UEutaskTsxaI = 1;
                    obj = ra306ClFT3HT(meringueSocketClient$requestMenu$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.hRNgd2zGCE5kj(obj);
                        DessertMenuResponse dessertMenuResponse = (DessertMenuResponse) obj;
                        if (dessertMenuResponse != null) {
                            return dessertMenuResponse;
                        }
                        throw new SocketTimeoutException("No menu frame received within 30000 ms");
                    }
                    dessertProbeRequest = meringueSocketClient$requestMenu$1.i7xAcZoXXiIt;
                    ResultKt.hRNgd2zGCE5kj(obj);
                }
                MeringueSocketClient$requestMenu$2 meringueSocketClient$requestMenu$2 = new MeringueSocketClient$requestMenu$2(this, dessertProbeRequest, (String) obj, null);
                meringueSocketClient$requestMenu$1.i7xAcZoXXiIt = null;
                meringueSocketClient$requestMenu$1.UEutaskTsxaI = 2;
                obj = TimeoutKt.ra306ClFT3HT(30000L, meringueSocketClient$requestMenu$2, meringueSocketClient$requestMenu$1);
            }
        }
        meringueSocketClient$requestMenu$1 = new MeringueSocketClient$requestMenu$1(this, continuationImpl);
        Object obj3 = meringueSocketClient$requestMenu$1.Uo5pffGf8LUU;
        Object obj22 = CoroutineSingletons.oyjLVtGms9eZwJ0;
        i = meringueSocketClient$requestMenu$1.UEutaskTsxaI;
        if (i != 0) {
        }
        MeringueSocketClient$requestMenu$2 meringueSocketClient$requestMenu$22 = new MeringueSocketClient$requestMenu$2(this, dessertProbeRequest, (String) obj3, null);
        meringueSocketClient$requestMenu$1.i7xAcZoXXiIt = null;
        meringueSocketClient$requestMenu$1.UEutaskTsxaI = 2;
        obj3 = TimeoutKt.ra306ClFT3HT(30000L, meringueSocketClient$requestMenu$22, meringueSocketClient$requestMenu$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ra306ClFT3HT(ContinuationImpl continuationImpl) {
        MeringueSocketClient$resolveUserAgent$1 meringueSocketClient$resolveUserAgent$1;
        int i;
        if (continuationImpl instanceof MeringueSocketClient$resolveUserAgent$1) {
            meringueSocketClient$resolveUserAgent$1 = (MeringueSocketClient$resolveUserAgent$1) continuationImpl;
            int i2 = meringueSocketClient$resolveUserAgent$1.FsuUJlzzWhYnMlD;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                meringueSocketClient$resolveUserAgent$1.FsuUJlzzWhYnMlD = i2 - Integer.MIN_VALUE;
                Object obj = meringueSocketClient$resolveUserAgent$1.i7xAcZoXXiIt;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
                i = meringueSocketClient$resolveUserAgent$1.FsuUJlzzWhYnMlD;
                if (i != 0) {
                    ResultKt.hRNgd2zGCE5kj(obj);
                    String str = this.oyjLVtGms9eZwJ0;
                    if (str != null) {
                        return str;
                    }
                    DefaultScheduler defaultScheduler = Dispatchers.yzPsTade5rL7D3;
                    MainCoroutineDispatcher LQLHPA8xotOb = MainDispatcherLoader.yzPsTade5rL7D3.LQLHPA8xotOb();
                    MeringueSocketClient$resolveUserAgent$resolved$1 meringueSocketClient$resolveUserAgent$resolved$1 = new MeringueSocketClient$resolveUserAgent$resolved$1(this, null);
                    meringueSocketClient$resolveUserAgent$1.FsuUJlzzWhYnMlD = 1;
                    obj = BuildersKt.b41X89IqSbKt(LQLHPA8xotOb, meringueSocketClient$resolveUserAgent$resolved$1, meringueSocketClient$resolveUserAgent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.hRNgd2zGCE5kj(obj);
                }
                String str2 = (String) obj;
                this.oyjLVtGms9eZwJ0 = str2;
                str2.getClass();
                return str2;
            }
        }
        meringueSocketClient$resolveUserAgent$1 = new MeringueSocketClient$resolveUserAgent$1(this, continuationImpl);
        Object obj2 = meringueSocketClient$resolveUserAgent$1.i7xAcZoXXiIt;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.oyjLVtGms9eZwJ0;
        i = meringueSocketClient$resolveUserAgent$1.FsuUJlzzWhYnMlD;
        if (i != 0) {
        }
        String str22 = (String) obj2;
        this.oyjLVtGms9eZwJ0 = str22;
        str22.getClass();
        return str22;
    }
}
