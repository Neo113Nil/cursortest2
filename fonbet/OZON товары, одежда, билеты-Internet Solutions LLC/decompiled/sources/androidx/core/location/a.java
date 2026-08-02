package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.List;
import oe0.C8702A;

/* loaded from: classes8.dex */
public interface a extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i11) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(@NonNull List<Location> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C8702A.b) this).onLocationChanged(list.get(i11));
        }
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(@NonNull String str, int i11, Bundle bundle) {
    }
}
