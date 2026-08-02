package androidx.credentials;

import android.adservices.adselection.AdSelectionManager;
import android.app.slice.Slice;
import android.service.credentials.CreateEntry;

/* loaded from: classes.dex */
public final /* synthetic */ class J {
    public static /* synthetic */ CreateEntry c(Slice slice) {
        return new CreateEntry(slice);
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return AdSelectionManager.class;
    }
}
