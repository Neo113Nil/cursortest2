package p081l2;

import C1.C0095a;
import java.util.List;
import p068j2.e;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ int f14881D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Object f14882E;

    public a(List list) {
        this.f14881D = 0;
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        this.f14882E = new i(((bArr[0] & 255) << 8) | (bArr[1] & 255), (bArr[3] & 255) | ((bArr[2] & 255) << 8));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // p068j2.e
    public final p068j2.f e(byte[] r47, int r48, boolean r49) {
        /*
            Method dump skipped, instruction units count: 1226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p081l2.a.e(byte[], int, boolean):j2.f");
    }

    public a() {
        this.f14881D = 1;
        this.f14882E = new C0095a(4, false);
    }
}
