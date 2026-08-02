package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sj0 implements InterfaceC0551oo {

    /* JADX INFO: renamed from: j */
    public final boolean f7128j;

    /* JADX INFO: renamed from: k */
    public final Uri f7129k;

    /* JADX INFO: renamed from: l */
    public final ContentResolver f7130l;

    /* JADX INFO: renamed from: m */
    public Object f7131m;

    public sj0(ContentResolver contentResolver, Uri uri, boolean z) {
        this.f7130l = contentResolver;
        this.f7129k = uri;
        this.f7128j = z;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1994b(Object obj);

    /* JADX INFO: renamed from: c */
    public abstract Object mo1995c(Uri uri, ContentResolver contentResolver);

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: d */
    public final void mo1072d() {
        Object obj = this.f7131m;
        if (obj != null) {
            try {
                mo1994b(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: e */
    public final void mo1073e(ex0 ex0Var, InterfaceC0514no interfaceC0514no) {
        try {
            Object objMo1995c = mo1995c(this.f7129k, this.f7130l);
            this.f7131m = objMo1995c;
            interfaceC0514no.mo84h(objMo1995c);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
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
