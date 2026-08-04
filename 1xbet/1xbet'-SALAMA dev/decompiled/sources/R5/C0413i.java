package R5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: R5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0413i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I4.j f6174a;

    public C0413i(I4.j jVar, int i7) {
        switch (i7) {
            case 1:
                t6.h.e(jVar, "pigeonRegistrar");
                this.f6174a = jVar;
                break;
            case 2:
                t6.h.e(jVar, "pigeonRegistrar");
                this.f6174a = jVar;
                break;
            default:
                t6.h.e(jVar, "pigeonRegistrar");
                this.f6174a = jVar;
                break;
        }
    }

    public i0 a() {
        DisplayManager displayManager = (DisplayManager) ((Context) this.f6174a.f3681e).getSystemService("display");
        ArrayList arrayListC0 = p097n3.a.c0(displayManager);
        i0 i0Var = new i0(this);
        ArrayList arrayListC1 = p097n3.a.c0(displayManager);
        arrayListC1.removeAll(arrayListC0);
        if (!arrayListC1.isEmpty()) {
            Iterator it = arrayListC1.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) it.next());
                displayManager.registerDisplayListener(new C0418n(arrayListC1, displayManager, 0), null);
            }
        }
        return i0Var;
    }
}
