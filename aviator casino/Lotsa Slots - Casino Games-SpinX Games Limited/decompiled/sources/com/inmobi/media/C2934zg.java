package com.inmobi.media;

/* renamed from: com.inmobi.media.zg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2934zg extends com.inmobi.media.AbstractC2792u2 {
    public final android.view.Window b;
    public final java.util.concurrent.atomic.AtomicBoolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2934zg(android.view.Window window, com.inmobi.media.core.config.models.AdConfig.AdQualityConfig config) {
        super(config);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "window");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.b = window;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.inmobi.media.M0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final android.graphics.Bitmap a() {
        java.lang.System.currentTimeMillis();
        int width = this.b.getDecorView().getWidth();
        int height = this.b.getDecorView().getHeight();
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, width, height);
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        int layerType = this.b.getDecorView().getLayerType();
        this.b.getDecorView().setLayerType(0, null);
        android.view.PixelCopy.request(this.b, rect, createBitmap, new android.view.PixelCopy.OnPixelCopyFinishedListener() { // from class: com.inmobi.media.zg$$ExternalSyntheticLambda0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                com.inmobi.media.C2934zg.a(kotlin.jvm.internal.Ref.BooleanRef.this, this, i);
            }
        }, new android.os.Handler(android.os.Looper.getMainLooper()));
        while (!this.c.get()) {
            java.lang.Thread.sleep(500L);
        }
        boolean z = booleanRef.element;
        java.lang.System.currentTimeMillis();
        this.b.getDecorView().setLayerType(layerType, null);
        if (booleanRef.element) {
            return a(createBitmap);
        }
        return null;
    }

    public static final void a(kotlin.jvm.internal.Ref.BooleanRef booleanRef, com.inmobi.media.C2934zg c2934zg, int i) {
        if (i == 0) {
            booleanRef.element = true;
        }
        boolean z = booleanRef.element;
        c2934zg.c.set(true);
    }
}
