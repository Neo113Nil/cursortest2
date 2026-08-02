package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.gms.dynamic.a;
import java.util.HashMap;

/* renamed from: androidx.media3.common.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0338w implements ListenerSet.Event, Bundleable.Creator {
    public static com.google.android.gms.dynamic.a a(Parcel parcel) {
        com.google.android.gms.dynamic.a C = a.AbstractBinderC0114a.C(parcel.readStrongBinder());
        parcel.recycle();
        return C;
    }

    public static Object b(StringBuilder sb, String str, String str2, HashMap hashMap, String str3) {
        sb.append(str);
        sb.append(str2);
        return hashMap.get(str3);
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        com.google.android.exoplayer2.trackselection.TrackSelectionOverride lambda$static$0;
        lambda$static$0 = com.google.android.exoplayer2.trackselection.TrackSelectionOverride.lambda$static$0(bundle);
        return lambda$static$0;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }
}
