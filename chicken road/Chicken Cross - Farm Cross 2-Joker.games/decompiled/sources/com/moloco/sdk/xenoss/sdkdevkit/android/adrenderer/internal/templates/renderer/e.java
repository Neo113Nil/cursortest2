package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.webkit.WebView;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f11112a = new e();
    public static final String b = "WebViewRenderingChecker";
    public static final int c = 10;
    public static final int d = 200;
    public static final int e = 0;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.WebViewRenderingChecker", f = "WebViewRenderingChecker.kt", i = {0}, l = {34}, m = "isMostlyBlack", n = {"bitmap"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f11113a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return e.this.a(null, 0.0f, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.WebViewRenderingChecker$isMostlyBlack$2", f = "WebViewRenderingChecker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11114a;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Bitmap bitmap, float f, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = bitmap;
            this.c = f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11114a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(e.f11112a.a(this.b) >= this.c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(WebView webView, float f, Continuation<? super Boolean> continuation) {
        a aVar;
        int i;
        Bitmap bitmap;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                Object obj = aVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int width = webView.getWidth();
                    int height = webView.getHeight();
                    if (width <= 0 || height <= 0) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, b, "Skipping rendering check: WebView has zero size (" + width + 'x' + height + ')', null, false, 12, null);
                        return Boxing.boxBoolean(false);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                    try {
                        webView.draw(new Canvas(createBitmap));
                        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                        b bVar = new b(createBitmap, f, null);
                        aVar.f11113a = createBitmap;
                        aVar.d = 1;
                        Object withContext = BuildersKt.withContext(coroutineDispatcher, bVar, aVar);
                        if (withContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = withContext;
                        bitmap = createBitmap;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = createBitmap;
                        bitmap.recycle();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bitmap = (Bitmap) aVar.f11113a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        bitmap.recycle();
                        throw th;
                    }
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bitmap.recycle();
                return Boxing.boxBoolean(booleanValue);
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        bitmap.recycle();
        return Boxing.boxBoolean(booleanValue2);
    }

    public static /* synthetic */ Object a(e eVar, WebView webView, float f, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.9f;
        }
        return eVar.a(webView, f, continuation);
    }

    public final float a(Bitmap bitmap) {
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < width; i4++) {
            int i5 = iArr[i4];
            int alpha = Color.alpha(i5);
            boolean z = alpha >= 200;
            if (z) {
                i2++;
            } else if (alpha < 50) {
                i3++;
            }
            if (z && Color.red(i5) < 10 && Color.green(i5) < 10 && Color.blue(i5) < 10) {
                i++;
            }
        }
        float f = i / width;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, b, "Pixel breakdown: total=" + width + ", opaque=" + i2 + ", transparent=" + i3 + ", opaqueBlack=" + i + ", opaqueBlackRatio=" + f, null, false, 12, null);
        return f;
    }
}
