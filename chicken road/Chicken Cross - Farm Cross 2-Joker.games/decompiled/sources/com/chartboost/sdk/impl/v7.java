package com.chartboost.sdk.impl;

import android.content.Context;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.source.MediaSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v7 {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f5041a;
    public final Function0 b;
    public final Context c;

    public v7(Context context, s7 downloadManager, Function0 mediaSourceFactory, Function0 loadControlFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(mediaSourceFactory, "mediaSourceFactory");
        Intrinsics.checkNotNullParameter(loadControlFactory, "loadControlFactory");
        this.f5041a = mediaSourceFactory;
        this.b = loadControlFactory;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.c = applicationContext;
    }

    public static final MediaSource.Factory a(s7 s7Var) {
        return f6.a(s7Var.c());
    }

    public final ExoPlayer b() {
        ExoPlayer build = new ExoPlayer.Builder(this.c).setMediaSourceFactory((MediaSource.Factory) this.f5041a.invoke()).setLoadControl((LoadControl) this.b.invoke()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static final LoadControl a() {
        return f6.a(0, 0, 3, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ v7(Context context, final s7 s7Var, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, s7Var, (i & 4) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.v7$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v7.a(s7.this);
            }
        } : function0, (i & 8) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.v7$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v7.a();
            }
        } : function02);
        s7Var = (i & 2) != 0 ? b4.b.b().c() : s7Var;
    }
}
