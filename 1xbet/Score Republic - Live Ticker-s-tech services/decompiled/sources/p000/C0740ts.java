package p000;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ts */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0740ts {

    /* JADX INFO: renamed from: a */
    public final Executor f7579a;

    /* JADX INFO: renamed from: b */
    public final lx0 f7580b;

    /* JADX INFO: renamed from: c */
    public final byte[] f7581c;

    /* JADX INFO: renamed from: d */
    public final File f7582d;

    /* JADX INFO: renamed from: e */
    public final String f7583e;

    /* JADX INFO: renamed from: f */
    public boolean f7584f = false;

    /* JADX INFO: renamed from: g */
    public C0777us[] f7585g;

    /* JADX INFO: renamed from: h */
    public byte[] f7586h;

    public C0740ts(AssetManager assetManager, Executor executor, lx0 lx0Var, String str, File file) {
        this.f7579a = executor;
        this.f7580b = lx0Var;
        this.f7583e = str;
        this.f7582d = file;
        int i = Build.VERSION.SDK_INT;
        this.f7581c = i >= 31 ? af0.f166c : (i == 29 || i == 30) ? af0.f167d : null;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m4842a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f7580b.mo161j();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4843b(final int i, final Serializable serializable) {
        this.f7579a.execute(new Runnable() { // from class: ss
            @Override // java.lang.Runnable
            public final void run() {
                this.f7200j.f7580b.mo162k(i, serializable);
            }
        });
    }
}
