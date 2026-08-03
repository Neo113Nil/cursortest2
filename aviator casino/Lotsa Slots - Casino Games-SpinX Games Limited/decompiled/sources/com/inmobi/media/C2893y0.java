package com.inmobi.media;

/* renamed from: com.inmobi.media.y0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2893y0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.core.config.models.AdConfig f5560a;
    public com.inmobi.media.A0 b;
    public java.util.Iterator c;
    public com.inmobi.adquality.models.AdQualityResult d;
    public int e;
    public final /* synthetic */ com.inmobi.media.A0 f;
    public final /* synthetic */ com.inmobi.media.core.config.models.AdConfig g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2893y0(com.inmobi.media.A0 a0, com.inmobi.media.core.config.models.AdConfig adConfig, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f = a0;
        this.g = adConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2893y0(this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2893y0(this.f, this.g, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:23|(1:24)|25|(2:62|63)|27|(1:29)|30|31|32|33|(1:35)|36|37) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:43|44|45|46|(1:48)|68|37) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0125, code lost:
    
        if (r5 != r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0127, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0040, code lost:
    
        if (r3 == r0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0125 -> B:6:0x0128). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a2;
        com.inmobi.media.A0 a0;
        com.inmobi.media.core.config.models.AdConfig adConfig;
        java.util.Iterator it;
        com.inmobi.media.Ia ia;
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        com.inmobi.media.Zh zh;
        com.inmobi.media.Zh zh2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.H0 h0 = (com.inmobi.media.H0) com.inmobi.media.E0.f4672a.getValue();
            this.e = 1;
            a2 = h0.a(this);
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            a2 = obj;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.inmobi.adquality.models.AdQualityResult result = this.d;
            it = this.c;
            a0 = this.b;
            adConfig = this.f5560a;
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object a3 = obj;
            com.inmobi.media.Ve ve = (com.inmobi.media.Ve) a3;
            com.inmobi.media.C2320c6 c2320c6 = com.inmobi.media.EnumC2372e6.b;
            if (ve.c() == 0) {
                return kotlin.Unit.INSTANCE;
            }
            a0.getClass();
            if (com.inmobi.media.AbstractC2889xl.a(ve)) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) a0.c.get(result.getBeaconUrl());
                if (weakReference != null && (zh2 = (com.inmobi.media.Zh) weakReference.get()) != null) {
                    zh2.f5086a.h("window.mraidview.broadcastEvent('AdReportSuccess')");
                }
            } else {
                java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) a0.c.get(result.getBeaconUrl());
                if (weakReference2 != null && (zh = (com.inmobi.media.Zh) weakReference2.get()) != null) {
                    zh.f5086a.h("window.mraidview.broadcastEvent('AdReportFailed')");
                }
            }
            com.inmobi.media.A0.a(result);
            if (it.hasNext()) {
                this.f.b.set(true);
                return kotlin.Unit.INSTANCE;
            }
            result = (com.inmobi.adquality.models.AdQualityResult) it.next();
            com.inmobi.media.B9 b9 = (com.inmobi.media.B9) com.inmobi.media.Pe.e.getValue();
            com.inmobi.media.core.config.models.AdConfig.AdQualityConfig config = adConfig.getAdQuality();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            java.lang.String url = result.getBeaconUrl();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            java.lang.String beaconUrl = result.getBeaconUrl();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (result.getImageLocation().length() > 0) {
                okio.Buffer buffer = new okio.Buffer();
                try {
                } catch (java.io.FileNotFoundException unused) {
                    bitmap2 = null;
                } catch (java.lang.Throwable th) {
                    th = th;
                    bitmap = null;
                }
                bitmap2 = android.graphics.BitmapFactory.decodeFile(result.getImageLocation());
                if (bitmap2 != null) {
                    try {
                    } catch (java.io.FileNotFoundException unused2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
                        buffer.close();
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        ia = null;
                        com.inmobi.media.Te te = new com.inmobi.media.Te(beaconUrl, null, new com.inmobi.media.Gk(2000L, 2000L, 5000L), ia, new com.inmobi.media.Ni(config.getRetryInterval(), config.getMaxRetries()), 2);
                        this.f5560a = adConfig;
                        this.b = a0;
                        this.c = it;
                        this.d = result;
                        this.e = 2;
                        a3 = b9.f4618a.a(te, this);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        bitmap = bitmap2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
                        try {
                            buffer.close();
                        } catch (java.io.IOException unused3) {
                        }
                        if (bitmap == null) {
                            throw th;
                        }
                        bitmap.recycle();
                        throw th;
                    }
                    bitmap2.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, buffer.outputStream());
                }
                if (!buffer.exhausted()) {
                    jSONObject.put("screenshotImageByte", com.inmobi.media.J3.a(buffer));
                }
                com.inmobi.media.Ia ia2 = new com.inmobi.media.Ia(jSONObject);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
                buffer.close();
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ia = ia2;
                com.inmobi.media.Te te2 = new com.inmobi.media.Te(beaconUrl, null, new com.inmobi.media.Gk(2000L, 2000L, 5000L), ia, new com.inmobi.media.Ni(config.getRetryInterval(), config.getMaxRetries()), 2);
                this.f5560a = adConfig;
                this.b = a0;
                this.c = it;
                this.d = result;
                this.e = 2;
                a3 = b9.f4618a.a(te2, this);
            }
            ia = null;
            com.inmobi.media.Te te22 = new com.inmobi.media.Te(beaconUrl, null, new com.inmobi.media.Gk(2000L, 2000L, 5000L), ia, new com.inmobi.media.Ni(config.getRetryInterval(), config.getMaxRetries()), 2);
            this.f5560a = adConfig;
            this.b = a0;
            this.c = it;
            this.d = result;
            this.e = 2;
            a3 = b9.f4618a.a(te22, this);
        }
        com.inmobi.media.core.config.models.AdConfig adConfig2 = this.g;
        a0 = this.f;
        adConfig = adConfig2;
        it = ((java.util.List) a2).iterator();
        if (it.hasNext()) {
        }
    }
}
