package com.google.android.exoplayer2.util;

/* loaded from: classes3.dex */
public interface DebugViewProvider {
    public static final com.google.android.exoplayer2.util.DebugViewProvider NONE = new com.google.android.exoplayer2.util.DebugViewProvider() { // from class: com.google.android.exoplayer2.util.DebugViewProvider$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.util.DebugViewProvider
        public final android.view.SurfaceView getDebugPreviewSurfaceView(int i, int i2) {
            return com.google.android.exoplayer2.util.DebugViewProvider.CC.lambda$static$0(i, i2);
        }
    };

    /* renamed from: com.google.android.exoplayer2.util.DebugViewProvider$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            com.google.android.exoplayer2.util.DebugViewProvider debugViewProvider = com.google.android.exoplayer2.util.DebugViewProvider.NONE;
        }

        public static /* synthetic */ android.view.SurfaceView lambda$static$0(int i, int i2) {
            return null;
        }
    }

    android.view.SurfaceView getDebugPreviewSurfaceView(int i, int i2);
}
