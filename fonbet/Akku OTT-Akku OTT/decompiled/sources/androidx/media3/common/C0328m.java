package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.MediaItem;

/* renamed from: androidx.media3.common.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0328m implements com.google.common.base.f {
    public final /* synthetic */ int a;

    public /* synthetic */ C0328m(int i) {
        this.a = i;
    }

    @Override // com.google.common.base.f
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((MediaItem.SubtitleConfiguration) obj).toBundle();
            default:
                return Format.fromBundle((Bundle) obj);
        }
    }
}
