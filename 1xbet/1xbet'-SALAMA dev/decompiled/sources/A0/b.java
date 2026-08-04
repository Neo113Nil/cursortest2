package A0;

import B.v;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f21c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f22d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f23e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f24f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f25g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Serializable f26h;

    public b(v vVar, B1.c cVar, B1.c cVar2, L4.b bVar, boolean z4, String str, String str2, String str3) {
        this.f24f = vVar;
        this.f22d = cVar;
        this.f23e = cVar2;
        this.f21c = bVar;
        this.f19a = z4;
        this.f20b = str;
        this.f25g = str2;
        this.f26h = str3;
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message != null && message.contains("compressed")) {
                ((d) this.f22d).j();
            }
            return null;
        }
    }

    public void b(int i7, Serializable serializable) {
        this.f21c.execute(new a(this, i7, serializable, 0));
    }

    public b(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        this.f19a = false;
        this.f21c = executor;
        this.f22d = dVar;
        this.f20b = str;
        this.f25g = file;
        int i7 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i7 <= 34) {
            switch (i7) {
                case 24:
                case 25:
                    bArr = e.f43h;
                    break;
                case 26:
                    bArr = e.f42g;
                    break;
                case 27:
                    bArr = e.f41f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f40e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = e.f39d;
                    break;
            }
        }
        this.f23e = bArr;
    }
}
