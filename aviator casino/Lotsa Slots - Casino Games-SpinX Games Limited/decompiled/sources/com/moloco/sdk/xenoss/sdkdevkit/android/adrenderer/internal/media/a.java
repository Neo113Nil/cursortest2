package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

/* loaded from: classes5.dex */
public interface a {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a$a, reason: collision with other inner class name */
    public static final class C0232a {
        public static /* synthetic */ java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a aVar, java.lang.String str, java.io.File file, java.lang.String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadMedia");
            }
            if ((i & 8) != 0) {
                aVar2 = null;
            }
            return aVar.a(str, file, str2, aVar2, continuation);
        }
    }

    java.lang.Object a(java.lang.String str, java.io.File file, java.lang.String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a> continuation);

    boolean a(java.io.File file);

    boolean b(java.io.File file);
}
