package androidx.compose.ui.platform;

import Sc.C4005g;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5262l0 implements InterfaceC5289u1, xe.M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f40906a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q1.M f40907b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xe.M f40908c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicReference f40909d = new AtomicReference(null);

    public C5262l0(@NotNull View view, @NotNull Q1.M m11, @NotNull xe.M m12) {
        this.f40906a = view;
        this.f40907b = m11;
        this.f40908c = m12;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.platform.InterfaceC5286t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Wc.a a(@NotNull InterfaceC5272o1 interfaceC5272o1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C5250h0 c5250h0;
        int i11;
        if (cVar instanceof C5250h0) {
            c5250h0 = (C5250h0) cVar;
            int i12 = c5250h0.f40881f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5250h0.f40881f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5250h0.f40879d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5250h0.f40881f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomicReference atomicReference = this.f40909d;
                    C5256j0 c5256j0 = new C5256j0(interfaceC5272o1, this);
                    C5259k0 c5259k0 = new C5259k0(this, null);
                    c5250h0.f40881f = 1;
                    if (e1.h.b(atomicReference, c5256j0, c5259k0, c5250h0) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                throw new C4005g();
            }
        }
        c5250h0 = new C5250h0(this, cVar);
        Object obj2 = c5250h0.f40879d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5250h0.f40881f;
        if (i11 != 0) {
        }
        throw new C4005g();
    }

    public final InputConnection d(@NotNull EditorInfo editorInfo) {
        C5230a1 c5230a1 = (C5230a1) e1.h.a(this.f40909d);
        if (c5230a1 != null) {
            return c5230a1.c(editorInfo);
        }
        return null;
    }

    public final boolean e() {
        C5230a1 c5230a1 = (C5230a1) e1.h.a(this.f40909d);
        return c5230a1 != null && c5230a1.e();
    }

    @Override // xe.M
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f40908c.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5286t1
    @NotNull
    public final View getView() {
        return this.f40906a;
    }
}
