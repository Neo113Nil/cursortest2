package ag;

import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.NonNull;

/* renamed from: ag.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C5019a {

    /* renamed from: a, reason: collision with root package name */
    final LocationManager f36764a;

    /* renamed from: b, reason: collision with root package name */
    String f36765b = "passive";

    public C5019a(@NonNull Context context) {
        this.f36764a = (LocationManager) context.getSystemService("location");
    }
}
