package M6;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17475a;

    public a(Context context) {
        this.f17475a = context.getApplicationContext();
    }

    @Override // M6.e
    protected final InputStream b() throws IOException {
        return this.f17475a.getAssets().open(null);
    }
}
