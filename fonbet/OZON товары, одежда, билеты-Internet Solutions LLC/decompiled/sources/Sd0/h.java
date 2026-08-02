package Sd0;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes7.dex */
public abstract class h {
    public abstract Uri a();

    public Intent b() {
        return null;
    }

    public final Uri c() {
        Uri data;
        Intent b11 = b();
        return (b11 == null || (data = b11.getData()) == null) ? a() : data;
    }
}
