package org.chromium.net.apihelpers;

/* loaded from: classes18.dex */
public class UrlRequestCallbacks {

    /* renamed from: org.chromium.net.apihelpers.UrlRequestCallbacks$1, reason: invalid class name */
    class AnonymousClass1 extends org.chromium.net.apihelpers.ByteArrayCronetCallback {
        final /* synthetic */ org.chromium.net.apihelpers.RedirectHandler getHighSpeedVideoFpsRanges;

        AnonymousClass1(org.chromium.net.apihelpers.RedirectHandler redirectHandler) {
            this.getHighSpeedVideoFpsRanges = redirectHandler;
        }

        @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
        protected boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) throws java.lang.Exception {
            return this.getHighSpeedVideoFpsRanges.shouldFollowRedirect(urlResponseInfo, str);
        }
    }

    /* renamed from: org.chromium.net.apihelpers.UrlRequestCallbacks$2, reason: invalid class name */
    class AnonymousClass2 extends org.chromium.net.apihelpers.StringCronetCallback {
        final /* synthetic */ org.chromium.net.apihelpers.RedirectHandler getHighResolutionOutputSizeshNQ4ISI;

        AnonymousClass2(org.chromium.net.apihelpers.RedirectHandler redirectHandler) {
            this.getHighResolutionOutputSizeshNQ4ISI = redirectHandler;
        }

        @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
        protected boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) throws java.lang.Exception {
            return this.getHighResolutionOutputSizeshNQ4ISI.shouldFollowRedirect(urlResponseInfo, str);
        }
    }

    /* renamed from: org.chromium.net.apihelpers.UrlRequestCallbacks$3, reason: invalid class name */
    class AnonymousClass3 extends org.chromium.net.apihelpers.JsonCronetCallback {
        final /* synthetic */ org.chromium.net.apihelpers.RedirectHandler getHighSpeedVideoFpsRangesFor;

        AnonymousClass3(org.chromium.net.apihelpers.RedirectHandler redirectHandler) {
            this.getHighSpeedVideoFpsRangesFor = redirectHandler;
        }

        @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
        protected boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) throws java.lang.Exception {
            return this.getHighSpeedVideoFpsRangesFor.shouldFollowRedirect(urlResponseInfo, str);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: org.chromium.net.apihelpers.UrlRequestCallbacks$4, reason: invalid class name */
    class AnonymousClass4<T> implements org.chromium.net.apihelpers.CronetRequestCompletionListener<T> {
        final /* synthetic */ java.util.concurrent.CompletableFuture Camera2StreamConfigurationMap;

        AnonymousClass4(java.util.concurrent.CompletableFuture completableFuture) {
            this.Camera2StreamConfigurationMap = completableFuture;
        }

        @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
        public void onFailed(org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
            this.Camera2StreamConfigurationMap.completeExceptionally(cronetException);
        }

        @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
        public void onCanceled(org.chromium.net.UrlResponseInfo urlResponseInfo) {
            this.Camera2StreamConfigurationMap.completeExceptionally(new org.chromium.net.CronetException("The request was canceled!") { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.4.1
            });
        }

        @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
        public void onSucceeded(org.chromium.net.UrlResponseInfo urlResponseInfo, T t) {
            this.Camera2StreamConfigurationMap.complete(new org.chromium.net.apihelpers.CronetResponse(urlResponseInfo, t));
        }
    }

    public static class CallbackAndResponseFuturePair<ResponseBodyT, CallbackT extends org.chromium.net.apihelpers.InMemoryTransformCronetCallback<ResponseBodyT>> {
        private final java.util.concurrent.Future<org.chromium.net.apihelpers.CronetResponse<ResponseBodyT>> Camera2StreamConfigurationMap;
        private final CallbackT getHighResolutionOutputSizeshNQ4ISI;

        CallbackAndResponseFuturePair(java.util.concurrent.Future<org.chromium.net.apihelpers.CronetResponse<ResponseBodyT>> future, CallbackT callbackt) {
            this.Camera2StreamConfigurationMap = future;
            this.getHighResolutionOutputSizeshNQ4ISI = callbackt;
        }

        public java.util.concurrent.Future<org.chromium.net.apihelpers.CronetResponse<ResponseBodyT>> getFuture() {
            return this.Camera2StreamConfigurationMap;
        }

        public CallbackT getCallback() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    private UrlRequestCallbacks() {
    }

    public static org.chromium.net.apihelpers.ByteArrayCronetCallback forByteArrayBody(org.chromium.net.apihelpers.RedirectHandler redirectHandler, org.chromium.net.apihelpers.CronetRequestCompletionListener<byte[]> cronetRequestCompletionListener) {
        return new org.chromium.net.apihelpers.UrlRequestCallbacks.AnonymousClass1(redirectHandler).addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener<? super byte[]>) cronetRequestCompletionListener);
    }

    public static org.chromium.net.apihelpers.UrlRequestCallbacks.CallbackAndResponseFuturePair<byte[], org.chromium.net.apihelpers.ByteArrayCronetCallback> forByteArrayBody(org.chromium.net.apihelpers.RedirectHandler redirectHandler) {
        org.chromium.net.apihelpers.UrlRequestCallbacks.AnonymousClass1 anonymousClass1 = new org.chromium.net.apihelpers.UrlRequestCallbacks.AnonymousClass1(redirectHandler);
        java.util.concurrent.CompletableFuture completableFuture = new java.util.concurrent.CompletableFuture();
        anonymousClass1.addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener) new org.chromium.net.apihelpers.UrlRequestCallbacks.AnonymousClass4(completableFuture));
        return new org.chromium.net.apihelpers.UrlRequestCallbacks.CallbackAndResponseFuturePair<>(completableFuture, anonymousClass1);
    }

    public static org.chromium.net.apihelpers.JsonCronetCallback forJsonBody(org.chromium.net.apihelpers.RedirectHandler redirectHandler, org.chromium.net.apihelpers.CronetRequestCompletionListener<org.json.JSONObject> cronetRequestCompletionListener) {
        return new org.chromium.net.apihelpers.UrlRequestCallbacks.AnonymousClass3(redirectHandler).addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener<? super org.json.JSONObject>) cronetRequestCompletionListener);
    }

    public static org.chromium.net.apihelpers.UrlRequestCallbacks.CallbackAndResponseFuturePair<org.json.JSONObject, org.chromium.net.apihelpers.JsonCronetCallback> forJsonBody(org.chromium.net.apihelpers.RedirectHandler redirectHandler) {
        org.chromium.net.apihelpers.UrlRequestCallbacks.AnonymousClass3 anonymousClass3 = new org.chromium.net.apihelpers.UrlRequestCallbacks.AnonymousClass3(redirectHandler);
        java.util.concurrent.CompletableFuture completableFuture = new java.util.concurrent.CompletableFuture();
        anonymousClass3.addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener) new org.chromium.net.apihelpers.UrlRequestCallbacks.AnonymousClass4(completableFuture));
        return new org.chromium.net.apihelpers.UrlRequestCallbacks.CallbackAndResponseFuturePair<>(completableFuture, anonymousClass3);
    }

    public static org.chromium.net.apihelpers.StringCronetCallback forStringBody(org.chromium.net.apihelpers.RedirectHandler redirectHandler, org.chromium.net.apihelpers.CronetRequestCompletionListener<java.lang.String> cronetRequestCompletionListener) {
        return new org.chromium.net.apihelpers.UrlRequestCallbacks.AnonymousClass2(redirectHandler).addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener<? super java.lang.String>) cronetRequestCompletionListener);
    }

    public static org.chromium.net.apihelpers.UrlRequestCallbacks.CallbackAndResponseFuturePair<java.lang.String, org.chromium.net.apihelpers.StringCronetCallback> forStringBody(org.chromium.net.apihelpers.RedirectHandler redirectHandler) {
        org.chromium.net.apihelpers.UrlRequestCallbacks.AnonymousClass2 anonymousClass2 = new org.chromium.net.apihelpers.UrlRequestCallbacks.AnonymousClass2(redirectHandler);
        java.util.concurrent.CompletableFuture completableFuture = new java.util.concurrent.CompletableFuture();
        anonymousClass2.addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener) new org.chromium.net.apihelpers.UrlRequestCallbacks.AnonymousClass4(completableFuture));
        return new org.chromium.net.apihelpers.UrlRequestCallbacks.CallbackAndResponseFuturePair<>(completableFuture, anonymousClass2);
    }
}
