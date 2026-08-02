package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class in0 implements InterfaceC0551oo {

    /* JADX INFO: renamed from: m */
    public static final String[] f3620m = {"_data"};

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3621j;

    /* JADX INFO: renamed from: k */
    public final Object f3622k;

    /* JADX INFO: renamed from: l */
    public Object f3623l;

    public /* synthetic */ in0(int i, Object obj, Object obj2) {
        this.f3621j = i;
        this.f3622k = obj;
        this.f3623l = obj2;
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: a */
    public final Class mo1071a() {
        switch (this.f3621j) {
            case 0:
                return File.class;
            case 1:
                return ((InterfaceC0014ad) this.f3623l).mo175a();
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC0551oo
    public final void cancel() {
        int i = this.f3621j;
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: d */
    public final void mo1072d() {
        switch (this.f3621j) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.f3623l).close();
                } catch (IOException unused) {
                    return;
                }
                break;
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: e */
    public final void mo1073e(ex0 ex0Var, InterfaceC0514no interfaceC0514no) {
        int i = this.f3621j;
        Object obj = this.f3622k;
        switch (i) {
            case 0:
                Cursor cursorQuery = ((Context) obj).getContentResolver().query((Uri) this.f3623l, f3620m, null, null, null);
                String string = null;
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    interfaceC0514no.mo84h(new File(string));
                    return;
                }
                interfaceC0514no.mo82f(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f3623l)));
                return;
            case 1:
                interfaceC0514no.mo84h(((InterfaceC0014ad) this.f3623l).mo176j((byte[]) obj));
                return;
            default:
                try {
                    ByteArrayInputStream byteArrayInputStreamM3626k = o31.m3626k((String) obj);
                    this.f3623l = byteArrayInputStreamM3626k;
                    interfaceC0514no.mo84h(byteArrayInputStreamM3626k);
                    return;
                } catch (IllegalArgumentException e) {
                    interfaceC0514no.mo82f(e);
                    return;
                }
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: g */
    public final int mo1074g() {
        switch (this.f3621j) {
        }
        return 1;
    }

    public in0(String str, o31 o31Var) {
        this.f3621j = 2;
        this.f3622k = str;
    }

    /* JADX INFO: renamed from: b */
    private final void m2663b() {
    }

    /* JADX INFO: renamed from: c */
    private final void m2664c() {
    }

    /* JADX INFO: renamed from: f */
    private final void m2665f() {
    }

    /* JADX INFO: renamed from: h */
    private final void m2666h() {
    }

    /* JADX INFO: renamed from: i */
    private final void m2667i() {
    }
}
