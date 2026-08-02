package coil3.content;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u000f\u001a\u00060\tj\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcoil3/network/DeDupeConcurrentRequestStrategy;", "Lcoil3/network/ConcurrentRequestStrategy;", "<init>", "()V", "", "key", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcoil3/fetch/FetchResult;", "", "block", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcoil3/network/DeDupeConcurrentRequestStrategy$Request;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "Request"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeDupeConcurrentRequestStrategy implements coil3.content.ConcurrentRequestStrategy {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, coil3.network.DeDupeConcurrentRequestStrategy.Request> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(5:(2:3|(8:5|6|7|(1:(1:(7:11|12|13|14|ae|19|20)(2:29|30))(1:31))(4:43|68|51|(1:53))|32|33|(3:36|14|ae)|35))|32|33|(0)|35)|60|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
    
        if (r11.mo24072receiveCatchingJP2dKIU(r0) != r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0036, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ce, code lost:
    
        r2 = r9;
        r9 = r10;
        r10 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // coil3.content.ConcurrentRequestStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object apply(final java.lang.String str, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult> continuation) {
        coil3.content.DeDupeConcurrentRequestStrategy$apply$1 deDupeConcurrentRequestStrategy$apply$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        coil3.network.DeDupeConcurrentRequestStrategy.Request request;
        coil3.network.DeDupeConcurrentRequestStrategy.Request request2;
        kotlin.jvm.functions.Function1 function12;
        java.lang.Exception e;
        coil3.network.DeDupeConcurrentRequestStrategy.Request request3;
        final java.lang.String str2;
        try {
            if (continuation instanceof coil3.content.DeDupeConcurrentRequestStrategy$apply$1) {
                deDupeConcurrentRequestStrategy$apply$1 = (coil3.content.DeDupeConcurrentRequestStrategy$apply$1) continuation;
                if ((deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    obj = deDupeConcurrentRequestStrategy$apply$1.getHighResolutionOutputSizeshNQ4ISI;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                        booleanRef.element = true;
                        synchronized (this.getHighSpeedVideoFpsRangesFor) {
                            java.util.Map<java.lang.String, coil3.network.DeDupeConcurrentRequestStrategy.Request> map = this.Camera2StreamConfigurationMap;
                            coil3.network.DeDupeConcurrentRequestStrategy.Request request4 = map.get(str);
                            if (request4 == null) {
                                booleanRef.element = false;
                                request4 = new coil3.network.DeDupeConcurrentRequestStrategy.Request();
                                map.put(str, request4);
                            }
                            request2 = request4;
                        }
                        coil3.network.DeDupeConcurrentRequestStrategy.Request highResolutionOutputSizeshNQ4ISI = request2.getHighResolutionOutputSizeshNQ4ISI();
                        request = highResolutionOutputSizeshNQ4ISI;
                        function12 = function1;
                        if (booleanRef.element) {
                            kotlinx.coroutines.channels.Channel<kotlin.Unit> channel = highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                            deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoSizes = str;
                            deDupeConcurrentRequestStrategy$apply$1.Camera2StreamConfigurationMap = function1;
                            deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoFpsRangesFor = highResolutionOutputSizeshNQ4ISI;
                            deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoFpsRanges = 1;
                            request = highResolutionOutputSizeshNQ4ISI;
                            function12 = function1;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            request3 = (coil3.network.DeDupeConcurrentRequestStrategy.Request) deDupeConcurrentRequestStrategy$apply$1.Camera2StreamConfigurationMap;
                            str2 = (java.lang.String) deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoSizes;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                synchronized (request3.getHighResolutionOutputSizeshNQ4ISI) {
                                    request3.Camera2StreamConfigurationMap = true;
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                }
                                request3.getHighSpeedVideoSizes(new kotlin.jvm.functions.Function0() { // from class: coil3.network.DeDupeConcurrentRequestStrategy$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit highSpeedVideoFpsRangesFor;
                                        highSpeedVideoFpsRangesFor = coil3.content.DeDupeConcurrentRequestStrategy.getHighSpeedVideoFpsRangesFor(coil3.content.DeDupeConcurrentRequestStrategy.this, str2);
                                        return highSpeedVideoFpsRangesFor;
                                    }
                                });
                                return obj;
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                request3.getHighSpeedVideoSizes.mo9266trySendJP2dKIU(kotlin.Unit.INSTANCE);
                                throw e;
                            }
                        }
                        coil3.network.DeDupeConcurrentRequestStrategy.Request request5 = (coil3.network.DeDupeConcurrentRequestStrategy.Request) deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) deDupeConcurrentRequestStrategy$apply$1.Camera2StreamConfigurationMap;
                        java.lang.String str3 = (java.lang.String) deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        ((kotlinx.coroutines.channels.ChannelResult) obj).getGetHighSpeedVideoFpsRanges();
                        request = request5;
                        str = str3;
                        function12 = function13;
                    }
                    deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoSizes = str;
                    deDupeConcurrentRequestStrategy$apply$1.Camera2StreamConfigurationMap = request;
                    deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoFpsRangesFor = null;
                    deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoFpsRanges = 2;
                    obj = function12.invoke(deDupeConcurrentRequestStrategy$apply$1);
                    if (obj != coroutine_suspended) {
                        str2 = str;
                        request3 = request;
                        synchronized (request3.getHighResolutionOutputSizeshNQ4ISI) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoSizes = str;
            deDupeConcurrentRequestStrategy$apply$1.Camera2StreamConfigurationMap = request;
            deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoFpsRangesFor = null;
            deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoFpsRanges = 2;
            obj = function12.invoke(deDupeConcurrentRequestStrategy$apply$1);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Exception e3) {
            e = e3;
            request3 = request;
            request3.getHighSpeedVideoSizes.mo9266trySendJP2dKIU(kotlin.Unit.INSTANCE);
            throw e;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable th2 = th;
            request.getHighSpeedVideoSizes(new kotlin.jvm.functions.Function0() { // from class: coil3.network.DeDupeConcurrentRequestStrategy$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = coil3.content.DeDupeConcurrentRequestStrategy.getHighSpeedVideoFpsRangesFor(coil3.content.DeDupeConcurrentRequestStrategy.this, str);
                    return highSpeedVideoFpsRangesFor;
                }
            });
            throw th2;
        }
        deDupeConcurrentRequestStrategy$apply$1 = new coil3.content.DeDupeConcurrentRequestStrategy$apply$1(this, continuation);
        obj = deDupeConcurrentRequestStrategy$apply$1.getHighResolutionOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deDupeConcurrentRequestStrategy$apply$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(coil3.content.DeDupeConcurrentRequestStrategy deDupeConcurrentRequestStrategy, java.lang.String str) {
        synchronized (deDupeConcurrentRequestStrategy.getHighSpeedVideoFpsRangesFor) {
            deDupeConcurrentRequestStrategy.Camera2StreamConfigurationMap.remove(str);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0007¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u00060\u0001j\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\u0012\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015"}, d2 = {"Lcoil3/network/DeDupeConcurrentRequestStrategy$Request;", "", "<init>", "()V", "getHighResolutionOutputSizeshNQ4ISI", "()Lcoil3/network/DeDupeConcurrentRequestStrategy$Request;", "Lkotlin/Function0;", "", "p0", "getHighSpeedVideoSizes", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlinx/coroutines/channels/Channel;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "", "getHighSpeedVideoFpsRangesFor", "Z", "", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Request {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        boolean Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRanges;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final kotlinx.coroutines.channels.Channel<kotlin.Unit> getHighSpeedVideoSizes = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();

        public final coil3.network.DeDupeConcurrentRequestStrategy.Request getHighResolutionOutputSizeshNQ4ISI() {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoFpsRangesFor++;
            }
            return this;
        }

        public final void getHighSpeedVideoSizes(kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                int i = this.getHighSpeedVideoFpsRangesFor - 1;
                this.getHighSpeedVideoFpsRangesFor = i;
                if ((i <= 0 || this.Camera2StreamConfigurationMap) && !this.getHighSpeedVideoFpsRanges) {
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoSizes, null, 1, null);
                    p0.invoke();
                    this.getHighSpeedVideoFpsRanges = true;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }
}
