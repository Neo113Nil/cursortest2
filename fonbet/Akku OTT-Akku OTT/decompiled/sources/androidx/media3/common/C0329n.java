package androidx.media3.common;

import android.os.Bundle;

/* renamed from: androidx.media3.common.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0329n implements com.google.common.base.f {
    public final /* synthetic */ int a;

    public /* synthetic */ C0329n(int i) {
        this.a = i;
    }

    @Override // com.google.common.base.f
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return StreamKey.fromBundle((Bundle) obj);
            default:
                return ((TrackSelectionOverride) obj).toBundle();
        }
    }
}
