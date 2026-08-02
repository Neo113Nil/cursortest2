package a90;

import We.C4862d;
import We.E;
import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a90.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4970h implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        E.a FintechFeaturesOkHttpClient = (E.a) obj;
        Context app = (Context) obj2;
        Intrinsics.checkNotNullParameter(FintechFeaturesOkHttpClient, "$this$FintechFeaturesOkHttpClient");
        Intrinsics.checkNotNullParameter(app, "app");
        FintechFeaturesOkHttpClient.Y();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        FintechFeaturesOkHttpClient.f(20L, timeUnit);
        FintechFeaturesOkHttpClient.X(60L, timeUnit);
        FintechFeaturesOkHttpClient.b0(20L, timeUnit);
        FintechFeaturesOkHttpClient.l(true);
        FintechFeaturesOkHttpClient.m();
        File file = new File(app.getApplicationContext().getCacheDir(), "ok-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        FintechFeaturesOkHttpClient.c(new C4862d(file, 250000000L));
        return FintechFeaturesOkHttpClient;
    }
}
