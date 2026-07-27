package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class A0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public AdConfig f6444a;
    public C0 b;
    public Iterator c;
    public AdQualityResult d;
    public int e;
    public final /* synthetic */ C0 f;
    public final /* synthetic */ AdConfig g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(C0 c0, AdConfig adConfig, Continuation continuation) {
        super(2, continuation);
        this.f = c0;
        this.g = adConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new A0(this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new A0(this.f, this.g, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:43|(1:44)|45|(2:82|83)|47|(1:49)|50|51|52|53|(1:55)|56|57) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:63|64|65|66|(1:68)|88|(0)(0)|57) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x003e, code lost:
    
        if (r2 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019c, code lost:
    
        if (r4 != r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x019e, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x019c -> B:6:0x019f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a2;
        C0 c0;
        AdConfig adConfig;
        Iterator it;
        Ab ab;
        Bitmap bitmap;
        Bitmap bitmap2;
        C3970oj c3970oj;
        C3970oj c3970oj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        char c = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            J0 j0 = (J0) G0.f6569a.getValue();
            this.e = 1;
            a2 = j0.a(this);
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            a2 = obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AdQualityResult result = this.d;
            it = this.c;
            c0 = this.b;
            adConfig = this.f6444a;
            ResultKt.throwOnFailure(obj);
            Object a3 = obj;
            Of of = (Of) a3;
            C4262z6 c4262z6 = B6.b;
            if (of.c() == 0) {
                return Unit.INSTANCE;
            }
            c0.getClass();
            if (AbstractC4086sn.a(of)) {
                WeakReference weakReference = (WeakReference) c0.c.get(result.getBeaconUrl());
                if (weakReference != null && (c3970oj2 = (C3970oj) weakReference.get()) != null) {
                    c3970oj2.f7290a.h("window.mraidview.broadcastEvent('AdReportSuccess')");
                }
            } else {
                WeakReference weakReference2 = (WeakReference) c0.c.get(result.getBeaconUrl());
                if (weakReference2 != null && (c3970oj = (C3970oj) weakReference2.get()) != null) {
                    c3970oj.f7290a.h("window.mraidview.broadcastEvent('AdReportFailed')");
                }
            }
            C0.a(result);
            c = 1;
            if (it.hasNext()) {
                this.f.b.set(true);
                return Unit.INSTANCE;
            }
            result = (AdQualityResult) it.next();
            C3733ga c3733ga = (C3733ga) If.e.getValue();
            AdConfig.AdQualityConfig config = adConfig.getAdQuality();
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(config, "config");
            String url = result.getBeaconUrl();
            Intrinsics.checkNotNullParameter(url, "url");
            String beaconUrl = result.getBeaconUrl();
            JSONObject jSONObject = new JSONObject();
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            if (Ki.f6675a) {
                Pair pair = TuplesKt.to("d-build-v", Build.ID);
                Pair pair2 = TuplesKt.to("os-v", Build.VERSION.RELEASE);
                Pair pair3 = TuplesKt.to("d-build-model", Build.MODEL);
                Pair[] pairArr = new Pair[3];
                pairArr[0] = pair;
                pairArr[c] = pair2;
                pairArr[2] = pair3;
                Map mutableMapOf = MapsKt.mutableMapOf(pairArr);
                String b = Ki.b();
                if (b != null) {
                    if (StringsKt.isBlank(b)) {
                        b = null;
                    }
                    if (b != null) {
                        mutableMapOf.put("d-wv-v", b);
                    }
                }
                for (Map.Entry entry : mutableMapOf.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (!jSONObject.has(str)) {
                        jSONObject.put(str, str2);
                    }
                }
            }
            if (result.getImageLocation().length() > 0) {
                Buffer buffer = new Buffer();
                try {
                } catch (FileNotFoundException unused) {
                    bitmap2 = null;
                } catch (Throwable th) {
                    th = th;
                    bitmap = null;
                }
                bitmap2 = BitmapFactory.decodeFile(result.getImageLocation());
                if (bitmap2 != null) {
                    try {
                    } catch (FileNotFoundException unused2) {
                        Intrinsics.checkNotNullParameter(buffer, "<this>");
                        buffer.close();
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        if (jSONObject.length() <= 0) {
                        }
                        Mf mf = new Mf(beaconUrl, null, new Cm(2000L, 2000L, 5000L), ab, new C3631ck(config.getRetryInterval(), config.getMaxRetries()), 2);
                        this.f6444a = adConfig;
                        this.b = c0;
                        this.c = it;
                        this.d = result;
                        this.e = 2;
                        a3 = c3733ga.f7119a.a(mf, this);
                    } catch (Throwable th2) {
                        th = th2;
                        bitmap = bitmap2;
                        Intrinsics.checkNotNullParameter(buffer, "<this>");
                        try {
                            buffer.close();
                        } catch (IOException unused3) {
                        }
                        if (bitmap == null) {
                            throw th;
                        }
                        bitmap.recycle();
                        throw th;
                    }
                    bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, buffer.outputStream());
                }
                if (!buffer.exhausted()) {
                    jSONObject.put("screenshotImageByte", AbstractC3727g4.a(buffer));
                }
                Ab ab2 = new Ab(jSONObject);
                Intrinsics.checkNotNullParameter(buffer, "<this>");
                buffer.close();
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ab = ab2;
                Mf mf2 = new Mf(beaconUrl, null, new Cm(2000L, 2000L, 5000L), ab, new C3631ck(config.getRetryInterval(), config.getMaxRetries()), 2);
                this.f6444a = adConfig;
                this.b = c0;
                this.c = it;
                this.d = result;
                this.e = 2;
                a3 = c3733ga.f7119a.a(mf2, this);
            }
            ab = jSONObject.length() <= 0 ? new Ab(jSONObject) : null;
            Mf mf22 = new Mf(beaconUrl, null, new Cm(2000L, 2000L, 5000L), ab, new C3631ck(config.getRetryInterval(), config.getMaxRetries()), 2);
            this.f6444a = adConfig;
            this.b = c0;
            this.c = it;
            this.d = result;
            this.e = 2;
            a3 = c3733ga.f7119a.a(mf22, this);
        }
        AdConfig adConfig2 = this.g;
        c0 = this.f;
        adConfig = adConfig2;
        it = ((List) a2).iterator();
        if (it.hasNext()) {
        }
    }
}
