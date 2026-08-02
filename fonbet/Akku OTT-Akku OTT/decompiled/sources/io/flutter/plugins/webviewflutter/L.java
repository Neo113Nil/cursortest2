package io.flutter.plugins.webviewflutter;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.n;

/* loaded from: classes3.dex */
public final /* synthetic */ class L implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ L(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$postMessage$0;
        switch (this.a) {
            case 0:
                lambda$postMessage$0 = JavaScriptChannel.lambda$postMessage$0((Result) obj);
                return lambda$postMessage$0;
            default:
                okio.internal.p entry = (okio.internal.p) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                okio.C c = okio.internal.n.d;
                return Boolean.valueOf(n.a.a(entry.a));
        }
    }
}
