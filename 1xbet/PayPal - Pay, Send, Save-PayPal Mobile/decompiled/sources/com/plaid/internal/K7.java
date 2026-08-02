package com.plaid.internal;

/* loaded from: classes16.dex */
public final class K7 {

    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5827a;

        static {
            int[] iArr = new int[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.values().length];
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_DEFAULT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_DARK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_LIGHT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.UNRECOGNIZED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            f5827a = iArr;
        }
    }

    public static final boolean a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Z z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z, "");
        int i = com.plaid.internal.K7.a.f5827a[z.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
