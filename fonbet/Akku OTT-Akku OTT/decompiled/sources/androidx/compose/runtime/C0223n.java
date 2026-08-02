package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;

/* renamed from: androidx.compose.runtime.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0223n implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C0223n(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object _init_$lambda$0;
        switch (this.a) {
            case 0:
                _init_$lambda$0 = ComputedProvidableCompositionLocal._init_$lambda$0();
                return _init_$lambda$0;
            default:
                return com.bbflight.background_downloader.B.Companion.serializer();
        }
    }
}
