package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* loaded from: classes5.dex */
public final class q {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7519a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.b.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.c.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.d.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f7519a = iArr;
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p pVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "<this>");
        int i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q.a.f7519a[pVar.ordinal()];
        if (i == 1) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.b;
        }
        if (i == 2) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.c;
        }
        if (i == 3) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.d;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
