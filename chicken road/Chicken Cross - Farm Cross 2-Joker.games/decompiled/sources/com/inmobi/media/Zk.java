package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.URLUtil;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes6.dex */
public final class Zk extends AbstractC4123u4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6996a;
    public final Z9 b;
    public final String c;

    public Zk(Context context, Z9 z9) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f6996a = context;
        this.b = z9;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.c = "Static-Companion-" + uuid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r13, r14, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r15 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Zk zk, String str, C3972ol c3972ol, ContinuationImpl continuationImpl) {
        Wk wk;
        int i;
        zk.getClass();
        if (continuationImpl instanceof Wk) {
            wk = (Wk) continuationImpl;
            int i2 = wk.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wk.e = i2 - Integer.MIN_VALUE;
                Object obj = wk.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = wk.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    Yk yk = new Yk(zk, null);
                    wk.f6936a = str;
                    wk.b = c3972ol;
                    wk.e = 1;
                    obj = BuildersKt.withContext(main, yk, wk);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c3972ol = wk.b;
                    str = wk.f6936a;
                    ResultKt.throwOnFailure(obj);
                }
                CoroutineDispatcher io2 = Dispatchers.getIO();
                Xk xk = new Xk(c3972ol, zk, str, (Bitmap.Config) obj, null);
                wk.f6936a = null;
                wk.b = null;
                wk.e = 2;
            }
        }
        wk = new Wk(zk, continuationImpl);
        Object obj2 = wk.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wk.e;
        if (i != 0) {
        }
        CoroutineDispatcher io22 = Dispatchers.getIO();
        Xk xk2 = new Xk(c3972ol, zk, str, (Bitmap.Config) obj2, null);
        wk.f6936a = null;
        wk.b = null;
        wk.e = 2;
    }

    public final Object a(Xj xj, C3839k4 c3839k4) {
        if (URLUtil.isNetworkUrl(xj.f6954a)) {
            return BuildersKt.withContext(Dispatchers.getMain(), new Vk(this, xj, null), c3839k4);
        }
        throw new C3624cd("Companion Invalid Resource Error");
    }
}
