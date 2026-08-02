package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/TokenError;", "Lcom/paypal/oslo/core/identity/domain/model/Token;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4", f = "IdentityTokenProviderImpl.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes5.dex */
public final class IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>>, java.lang.Object> {
    private static long getHighSpeedVideoFpsRanges;
    private static char[] getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    private static final byte[] $$c = {com.google.common.base.Ascii.GS, 122, 56, com.google.common.base.Ascii.EM};
    private static final int $$d = 74;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {87, 13, 87, -97, -2, 8, -8};
    private static final int $$b = 126;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getOutputMinFrameDuration = 1;

    private static java.lang.String $$e(int i, byte b, byte b2) {
        byte[] bArr = $$c;
        int i2 = 3 - (i * 2);
        int i3 = 106 - b;
        int i4 = b2 * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = (-i2) + i4;
            i2 = i2;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            int i7 = i2 + 1;
            if (i6 == i4) {
                return new java.lang.String(bArr2, 0);
            }
            i5 = i6;
            i3 = (-bArr[i7]) + i3;
            i2 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2 = s * 3;
        int i3 = 105 - b2;
        int i4 = b + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i2;
            int i6 = 0;
            i3 = i3 + (-i5) + 3;
            i = i6;
            i4++;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = bArr[i4];
            i3 = i3 + (-i5) + 3;
            i = i6;
            i4++;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i2) {
            }
        } else {
            i = 0;
            i4++;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i2) {
            }
        }
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        int i3 = 2 % 2;
        o.toString tostring = new o.toString();
        long[] jArr = new long[i2];
        tostring.getHighSpeedVideoSizes = 0;
        while (tostring.getHighSpeedVideoSizes < i2) {
            int i4 = $11 + 9;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = tostring.getHighSpeedVideoSizes;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(getHighSpeedVideoSizes[i * i5])};
                    java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1661500946);
                    if (Camera2StreamConfigurationMap == null) {
                        char touchSlop = (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 46427);
                        int scrollDefaultDelay = (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 428;
                        int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 6;
                        byte length = (byte) $$c.length;
                        Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(touchSlop, scrollDefaultDelay, resolveOpacity, -32981230, false, $$e((byte) 0, length, (byte) (length - 4)), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i5), java.lang.Long.valueOf(getHighSpeedVideoFpsRanges), java.lang.Integer.valueOf(c)};
                    java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-890001032);
                    if (Camera2StreamConfigurationMap2 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 3);
                        Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 12708), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, 17 - android.os.Process.getGidForName(""), 1475569784, false, $$e(b, b2, (byte) (b2 - 3)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                    }
                    jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3)).longValue();
                    java.lang.Object[] objArr4 = {tostring, tostring};
                    java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(685161726);
                    if (Camera2StreamConfigurationMap3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.view.KeyEvent.getDeadChar(0, 0) + 30291), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 160, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29, -1244234242, false, $$e(b3, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = tostring.getHighSpeedVideoSizes;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(getHighSpeedVideoSizes[i + i6])};
                java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1661500946);
                if (Camera2StreamConfigurationMap4 == null) {
                    char resolveSize = (char) (android.view.View.resolveSize(0, 0) + 46427);
                    int i7 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 428;
                    int size = 6 - android.view.View.MeasureSpec.getSize(0);
                    byte length2 = (byte) $$c.length;
                    Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(resolveSize, i7, size, -32981230, false, $$e((byte) 0, length2, (byte) (length2 - 4)), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr6 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap4).invoke(null, objArr5)).longValue()), java.lang.Long.valueOf(i6), java.lang.Long.valueOf(getHighSpeedVideoFpsRanges), java.lang.Integer.valueOf(c)};
                java.lang.Object Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-890001032);
                if (Camera2StreamConfigurationMap5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 3);
                    Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (12708 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, 18 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1475569784, false, $$e(b5, b6, (byte) (b6 - 3)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i6] = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap5).invoke(null, objArr6)).longValue();
                java.lang.Object[] objArr7 = {tostring, tostring};
                java.lang.Object Camera2StreamConfigurationMap6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(685161726);
                if (Camera2StreamConfigurationMap6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    Camera2StreamConfigurationMap6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (30291 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 161, android.text.TextUtils.indexOf("", "") + 30, -1244234242, false, $$e(b7, b8, b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) Camera2StreamConfigurationMap6).invoke(null, objArr7);
            }
            int i8 = $10 + 121;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 4 / 5;
            }
        }
        char[] cArr = new char[i2];
        tostring.getHighSpeedVideoSizes = 0;
        while (tostring.getHighSpeedVideoSizes < i2) {
            cArr[tostring.getHighSpeedVideoSizes] = (char) jArr[tostring.getHighSpeedVideoSizes];
            java.lang.Object[] objArr8 = {tostring, tostring};
            java.lang.Object Camera2StreamConfigurationMap7 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(685161726);
            if (Camera2StreamConfigurationMap7 == null) {
                byte b9 = (byte) 0;
                byte b10 = b9;
                Camera2StreamConfigurationMap7 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (30290 - android.graphics.ImageFormat.getBitsPerPixel(0)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 160, 30 - android.view.View.getDefaultSize(0, 0), -1244234242, false, $$e(b9, b10, b10), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) Camera2StreamConfigurationMap7).invoke(null, objArr8);
            int i10 = $11 + 101;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = 2 % 2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 35;
            getOutputMinFrameDuration = i3 % 128;
            int i4 = i3 % 2;
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object access$fetchUserTokenViaLLSLogin = com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl.access$fetchUserTokenViaLLSLogin(this.Camera2StreamConfigurationMap, this);
        if (access$fetchUserTokenViaLLSLogin != coroutine_suspended) {
            return access$fetchUserTokenViaLLSLogin;
        }
        int i5 = getHighResolutionOutputSizeshNQ4ISI + 47;
        getOutputMinFrameDuration = i5 % 128;
        int i6 = i5 % 2;
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation) {
        int i = 2 % 2;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 49;
        getOutputMinFrameDuration = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object invokeSuspend = ((com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 31;
        getOutputMinFrameDuration = i4 % 128;
        int i5 = i4 % 2;
        return invokeSuspend;
    }

    static {
        char[] cArr = new char[2156];
        java.nio.ByteBuffer.wrap("\u0098\u0006\u0088d¸\u001e¨$Ø¢È\u0083ø°éZ\u0019\u0005\t>9Ú)\u0099Y\u00adJczvj*\u009aÝ\u008aâº®«QÛnË+ûÜëö\u001b\u0090\fK<f+\u008f;í\u000b\u0097\u001b\u00adk+{\nK9ZÓª\u008cº·\u008aS\u009a\u0010ê$ùêÉîÙ®)@9|\t\u001d\u0018Ïhäx\u008fHEX{¨\u001c\u0098\u0006\u0088d¸\u001e¨$Ø¢È\u0083ø°éZ\u0019\u0005\t>9Ú)\u0099Y\u00adJczdj7\u009a×\u008aó\u0098\u0006\u0088s¸\u0002¨!Ø¢È\u0089ø°éR\u0019\u0014\t49Ö)ÅY¢JSz{j*\u009aß\u008aùº¸«JÛBË\u0016ûÎëò\u001b\u0085\fM<q,\u0003Ê\u000fÚlê\u0006ú8\u008a«\u009a\u0089ª±»\u0011K\u0018[#kÕ{\u0093\u0098\u0006\u0088e¸\u000f¨1Ø¢È\u0097ø¶é[\u0019O\t(9Á)\u0085Yµ{åk\u0090[üKÒ;\u000f+u\u001bX\núúÐêýÚ\u001dÊfºP©º\u0099°\u0089Ìy.i\u0012ÿ\u0088ïêß\u0094Ï¨¿b¯E\u009f\u007f\u008eÛ~\u009fn£^TN\n>--Ýq'a\u0013Q)AL1\u009e!÷\u0011×\u0000dðoàAÐ«Àä°Ö£)\u0093\u000f\u0083ms«c\u0089SÃB\u00012\u0005\"f\u0012 \u0002Ë\u001c\u008a\f¾<\u0084,á\\3LZ|zmÉ\u009dÂ\u008dì½\u0006\u00adIÝ{Î\u0084þ¢îÀ\u001e\u0006\u000e$>n/¬_¨OË\u007f\roe\u0083+\u0093^£/³\fÃÔÓ¬ã\u009fò4\u0002 \u0012\u001c\"ü2èB\u0084QxaXq\r\u0081ö\u0091\u0093¡\u0095°`\u0098K\u0088i¸\u001c¨<ØâÈ\u009c\u0098\u0006\u0088s¸\u0002¨!ØùÈ\u0081ø²é\u0019\u0019\u0003\t19Ý)ÅY«JYzzj;\u009aï\u008aÝºæ«LÛxË\u0019ûÚë«\u001b\u0092\fG<m,\u000e\\'Lã|\u008b\u0098\u0006\u0088s¸\u0002¨!ØùÈ\u0081ø²é\u0019\u0019\u0003\t19Ý)ÅY«JYzzj;\u009aï\u008aÝºæ«RÛoË\u001bûß\u0098\u0006\u0088s¸\u0002¨!ØùÈ\u0081ø²é\u0019\u0019\r\t19Ñ)ÅY©JUzuj \u009aÜ\u008aýº¾«tÛPË\u0004ûÝëé\u001b\u0081\f\u0006<p,\u0015\u0098\u0006\u0088d¸\u001e¨$Ø¢È\u008aøºé[\u0019\u0014\t?9Æ)\u008fY¶JHÔ\bÄ<ô\u0006äc\u0094«\u0084Þ´à¥\u0001U\u001cEcu\u008feÊ\u0015â\u0098G\u0088e¸\u001a¨!ØèÈÊø±éS\u0019\u0015'Ç7±\u0007È\u0017üg/w\nGxV\u009e¦Ì¶ü\u0086\u0001\u0096Ræwõ\u0089Å³Õâ%\u000b\u0098G\u0088e¸\u0016¨'ØþÈ\u0082\u0098u\u0088A¥¨µ\u009c\u0085¦\u0095Ñå\fõxÅHÔ°$ñ4ß\u0004n\u0014tdWw¡G\u0091WÛ§+·\u0000\u0087L\u0096¤æ\u009cöâÆ.\r\u0094\u001d¿-Ï=ñ)\u00079;\tW\u0019\u007fiºyÉIõXF¨L¸\u007f\u0088\u009e\u0098\u009aèùû\u0006ËgÛt+\u0082;¬\u000bà\u001a\u001bjmzMJ\u0081Z\u00adª\u0081½\u0010\u008d<\u009dOíný\u008dÍÞÝð,\"<a\fw\u001c\u0089lÝ|þO\u0004_:¯z¿\u0094\u0098Y\u0088e¸\t¨!ØäÈ\u0097ø«é\u0018\u0019\u0012\t!9À)ÄY§JXz9j*\u009aÜ\u008aòº¾«EÛ3Ë\u0013ûßëó\u001bß\fN<b,\u0011\\0LÓ|\u0080l®\u009d|\u008d?½-\u00ad×Ý\u0083Í þPîd\u0098Y\u0088e¸\t¨!ØäÈ\u0097ø«é\u0018\u0019\u0012\t!9À)ÄY§JXz9j*\u009aÜ\u008aòº¾«EÛ3Ë\u0006ûÀë¨\u001b\u0092\fY<j\u0098Y\u0088e¸\t¨!ØäÈ\u0097ø«é\u0018\u0019\u0012\t!9À)ÄY§JXz9j*\u009aÜ\u008aòº¾«EÛ3Ë\u0006ûÀë¨\u001b\u009d\fI<`\u0098Y\u0088e¸\t¨!ØäÈ\u0097ø«é\u0018\u0019\u0012\t!9À)ÄY§JXz9j*\u009aÜ\u008aòº¾«EÛ3Ë\u0006ûÀë¨\u001b\u009c\fK<`\u0098Y\u0088e¸\t¨!ØäÈ\u0097ø«é\u0018\u0019\u0012\t!9À)ÄY§JXz9j*\u009aÜ\u008aòº¾«EÛ3Ë\u0006ûÀë¨\u001b\u009c\fF<`\u0095:\u0085\u0007µq¥OÕ\u009bÅç\u0098\u001e\u0088h¸\u0011¨%ØöÈÓøªéA\u0019\u001d\t59Ç)\u0097Y®ØÅÈøø\u008eè°\u0098p\u0088\u000b¸ ©ßY\u008f\u0098\u0006\u0088s¸\u0002¨!ØùÈ\u0081ø²é\u0019\u0019\u0007\t*9Ò)\u0087Y JKzxj<\u009aÒ\u008a¿º¼«KÛsË\u0010ûÀëñ\u001b\u0082\f\u0005<p,\u0003\\&Lø|\u0082l³\u009dV\u008d\u0013½>\u00adÀÝ\u009bÍ¡þMî8\u001e+\u000eÙ>á\u0098\u0006\u0088v¸\u001e¨<ØéÈ\u008bø\u00adé\u0019\u0019\r\t19Ñ)ÜYñJ\u0013z\u007fj9\u009a\u0096\u008añº¾«FÛtË\u001bû\u0081ëö\u001b\u0083\fA<n,\u001b\\'Lõ|Él©\u009d`\u008d\u000e½?\u00adÝÝ\u009aÍ·þ\u0011îe\u001e.\u0098\u0006\u0088v¸\u001e¨<ØéÈ\u008bø\u00adé\u0019\u0019\r\t19Ñ)ÜYñJ\u0013z\u007fj9\u009a\u0096\u008aøº¼«AÛrË\u0019ûßëé\u001b\u0082\fM<q,T\\\"Lå|\u0089lº\u009df\u008d\u0017½(\u00ad\u009cÝ\u009eÍ«\u0098\u0006\u0088s¸\u0002¨!ØùÈ\u0081ø²é\u0019\u0019\r\t19Ñ)ÜYñJ\u0013ztj\"\u009aÖ\u008aåº¯«}Û|Ë\u001dûËëê\u001b®\fA<m,\u000e\\0Lþ|\u0081l¿\u009dj\u008d\u0005½v\u00adÑÝ\u009dÍ´þ\u0011îe\u001e.\u0098\u0006\u0088e¸\u000f¨1Ø¢È\u008dø±é_\u0019\u0015\tw9Ú)\u0084Y¬JHz9j-\u009aÕ\u008aÿº¾«FÛnË\u0011ûÝëð\u001b\u0098\fK<f,T\\'Lï\u0098n\u0088e¸\u0015¨+ØàÈ\u008bø«é_\u0019\u000e\t6\u0098\\\u0088n¸\u0010¨<ØâÈ\u0093ø±\u0098J\u0088h¸\t¨=ØàÈ\u008døªé[ìßüëÌÑÜ¦¬{¼\u000f\u008c?\u009dÇm\u0086}¨M\u0019]\n-$>Î\u000eú\u001e©îX\u0098_\u0088b¸\u0014¨*ØµÈÒø¯\u0098N\u0088e¸\u0015¨7ØÿÈ\u008dø¼\u0098N\u0088e¸\u0015¨7ØÿÈ\u008dø¼éi\u0019\u0019\t`9\u0085ë\tû\"ËRÛp«¸»Ê\u008bû\u009a.j^z'JÂZò*´9ORKB\u007frEb2\u0012ï\u0002\u009b2«#SÓ\u0012Ã<ó\u008dã\u0097\u0093º\u0080H°b 2\u008f¹\u009f\u0087¯ó¨Ü¸ý\u0088\u009e\u0098®è|ø\u0000È ÙÔ\u0098h\u0088p¸\u000b¨rØßÈ\u0091ø±éB\u0019\b\t59Ö)ÊY£JSzejn\u009aú\u008aøº¹«MÛpË\u0011\u0098h\u0088n¸\u001f¨ ØâÈ\u008dø»é\u0016\u00192\t\u001c9ø)ÊY§JIz~j\"\u009aÍ\u008a°º\u00ad«MÛoËTû×ë¾\u001bÇ\u0098h\u0088n¸\u001f¨ ØâÈ\u008dø»é\u0016\u00192\t\u001c9ø)ÊY§JIz~j\"\u009aÍ\u008a°º\u00ad«MÛoËTû×ë¾\u001bÇ\fw<5,NK¬[\u0098k¢{Í\u000b\u001b\u001ba+L:¶Ê÷ÚÝê!þËîêÞ\u0092Î³¾n®\b\u009e)\u008fÛ\u0098_\u0088b¸\u0014¨*ØµÈÒ\u0098[\u0088a¸\u0015¨1ØåÈ\u0091\u0098[\u0088o¸U¨\"ØÿÈ\u008bø»éC\u0019\u0002\t,9\u009d)\u0088Y·J]zyj*\u0004g\u0014S$i4\u0005DÔTªd\u008duo\u00851\u0095J¥þµ³Å\u0094Öu\u0098\u0018\u0098[\u0088o¸U¨!ØèÈ\u0087øªéD\u0019\u0004\u0098\u00196º&\u008e\u0016´\u0006Ñv\u0019flVRG³·®§É\u0097 \u0087d÷@ä¨Ô\u0095ÄÛ\u0098O\u0088u¸\u0017¨>ØÒÈ\u009cøçé\u0000\u0098[\u0088o¸U¨0ØøÈ\u008dø³éR\u0019O\t>9Ú)\u0084Y¢JYzej>\u009aË\u008aùº¥«V\u0098N\u0088e¸\u0015¨7ØÿÈ\u008dø¼é\u0019\u0019\u0012\t<9Ø)ÅY¢JYzyj+\u009aË\u008aùº¨\u001b\u0089\u000b¢;Ò+ð[8KJ{{j®\u009aÞ\u008a§ºBª\u0002ÚqÉ\u009fù»éÖ\u0019\u0006\to9:(ÊX½HÖx\u0006h$\u0098D\u008f\u0086¿§¯âßêÏsÿ\u0016\u0098N\u0088e¸\u0015¨7ØÿÈ\u008dø¼é\u0019\u0019\u0006\t79Ü)\u008dY©JYzHj=\u009aÝ\u008aûºä«EÛxË\u001aûÊëô\u001b\u0098\fK6\"&\t\u0016y\u0006[v\u0093fáVÐGu·{§V\u0097°\u0087þ÷\u0091äfÔ\u000bÄ\r4£$\u009e\u0014È\u00056uIe.U³\u0098N\u0088o¸\u0014¨5ØáÈ\u0081øðéE\u0019\u0005\t39ì)\u008dYµJTzxj \u009aÜ\u008aÏº³«\u001aÛ+Ë[ûÈëã\u001b\u009f\fM<q,\u0013\\6LÓ|\u009flæ\u009d?\u0093è\u0083Ü³æ£\u0083ÓQÃ8ó\u0018âé\u0012½\u0002\u008a2d\"<R\u0004\u0098[\u0088o¸U¨0ØâÈ\u008bø«é_\u0019\f\t99Ô)\u008fYëJ^zbj'\u009aÕ\u008aôºå«DÛtË\u001aûÈëã\u001b\u0083\fX<q,\u0013\\;Lø\u0098h\u0088n¸\u001f¨ ØâÈ\u008dø»é\u001b\u0019\u0019\t`9\u0085\u0098[\u0088o¸U¨0ØøÈ\u008dø³éR\u0019O\t<9Ú)\u0099YµJPzvj7\u009a\u0097\u008aùº¯\u0098]\u0088e¸\b¨&Ø êTúzÊ\u0006Ú2ª·º\u0083\u008a½\u009bAk[{=KÂ[\u0093+¤8\u0005\bs\u0018(èÂøôÈ¬SòCÏs¼c\u008d\u0013\t\u0003&3\u0002\"²Ò¦Â\u0093òpâ.\u0092\u0004\u0081ó±Ä¡\u0097\u0098X\u0088e¸\u0016¨'Ø£È\u0097ø¹é\u0018\u0019\u0007\t99Ø)\u008fY\u009aJ_zvj#\u009aÜ\u008aâºªc\u0086s»CÈSù#}3I\u0003g\u0012ÆâÓòåÂ\tÒk¢\u007f±\u0087\u0081§\u0091ãa\u000eq:Al§æ·Ò\u0087è\u0097\u0084çU÷+Ç\fÖî&°6Ë\u0006o\u00169f\u001cuóEÅU\u009a¥`µ\u0003\u0085\u0007\u0094úäÍô¼Äv\u0098[\u0088o¸U¨0ØâÈ\u008bø«é\u0018\u0019\u0010\t=9Þ)\u009fYëJ]zaj*\u009aæ\u008aþºª«OÛxHõXÁhûx\u0093\bG\u0018'(_9úÉºÙ\u009féqù \u0089E\u009aôªÐº\u008eJpZ[j\u0017{ü\u000bÁ\u001b³+o;\\\u0098[\u0088o¸U¨\"ØÿÈ\u008bø»éC\u0019\u0002\t,9\u009d)\u0088Y°JUz{j*\u009a\u0097\u008aöº¢«LÛzË\u0011ûÝëö\u001b\u0083\fA<m,\u000e\u000b&\u001b\u0012+(;\\K\u0089[êkÖz.\u008aq\u009a\u000bª¬ºâÊÑÙ-é\u000eù\u001d\t¢\u0019\u0084)Ø88H\u0005X{h¢x\u0089\u0088å\u009f;¯\nqJa~QDA01å!\u0086\u0011º\u0000Bð\u001dà\u0016ÐÇÀ\u0083° £\u0003\u0093d\u0083*sÁcíS¾B\u001d2j\"\f\u0012Ð\u0002ðò\u0085åKÕbÅ\u0019µ-¥ó\u0095\u0082»#«\u0017\u009b-\u008b\\û\u0090ëòÛÃÊ!:k*\u000e\u001a©\nçzÔi(Y\u000bI\u0018¹§©\u0081\u0099Ý\u0088=ø\u0000è~Ø§È\u008c8à/>\u001f\u000fúmêYÚcÊ\u0012ºÞª¼\u009a\u008d\u008bo{%k1[áK°;\u0098(g\u0018\u000f\b\u001aøúèÏØ\u0091Ép¹\u0005©$\u0099ð\u0089Þy n{^GN<>\u0011.Ó\u001e¿\u000e\u009có\u0099[óKÖ\u0098\u0013\u0098\u0000\u0019\u00ad\tÏ9µ)\u008fY\tI>y\u0011hð\u0098¿\u0088¬¸h¨(Ø\u001eËò\u0098\u0006\u0088d¸\u001e¨$Ø¢È\u0097ø°éU\u0019\n\t=9Ç)ÅY§J]zdj+\u009aÛ\u008añº¥«FÛBË\u0013ûÊëè\u001b\u0088\fLÂõÒ\u0097âíò×\u0082Q\u0092d¢C³¦CùSÎc4s6\u0003Q\u0010ª \u008a0ÄÀ.\u0093H\u0083*³P£jÓìÃÙóþâ\u001b\u0012D\u0002s2\u0089\"\u008bRúA\u0017q4au\u0091\u0093\u0098\u0006\u0088s¸\u0002¨!Ø¢È\u0095øºé[\u0019\u0014\t\u00079Ç)\u0098Y¤J_zr\u0098\u0006\u0088s¸\u0002¨!ØùÈ\u0081ø²é\u0019\u0019\r\t19Ñ)ÅY©JUzuj-\u009aæ\u008aýºª«NÛqË\u001bûÌëÙ\u001b\u0095\fM<a,\u000f\\2LÓ|\u0096l»\u009dd\u008d\u0015½u\u00adÁÝ\u0082g\u008cwîG\u0094W®'(7\f\u0007&\u0016Èæ´öµÆIÖ\u0013\u0098\u0006\u0088d¸\u001e¨$Ø¢È\u0086ø¬éB\u0019>\t,9Ú)\u0087Y Í\u008bÝéí\u0093ý©\u008d/\u009d\u001a\u00ad=¼ØL\u0087\\°lJ|H\f*\u001fÂ/î?¥Ï[ßqï\"þÊ\u008eâ\u009e\u009d\u0080\u008a\u0090ÿ \u008e°\u00adÀuÐ\rà>ñ\u0095\u0001\u0081\u0011½!]1IA%RÙbùr \u0082F\u0092h¢!³ÁÃýÓ\u009cãFóx\u0003\"\u0014Î$á4\u009fD÷Tsd\u0004\u008c5\u009cW¬-¼\u0017Ì\u0091Üµì\u009fýq\r3\u001d\b-ã=¼\u0098\u0006\u0088d¸\u001e¨$Ø¢È\u0086ø¬éB\u0019\u0006\t!9Á)\u0085\r/\u001dM-7=\rM\u008b]¯m\u0085|k\u008c%\u009c\u0014¬ý¼\u00ad\u0098\u0006\u0088d¸\u001e¨$Ø¢È\u0086ø¬éB\u0019\u000e\t*9Ú)\u008f\u0098\u0006\u0088d¸\u001e¨$Ø¢È\u0086ø¬éB\u0019\u0017\t59À)\u008d\u0098\u0006\u0088d¸\u001e¨$Ø¢È\u0086ø¬éB\u0019\u0011\t?9Ò)\u0083YµJ_t\u0001dcT\u0019D#4¥$\u0081\u0014«\u0005Eõ9å6ÕÙÅ\u0088\u0098\u0006\u0088d¸\u001a¨&ØìÈËø»éY\u0019\u0016\t69ß)\u0085Y¤JXzdja\u009a\u0097\u008aèº©«\rÛ\u007fË\u0007ûÛëí\u0098\u0006\u0088m¸\u0015¨&Ø¢È\u0093ø¶éX\u0019\u0005\t79Ä)\u0099YêJ~zdj:\u009aê\u008aøºª«PÛxË\u0010ûéëé\u001b\u009d\fL<f,\b\u0098\u0006\u0088p¸\t¨=ØîÈËø¶éY\u0019\u0011\t79Á)\u009eY¶Y\u0004I{y\u0000io\u0019ª®¶¾À\u008e¹\u009e\u008dî^þ{Î\u001cßã/½?\u008e\u000f,\u001f7o\u0014|üLÔ4\u000f$3\u0014[\u0004\u007ft dÊTýEYµG¥v\u0095\u009e\u0085Ïõâæ\u0014Ö%Æg6Ö&¢\u0016å\u0098E\u0088i¸\u0019¨\u0015ØÁÈ¡ø\u008céi\u0019\u0003\t+9Ç)ÄY¶JSÔcÄ\u0000ôjäT\u0094Ç\u0084ì´ß¥7UmE\\u\u0089eì\u0015Ï\u0006=6\u0017&HÖ¯ÆÛöÖç*\u0097\u0014Ü¡Ì\u0086üäìÝ\u009c\u0014\u008cz¼T\u00ad¿]àMÁ\u0098\u0006\u0088e¸\u000f¨1Ø¢È\u0089ø°éC\u0019\u000f\t,9À\u000fm\u001f\u000f/q?MO\u0087_ oÐ~2\u008e}\u009e]®´¾îÎÏÝ3í\u000fý\n\rü\u001d\u009f-Ð<fL\u0017\\ol´|\u009e\u008c´\u009b;«\u0005»}\u0098\u0006\u0088p¸\t¨=ØîÈËø¼éF\u0019\u0014\t19Ý)\u008cYª\u0098n\u0088o¸\u0017¨6ØëÈ\u008dø¬é^\u0098\u0006\u0088d¸\u001a¨&ØìÈËø²é_\u0019\u0012\t;9\u009c)\u009aY·JSzqj'\u009aÕ\u008aõº¸«\rÛ~Ë\u0001ûÝë©\u001bÁ\f\u0007<`,\u0015\\8L¢|\u008al·\u009dj\u008d\u0012½4\u00adÄÝ\u0084Í¶þKî8\u001e,\u000eÝ>þ.¿_LOq\u007f\u0012".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2156);
        getHighSpeedVideoSizes = cArr;
        getHighSpeedVideoFpsRanges = 4036603506895652864L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:159|(1:161)(1:328)|162|163|(1:165)(1:327)|166|167|(1:169)|170|(5:172|(1:174)(1:283)|175|176|(25:178|179|180|(1:182)|183|(1:185)(4:278|(1:280)|281|282)|186|(1:277)(5:190|(2:191|(6:193|194|(1:196)|197|198|(2:273|274)(3:200|(5:202|(1:204)|205|206|(1:208)(1:269))(2:271|272)|270))(2:275|276))|209|(1:211)(1:268)|212)|213|(1:(4:215|(6:217|218|(1:220)(1:263)|221|222|(2:225|226)(1:224))|264|265)(2:266|267))|227|228|229|230|231|232|(5:236|237|(1:239)(1:253)|240|(6:242|243|244|(0)|247|248))|255|(1:257)|258|243|244|(0)|247|248))|284|(10:287|288|(1:290)(1:320)|291|292|(1:319)(7:296|(6:298|(1:300)(1:317)|301|302|(1:304)(1:316)|305)(1:318)|310|(1:312)(1:315)|313|314|309)|307|308|309|285)|321|322|(1:324)(1:326)|325|179|180|(0)|183|(0)(0)|186|(1:188)|277|213|(2:(0)(0)|265)|227|228|229|230|231|232|(6:234|236|237|(0)(0)|240|(0))|255|(0)|258|243|244|(0)|247|248) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0330, code lost:
    
        r3 = 3;
        r5 = new java.lang.String[3];
        r6 = (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 98;
        r7 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
        r7 = (char) ((r7 ^ 21001) + ((r7 & 21001) << 1));
        r8 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
        r9 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$$ExternalSyntheticLambda11.getHighSpeedVideoSizes();
        r11 = ~r8;
        r12 = ~((r11 ^ (-12)) | (r11 & (-12)));
        r13 = ~r9;
        r14 = ~((r11 ^ r13) | (r11 & r13));
        r10 = (((r8 * 569) + 6259) - (~((((r12 & r14) | (r12 ^ r14)) | (~((r13 & (-12)) | ((-12) ^ r13)))) * (-1136)))) - 1;
        r12 = ~(r11 | r9);
        r13 = ~(((-12) ^ r9) | ((-12) & r9));
        r12 = (r12 & r13) | (r12 ^ r13);
        r13 = ~r9;
        r15 = ~(((r13 ^ r8) | (r13 & r8)) | 11);
        r12 = ((r12 ^ r15) | (r12 & r15)) * (-568);
        r15 = (r10 & r12) + (r10 | r12);
        r8 = ~((r8 & r13) | (r13 ^ r8));
        r10 = ~(r13 | 11);
        r10 = (r8 ^ r10) | (r8 & r10);
        r8 = com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.getHighResolutionOutputSizeshNQ4ISI;
        r12 = (r8 & 99) + (r8 | 99);
        com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.getOutputMinFrameDuration = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x03b6, code lost:
    
        if ((r12 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03b8, code lost:
    
        r8 = (r11 ^ (-12)) | (r11 & (-12));
        r8 = -(com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION >>> ((~((r8 & r9) | (r8 ^ r9))) | r10));
        r10 = new java.lang.Object[1];
        a(r6, r7, (r15 & r8) + (r8 | r15), r10);
        r5[0] = (java.lang.String) r10[0];
        r7 = 103 / android.view.View.combineMeasuredStates(0, 1);
        r15 = r22;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x040a, code lost:
    
        r8 = (char) android.text.TextUtils.getOffsetBefore(r15, r6);
        r9 = -android.view.View.MeasureSpec.getSize(r6);
        r11 = new java.lang.Object[1];
        a(r7, r8, (r9 & 13) + (r9 | 13), r11);
        r5[1] = (java.lang.String) r11[r6];
        r11 = new java.lang.Object[1];
        a(122 - (~(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))), (char) (58338 - (~(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))))), 17 - (~(-(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8)))), r11);
        r5[2] = (java.lang.String) r11[0];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0458, code lost:
    
        if (r6 >= r3) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x37af, code lost:
    
        r11 = (char) android.text.TextUtils.getOffsetAfter(r9, 0);
        r12 = 511 - android.text.TextUtils.indexOf(r9, r9);
        r13 = 12 - (android.view.ViewConfiguration.getTapTimeout() >> 16);
        r5 = (byte) (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.$$a[4] + 1);
        r10 = (byte) (-r5);
        r15 = new java.lang.Object[1];
        b(r5, r10, (byte) (r10 - 1), r15);
        r10 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(r11, r12, r13, 289609774, false, (java.lang.String) r15[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x045c, code lost:
    
        r9 = new java.lang.Object[]{r5[r6]};
        r10 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(144409651);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x3766, code lost:
    
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0467, code lost:
    
        if (r10 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x376d, code lost:
    
        r2 = r4 ^ 151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x3769, code lost:
    
        r3 = r21;
        r9 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0469, code lost:
    
        r10 = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
        r11 = 511 - android.widget.ExpandableListView.getPackedPositionType(0);
        r31 = 12 - android.view.KeyEvent.getDeadChar(0, 0);
        r14 = (byte) (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.$$a[4] + 1);
        r8 = new java.lang.Object[1];
        b(r14, (byte) (r14 + 1), r12[5], r8);
        r10 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(r10, r11, r31, -1784986317, false, (java.lang.String) r8[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x04ac, code lost:
    
        r9 = ((java.lang.Long) ((java.lang.reflect.Method) r10).invoke(null, r9)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x04b9, code lost:
    
        r11 = -1166020841;
        r13 = -167;
        r25 = r4;
        r29 = r5;
        r4 = -1;
        r32 = r9 ^ r4;
        r7 = new java.util.Random().nextInt(1801426174);
        r3 = (((((r13 * r11) + (r13 * r9)) + (336 * ((((r11 ^ r4) | r32) ^ r4) | ((r32 | r7) ^ r4)))) + ((-168) * (((r9 | r11) ^ r4) | ((r11 | r7) ^ r4)))) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE * (r32 | (((r7 ^ r4) | r11) ^ r4)))) + 1626142580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x055a, code lost:
    
        if (((((int) r3) & ((400673789 + (((-38830082) | r20) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) + (((~(r20 | (-670751246))) | (-173384082)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) | (((int) (r3 >> 32)) & ((((-1213434766) + ((((~((-1447057933) | r20)) | 9831521) | (~((-683025524) | r1))) * (-68))) + ((~(r20 | (-673194003))) * (-68))) + (((~(683025523 | r20)) | (-2120251935)) * 68)))) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x2874, code lost:
    
        if (((r2 & r4) | (r4 ^ r2)) != 0) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0589, code lost:
    
        r6 = r6 - 107;
        r6 = (r6 & 108) + (r6 | 108);
        r4 = r25;
        r5 = r29;
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x055c, code lost:
    
        r3 = com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.getHighResolutionOutputSizeshNQ4ISI;
        r4 = (r3 & 39) + (r3 | 39);
        com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.getOutputMinFrameDuration = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0569, code lost:
    
        if ((r4 % 2) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x056b, code lost:
    
        r4 = (r6 ^ 12086) + ((r6 & 12086) << 1);
        r4 = (r4 & r20) | ((~r4) & r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0580, code lost:
    
        r3 = r3 + 111;
        com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.getOutputMinFrameDuration = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x05a5, code lost:
    
        r3 = ((~r2) & r1) | (r2 & r20);
        r5 = -r3;
        r3 = ((r3 & r5) | (r3 ^ r5)) >> 31;
        r4 = r4 & (~r3);
        r2 = r2 & r3;
        r2 = (r2 & r4) | (r4 ^ r2);
        r3 = -(-android.text.TextUtils.lastIndexOf(r15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
        r5 = ((r3 | 142) << 1) - (r3 ^ 142);
        r3 = android.view.View.MeasureSpec.getMode(0);
        r4 = android.view.ViewConfiguration.getTouchSlop() >> 8;
        r7 = ((r4 | 14) << 1) - (r4 ^ 14);
        r4 = new java.lang.Object[1];
        a(r5, (char) (((r3 | 26510) << 1) - (r3 ^ 26510)), r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0ed5, code lost:
    
        r10 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0e1f, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0c6d, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0d48, code lost:
    
        r7 = r15;
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0707, code lost:
    
        r3 = -(-(android.view.ViewConfiguration.getTapTimeout() >> 16));
        r5 = (r3 ^ 155) + ((r3 & 155) << 1);
        r3 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
        r7 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
        r10 = (r7 ^ 24) + ((r7 & 24) << 1);
        r7 = new java.lang.Object[1];
        a(r5, (char) (((r3 | 59772) << 1) - (r3 ^ 59772)), r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x073c, code lost:
    
        r5 = new java.lang.Object[]{(java.lang.String) r7[0]};
        r6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-452611245);
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0747, code lost:
    
        if (r6 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x05e9, code lost:
    
        r3 = new java.lang.Object[]{(java.lang.String) r4[0]};
        r4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1941710546);
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0749, code lost:
    
        r6 = (char) (12707 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()));
        r7 = 287 - android.view.Gravity.getAbsoluteGravity(0, 0);
        r37 = (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18;
        r12 = (byte) (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.$$a[4] + 1);
        r4 = new java.lang.Object[1];
        b(r12, (byte) (r12 + 1), r10[5], r4);
        r6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(r6, r7, r37, 2013622867, false, (java.lang.String) r4[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0791, code lost:
    
        r5 = (java.lang.String) ((java.lang.reflect.Method) r6).invoke(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x079a, code lost:
    
        if (r5 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x07a0, code lost:
    
        if (r5.isEmpty() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x07a2, code lost:
    
        r3 = (~(r1 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE)) & (r1 | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x07ab, code lost:
    
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 179;
        r5 = (char) (34000 - (~(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))));
        r6 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1));
        r10 = new java.lang.Object[1];
        a(r4, r5, (r6 & 23) + (r6 | 23), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x07d6, code lost:
    
        r4 = new java.lang.Object[]{(java.lang.String) r10[0]};
        r5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-452611245);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x07e1, code lost:
    
        if (r5 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x07e3, code lost:
    
        r5 = (char) (12708 - android.graphics.drawable.Drawable.resolveOpacity(0, 0));
        r6 = 287 - android.text.TextUtils.indexOf(r15, r15, 0, 0);
        r37 = android.graphics.Color.red(0) + 18;
        r11 = (byte) (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.$$a[4] + 1);
        r3 = new java.lang.Object[1];
        b(r11, (byte) (r11 + 1), r7[5], r3);
        r5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(r5, r6, r37, 2013622867, false, (java.lang.String) r3[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x05f4, code lost:
    
        if (r4 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0827, code lost:
    
        r4 = (java.lang.String) ((java.lang.reflect.Method) r5).invoke(null, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0830, code lost:
    
        if (r4 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0837, code lost:
    
        if (r4.isEmpty() == true) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0839, code lost:
    
        r3 = com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.getOutputMinFrameDuration;
        r5 = ((r3 | 27) << 1) - (r3 ^ 27);
        com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.getHighResolutionOutputSizeshNQ4ISI = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0847, code lost:
    
        if ((r5 % 2) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0849, code lost:
    
        r3 = ~(r1 & 17388);
        r4 = r1 | 17388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0854, code lost:
    
        r3 = r3 & r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x084f, code lost:
    
        r3 = ~(r1 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);
        r4 = r1 | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0856, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x05f6, code lost:
    
        r4 = (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
        r5 = 511 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        r37 = 11 - android.os.Process.getGidForName(r15);
        r6 = (byte) (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.$$a[4] + 1);
        r9 = (byte) (-r6);
        r11 = new java.lang.Object[1];
        b(r6, r9, (byte) (r9 - 1), r11);
        r4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(r4, r5, r37, 289609774, false, (java.lang.String) r11[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0578, code lost:
    
        r4 = ((r6 ^ 270) + ((r6 & 270) << 1)) ^ r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0598, code lost:
    
        r25 = r4;
        r3 = com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.getOutputMinFrameDuration + 13;
        com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.getHighResolutionOutputSizeshNQ4ISI = r3 % 128;
        r3 = r3 % 2;
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x03e1, code lost:
    
        r11 = (r11 & (-12)) | (r11 ^ (-12));
        r9 = ((~((r9 & r11) | (r11 ^ r9))) | r10) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION;
        r10 = (r15 ^ r9) + ((r9 & r15) << 1);
        r9 = new java.lang.Object[1];
        a(r6, r7, r10, r9);
        r6 = 0;
        r5[0] = (java.lang.String) r9[0];
        r7 = android.view.View.combineMeasuredStates(0, 0);
        r7 = (r7 | 110) + (r7 & 110);
        r15 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x063e, code lost:
    
        r3 = ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r3)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x064b, code lost:
    
        r5 = -595639319;
        r13 = r1;
        r9 = ((860 * r5) + ((-858) * r3)) + ((-859) * (r5 | r13));
        r11 = 859;
        r8 = -1;
        r29 = r13 ^ r8;
        r3 = r3 ^ r8;
        r3 = ((r9 + ((((r29 | r5) ^ r8) | ((((r5 ^ r8) | r3) | r13) ^ r8)) * r11)) + (r11 * (((r3 | r29) ^ r8) | ((r3 | r5) ^ r8)))) + 1096018702;
        r6 = android.os.Process.myTid();
        r10 = ~((-1522567857) | r6);
        r11 = ~r6;
        r5 = ((int) (r3 >> 32)) & (((2038856378 + ((r10 | (~((-536887361) | r11))) * 920)) + ((1522567856 | (~(622228805 | r11))) * 920)) + (((~(r6 | (-536887361))) | ((~((-1522567857) | r11)) | (~(2144796661 | r6)))) * 920));
        r4 = (int) android.os.Process.getStartUptimeMillis();
        r6 = ~r4;
        r3 = ((int) r3) & (((1818984640 + (((~(r6 | (-882490303))) | (-554736108)) * (-1042))) + (((-882490303) | r4) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)) + ((((~(r4 | 554736107)) | (-899267584)) | (~(r6 | (-537958827)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x06fd, code lost:
    
        if (((r3 & r5) | (r5 ^ r3)) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x06ff, code lost:
    
        r3 = (~(r1 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE)) & (r1 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0857, code lost:
    
        r4 = ((~r2) & r1) | (r2 & r20);
        r4 = (r4 | (-r4)) >> 31;
        r3 = r3 & (~r4);
        r2 = r2 & r4;
        r2 = (r2 & r3) | (r3 ^ r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x086a, code lost:
    
        r3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1097804754);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x086e, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0870, code lost:
    
        r5 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 346;
        r37 = 2 - android.text.TextUtils.lastIndexOf(r15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        r10 = (byte) (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.$$a[4] + 1);
        r12 = new java.lang.Object[1];
        b(r10, (byte) (r10 + 1), r6[5], r12);
        r3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) - 1), r5, r37, -596645166, false, (java.lang.String) r12[0], new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x08b9, code lost:
    
        r5 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x08c6, code lost:
    
        r10 = 362396556;
        r6 = 52;
        r31 = r29 | r10;
        r37 = r5 ^ r8;
        r4 = ((((-51) * r10) + (53 * r5)) + (((r31 | r5) ^ r8) * r6)) + ((-52) * ((((r37 | r29) ^ r8) | ((r37 | r10) ^ r8)) | (r31 ^ r8)));
        r10 = r10 ^ r8;
        r4 = (r4 + (r6 * (((r10 | r5) ^ r8) | ((r10 | r29) ^ r8)))) + 86999184;
        r3 = ((int) (r4 >> 32)) & (((353354818 + ((519318897 | r20) * (-757))) + ((~((-537001993) | r1)) * 1514)) + ((((~((-917907514) | r20)) | 380905521) | (~(1056320889 | r1))) * 757));
        r4 = ((int) r4) & ((((-1719058781) + (((~(r20 | (-1092625666))) | (~((-37951565) | r1))) * (-302))) + ((~((-1092625666) | r1)) * (-604))) + (((~((-1130577230) | r1)) | 268697616) * 302));
        r3 = (r3 & r4) | (r3 ^ r4);
        r4 = 198 - (r3 ^ (-1));
        r4 = (r4 & r20) | ((~r4) & r1);
        r5 = -r3;
        r3 = ((r3 & r5) | (r3 ^ r5)) >> 31;
        r5 = (~r3) & r1;
        r3 = r3 & r4;
        r3 = (r3 & r5) | (r5 ^ r3);
        r4 = (~(r1 & r2)) & (r1 | r2);
        r5 = -r4;
        r4 = ((r4 & r5) | (r4 ^ r5)) >> 31;
        r2 = (r2 & r4) | (r3 & (~r4));
        r4 = -(-android.text.TextUtils.indexOf(r15, r15, 0, 0));
        r10 = new java.lang.Object[1];
        a(((r4 | 203) << 1) - (r4 ^ 203), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 6957), android.text.TextUtils.getTrimmedLength(r15) + 20, r10);
        r4 = (java.lang.String) r10[0];
        r5 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
        r7 = ((r5 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE) << 1) - (r5 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
        r5 = (char) ((-2) - (~(-(-(android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1))))));
        r6 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)));
        r10 = (r6 ^ 5) + ((r6 & 5) << 1);
        r6 = new java.lang.Object[1];
        a(r7, r5, r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x09e2, code lost:
    
        r4 = new java.lang.Object[]{r4, (java.lang.String) r6[0]};
        r5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1995800745);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x09ed, code lost:
    
        if (r5 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x09ef, code lost:
    
        r5 = (char) (17808 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
        r6 = 379 - android.graphics.Color.argb(0, 0, 0, 0);
        r39 = android.text.TextUtils.lastIndexOf(r15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 18;
        r7 = com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.$$a;
        r11 = (byte) (r7[4] + 1);
        r13 = new java.lang.Object[1];
        b(r11, (byte) (r11 + 1), (byte) r7.length, r13);
        r5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(r5, r6, r39, -336248407, false, (java.lang.String) r13[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0a3b, code lost:
    
        r4 = ((java.lang.Long) ((java.lang.reflect.Method) r5).invoke(null, r4)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0a48, code lost:
    
        r6 = 1081612228;
        r11 = -496;
        r13 = (r11 * r6) + (r11 * r4);
        r11 = 497;
        r23 = r6 ^ r8;
        r31 = r4 ^ r8;
        r37 = r23 | r31;
        r3 = new java.util.Random().nextInt(569459314);
        r41 = r3 ^ r8;
        r13 = (((r13 + ((r37 ^ r8) * r11)) + ((((r37 | r3) ^ r8) | (((r31 | r41) | r6) ^ r8)) * r11)) + (r11 * ((((r23 | r41) ^ r8) | ((r23 | r4) ^ r8)) | ((r3 | (r31 | r6)) ^ r8)))) + 318855816;
        r3 = ((int) (r13 >> 32)) & ((((-1019427974) + (((~(r20 | (-545361931))) | (~(r20 | 2061498975))) * (-184))) + ((((~((-2022043659) | r20)) | 1476681728) | (~(584817247 | r20))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) + 1330156080);
        r4 = ((int) r13) & (((269508597 + (((~(991029587 | r1)) | (-1866711299)) * (-668))) + ((991029587 | (~((-1866711299) | r1))) * 1336)) + (((-1145176065) | r1) * 668));
        r3 = (r3 & r4) | (r3 ^ r4);
        r5 = r20;
        r4 = (r1 & (-263)) | (r5 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
        r3 = (r3 | (-r3)) >> 31;
        r6 = (~r3) & r1;
        r3 = r3 & r4;
        r3 = (r3 & r6) | (r6 ^ r3);
        r4 = (~(r1 & r2)) & (r1 | r2);
        r6 = -r4;
        r4 = ((r4 & r6) | (r4 ^ r6)) >> 31;
        r2 = (r2 & r4) | (r3 & (~r4));
        r3 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
        r4 = ((r3 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE) << 1) - (r3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE);
        r6 = -android.graphics.Color.rgb(0, 0, 0);
        r11 = new java.lang.Object[1];
        a(r4, (char) ((r6 & (-16777216)) + (r6 | (-16777216))), 29 - (~(-(-(android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1))))), r11);
        r4 = (java.lang.String) r11[0];
        r6 = android.os.Process.myPid() >> 22;
        r7 = ((r6 | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE) << 1) - (r6 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
        r6 = (char) (android.os.Process.myTid() >> 22);
        r10 = -android.view.View.MeasureSpec.getMode(0);
        r11 = r10 * 165;
        r12 = ((r11 | (-3749)) << 1) - (r11 ^ (-3749));
        r14 = ~r1;
        r11 = ~((r14 ^ 23) | (r14 & 23));
        r11 = -(-(((r11 & r10) | (r10 ^ r11)) * (-328)));
        r13 = ((r12 | r11) << 1) - (r11 ^ r12);
        r11 = (r10 | r1) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
        r12 = (r13 & r11) + (r11 | r13);
        r11 = ~r10;
        r11 = ~((r11 & (-24)) | (r11 ^ (-24)));
        r13 = ~(((-24) ^ r1) | ((-24) & r1));
        r11 = (r11 ^ r13) | (r11 & r13);
        r10 = (r10 & r14) | (r14 ^ r10);
        r10 = ~((r10 & 23) | (r10 ^ 23));
        r10 = ((r10 & r11) | (r11 ^ r10)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
        r11 = (r12 ^ r10) + ((r10 & r12) << 1);
        r10 = new java.lang.Object[1];
        a(r7, r6, r11, r10);
        r6 = (java.lang.String) r10[0];
        r7 = -(-android.graphics.Color.argb(0, 0, 0, 0));
        r13 = new java.lang.Object[1];
        a(((r7 | 283) << 1) - (r7 ^ 283), (char) (android.text.TextUtils.indexOf(r15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), android.text.TextUtils.indexOf(r15, r15) + 28, r13);
        r7 = (java.lang.String) r13[0];
        r10 = 311 - android.graphics.Color.alpha(0);
        r11 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
        r12 = -android.view.View.MeasureSpec.getSize(0);
        r14 = new java.lang.Object[1];
        a(r10, (char) ((r11 ^ (-1)) + (r11 << 1)), (r12 & 14) + (r12 | 14), r14);
        r4 = new java.lang.String[]{r4, r6, r7, (java.lang.String) r14[0]};
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0c10, code lost:
    
        if (r6 >= 4) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0c14, code lost:
    
        r7 = new java.lang.Object[]{r4[r6]};
        r10 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(144409651);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0c1f, code lost:
    
        if (r10 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0c21, code lost:
    
        r10 = (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        r11 = android.view.KeyEvent.getDeadChar(0, 0) + 511;
        r39 = 12 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        r14 = (byte) (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.$$a[4] + 1);
        r23 = r4;
        r4 = new java.lang.Object[1];
        b(r14, (byte) (r14 + 1), r12[5], r4);
        r10 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(r10, r11, r39, -1784986317, false, (java.lang.String) r4[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0c6f, code lost:
    
        r10 = ((java.lang.Long) ((java.lang.reflect.Method) r10).invoke(null, r7)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0c7c, code lost:
    
        r12 = 25316813;
        r7 = r15;
        r14 = 193;
        r3 = (int) android.os.SystemClock.elapsedRealtime();
        r37 = r3 ^ r8;
        r39 = r12 ^ r8;
        r31 = ((r14 * r12) + (r14 * r10)) + ((-192) * (r37 | ((r39 | r10) ^ r8)));
        r41 = r10 ^ r8;
        r39 = r39 | r41;
        r37 = r41 | r37;
        r3 = ((r31 + ((-384) * ((r39 ^ r8) | (r37 ^ r8)))) + (192 * ((((r39 | r3) ^ r8) | ((r37 | r12) ^ r8)) | ((r3 | (r10 | r12)) ^ r8)))) + 434804926;
        r10 = ((int) (r3 >> 32)) & ((((-1766100526) + ((((~(6930743 | r1)) | 1444157120) | (~((-6930710) | r5))) * 886)) + (((~((-6930744) | r5)) | 1444157154) * (-1772))) + ((~(r5 | 1444157154)) * 886));
        r4 = android.os.Process.myPid();
        r11 = ~r4;
        r3 = ((int) r3) & (((1697417447 + (((~(1410449230 | r11)) | 37896193) * (-108))) + (((~(r11 | 1447291655)) | ((~((-1447291656) | r4)) | 1053768)) * 54)) + ((r4 | 1053768) * 54));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0d2b, code lost:
    
        if (((r3 & r10) | (r10 ^ r3)) == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0d39, code lost:
    
        r6 = r6 + 97;
        r6 = ((r6 | (-96)) << 1) - (r6 ^ (-96));
        r15 = r7;
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0d2d, code lost:
    
        r3 = ((r6 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) << 1) - (r6 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        r3 = (r3 & r5) | ((~r3) & r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0d4a, code lost:
    
        r4 = ((~r2) & r1) | (r2 & r5);
        r4 = (r4 | (-r4)) >> 31;
        r2 = (r2 & r4) | (r3 & (~r4));
        r3 = -(-android.text.TextUtils.indexOf(r7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
        r11 = new java.lang.Object[1];
        a(((r3 | 326) << 1) - (r3 ^ 326), (char) (19539 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 13 - (~(-(-((byte) android.view.KeyEvent.getModifierMetaStateMask())))), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0d85, code lost:
    
        r4 = new java.lang.Object[]{(java.lang.String) r11[0]};
        r6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-452611245);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0d90, code lost:
    
        if (r6 != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0d92, code lost:
    
        r6 = (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12708);
        r10 = 288 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1));
        r39 = (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 18;
        r13 = (byte) (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4.$$a[4] + 1);
        r15 = new java.lang.Object[1];
        b(r13, (byte) (r13 + 1), r11[5], r15);
        r6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(r6, r10, r39, 2013622867, false, (java.lang.String) r15[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0ddd, code lost:
    
        r4 = (java.lang.String) ((java.lang.reflect.Method) r6).invoke(null, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0de6, code lost:
    
        if (r4 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0de8, code lost:
    
        r6 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
        r10 = (r6 & 339) + (r6 | 339);
        r6 = (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
        r11 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
        r12 = (r11 ^ 9) + ((r11 & 9) << 1);
        r11 = new java.lang.Object[1];
        a(r10, r6, r12, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0e17, code lost:
    
        if (r4.contains((java.lang.String) r11[0]) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0e19, code lost:
    
        r4 = (r1 & (-251)) | (r5 & 250);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0e20, code lost:
    
        r6 = ((~r2) & r1) | (r2 & r5);
        r10 = -r6;
        r6 = ((r6 & r10) | (r6 ^ r10)) >> 31;
        r4 = r4 & (~r6);
        r2 = r2 & r6;
        r2 = (r2 & r4) | (r4 ^ r2);
        r4 = 346 - ((byte) android.view.KeyEvent.getModifierMetaStateMask());
        r10 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        r11 = new java.lang.Object[1];
        a(r4, (char) (((r10 | 49089) << 1) - (49089 ^ r10)), 17 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), r11);
        r4 = (java.lang.String) r11[0];
        r6 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
        r13 = new java.lang.Object[1];
        a(((r6 | 364) << 1) - (r6 ^ 364), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.View.MeasureSpec.getSize(0) + 6, r13);
        r6 = (java.lang.String) r13[0];
        r10 = new java.io.File(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0e8c, code lost:
    
        if ((!r10.exists()) == true) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0e92, code lost:
    
        if (r10.isFile() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0e94, code lost:
    
        r4 = new java.util.Scanner(new java.io.FileInputStream(r10));
        r11 = android.text.TextUtils.indexOf(r7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        r3 = ((r11 | 371) << 1) - (r11 ^ 371);
        r11 = (char) android.text.TextUtils.getCapsMode(r7, 0, 0);
        r12 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
        r13 = (r12 & 1) + (r12 | 1);
        r12 = new java.lang.Object[1];
        a(r3, r11, r13, r12);
        r4 = r4.useDelimiter((java.lang.String) r12[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0ece, code lost:
    
        if (r4.hasNext() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0ed0, code lost:
    
        r10 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0ed6, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0edd, code lost:
    
        if (r10.contains(r6) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0edf, code lost:
    
        r4 = (r1 & (-252)) | (r5 & 251);
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x13e1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x163c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x168f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x182e A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:412:0x01b5, B:414:0x01c2, B:415:0x0201, B:8:0x0216, B:10:0x0223, B:11:0x0262, B:24:0x045c, B:26:0x0469, B:27:0x04ac, B:37:0x05e9, B:39:0x05f6, B:40:0x063e, B:45:0x086a, B:47:0x0870, B:48:0x08b9, B:50:0x09e2, B:52:0x09ef, B:53:0x0a3b, B:58:0x0c14, B:60:0x0c21, B:61:0x0c6f, B:68:0x0d85, B:70:0x0d92, B:71:0x0ddd, B:88:0x0f21, B:90:0x0f2e, B:91:0x0f76, B:98:0x10e7, B:100:0x10f4, B:101:0x1145, B:110:0x11ec, B:112:0x11f9, B:113:0x1242, B:123:0x145e, B:125:0x146b, B:126:0x14b7, B:143:0x1691, B:145:0x169e, B:146:0x16e8, B:154:0x1828, B:156:0x182e, B:157:0x1871, B:159:0x1919, B:161:0x192b, B:162:0x197e, B:167:0x1a63, B:169:0x1a70, B:170:0x1ab9, B:172:0x1ac2, B:174:0x1ada, B:175:0x1b29, B:180:0x29c9, B:182:0x29d6, B:183:0x2a1d, B:194:0x2f86, B:196:0x2f93, B:197:0x2fd5, B:218:0x34dd, B:220:0x34ea, B:221:0x354f, B:244:0x37a2, B:246:0x37af, B:247:0x37ec, B:202:0x30ab, B:204:0x30b8, B:205:0x30ff, B:278:0x2a2d, B:280:0x2a45, B:281:0x2a95, B:288:0x26c7, B:290:0x26d4, B:291:0x2732, B:298:0x2750, B:300:0x275d, B:301:0x27af, B:378:0x073c, B:380:0x0749, B:381:0x0791, B:387:0x07d6, B:389:0x07e3, B:390:0x0827), top: B:7:0x0216 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x1919 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:412:0x01b5, B:414:0x01c2, B:415:0x0201, B:8:0x0216, B:10:0x0223, B:11:0x0262, B:24:0x045c, B:26:0x0469, B:27:0x04ac, B:37:0x05e9, B:39:0x05f6, B:40:0x063e, B:45:0x086a, B:47:0x0870, B:48:0x08b9, B:50:0x09e2, B:52:0x09ef, B:53:0x0a3b, B:58:0x0c14, B:60:0x0c21, B:61:0x0c6f, B:68:0x0d85, B:70:0x0d92, B:71:0x0ddd, B:88:0x0f21, B:90:0x0f2e, B:91:0x0f76, B:98:0x10e7, B:100:0x10f4, B:101:0x1145, B:110:0x11ec, B:112:0x11f9, B:113:0x1242, B:123:0x145e, B:125:0x146b, B:126:0x14b7, B:143:0x1691, B:145:0x169e, B:146:0x16e8, B:154:0x1828, B:156:0x182e, B:157:0x1871, B:159:0x1919, B:161:0x192b, B:162:0x197e, B:167:0x1a63, B:169:0x1a70, B:170:0x1ab9, B:172:0x1ac2, B:174:0x1ada, B:175:0x1b29, B:180:0x29c9, B:182:0x29d6, B:183:0x2a1d, B:194:0x2f86, B:196:0x2f93, B:197:0x2fd5, B:218:0x34dd, B:220:0x34ea, B:221:0x354f, B:244:0x37a2, B:246:0x37af, B:247:0x37ec, B:202:0x30ab, B:204:0x30b8, B:205:0x30ff, B:278:0x2a2d, B:280:0x2a45, B:281:0x2a95, B:288:0x26c7, B:290:0x26d4, B:291:0x2732, B:298:0x2750, B:300:0x275d, B:301:0x27af, B:378:0x073c, B:380:0x0749, B:381:0x0791, B:387:0x07d6, B:389:0x07e3, B:390:0x0827), top: B:7:0x0216 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x29d6 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:412:0x01b5, B:414:0x01c2, B:415:0x0201, B:8:0x0216, B:10:0x0223, B:11:0x0262, B:24:0x045c, B:26:0x0469, B:27:0x04ac, B:37:0x05e9, B:39:0x05f6, B:40:0x063e, B:45:0x086a, B:47:0x0870, B:48:0x08b9, B:50:0x09e2, B:52:0x09ef, B:53:0x0a3b, B:58:0x0c14, B:60:0x0c21, B:61:0x0c6f, B:68:0x0d85, B:70:0x0d92, B:71:0x0ddd, B:88:0x0f21, B:90:0x0f2e, B:91:0x0f76, B:98:0x10e7, B:100:0x10f4, B:101:0x1145, B:110:0x11ec, B:112:0x11f9, B:113:0x1242, B:123:0x145e, B:125:0x146b, B:126:0x14b7, B:143:0x1691, B:145:0x169e, B:146:0x16e8, B:154:0x1828, B:156:0x182e, B:157:0x1871, B:159:0x1919, B:161:0x192b, B:162:0x197e, B:167:0x1a63, B:169:0x1a70, B:170:0x1ab9, B:172:0x1ac2, B:174:0x1ada, B:175:0x1b29, B:180:0x29c9, B:182:0x29d6, B:183:0x2a1d, B:194:0x2f86, B:196:0x2f93, B:197:0x2fd5, B:218:0x34dd, B:220:0x34ea, B:221:0x354f, B:244:0x37a2, B:246:0x37af, B:247:0x37ec, B:202:0x30ab, B:204:0x30b8, B:205:0x30ff, B:278:0x2a2d, B:280:0x2a45, B:281:0x2a95, B:288:0x26c7, B:290:0x26d4, B:291:0x2732, B:298:0x2750, B:300:0x275d, B:301:0x27af, B:378:0x073c, B:380:0x0749, B:381:0x0791, B:387:0x07d6, B:389:0x07e3, B:390:0x0827), top: B:7:0x0216 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x2a26  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x34c9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x3724 A[Catch: IOException -> 0x374f, Exception -> 0x3766, TryCatch #2 {Exception -> 0x3766, blocks: (B:232:0x36ac, B:234:0x36e1, B:237:0x36e7, B:239:0x3724, B:240:0x372a), top: B:231:0x36ac }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x3733  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x37af A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:412:0x01b5, B:414:0x01c2, B:415:0x0201, B:8:0x0216, B:10:0x0223, B:11:0x0262, B:24:0x045c, B:26:0x0469, B:27:0x04ac, B:37:0x05e9, B:39:0x05f6, B:40:0x063e, B:45:0x086a, B:47:0x0870, B:48:0x08b9, B:50:0x09e2, B:52:0x09ef, B:53:0x0a3b, B:58:0x0c14, B:60:0x0c21, B:61:0x0c6f, B:68:0x0d85, B:70:0x0d92, B:71:0x0ddd, B:88:0x0f21, B:90:0x0f2e, B:91:0x0f76, B:98:0x10e7, B:100:0x10f4, B:101:0x1145, B:110:0x11ec, B:112:0x11f9, B:113:0x1242, B:123:0x145e, B:125:0x146b, B:126:0x14b7, B:143:0x1691, B:145:0x169e, B:146:0x16e8, B:154:0x1828, B:156:0x182e, B:157:0x1871, B:159:0x1919, B:161:0x192b, B:162:0x197e, B:167:0x1a63, B:169:0x1a70, B:170:0x1ab9, B:172:0x1ac2, B:174:0x1ada, B:175:0x1b29, B:180:0x29c9, B:182:0x29d6, B:183:0x2a1d, B:194:0x2f86, B:196:0x2f93, B:197:0x2fd5, B:218:0x34dd, B:220:0x34ea, B:221:0x354f, B:244:0x37a2, B:246:0x37af, B:247:0x37ec, B:202:0x30ab, B:204:0x30b8, B:205:0x30ff, B:278:0x2a2d, B:280:0x2a45, B:281:0x2a95, B:288:0x26c7, B:290:0x26d4, B:291:0x2732, B:298:0x2750, B:300:0x275d, B:301:0x27af, B:378:0x073c, B:380:0x0749, B:381:0x0791, B:387:0x07d6, B:389:0x07e3, B:390:0x0827), top: B:7:0x0216 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x3729  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x3760  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x3661 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x2a2d A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:412:0x01b5, B:414:0x01c2, B:415:0x0201, B:8:0x0216, B:10:0x0223, B:11:0x0262, B:24:0x045c, B:26:0x0469, B:27:0x04ac, B:37:0x05e9, B:39:0x05f6, B:40:0x063e, B:45:0x086a, B:47:0x0870, B:48:0x08b9, B:50:0x09e2, B:52:0x09ef, B:53:0x0a3b, B:58:0x0c14, B:60:0x0c21, B:61:0x0c6f, B:68:0x0d85, B:70:0x0d92, B:71:0x0ddd, B:88:0x0f21, B:90:0x0f2e, B:91:0x0f76, B:98:0x10e7, B:100:0x10f4, B:101:0x1145, B:110:0x11ec, B:112:0x11f9, B:113:0x1242, B:123:0x145e, B:125:0x146b, B:126:0x14b7, B:143:0x1691, B:145:0x169e, B:146:0x16e8, B:154:0x1828, B:156:0x182e, B:157:0x1871, B:159:0x1919, B:161:0x192b, B:162:0x197e, B:167:0x1a63, B:169:0x1a70, B:170:0x1ab9, B:172:0x1ac2, B:174:0x1ada, B:175:0x1b29, B:180:0x29c9, B:182:0x29d6, B:183:0x2a1d, B:194:0x2f86, B:196:0x2f93, B:197:0x2fd5, B:218:0x34dd, B:220:0x34ea, B:221:0x354f, B:244:0x37a2, B:246:0x37af, B:247:0x37ec, B:202:0x30ab, B:204:0x30b8, B:205:0x30ff, B:278:0x2a2d, B:280:0x2a45, B:281:0x2a95, B:288:0x26c7, B:290:0x26d4, B:291:0x2732, B:298:0x2750, B:300:0x275d, B:301:0x27af, B:378:0x073c, B:380:0x0749, B:381:0x0791, B:387:0x07d6, B:389:0x07e3, B:390:0x0827), top: B:7:0x0216 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x38b7  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x165e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] Camera2StreamConfigurationMap(android.content.Context context, int i, int i2, int i3) {
        java.lang.String str;
        int i4;
        int i5;
        java.lang.String str2;
        long j;
        long j2;
        long j3;
        int i6;
        int i7;
        java.lang.String str3;
        int i8;
        int i9;
        int i10;
        int red;
        int i11;
        int i12;
        int i13;
        int i14;
        char packedPositionType;
        int keyRepeatTimeout;
        int i15;
        int i16;
        int i17;
        java.lang.String str4;
        int i18;
        int i19;
        int i20;
        java.lang.Object Camera2StreamConfigurationMap;
        long j4;
        int i21;
        java.lang.String[] strArr;
        long j5;
        long j6;
        int i22;
        java.lang.String str5;
        int i23;
        int i24;
        int i25;
        java.lang.String[] strArr2;
        int i26;
        java.lang.String[][] strArr3;
        java.lang.StringBuilder sb;
        int i27;
        int i28;
        int i29;
        java.lang.StringBuilder sb2;
        java.lang.String str6;
        int i30;
        int i31;
        java.lang.Object Camera2StreamConfigurationMap2;
        java.lang.Object invoke;
        int i32;
        java.lang.String[] strArr4;
        int i33;
        java.lang.String str7;
        int i34;
        char c;
        java.lang.String[][] strArr5;
        int i35;
        int i36;
        int i37;
        java.lang.String str8;
        int i38;
        java.lang.String str9;
        int i39;
        java.lang.Object Camera2StreamConfigurationMap3;
        java.lang.String str10;
        java.io.File file;
        int i40;
        java.lang.String next;
        java.lang.String[][] strArr6;
        java.lang.String[] strArr7;
        java.lang.String str11;
        int i41;
        int i42;
        java.lang.String[] strArr8;
        int i43;
        java.lang.String[] strArr9;
        java.lang.String[] strArr10;
        int i44 = i;
        int i45 = 2;
        int i46 = 2 % 2;
        java.lang.String str12 = "";
        int indexOf = android.text.TextUtils.indexOf("", "") + 910;
        int i47 = 0;
        int rgb = android.graphics.Color.rgb(0, 0, 0);
        int i48 = 1;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(indexOf, (char) ((rgb ^ 16789648) + ((rgb & 16789648) << 1)), 8 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        java.lang.String str13 = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((-2) - ((-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) ^ (-1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 26 - (~(-android.graphics.Color.alpha(0))), objArr2);
        java.lang.String str14 = (java.lang.String) objArr2[0];
        int i49 = -android.graphics.Color.red(0);
        int highSpeedVideoSizes = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$$ExternalSyntheticLambda11.getHighSpeedVideoSizes();
        int i50 = (i49 * (-381)) + 5184;
        int i51 = -(-((~i49) * (-191)));
        int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
        int i53 = ~((highSpeedVideoSizes ^ 27) | (highSpeedVideoSizes & 27));
        int i54 = -(-(((i53 & i49) | (i49 ^ i53)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
        int i55 = (i52 & i54) + (i54 | i52);
        int i56 = ~((~i49) | 27);
        int i57 = ~highSpeedVideoSizes;
        int i58 = (i56 | (~((i57 & 27) | (i57 ^ 27)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
        int i59 = ((i55 | i58) << 1) - (i58 ^ i55);
        int i60 = -android.widget.ExpandableListView.getPackedPositionType(0L);
        int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
        int highSpeedVideoSizes2 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$$ExternalSyntheticLambda11.getHighSpeedVideoSizes();
        int i61 = scrollBarFadeDuration * 471;
        int i62 = ((i61 | 11775) << 1) - (i61 ^ 11775);
        int i63 = -(-(((scrollBarFadeDuration ^ 25) | (scrollBarFadeDuration & 25)) * (-470)));
        int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
        int i65 = ~scrollBarFadeDuration;
        int i66 = ~((i65 & (-26)) | (i65 ^ (-26)));
        int i67 = ~(((-26) ^ highSpeedVideoSizes2) | ((-26) & highSpeedVideoSizes2));
        int i68 = (i66 ^ i67) | (i66 & i67);
        int i69 = ~highSpeedVideoSizes2;
        int i70 = (i69 ^ scrollBarFadeDuration) | (i69 & scrollBarFadeDuration);
        int i71 = ~(i70 | 25);
        int i72 = (scrollBarFadeDuration & (-26)) | ((-26) ^ scrollBarFadeDuration);
        int i73 = ~((i72 & highSpeedVideoSizes2) | (i72 ^ highSpeedVideoSizes2));
        int i74 = ~((i70 ^ 25) | (i70 & 25));
        int i75 = i64 + (((i68 ^ i71) | (i68 & i71)) * (-470)) + (((i73 & i74) | (i73 ^ i74)) * 470);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(i59, (char) (((i60 | 45961) << 1) - (i60 ^ 45961)), i75, objArr3);
        java.lang.String str15 = (java.lang.String) objArr3[0];
        int i76 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
        int i77 = i76 * (-375);
        int i78 = (i77 ^ (-19875)) + ((i77 & (-19875)) << 1);
        int i79 = ~i76;
        int i80 = (~((i79 & (-54)) | (i79 ^ (-54)))) | i44;
        int i81 = ~((i76 ^ 53) | (i76 & 53));
        int i82 = ((i80 & i81) | (i80 ^ i81)) * 376;
        int i83 = ((i78 | i82) << 1) - (i82 ^ i78);
        int i84 = ~i44;
        int i85 = ~((i84 ^ i76) | (i84 & i76));
        int i86 = (i83 - (~(((i85 & i81) | (i85 ^ i81)) * (-376)))) - 1;
        int i87 = ~i76;
        int i88 = ~((i87 & i44) | (i87 ^ i44));
        int i89 = i86 + (((i88 & 53) | (i88 ^ 53)) * 376);
        int i90 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(i89, (char) ((i90 ^ 1) + ((i90 & 1) << 1)), 17 - (~(-(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16)))), objArr4);
        java.lang.String str16 = (java.lang.String) objArr4[0];
        int i91 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
        int i92 = (i91 & 70) + (i91 | 70);
        char c2 = (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        int i93 = -(-android.os.Process.getGidForName(""));
        int i94 = (i93 ^ 29) + ((i93 & 29) << 1);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(i92, c2, i94, objArr5);
        java.lang.String[] strArr11 = {str14, str15, str16, (java.lang.String) objArr5[0]};
        int i95 = 0;
        while (true) {
            java.lang.Object obj = null;
            if (i95 >= 4) {
                str = str12;
                i4 = i84;
                i5 = i44;
                break;
            }
            int i96 = getOutputMinFrameDuration;
            int i97 = (i96 ^ 89) + ((i96 & 89) << i48);
            getHighResolutionOutputSizeshNQ4ISI = i97 % 128;
            if (i97 % i45 != 0) {
                java.lang.Object[] objArr6 = {strArr11[i95]};
                java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(355760564);
                if (Camera2StreamConfigurationMap4 == null) {
                    char mirror = (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                    int argb = android.graphics.Color.argb(i47, i47, i47, i47) + 511;
                    int i98 = 13 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte[] bArr = $$a;
                    byte b = (byte) (bArr[4] + i48);
                    java.lang.Object[] objArr7 = new java.lang.Object[i48];
                    b(b, (byte) (b + 1), (byte) bArr.length, objArr7);
                    java.lang.String str17 = (java.lang.String) objArr7[i47];
                    java.lang.Class[] clsArr = new java.lang.Class[i48];
                    clsArr[i47] = java.lang.String.class;
                    Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(mirror, argb, i98, -2009810764, false, str17, clsArr);
                }
                ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap4).invoke(null, objArr6)).longValue();
                obj.hashCode();
                throw null;
            }
            try {
                java.lang.Object[] objArr8 = {strArr11[i95]};
                java.lang.Object Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(355760564);
                if (Camera2StreamConfigurationMap5 == null) {
                    char mode = (char) android.view.View.MeasureSpec.getMode(i47);
                    int resolveSize = android.view.View.resolveSize(i47, i47) + 511;
                    int minimumFlingVelocity = 12 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte[] bArr2 = $$a;
                    byte b2 = (byte) (bArr2[4] + 1);
                    java.lang.Object[] objArr9 = new java.lang.Object[i48];
                    b(b2, (byte) (b2 + 1), (byte) bArr2.length, objArr9);
                    java.lang.String str18 = (java.lang.String) objArr9[i47];
                    java.lang.Class[] clsArr2 = new java.lang.Class[i48];
                    clsArr2[i47] = java.lang.String.class;
                    Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(mode, resolveSize, minimumFlingVelocity, -2009810764, false, str18, clsArr2);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap5).invoke(null, objArr8)).longValue();
                long j7 = 747830119;
                java.lang.String[] strArr12 = strArr11;
                i4 = i84;
                long j8 = -397;
                str = str12;
                long j9 = -1;
                long j10 = j7 ^ j9;
                long startElapsedRealtime = (int) android.os.Process.getStartElapsedRealtime();
                long j11 = startElapsedRealtime ^ j9;
                long j12 = (j10 | j11) ^ j9;
                long j13 = (j10 | longValue) ^ j9;
                long j14 = (398 * j7) + ((-396) * longValue) + ((j12 | j13 | ((j11 | longValue) ^ j9)) * j8) + (j8 * j13) + (397 * ((j9 ^ ((longValue ^ j9) | j7)) | startElapsedRealtime | j13)) + 459991183;
                int i99 = 435863208 + (((~(i4 | 1325615809)) | 10747944) * (-1188));
                int i100 = 10747944 | (~((-1325615810) | i44));
                int i101 = ~(i4 | 111610601);
                int i102 = ((int) (j14 >> 32)) & (i99 + ((i100 | i101) * 594) + (((~((-1325615810) | i4)) | 1224753152 | i101) * 594));
                int myUid = android.os.Process.myUid();
                int i103 = ((int) j14) & (((~((~myUid) | (-1426096130))) * 130) + 1969358803 + (((~(myUid | (-1426096130))) | 1380608) * 130));
                if (((i102 & i103) | (i102 ^ i103)) != 0) {
                    i5 = i44 ^ (i95 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                    break;
                }
                int i104 = (i95 & (-117)) + (i95 | (-117));
                i95 = (i104 & 118) + (i104 | 118);
                i84 = i4;
                str12 = str;
                strArr11 = strArr12;
                i45 = 2;
                i47 = 0;
                i48 = 1;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i105 = i44;
        int i106 = ((~i8) & i44) | (i8 & i6);
        int i107 = -i106;
        int i108 = ((i106 & i107) | (i106 ^ i107)) >> 31;
        int i109 = i105 & (~i108);
        int i110 = i8 & i108;
        int i111 = (i110 & i109) | (i109 ^ i110);
        int i112 = 370 - (~(-android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
        char c3 = (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15858);
        int i113 = -android.view.View.getDefaultSize(0, 0);
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a(i112, c3, (i113 & 23) + (i113 | 23), objArr10);
        java.lang.Object[] objArr11 = {(java.lang.String) objArr10[0]};
        java.lang.Object Camera2StreamConfigurationMap6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-452611245);
        if (Camera2StreamConfigurationMap6 == null) {
            char c4 = (char) (12708 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            int trimmedLength = android.text.TextUtils.getTrimmedLength(str3) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE;
            int i114 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18;
            byte b3 = (byte) ($$a[4] + 1);
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            b(b3, (byte) (b3 + 1), r10[5], objArr12);
            Camera2StreamConfigurationMap6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c4, trimmedLength, i114, 2013622867, false, (java.lang.String) objArr12[0], new java.lang.Class[]{java.lang.String.class});
        }
        java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) Camera2StreamConfigurationMap6).invoke(null, objArr11)).toLowerCase();
        int i115 = 395 - (~android.view.MotionEvent.axisFromString(str3));
        int i116 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a(i115, (char) ((i116 & 38362) + (i116 | 38362)), android.graphics.Color.blue(0) + 4, objArr13);
        int i117 = lowerCase.contains((java.lang.String) objArr13[0]) ? (i44 & (-265)) | (i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE) : i44;
        int i118 = ((~i111) & i44) | (i111 & i6);
        int i119 = -i118;
        int i120 = ((i118 & i119) | (i118 ^ i119)) >> 31;
        int i121 = i117 & (~i120);
        int i122 = i111 & i120;
        int i123 = (i122 & i121) | (i121 ^ i122);
        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L) + 400;
        int i124 = -android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        int i125 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        int i126 = ((i125 | 41) << 1) - (i125 ^ 41);
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a(packedPositionChild, (char) ((i124 & 45405) + (i124 | 45405)), i126, objArr14);
        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L) + 441;
        char c5 = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        int i127 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
        int i128 = ((i127 | 40) << 1) - (i127 ^ 40);
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        a(packedPositionGroup, c5, i128, objArr15);
        int i129 = -android.view.View.getDefaultSize(0, 0);
        int i130 = ((i129 | 481) << 1) - (i129 ^ 481);
        char edgeSlop = (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
        int indexOf2 = android.text.TextUtils.indexOf(str3, str3, 0);
        int i131 = (indexOf2 ^ 27) + ((indexOf2 & 27) << 1);
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        a(i130, edgeSlop, i131, objArr16);
        int i132 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int i133 = (i132 ^ 556) + ((i132 & 556) << 1);
        char touchSlop = (char) (android.view.ViewConfiguration.getTouchSlop() >> 8);
        int i134 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
        int i135 = ((i134 | 27) << 1) - (i134 ^ 27);
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        a(i133, touchSlop, i135, objArr17);
        int i136 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
        int i137 = ((i136 | 535) << 1) - (i136 ^ 535);
        int i138 = getOutputMinFrameDuration;
        int i139 = ((i138 | 97) << 1) - (i138 ^ 97);
        getHighResolutionOutputSizeshNQ4ISI = i139 % 128;
        int i140 = i139 % 2;
        char absoluteGravity = (char) android.view.Gravity.getAbsoluteGravity(0, 0);
        int i141 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
        int i142 = ((i141 | 27) << 1) - (i141 ^ 27);
        java.lang.Object[] objArr18 = new java.lang.Object[1];
        a(i137, absoluteGravity, i142, objArr18);
        int i143 = -(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
        java.lang.Object[] objArr19 = new java.lang.Object[1];
        a((i143 & 562) + (i143 | 562), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))), objArr19);
        java.lang.String[] strArr13 = {(java.lang.String) objArr14[0], (java.lang.String) objArr15[0], (java.lang.String) objArr16[0], (java.lang.String) objArr17[0], (java.lang.String) objArr18[0], (java.lang.String) objArr19[0]};
        int i144 = 0;
        for (int i145 = 6; i144 < i145; i145 = 6) {
            java.lang.Object[] objArr20 = {strArr13[i144]};
            java.lang.Object Camera2StreamConfigurationMap7 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-452611245);
            if (Camera2StreamConfigurationMap7 == null) {
                char lastIndexOf = (char) (android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 12709);
                int jumpTapTimeout = (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE;
                int maxKeyCode = (android.view.KeyEvent.getMaxKeyCode() >> 16) + 18;
                byte b4 = (byte) ($$a[4] + 1);
                strArr10 = strArr13;
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                b(b4, (byte) (b4 + 1), r14[5], objArr21);
                Camera2StreamConfigurationMap7 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(lastIndexOf, jumpTapTimeout, maxKeyCode, 2013622867, false, (java.lang.String) objArr21[0], new java.lang.Class[]{java.lang.String.class});
            } else {
                strArr10 = strArr13;
            }
            java.lang.String str19 = (java.lang.String) ((java.lang.reflect.Method) Camera2StreamConfigurationMap7).invoke(null, objArr20);
            if (str19 != null) {
                int i146 = getOutputMinFrameDuration;
                int i147 = (i146 ^ 49) + ((i146 & 49) << 1);
                getHighResolutionOutputSizeshNQ4ISI = i147 % 128;
                int i148 = i147 % 2;
                boolean isEmpty = str19.isEmpty();
                if (i148 == 0) {
                    if (!isEmpty) {
                        i9 = (~(i44 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE)) & (i44 | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE);
                        break;
                    }
                } else {
                    int i149 = 53 / 0;
                    if (!isEmpty) {
                        i9 = (~(i44 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE)) & (i44 | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE);
                        break;
                    }
                }
            }
            i144 = (i144 & 1) + (i144 | 1);
            strArr13 = strArr10;
        }
        i9 = i44;
        int i150 = ((~i123) & i44) | (i123 & i6);
        int i151 = -i150;
        int i152 = ((i150 & i151) | (i150 ^ i151)) >> 31;
        int i153 = i9 & (~i152);
        int i154 = i123 & i152;
        int i155 = (i154 & i153) | (i153 ^ i154);
        int longPressTimeout = 347 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
        int i156 = -(-android.graphics.Color.rgb(0, 0, 0));
        int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
        int i157 = (maximumFlingVelocity ^ 17) + ((maximumFlingVelocity & 17) << 1);
        java.lang.Object[] objArr22 = new java.lang.Object[1];
        a(longPressTimeout, (char) ((i156 ^ 16826305) + ((i156 & 16826305) << 1)), i157, objArr22);
        java.lang.String str20 = (java.lang.String) objArr22[0];
        int blue = android.graphics.Color.blue(0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED;
        char c6 = (char) (3429 - (~(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))));
        int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
        int i158 = ((pressedStateDuration | 6) << 1) - (pressedStateDuration ^ 6);
        java.lang.Object[] objArr23 = new java.lang.Object[1];
        a(blue, c6, i158, objArr23);
        java.lang.Object[] objArr24 = {str20, (java.lang.String) objArr23[0]};
        java.lang.Object Camera2StreamConfigurationMap8 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1995800745);
        if (Camera2StreamConfigurationMap8 == null) {
            char indexOf3 = (char) (android.text.TextUtils.indexOf(str3, str3, 0) + 17808);
            int touchSlop2 = 379 - (android.view.ViewConfiguration.getTouchSlop() >> 8);
            int green = 17 - android.graphics.Color.green(0);
            byte[] bArr3 = $$a;
            byte b5 = (byte) (bArr3[4] + 1);
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            b(b5, (byte) (b5 + 1), (byte) bArr3.length, objArr25);
            Camera2StreamConfigurationMap8 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(indexOf3, touchSlop2, green, -336248407, false, (java.lang.String) objArr25[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
        }
        long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap8).invoke(null, objArr24)).longValue();
        long j15 = 342626834;
        long j16 = -919;
        long j17 = (j16 * j15) + (j16 * longValue2);
        long j18 = 920;
        long j19 = j15 ^ j2;
        long j20 = longValue2 ^ j2;
        long j21 = j19 | j20;
        long myTid = android.os.Process.myTid();
        long j22 = myTid ^ j2;
        long j23 = j17 + ((((j21 | myTid) ^ j2) | (((j20 | j22) | j15) ^ j2)) * j18) + (((j21 ^ j2) | ((j19 | j22) ^ j2)) * j18) + (j18 * (((myTid | (j20 | j15)) ^ j2) | ((j21 | j22) ^ j2) | (((j19 | longValue2) | myTid) ^ j2))) + 1057841210;
        int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
        int i159 = ~uptimeMillis;
        int i160 = ((int) (j23 >> 32)) & ((-233757702) + (((~((-1094949064) | i159)) | 4294722) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + ((uptimeMillis | 672137480) * (-184)) + ((~(1762791821 | i159)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
        int myUid2 = android.os.Process.myUid();
        int i161 = ~(1178321363 | (~myUid2));
        int i162 = ((int) j23) & (((1074872321 | i161 | (~((-1178321364) | myUid2))) * (-338)) + 1092365223 + (((~(myUid2 | (-103449043))) | i161) * 338));
        if (((i162 & i160) | (i160 ^ i162)) != 0) {
            i12 = (i44 & (-261)) | (i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
        } else {
            byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
            int i163 = -android.graphics.Color.red(0);
            int i164 = -android.graphics.Color.rgb(0, 0, 0);
            int i165 = ((i164 | (-16777203)) << 1) - (i164 ^ (-16777203));
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            a((modifierMetaStateMask & 596) + (modifierMetaStateMask | 596), (char) ((i163 ^ 24) + ((i163 & 24) << 1)), i165, objArr26);
            java.lang.String str21 = (java.lang.String) objArr26[0];
            int i166 = getOutputMinFrameDuration + 95;
            getHighResolutionOutputSizeshNQ4ISI = i166 % 128;
            if (i166 % 2 != 0) {
                i10 = androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH >> android.text.TextUtils.getCapsMode(str3, 1, 1);
                red = android.graphics.Color.red(0);
                i11 = 4182;
            } else {
                int i167 = -android.text.TextUtils.getCapsMode(str3, 0, 0);
                i10 = ((i167 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH) << 1) - (i167 ^ androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH);
                red = android.graphics.Color.red(0);
                i11 = 16538;
            }
            char c7 = (char) (i11 + red);
            int i168 = -(-android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            a(i10, c7, (i168 & 10) + (i168 | 10), objArr27);
            java.lang.String str22 = (java.lang.String) objArr27[0];
            java.io.File file2 = new java.io.File(str21);
            if (file2.exists() && file2.isFile()) {
                try {
                    java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file2));
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    a(369 - (~(-(-android.view.View.MeasureSpec.getMode(0)))), (char) android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.getOffsetBefore(str3, 0) + 2, objArr28);
                    java.util.Scanner useDelimiter = scanner.useDelimiter((java.lang.String) objArr28[0]);
                    java.lang.String next2 = useDelimiter.hasNext() ? useDelimiter.next() : str3;
                    useDelimiter.close();
                    if (next2.contains(str22)) {
                        i12 = (i44 & (-262)) | (i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
                    }
                } catch (java.io.IOException unused) {
                }
            }
            i12 = i44;
        }
        int i169 = (~(i44 & i155)) & (i44 | i155);
        int i170 = (i169 | (-i169)) >> 31;
        int i171 = (i155 & i170) | (i12 & (~i170));
        if ((i2 & 8) == 0) {
            int i172 = 615 - (~(-android.view.MotionEvent.axisFromString(str3)));
            char blue2 = (char) android.graphics.Color.blue(0);
            int i173 = -(-android.widget.ExpandableListView.getPackedPositionChild(0L));
            int i174 = (i173 ^ 44) + ((i173 & 44) << 1);
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            a(i172, blue2, i174, objArr29);
            java.lang.String str23 = (java.lang.String) objArr29[0];
            int i175 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            a((i175 ^ 659) + ((i175 & 659) << 1), (char) android.view.KeyEvent.getDeadChar(0, 0), (-16777175) - android.graphics.Color.rgb(0, 0, 0), objArr30);
            java.lang.String str24 = (java.lang.String) objArr30[0];
            int i176 = 699 - (~(-android.os.Process.getGidForName(str3)));
            char c8 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i177 = -android.widget.ExpandableListView.getPackedPositionType(0L);
            int i178 = (i177 ^ 38) + ((i177 & 38) << 1);
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            a(i176, c8, i178, objArr31);
            java.lang.String[] strArr14 = {str23, str24, (java.lang.String) objArr31[0]};
            int i179 = 0;
            while (true) {
                if (i179 >= 3) {
                    i43 = i44;
                    break;
                }
                java.lang.Object[] objArr32 = {strArr14[i179]};
                java.lang.Object Camera2StreamConfigurationMap9 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(144409651);
                if (Camera2StreamConfigurationMap9 == null) {
                    char red2 = (char) android.graphics.Color.red(0);
                    int pressedStateDuration2 = 511 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                    int scrollBarFadeDuration2 = 12 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte b6 = (byte) ($$a[4] + 1);
                    strArr9 = strArr14;
                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                    b(b6, (byte) (b6 + 1), r13[5], objArr33);
                    Camera2StreamConfigurationMap9 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(red2, pressedStateDuration2, scrollBarFadeDuration2, -1784986317, false, (java.lang.String) objArr33[0], new java.lang.Class[]{java.lang.String.class});
                } else {
                    strArr9 = strArr14;
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap9).invoke(null, objArr32)).longValue();
                long j24 = -751098998;
                long j25 = 367;
                long j26 = (j25 * j24) + (j25 * longValue3);
                long j27 = -366;
                long j28 = longValue3 ^ j2;
                long j29 = j26 + ((j24 | longValue3) * j27) + (j27 * (j24 | ((j28 | j) ^ j2))) + (366 * ((((j24 ^ j2) | longValue3) ^ j2) | (((j28 | j24) | j) ^ j2))) + 1211220737;
                int nextInt = new java.util.Random().nextInt(247788092);
                int i180 = ~(1327857074 | nextInt);
                int i181 = ((int) (j29 >> 32)) & (162006262 + ((8421960 | i180) * (-814)) + ((i180 | (~((-109369337) | (~nextInt))) | 1226909698) * 407) + (((~(nextInt | 109369336)) | 1226909698 | (~((-1327857075) | nextInt))) * 407));
                int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                int i182 = ~maxMemory;
                int i183 = ((int) j29) & (668656577 + (((~(2076057745 | i182)) | (-638831336) | (~((-2076057746) | maxMemory))) * (-564)) + ((~(maxMemory | (-571605122))) * 1128) + (((~((-638831336) | i182)) | 1504452624) * 564));
                if (((i181 & i183) | (i181 ^ i183)) != 0) {
                    i43 = i44 ^ (i179 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
                    break;
                }
                i179++;
                strArr14 = strArr9;
            }
            int i184 = (~(i44 & i171)) & (i44 | i171);
            int i185 = (i184 | (-i184)) >> 31;
            int i186 = i43 & (~i185);
            int i187 = i171 & i185;
            i171 = (i187 & i186) | (i186 ^ i187);
        }
        java.lang.String[] strArr15 = new java.lang.String[2];
        int i188 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
        java.lang.Object[] objArr34 = new java.lang.Object[1];
        a((i188 ^ 739) + ((i188 & 739) << 1), (char) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), 41 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr34);
        strArr15[0] = (java.lang.String) objArr34[0];
        int i189 = getHighResolutionOutputSizeshNQ4ISI;
        int i190 = (i189 & 13) + (i189 | 13);
        getOutputMinFrameDuration = i190 % 128;
        int i191 = i190 % 2;
        int indexOf4 = android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        int highSpeedVideoSizes3 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$$ExternalSyntheticLambda11.getHighSpeedVideoSizes();
        int i192 = (indexOf4 * 46) - (-35926);
        int i193 = getHighResolutionOutputSizeshNQ4ISI;
        int i194 = (i193 ^ 117) + ((i193 & 117) << 1);
        int i195 = i194 % 128;
        getOutputMinFrameDuration = i195;
        int i196 = i194 % 2;
        int i197 = ~highSpeedVideoSizes3;
        int i198 = ~(((-782) ^ i197) | ((-782) & i197));
        int i199 = -(-(((indexOf4 ^ i198) | (i198 & indexOf4)) * (-90)));
        int i200 = ((i192 | i199) << 1) - (i192 ^ i199);
        int i201 = ~(((-782) ^ highSpeedVideoSizes3) | ((-782) & highSpeedVideoSizes3));
        int i202 = ~((indexOf4 ^ 781) | (indexOf4 & 781));
        int i203 = (i200 - (~(-(-(((i201 & i202) | (i201 ^ i202)) * (-45)))))) - 1;
        int i204 = ~indexOf4;
        int i205 = ~((i204 & highSpeedVideoSizes3) | (i204 ^ highSpeedVideoSizes3));
        i13 = ((i195 | 17) << 1) - (i195 ^ 17);
        getHighResolutionOutputSizeshNQ4ISI = i13 % 128;
        if (i13 % 2 == 0) {
            int i206 = ((-782) ^ i205) | ((-782) & i205);
            int i207 = ~((indexOf4 & i197) | (i197 ^ indexOf4));
            int i208 = i203 - (45 % ((i206 & i207) | (i206 ^ i207)));
            packedPositionType = (char) android.widget.ExpandableListView.getPackedPositionType(1L);
            keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
            i15 = 127;
            i16 = i208;
            i14 = 1;
        } else {
            int i209 = ((~((~highSpeedVideoSizes3) | indexOf4)) | ((-782) & i205) | ((-782) ^ i205)) * 45;
            i14 = 1;
            int i210 = ((i203 | i209) << 1) - (i203 ^ i209);
            packedPositionType = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
            keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
            i15 = 30;
            i16 = i210;
        }
        int i211 = i15 + (keyRepeatTimeout >> 16);
        java.lang.Object[] objArr35 = new java.lang.Object[i14];
        a(i16, packedPositionType, i211, objArr35);
        strArr15[i14] = (java.lang.String) objArr35[0];
        i17 = 0;
        while (i17 < 2) {
            java.lang.Object[] objArr36 = {strArr15[i17]};
            java.lang.Object Camera2StreamConfigurationMap10 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(144409651);
            if (Camera2StreamConfigurationMap10 == null) {
                char trimmedLength2 = (char) android.text.TextUtils.getTrimmedLength(str3);
                int myPid = 511 - (android.os.Process.myPid() >> 22);
                int size = 12 - android.view.View.MeasureSpec.getSize(0);
                byte b7 = (byte) ($$a[4] + 1);
                strArr8 = strArr15;
                java.lang.Object[] objArr37 = new java.lang.Object[1];
                b(b7, (byte) (b7 + 1), r13[5], objArr37);
                Camera2StreamConfigurationMap10 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(trimmedLength2, myPid, size, -1784986317, false, (java.lang.String) objArr37[0], new java.lang.Class[]{java.lang.String.class});
            } else {
                strArr8 = strArr15;
            }
            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap10).invoke(null, objArr36)).longValue();
            long j30 = -1622429290;
            int i212 = i171;
            long j31 = longValue4 ^ j2;
            str4 = str3;
            long myTid2 = android.os.Process.myTid();
            long j32 = myTid2 ^ j2;
            long j33 = ((-830) * j30) + (832 * longValue4) + ((-831) * (((j31 | j32) ^ j2) | (((j30 | longValue4) | myTid2) ^ j2))) + ((-1662) * (((j31 | j30) | myTid2) ^ j2)) + (831 * (((myTid2 | longValue4) ^ j2) | (((j30 ^ j2) | j32) ^ j2) | ((j30 | myTid2) ^ j2))) + 2082551029;
            int i213 = getOutputMinFrameDuration;
            int i214 = ((i213 | 39) << 1) - (i213 ^ 39);
            getHighResolutionOutputSizeshNQ4ISI = i214 % 128;
            if (i214 % 2 != 0) {
                int i215 = ((int) (j33 >> 32)) & ((((-818884594) + (((-1781901268) | i6) * 1324)) + (((~((-1780745858) | i44)) | (~((-1076995028) | i44))) * (-1324))) - 738622964);
                int i216 = ((int) j33) & ((-257101727) + (((~((-757540231) | i6)) | 2100200655) * (-235)) + (((~((-757540231) | i44)) | 2100200655) * (-470)) + (((~((-73985) | i44)) | 1342734409) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE));
                if (((i215 & i216) | (i215 ^ i216)) != 0) {
                    i19 = i44 ^ (i17 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE);
                    i18 = i212;
                    break;
                }
                i17 = ((i17 | 1) << 1) - (i17 ^ 1);
                strArr15 = strArr8;
                i171 = i212;
                str3 = str4;
            } else {
                int uptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
                int i217 = ~(2113745026 | (~uptimeMillis2));
                int i218 = ((int) (j33 >> 32)) & (((1369767936 | i217 | (~((-2113745027) | uptimeMillis2))) * (-338)) + 562320810 + (((~(uptimeMillis2 | (-743977091))) | i217) * 338));
                int i219 = ((int) j33) & (((1019428157 + (((~((-33851394) | i6)) | (~((-139534725) | i6))) * (-184))) + ((((~(771454870 | i6)) | (-805306264)) | (~(665771539 | i6))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 309190056);
                if (((i218 & i219) | (i218 ^ i219)) != 0) {
                    i19 = i44 ^ (i17 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE);
                    i18 = i212;
                    break;
                }
                i17 = ((i17 | 1) << 1) - (i17 ^ 1);
                strArr15 = strArr8;
                i171 = i212;
                str3 = str4;
            }
        }
        str4 = str3;
        i18 = i171;
        i19 = i44;
        int i220 = ((~i18) & i44) | (i18 & i6);
        int i221 = -i220;
        int i222 = ((i220 & i221) | (i220 ^ i221)) >> 31;
        i20 = (i19 & (~i222)) | (i18 & i222);
        Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(11896850);
        if (Camera2StreamConfigurationMap == null) {
            char c9 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i223 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 439;
            int myPid2 = (android.os.Process.myPid() >> 22) + 11;
            byte[] bArr4 = $$a;
            byte b8 = (byte) (bArr4[4] + 1);
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            b(b8, (byte) (b8 + 1), (byte) bArr4.length, objArr38);
            Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c9, i223, myPid2, -1649063662, false, (java.lang.String) objArr38[0], new java.lang.Class[0]);
        }
        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap).invoke(null, null)).longValue();
        long j34 = -1224707770;
        long j35 = 302;
        long j36 = j34 ^ j2;
        long j37 = -301;
        long j38 = (j35 * j34) + (603 * longValue5) + ((-602) * (longValue5 | ((j36 | j3) ^ j2))) + ((((j36 | (longValue5 ^ j2)) ^ j2) | ((j36 | j) ^ j2) | (((j3 | j34) | longValue5) ^ j2)) * j37);
        long j39 = 301;
        j4 = j38 + (((j3 | longValue5) ^ j2) * j39) + 2123382708;
        if (((((int) (j4 >> 32)) & (777149478 + (((~((-1359102211) | i6)) | (~((-715764834) | i44))) * (-302)) + ((~((-1359102211) | i44)) * (-604)) + (((~((-2074867044) | i44)) | 67109008) * 302))) | (((int) j4) & (1453938690 + (((~(1465228770 | i6)) | 28002360) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + (((~(1476386298 | i6)) | (~((-1448383939) | i44))) * (-519)) + (((~(28002360 | i44)) | (-1465228771)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE)))) == 1) {
            java.lang.Object[] objArr39 = {1};
            java.lang.Object Camera2StreamConfigurationMap11 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1196610834);
            if (Camera2StreamConfigurationMap11 == null) {
                char maximumDrawingCacheSize = (char) (49752 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int i224 = 485 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int modifierMetaStateMask2 = ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 8;
                byte b9 = (byte) ($$a[4] + 1);
                j5 = j35;
                java.lang.Object[] objArr40 = new java.lang.Object[1];
                b(b9, (byte) (b9 + 1), r12[5], objArr40);
                Camera2StreamConfigurationMap11 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(maximumDrawingCacheSize, i224, modifierMetaStateMask2, 632155118, false, (java.lang.String) objArr40[0], new java.lang.Class[]{java.lang.Integer.TYPE});
            } else {
                j5 = j35;
            }
            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap11).invoke(null, objArr39)).longValue();
            long j40 = 709847750;
            long j41 = j40 ^ j2;
            long myUid3 = android.os.Process.myUid();
            long j42 = (236 * j40) + (471 * longValue6) + ((-235) * (longValue6 | ((j41 | (myUid3 ^ j2)) ^ j2))) + ((-470) * (longValue6 | ((j41 | myUid3) ^ j2))) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE * (((myUid3 | (j41 | longValue6)) ^ j2) | (((longValue6 ^ j2) | j40) ^ j2))) + 1204913763;
            int myTid3 = android.os.Process.myTid();
            int i225 = ((int) ((long) ((((int) (j42 >> 32)) & (((2064772086 + (((~(1712334113 | myTid3)) | 275107702) * (-668))) + ((1712334113 | (~(275107702 | myTid3))) * 1336)) + ((myTid3 | 1987440503) * 668))) | (((int) j42) & ((((-501357939) + (((~(1170438558 | i44)) | (-1340603808)) * 336)) + (((~((-266787852) | i44)) | 96622602) * (-168))) + ((1170438558 | (~((-266787852) | i6))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)))))) != 0 ? (~(i44 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) & (i44 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) : i44;
            int i226 = (~(i44 & i20)) & (i44 | i20);
            int i227 = (i226 | (-i226)) >> 31;
            int i228 = (i20 & i227) | (i225 & (~i227));
            int i229 = -android.view.View.resolveSize(0, 0);
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            a((i229 ^ 372) + ((i229 & 372) << 1), (char) (15859 - (~(-(-android.widget.ExpandableListView.getPackedPositionChild(0L))))), 24 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr41);
            java.lang.Object[] objArr42 = {(java.lang.String) objArr41[0]};
            java.lang.Object Camera2StreamConfigurationMap12 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-452611245);
            if (Camera2StreamConfigurationMap12 == null) {
                char myTid4 = (char) (12708 - (android.os.Process.myTid() >> 22));
                int maxKeyCode2 = (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE;
                int longPressTimeout2 = (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 18;
                byte b10 = (byte) ($$a[4] + 1);
                java.lang.Object[] objArr43 = new java.lang.Object[1];
                b(b10, (byte) (b10 + 1), r10[5], objArr43);
                Camera2StreamConfigurationMap12 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(myTid4, maxKeyCode2, longPressTimeout2, 2013622867, false, (java.lang.String) objArr43[0], new java.lang.Class[]{java.lang.String.class});
            }
            java.lang.Object invoke2 = ((java.lang.reflect.Method) Camera2StreamConfigurationMap12).invoke(null, objArr42);
            if (invoke2 != null) {
                java.lang.Object[] objArr44 = {invoke2, 42};
                java.lang.Object Camera2StreamConfigurationMap13 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-638820289);
                if (Camera2StreamConfigurationMap13 == null) {
                    char packedPositionType2 = (char) (48514 - android.widget.ExpandableListView.getPackedPositionType(0L));
                    int myPid3 = 413 - (android.os.Process.myPid() >> 22);
                    int scrollBarSize = (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 15;
                    byte[] bArr5 = $$a;
                    byte b11 = (byte) (bArr5[4] + 1);
                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                    b(b11, (byte) (b11 + 1), (byte) bArr5.length, objArr45);
                    Camera2StreamConfigurationMap13 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(packedPositionType2, myPid3, scrollBarSize, 1156358463, false, (java.lang.String) objArr45[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                }
                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap13).invoke(null, objArr44)).longValue();
                long j43 = 1832320471;
                long j44 = -375;
                long j45 = (j44 * j43) + (j44 * longValue7);
                long j46 = 376;
                long myTid5 = android.os.Process.myTid();
                long j47 = j43 ^ j2;
                long j48 = (j43 | longValue7) ^ j2;
                long j49 = (((j45 + (((myTid5 | ((j47 | (longValue7 ^ j2)) ^ j2)) | j48) * j46)) + ((-376) * ((((myTid5 ^ j2) | j43) ^ j2) | j48))) + (j46 * (((j47 | myTid5) ^ j2) | longValue7))) - 1976723741;
                int i230 = getHighResolutionOutputSizeshNQ4ISI;
                int i231 = (i230 ^ 83) + ((i230 & 83) << 1);
                getOutputMinFrameDuration = i231 % 128;
                int i232 = i231 % 2;
                int myTid6 = android.os.Process.myTid();
                int i233 = ((int) (j49 >> 32)) & (384374654 + (((~((~myTid6) | 698654090)) | 1447715381) * 446) + (((~(myTid6 | 2146369471)) | 688165120) * 446) + 1435965526);
                int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                int i234 = ((int) j49) & ((-1945571563) + (((~(168537678 | elapsedCpuTime)) | (-1268688732)) * (-366)) + (((~(elapsedCpuTime | (-1100218642))) | 67588) * 366));
                if (((i234 & i233) | (i233 ^ i234)) == 1986687685) {
                    i24 = i228;
                    i23 = i6;
                    j6 = j2;
                    i22 = i7;
                    str5 = str4;
                    i25 = 0;
                    strArr2 = null;
                    int i235 = -android.view.View.resolveSize(i25, i25);
                    int i236 = ((i235 | 891) << 1) - (i235 ^ 891);
                    char c10 = (char) ((android.widget.ExpandableListView.getPackedPositionForChild(i25, i25) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i25, i25) == 0L ? 0 : -1)) + 51729);
                    int resolveSize2 = android.view.View.resolveSize(i25, i25);
                    int i237 = ((resolveSize2 | 16) << 1) - (resolveSize2 ^ 16);
                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                    a(i236, c10, i237, objArr46);
                    java.lang.Object[] objArr47 = {(java.lang.String) objArr46[i25]};
                    Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-452611245);
                    if (Camera2StreamConfigurationMap2 == null) {
                        char c11 = (char) (12709 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int indexOf5 = android.text.TextUtils.indexOf(str5, str5, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE;
                        int packedPositionGroup2 = 18 - android.widget.ExpandableListView.getPackedPositionGroup(0L);
                        byte b12 = (byte) ($$a[4] + 1);
                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                        b(b12, (byte) (b12 + 1), r10[5], objArr48);
                        Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c11, indexOf5, packedPositionGroup2, 2013622867, false, (java.lang.String) objArr48[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    invoke = ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr47);
                    if (invoke != null) {
                        i32 = i24;
                        strArr4 = strArr2;
                        i33 = 0;
                    } else {
                        java.lang.Object[] objArr49 = {invoke, 42};
                        java.lang.Object Camera2StreamConfigurationMap14 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-638820289);
                        if (Camera2StreamConfigurationMap14 == null) {
                            char fadingEdgeLength = (char) (48514 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                            int mode2 = 413 - android.view.View.MeasureSpec.getMode(0);
                            int threadPriority = 15 - ((android.os.Process.getThreadPriority(0) + 20) >> 6);
                            byte[] bArr6 = $$a;
                            byte b13 = (byte) (bArr6[4] + 1);
                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                            b(b13, (byte) (b13 + 1), (byte) bArr6.length, objArr50);
                            Camera2StreamConfigurationMap14 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(fadingEdgeLength, mode2, threadPriority, 1156358463, false, (java.lang.String) objArr50[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                        }
                        long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap14).invoke(null, objArr49)).longValue();
                        long j50 = 1829703554;
                        i32 = i24;
                        long j51 = ((-947) * j50) + (949 * longValue8);
                        long j52 = -948;
                        long j53 = j50 ^ j6;
                        long j54 = longValue8 ^ j6;
                        strArr4 = strArr2;
                        long elapsedCpuTime2 = (int) android.os.Process.getElapsedCpuTime();
                        long j55 = (((j51 + ((j53 | ((j54 | elapsedCpuTime2) ^ j6)) * j52)) + (j52 * (((j53 | j54) | (elapsedCpuTime2 ^ j6)) ^ j6))) + (948 * (j54 | j50))) - 1974106824;
                        int nextInt2 = new java.util.Random().nextInt();
                        int i238 = ~nextInt2;
                        int i239 = ((int) (j55 >> 32)) & ((-802173004) + ((766127462 | i238) * (-369)) + (((~((-757737575) | i238)) | 679488836) * (-369)) + (((~(nextInt2 | 757737574)) | 8389888 | (~(i238 | (-86638627)))) * 369));
                        int i240 = ~((int) android.os.Process.getStartUptimeMillis());
                        int i241 = ((int) j55) & (625527807 + (((-1090606098) | i240) * 494) + (((~(i240 | 953297890)) | (-1230067090)) * 494));
                    }
                    if (i33 != 1986687685 || i33 == -1514516938) {
                        str7 = str5;
                        i34 = i32;
                    } else {
                        int pressedStateDuration3 = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                        int i242 = (pressedStateDuration3 & 1610) + (pressedStateDuration3 | 1610);
                        int i243 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                        int i244 = -(-android.view.KeyEvent.normalizeMetaState(0));
                        java.lang.Object[] objArr51 = new java.lang.Object[1];
                        a(i242, (char) (((i243 | 33195) << 1) - (i243 ^ 33195)), (i244 & 14) + (i244 | 14), objArr51);
                        java.lang.String str25 = (java.lang.String) objArr51[0];
                        int i245 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                        char green2 = (char) android.graphics.Color.green(0);
                        int i246 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int i247 = ((i246 | 26) << 1) - (i246 ^ 26);
                        java.lang.Object[] objArr52 = new java.lang.Object[1];
                        a(((i245 | 1625) << 1) - (i245 ^ 1625), green2, i247, objArr52);
                        java.lang.String str26 = (java.lang.String) objArr52[0];
                        int tapTimeout = android.view.ViewConfiguration.getTapTimeout() >> 16;
                        int i248 = (tapTimeout ^ 1650) + ((tapTimeout & 1650) << 1);
                        int trimmedLength3 = android.text.TextUtils.getTrimmedLength(str5);
                        int i249 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int i250 = (i249 & 16) + (i249 | 16);
                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                        a(i248, (char) (((trimmedLength3 | 23283) << 1) - (trimmedLength3 ^ 23283)), i250, objArr53);
                        java.lang.String str27 = (java.lang.String) objArr53[0];
                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                        a(android.graphics.Color.rgb(0, 0, 0) + 16778883, (char) (2895 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), android.text.TextUtils.indexOf(str5, str5, 0) + 17, objArr54);
                        java.lang.String str28 = (java.lang.String) objArr54[0];
                        int i251 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int i252 = (i251 & 1683) + (i251 | 1683);
                        char keyCodeFromString = (char) android.view.KeyEvent.keyCodeFromString(str5);
                        int i253 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int highSpeedVideoSizes4 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$$ExternalSyntheticLambda11.getHighSpeedVideoSizes();
                        int i254 = i253 * (-813);
                        int i255 = (i253 ^ highSpeedVideoSizes4) | (i253 & highSpeedVideoSizes4);
                        int i256 = (((i254 & 6120) + (i254 | 6120)) - (~(-(-(((~(((-16) ^ i253) | ((-16) & i253))) | (~i255)) * (-814)))))) - 1;
                        int i257 = ~highSpeedVideoSizes4;
                        int i258 = ~(((-16) & i257) | ((-16) ^ i257));
                        int i259 = ~i253;
                        int i260 = ~((i259 & 15) | (i259 ^ 15));
                        int i261 = (i258 | i260 | (~i255)) * 407;
                        int i262 = ~i253;
                        int i263 = ~((i262 & highSpeedVideoSizes4) | (i262 ^ highSpeedVideoSizes4));
                        int i264 = (i263 & i260) | (i260 ^ i263);
                        int i265 = ~((highSpeedVideoSizes4 & 15) | (highSpeedVideoSizes4 ^ 15));
                        int i266 = (i256 ^ i261) + ((i261 & i256) << 1) + (((i265 & i264) | (i264 ^ i265)) * 407);
                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                        a(i252, keyCodeFromString, i266, objArr55);
                        java.lang.String str29 = (java.lang.String) objArr55[0];
                        int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                        int i267 = ((resolveSizeAndState | 1699) << 1) - (resolveSizeAndState ^ 1699);
                        char c12 = (char) (0 - (~(-(-((byte) android.view.KeyEvent.getModifierMetaStateMask())))));
                        int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                        int highSpeedVideoSizes5 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$$ExternalSyntheticLambda11.getHighSpeedVideoSizes();
                        int i268 = ~((~highSpeedVideoSizes5) | 37);
                        int i269 = ((((normalizeMetaState * 165) - 6031) + (((i268 & normalizeMetaState) | (normalizeMetaState ^ i268)) * (-328))) - (~(-(-(((normalizeMetaState ^ highSpeedVideoSizes5) | (normalizeMetaState & highSpeedVideoSizes5)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))))) - 1;
                        int i270 = ~normalizeMetaState;
                        int i271 = ~((i270 & (-38)) | (i270 ^ (-38)));
                        int i272 = ~(((-38) ^ highSpeedVideoSizes5) | ((-38) & highSpeedVideoSizes5));
                        int i273 = (i271 & i272) | (i271 ^ i272);
                        int i274 = ~highSpeedVideoSizes5;
                        int i275 = (normalizeMetaState & i274) | (i274 ^ normalizeMetaState);
                        int i276 = ~((i275 & 37) | (i275 ^ 37));
                        int i277 = -(-(((i276 & i273) | (i273 ^ i276)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                        int i278 = ((i269 | i277) << 1) - (i277 ^ i269);
                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                        a(i267, c12, i278, objArr56);
                        java.lang.String str30 = (java.lang.String) objArr56[0];
                        int i279 = -(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                        a((i279 & 1736) + (i279 | 1736), (char) (android.view.View.MeasureSpec.getMode(0) + 65418), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 12, objArr57);
                        java.lang.String str31 = (java.lang.String) objArr57[0];
                        int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                        java.lang.Object[] objArr58 = new java.lang.Object[1];
                        a(((bitsPerPixel | 1749) << 1) - (bitsPerPixel ^ 1749), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, objArr58);
                        java.lang.String str32 = (java.lang.String) objArr58[0];
                        int i280 = -android.os.Process.getGidForName(str5);
                        int highSpeedVideoSizes6 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$$ExternalSyntheticLambda11.getHighSpeedVideoSizes();
                        int i281 = ~i280;
                        int i282 = ~((i281 & (-1761)) | (i281 ^ (-1761)));
                        int i283 = ~(((-1761) ^ highSpeedVideoSizes6) | ((-1761) & highSpeedVideoSizes6));
                        int i284 = ((i280 * (-103)) - 181280) + (((i282 & i283) | (i282 ^ i283)) * 104);
                        int i285 = (~highSpeedVideoSizes6) | i280;
                        int i286 = ((i284 - (~((~((i285 & 1760) | (i285 ^ 1760))) * (-104)))) - 1) + (((i280 & highSpeedVideoSizes6) | (i280 ^ highSpeedVideoSizes6)) * 104);
                        char c13 = (char) (21900 - (~(-(-android.view.KeyEvent.getDeadChar(0, 0)))));
                        int i287 = -(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                        int i288 = (i287 ^ 22) + ((i287 & 22) << 1);
                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                        a(i286, c13, i288, objArr59);
                        java.lang.String str33 = (java.lang.String) objArr59[0];
                        int i289 = 1783 - (~(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                        int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                        int i290 = -(-(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                        a(i289, (char) ((keyRepeatDelay & 6284) + (keyRepeatDelay | 6284)), (i290 & 31) + (i290 | 31), objArr60);
                        java.lang.String str34 = (java.lang.String) objArr60[0];
                        int argb2 = android.graphics.Color.argb(0, 0, 0, 0);
                        int i291 = (argb2 & 1814) + (argb2 | 1814);
                        char c14 = (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5170);
                        int i292 = -(-android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                        java.lang.Object[] objArr61 = new java.lang.Object[1];
                        a(i291, c14, (i292 & 13) + (i292 | 13), objArr61);
                        java.lang.String str35 = (java.lang.String) objArr61[0];
                        int packedPositionGroup3 = android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1826;
                        int i293 = -(-android.graphics.Color.rgb(0, 0, 0));
                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                        a(packedPositionGroup3, (char) ((i293 ^ 16777216) + ((i293 & 16777216) << 1)), 11 - (~(android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr62);
                        java.lang.String str36 = (java.lang.String) objArr62[0];
                        int i294 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int i295 = (i294 ^ 1838) + ((i294 & 1838) << 1);
                        int i296 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                        int i297 = i296 * (-159);
                        int i298 = ((i297 | (-6071415)) << 1) - (i297 ^ (-6071415));
                        int i299 = ~i296;
                        int i300 = -(-(((i299 & 38185) | (i299 ^ 38185)) * 160));
                        int i301 = (i298 ^ i300) + ((i300 & i298) << 1);
                        int i302 = ~(i22 | i296);
                        int i303 = ~((38185 & i296) | (i296 ^ 38185));
                        int i304 = (i301 - (~(((i302 & i303) | (i302 ^ i303)) * (-160)))) - 1;
                        int i305 = ~(((-38186) & i22) | ((-38186) ^ i22));
                        int i306 = -(-(((i296 & i305) | (i296 ^ i305)) * 160));
                        char c15 = (char) ((i304 & i306) + (i306 | i304));
                        int i307 = -android.view.View.getDefaultSize(0, 0);
                        java.lang.Object[] objArr63 = new java.lang.Object[1];
                        a(i295, c15, (i307 & 12) + (i307 | 12), objArr63);
                        java.lang.String str37 = (java.lang.String) objArr63[0];
                        java.lang.String str38 = str5;
                        java.lang.Object[] objArr64 = new java.lang.Object[1];
                        a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1850, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), 10 - (~(-(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))))), objArr64);
                        java.lang.String str39 = (java.lang.String) objArr64[0];
                        int i308 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i309 = (i308 & 1862) + (i308 | 1862);
                        char scrollBarFadeDuration3 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int packedPositionType3 = android.widget.ExpandableListView.getPackedPositionType(0L);
                        int i310 = (packedPositionType3 ^ 12) + ((packedPositionType3 & 12) << 1);
                        java.lang.Object[] objArr65 = new java.lang.Object[1];
                        a(i309, scrollBarFadeDuration3, i310, objArr65);
                        java.lang.String str40 = (java.lang.String) objArr65[0];
                        int i311 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i312 = ((i311 | 1874) << 1) - (i311 ^ 1874);
                        char alpha = (char) android.graphics.Color.alpha(0);
                        int i313 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int i314 = (i313 ^ 13) + ((i313 & 13) << 1);
                        java.lang.Object[] objArr66 = new java.lang.Object[1];
                        a(i312, alpha, i314, objArr66);
                        java.lang.String str41 = (java.lang.String) objArr66[0];
                        int i315 = -(-(android.view.ViewConfiguration.getEdgeSlop() >> 16));
                        int i316 = (i315 ^ 1888) + ((i315 & 1888) << 1);
                        char c16 = (char) (60422 - (~(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                        int i317 = -(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int i318 = ((i317 | 12) << 1) - (i317 ^ 12);
                        java.lang.Object[] objArr67 = new java.lang.Object[1];
                        a(i316, c16, i318, objArr67);
                        java.lang.String str42 = (java.lang.String) objArr67[0];
                        int i319 = 1899 - (~(-(android.view.ViewConfiguration.getScrollBarSize() >> 8)));
                        char red3 = (char) android.graphics.Color.red(0);
                        int i320 = -android.view.View.resolveSize(0, 0);
                        java.lang.Object[] objArr68 = new java.lang.Object[1];
                        a(i319, red3, (i320 & 24) + (i320 | 24), objArr68);
                        java.lang.String str43 = (java.lang.String) objArr68[0];
                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                        a(1925 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((-android.text.TextUtils.lastIndexOf(str38, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)) - 1), 27 - android.os.Process.getGidForName(str38), objArr69);
                        java.lang.String[] strArr16 = {str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str39, str40, str41, str42, str43, (java.lang.String) objArr69[0]};
                        int i321 = 0;
                        while (true) {
                            if (i321 >= 19) {
                                str7 = str38;
                                i321 = -1;
                                break;
                            }
                            java.lang.String str44 = strArr16[i321];
                            java.lang.Object[] objArr70 = {str44};
                            java.lang.Object Camera2StreamConfigurationMap15 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(355760564);
                            if (Camera2StreamConfigurationMap15 == null) {
                                char offsetAfter = (char) android.text.TextUtils.getOffsetAfter(str38, 0);
                                int i322 = 512 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int resolveSize3 = android.view.View.resolveSize(0, 0) + 12;
                                byte[] bArr7 = $$a;
                                byte b14 = (byte) (bArr7[4] + 1);
                                java.lang.Object[] objArr71 = new java.lang.Object[1];
                                b(b14, (byte) (b14 + 1), (byte) bArr7.length, objArr71);
                                Camera2StreamConfigurationMap15 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(offsetAfter, i322, resolveSize3, -2009810764, false, (java.lang.String) objArr71[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap15).invoke(null, objArr70)).longValue();
                            long j56 = 588430669;
                            java.lang.String[] strArr17 = strArr16;
                            long j57 = j56 ^ j6;
                            long j58 = 381;
                            long j59 = ((-380) * j56) + (382 * longValue9) + ((-381) * (longValue9 | j | j57)) + ((((j57 | (longValue9 ^ j6)) ^ j6) | ((j3 | longValue9) ^ j6) | ((j56 | longValue9) ^ j6)) * j58) + (j58 * ((j57 | longValue9) ^ j6)) + 619390633;
                            int i323 = ((int) (j59 >> 32)) & ((((1076371456 | r3) * (-970)) - 1764632910) + (((~(i23 | (-899139124))) | (-1975510580)) * 970));
                            int i324 = ((int) j59) & (484646344 + (((~((-1402866981) | i44)) | 1385565472) * 345) + (((~((-1402866981) | i23)) | 69308433) * 345) + ((~((-1385565473) | i44)) * 345));
                            if (((i323 & i324) | (i323 ^ i324)) != 0) {
                                str7 = str38;
                                break;
                            }
                            int i325 = -android.text.TextUtils.getCapsMode(str38, 0, 0);
                            int i326 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            int packedPositionType4 = android.widget.ExpandableListView.getPackedPositionType(0L);
                            int i327 = getOutputMinFrameDuration + 37;
                            getHighResolutionOutputSizeshNQ4ISI = i327 % 128;
                            int i328 = i327 % 2;
                            java.lang.Object[] objArr72 = new java.lang.Object[1];
                            a((i325 ^ 1874) + ((i325 & 1874) << 1), (char) ((i326 ^ 1) + ((i326 & 1) << 1)), (14 & packedPositionType4) + (packedPositionType4 | 14), objArr72);
                            if (str44.equals((java.lang.String) objArr72[0])) {
                                java.lang.Object[] objArr73 = {str44};
                                java.lang.Object Camera2StreamConfigurationMap16 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(144409651);
                                if (Camera2StreamConfigurationMap16 == null) {
                                    char indexOf6 = (char) (android.text.TextUtils.indexOf(str38, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1);
                                    int resolveSizeAndState2 = android.view.View.resolveSizeAndState(0, 0, 0) + 511;
                                    int i329 = 13 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    byte b15 = (byte) ($$a[4] + 1);
                                    java.lang.Object[] objArr74 = new java.lang.Object[1];
                                    b(b15, (byte) (b15 + 1), r9[5], objArr74);
                                    Camera2StreamConfigurationMap16 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(indexOf6, resolveSizeAndState2, i329, -1784986317, false, (java.lang.String) objArr74[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap16).invoke(null, objArr73)).longValue();
                                long j60 = 314484241;
                                long j61 = 988;
                                long j62 = longValue10 ^ j6;
                                str7 = str38;
                                long j63 = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd * j60) + ((-987) * longValue10) + (((((j62 | j3) | j60) ^ j6) | (((j60 | longValue10) | j) ^ j6)) * j61) + ((-988) * (j60 | j62)) + (j61 * (((longValue10 | (j3 | j60)) ^ j6) | (((j60 ^ j6) | j62) ^ j6) | ((j62 | j) ^ j6))) + 145637498;
                                int myPid4 = android.os.Process.myPid();
                                int i330 = ~((-1479694532) | myPid4);
                                int i331 = ~myPid4;
                                int i332 = ((int) (j63 >> 32)) & (1069046067 + ((i330 | (~(1543166971 | i331))) * 497) + (((~(myPid4 | 1543166971)) | (~((-1500698852) | i331)) | 21004320) * 497));
                                int i333 = ((int) j63) & ((-1587633331) + (((~(1885282883 | i44)) | (-2046798420) | (~(972458002 | i44))) * (-744)) + ((i23 | 810942466) * 744) + ((2046798419 | i44) * 744));
                                if (((i332 & i333) | (i332 ^ i333)) != 0) {
                                    break;
                                }
                            } else {
                                str7 = str38;
                            }
                            i321 = ((i321 | 1) << 1) - (i321 ^ 1);
                            strArr16 = strArr17;
                            str38 = str7;
                        }
                        int i334 = (i321 & 130) + (i321 | 130);
                        int i335 = (i334 & i23) | ((~i334) & i44);
                        int i336 = ~i321;
                        int i337 = -i336;
                        int i338 = ((i336 & i337) | (i336 ^ i337)) >> 31;
                        int i339 = getOutputMinFrameDuration;
                        int i340 = i339 + 3;
                        getHighResolutionOutputSizeshNQ4ISI = i340 % 128;
                        if (i340 % 2 != 0) {
                            i42 = (i335 & i338) | ((~i338) & i44);
                            int i341 = 24 / 0;
                        } else {
                            int i342 = (~i338) & i44;
                            int i343 = i335 & i338;
                            i42 = (i343 & i342) | (i342 ^ i343);
                        }
                        int i344 = (~(i44 & i32)) & (i44 | i32);
                        int i345 = -i344;
                        int i346 = (i344 & i345) | (i344 ^ i345);
                        int i347 = (i339 ^ 67) + ((i339 & 67) << 1);
                        getHighResolutionOutputSizeshNQ4ISI = i347 % 128;
                        int i348 = i347 % 2;
                        int i349 = i346 >> 31;
                        int i350 = i42 & (~i349);
                        int i351 = i339 + 19;
                        getHighResolutionOutputSizeshNQ4ISI = i351 % 128;
                        int i352 = i351 % 2;
                        int i353 = i32 & i349;
                        i34 = (i350 ^ i353) | (i350 & i353);
                    }
                    int i354 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    char resolveOpacity = (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    java.lang.String str45 = str7;
                    int i355 = -android.text.TextUtils.indexOf(str45, str45, 0, 0);
                    int i356 = ((i355 | 13) << 1) - (i355 ^ 13);
                    java.lang.Object[] objArr75 = new java.lang.Object[1];
                    a(((i354 | 1952) << 1) - (i354 ^ 1952), resolveOpacity, i356, objArr75);
                    java.lang.String str46 = (java.lang.String) objArr75[0];
                    int i357 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i358 = (i357 & 1965) + (i357 | 1965);
                    int i359 = -(-android.widget.ExpandableListView.getPackedPositionType(0L));
                    int i360 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                    int i361 = i360 * 829;
                    int i362 = ((i361 | 4145) << 1) - (i361 ^ 4145);
                    int i363 = ~((~i360) | (-6));
                    int i364 = (i23 ^ i360) | (i23 & i360);
                    int i365 = ~((i364 & 5) | (i364 ^ 5));
                    int i366 = -(-(((i363 & i365) | (i363 ^ i365)) * (-828)));
                    int i367 = (i360 & 5) | (i360 ^ 5);
                    int i368 = (((i362 | i366) << 1) - (i366 ^ i362)) + (((i367 ^ i23) | (i367 & i23)) * (-828));
                    int i369 = (~i367) * 828;
                    int i370 = ((i368 | i369) << 1) - (i369 ^ i368);
                    java.lang.Object[] objArr76 = new java.lang.Object[1];
                    a(i358, (char) (((i359 | 49437) << 1) - (i359 ^ 49437)), i370, objArr76);
                    java.lang.String[] strArr18 = {str46, (java.lang.String) objArr76[0]};
                    int i371 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int highSpeedVideoSizes7 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$$ExternalSyntheticLambda11.getHighSpeedVideoSizes();
                    int i372 = i371 * (-518);
                    int i373 = (i372 & (-1020460)) + (i372 | (-1020460));
                    int i374 = ~i371;
                    int i375 = ~((~highSpeedVideoSizes7) | i374);
                    int i376 = i373 + (((i375 & 1970) | (i375 ^ 1970)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE);
                    int i377 = ~highSpeedVideoSizes7;
                    int i378 = (i374 & i377) | (i374 ^ i377);
                    int i379 = ~((i378 & 1970) | (i378 ^ 1970));
                    int i380 = (i371 ^ 1970) | (i371 & 1970);
                    int i381 = ~((i380 & highSpeedVideoSizes7) | (i380 ^ highSpeedVideoSizes7));
                    int i382 = -(-(((i379 & i381) | (i379 ^ i381)) * (-519)));
                    int i383 = (i376 ^ i382) + ((i382 & i376) << 1);
                    int i384 = ~((highSpeedVideoSizes7 & 1970) | (highSpeedVideoSizes7 ^ 1970));
                    int i385 = -(-(((i371 & i384) | (i371 ^ i384)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                    int resolveSizeAndState3 = android.view.View.resolveSizeAndState(0, 0, 0);
                    java.lang.Object[] objArr77 = new java.lang.Object[1];
                    a((i383 ^ i385) + ((i385 & i383) << 1), (char) ((resolveSizeAndState3 ^ 14000) + ((resolveSizeAndState3 & 14000) << 1)), 15 - android.view.View.resolveSize(0, 0), objArr77);
                    java.lang.String str47 = (java.lang.String) objArr77[0];
                    int indexOf7 = android.text.TextUtils.indexOf(str45, str45, 0) + 1985;
                    int alpha2 = android.graphics.Color.alpha(0);
                    char c17 = (char) ((alpha2 ^ 44097) + ((44097 & alpha2) << 1));
                    int i386 = -(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                    int i387 = ((i386 | (-29)) << 1) - (i386 ^ (-29));
                    java.lang.Object[] objArr78 = new java.lang.Object[1];
                    a(indexOf7, c17, i387, objArr78);
                    java.lang.String str48 = (java.lang.String) objArr78[0];
                    int i388 = -android.text.TextUtils.indexOf(str45, str45, 0);
                    int i389 = (i388 & androidx.media3.common.PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS) + (i388 | androidx.media3.common.PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS);
                    char resolveSizeAndState4 = (char) android.view.View.resolveSizeAndState(0, 0, 0);
                    int i390 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                    a(i389, resolveSizeAndState4, (i390 & 13) + (i390 | 13), objArr79);
                    java.lang.String[] strArr19 = {str47, str48, (java.lang.String) objArr79[0]};
                    int i391 = 2017 - (~(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    char argb3 = (char) (android.graphics.Color.argb(0, 0, 0, 0) + 19557);
                    int i392 = -android.view.View.MeasureSpec.getMode(0);
                    java.lang.Object[] objArr80 = new java.lang.Object[1];
                    a(i391, argb3, (i392 & 21) + (i392 | 21), objArr80);
                    java.lang.String str49 = (java.lang.String) objArr80[0];
                    java.lang.Object[] objArr81 = new java.lang.Object[1];
                    a(2037 - (~(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (char) (17642 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), android.view.MotionEvent.axisFromString(str45) + 11, objArr81);
                    java.lang.String[] strArr20 = {str49, (java.lang.String) objArr81[0]};
                    int i393 = -(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                    int i394 = (i393 & 2049) + (i393 | 2049);
                    char longPressTimeout3 = (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                    int indexOf8 = android.text.TextUtils.indexOf(str45, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int i395 = ((indexOf8 | 12) << 1) - (indexOf8 ^ 12);
                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                    a(i394, longPressTimeout3, i395, objArr82);
                    java.lang.String str50 = (java.lang.String) objArr82[0];
                    int i396 = -(-android.text.TextUtils.getOffsetAfter(str45, 0));
                    int i397 = (i396 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED) + ((i396 & com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED) << 1);
                    int i398 = -android.graphics.Color.red(0);
                    int i399 = -(-android.text.TextUtils.indexOf(str45, str45, 0, 0));
                    int i400 = (i399 ^ 6) + ((i399 & 6) << 1);
                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                    a(i397, (char) ((i398 ^ 3429) + ((i398 & 3429) << 1)), i400, objArr83);
                    java.lang.String[] strArr21 = {str50, (java.lang.String) objArr83[0]};
                    int i401 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
                    java.lang.Object[] objArr84 = new java.lang.Object[1];
                    a(((i401 | 2060) << 1) - (i401 ^ 2060), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 38763), 27 - (~(-android.view.View.MeasureSpec.getMode(0))), objArr84);
                    java.lang.String str51 = (java.lang.String) objArr84[0];
                    int touchSlop3 = 2039 - (android.view.ViewConfiguration.getTouchSlop() >> 8);
                    int i402 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i403 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                    int i404 = (i403 * (-520)) + 5220;
                    int i405 = ~i403;
                    int i406 = -(-((~((i405 ^ 10) | (i405 & 10) | i44)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                    int i407 = ((i404 | i406) << 1) - (i406 ^ i404);
                    int i408 = (~(((-11) & i403) | ((-11) ^ i403))) * (-1042);
                    int i409 = (i407 ^ i408) + ((i407 & i408) << 1);
                    int i410 = ~((-11) | i403);
                    int i411 = ~i403;
                    int i412 = ~((i411 ^ i23) | (i411 & i23) | 10);
                    int i413 = i409 + (((i410 ^ i412) | (i410 & i412)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL);
                    java.lang.Object[] objArr85 = new java.lang.Object[1];
                    a(touchSlop3, (char) ((i402 ^ 17642) + ((i402 & 17642) << 1)), i413, objArr85);
                    c = 0;
                    strArr5 = new java.lang.String[][]{strArr18, strArr19, strArr20, strArr21, new java.lang.String[]{str51, (java.lang.String) objArr85[0]}};
                    i35 = 0;
                    i36 = 5;
                    int i414 = -1;
                    loop7: while (true) {
                        if (i35 < i36) {
                            i21 = i44;
                            i37 = i34;
                            str8 = str45;
                            break;
                        }
                        java.lang.String[] strArr22 = strArr5[i35];
                        java.lang.String str52 = strArr22[c];
                        java.lang.String[] strArr23 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr22, 1, strArr22.length);
                        int length = strArr23.length;
                        int i415 = 0;
                        while (i415 < length) {
                            int i416 = i414 + 1;
                            java.lang.Object[] objArr86 = {str52, strArr23[i415]};
                            java.lang.Object Camera2StreamConfigurationMap17 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1995800745);
                            if (Camera2StreamConfigurationMap17 == null) {
                                char touchSlop4 = (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 17808);
                                int i417 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 378;
                                int red4 = 17 - android.graphics.Color.red(0);
                                byte[] bArr8 = $$a;
                                strArr6 = strArr5;
                                strArr7 = strArr23;
                                byte b16 = (byte) (bArr8[4] + 1);
                                str11 = str52;
                                i41 = length;
                                java.lang.Object[] objArr87 = new java.lang.Object[1];
                                b(b16, (byte) (b16 + 1), (byte) bArr8.length, objArr87);
                                Camera2StreamConfigurationMap17 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(touchSlop4, i417, red4, -336248407, false, (java.lang.String) objArr87[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
                            } else {
                                strArr6 = strArr5;
                                strArr7 = strArr23;
                                str11 = str52;
                                i41 = length;
                            }
                            long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap17).invoke(null, objArr86)).longValue();
                            str8 = str45;
                            long j64 = -418109468;
                            int i418 = i414;
                            i37 = i34;
                            int i419 = i35;
                            long j65 = 988;
                            int i420 = i415;
                            long uptimeMillis3 = (int) android.os.SystemClock.uptimeMillis();
                            long j66 = ((j64 ^ j6) | longValue11) ^ j6;
                            long j67 = longValue11 ^ j6;
                            long j68 = uptimeMillis3 ^ j6;
                            long j69 = ((-1975) * j64) + (com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd * longValue11) + ((uptimeMillis3 | j66) * j65) + ((-1976) * (((j67 | j64) ^ j6) | ((j68 | j64) ^ j6))) + (j65 * (j66 | ((j67 | uptimeMillis3) ^ j6) | ((j68 | longValue11) ^ j6))) + 1818577512;
                            int uptimeMillis4 = (int) android.os.SystemClock.uptimeMillis();
                            int i421 = ((int) (j69 >> 32)) & ((-405830260) + (((~((~uptimeMillis4) | (-597738543))) | 839487868) * (-235)) + (((~((-597738543) | uptimeMillis4)) | 839487868) * (-470)) + (((~(uptimeMillis4 | (-27280387))) | 269029712) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE));
                            i21 = i;
                            int i422 = ((int) j69) & (2071109853 + (((~(977981604 | i21)) | (~(i23 | (-459244806)))) * (-1808)) + (((~(996136357 | i21)) | (~(i23 | (-441090053)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(459244805 | i21)) | 18154753 | (~(i23 | (-977981605)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                            if (((i421 & i422) | (i421 ^ i422)) != 0) {
                                int i423 = i418 + 171;
                                i44 = (~(i21 & i423)) & (i21 | i423);
                                break loop7;
                            }
                            i415 = (((i420 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1) - (i420 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)) - 121;
                            strArr5 = strArr6;
                            strArr23 = strArr7;
                            i44 = i21;
                            i414 = i416;
                            str45 = str8;
                            str52 = str11;
                            length = i41;
                            i34 = i37;
                            i35 = i419;
                        }
                        int i424 = i35;
                        int i425 = i44;
                        int i426 = i424 - 18;
                        strArr5 = strArr5;
                        i34 = i34;
                        i36 = 5;
                        c = 0;
                        i35 = ((i426 | 19) << 1) - (i426 ^ 19);
                        i44 = i425;
                    }
                    int i427 = i21 ^ i37;
                    int i428 = -i427;
                    int i429 = ((i427 & i428) | (i427 ^ i428)) >> 31;
                    int i430 = i44 & (~i429);
                    int i431 = i37 & i429;
                    int i432 = (i430 & i431) | (i430 ^ i431);
                    int i433 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i434 = (i433 ^ 2089) + ((i433 & 2089) << 1);
                    char c18 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i435 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i436 = (i435 ^ 13) + ((i435 & 13) << 1);
                    java.lang.Object[] objArr88 = new java.lang.Object[1];
                    a(i434, c18, i436, objArr88);
                    java.lang.String str53 = (java.lang.String) objArr88[0];
                    str9 = str8;
                    int i437 = -(-android.text.TextUtils.indexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                    java.lang.Object[] objArr89 = new java.lang.Object[1];
                    a(((i437 | 2102) << 1) - (i437 ^ 2102), (char) android.view.View.getDefaultSize(0, 0), 7 - (~(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))), objArr89);
                    str10 = (java.lang.String) objArr89[0];
                    file = new java.io.File(str53);
                    if (!(!file.exists()) && file.isFile()) {
                        try {
                            java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file));
                            int red5 = android.graphics.Color.red(0) + com.knotapi.knot.utilities.Constants.ID_KROGER;
                            int i438 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                            a(red5, (char) (((i438 | 1) << 1) - (i438 ^ 1)), 2 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr90);
                            java.util.Scanner useDelimiter2 = scanner2.useDelimiter((java.lang.String) objArr90[0]);
                            next = !useDelimiter2.hasNext() ? useDelimiter2.next() : str9;
                            useDelimiter2.close();
                        } catch (java.io.IOException unused2) {
                        }
                        if (next.contains(str10)) {
                            int i439 = getOutputMinFrameDuration + 79;
                            int i440 = i439 % 128;
                            getHighResolutionOutputSizeshNQ4ISI = i440;
                            int i441 = i439 % 2;
                            int i442 = (i440 & 115) + (i440 | 115);
                            getOutputMinFrameDuration = i442 % 128;
                            int i443 = i442 % 2;
                            i38 = i23;
                            i39 = (i21 & (-151)) | (i38 & 150);
                            int i444 = ((~i432) & i21) | (i432 & i38);
                            int i445 = -i444;
                            int i446 = ((i444 & i445) | (i444 ^ i445)) >> 31;
                            int i447 = i39 & (~i446);
                            int i448 = i432 & i446;
                            int i449 = (i448 & i447) | (i447 ^ i448);
                            java.lang.Object[] objArr91 = new java.lang.Object[1];
                            a(2109 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())), (char) android.graphics.Color.blue(0), 46 - (~(-android.view.View.resolveSizeAndState(0, 0, 0))), objArr91);
                            java.lang.Object[] objArr92 = {(java.lang.String) objArr91[0]};
                            Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1941710546);
                            if (Camera2StreamConfigurationMap3 == null) {
                            }
                            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr92)).longValue();
                            long j70 = -316647579;
                            long j71 = 85;
                            long j72 = (j71 * j70) + (j71 * longValue12);
                            long j73 = -84;
                            long j74 = j70 ^ j6;
                            long j75 = longValue12 ^ j6;
                            long j76 = j70 | longValue12;
                            long j77 = (j3 | longValue12) ^ j6;
                            long j78 = 817026962 + j72 + ((((j74 | j75) ^ j6) | ((j74 | j3) ^ j6) | ((j75 | j3) ^ j6) | ((j76 | j) ^ j6)) * j73) + (j73 * (j70 | ((j75 | j) ^ j6) | j77)) + (84 * ((j76 ^ j6) | j77));
                            int i450 = (~(815855240 | i38)) | 1226047812 | (~((-2041885645) | i38));
                            int i451 = ((int) (j78 >> 32)) & ((-1054308254) + (((~((-17409) | i21)) | i450) * 590) + (i450 * (-1180)) + (((~(i38 | (-815855241))) | (~(2041885644 | i38))) * 590));
                            int i452 = (int) j78;
                            int maxMemory2 = (int) java.lang.Runtime.getRuntime().maxMemory();
                            int i453 = ~maxMemory2;
                            int i454 = (~((-991672443) | i453)) | 723103834;
                            int i455 = ~(maxMemory2 | 2134637051);
                            int i456 = i452 & (783645393 + ((i454 | i455) * (-502)) + ((i455 | (~(i453 | (-268568609)))) * 502));
                            int i457 = (((i451 & i456) | (i451 ^ i456)) * 263) ^ i21;
                            int i458 = (~(i21 & i449)) & (i21 | i449);
                            int i459 = (i458 | (-i458)) >> 31;
                            int i460 = i457 & (~i459);
                            int i461 = i449 & i459;
                            i20 = (i460 ^ i461) | (i461 & i460);
                            strArr = strArr4;
                        }
                    }
                    i38 = i23;
                    int i462 = getOutputMinFrameDuration;
                    i40 = (i462 & 69) + (i462 | 69);
                    getHighResolutionOutputSizeshNQ4ISI = i40 % 128;
                    if (i40 % 2 != 0) {
                        int i463 = 47 / 0;
                    }
                    i39 = i21;
                    int i4442 = ((~i432) & i21) | (i432 & i38);
                    int i4452 = -i4442;
                    int i4462 = ((i4442 & i4452) | (i4442 ^ i4452)) >> 31;
                    int i4472 = i39 & (~i4462);
                    int i4482 = i432 & i4462;
                    int i4492 = (i4482 & i4472) | (i4472 ^ i4482);
                    java.lang.Object[] objArr912 = new java.lang.Object[1];
                    a(2109 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())), (char) android.graphics.Color.blue(0), 46 - (~(-android.view.View.resolveSizeAndState(0, 0, 0))), objArr912);
                    java.lang.Object[] objArr922 = {(java.lang.String) objArr912[0]};
                    Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1941710546);
                    if (Camera2StreamConfigurationMap3 == null) {
                    }
                    long longValue122 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr922)).longValue();
                    long j702 = -316647579;
                    long j712 = 85;
                    long j722 = (j712 * j702) + (j712 * longValue122);
                    long j732 = -84;
                    long j742 = j702 ^ j6;
                    long j752 = longValue122 ^ j6;
                    long j762 = j702 | longValue122;
                    long j772 = (j3 | longValue122) ^ j6;
                    long j782 = 817026962 + j722 + ((((j742 | j752) ^ j6) | ((j742 | j3) ^ j6) | ((j752 | j3) ^ j6) | ((j762 | j) ^ j6)) * j732) + (j732 * (j702 | ((j752 | j) ^ j6) | j772)) + (84 * ((j762 ^ j6) | j772));
                    int i4502 = (~(815855240 | i38)) | 1226047812 | (~((-2041885645) | i38));
                    int i4512 = ((int) (j782 >> 32)) & ((-1054308254) + (((~((-17409) | i21)) | i4502) * 590) + (i4502 * (-1180)) + (((~(i38 | (-815855241))) | (~(2041885644 | i38))) * 590));
                    int i4522 = (int) j782;
                    int maxMemory22 = (int) java.lang.Runtime.getRuntime().maxMemory();
                    int i4532 = ~maxMemory22;
                    int i4542 = (~((-991672443) | i4532)) | 723103834;
                    int i4552 = ~(maxMemory22 | 2134637051);
                    int i4562 = i4522 & (783645393 + ((i4542 | i4552) * (-502)) + ((i4552 | (~(i4532 | (-268568609)))) * 502));
                    int i4572 = (((i4512 & i4562) | (i4512 ^ i4562)) * 263) ^ i21;
                    int i4582 = (~(i21 & i4492)) & (i21 | i4492);
                    int i4592 = (i4582 | (-i4582)) >> 31;
                    int i4602 = i4572 & (~i4592);
                    int i4612 = i4492 & i4592;
                    i20 = (i4602 ^ i4612) | (i4612 & i4602);
                    strArr = strArr4;
                }
            }
            int bitsPerPixel2 = android.graphics.ImageFormat.getBitsPerPixel(0) + 373;
            int i464 = -(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int i465 = -android.graphics.Color.red(0);
            int i466 = ((i465 | 23) << 1) - (i465 ^ 23);
            java.lang.Object[] objArr93 = new java.lang.Object[1];
            a(bitsPerPixel2, (char) (((i464 | 15859) << 1) - (i464 ^ 15859)), i466, objArr93);
            java.lang.String str54 = (java.lang.String) objArr93[0];
            int i467 = 809 - (~(-android.graphics.Color.argb(0, 0, 0, 0)));
            char argb4 = (char) android.graphics.Color.argb(0, 0, 0, 0);
            int i468 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            int i469 = ((i468 | 11) << 1) - (i468 ^ 11);
            java.lang.Object[] objArr94 = new java.lang.Object[1];
            a(i467, argb4, i469, objArr94);
            java.lang.String str55 = (java.lang.String) objArr94[0];
            int i470 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 819;
            char green3 = (char) android.graphics.Color.green(0);
            int i471 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            java.lang.Object[] objArr95 = new java.lang.Object[1];
            a(i470, green3, (i471 & 7) + (i471 | 7), objArr95);
            java.lang.String str56 = (java.lang.String) objArr95[0];
            int keyRepeatTimeout2 = android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16;
            int i472 = ~keyRepeatTimeout2;
            int i473 = (((keyRepeatTimeout2 * (-183)) + 152995) - (~(-(-(((i472 & 827) | (i472 ^ 827)) * (-368)))))) - 1;
            int i474 = (keyRepeatTimeout2 ^ (-828)) | (keyRepeatTimeout2 & (-828));
            int i475 = ((i474 & i6) | (i474 ^ i6)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
            int i476 = ((i473 | i475) << 1) - (i473 ^ i475);
            int i477 = ~((~keyRepeatTimeout2) | (-828));
            int i478 = ~(i6 | keyRepeatTimeout2);
            int i479 = (i477 & i478) | (i477 ^ i478);
            int i480 = ~((keyRepeatTimeout2 & 827) | (keyRepeatTimeout2 ^ 827));
            int i481 = ((i480 & i479) | (i479 ^ i480)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
            java.lang.String str57 = str4;
            java.lang.Object[] objArr96 = new java.lang.Object[1];
            a(((i476 | i481) << 1) - (i481 ^ i476), (char) (android.text.TextUtils.indexOf(str57, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), (-16777208) - android.graphics.Color.rgb(0, 0, 0), objArr96);
            java.lang.String[] strArr24 = {str54, str55, str56, (java.lang.String) objArr96[0]};
            int i482 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
            int i483 = (i482 & 835) + (i482 | 835);
            int i484 = -(-android.text.TextUtils.indexOf(str57, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
            int i485 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
            int i486 = (i485 ^ 17) + ((i485 & 17) << 1);
            java.lang.Object[] objArr97 = new java.lang.Object[1];
            a(i483, (char) (((i484 | 29829) << 1) - (i484 ^ 29829)), i486, objArr97);
            java.lang.String str58 = (java.lang.String) objArr97[0];
            int i487 = -android.graphics.Color.blue(0);
            int indexOf9 = android.text.TextUtils.indexOf(str57, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            java.lang.Object[] objArr98 = new java.lang.Object[1];
            a((i487 ^ 852) + ((i487 & 852) << 1), (char) ((indexOf9 ^ 1) + ((indexOf9 & 1) << 1)), 6 - (~(-(-android.view.View.MeasureSpec.getSize(0)))), objArr98);
            java.lang.String str59 = (java.lang.String) objArr98[0];
            int i488 = -android.graphics.Color.rgb(0, 0, 0);
            java.lang.Object[] objArr99 = new java.lang.Object[1];
            a(((-16776357) ^ i488) + ((i488 & (-16776357)) << 1), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 7, objArr99);
            java.lang.String str60 = (java.lang.String) objArr99[0];
            java.lang.Object[] objArr100 = new java.lang.Object[1];
            a(866 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())), (char) android.graphics.Color.green(0), (-38) - (~android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr100);
            java.lang.String str61 = (java.lang.String) objArr100[0];
            int i489 = 876 - (~(-android.text.TextUtils.indexOf(str57, str57)));
            int i490 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
            int i491 = -(-android.text.TextUtils.lastIndexOf(str57, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
            java.lang.Object[] objArr101 = new java.lang.Object[1];
            a(i489, (char) (((i490 | 29511) << 1) - (i490 ^ 29511)), (i491 & 15) + (i491 | 15), objArr101);
            java.lang.String[] strArr25 = {str58, str59, str60, str61, (java.lang.String) objArr101[0]};
            int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(0, 0);
            int i492 = (absoluteGravity2 & 891) + (absoluteGravity2 | 891);
            char c19 = (char) (51727 - (~android.graphics.Color.red(0)));
            int i493 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
            int i494 = (i493 ^ 16) + ((i493 & 16) << 1);
            java.lang.Object[] objArr102 = new java.lang.Object[1];
            a(i492, c19, i494, objArr102);
            java.lang.String str62 = (java.lang.String) objArr102[0];
            int i495 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
            int i496 = (i495 ^ 907) + ((i495 & 907) << 1);
            int i497 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            java.lang.Object[] objArr103 = new java.lang.Object[1];
            a(i496, (char) ((i497 ^ 6114) + ((i497 & 6114) << 1)), 2 - android.text.TextUtils.indexOf(str57, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr103);
            java.lang.String str63 = (java.lang.String) objArr103[0];
            int i498 = 919 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            char c20 = (char) ((-2) - (~(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
            int alpha3 = android.graphics.Color.alpha(0);
            int i499 = ((alpha3 | 22) << 1) - (alpha3 ^ 22);
            java.lang.Object[] objArr104 = new java.lang.Object[1];
            a(i498, c20, i499, objArr104);
            java.lang.String str64 = (java.lang.String) objArr104[0];
            int i500 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            java.lang.Object[] objArr105 = new java.lang.Object[1];
            a(((i500 | 988) << 1) - (i500 ^ 988), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 25 - android.text.TextUtils.getTrimmedLength(str57), objArr105);
            java.lang.String str65 = (java.lang.String) objArr105[0];
            int i501 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
            java.lang.Object[] objArr106 = new java.lang.Object[1];
            a((i501 ^ 966) + ((i501 & 966) << 1), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 27 - (~(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0))), objArr106);
            j6 = j2;
            java.lang.String[] strArr26 = {str62, str63, str2, str64, str65, (java.lang.String) objArr106[0]};
            int i502 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
            java.lang.Object[] objArr107 = new java.lang.Object[1];
            a(((i502 | 994) << 1) - (i502 ^ 994), (char) (54262 - (~android.view.View.resolveSize(0, 0))), 11 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr107);
            java.lang.String str66 = (java.lang.String) objArr107[0];
            int i503 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i504 = ((i503 | 1003) << 1) - (i503 ^ 1003);
            char c21 = (char) (26244 - (~(-android.view.View.MeasureSpec.getMode(0))));
            int i505 = -android.graphics.Color.red(0);
            int i506 = ((i505 | 8) << 1) - (i505 ^ 8);
            java.lang.Object[] objArr108 = new java.lang.Object[1];
            a(i504, c21, i506, objArr108);
            java.lang.String str67 = (java.lang.String) objArr108[0];
            byte modifierMetaStateMask3 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
            int i507 = (modifierMetaStateMask3 ^ 1013) + ((modifierMetaStateMask3 & 1013) << 1);
            int i508 = -(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
            int i509 = -(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            java.lang.Object[] objArr109 = new java.lang.Object[1];
            a(i507, (char) (((i508 | (-48)) << 1) - (i508 ^ (-48))), ((i509 | 5) << 1) - (i509 ^ 5), objArr109);
            java.lang.String str68 = (java.lang.String) objArr109[0];
            int i510 = -(-android.view.View.MeasureSpec.getMode(0));
            java.lang.Object[] objArr110 = new java.lang.Object[1];
            a((i510 & 1018) + (i510 | 1018), (char) ((-android.widget.ExpandableListView.getPackedPositionChild(0L)) - 1), 5 - (~(-(android.view.ViewConfiguration.getTouchSlop() >> 8))), objArr110);
            java.lang.String[] strArr27 = {str66, str67, str68, (java.lang.String) objArr110[0]};
            int resolveSizeAndState5 = android.view.View.resolveSizeAndState(0, 0, 0) + 1024;
            char red6 = (char) android.graphics.Color.red(0);
            int i511 = -android.view.MotionEvent.axisFromString(str57);
            java.lang.Object[] objArr111 = new java.lang.Object[1];
            a(resolveSizeAndState5, red6, (i511 & 15) + (i511 | 15), objArr111);
            java.lang.String str69 = (java.lang.String) objArr111[0];
            int absoluteGravity3 = android.view.Gravity.getAbsoluteGravity(0, 0);
            int i512 = (absoluteGravity3 & 859) + (absoluteGravity3 | 859);
            char makeMeasureSpec = (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int i513 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int i514 = (i513 ^ 8) + ((i513 & 8) << 1);
            java.lang.Object[] objArr112 = new java.lang.Object[1];
            a(i512, makeMeasureSpec, i514, objArr112);
            java.lang.String str70 = (java.lang.String) objArr112[0];
            int argb5 = android.graphics.Color.argb(0, 0, 0, 0);
            int i515 = (argb5 * 55) - 88489;
            int i516 = ~argb5;
            int i517 = ~((i516 & 827) | (i516 ^ 827));
            int i518 = ~(i6 | 827);
            int i519 = ((i517 & i518) | (i517 ^ i518)) * (-108);
            int i520 = (i515 ^ i519) + ((i515 & i519) << 1);
            int i521 = ~argb5;
            int i522 = ~((i521 & i44) | (i521 ^ i44));
            int i523 = ~(((-828) ^ argb5) | ((-828) & argb5));
            int i524 = i522 | i523;
            int i525 = ~((argb5 & i7) | (i7 ^ argb5));
            int i526 = -(-(((i525 & i524) | (i524 ^ i525)) * 54));
            int i527 = (i520 ^ i526) + ((i526 & i520) << 1) + (((i44 ^ i523) | (i523 & i44)) * 54);
            char indexOf10 = (char) ((-1) - android.text.TextUtils.indexOf(str57, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
            int i528 = -android.widget.ExpandableListView.getPackedPositionType(0L);
            java.lang.Object[] objArr113 = new java.lang.Object[1];
            a(i527, indexOf10, (i528 & 8) + (i528 | 8), objArr113);
            java.lang.String[] strArr28 = {str69, str70, (java.lang.String) objArr113[0]};
            int i529 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i530 = ((i529 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_WATERMARK) << 1) - (i529 ^ org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_WATERMARK);
            int i531 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i532 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i533 = (i532 & 13) + (i532 | 13);
            java.lang.Object[] objArr114 = new java.lang.Object[1];
            a(i530, (char) (((39996 | i531) << 1) - (i531 ^ 39996)), i533, objArr114);
            java.lang.String str71 = (java.lang.String) objArr114[0];
            java.lang.Object[] objArr115 = new java.lang.Object[1];
            a(1053 - (~(android.view.ViewConfiguration.getTapTimeout() >> 16)), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr115);
            java.lang.String[] strArr29 = {str71, (java.lang.String) objArr115[0]};
            int packedPositionGroup4 = 1055 - android.widget.ExpandableListView.getPackedPositionGroup(0L);
            char resolveSizeAndState6 = (char) android.view.View.resolveSizeAndState(0, 0, 0);
            int i534 = -android.graphics.Color.blue(0);
            int i535 = ((i534 | 9) << 1) - (i534 ^ 9);
            java.lang.Object[] objArr116 = new java.lang.Object[1];
            a(packedPositionGroup4, resolveSizeAndState6, i535, objArr116);
            java.lang.String str72 = (java.lang.String) objArr116[0];
            int threadPriority2 = android.os.Process.getThreadPriority(0);
            java.lang.Object[] objArr117 = new java.lang.Object[1];
            a(1063 - (~(-((((threadPriority2 | 20) << 1) - (threadPriority2 ^ 20)) >> 6))), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr117);
            java.lang.String[] strArr30 = {str72, (java.lang.String) objArr117[0]};
            int i536 = -(-android.text.TextUtils.getOffsetBefore(str57, 0));
            int i537 = (i536 ^ org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_LAYER_COMPS) + ((i536 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_LAYER_COMPS) << 1);
            int i538 = -(-android.os.Process.getGidForName(str57));
            java.lang.Object[] objArr118 = new java.lang.Object[1];
            a(i537, (char) ((44770 & i538) + (i538 | 44770)), android.graphics.Color.red(0) + 16, objArr118);
            java.lang.String str73 = (java.lang.String) objArr118[0];
            int red7 = 907 - android.graphics.Color.red(0);
            int gidForName = android.os.Process.getGidForName(str57);
            int i539 = (i44 ^ 6116) | (i44 & 6116);
            int i540 = ~gidForName;
            int i541 = (((gidForName * 628) + 3840848) - (~(-(-(((i539 & i540) | (i539 ^ i540)) * (-627)))))) - 1;
            int i542 = ~(((-6117) ^ i44) | ((-6117) & i44));
            int i543 = i541 + (((i542 & gidForName) | (gidForName ^ i542)) * (-627));
            int i544 = ~((i7 ^ 6116) | (i7 & 6116));
            int i545 = ~(gidForName | i44);
            int i546 = -(-(((i545 & i544) | (i544 ^ i545)) * 627));
            char c22 = (char) ((i543 & i546) + (i546 | i543));
            int i547 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
            java.lang.Object[] objArr119 = new java.lang.Object[1];
            a(red7, c22, (i547 & 3) + (i547 | 3), objArr119);
            java.lang.String str74 = (java.lang.String) objArr119[0];
            int i548 = -(-android.os.Process.getGidForName(str57));
            java.lang.Object[] objArr120 = new java.lang.Object[1];
            a((i548 ^ 853) + ((i548 & 853) << 1), (char) ((-2) - ((-android.view.MotionEvent.axisFromString(str57)) ^ (-1))), 6 - (~(-(-android.graphics.Color.green(0)))), objArr120);
            java.lang.String str75 = (java.lang.String) objArr120[0];
            int i549 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            char lastIndexOf2 = (char) (android.text.TextUtils.lastIndexOf(str57, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1);
            int i550 = -android.graphics.ImageFormat.getBitsPerPixel(0);
            java.lang.Object[] objArr121 = new java.lang.Object[1];
            a((i549 & 1081) + (i549 | 1081), lastIndexOf2, ((i550 | 7) << 1) - (i550 ^ 7), objArr121);
            java.lang.String str76 = (java.lang.String) objArr121[0];
            int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout() >> 16;
            int i551 = ((tapTimeout2 | 866) << 1) - (tapTimeout2 ^ 866);
            char resolveSize4 = (char) android.view.View.resolveSize(0, 0);
            int i552 = -(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            java.lang.Object[] objArr122 = new java.lang.Object[1];
            a(i551, resolveSize4, (i552 & 11) + (i552 | 11), objArr122);
            java.lang.String str77 = (java.lang.String) objArr122[0];
            int i553 = 875 - (~(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int i554 = -(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            int i555 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            i22 = i7;
            java.lang.Object[] objArr123 = new java.lang.Object[1];
            a(i553, (char) ((i554 ^ 29511) + ((i554 & 29511) << 1)), (i555 ^ 13) + ((i555 & 13) << 1), objArr123);
            java.lang.String[] strArr31 = {str73, str74, str75, str76, str77, (java.lang.String) objArr123[0]};
            java.lang.Object[] objArr124 = new java.lang.Object[1];
            a(1089 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 20 - (~(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), objArr124);
            java.lang.String str78 = (java.lang.String) objArr124[0];
            int maximumDrawingCacheSize2 = (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1109;
            int i556 = -android.text.TextUtils.lastIndexOf(str57, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            java.lang.Object[] objArr125 = new java.lang.Object[1];
            a(maximumDrawingCacheSize2, (char) ((i556 ^ (-1)) + (i556 << 1)), android.view.KeyEvent.getDeadChar(0, 0) + 19, objArr125);
            java.lang.String str79 = (java.lang.String) objArr125[0];
            int lastIndexOf3 = android.text.TextUtils.lastIndexOf(str57, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            int i557 = (lastIndexOf3 & 1129) + (lastIndexOf3 | 1129);
            int edgeSlop2 = android.view.ViewConfiguration.getEdgeSlop() >> 16;
            int defaultSize = android.view.View.getDefaultSize(0, 0);
            int i558 = ((defaultSize | 31) << 1) - (defaultSize ^ 31);
            java.lang.Object[] objArr126 = new java.lang.Object[1];
            a(i557, (char) ((33735 ^ edgeSlop2) + ((edgeSlop2 & 33735) << 1)), i558, objArr126);
            java.lang.String str80 = (java.lang.String) objArr126[0];
            int edgeSlop3 = android.view.ViewConfiguration.getEdgeSlop() >> 16;
            int i559 = (edgeSlop3 ^ 1159) + ((edgeSlop3 & 1159) << 1);
            char deadChar = (char) android.view.KeyEvent.getDeadChar(0, 0);
            int i560 = -android.view.View.resolveSizeAndState(0, 0, 0);
            int i561 = ((i560 | 26) << 1) - (i560 ^ 26);
            java.lang.Object[] objArr127 = new java.lang.Object[1];
            a(i559, deadChar, i561, objArr127);
            java.lang.String str81 = (java.lang.String) objArr127[0];
            int i562 = 1184 - (~android.text.TextUtils.indexOf(str57, str57));
            int i563 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
            int i564 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
            int i565 = (i564 ^ 23) + ((i564 & 23) << 1);
            java.lang.Object[] objArr128 = new java.lang.Object[1];
            a(i562, (char) ((44652 ^ i563) + ((i563 & 44652) << 1)), i565, objArr128);
            java.lang.String str82 = (java.lang.String) objArr128[0];
            int i566 = -android.text.TextUtils.indexOf(str57, str57, 0);
            int i567 = (i566 & 1208) + (i566 | 1208);
            char red8 = (char) android.graphics.Color.red(0);
            int i568 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i569 = ((i568 | 33) << 1) - (i568 ^ 33);
            java.lang.Object[] objArr129 = new java.lang.Object[1];
            a(i567, red8, i569, objArr129);
            str5 = str57;
            int i570 = i6;
            java.lang.String[] strArr32 = {str78, str79, str80, str81, str82, (java.lang.String) objArr129[0], str2};
            java.lang.Object[] objArr130 = new java.lang.Object[1];
            a(1241 - (~android.widget.ExpandableListView.getPackedPositionChild(0L)), (char) (2995 - (android.os.Process.myTid() >> 22)), 11 - (~(-android.widget.ExpandableListView.getPackedPositionChild(0L))), objArr130);
            java.lang.String str83 = (java.lang.String) objArr130[0];
            java.lang.Object[] objArr131 = new java.lang.Object[1];
            a(android.os.Process.getGidForName(str5) + 821, (char) android.text.TextUtils.getOffsetAfter(str5, 0), android.text.TextUtils.indexOf(str5, str5, 0, 0) + 7, objArr131);
            java.lang.String[] strArr33 = {str83, (java.lang.String) objArr131[0]};
            int i571 = 1254 - (~(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
            char scrollBarFadeDuration4 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i572 = -(-(android.view.ViewConfiguration.getEdgeSlop() >> 16));
            int i573 = ((i572 | 30) << 1) - (i572 ^ 30);
            java.lang.Object[] objArr132 = new java.lang.Object[1];
            a(i571, scrollBarFadeDuration4, i573, objArr132);
            java.lang.String str84 = (java.lang.String) objArr132[0];
            int i574 = -android.view.KeyEvent.normalizeMetaState(0);
            java.lang.Object[] objArr133 = new java.lang.Object[1];
            a((i574 ^ 1284) + ((i574 & 1284) << 1), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 11 - android.view.KeyEvent.getDeadChar(0, 0), objArr133);
            java.lang.String[] strArr34 = {str84, (java.lang.String) objArr133[0]};
            int i575 = -android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr134 = new java.lang.Object[1];
            a((i575 ^ 1294) + ((i575 & 1294) << 1), (char) (0 - (~(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19, objArr134);
            java.lang.String str85 = (java.lang.String) objArr134[0];
            int i576 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i577 = (i576 & 1315) + (i576 | 1315);
            char maxKeyCode3 = (char) (android.view.KeyEvent.getMaxKeyCode() >> 16);
            int i578 = -android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            int i579 = (i578 ^ 4) + ((i578 & 4) << 1);
            java.lang.Object[] objArr135 = new java.lang.Object[1];
            a(i577, maxKeyCode3, i579, objArr135);
            java.lang.String[] strArr35 = {str85, (java.lang.String) objArr135[0]};
            java.lang.Object[] objArr136 = new java.lang.Object[1];
            a(1319 - android.text.TextUtils.indexOf(str5, str5, 0, 0), (char) (29203 - (~(-(-android.view.KeyEvent.normalizeMetaState(0))))), 18 - (~android.view.KeyEvent.getDeadChar(0, 0)), objArr136);
            java.lang.String[] strArr36 = {(java.lang.String) objArr136[0]};
            int i580 = 1336 - (~(-android.widget.ExpandableListView.getPackedPositionChild(0L)));
            char lastIndexOf4 = (char) (android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 52139);
            int fadingEdgeLength2 = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
            int highSpeedVideoSizes8 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$$ExternalSyntheticLambda11.getHighSpeedVideoSizes();
            int i581 = ~fadingEdgeLength2;
            int i582 = ~((i581 ^ (-17)) | (i581 & (-17)));
            int i583 = ~highSpeedVideoSizes8;
            int i584 = ~(((-17) ^ i583) | ((-17) & i583));
            int i585 = ((fadingEdgeLength2 * (-167)) - 2672) + (((i582 ^ i584) | (i584 & i582)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
            int i586 = (i581 ^ (-17)) | (i581 & (-17));
            int i587 = (i585 - (~((~((i586 & highSpeedVideoSizes8) | (i586 ^ highSpeedVideoSizes8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) - 1;
            int i588 = ~highSpeedVideoSizes8;
            int i589 = ~((i588 & i581) | (i581 ^ i588));
            int i590 = ~fadingEdgeLength2;
            int i591 = ~((i590 & 16) | (i590 ^ 16));
            int i592 = (i589 & i591) | (i589 ^ i591);
            int i593 = ~(((-17) ^ fadingEdgeLength2) | (fadingEdgeLength2 & (-17)) | highSpeedVideoSizes8);
            int i594 = (i587 - (~(-(-(((i592 & i593) | (i592 ^ i593)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))))) - 1;
            java.lang.Object[] objArr137 = new java.lang.Object[1];
            a(i580, lastIndexOf4, i594, objArr137);
            java.lang.String[] strArr37 = {(java.lang.String) objArr137[0]};
            int i595 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i596 = (i595 ^ 1355) + ((i595 & 1355) << 1);
            char capsMode = (char) android.text.TextUtils.getCapsMode(str5, 0, 0);
            int i597 = -(-android.text.TextUtils.indexOf(str5, str5, 0));
            java.lang.Object[] objArr138 = new java.lang.Object[1];
            a(i596, capsMode, (i597 & 19) + (i597 | 19), objArr138);
            java.lang.String[] strArr38 = {(java.lang.String) objArr138[0]};
            int i598 = -(-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
            int i599 = (i598 & 1374) + (i598 | 1374);
            int i600 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
            int i601 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i602 = (i601 & 19) + (i601 | 19);
            java.lang.Object[] objArr139 = new java.lang.Object[1];
            a(i599, (char) ((64478 ^ i600) + ((i600 & 64478) << 1)), i602, objArr139);
            java.lang.String[] strArr39 = {(java.lang.String) objArr139[0]};
            int i603 = 1391 - (~(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
            int i604 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i605 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            java.lang.Object[] objArr140 = new java.lang.Object[1];
            a(i603, (char) (((i604 | 16317) << 1) - (i604 ^ 16317)), (i605 & 23) + (i605 | 23), objArr140);
            java.lang.String[] strArr40 = {(java.lang.String) objArr140[0]};
            java.lang.Object[] objArr141 = new java.lang.Object[1];
            a(1414 - (~(-android.view.View.resolveSize(0, 0))), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 21 - android.graphics.Color.alpha(0), objArr141);
            java.lang.String[] strArr41 = {(java.lang.String) objArr141[0]};
            int i606 = 1435 - (~android.text.TextUtils.getOffsetAfter(str5, 0));
            char c23 = (char) (53421 - (~(-(-android.view.KeyEvent.getDeadChar(0, 0)))));
            int minimumFlingVelocity2 = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
            int i607 = (minimumFlingVelocity2 ^ 24) + ((minimumFlingVelocity2 & 24) << 1);
            java.lang.Object[] objArr142 = new java.lang.Object[1];
            a(i606, c23, i607, objArr142);
            java.lang.String str86 = str2;
            java.lang.String[] strArr42 = {(java.lang.String) objArr142[0], str86};
            int defaultSize2 = 1460 - android.view.View.getDefaultSize(0, 0);
            char myTid7 = (char) (android.os.Process.myTid() >> 22);
            int deadChar2 = android.view.KeyEvent.getDeadChar(0, 0);
            int highSpeedVideoSizes9 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$$ExternalSyntheticLambda11.getHighSpeedVideoSizes();
            int i608 = (deadChar2 * (-1335)) - 18676;
            int i609 = ~((deadChar2 ^ highSpeedVideoSizes9) | (deadChar2 & highSpeedVideoSizes9));
            int i610 = (((-29) ^ i609) | ((-29) & i609)) * (-668);
            int i611 = (i608 & i610) + (i608 | i610);
            int i612 = ~(((-29) ^ highSpeedVideoSizes9) | ((-29) & highSpeedVideoSizes9));
            int i613 = -(-(((i612 & deadChar2) | (deadChar2 ^ i612)) * 1336));
            int i614 = deadChar2 | highSpeedVideoSizes9;
            java.lang.Object[] objArr143 = new java.lang.Object[1];
            a(defaultSize2, myTid7, (((i611 | i613) << 1) - (i611 ^ i613)) + (((i614 & (-29)) | (i614 ^ (-29))) * 668), objArr143);
            java.lang.String[] strArr43 = {(java.lang.String) objArr143[0], str86};
            int windowTouchSlop = 1488 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
            int i615 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
            int i616 = -(-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
            int i617 = (i616 ^ 28) + ((i616 & 28) << 1);
            java.lang.Object[] objArr144 = new java.lang.Object[1];
            a(windowTouchSlop, (char) ((37757 & i615) + (i615 | 37757)), i617, objArr144);
            java.lang.String[] strArr44 = {(java.lang.String) objArr144[0], str86};
            int scrollBarSize2 = 1515 - (android.view.ViewConfiguration.getScrollBarSize() >> 8);
            char pressedStateDuration4 = (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 59665);
            int i618 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i619 = (i618 ^ 31) + ((i618 & 31) << 1);
            java.lang.Object[] objArr145 = new java.lang.Object[1];
            a(scrollBarSize2, pressedStateDuration4, i619, objArr145);
            java.lang.String[] strArr45 = {(java.lang.String) objArr145[0], str86};
            int i620 = 1545 - (~(-android.graphics.Color.red(0)));
            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
            int i621 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i622 = ((i621 | 26) << 1) - (i621 ^ 26);
            java.lang.Object[] objArr146 = new java.lang.Object[1];
            a(i620, (char) ((doubleTapTimeout ^ 9080) + ((doubleTapTimeout & 9080) << 1)), i622, objArr146);
            java.lang.String[] strArr46 = {(java.lang.String) objArr146[0], str86};
            int fadingEdgeLength3 = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
            int i623 = ((fadingEdgeLength3 | 1573) << 1) - (fadingEdgeLength3 ^ 1573);
            char c24 = (char) (25140 - (~(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
            int minimumFlingVelocity3 = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
            java.lang.Object[] objArr147 = new java.lang.Object[1];
            a(i623, c24, (minimumFlingVelocity3 & 32) + (minimumFlingVelocity3 | 32), objArr147);
            int i624 = 0;
            java.lang.String[][] strArr47 = {strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, strArr46, new java.lang.String[]{(java.lang.String) objArr147[0], str86}};
            int i625 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i626 = ((i625 | 1605) << 1) - (i625 ^ 1605);
            int i627 = -(-android.graphics.Color.red(0));
            java.lang.Object[] objArr148 = new java.lang.Object[1];
            a(i626, (char) (((i627 | 27544) << 1) - (i627 ^ 27544)), 0 - (~android.view.View.resolveSizeAndState(0, 0, 0)), objArr148);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder((java.lang.String) objArr148[0]);
            int i628 = i44;
            int i629 = 0;
            int i630 = 0;
            while (i629 < 24) {
                com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$$ExternalSyntheticLambda11.getHighSpeedVideoSizes();
                java.lang.String[] strArr48 = strArr47[i629];
                java.lang.Object[] objArr149 = {strArr48[i624]};
                java.lang.Object Camera2StreamConfigurationMap18 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-452611245);
                if (Camera2StreamConfigurationMap18 == null) {
                    char c25 = (char) ((android.widget.ExpandableListView.getPackedPositionForChild(i624, i624) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i624, i624) == 0L ? 0 : -1)) + 12709);
                    strArr3 = strArr47;
                    int offsetBefore = 287 - android.text.TextUtils.getOffsetBefore(str5, i624);
                    int indexOf11 = android.text.TextUtils.indexOf(str5, str5, i624, i624) + 18;
                    i26 = i228;
                    byte b17 = (byte) ($$a[4] + 1);
                    i28 = i628;
                    sb = sb3;
                    i27 = i630;
                    java.lang.Object[] objArr150 = new java.lang.Object[1];
                    b(b17, (byte) (b17 + 1), r21[5], objArr150);
                    Camera2StreamConfigurationMap18 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c25, offsetBefore, indexOf11, 2013622867, false, (java.lang.String) objArr150[0], new java.lang.Class[]{java.lang.String.class});
                } else {
                    i26 = i228;
                    strArr3 = strArr47;
                    sb = sb3;
                    i27 = i630;
                    i28 = i628;
                }
                java.lang.String str87 = (java.lang.String) ((java.lang.reflect.Method) Camera2StreamConfigurationMap18).invoke(null, objArr149);
                java.lang.String[] strArr49 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr48, 1, strArr48.length);
                if (str87 == null || str87.isEmpty()) {
                    i29 = i570;
                } else {
                    if (strArr48.length != 1) {
                        java.lang.Object[] objArr151 = {str87, strArr49};
                        java.lang.Object Camera2StreamConfigurationMap19 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-606841456);
                        if (Camera2StreamConfigurationMap19 == null) {
                            char axisFromString = (char) ((-1) - android.view.MotionEvent.axisFromString(str5));
                            int resolveSize5 = android.view.View.resolveSize(0, 0) + 538;
                            int i631 = 5 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte[] bArr9 = $$a;
                            byte b18 = (byte) (bArr9[4] + 1);
                            str6 = str87;
                            java.lang.Object[] objArr152 = new java.lang.Object[1];
                            b(b18, (byte) (b18 + 1), (byte) bArr9.length, objArr152);
                            Camera2StreamConfigurationMap19 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(axisFromString, resolveSize5, i631, 1188336784, false, (java.lang.String) objArr152[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
                        } else {
                            str6 = str87;
                        }
                        long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap19).invoke(null, objArr151)).longValue();
                        long j79 = 476666667;
                        i29 = i570;
                        long nextInt3 = new java.util.Random().nextInt(2118137037);
                        long j80 = ((-300) * j79) + (j5 * longValue13) + ((((j79 | longValue13) | nextInt3) ^ j6) * j37);
                        long j81 = longValue13 ^ j6;
                        long j82 = ((j80 + ((((j81 | nextInt3) ^ j6) | (((nextInt3 ^ j6) | j79) ^ j6)) * j37)) + ((j81 | (((j79 ^ j6) | nextInt3) ^ j6)) * j39)) - 1446260184;
                        int i632 = getHighResolutionOutputSizeshNQ4ISI;
                        int i633 = (i632 & 99) + (i632 | 99);
                        getOutputMinFrameDuration = i633 % 128;
                        if (i633 % 2 == 0) {
                            int nextInt4 = new java.util.Random().nextInt(1076658999);
                            i31 = ((int) (j82 >> 84)) & ((((~(1987034871 | nextInt4)) | 537199648) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1955200610 + ((~((~nextInt4) | 1987034871)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                        } else {
                            i31 = ((int) (j82 >> 32)) & (((((~(2013265915 | i44)) | 34881920) * 449) - 2103669850) + ((34881920 | (~(i29 | 2013265915))) * 449));
                        }
                        int i634 = ((int) j82) & (((((~(1538369971 | i44)) | (-1605893564)) * (-283)) - 638571647) + ((~((-67523593) | i44)) * 283));
                    } else {
                        i29 = i570;
                        str6 = str87;
                    }
                    int i635 = i629 + 10;
                    i628 = ((~i635) & i44) | (i635 & i29);
                    int i636 = ((i27 | (-24)) << 1) - (i27 ^ (-24));
                    int i637 = (i636 ^ 25) + ((i636 & 25) << 1);
                    if (i637 > 1) {
                        int i638 = 1604 - (~(-android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                        int i639 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        i30 = 0;
                        int i640 = -(-android.graphics.Color.blue(0));
                        int i641 = (i640 ^ 2) + ((i640 & 2) << 1);
                        java.lang.Object[] objArr153 = new java.lang.Object[1];
                        a(i638, (char) (((i639 | 50166) << 1) - (i639 ^ 50166)), i641, objArr153);
                        sb2 = sb;
                        sb2.append((java.lang.String) objArr153[0]);
                    } else {
                        sb2 = sb;
                        i30 = 0;
                    }
                    sb2.append(strArr48[i30]);
                    int resolveSize6 = android.view.View.resolveSize(i30, i30);
                    int i642 = (resolveSize6 & 1608) + (resolveSize6 | 1608);
                    char jumpTapTimeout2 = (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i643 = -android.graphics.drawable.Drawable.resolveOpacity(i30, i30);
                    int i644 = ((i643 | 1) << 1) - (i643 ^ 1);
                    java.lang.Object[] objArr154 = new java.lang.Object[1];
                    a(i642, jumpTapTimeout2, i644, objArr154);
                    sb2.append((java.lang.String) objArr154[i30]);
                    sb2.append(str6);
                    i630 = i637;
                    i629 = ((i629 ^ 116) + ((i629 & 116) << 1)) - 115;
                    strArr47 = strArr3;
                    sb3 = sb2;
                    i570 = i29;
                    i228 = i26;
                    i624 = 0;
                }
                sb2 = sb;
                i628 = i28;
                i630 = i27;
                i629 = ((i629 ^ 116) + ((i629 & 116) << 1)) - 115;
                strArr47 = strArr3;
                sb3 = sb2;
                i570 = i29;
                i228 = i26;
                i624 = 0;
            }
            int i645 = i228;
            i23 = i570;
            java.lang.StringBuilder sb4 = sb3;
            int i646 = i628;
            int i647 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i648 = (i647 ^ 1609) + ((i647 & 1609) << 1);
            int i649 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            char c26 = (char) ((i649 & 48) + (i649 | 48));
            int rgb2 = android.graphics.Color.rgb(0, 0, 0);
            int i650 = (rgb2 ^ 16777217) + ((rgb2 & 16777217) << 1);
            java.lang.Object[] objArr155 = new java.lang.Object[1];
            a(i648, c26, i650, objArr155);
            sb4.append((java.lang.String) objArr155[0]);
            java.lang.Object[] objArr156 = new java.lang.Object[2];
            if (i630 > 2) {
                objArr156[1] = new int[1];
                java.lang.String[] strArr50 = {sb4.toString()};
                ((int[]) objArr156[1])[0] = i646;
                objArr156[0] = strArr50;
            } else {
                objArr156[1] = new int[]{i44};
                objArr156[0] = new java.lang.String[0];
            }
            int i651 = ((int[]) objArr156[1])[0];
            int i652 = (~(i44 & i645)) & (i44 | i645);
            int i653 = (i652 | (-i652)) >> 31;
            int i654 = i651 & (~i653);
            int i655 = i645 & i653;
            i24 = (i654 & i655) | (i654 ^ i655);
            i25 = 0;
            strArr2 = (java.lang.String[]) objArr156[0];
            int i2352 = -android.view.View.resolveSize(i25, i25);
            int i2362 = ((i2352 | 891) << 1) - (i2352 ^ 891);
            char c102 = (char) ((android.widget.ExpandableListView.getPackedPositionForChild(i25, i25) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i25, i25) == 0L ? 0 : -1)) + 51729);
            int resolveSize22 = android.view.View.resolveSize(i25, i25);
            int i2372 = ((resolveSize22 | 16) << 1) - (resolveSize22 ^ 16);
            java.lang.Object[] objArr462 = new java.lang.Object[1];
            a(i2362, c102, i2372, objArr462);
            java.lang.Object[] objArr472 = {(java.lang.String) objArr462[i25]};
            Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-452611245);
            if (Camera2StreamConfigurationMap2 == null) {
            }
            invoke = ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr472);
            if (invoke != null) {
            }
            if (i33 != 1986687685) {
            }
            str7 = str5;
            i34 = i32;
            int i3542 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
            char resolveOpacity2 = (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0);
            java.lang.String str452 = str7;
            int i3552 = -android.text.TextUtils.indexOf(str452, str452, 0, 0);
            int i3562 = ((i3552 | 13) << 1) - (i3552 ^ 13);
            java.lang.Object[] objArr752 = new java.lang.Object[1];
            a(((i3542 | 1952) << 1) - (i3542 ^ 1952), resolveOpacity2, i3562, objArr752);
            java.lang.String str462 = (java.lang.String) objArr752[0];
            int i3572 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i3582 = (i3572 & 1965) + (i3572 | 1965);
            int i3592 = -(-android.widget.ExpandableListView.getPackedPositionType(0L));
            int i3602 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
            int i3612 = i3602 * 829;
            int i3622 = ((i3612 | 4145) << 1) - (i3612 ^ 4145);
            int i3632 = ~((~i3602) | (-6));
            int i3642 = (i23 ^ i3602) | (i23 & i3602);
            int i3652 = ~((i3642 & 5) | (i3642 ^ 5));
            int i3662 = -(-(((i3632 & i3652) | (i3632 ^ i3652)) * (-828)));
            int i3672 = (i3602 & 5) | (i3602 ^ 5);
            int i3682 = (((i3622 | i3662) << 1) - (i3662 ^ i3622)) + (((i3672 ^ i23) | (i3672 & i23)) * (-828));
            int i3692 = (~i3672) * 828;
            int i3702 = ((i3682 | i3692) << 1) - (i3692 ^ i3682);
            java.lang.Object[] objArr762 = new java.lang.Object[1];
            a(i3582, (char) (((i3592 | 49437) << 1) - (i3592 ^ 49437)), i3702, objArr762);
            java.lang.String[] strArr182 = {str462, (java.lang.String) objArr762[0]};
            int i3712 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int highSpeedVideoSizes72 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$$ExternalSyntheticLambda11.getHighSpeedVideoSizes();
            int i3722 = i3712 * (-518);
            int i3732 = (i3722 & (-1020460)) + (i3722 | (-1020460));
            int i3742 = ~i3712;
            int i3752 = ~((~highSpeedVideoSizes72) | i3742);
            int i3762 = i3732 + (((i3752 & 1970) | (i3752 ^ 1970)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE);
            int i3772 = ~highSpeedVideoSizes72;
            int i3782 = (i3742 & i3772) | (i3742 ^ i3772);
            int i3792 = ~((i3782 & 1970) | (i3782 ^ 1970));
            int i3802 = (i3712 ^ 1970) | (i3712 & 1970);
            int i3812 = ~((i3802 & highSpeedVideoSizes72) | (i3802 ^ highSpeedVideoSizes72));
            int i3822 = -(-(((i3792 & i3812) | (i3792 ^ i3812)) * (-519)));
            int i3832 = (i3762 ^ i3822) + ((i3822 & i3762) << 1);
            int i3842 = ~((highSpeedVideoSizes72 & 1970) | (highSpeedVideoSizes72 ^ 1970));
            int i3852 = -(-(((i3712 & i3842) | (i3712 ^ i3842)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
            int resolveSizeAndState32 = android.view.View.resolveSizeAndState(0, 0, 0);
            java.lang.Object[] objArr772 = new java.lang.Object[1];
            a((i3832 ^ i3852) + ((i3852 & i3832) << 1), (char) ((resolveSizeAndState32 ^ 14000) + ((resolveSizeAndState32 & 14000) << 1)), 15 - android.view.View.resolveSize(0, 0), objArr772);
            java.lang.String str472 = (java.lang.String) objArr772[0];
            int indexOf72 = android.text.TextUtils.indexOf(str452, str452, 0) + 1985;
            int alpha22 = android.graphics.Color.alpha(0);
            char c172 = (char) ((alpha22 ^ 44097) + ((44097 & alpha22) << 1));
            int i3862 = -(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
            int i3872 = ((i3862 | (-29)) << 1) - (i3862 ^ (-29));
            java.lang.Object[] objArr782 = new java.lang.Object[1];
            a(indexOf72, c172, i3872, objArr782);
            java.lang.String str482 = (java.lang.String) objArr782[0];
            int i3882 = -android.text.TextUtils.indexOf(str452, str452, 0);
            int i3892 = (i3882 & androidx.media3.common.PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS) + (i3882 | androidx.media3.common.PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS);
            char resolveSizeAndState42 = (char) android.view.View.resolveSizeAndState(0, 0, 0);
            int i3902 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            java.lang.Object[] objArr792 = new java.lang.Object[1];
            a(i3892, resolveSizeAndState42, (i3902 & 13) + (i3902 | 13), objArr792);
            java.lang.String[] strArr192 = {str472, str482, (java.lang.String) objArr792[0]};
            int i3912 = 2017 - (~(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            char argb32 = (char) (android.graphics.Color.argb(0, 0, 0, 0) + 19557);
            int i3922 = -android.view.View.MeasureSpec.getMode(0);
            java.lang.Object[] objArr802 = new java.lang.Object[1];
            a(i3912, argb32, (i3922 & 21) + (i3922 | 21), objArr802);
            java.lang.String str492 = (java.lang.String) objArr802[0];
            java.lang.Object[] objArr812 = new java.lang.Object[1];
            a(2037 - (~(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (char) (17642 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), android.view.MotionEvent.axisFromString(str452) + 11, objArr812);
            java.lang.String[] strArr202 = {str492, (java.lang.String) objArr812[0]};
            int i3932 = -(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
            int i3942 = (i3932 & 2049) + (i3932 | 2049);
            char longPressTimeout32 = (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
            int indexOf82 = android.text.TextUtils.indexOf(str452, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            int i3952 = ((indexOf82 | 12) << 1) - (indexOf82 ^ 12);
            java.lang.Object[] objArr822 = new java.lang.Object[1];
            a(i3942, longPressTimeout32, i3952, objArr822);
            java.lang.String str502 = (java.lang.String) objArr822[0];
            int i3962 = -(-android.text.TextUtils.getOffsetAfter(str452, 0));
            int i3972 = (i3962 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED) + ((i3962 & com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED) << 1);
            int i3982 = -android.graphics.Color.red(0);
            int i3992 = -(-android.text.TextUtils.indexOf(str452, str452, 0, 0));
            int i4002 = (i3992 ^ 6) + ((i3992 & 6) << 1);
            java.lang.Object[] objArr832 = new java.lang.Object[1];
            a(i3972, (char) ((i3982 ^ 3429) + ((i3982 & 3429) << 1)), i4002, objArr832);
            java.lang.String[] strArr212 = {str502, (java.lang.String) objArr832[0]};
            int i4012 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
            java.lang.Object[] objArr842 = new java.lang.Object[1];
            a(((i4012 | 2060) << 1) - (i4012 ^ 2060), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 38763), 27 - (~(-android.view.View.MeasureSpec.getMode(0))), objArr842);
            java.lang.String str512 = (java.lang.String) objArr842[0];
            int touchSlop32 = 2039 - (android.view.ViewConfiguration.getTouchSlop() >> 8);
            int i4022 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i4032 = -android.view.Gravity.getAbsoluteGravity(0, 0);
            int i4042 = (i4032 * (-520)) + 5220;
            int i4052 = ~i4032;
            int i4062 = -(-((~((i4052 ^ 10) | (i4052 & 10) | i44)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
            int i4072 = ((i4042 | i4062) << 1) - (i4062 ^ i4042);
            int i4082 = (~(((-11) & i4032) | ((-11) ^ i4032))) * (-1042);
            int i4092 = (i4072 ^ i4082) + ((i4072 & i4082) << 1);
            int i4102 = ~((-11) | i4032);
            int i4112 = ~i4032;
            int i4122 = ~((i4112 ^ i23) | (i4112 & i23) | 10);
            int i4132 = i4092 + (((i4102 ^ i4122) | (i4102 & i4122)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL);
            java.lang.Object[] objArr852 = new java.lang.Object[1];
            a(touchSlop32, (char) ((i4022 ^ 17642) + ((i4022 & 17642) << 1)), i4132, objArr852);
            c = 0;
            strArr5 = new java.lang.String[][]{strArr182, strArr192, strArr202, strArr212, new java.lang.String[]{str512, (java.lang.String) objArr852[0]}};
            i35 = 0;
            i36 = 5;
            int i4142 = -1;
            loop7: while (true) {
                if (i35 < i36) {
                }
                int i4242 = i35;
                int i4252 = i44;
                int i4262 = i4242 - 18;
                strArr5 = strArr5;
                i34 = i34;
                i36 = 5;
                c = 0;
                i35 = ((i4262 | 19) << 1) - (i4262 ^ 19);
                i44 = i4252;
            }
            int i4272 = i21 ^ i37;
            int i4282 = -i4272;
            int i4292 = ((i4272 & i4282) | (i4272 ^ i4282)) >> 31;
            int i4302 = i44 & (~i4292);
            int i4312 = i37 & i4292;
            int i4322 = (i4302 & i4312) | (i4302 ^ i4312);
            int i4332 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i4342 = (i4332 ^ 2089) + ((i4332 & 2089) << 1);
            char c182 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i4352 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i4362 = (i4352 ^ 13) + ((i4352 & 13) << 1);
            java.lang.Object[] objArr882 = new java.lang.Object[1];
            a(i4342, c182, i4362, objArr882);
            java.lang.String str532 = (java.lang.String) objArr882[0];
            str9 = str8;
            int i4372 = -(-android.text.TextUtils.indexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
            java.lang.Object[] objArr892 = new java.lang.Object[1];
            a(((i4372 | 2102) << 1) - (i4372 ^ 2102), (char) android.view.View.getDefaultSize(0, 0), 7 - (~(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))), objArr892);
            str10 = (java.lang.String) objArr892[0];
            file = new java.io.File(str532);
            if (!(!file.exists())) {
                java.util.Scanner scanner22 = new java.util.Scanner(new java.io.FileInputStream(file));
                int red52 = android.graphics.Color.red(0) + com.knotapi.knot.utilities.Constants.ID_KROGER;
                int i4382 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                java.lang.Object[] objArr902 = new java.lang.Object[1];
                a(red52, (char) (((i4382 | 1) << 1) - (i4382 ^ 1)), 2 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr902);
                java.util.Scanner useDelimiter22 = scanner22.useDelimiter((java.lang.String) objArr902[0]);
                if (!useDelimiter22.hasNext()) {
                }
                useDelimiter22.close();
                if (next.contains(str10)) {
                }
            }
            i38 = i23;
            int i4622 = getOutputMinFrameDuration;
            i40 = (i4622 & 69) + (i4622 | 69);
            getHighResolutionOutputSizeshNQ4ISI = i40 % 128;
            if (i40 % 2 != 0) {
            }
            i39 = i21;
            int i44422 = ((~i4322) & i21) | (i4322 & i38);
            int i44522 = -i44422;
            int i44622 = ((i44422 & i44522) | (i44422 ^ i44522)) >> 31;
            int i44722 = i39 & (~i44622);
            int i44822 = i4322 & i44622;
            int i44922 = (i44822 & i44722) | (i44722 ^ i44822);
            java.lang.Object[] objArr9122 = new java.lang.Object[1];
            a(2109 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())), (char) android.graphics.Color.blue(0), 46 - (~(-android.view.View.resolveSizeAndState(0, 0, 0))), objArr9122);
            java.lang.Object[] objArr9222 = {(java.lang.String) objArr9122[0]};
            Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1941710546);
            if (Camera2StreamConfigurationMap3 == null) {
            }
            long longValue1222 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr9222)).longValue();
            long j7022 = -316647579;
            long j7122 = 85;
            long j7222 = (j7122 * j7022) + (j7122 * longValue1222);
            long j7322 = -84;
            long j7422 = j7022 ^ j6;
            long j7522 = longValue1222 ^ j6;
            long j7622 = j7022 | longValue1222;
            long j7722 = (j3 | longValue1222) ^ j6;
            long j7822 = 817026962 + j7222 + ((((j7422 | j7522) ^ j6) | ((j7422 | j3) ^ j6) | ((j7522 | j3) ^ j6) | ((j7622 | j) ^ j6)) * j7322) + (j7322 * (j7022 | ((j7522 | j) ^ j6) | j7722)) + (84 * ((j7622 ^ j6) | j7722));
            int i45022 = (~(815855240 | i38)) | 1226047812 | (~((-2041885645) | i38));
            int i45122 = ((int) (j7822 >> 32)) & ((-1054308254) + (((~((-17409) | i21)) | i45022) * 590) + (i45022 * (-1180)) + (((~(i38 | (-815855241))) | (~(2041885644 | i38))) * 590));
            int i45222 = (int) j7822;
            int maxMemory222 = (int) java.lang.Runtime.getRuntime().maxMemory();
            int i45322 = ~maxMemory222;
            int i45422 = (~((-991672443) | i45322)) | 723103834;
            int i45522 = ~(maxMemory222 | 2134637051);
            int i45622 = i45222 & (783645393 + ((i45422 | i45522) * (-502)) + ((i45522 | (~(i45322 | (-268568609)))) * 502));
            int i45722 = (((i45122 & i45622) | (i45122 ^ i45622)) * 263) ^ i21;
            int i45822 = (~(i21 & i44922)) & (i21 | i44922);
            int i45922 = (i45822 | (-i45822)) >> 31;
            int i46022 = i45722 & (~i45922);
            int i46122 = i44922 & i45922;
            i20 = (i46022 ^ i46122) | (i46122 & i46022);
            strArr = strArr4;
        } else {
            i21 = i44;
            strArr = null;
        }
        java.lang.Object[] objArr157 = {new int[]{i21}, new int[1], strArr, new int[]{i20}};
        int i656 = (~(i21 & i20)) & (i21 | i20);
        int i657 = -i656;
        int i658 = (((i656 & i657) | (i656 ^ i657)) >> 31) & 16;
        int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
        int i659 = ~((-373327125) | freeMemory);
        int i660 = ~freeMemory;
        int i661 = (-2110240486) + ((i659 | (~((-1101140131) | i660))) * 920) + (((~((-373870421) | i660)) | 373327124) * 920) + (((~(freeMemory | (-1101140131))) | (~((-373327125) | i660)) | (~((-543297) | freeMemory))) * 920);
        int i662 = -(-i658);
        int i663 = (i661 ^ i662) + ((i662 & i661) << 1);
        int i664 = ((i3 | i663) << 1) - (i3 ^ i663);
        int i665 = i664 << 13;
        int i666 = ((~i664) & i665) | ((~i665) & i664);
        int i667 = i666 ^ (i666 >>> 17);
        int i668 = i667 << 5;
        ((int[]) objArr157[1])[0] = ((~i667) & i668) | ((~i668) & i667);
        return objArr157;
        i12 = i44;
        int i1692 = (~(i44 & i155)) & (i44 | i155);
        int i1702 = (i1692 | (-i1692)) >> 31;
        int i1712 = (i155 & i1702) | (i12 & (~i1702));
        if ((i2 & 8) == 0) {
        }
        java.lang.String[] strArr152 = new java.lang.String[2];
        int i1882 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
        java.lang.Object[] objArr342 = new java.lang.Object[1];
        a((i1882 ^ 739) + ((i1882 & 739) << 1), (char) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), 41 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr342);
        strArr152[0] = (java.lang.String) objArr342[0];
        int i1892 = getHighResolutionOutputSizeshNQ4ISI;
        int i1902 = (i1892 & 13) + (i1892 | 13);
        getOutputMinFrameDuration = i1902 % 128;
        int i1912 = i1902 % 2;
        int indexOf42 = android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        int highSpeedVideoSizes32 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$$ExternalSyntheticLambda11.getHighSpeedVideoSizes();
        int i1922 = (indexOf42 * 46) - (-35926);
        int i1932 = getHighResolutionOutputSizeshNQ4ISI;
        int i1942 = (i1932 ^ 117) + ((i1932 & 117) << 1);
        int i1952 = i1942 % 128;
        getOutputMinFrameDuration = i1952;
        int i1962 = i1942 % 2;
        int i1972 = ~highSpeedVideoSizes32;
        int i1982 = ~(((-782) ^ i1972) | ((-782) & i1972));
        int i1992 = -(-(((indexOf42 ^ i1982) | (i1982 & indexOf42)) * (-90)));
        int i2002 = ((i1922 | i1992) << 1) - (i1922 ^ i1992);
        int i2012 = ~(((-782) ^ highSpeedVideoSizes32) | ((-782) & highSpeedVideoSizes32));
        int i2022 = ~((indexOf42 ^ 781) | (indexOf42 & 781));
        int i2032 = (i2002 - (~(-(-(((i2012 & i2022) | (i2012 ^ i2022)) * (-45)))))) - 1;
        int i2042 = ~indexOf42;
        int i2052 = ~((i2042 & highSpeedVideoSizes32) | (i2042 ^ highSpeedVideoSizes32));
        i13 = ((i1952 | 17) << 1) - (i1952 ^ 17);
        getHighResolutionOutputSizeshNQ4ISI = i13 % 128;
        if (i13 % 2 == 0) {
        }
        int i2112 = i15 + (keyRepeatTimeout >> 16);
        java.lang.Object[] objArr352 = new java.lang.Object[i14];
        a(i16, packedPositionType, i2112, objArr352);
        strArr152[i14] = (java.lang.String) objArr352[0];
        i17 = 0;
        while (i17 < 2) {
        }
        str4 = str3;
        i18 = i1712;
        i19 = i44;
        int i2202 = ((~i18) & i44) | (i18 & i6);
        int i2212 = -i2202;
        int i2222 = ((i2202 & i2212) | (i2202 ^ i2212)) >> 31;
        i20 = (i19 & (~i2222)) | (i18 & i2222);
        Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(11896850);
        if (Camera2StreamConfigurationMap == null) {
        }
        long longValue52 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap).invoke(null, null)).longValue();
        long j342 = -1224707770;
        long j352 = 302;
        long j362 = j342 ^ j2;
        long j372 = -301;
        long j382 = (j352 * j342) + (603 * longValue52) + ((-602) * (longValue52 | ((j362 | j3) ^ j2))) + ((((j362 | (longValue52 ^ j2)) ^ j2) | ((j362 | j) ^ j2) | (((j3 | j342) | longValue52) ^ j2)) * j372);
        long j392 = 301;
        j4 = j382 + (((j3 | longValue52) ^ j2) * j392) + 2123382708;
        if (((((int) (j4 >> 32)) & (777149478 + (((~((-1359102211) | i6)) | (~((-715764834) | i44))) * (-302)) + ((~((-1359102211) | i44)) * (-604)) + (((~((-2074867044) | i44)) | 67109008) * 302))) | (((int) j4) & (1453938690 + (((~(1465228770 | i6)) | 28002360) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + (((~(1476386298 | i6)) | (~((-1448383939) | i44))) * (-519)) + (((~(28002360 | i44)) | (-1465228771)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE)))) == 1) {
        }
        java.lang.Object[] objArr1572 = {new int[]{i21}, new int[1], strArr, new int[]{i20}};
        int i6562 = (~(i21 & i20)) & (i21 | i20);
        int i6572 = -i6562;
        int i6582 = (((i6562 & i6572) | (i6562 ^ i6572)) >> 31) & 16;
        int freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
        int i6592 = ~((-373327125) | freeMemory2);
        int i6602 = ~freeMemory2;
        int i6612 = (-2110240486) + ((i6592 | (~((-1101140131) | i6602))) * 920) + (((~((-373870421) | i6602)) | 373327124) * 920) + (((~(freeMemory2 | (-1101140131))) | (~((-373327125) | i6602)) | (~((-543297) | freeMemory2))) * 920);
        int i6622 = -(-i6582);
        int i6632 = (i6612 ^ i6622) + ((i6622 & i6612) << 1);
        int i6642 = ((i3 | i6632) << 1) - (i3 ^ i6632);
        int i6652 = i6642 << 13;
        int i6662 = ((~i6642) & i6652) | ((~i6652) & i6642);
        int i6672 = i6662 ^ (i6662 >>> 17);
        int i6682 = i6672 << 5;
        ((int[]) objArr1572[1])[0] = ((~i6672) & i6682) | ((~i6682) & i6672);
        return objArr1572;
        i38 = i23;
        int i46222 = getOutputMinFrameDuration;
        i40 = (i46222 & 69) + (i46222 | 69);
        getHighResolutionOutputSizeshNQ4ISI = i40 % 128;
        if (i40 % 2 != 0) {
        }
        i39 = i21;
        int i444222 = ((~i4322) & i21) | (i4322 & i38);
        int i445222 = -i444222;
        int i446222 = ((i444222 & i445222) | (i444222 ^ i445222)) >> 31;
        int i447222 = i39 & (~i446222);
        int i448222 = i4322 & i446222;
        int i449222 = (i448222 & i447222) | (i447222 ^ i448222);
        java.lang.Object[] objArr91222 = new java.lang.Object[1];
        a(2109 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())), (char) android.graphics.Color.blue(0), 46 - (~(-android.view.View.resolveSizeAndState(0, 0, 0))), objArr91222);
        java.lang.Object[] objArr92222 = {(java.lang.String) objArr91222[0]};
        Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1941710546);
        if (Camera2StreamConfigurationMap3 == null) {
        }
        long longValue12222 = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr92222)).longValue();
        long j70222 = -316647579;
        long j71222 = 85;
        long j72222 = (j71222 * j70222) + (j71222 * longValue12222);
        long j73222 = -84;
        long j74222 = j70222 ^ j6;
        long j75222 = longValue12222 ^ j6;
        long j76222 = j70222 | longValue12222;
        long j77222 = (j3 | longValue12222) ^ j6;
        long j78222 = 817026962 + j72222 + ((((j74222 | j75222) ^ j6) | ((j74222 | j3) ^ j6) | ((j75222 | j3) ^ j6) | ((j76222 | j) ^ j6)) * j73222) + (j73222 * (j70222 | ((j75222 | j) ^ j6) | j77222)) + (84 * ((j76222 ^ j6) | j77222));
        int i450222 = (~(815855240 | i38)) | 1226047812 | (~((-2041885645) | i38));
        int i451222 = ((int) (j78222 >> 32)) & ((-1054308254) + (((~((-17409) | i21)) | i450222) * 590) + (i450222 * (-1180)) + (((~(i38 | (-815855241))) | (~(2041885644 | i38))) * 590));
        int i452222 = (int) j78222;
        int maxMemory2222 = (int) java.lang.Runtime.getRuntime().maxMemory();
        int i453222 = ~maxMemory2222;
        int i454222 = (~((-991672443) | i453222)) | 723103834;
        int i455222 = ~(maxMemory2222 | 2134637051);
        int i456222 = i452222 & (783645393 + ((i454222 | i455222) * (-502)) + ((i455222 | (~(i453222 | (-268568609)))) * 502));
        int i457222 = (((i451222 & i456222) | (i451222 ^ i456222)) * 263) ^ i21;
        int i458222 = (~(i21 & i449222)) & (i21 | i449222);
        int i459222 = (i458222 | (-i458222)) >> 31;
        int i460222 = i457222 & (~i459222);
        int i461222 = i449222 & i459222;
        i20 = (i460222 ^ i461222) | (i461222 & i460222);
        strArr = strArr4;
        java.lang.Object[] objArr15722 = {new int[]{i21}, new int[1], strArr, new int[]{i20}};
        int i65622 = (~(i21 & i20)) & (i21 | i20);
        int i65722 = -i65622;
        int i65822 = (((i65622 & i65722) | (i65622 ^ i65722)) >> 31) & 16;
        int freeMemory22 = (int) java.lang.Runtime.getRuntime().freeMemory();
        int i65922 = ~((-373327125) | freeMemory22);
        int i66022 = ~freeMemory22;
        int i66122 = (-2110240486) + ((i65922 | (~((-1101140131) | i66022))) * 920) + (((~((-373870421) | i66022)) | 373327124) * 920) + (((~(freeMemory22 | (-1101140131))) | (~((-373327125) | i66022)) | (~((-543297) | freeMemory22))) * 920);
        int i66222 = -(-i65822);
        int i66322 = (i66122 ^ i66222) + ((i66222 & i66122) << 1);
        int i66422 = ((i3 | i66322) << 1) - (i3 ^ i66322);
        int i66522 = i66422 << 13;
        int i66622 = ((~i66422) & i66522) | ((~i66522) & i66422);
        int i66722 = i66622 ^ (i66622 >>> 17);
        int i66822 = i66722 << 5;
        ((int[]) objArr15722[1])[0] = ((~i66722) & i66822) | ((~i66822) & i66722);
        return objArr15722;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        int i = 2 % 2;
        com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4 identityTokenProviderImpl$getUserAccessTokenWithQueue$4 = new com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4(this.Camera2StreamConfigurationMap, continuation);
        int i2 = getOutputMinFrameDuration + 13;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return identityTokenProviderImpl$getUserAccessTokenWithQueue$4;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4(com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl identityTokenProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4> continuation) {
        super(1, continuation);
        this.Camera2StreamConfigurationMap = identityTokenProviderImpl;
    }
}
