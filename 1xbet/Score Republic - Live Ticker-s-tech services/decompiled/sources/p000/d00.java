package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class d00 implements InterfaceC0551oo {

    /* JADX INFO: renamed from: j */
    public final String f1501j;

    /* JADX INFO: renamed from: k */
    public final AssetManager f1502k;

    /* JADX INFO: renamed from: l */
    public Object f1503l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f1504m;

    public d00(AssetManager assetManager, String str, int i) {
        this.f1504m = i;
        this.f1502k = assetManager;
        this.f1501j = str;
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: a */
    public final Class mo1071a() {
        switch (this.f1504m) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: d */
    public final void mo1072d() {
        Object obj = this.f1503l;
        if (obj == null) {
            return;
        }
        try {
            switch (this.f1504m) {
                case 0:
                    ((AssetFileDescriptor) obj).close();
                    break;
                default:
                    ((InputStream) obj).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: e */
    public final void mo1073e(ex0 ex0Var, InterfaceC0514no interfaceC0514no) {
        Object objOpenFd;
        try {
            AssetManager assetManager = this.f1502k;
            String str = this.f1501j;
            switch (this.f1504m) {
                case 0:
                    objOpenFd = assetManager.openFd(str);
                    break;
                default:
                    objOpenFd = assetManager.open(str);
                    break;
            }
            this.f1503l = objOpenFd;
            interfaceC0514no.mo84h(objOpenFd);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            interfaceC0514no.mo82f(e);
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: g */
    public final int mo1074g() {
        return 1;
    }

    @Override // p000.InterfaceC0551oo
    public final void cancel() {
    }
}
