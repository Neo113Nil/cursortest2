package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yy0 implements InterfaceC0551oo {

    /* JADX INFO: renamed from: t */
    public static final String[] f9531t = {"_data"};

    /* JADX INFO: renamed from: j */
    public final Context f9532j;

    /* JADX INFO: renamed from: k */
    public final hq0 f9533k;

    /* JADX INFO: renamed from: l */
    public final hq0 f9534l;

    /* JADX INFO: renamed from: m */
    public final Uri f9535m;

    /* JADX INFO: renamed from: n */
    public final int f9536n;

    /* JADX INFO: renamed from: o */
    public final int f9537o;

    /* JADX INFO: renamed from: p */
    public final uu0 f9538p;

    /* JADX INFO: renamed from: q */
    public final Class f9539q;

    /* JADX INFO: renamed from: r */
    public volatile boolean f9540r;

    /* JADX INFO: renamed from: s */
    public volatile InterfaceC0551oo f9541s;

    public yy0(Context context, hq0 hq0Var, hq0 hq0Var2, Uri uri, int i, int i2, uu0 uu0Var, Class cls) {
        this.f9532j = context.getApplicationContext();
        this.f9533k = hq0Var;
        this.f9534l = hq0Var2;
        this.f9535m = uri;
        this.f9536n = i;
        this.f9537o = i2;
        this.f9538p = uu0Var;
        this.f9539q = cls;
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: a */
    public final Class mo1071a() {
        return this.f9539q;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0551oo m5851b() throws Throwable {
        gq0 gq0VarMo640b;
        Throwable th;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f9532j;
        uu0 uu0Var = this.f9538p;
        int i = this.f9537o;
        int i2 = this.f9536n;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f9535m;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f9531t, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            gq0VarMo640b = this.f9533k.mo640b(file, i2, i, uu0Var);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            Uri requireOriginal = this.f9535m;
            boolean zM3837g = AbstractC0565p1.m3837g(requireOriginal);
            hq0 hq0Var = this.f9534l;
            if (zM3837g && requireOriginal.getPathSegments().contains("picker")) {
                gq0VarMo640b = hq0Var.mo640b(requireOriginal, i2, i, uu0Var);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                gq0VarMo640b = hq0Var.mo640b(requireOriginal, i2, i, uu0Var);
            }
        }
        if (gq0VarMo640b != null) {
            return gq0VarMo640b.f2848c;
        }
        return null;
    }

    @Override // p000.InterfaceC0551oo
    public final void cancel() {
        this.f9540r = true;
        InterfaceC0551oo interfaceC0551oo = this.f9541s;
        if (interfaceC0551oo != null) {
            interfaceC0551oo.cancel();
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: d */
    public final void mo1072d() {
        InterfaceC0551oo interfaceC0551oo = this.f9541s;
        if (interfaceC0551oo != null) {
            interfaceC0551oo.mo1072d();
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: e */
    public final void mo1073e(ex0 ex0Var, InterfaceC0514no interfaceC0514no) throws Throwable {
        try {
            InterfaceC0551oo interfaceC0551ooM5851b = m5851b();
            if (interfaceC0551ooM5851b == null) {
                interfaceC0514no.mo82f(new IllegalArgumentException("Failed to build fetcher for: " + this.f9535m));
            } else {
                this.f9541s = interfaceC0551ooM5851b;
                if (this.f9540r) {
                    cancel();
                } else {
                    interfaceC0551ooM5851b.mo1073e(ex0Var, interfaceC0514no);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC0514no.mo82f(e);
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: g */
    public final int mo1074g() {
        return 1;
    }
}
