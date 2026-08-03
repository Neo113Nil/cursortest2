package coil;

/* compiled from: EventListener.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 ,2\u00020\u0001:\u0002+,J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0017J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\fH\u0017J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u001a\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0017J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J*\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017J \u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J*\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u001eH\u0017J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020 H\u0017J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020 H\u0017J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$H\u0017J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$H\u0017J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020(H\u0017J\u0018\u0010)\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020*H\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0003"}, d2 = {"Lcoil/EventListener;", "Lcoil/request/ImageRequest$Listener;", "onStart", "", "request", "Lcoil/request/ImageRequest;", "resolveSizeStart", "resolveSizeEnd", "size", "Lcoil/size/Size;", "mapStart", "input", "", "mapEnd", "output", "keyStart", "keyEnd", "", "fetchStart", "fetcher", "Lcoil/fetch/Fetcher;", "options", "Lcoil/request/Options;", "fetchEnd", "result", "Lcoil/fetch/FetchResult;", "decodeStart", "decoder", "Lcoil/decode/Decoder;", "decodeEnd", "Lcoil/decode/DecodeResult;", "transformStart", "Landroid/graphics/Bitmap;", "transformEnd", "transitionStart", "transition", "Lcoil/transition/Transition;", "transitionEnd", "onCancel", "onError", "Lcoil/request/ErrorResult;", "onSuccess", "Lcoil/request/SuccessResult;", "Factory", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface EventListener extends coil.request.ImageRequest.Listener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final coil.EventListener.Companion INSTANCE = coil.EventListener.Companion.$$INSTANCE;
    public static final coil.EventListener NONE = new coil.EventListener() { // from class: coil.EventListener$Companion$NONE$1
        @Override // coil.EventListener
        public /* synthetic */ void decodeEnd(coil.request.ImageRequest imageRequest, coil.decode.Decoder decoder, coil.request.Options options, coil.decode.DecodeResult decodeResult) {
            coil.EventListener.CC.$default$decodeEnd(this, imageRequest, decoder, options, decodeResult);
        }

        @Override // coil.EventListener
        public /* synthetic */ void decodeStart(coil.request.ImageRequest imageRequest, coil.decode.Decoder decoder, coil.request.Options options) {
            coil.EventListener.CC.$default$decodeStart(this, imageRequest, decoder, options);
        }

        @Override // coil.EventListener
        public /* synthetic */ void fetchEnd(coil.request.ImageRequest imageRequest, coil.fetch.Fetcher fetcher, coil.request.Options options, coil.fetch.FetchResult fetchResult) {
            coil.EventListener.CC.$default$fetchEnd(this, imageRequest, fetcher, options, fetchResult);
        }

        @Override // coil.EventListener
        public /* synthetic */ void fetchStart(coil.request.ImageRequest imageRequest, coil.fetch.Fetcher fetcher, coil.request.Options options) {
            coil.EventListener.CC.$default$fetchStart(this, imageRequest, fetcher, options);
        }

        @Override // coil.EventListener
        public /* synthetic */ void keyEnd(coil.request.ImageRequest imageRequest, java.lang.String str) {
            coil.EventListener.CC.$default$keyEnd(this, imageRequest, str);
        }

        @Override // coil.EventListener
        public /* synthetic */ void keyStart(coil.request.ImageRequest imageRequest, java.lang.Object obj) {
            coil.EventListener.CC.$default$keyStart(this, imageRequest, obj);
        }

        @Override // coil.EventListener
        public /* synthetic */ void mapEnd(coil.request.ImageRequest imageRequest, java.lang.Object obj) {
            coil.EventListener.CC.$default$mapEnd(this, imageRequest, obj);
        }

        @Override // coil.EventListener
        public /* synthetic */ void mapStart(coil.request.ImageRequest imageRequest, java.lang.Object obj) {
            coil.EventListener.CC.$default$mapStart(this, imageRequest, obj);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public /* synthetic */ void onCancel(coil.request.ImageRequest imageRequest) {
            coil.EventListener.CC.$default$onCancel(this, imageRequest);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public /* synthetic */ void onError(coil.request.ImageRequest imageRequest, coil.request.ErrorResult errorResult) {
            coil.EventListener.CC.$default$onError(this, imageRequest, errorResult);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public /* synthetic */ void onStart(coil.request.ImageRequest imageRequest) {
            coil.EventListener.CC.$default$onStart(this, imageRequest);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public /* synthetic */ void onSuccess(coil.request.ImageRequest imageRequest, coil.request.SuccessResult successResult) {
            coil.EventListener.CC.$default$onSuccess(this, imageRequest, successResult);
        }

        @Override // coil.EventListener
        public /* synthetic */ void resolveSizeEnd(coil.request.ImageRequest imageRequest, coil.size.Size size) {
            coil.EventListener.CC.$default$resolveSizeEnd(this, imageRequest, size);
        }

        @Override // coil.EventListener
        public /* synthetic */ void resolveSizeStart(coil.request.ImageRequest imageRequest) {
            coil.EventListener.CC.$default$resolveSizeStart(this, imageRequest);
        }

        @Override // coil.EventListener
        public /* synthetic */ void transformEnd(coil.request.ImageRequest imageRequest, android.graphics.Bitmap bitmap) {
            coil.EventListener.CC.$default$transformEnd(this, imageRequest, bitmap);
        }

        @Override // coil.EventListener
        public /* synthetic */ void transformStart(coil.request.ImageRequest imageRequest, android.graphics.Bitmap bitmap) {
            coil.EventListener.CC.$default$transformStart(this, imageRequest, bitmap);
        }

        @Override // coil.EventListener
        public /* synthetic */ void transitionEnd(coil.request.ImageRequest imageRequest, coil.transition.Transition transition) {
            coil.EventListener.CC.$default$transitionEnd(this, imageRequest, transition);
        }

        @Override // coil.EventListener
        public /* synthetic */ void transitionStart(coil.request.ImageRequest imageRequest, coil.transition.Transition transition) {
            coil.EventListener.CC.$default$transitionStart(this, imageRequest, transition);
        }
    };

    void decodeEnd(coil.request.ImageRequest request, coil.decode.Decoder decoder, coil.request.Options options, coil.decode.DecodeResult result);

    void decodeStart(coil.request.ImageRequest request, coil.decode.Decoder decoder, coil.request.Options options);

    void fetchEnd(coil.request.ImageRequest request, coil.fetch.Fetcher fetcher, coil.request.Options options, coil.fetch.FetchResult result);

    void fetchStart(coil.request.ImageRequest request, coil.fetch.Fetcher fetcher, coil.request.Options options);

    void keyEnd(coil.request.ImageRequest request, java.lang.String output);

    void keyStart(coil.request.ImageRequest request, java.lang.Object input);

    void mapEnd(coil.request.ImageRequest request, java.lang.Object output);

    void mapStart(coil.request.ImageRequest request, java.lang.Object input);

    @Override // coil.request.ImageRequest.Listener
    void onCancel(coil.request.ImageRequest request);

    @Override // coil.request.ImageRequest.Listener
    void onError(coil.request.ImageRequest request, coil.request.ErrorResult result);

    @Override // coil.request.ImageRequest.Listener
    void onStart(coil.request.ImageRequest request);

    @Override // coil.request.ImageRequest.Listener
    void onSuccess(coil.request.ImageRequest request, coil.request.SuccessResult result);

    void resolveSizeEnd(coil.request.ImageRequest request, coil.size.Size size);

    void resolveSizeStart(coil.request.ImageRequest request);

    void transformEnd(coil.request.ImageRequest request, android.graphics.Bitmap output);

    void transformStart(coil.request.ImageRequest request, android.graphics.Bitmap input);

    void transitionEnd(coil.request.ImageRequest request, coil.transition.Transition transition);

    void transitionStart(coil.request.ImageRequest request, coil.transition.Transition transition);

    /* compiled from: EventListener.kt */
    /* renamed from: coil.EventListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$decodeEnd(coil.EventListener _this, coil.request.ImageRequest imageRequest, coil.decode.Decoder decoder, coil.request.Options options, coil.decode.DecodeResult decodeResult) {
        }

        public static void $default$decodeStart(coil.EventListener _this, coil.request.ImageRequest imageRequest, coil.decode.Decoder decoder, coil.request.Options options) {
        }

        public static void $default$fetchEnd(coil.EventListener _this, coil.request.ImageRequest imageRequest, coil.fetch.Fetcher fetcher, coil.request.Options options, coil.fetch.FetchResult fetchResult) {
        }

        public static void $default$fetchStart(coil.EventListener _this, coil.request.ImageRequest imageRequest, coil.fetch.Fetcher fetcher, coil.request.Options options) {
        }

        public static void $default$keyEnd(coil.EventListener _this, coil.request.ImageRequest imageRequest, java.lang.String str) {
        }

        public static void $default$keyStart(coil.EventListener _this, coil.request.ImageRequest imageRequest, java.lang.Object obj) {
        }

        public static void $default$mapEnd(coil.EventListener _this, coil.request.ImageRequest imageRequest, java.lang.Object obj) {
        }

        public static void $default$mapStart(coil.EventListener _this, coil.request.ImageRequest imageRequest, java.lang.Object obj) {
        }

        public static void $default$onCancel(coil.EventListener _this, coil.request.ImageRequest imageRequest) {
        }

        public static void $default$onError(coil.EventListener _this, coil.request.ImageRequest imageRequest, coil.request.ErrorResult errorResult) {
        }

        public static void $default$onStart(coil.EventListener _this, coil.request.ImageRequest imageRequest) {
        }

        public static void $default$onSuccess(coil.EventListener _this, coil.request.ImageRequest imageRequest, coil.request.SuccessResult successResult) {
        }

        public static void $default$resolveSizeEnd(coil.EventListener _this, coil.request.ImageRequest imageRequest, coil.size.Size size) {
        }

        public static void $default$resolveSizeStart(coil.EventListener _this, coil.request.ImageRequest imageRequest) {
        }

        public static void $default$transformEnd(coil.EventListener _this, coil.request.ImageRequest imageRequest, android.graphics.Bitmap bitmap) {
        }

        public static void $default$transformStart(coil.EventListener _this, coil.request.ImageRequest imageRequest, android.graphics.Bitmap bitmap) {
        }

        public static void $default$transitionEnd(coil.EventListener _this, coil.request.ImageRequest imageRequest, coil.transition.Transition transition) {
        }

        public static void $default$transitionStart(coil.EventListener _this, coil.request.ImageRequest imageRequest, coil.transition.Transition transition) {
        }

        static {
            coil.EventListener.Companion companion = coil.EventListener.INSTANCE;
        }
    }

    /* compiled from: EventListener.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onStart(coil.EventListener eventListener, coil.request.ImageRequest imageRequest) {
            coil.EventListener.CC.$default$onStart(eventListener, imageRequest);
        }

        @java.lang.Deprecated
        public static void resolveSizeStart(coil.EventListener eventListener, coil.request.ImageRequest imageRequest) {
            coil.EventListener.CC.$default$resolveSizeStart(eventListener, imageRequest);
        }

        @java.lang.Deprecated
        public static void resolveSizeEnd(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, coil.size.Size size) {
            coil.EventListener.CC.$default$resolveSizeEnd(eventListener, imageRequest, size);
        }

        @java.lang.Deprecated
        public static void mapStart(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, java.lang.Object obj) {
            coil.EventListener.CC.$default$mapStart(eventListener, imageRequest, obj);
        }

        @java.lang.Deprecated
        public static void mapEnd(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, java.lang.Object obj) {
            coil.EventListener.CC.$default$mapEnd(eventListener, imageRequest, obj);
        }

        @java.lang.Deprecated
        public static void keyStart(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, java.lang.Object obj) {
            coil.EventListener.CC.$default$keyStart(eventListener, imageRequest, obj);
        }

        @java.lang.Deprecated
        public static void keyEnd(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, java.lang.String str) {
            coil.EventListener.CC.$default$keyEnd(eventListener, imageRequest, str);
        }

        @java.lang.Deprecated
        public static void fetchStart(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, coil.fetch.Fetcher fetcher, coil.request.Options options) {
            coil.EventListener.CC.$default$fetchStart(eventListener, imageRequest, fetcher, options);
        }

        @java.lang.Deprecated
        public static void fetchEnd(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, coil.fetch.Fetcher fetcher, coil.request.Options options, coil.fetch.FetchResult fetchResult) {
            coil.EventListener.CC.$default$fetchEnd(eventListener, imageRequest, fetcher, options, fetchResult);
        }

        @java.lang.Deprecated
        public static void decodeStart(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, coil.decode.Decoder decoder, coil.request.Options options) {
            coil.EventListener.CC.$default$decodeStart(eventListener, imageRequest, decoder, options);
        }

        @java.lang.Deprecated
        public static void decodeEnd(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, coil.decode.Decoder decoder, coil.request.Options options, coil.decode.DecodeResult decodeResult) {
            coil.EventListener.CC.$default$decodeEnd(eventListener, imageRequest, decoder, options, decodeResult);
        }

        @java.lang.Deprecated
        public static void transformStart(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, android.graphics.Bitmap bitmap) {
            coil.EventListener.CC.$default$transformStart(eventListener, imageRequest, bitmap);
        }

        @java.lang.Deprecated
        public static void transformEnd(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, android.graphics.Bitmap bitmap) {
            coil.EventListener.CC.$default$transformEnd(eventListener, imageRequest, bitmap);
        }

        @java.lang.Deprecated
        public static void transitionStart(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, coil.transition.Transition transition) {
            coil.EventListener.CC.$default$transitionStart(eventListener, imageRequest, transition);
        }

        @java.lang.Deprecated
        public static void transitionEnd(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, coil.transition.Transition transition) {
            coil.EventListener.CC.$default$transitionEnd(eventListener, imageRequest, transition);
        }

        @java.lang.Deprecated
        public static void onCancel(coil.EventListener eventListener, coil.request.ImageRequest imageRequest) {
            coil.EventListener.CC.$default$onCancel(eventListener, imageRequest);
        }

        @java.lang.Deprecated
        public static void onError(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, coil.request.ErrorResult errorResult) {
            coil.EventListener.CC.$default$onError(eventListener, imageRequest, errorResult);
        }

        @java.lang.Deprecated
        public static void onSuccess(coil.EventListener eventListener, coil.request.ImageRequest imageRequest, coil.request.SuccessResult successResult) {
            coil.EventListener.CC.$default$onSuccess(eventListener, imageRequest, successResult);
        }
    }

    /* compiled from: EventListener.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcoil/EventListener$Factory;", "", "create", "Lcoil/EventListener;", "request", "Lcoil/request/ImageRequest;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final coil.EventListener.Factory.Companion INSTANCE = coil.EventListener.Factory.Companion.$$INSTANCE;
        public static final coil.EventListener.Factory NONE = new coil.EventListener.Factory() { // from class: coil.EventListener$Factory$$ExternalSyntheticLambda0
            @Override // coil.EventListener.Factory
            public final coil.EventListener create(coil.request.ImageRequest imageRequest) {
                coil.EventListener eventListener;
                eventListener = coil.EventListener.NONE;
                return eventListener;
            }
        };

        coil.EventListener create(coil.request.ImageRequest request);

        /* compiled from: EventListener.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lcoil/EventListener$Factory$Companion;", "", "<init>", "()V", "NONE", "Lcoil/EventListener$Factory;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ coil.EventListener.Factory.Companion $$INSTANCE = new coil.EventListener.Factory.Companion();

            private Companion() {
            }
        }

        /* compiled from: EventListener.kt */
        /* renamed from: coil.EventListener$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                coil.EventListener.Factory.Companion companion = coil.EventListener.Factory.INSTANCE;
            }
        }
    }

    /* compiled from: EventListener.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lcoil/EventListener$Companion;", "", "<init>", "()V", "NONE", "Lcoil/EventListener;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ coil.EventListener.Companion $$INSTANCE = new coil.EventListener.Companion();

        private Companion() {
        }
    }
}
