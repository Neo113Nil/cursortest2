package androidx.activity;

import android.util.Log;
import f4.v;
import g4.C0463h;
import java.util.ListIterator;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f4065f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(t tVar, int i2) {
        super(0);
        this.f4064e = i2;
        this.f4065f = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        R.i iVar;
        switch (this.f4064e) {
            case 0:
                this.f4065f.a();
                return v.f5689a;
            case 1:
                t tVar = this.f4065f;
                R.i iVar2 = tVar.f4076c;
                if (iVar2 == null) {
                    C0463h c0463h = tVar.f4075b;
                    ListIterator listIterator = c0463h.listIterator(c0463h.c());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            iVar = listIterator.previous();
                            if (((R.i) iVar).f2594a) {
                            }
                        } else {
                            iVar = 0;
                        }
                    }
                    iVar2 = iVar;
                }
                tVar.f4076c = null;
                if (iVar2 != null) {
                    boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                    R.m mVar = iVar2.f2595b;
                    if (isLoggable) {
                        Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + mVar);
                    }
                    R.a aVar = mVar.f2600d;
                    if (aVar != null) {
                        aVar.f2569c = false;
                        aVar.a(false);
                        mVar.i();
                        throw null;
                    }
                    mVar.f2600d = null;
                }
                return v.f5689a;
            default:
                this.f4065f.a();
                return v.f5689a;
        }
    }
}
