package com.akku.ottapp;

import com.google.android.play.core.integrity.IntegrityTokenResponse;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ MethodChannel.Result a;

    public /* synthetic */ g(MethodChannel.Result result) {
        this.a = result;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = MainActivity.e;
        this.a.success(((IntegrityTokenResponse) obj).token());
        return Unit.INSTANCE;
    }
}
