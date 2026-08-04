package G4;

import android.database.sqlite.SQLiteTransactionListener;

/* JADX INFO: loaded from: classes2.dex */
public final class O implements SQLiteTransactionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S f2924a;

    public O(S s7) {
        this.f2924a = s7;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
        this.f2924a.f2934h.g();
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
        this.f2924a.f2934h.f();
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
    }
}
