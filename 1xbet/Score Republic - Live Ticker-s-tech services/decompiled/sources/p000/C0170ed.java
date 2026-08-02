package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ed */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0170ed implements InterfaceC0551oo {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2062j;

    /* JADX INFO: renamed from: k */
    public final Object f2063k;

    public /* synthetic */ C0170ed(int i, Object obj) {
        this.f2062j = i;
        this.f2063k = obj;
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: a */
    public final Class mo1071a() {
        switch (this.f2062j) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f2063k.getClass();
        }
    }

    @Override // p000.InterfaceC0551oo
    public final void cancel() {
        int i = this.f2062j;
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: d */
    public final void mo1072d() {
        int i = this.f2062j;
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: e */
    public final void mo1073e(ex0 ex0Var, InterfaceC0514no interfaceC0514no) {
        int i = this.f2062j;
        Object obj = this.f2063k;
        switch (i) {
            case 0:
                try {
                    interfaceC0514no.mo84h(AbstractC0429ld.m3209a((File) obj));
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    interfaceC0514no.mo82f(e);
                    return;
                }
                break;
            default:
                interfaceC0514no.mo84h(obj);
                break;
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: g */
    public final int mo1074g() {
        switch (this.f2062j) {
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    private final void m1400b() {
    }

    /* JADX INFO: renamed from: c */
    private final void m1401c() {
    }

    /* JADX INFO: renamed from: f */
    private final void m1402f() {
    }

    /* JADX INFO: renamed from: h */
    private final void m1403h() {
    }
}
