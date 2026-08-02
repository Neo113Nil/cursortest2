package a8;

import O7.o;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import f8.I;
import f8.z;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences.Editor f36433a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36434b;

    public e(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f36434b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f36433a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f36433a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    public final void a(z zVar) throws IOException {
        if (!this.f36433a.putString(this.f36434b, o.c(zVar.f())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public final void b(I i11) throws IOException {
        if (!this.f36433a.putString(this.f36434b, o.c(i11.f())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
