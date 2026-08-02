package a30;

import a30.C4933a;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.wallet.manager.domain.WalletManager;

/* renamed from: a30.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4936d implements Jb.e<c30.b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f36244a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S30.a> f36245b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<R30.a> f36246c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<WalletManager> f36247d;

    public C4936d(Pc.a<Context> aVar, Pc.a<S30.a> aVar2, Pc.a<R30.a> aVar3, Pc.a<WalletManager> aVar4) {
        this.f36244a = aVar;
        this.f36245b = aVar2;
        this.f36246c = aVar3;
        this.f36247d = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((C4933a.C0687a.c) this.f36244a).get();
        S30.a applicationInfoDataSource = (S30.a) ((C4933a.C0687a.C0688a) this.f36245b).get();
        R30.a appCoroutineScopes = (R30.a) ((C4933a.C0687a.b) this.f36246c).get();
        WalletManager walletManager = (WalletManager) ((C4933a.C0687a.e) this.f36247d).get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(walletManager, "walletManager");
        return new c30.b(context, applicationInfoDataSource, appCoroutineScopes, walletManager);
    }
}
