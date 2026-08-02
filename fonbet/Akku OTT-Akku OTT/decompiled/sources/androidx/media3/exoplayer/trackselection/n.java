package androidx.media3.exoplayer.trackselection;

import android.os.Bundle;
import androidx.media3.common.text.Cue;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements com.google.common.base.f {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i) {
        this.a = i;
    }

    @Override // com.google.common.base.f
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return DefaultTrackSelector.SelectionOverride.fromBundle((Bundle) obj);
            default:
                return ((Cue) obj).toSerializableBundle();
        }
    }
}
