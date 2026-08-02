package a90;

import We.C4862d;
import We.E;
import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a90.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4969g implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        E.a getOkHttpClient = (E.a) obj;
        Context context = (Context) obj2;
        Intrinsics.checkNotNullParameter(getOkHttpClient, "$this$getOkHttpClient");
        Intrinsics.checkNotNullParameter(context, "context");
        getOkHttpClient.Y();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        getOkHttpClient.f(20L, timeUnit);
        getOkHttpClient.X(60L, timeUnit);
        getOkHttpClient.b0(20L, timeUnit);
        getOkHttpClient.l(true);
        getOkHttpClient.m();
        File file = new File(context.getApplicationContext().getCacheDir(), "ok-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        getOkHttpClient.c(new C4862d(file, 250000000L));
        return getOkHttpClient;
    }
}
