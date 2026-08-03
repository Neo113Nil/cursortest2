package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

/* loaded from: classes5.dex */
public interface l {

    public static final class a {
        public static /* synthetic */ void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l lVar, java.util.List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, java.lang.Integer num, java.lang.String str, java.util.List list2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackClick");
            }
            lVar.a(list, (i & 2) != 0 ? null : xVar, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, list2, aVar, fVar);
        }

        public static /* synthetic */ void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l lVar, java.util.List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
            }
            if ((i & 2) != 0) {
                xVar = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            lVar.a(list, xVar, num, str);
        }
    }

    void a(java.util.List<java.lang.String> list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, java.lang.Integer num, java.lang.String str);

    void a(java.util.List<java.lang.String> list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, java.lang.Integer num, java.lang.String str, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> list2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar);
}
