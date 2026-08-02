package androidx.media3.session;

import androidx.media3.common.util.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class q5 implements Consumer {
    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        ((PlayerWrapper) obj).seekToDefaultPosition();
    }
}
