package M6;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17476a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17477b;

    public d(Context context, int i11) {
        this.f17476a = context.getApplicationContext();
        this.f17477b = i11;
    }

    @Override // M6.e
    protected final InputStream b() throws IOException {
        return this.f17476a.getResources().openRawResource(this.f17477b);
    }
}
