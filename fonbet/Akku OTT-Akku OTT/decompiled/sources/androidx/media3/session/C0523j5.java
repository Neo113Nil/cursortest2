package androidx.media3.session;

import androidx.media3.common.util.Consumer;

/* renamed from: androidx.media3.session.j5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0523j5 implements Consumer {
    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        ((PlayerWrapper) obj).decreaseDeviceVolume();
    }
}
