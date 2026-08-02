package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class e0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.Page f6762a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ double d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(financial.atomic.muppet.Page page, int i, int i2, double d, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6762a = page;
        this.b = i;
        this.c = i2;
        this.d = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.e0(this.f6762a, this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((financial.atomic.muppet.a.e0) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int intValue;
        java.lang.Integer boxInt;
        int intValue2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        android.graphics.Picture capturePicture = financial.atomic.muppet.Page.access$get_wv(this.f6762a).capturePicture();
        java.lang.Integer boxInt2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(this.b);
        if (boxInt2.intValue() <= 0) {
            boxInt2 = null;
        }
        if (boxInt2 == null) {
            boxInt2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(capturePicture.getWidth());
            if (boxInt2.intValue() <= 0) {
                boxInt2 = null;
            }
            if (boxInt2 == null) {
                intValue = kotlin.ranges.RangesKt.coerceAtLeast(financial.atomic.muppet.Page.access$get_wv(this.f6762a).getWidth(), 1);
                boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(this.c);
                if (boxInt.intValue() <= 0) {
                    boxInt = null;
                }
                if (boxInt == null) {
                    boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(capturePicture.getHeight());
                    if (boxInt.intValue() <= 0) {
                        boxInt = null;
                    }
                    if (boxInt == null) {
                        intValue2 = kotlin.ranges.RangesKt.coerceAtLeast(financial.atomic.muppet.Page.access$get_wv(this.f6762a).getHeight(), 1);
                        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(intValue, intValue2, android.graphics.Bitmap.Config.ARGB_8888);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "");
                        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                        if (capturePicture.getWidth() <= 0 && capturePicture.getHeight() > 0) {
                            capturePicture.draw(canvas);
                        } else {
                            if (financial.atomic.muppet.Page.access$get_wv(this.f6762a).getWidth() > 0 || financial.atomic.muppet.Page.access$get_wv(this.f6762a).getHeight() <= 0) {
                                return null;
                            }
                            financial.atomic.muppet.Page.access$get_wv(this.f6762a).draw(canvas);
                        }
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        try {
                            java.lang.String encodeToString = createBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, kotlin.ranges.RangesKt.coerceIn((int) (this.d * 100.0d), 0, 100), byteArrayOutputStream) ? android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) : null;
                            kotlin.io.CloseableKt.closeFinally(byteArrayOutputStream, null);
                            return encodeToString;
                        } finally {
                        }
                    }
                }
                intValue2 = boxInt.intValue();
                android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(intValue, intValue2, android.graphics.Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap2, "");
                android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap2);
                if (capturePicture.getWidth() <= 0) {
                }
                if (financial.atomic.muppet.Page.access$get_wv(this.f6762a).getWidth() > 0) {
                }
                return null;
            }
        }
        intValue = boxInt2.intValue();
        boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(this.c);
        if (boxInt.intValue() <= 0) {
        }
        if (boxInt == null) {
        }
        intValue2 = boxInt.intValue();
        android.graphics.Bitmap createBitmap22 = android.graphics.Bitmap.createBitmap(intValue, intValue2, android.graphics.Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap22, "");
        android.graphics.Canvas canvas22 = new android.graphics.Canvas(createBitmap22);
        if (capturePicture.getWidth() <= 0) {
        }
        if (financial.atomic.muppet.Page.access$get_wv(this.f6762a).getWidth() > 0) {
        }
        return null;
    }
}
