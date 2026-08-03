package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public interface s {

    public static final class a {
        public static /* synthetic */ java.lang.Object a(com.moloco.sdk.internal.services.s sVar, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runClickThrough");
            }
            if ((i & 8) != 0) {
                mutableSharedFlow = null;
            }
            return sVar.a(str, aVar, hVar, mutableSharedFlow, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object a(com.moloco.sdk.internal.services.s sVar, java.lang.String str, kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runTemplateAdClickThrough");
            }
            if ((i & 2) != 0) {
                mutableSharedFlow = null;
            }
            return sVar.a(str, mutableSharedFlow, continuation);
        }
    }

    java.lang.Object a(java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object a(java.lang.String str, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
