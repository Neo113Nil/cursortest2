package M9;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import ng.c;
import ng.h;
import ng.i;

/* loaded from: classes.dex */
final class b extends h {

    /* renamed from: c, reason: collision with root package name */
    private final Context f17718c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17719d = "org/threeten/bp/TZDB.dat";

    b(Context context) {
        this.f17718c = context;
    }

    @Override // ng.h
    protected final void b() {
        String str = this.f17719d;
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f17718c.getAssets().open(str);
                c cVar = new c(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                i.d(cVar);
            } catch (IOException e11) {
                throw new IllegalStateException(str + " missing from assets", e11);
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }
}
