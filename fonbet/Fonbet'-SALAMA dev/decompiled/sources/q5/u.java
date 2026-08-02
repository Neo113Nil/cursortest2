package q5;

import A1.x0;
import android.util.Log;
import android.view.KeyEvent;
import com.google.android.gms.common.api.internal.C0844v;
import d6.C0977k;
import e3.C1023h;
import io.flutter.plugin.editing.InputConnectionAdaptor;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class u implements InputConnectionAdaptor.KeyboardDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final s[] f15954a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f15955b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final t f15956c;

    public u(t tVar) {
        this.f15956c = tVar;
        m mVar = (m) tVar;
        this.f15954a = new s[]{new r(mVar.getBinaryMessenger()), new com.google.android.gms.common.internal.w(new x0(mVar.getBinaryMessenger()))};
        A5.f binaryMessenger = mVar.getBinaryMessenger();
        C1023h c1023h = new C1023h();
        new A5.s(binaryMessenger, "flutter/keyboard", A5.y.f688b, null).b(new C0977k(c1023h));
        c1023h.f12667a = this;
    }

    public final void a(KeyEvent keyEvent) {
        t tVar = this.f15956c;
        if (tVar == null || ((m) tVar).f15914B.handleKeyEvent(keyEvent)) {
            return;
        }
        HashSet hashSet = this.f15955b;
        hashSet.add(keyEvent);
        ((m) tVar).getRootView().dispatchKeyEvent(keyEvent);
        if (hashSet.remove(keyEvent)) {
            Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    @Override // io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate
    public final boolean handleEvent(KeyEvent keyEvent) {
        if (this.f15955b.remove(keyEvent)) {
            return false;
        }
        s[] sVarArr = this.f15954a;
        if (sVarArr.length <= 0) {
            a(keyEvent);
            return true;
        }
        C0844v c0844v = new C0844v();
        c0844v.f11197d = this;
        c0844v.f11194a = this.f15954a.length;
        c0844v.f11195b = false;
        c0844v.f11196c = keyEvent;
        for (s sVar : sVarArr) {
            sVar.f(keyEvent, new B3.g(c0844v));
        }
        return true;
    }
}
