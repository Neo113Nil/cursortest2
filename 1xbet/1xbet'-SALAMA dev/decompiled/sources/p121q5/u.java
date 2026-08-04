package p121q5;

import A1.x0;
import A5.f;
import A5.s;
import A5.y;
import B3.g;
import android.util.Log;
import android.view.KeyEvent;
import com.google.android.gms.common.api.internal.C0800v;
import com.google.android.gms.common.internal.w;
import io.flutter.plugin.editing.InputConnectionAdaptor;
import java.util.HashSet;
import p028d6.k;
import p033e3.h;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements InputConnectionAdaptor.KeyboardDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s[] f15960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f15961b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f15962c;

    public u(t tVar) {
        this.f15962c = tVar;
        m mVar = (m) tVar;
        this.f15960a = new s[]{new r(mVar.getBinaryMessenger()), new w(new x0(mVar.getBinaryMessenger()))};
        f binaryMessenger = mVar.getBinaryMessenger();
        h hVar = new h();
        new s(binaryMessenger, "flutter/keyboard", y.f688b, null).b(new k(hVar));
        hVar.f12673a = this;
    }

    public final void a(KeyEvent keyEvent) {
        t tVar = this.f15962c;
        if (tVar == null || ((m) tVar).f15920B.handleKeyEvent(keyEvent)) {
            return;
        }
        HashSet hashSet = this.f15961b;
        hashSet.add(keyEvent);
        ((m) tVar).getRootView().dispatchKeyEvent(keyEvent);
        if (hashSet.remove(keyEvent)) {
            Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    @Override // io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate
    public final boolean handleEvent(KeyEvent keyEvent) {
        if (this.f15961b.remove(keyEvent)) {
            return false;
        }
        s[] sVarArr = this.f15960a;
        if (sVarArr.length <= 0) {
            a(keyEvent);
            return true;
        }
        C0800v c0800v = new C0800v();
        c0800v.f11197d = this;
        c0800v.f11194a = this.f15960a.length;
        c0800v.f11195b = false;
        c0800v.f11196c = keyEvent;
        for (s sVar : sVarArr) {
            sVar.f(keyEvent, new g(c0800v));
        }
        return true;
    }
}
