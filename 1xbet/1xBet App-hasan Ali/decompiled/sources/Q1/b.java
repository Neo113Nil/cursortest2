package Q1;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f4854a;

    /* renamed from: b, reason: collision with root package name */
    public final d f4855b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4856c;

    /* renamed from: d, reason: collision with root package name */
    public final File f4857d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4858e;
    public boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f4859g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f4860h;

    public b(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        this.f4854a = executor;
        this.f4855b = dVar;
        this.f4858e = str;
        this.f4857d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24) {
            if (i < 31) {
                switch (i) {
                    case 24:
                    case 25:
                        bArr = e.f4874h;
                        break;
                    case 26:
                        bArr = e.f4873g;
                        break;
                    case 27:
                        bArr = e.f;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = e.f4872e;
                        break;
                }
            } else {
                bArr = e.f4871d;
            }
        }
        this.f4856c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f4855b.i();
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.f4854a.execute(new Runnable() { // from class: Q1.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f4855b.c(i, serializable);
            }
        });
    }
}
