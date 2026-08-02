package l2;

import C1.C0095a;
import j2.AbstractC1308e;
import java.util.List;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1379a extends AbstractC1308e {

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ int f14875D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f14876E;

    public C1379a(List list) {
        this.f14875D = 0;
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        this.f14876E = new C1387i(((bArr[0] & 255) << 8) | (bArr[1] & 255), (bArr[3] & 255) | ((bArr[2] & 255) << 8));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // j2.AbstractC1308e
    public final j2.InterfaceC1309f e(byte[] r47, int r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 1226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.C1379a.e(byte[], int, boolean):j2.f");
    }

    public C1379a() {
        this.f14875D = 1;
        this.f14876E = new C0095a(4, false);
    }
}
