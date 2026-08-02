package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.Timeline;

/* renamed from: androidx.media3.common.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0327l implements com.google.common.base.f {
    public final /* synthetic */ int a;

    @Override // com.google.common.base.f
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((StreamKey) obj).toBundle();
            default:
                return Timeline.Period.fromBundle((Bundle) obj);
        }
    }
}
