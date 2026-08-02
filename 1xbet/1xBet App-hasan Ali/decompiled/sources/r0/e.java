package r0;

import android.view.KeyEvent;
import b0.o;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class e extends o implements InterfaceC2347d {

    /* renamed from: y, reason: collision with root package name */
    public i4.c f19091y;

    /* renamed from: z, reason: collision with root package name */
    public m f19092z;

    @Override // r0.InterfaceC2347d
    public final boolean O(KeyEvent keyEvent) {
        i4.c cVar = this.f19091y;
        if (cVar != null) {
            return ((Boolean) cVar.c(new C2345b(keyEvent))).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // r0.InterfaceC2347d
    public final boolean l(KeyEvent keyEvent) {
        ?? r02 = this.f19092z;
        if (r02 != 0) {
            return ((Boolean) r02.c(new C2345b(keyEvent))).booleanValue();
        }
        return false;
    }
}
